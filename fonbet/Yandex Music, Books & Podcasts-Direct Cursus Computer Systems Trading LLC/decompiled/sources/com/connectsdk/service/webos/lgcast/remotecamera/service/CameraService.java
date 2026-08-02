package com.connectsdk.service.webos.lgcast.remotecamera.service;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.connectsdk.R;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.DiscoveryManager;
import com.connectsdk.service.capability.RemoteCameraControl;
import com.connectsdk.service.webos.lgcast.common.connection.ConnectionManager;
import com.connectsdk.service.webos.lgcast.common.connection.ConnectionManagerError;
import com.connectsdk.service.webos.lgcast.common.connection.ConnectionManagerListener;
import com.connectsdk.service.webos.lgcast.common.connection.MobileDescription;
import com.connectsdk.service.webos.lgcast.common.streaming.RTPStreaming;
import com.connectsdk.service.webos.lgcast.common.transfer.RTPStreamerConfig;
import com.connectsdk.service.webos.lgcast.common.utils.AppUtil;
import com.connectsdk.service.webos.lgcast.common.utils.HandlerThreadEx;
import com.connectsdk.service.webos.lgcast.common.utils.IOUtil;
import com.connectsdk.service.webos.lgcast.common.utils.JSONObjectEx;
import com.connectsdk.service.webos.lgcast.common.utils.Logger;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.common.utils.ThreadUtil;
import com.connectsdk.service.webos.lgcast.common.utils.TimerUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.remotecamera.capability.CameraSinkCapability;
import com.connectsdk.service.webos.lgcast.remotecamera.capability.CameraSourceCapability;
import com.connectsdk.service.webos.lgcast.remotecamera.capture.CameraCapture;
import com.connectsdk.service.webos.lgcast.remotecamera.capture.MicCapture;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import defpackage.cy1;
import defpackage.he0;
import defpackage.n;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CameraService extends Service {
    private static final String AUDIO_PORT = "audioPort";
    private static final String CAMERA = "camera";
    public static final String ERROR_CAUSE = "errorCause";
    public static final String RESULT = "result";
    private static final String VIDEO_PORT = "videoPort";
    private CameraCapture mCameraCapture;
    private CameraProperty mCameraProperty;
    private CameraSinkCapability mCameraSinkCapability;
    private CameraSourceCapability mCameraSourceCapability;
    private ConnectionManager mConnectionManager;
    private AtomicBoolean mIsPlaying = new AtomicBoolean();
    private MicCapture mMicCapture;
    private RTPStreaming mRTPStreaming;
    private HandlerThreadEx mServiceHandler;

    /* renamed from: com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService$1, reason: invalid class name */
    public class AnonymousClass1 implements ConnectionManagerListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$0(ConnectionManagerError connectionManagerError) {
            CameraServiceIF.notifyError(CameraService.this.getBaseContext(), CameraServiceIF.toCameraError(connectionManagerError));
        }

        private void onChangeAudio(@NonNull JSONObject jSONObject) {
            boolean optBoolean = jSONObject.optBoolean(CameraProperty.AUDIO);
            boolean changeMicMute = CameraService.this.mMicCapture.changeMicMute(!optBoolean);
            CameraProperty cameraProperty = CameraService.this.mCameraProperty;
            if (!changeMicMute) {
                optBoolean = CameraService.this.mCameraProperty.audio;
            }
            cameraProperty.audio = optBoolean;
            sendSetParameterResponse(changeMicMute, jSONObject, RemoteCameraControl.RemoteCameraProperty.AUDIO);
        }

        private void onChangeAutoWhiteBalance(@NonNull JSONObject jSONObject) {
            boolean optBoolean = jSONObject.optBoolean(CameraProperty.AUTO_WHITE_BALANCE);
            boolean changeAutoWhiteBalance = CameraService.this.mCameraCapture.changeAutoWhiteBalance(optBoolean);
            CameraProperty cameraProperty = CameraService.this.mCameraProperty;
            if (!changeAutoWhiteBalance) {
                optBoolean = CameraService.this.mCameraProperty.autoWhiteBalance;
            }
            cameraProperty.autoWhiteBalance = optBoolean;
            sendSetParameterResponse(changeAutoWhiteBalance, jSONObject, RemoteCameraControl.RemoteCameraProperty.AUTO_WHITE_BALANCE);
        }

        private void onChangeBrightness(@NonNull JSONObject jSONObject) {
            int optInt = jSONObject.optInt(CameraProperty.BRIGHTNESS);
            boolean changeBrightness = CameraService.this.mCameraCapture.changeBrightness(optInt);
            CameraProperty cameraProperty = CameraService.this.mCameraProperty;
            if (!changeBrightness) {
                optInt = CameraService.this.mCameraProperty.brightness;
            }
            cameraProperty.brightness = optInt;
            sendSetParameterResponse(changeBrightness, jSONObject, RemoteCameraControl.RemoteCameraProperty.BRIGHTNESS);
        }

        private void onChangeFacing(@NonNull JSONObject jSONObject) {
            CameraService.this.mCameraProperty.facing = jSONObject.optInt(CameraProperty.FACING);
            sendSetParameterResponse(CameraService.this.mCameraCapture.restartPreview(CameraService.this.mCameraProperty), jSONObject, RemoteCameraControl.RemoteCameraProperty.LENS_FACING);
        }

        private void onChangeWhiteBalance(@NonNull JSONObject jSONObject) {
            int optInt = jSONObject.optInt(CameraProperty.WHITE_BALANCE);
            boolean changeWhiteBalance = CameraService.this.mCameraCapture.changeWhiteBalance(optInt);
            if (changeWhiteBalance) {
                CameraService.this.mCameraCapture.changeAutoWhiteBalance(false);
                CameraService.this.mCameraProperty.autoWhiteBalance = false;
                CameraService.this.mCameraProperty.whiteBalance = optInt;
            }
            sendSetParameterResponse(changeWhiteBalance, jSONObject, RemoteCameraControl.RemoteCameraProperty.WHITE_BALANCE);
        }

        private void sendSetParameterResponse(boolean z, @NonNull JSONObject jSONObject, @NonNull RemoteCameraControl.RemoteCameraProperty remoteCameraProperty) {
            JSONObjectEx jSONObjectEx = new JSONObjectEx(jSONObject);
            jSONObjectEx.put(CameraService.RESULT, z);
            if (z) {
                if (remoteCameraProperty == RemoteCameraControl.RemoteCameraProperty.WHITE_BALANCE) {
                    jSONObjectEx.put(CameraProperty.AUTO_WHITE_BALANCE, false);
                }
                CameraService.this.mConnectionManager.sendSetParameterResponse(jSONObjectEx);
                CameraServiceIF.notifyPropertyChange(CameraService.this.getBaseContext(), remoteCameraProperty);
                return;
            }
            Logger.error("Failed to change: " + remoteCameraProperty, new Object[0]);
            jSONObjectEx.put(CameraService.ERROR_CAUSE, "Failed to change: " + remoteCameraProperty);
            CameraService.this.mConnectionManager.sendSetParameterResponse(jSONObjectEx);
        }

        @Override // com.connectsdk.service.webos.lgcast.common.connection.ConnectionManagerListener
        public void onConnectionCompleted(@NonNull JSONObject jSONObject) {
            Logger.debug("onConnectionCompleted", new Object[0]);
            CameraService.this.mCameraSinkCapability = new CameraSinkCapability(jSONObject);
            CameraService.this.mCameraSinkCapability.debug();
            CameraService cameraService = CameraService.this;
            cameraService.mCameraSourceCapability = CameraSourceCapability.create(cameraService.getBaseContext(), CameraService.this.mCameraSinkCapability.publicKey);
            CameraService.this.mCameraSourceCapability.debug();
            MobileDescription mobileDescription = new MobileDescription(CameraService.this.getBaseContext());
            mobileDescription.debug();
            CameraService.this.mConnectionManager.setSourceDeviceCapability(CameraService.this.mCameraSourceCapability.toJSONObject(), mobileDescription.toJSONObject());
            CameraServiceIF.respondStart(CameraService.this.getBaseContext(), true);
        }

        @Override // com.connectsdk.service.webos.lgcast.common.connection.ConnectionManagerListener
        public void onConnectionFailed(String str) {
            Logger.debug("onConnectionFailed (%s)", str);
            CameraServiceIF.respondStart(CameraService.this.getBaseContext(), false);
            CameraService.this.stop();
        }

        @Override // com.connectsdk.service.webos.lgcast.common.connection.ConnectionManagerListener
        public void onError(@NonNull final ConnectionManagerError connectionManagerError, @NonNull String str) {
            Logger.error("onError: connectionError=%s, errorMessage=%s", connectionManagerError, str);
            TimerUtil.schedule(new TimerUtil.TimerListener() { // from class: com.connectsdk.service.webos.lgcast.remotecamera.service.a
                @Override // com.connectsdk.service.webos.lgcast.common.utils.TimerUtil.TimerListener
                public final void onTime() {
                    CameraService.AnonymousClass1.this.lambda$onError$0(connectionManagerError);
                }
            }, 100L);
            CameraService.this.stop();
        }

        @Override // com.connectsdk.service.webos.lgcast.common.connection.ConnectionManagerListener
        public void onPairingRejected() {
            Logger.debug("onPairingRejected", new Object[0]);
            CameraServiceIF.respondStart(CameraService.this.getBaseContext(), false);
            CameraService.this.stop();
        }

        @Override // com.connectsdk.service.webos.lgcast.common.connection.ConnectionManagerListener
        public void onPairingRequested() {
            Logger.debug("onPairingRequested", new Object[0]);
            CameraServiceIF.notifyPairing(CameraService.this.getBaseContext());
        }

        @Override // com.connectsdk.service.webos.lgcast.common.connection.ConnectionManagerListener
        public void onReceiveGetParameter(@NonNull JSONObject jSONObject) {
            Logger.debug("onReceiveGetParameter", new Object[0]);
            CameraService.this.mCameraProperty.rotation = AppUtil.getRotationDegree(CameraService.this.getBaseContext());
            CameraService.this.mConnectionManager.sendGetParameterResponse(CameraService.this.mCameraProperty.toJSONObject());
        }

        @Override // com.connectsdk.service.webos.lgcast.common.connection.ConnectionManagerListener
        public void onReceivePlayCommand(@NonNull JSONObject jSONObject) {
            Logger.debug("onReceivePlayCommand", new Object[0]);
            JSONObject optJSONObject = jSONObject.optJSONObject(CameraService.CAMERA);
            if (optJSONObject == null) {
                return;
            }
            int optInt = optJSONObject.optInt(CameraProperty.WIDTH, CameraService.this.mCameraProperty.width);
            int optInt2 = optJSONObject.optInt(CameraProperty.HEIGHT, CameraService.this.mCameraProperty.height);
            int optInt3 = optJSONObject.optInt(CameraProperty.FACING, CameraService.this.mCameraProperty.facing);
            Logger.debug("Before: width=%d, height=%d", Integer.valueOf(optInt), Integer.valueOf(optInt2));
            Iterator<Size> it = CameraService.this.mCameraSourceCapability.mSupportedPreviewSizes.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Size next = it.next();
                if (optInt == next.getWidth() && optInt2 == next.getHeight()) {
                    z = true;
                }
            }
            if (!z) {
                optInt = 1280;
            }
            if (!z) {
                optInt2 = 720;
            }
            Logger.debug("After: width=%d, height=%d", Integer.valueOf(optInt), Integer.valueOf(optInt2));
            if (optInt == CameraService.this.mCameraProperty.width && optInt2 == CameraService.this.mCameraProperty.height && optInt3 == CameraService.this.mCameraProperty.facing) {
                Logger.debug("No changes in current preview", new Object[0]);
            } else {
                CameraService.this.mCameraProperty.width = optInt;
                CameraService.this.mCameraProperty.height = optInt2;
                CameraService.this.mCameraProperty.facing = optInt3;
                Logger.debug("Restarting with width=%d, height=%d, facing=%d", Integer.valueOf(CameraService.this.mCameraProperty.width), Integer.valueOf(CameraService.this.mCameraProperty.height), Integer.valueOf(CameraService.this.mCameraProperty.facing));
                CameraService.this.mCameraCapture.restartPreview(CameraService.this.mCameraProperty);
                ThreadUtil.sleep(10L);
            }
            if (!optJSONObject.has(CameraService.VIDEO_PORT) || !optJSONObject.has(CameraService.AUDIO_PORT)) {
                CameraServiceIF.notifyError(CameraService.this.getBaseContext(), CameraServiceError.ERROR_GENERIC);
            } else {
                CameraService.this.startStreaming(optJSONObject.optInt(CameraService.VIDEO_PORT), optJSONObject.optInt(CameraService.AUDIO_PORT));
                CameraServiceIF.notifyPlaying(CameraService.this.getBaseContext());
            }
        }

        @Override // com.connectsdk.service.webos.lgcast.common.connection.ConnectionManagerListener
        public void onReceiveSetParameter(@NonNull JSONObject jSONObject) {
            Logger.debug("onReceiveSetParameter - " + jSONObject, new Object[0]);
            JSONObject optJSONObject = jSONObject.optJSONObject(CameraService.CAMERA);
            if (optJSONObject == null) {
                return;
            }
            if (optJSONObject.has(CameraProperty.BRIGHTNESS)) {
                onChangeBrightness(optJSONObject);
                return;
            }
            if (optJSONObject.has(CameraProperty.WHITE_BALANCE)) {
                onChangeWhiteBalance(optJSONObject);
                return;
            }
            if (optJSONObject.has(CameraProperty.AUTO_WHITE_BALANCE)) {
                onChangeAutoWhiteBalance(optJSONObject);
                return;
            }
            if (optJSONObject.has(CameraProperty.AUDIO)) {
                onChangeAudio(optJSONObject);
            } else if (optJSONObject.has(CameraProperty.FACING)) {
                onChangeFacing(optJSONObject);
            } else {
                sendSetParameterResponse(false, optJSONObject, RemoteCameraControl.RemoteCameraProperty.UNKNOWN);
            }
        }

        @Override // com.connectsdk.service.webos.lgcast.common.connection.ConnectionManagerListener
        public void onReceiveStopCommand(@NonNull JSONObject jSONObject) {
            Logger.debug("onReceiveStopCommand", new Object[0]);
            CameraService.this.stopStreaming();
        }
    }

    private void closeTvConnection() {
        Logger.print("closeTvConnection", new Object[0]);
        ConnectionManager connectionManager = this.mConnectionManager;
        if (connectionManager != null) {
            connectionManager.closeConnection();
        }
        this.mConnectionManager = null;
    }

    private void executeSetLensFacing(@NonNull Intent intent) {
        Logger.print("executeSetLensFacing", new Object[0]);
        try {
            if (this.mCameraCapture == null) {
                throw new Exception("Invalid camera status");
            }
            this.mCameraProperty.facing = intent.getIntExtra(CameraServiceIF.EXTRA_LENS_FACING, 0);
            this.mCameraCapture.restartPreview(this.mCameraProperty);
            this.mConnectionManager.updateSourceDeviceCapability(new JSONObjectEx().put(CameraProperty.FACING, this.mCameraProperty.facing).toJSONObject());
            CameraServiceIF.notifyPropertyChange(getBaseContext(), RemoteCameraControl.RemoteCameraProperty.LENS_FACING);
        } catch (Exception e) {
            Logger.error(e);
            CameraServiceIF.notifyError(this, CameraServiceError.ERROR_GENERIC);
            stop();
        }
    }

    private void executeSetMicMute(@NonNull Intent intent) {
        Logger.print("executeSetMicMute", new Object[0]);
        try {
            if (this.mMicCapture == null) {
                throw new Exception("Invalid mic status");
            }
            this.mCameraProperty.audio = !intent.getBooleanExtra(CameraServiceIF.EXTRA_MIC_MUTE, false);
            this.mMicCapture.changeMicMute(!this.mCameraProperty.audio);
            this.mConnectionManager.updateSourceDeviceCapability(new JSONObjectEx().put(CameraProperty.AUDIO, this.mCameraProperty.audio).toJSONObject());
            CameraServiceIF.notifyPropertyChange(getBaseContext(), RemoteCameraControl.RemoteCameraProperty.AUDIO);
        } catch (Exception e) {
            Logger.error(e);
            CameraServiceIF.notifyError(this, CameraServiceError.ERROR_GENERIC);
            stop();
        }
    }

    private void executeStart(@NonNull Intent intent) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        Logger.print("executeStart", new Object[0]);
        start(intent, anonymousClass1);
    }

    private void executeStop() {
        Logger.print("executeStop", new Object[0]);
        stop();
        CameraServiceIF.respondStop(this, true);
    }

    private void executeStopByNotification() {
        Logger.print("executeStopByNotification", new Object[0]);
        stop();
        CameraServiceIF.notifyError(this, CameraServiceError.ERROR_STOPPED_BY_NOTIFICATION);
    }

    private void initializeService(@NonNull Intent intent) {
        Logger.print("initializeService (SDK version=%s)", IOUtil.readRawResourceText(this, R.raw.lgcast_version));
        startForeground(RemoteCameraConfig.Notification.ID, CameraServiceFunc.createNotification(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$0(String str, Intent intent) {
        if (CameraServiceIF.ACTION_START_REQUEST.equals(str)) {
            executeStart(intent);
            return;
        }
        if (CameraServiceIF.ACTION_STOP_REQUEST.equals(str)) {
            executeStop();
            return;
        }
        if (CameraServiceIF.ACTION_STOP_BY_NOTIFICATION.equals(str)) {
            executeStopByNotification();
        } else if (CameraServiceIF.ACTION_SET_MIC_MUTE.equals(str)) {
            executeSetMicMute(intent);
        } else if (CameraServiceIF.ACTION_SET_LENS_FACING.equals(str)) {
            executeSetLensFacing(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCameraPreview$1(String str) {
        CameraServiceIF.notifyError(this, CameraServiceError.ERROR_GENERIC);
        stop();
    }

    private void openTvConnection(@NonNull Intent intent, ConnectionManagerListener connectionManagerListener) {
        Logger.print("openTvConnection", new Object[0]);
        ConnectableDevice deviceByIpAddress = DiscoveryManager.getInstance().getDeviceByIpAddress(CameraServiceFunc.getDeviceIpAddress(intent));
        ConnectionManager connectionManager = new ConnectionManager(CAMERA);
        this.mConnectionManager = connectionManager;
        connectionManager.openConnection(deviceByIpAddress, connectionManagerListener);
    }

    private void start(@NonNull Intent intent, ConnectionManagerListener connectionManagerListener) {
        Logger.print("stop", new Object[0]);
        try {
            int intExtra = intent.getIntExtra(CameraServiceIF.EXTRA_LENS_FACING, 0);
            boolean booleanExtra = intent.getBooleanExtra(CameraServiceIF.EXTRA_MIC_MUTE, false);
            CameraProperty cameraProperty = new CameraProperty();
            this.mCameraProperty = cameraProperty;
            cameraProperty.facing = intExtra;
            cameraProperty.audio = !booleanExtra;
            cameraProperty.debug();
            this.mIsPlaying.set(false);
            initializeService(intent);
            startCameraPreview(intent);
            startMicCapture(intent);
            openTvConnection(intent, connectionManagerListener);
        } catch (Exception e) {
            Logger.error(e);
            CameraServiceIF.respondStart(this, false);
        }
    }

    private void startCameraPreview(@NonNull Intent intent) throws Exception {
        Logger.print("startCameraPreview", new Object[0]);
        CameraCapture cameraCapture = new CameraCapture(this, (Surface) intent.getParcelableExtra(CameraServiceIF.EXTRA_PREVIEW_SURFACE), new n(6, this));
        this.mCameraCapture = cameraCapture;
        cameraCapture.start(this.mCameraProperty);
    }

    private void startMicCapture(@NonNull Intent intent) {
        Logger.print("startMicCapture", new Object[0]);
        MicCapture micCapture = new MicCapture();
        this.mMicCapture = micCapture;
        micCapture.startMicCapture(!this.mCameraProperty.audio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startStreaming(int i, int i2) {
        CameraService cameraService;
        Logger.print("startStreaming", new Object[0]);
        this.mIsPlaying.set(true);
        try {
            CameraProperty cameraProperty = this.mCameraProperty;
            RTPStreamerConfig.VideoConfig createRtpVideoConfig = CameraServiceFunc.createRtpVideoConfig(cameraProperty.width, cameraProperty.height);
            RTPStreamerConfig.AudioConfig createRtpAudioConfig = CameraServiceFunc.createRtpAudioConfig();
            RTPStreamerConfig.SecurityConfig createRtpSecurityConfig = CameraServiceFunc.createRtpSecurityConfig(this.mCameraSourceCapability.masterKeys);
            RTPStreaming rTPStreaming = new RTPStreaming();
            this.mRTPStreaming = rTPStreaming;
            rTPStreaming.setStreamingConfig(createRtpVideoConfig, createRtpAudioConfig, createRtpSecurityConfig);
            cameraService = this;
        } catch (Exception e) {
            e = e;
            cameraService = this;
        }
        try {
            this.mRTPStreaming.open(cameraService, 1356955624L, this.mCameraSinkCapability.ipAddress, i, i2);
            cameraService.mMicCapture.startStreaming(cameraService.mRTPStreaming.getAudioStreamHandler());
            cameraService.mCameraCapture.startStreaming(cameraService.mRTPStreaming.getVideoStreamHandler());
        } catch (Exception e2) {
            e = e2;
            Logger.error(e);
            cameraService.mIsPlaying.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stop() {
        Logger.print("stop", new Object[0]);
        stopStreaming();
        closeTvConnection();
        stopMicCapture();
        stopCameraPreview();
        terminateService();
    }

    private void stopCameraPreview() {
        Logger.print("stopCameraPreview", new Object[0]);
        CameraCapture cameraCapture = this.mCameraCapture;
        if (cameraCapture != null) {
            cameraCapture.stop();
        }
        this.mCameraCapture = null;
    }

    private void stopMicCapture() {
        Logger.print("stopMicCapture", new Object[0]);
        MicCapture micCapture = this.mMicCapture;
        if (micCapture != null) {
            micCapture.stopMicCapture();
        }
        this.mMicCapture = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopStreaming() {
        Logger.print("stopStreaming", new Object[0]);
        this.mIsPlaying.set(false);
        CameraCapture cameraCapture = this.mCameraCapture;
        if (cameraCapture != null) {
            cameraCapture.stopStreaming();
        }
        MicCapture micCapture = this.mMicCapture;
        if (micCapture != null) {
            micCapture.stopStreaming();
        }
        RTPStreaming rTPStreaming = this.mRTPStreaming;
        if (rTPStreaming != null) {
            rTPStreaming.close();
        }
        this.mRTPStreaming = null;
    }

    private void terminateService() {
        Logger.print("terminateService", new Object[0]);
        stopForeground(true);
        ThreadUtil.runOnMainLooper(new he0(13, this), 150L);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CameraProperty cameraProperty = this.mCameraProperty;
        if (cameraProperty == null || this.mConnectionManager == null) {
            return;
        }
        cameraProperty.rotation = AppUtil.getRotationDegree(getBaseContext());
        this.mConnectionManager.updateSourceDeviceCapability(new JSONObjectEx().put(CameraProperty.ROTATION, this.mCameraProperty.rotation).toJSONObject());
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Logger.showDebug(false);
        HandlerThreadEx handlerThreadEx = new HandlerThreadEx("CameraService Handler");
        this.mServiceHandler = handlerThreadEx;
        handlerThreadEx.start();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mServiceHandler.quit();
        this.mServiceHandler = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Logger.print("onStartCommand: " + StringUtil.toString(intent), new Object[0]);
        this.mServiceHandler.post(new cy1(2, this, intent != null ? intent.getAction() : null, intent));
        return 1;
    }
}
