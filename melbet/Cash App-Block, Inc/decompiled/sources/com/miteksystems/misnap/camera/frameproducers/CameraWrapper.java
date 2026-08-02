package com.miteksystems.misnap.camera.frameproducers;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.adapter.CameraControlAdapter;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.compat.Camera2CameraControlCompatImpl;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.AdapterCameraControl;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy;
import androidx.camera.video.AutoValue_Quality_ConstantQuality;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda16;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.camera.view.PreviewView;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.room.RoomDatabase;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.maps.android.compose.DefaultIndoorStateChangeListener;
import com.google.maps.android.compose.MapClickListeners;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.miteksystems.misnap.camera.a.n;
import com.miteksystems.misnap.camera.a.p;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.camera.internal.CameraUtilNativeWrapper;
import com.miteksystems.misnap.camera.requirements.CameraSelectorFilter;
import com.miteksystems.misnap.core.LiveDataUtil;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.core.internal.ContextHelper;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.cash.api.ContextKt;
import com.squareup.util.Strings;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import com.withpersona.sdk2.camera.camera2.Camera2Manager$start$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.random.Random;
import kotlinx.coroutines.CompletableDeferredImpl;
import net.idrnd.face.iad.capture.internal.s;
import net.oneformapp.schema.Schema;
import org.brotli.dec.HuffmanTreeGroup;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes4.dex */
public final class CameraWrapper implements FrameProducer {
    public String A;
    public /* synthetic */ Preview B;
    public /* synthetic */ ImageAnalysis C;
    public /* synthetic */ ImageCapture D;
    public /* synthetic */ VideoCapture E;
    public /* synthetic */ Schema F;
    public /* synthetic */ Recording G;
    public p H;
    public Camera2CameraInfo I;
    public Camera2CameraControl J;
    public final MutableLiveData K;
    public final MutableLiveData L;
    public final MutableLiveData M;
    public final /* synthetic */ MutableLiveData N;
    public final MutableLiveData O;
    public final MutableLiveData P;
    public final g Q;
    public final d R;
    public final MaterialButton$$ExternalSyntheticLambda3 S;
    public final MiSnapSettings.Camera a;
    public final CameraUtilNativeWrapper c;
    public final Executor d;
    public final WeakReference e;
    public final WeakReference f;
    public final CameraManager g;
    public CameraSelectorFilter h;
    public com.miteksystems.misnap.camera.a.e i;
    public final /* synthetic */ LinkedHashMap j;
    public /* synthetic */ int k;
    public final int l;
    public /* synthetic */ boolean m;
    public /* synthetic */ boolean n;
    public final /* synthetic */ Handler o;
    public final boolean p;
    public final /* synthetic */ CameraWrapper$$ExternalSyntheticLambda1 q;
    public MibiData.Session r;
    public final PreviewView.DisplayRotationListener s;
    public final Handler t;
    public final CameraWrapper$$ExternalSyntheticLambda1 u;
    public Integer v;
    public ProcessCameraProvider w;
    public CameraSelector x;
    public LifecycleCamera y;
    public CameraControlInternal z;

    public abstract /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MiSnapSettings.Camera.VideoRecord.VideoQuality.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public final class d extends CameraCaptureSession.CaptureCallback {
        public d() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            cameraCaptureSession.getClass();
            captureRequest.getClass();
            totalCaptureResult.getClass();
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num != null) {
                int intValue = num.intValue();
                CameraWrapper cameraWrapper = CameraWrapper.this;
                Handler handler = cameraWrapper.o;
                CameraWrapper$$ExternalSyntheticLambda1 cameraWrapper$$ExternalSyntheticLambda1 = cameraWrapper.q;
                if (cameraWrapper.n) {
                    boolean z = true;
                    if (intValue != 1 && intValue != 3) {
                        z = false;
                    }
                    if (cameraWrapper.m != z) {
                        cameraWrapper.m = z;
                        handler.removeCallbacks(cameraWrapper$$ExternalSyntheticLambda1);
                        if (z) {
                            handler.postDelayed(cameraWrapper$$ExternalSyntheticLambda1, 2000L);
                        }
                    }
                }
            }
        }
    }

    public final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            FrameProducer.Event event;
            VideoRecordEvent videoRecordEvent = (VideoRecordEvent) obj;
            CameraWrapper cameraWrapper = CameraWrapper.this;
            MutableLiveData mutableLiveData = cameraWrapper.P;
            videoRecordEvent.getClass();
            if (videoRecordEvent instanceof VideoRecordEvent.Start) {
                cameraWrapper.r.addUxpEvent("CWVRS", new String[0]);
            } else if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                int i = ((VideoRecordEvent.Finalize) videoRecordEvent).mError;
                if (i != 0) {
                    if (i != 8) {
                        if (i != 2 && i != 3) {
                            event = i != 4 ? FrameProducer.Event.VideoRecordingError.Execution.INSTANCE : FrameProducer.Event.VideoRecordingError.InvalidCamera.INSTANCE;
                            cameraWrapper.a(event);
                        }
                    }
                    event = FrameProducer.Event.VideoRecordingError.InvalidVideoData.INSTANCE;
                    cameraWrapper.a(event);
                }
                if (i == 3 || i == 2) {
                    cameraWrapper.a(FrameProducer.Event.VideoRecordingError.InsufficientStorage.INSTANCE);
                }
                try {
                    Object obj2 = cameraWrapper.e.get();
                    obj2.getClass();
                    byte[] readBytes = FilesKt__FileReadWriteKt.readBytes(new File(new File(((Context) obj2).getExternalCacheDir(), ".temp.mp4").getPath()));
                    mutableLiveData.getClass();
                    if (Looper.getMainLooper().isCurrentThread()) {
                        mutableLiveData.setValue(readBytes);
                    } else {
                        mutableLiveData.postValue(readBytes);
                    }
                    cameraWrapper.r.addUxpEvent("SCWVR", new String[0]);
                } catch (Exception e) {
                    Log.e("CameraWrapper", "Could not read the video file", e);
                    byte[] bArr = new byte[0];
                    if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                        mutableLiveData.setValue(bArr);
                    } else {
                        mutableLiveData.postValue(bArr);
                    }
                    cameraWrapper.r.addUxpEvent("CWVRF", new String[0]);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final class f extends Lambda implements Function1 {
        public static final f a = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        }
    }

    public final class g extends ContextKt {
        public g() {
        }

        @Override // com.squareup.cash.api.ContextKt
        public final void onError(ImageCaptureException imageCaptureException) {
            int i = imageCaptureException.mImageCaptureError;
            CameraWrapper.this.a(i != 2 ? i != 3 ? i != 4 ? FrameProducer.Event.TakePhotoError.Execution.INSTANCE : FrameProducer.Event.TakePhotoError.InvalidCamera.INSTANCE : FrameProducer.Event.TakePhotoError.CameraClosed.INSTANCE : FrameProducer.Event.TakePhotoError.PictureFailed.INSTANCE);
        }
    }

    public final /* synthetic */ class i extends MutablePropertyReference0Impl {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ i(int i, int i2, Class cls, Object obj, String str, String str2) {
            super(obj, cls, str, str2, i);
            this.$r8$classId = i2;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
        public final Object get() {
            switch (this.$r8$classId) {
                case 0:
                    return ((CameraWrapper) this.receiver).v;
                case 1:
                    return ((MutableState) this.receiver).getValue();
                case 2:
                    return (Function1) ((MapClickListeners) this.receiver).onMyLocationClick$delegate.getValue();
                case 3:
                    return (Function1) ((MapClickListeners) this.receiver).onPOIClick$delegate.getValue();
                case 4:
                    return (DefaultIndoorStateChangeListener) ((MapClickListeners) this.receiver).indoorStateChangeListener$delegate.getValue();
                case 5:
                    return (Function1) ((MapClickListeners) this.receiver).onMapClick$delegate.getValue();
                case 6:
                    return (Function1) ((MapClickListeners) this.receiver).onMapLongClick$delegate.getValue();
                case 7:
                    return (Function0) ((MapClickListeners) this.receiver).onMapLoaded$delegate.getValue();
                default:
                    return (Function0) ((MapClickListeners) this.receiver).onMyLocationButtonClick$delegate.getValue();
            }
        }

        public void set(Object obj) {
            ((CameraWrapper) this.receiver).setCustomFocusMode((Integer) obj);
        }
    }

    public final class k extends Lambda implements Function1 {
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z) {
            super(1);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            SurfaceHolder surfaceHolder = (SurfaceHolder) obj;
            surfaceHolder.getClass();
            CameraWrapper cameraWrapper = CameraWrapper.this;
            Executor executor = cameraWrapper.d;
            executor.getClass();
            n nVar = new n(executor);
            nVar.c = surfaceHolder;
            cameraWrapper.a(nVar, this.b);
            return Unit.INSTANCE;
        }
    }

    public final class l extends CameraManager.AvailabilityCallback {
        public final /* synthetic */ String a;
        public final /* synthetic */ Handler b;
        public final /* synthetic */ CameraWrapper c;
        public final /* synthetic */ Rum$createMonitor$1 d;

        public l(String str, Handler handler, CameraWrapper cameraWrapper, Rum$createMonitor$1 rum$createMonitor$1) {
            this.a = str;
            this.b = handler;
            this.c = cameraWrapper;
            this.d = rum$createMonitor$1;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            str.getClass();
            super.onCameraAvailable(str);
            if (Intrinsics.areEqual(this.a, str)) {
                this.b.removeCallbacksAndMessages(null);
                this.c.g.unregisterAvailabilityCallback(this);
                this.d.invoke();
            }
        }
    }

    public CameraWrapper(Context context, LifecycleOwner lifecycleOwner, MiSnapSettings.Camera camera) {
        boolean z;
        context.getClass();
        lifecycleOwner.getClass();
        camera.getClass();
        CameraUtilNativeWrapper cameraUtilNativeWrapper = new CameraUtilNativeWrapper();
        this.a = camera;
        this.c = cameraUtilNativeWrapper;
        Executor mainExecutor = context.getMainExecutor();
        mainExecutor.getClass();
        this.d = mainExecutor;
        this.e = new WeakReference(context);
        this.f = new WeakReference(lifecycleOwner);
        Object systemService = context.getSystemService((Class<Object>) CameraManager.class);
        systemService.getClass();
        this.g = (CameraManager) systemService;
        this.j = new LinkedHashMap();
        Random.Default.getClass();
        this.l = Random.defaultRandom.nextInt(RoomDatabase.MAX_BIND_PARAMETER_CNT, 9999);
        int i2 = 1;
        this.n = true;
        this.o = new Handler(Looper.getMainLooper());
        int i3 = 0;
        try {
            System.loadLibrary("misnapCameraUtil");
            z = true;
        } catch (UnsatisfiedLinkError e2) {
            Log.e("CameraUtilLib", "Unable to load library", e2);
            z = false;
        }
        this.p = z;
        this.q = new CameraWrapper$$ExternalSyntheticLambda1(this, i3);
        this.r = MibiData.bindSession();
        this.s = new PreviewView.DisplayRotationListener(this, 2);
        this.t = new Handler(Looper.getMainLooper());
        this.u = new CameraWrapper$$ExternalSyntheticLambda1(this, i2);
        this.K = new MutableLiveData();
        this.L = new MutableLiveData();
        this.M = new MutableLiveData();
        this.N = new MutableLiveData();
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Boolean.FALSE);
        this.O = mutableLiveData;
        this.P = new MutableLiveData();
        this.Q = new g();
        this.R = new d();
        this.S = new MaterialButton$$ExternalSyntheticLambda3(this, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (r12 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01fb, code lost:
    
        if (r6 == null) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Preview.SurfaceProvider surfaceProvider, boolean z) {
        Unit unit;
        Size size;
        int i2;
        int height;
        String str;
        Size size2;
        MiSnapSettings.Camera.VideoRecord.VideoQuality videoQuality;
        Result.Failure failure;
        Context context = (Context) this.e.get();
        if (context != null) {
            com.miteksystems.misnap.camera.a.e eVar = this.i;
            if (eVar != null) {
                int i3 = eVar.d;
                surfaceProvider.getClass();
                Preview.Builder builder = new Preview.Builder(0);
                AutoValue_Config_Option autoValue_Config_Option = TargetConfig.OPTION_TARGET_NAME;
                MutableOptionsBundle mutableOptionsBundle = builder.mMutableConfig;
                mutableOptionsBundle.insertOption(autoValue_Config_Option, "MIPU");
                Size a = a(eVar.a, context);
                AutoValue_Config_Option autoValue_Config_Option2 = ImageOutputConfig.OPTION_TARGET_RESOLUTION;
                mutableOptionsBundle.insertOption(autoValue_Config_Option2, a);
                builder.setTargetRotation$2(i3);
                Preview m102build = builder.m102build();
                m102build.setSurfaceProvider(surfaceProvider);
                this.B = m102build;
                MiSnapSettings.Camera camera = this.a;
                camera.getClass();
                MiSnapSettings.Camera.VideoRecord videoRecord = camera.videoRecord;
                Boolean bool = camera.c;
                if ((bool != null ? bool.booleanValue() : false) && !z) {
                    this.r.addUxpEvent("IAHRR", new String[0]);
                    size = eVar.f;
                }
                size = eVar.b;
                Preview.Builder builder2 = new Preview.Builder(1);
                MutableOptionsBundle mutableOptionsBundle2 = builder2.mMutableConfig;
                mutableOptionsBundle2.insertOption(autoValue_Config_Option, "MIAU");
                mutableOptionsBundle2.insertOption(autoValue_Config_Option2, a(size, context));
                AutoValue_Config_Option autoValue_Config_Option3 = ImageOutputConfig.OPTION_TARGET_ROTATION;
                mutableOptionsBundle2.insertOption(autoValue_Config_Option3, Integer.valueOf(i3));
                mutableOptionsBundle2.insertOption(ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, Boolean.valueOf(eVar.e));
                builder2.setBackpressureStrategy();
                d dVar = this.R;
                dVar.getClass();
                mutableOptionsBundle2.insertOption(Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION, dVar);
                ImageAnalysis build = builder2.build();
                build.setAnalyzer(this.d, this.S);
                this.C = build;
                ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(m102build, build);
                if (s.shouldRecordSession(videoRecord)) {
                    ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda1 = Recorder.DEFAULT_ENCODER_FACTORY;
                    ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda12 = Recorder.DEFAULT_MUXER_FACTORY;
                    ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda13 = Recorder.OUTPUT_STORAGE_FACTORY_DEFAULT;
                    HuffmanTreeGroup builder3 = Recorder.MEDIA_SPEC_DEFAULT.toBuilder();
                    videoRecord.getClass();
                    if (videoRecord.c == null && videoRecord.d != null) {
                        Size videoResolution = s.getVideoResolution(videoRecord);
                        videoQuality = videoResolution.getHeight() * videoResolution.getWidth() != 921600 ? MiSnapSettings.Camera.VideoRecord.VideoQuality.FHD : MiSnapSettings.Camera.VideoRecord.VideoQuality.HD;
                    } else {
                        videoQuality = s.getVideoQuality(videoRecord);
                    }
                    QualitySelector a2 = a(videoQuality);
                    VideoSpec videoSpec = (VideoSpec) builder3.trees;
                    videoSpec.getClass();
                    VideoSpec videoSpec2 = VideoSpec.DEFAULT;
                    videoSpec.qualitySelector.getClass();
                    int i4 = videoSpec.bitrate;
                    int i5 = videoSpec.aspectRatio;
                    String str2 = videoSpec.mimeType;
                    str2.getClass();
                    builder3.trees = new VideoSpec(a2, i4, i5, str2);
                    int videoBitrate = s.getVideoBitrate(videoRecord);
                    if (videoBitrate <= 0) {
                        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(videoBitrate, "The requested target bitrate ", " is not supported. Target bitrate must be greater than 0."));
                        return;
                    }
                    VideoSpec videoSpec3 = (VideoSpec) builder3.trees;
                    videoSpec3.getClass();
                    QualitySelector qualitySelector = videoSpec3.qualitySelector;
                    qualitySelector.getClass();
                    int i6 = videoSpec3.aspectRatio;
                    String str3 = videoSpec3.mimeType;
                    str3.getClass();
                    builder3.trees = new VideoSpec(qualitySelector, videoBitrate, i6, str3);
                    Preview.Builder builder4 = new Preview.Builder(new Recorder(null, new MediaSpec((VideoSpec) builder3.trees, (AudioSpec) builder3.codes, builder3.alphabetSize), zslControlImpl$$ExternalSyntheticLambda1, zslControlImpl$$ExternalSyntheticLambda1, zslControlImpl$$ExternalSyntheticLambda12, zslControlImpl$$ExternalSyntheticLambda13));
                    Integer valueOf = Integer.valueOf(i3);
                    MutableOptionsBundle mutableOptionsBundle3 = builder4.mMutableConfig;
                    mutableOptionsBundle3.insertOption(autoValue_Config_Option3, valueOf);
                    VideoCapture videoCapture = new VideoCapture(new VideoCaptureConfig(OptionsBundle.from(mutableOptionsBundle3)));
                    this.F = new Schema(context, (Recorder) videoCapture.getOutput(), new PreviewView.AnonymousClass1(new File(context.getExternalCacheDir(), ".temp.mp4")).build());
                    Boolean bool2 = videoRecord.b;
                    if (bool2 == null) {
                        bool2 = s.m4276default(MiSnapSettings.Camera.VideoRecord.Companion).b;
                        bool2.getClass();
                    }
                    if (bool2.booleanValue()) {
                        if (Strings.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0) {
                            try {
                                Result.Companion companion = Result.Companion;
                                Schema schema = this.F;
                                if (schema != 0) {
                                    schema.withAudioEnabled();
                                    failure = schema;
                                } else {
                                    failure = null;
                                }
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.Companion;
                                failure = new Result.Failure(th);
                            }
                            if (Result.m4120exceptionOrNullimpl(failure) != null) {
                                this.r.addUxpEvent("CWVRA", new String[0]);
                            }
                        } else {
                            a(FrameProducer.Event.VideoRecordingError.AudioRecordPermission.INSTANCE);
                        }
                    }
                    this.E = videoCapture;
                    mutableListOf.add(videoCapture);
                }
                if (z) {
                    if (bool != null ? bool.booleanValue() : false) {
                        this.r.addUxpEvent("ICHRR", new String[0]);
                        size2 = eVar.g;
                    }
                    size2 = eVar.c;
                    Preview.Builder builder5 = new Preview.Builder(2);
                    AutoValue_Config_Option autoValue_Config_Option4 = TargetConfig.OPTION_TARGET_NAME;
                    MutableOptionsBundle mutableOptionsBundle4 = builder5.mMutableConfig;
                    mutableOptionsBundle4.insertOption(autoValue_Config_Option4, "MICU");
                    mutableOptionsBundle4.insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, a(size2, context));
                    mutableOptionsBundle4.insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i3));
                    mutableOptionsBundle4.insertOption(ImageCaptureConfig.OPTION_FLASH_MODE, 2);
                    i2 = 0;
                    mutableOptionsBundle4.insertOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE, 0);
                    ImageCapture m101build = builder5.m101build();
                    this.D = m101build;
                    mutableListOf.add(m101build);
                } else {
                    i2 = 0;
                }
                UseCase[] useCaseArr = (UseCase[]) mutableListOf.toArray(new UseCase[i2]);
                UseCase[] useCaseArr2 = (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length);
                Object obj = ContextHelper.a;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f.get();
                ProcessCameraProvider processCameraProvider = this.w;
                if (processCameraProvider == null || this.x == null || lifecycleOwner == null) {
                    a(FrameProducer.Event.InitializationError.PreviewInitialization.INSTANCE);
                } else {
                    try {
                        processCameraProvider.unbindAll();
                        ProcessCameraProvider processCameraProvider2 = this.w;
                        processCameraProvider2.getClass();
                        CameraSelector cameraSelector = this.x;
                        cameraSelector.getClass();
                        processCameraProvider2.bindToLifecycle(lifecycleOwner, cameraSelector, (UseCase[]) Arrays.copyOf(useCaseArr2, useCaseArr2.length));
                        this.r.addUxpEvent("SCWIN", new String[0]);
                        MutableLiveData mutableLiveData = this.K;
                        FrameProducer.Event.CameraReady cameraReady = FrameProducer.Event.CameraReady.INSTANCE;
                        mutableLiveData.getClass();
                        if (Looper.getMainLooper().isCurrentThread()) {
                            mutableLiveData.setValue(cameraReady);
                        } else {
                            mutableLiveData.postValue(cameraReady);
                        }
                        for (UseCase useCase : useCaseArr2) {
                            String name = !CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"MIAU", "MICU", "MIPU"}).contains(useCase.getName()) ? "MVCU" : useCase.getName();
                            MibiData.Session session = this.r;
                            StringBuilder sb = new StringBuilder();
                            sb.append(name);
                            sb.append(' ');
                            Size attachedSurfaceResolution = useCase.getAttachedSurfaceResolution();
                            sb.append(attachedSurfaceResolution != null ? Integer.valueOf(attachedSurfaceResolution.getWidth()) : null);
                            sb.append('x');
                            Size attachedSurfaceResolution2 = useCase.getAttachedSurfaceResolution();
                            sb.append(attachedSurfaceResolution2 != null ? Integer.valueOf(attachedSurfaceResolution2.getHeight()) : null);
                            session.addUxpEvent("CUFRA", sb.toString());
                            String name2 = useCase.getName();
                            int hashCode = name2.hashCode();
                            if (hashCode != 2366160) {
                                if (hashCode != 2366222) {
                                    if (hashCode == 2366625 && name2.equals("MIPU")) {
                                        Size attachedSurfaceResolution3 = useCase.getAttachedSurfaceResolution();
                                        if (attachedSurfaceResolution3 != null) {
                                            int width = attachedSurfaceResolution3.getWidth();
                                            Object obj2 = ContextHelper.a;
                                            ContextHelper.add(Integer.valueOf(width), "3");
                                        }
                                        Size attachedSurfaceResolution4 = useCase.getAttachedSurfaceResolution();
                                        if (attachedSurfaceResolution4 != null) {
                                            height = attachedSurfaceResolution4.getHeight();
                                            Object obj3 = ContextHelper.a;
                                            str = "4";
                                            ContextHelper.add(Integer.valueOf(height), str);
                                        }
                                    }
                                } else if (name2.equals("MICU")) {
                                    Size attachedSurfaceResolution5 = useCase.getAttachedSurfaceResolution();
                                    if (attachedSurfaceResolution5 != null) {
                                        int width2 = attachedSurfaceResolution5.getWidth();
                                        Object obj4 = ContextHelper.a;
                                        ContextHelper.add(Integer.valueOf(width2), "7");
                                    }
                                    Size attachedSurfaceResolution6 = useCase.getAttachedSurfaceResolution();
                                    if (attachedSurfaceResolution6 != null) {
                                        height = attachedSurfaceResolution6.getHeight();
                                        Object obj5 = ContextHelper.a;
                                        str = "8";
                                        ContextHelper.add(Integer.valueOf(height), str);
                                    }
                                }
                            } else if (name2.equals("MIAU")) {
                                Size attachedSurfaceResolution7 = useCase.getAttachedSurfaceResolution();
                                if (attachedSurfaceResolution7 != null) {
                                    int width3 = attachedSurfaceResolution7.getWidth();
                                    Object obj6 = ContextHelper.a;
                                    ContextHelper.add(Integer.valueOf(width3), "5");
                                }
                                Size attachedSurfaceResolution8 = useCase.getAttachedSurfaceResolution();
                                if (attachedSurfaceResolution8 != null) {
                                    height = attachedSurfaceResolution8.getHeight();
                                    Object obj7 = ContextHelper.a;
                                    str = "6";
                                    ContextHelper.add(Integer.valueOf(height), str);
                                }
                            }
                        }
                        String str4 = this.A;
                        if (str4 != null) {
                            ContextHelper.add(str4, "2");
                        }
                    } catch (Exception e2) {
                        a(FrameProducer.Event.InitializationError.PreviewInitialization.INSTANCE);
                        Log.e("CameraWrapper", "Error binding use cases", e2);
                    }
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        a(FrameProducer.Event.InitializationError.PreviewInitialization.INSTANCE);
    }

    public final ListenableFuture b(int i2) {
        Camera2CameraControl camera2CameraControl = this.J;
        if (camera2CameraControl == null) {
            return null;
        }
        MutableOptionsBundle create = MutableOptionsBundle.create();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer valueOf = Integer.valueOf(i2);
        key.getClass();
        create.insertOption(OverdraftStatus.State_.createCaptureRequestOption(key), valueOf);
        BiometricPrompt biometricPrompt = new BiometricPrompt(OptionsBundle.from(create));
        Camera2CameraControlCompatImpl camera2CameraControlCompatImpl = camera2CameraControl.compat;
        synchronized (camera2CameraControlCompatImpl.lock) {
            camera2CameraControlCompatImpl.configBuilder = new Toolbar.AnonymousClass1(5);
        }
        camera2CameraControlCompatImpl.addRequestOption(biometricPrompt);
        CompletableDeferredImpl applyAsync = camera2CameraControl.compat.applyAsync(camera2CameraControl._useCaseCameraRequestControl, true);
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            applyAsync.invokeOnCompletion(new ClickableKt$$ExternalSyntheticLambda0(3, callbackToFutureAdapter$Completer, applyAsync));
            callbackToFutureAdapter$Completer.tag = "setCaptureRequestOptions";
        } catch (Exception e2) {
            callbackToFutureAdapter$SafeFuture.setException(e2);
        }
        return Futures.nonCancellationPropagating(callbackToFutureAdapter$SafeFuture);
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final MutableLiveData getFocusingEvents() {
        return this.N;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final MutableLiveData getFrameProducerEvents() {
        return this.K;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final MutableLiveData getPictureFrames() {
        return this.M;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final MutableLiveData getPreviewFrames() {
        return this.L;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final MutableLiveData getTorchEvents() {
        return this.O;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final MutableLiveData getVideoRecordings() {
        return this.P;
    }

    public final boolean isInitialized() {
        return (this.w == null || this.y == null || this.x == null || this.i == null) ? false : true;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void openCameraInstance(CameraSelectorFilter cameraSelectorFilter) {
        if (isInitialized()) {
            release();
        }
        ViewRegistryKt$buildView$1$2$1$1 viewRegistryKt$buildView$1$2$1$1 = new ViewRegistryKt$buildView$1$2$1$1(13, this, cameraSelectorFilter);
        CameraManager cameraManager = this.g;
        String[] cameraIdList = cameraManager.getCameraIdList();
        cameraIdList.getClass();
        if (cameraIdList.length == 0) {
            viewRegistryKt$buildView$1$2$1$1.invoke();
            return;
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int length = cameraIdList.length;
        int i2 = 0;
        while (i2 < length) {
            String str = cameraIdList[i2];
            str.getClass();
            Rum$createMonitor$1 rum$createMonitor$1 = new Rum$createMonitor$1(6, atomicInteger, cameraIdList, viewRegistryKt$buildView$1$2$1$1);
            Handler handler = new Handler(Looper.getMainLooper());
            l lVar = new l(str, handler, this, rum$createMonitor$1);
            CameraWrapper cameraWrapper = this;
            AndroidPopup_androidKt$Popup$3$1 androidPopup_androidKt$Popup$3$1 = new AndroidPopup_androidKt$Popup$3$1(str, cameraWrapper, lVar, rum$createMonitor$1, 6);
            try {
                cameraManager.registerAvailabilityCallback(lVar, handler);
                handler.postDelayed(new KnotView$$ExternalSyntheticLambda1(androidPopup_androidKt$Popup$3$1, 18), 2000L);
            } catch (Exception e2) {
                Log.e("CameraWrapper", "Could not wait for camera to close: ".concat(str), e2);
                cameraManager.unregisterAvailabilityCallback(lVar);
                rum$createMonitor$1.invoke();
            }
            i2++;
            this = cameraWrapper;
        }
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void release() {
        ProcessCameraProvider processCameraProvider;
        stopVideoRecording();
        if (isInitialized() && (processCameraProvider = this.w) != null) {
            processCameraProvider.unbindAll();
        }
        WeakReference weakReference = this.e;
        Context context = (Context) weakReference.get();
        if (context != null) {
            try {
                new File(new File(context.getExternalCacheDir(), ".temp.mp4").getPath()).delete();
            } catch (Exception e2) {
                Log.w("CameraWrapper", "Could not delete the video file", e2);
            }
        }
        Context context2 = (Context) weakReference.get();
        Object systemService = context2 != null ? context2.getSystemService("display") : null;
        systemService.getClass();
        ((DisplayManager) systemService).unregisterDisplayListener(this.s);
        this.t.removeCallbacksAndMessages(this.u);
        this.o.removeCallbacksAndMessages(this.q);
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.G = null;
        this.F = null;
        p pVar = this.H;
        if (pVar != null) {
            pVar.b = false;
        }
        this.H = null;
        this.D = null;
        this.C = null;
        this.E = null;
        this.B = null;
        this.J = null;
        this.I = null;
        this.i = null;
        this.h = null;
        setCustomFocusMode(null);
        this.m = false;
        this.n = true;
        LiveDataUtil.updateValue(this.K, null);
        Boolean bool = Boolean.FALSE;
        LiveDataUtil.updateValue(this.N, bool);
        LiveDataUtil.updateValue(this.M, null);
        LiveDataUtil.updateValue(this.L, null);
        LiveDataUtil.updateValue(this.O, bool);
        LiveDataUtil.updateValue(this.P, null);
        this.j.clear();
        this.k = 0;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void requestAutoFocus(MeteringPoint meteringPoint) {
        boolean isInitialized = isInitialized();
        MutableLiveData mutableLiveData = this.K;
        if (!isInitialized) {
            this.r.addUxpEvent("ECWAF", new String[0]);
            FrameProducer.Event.FrameProducerWarning.CameraNotInitialized cameraNotInitialized = FrameProducer.Event.FrameProducerWarning.CameraNotInitialized.INSTANCE;
            if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                mutableLiveData.setValue(cameraNotInitialized);
                return;
            } else {
                mutableLiveData.postValue(cameraNotInitialized);
                return;
            }
        }
        Integer num = this.v;
        if (num == null || num.intValue() == 1) {
            a(meteringPoint);
            return;
        }
        if (!a(1)) {
            this.r.addUxpEvent("ECWAF", new String[0]);
            FrameProducer.Event.FrameProducerWarning.UnableToAutoFocus unableToAutoFocus = FrameProducer.Event.FrameProducerWarning.UnableToAutoFocus.INSTANCE;
            if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                mutableLiveData.setValue(unableToAutoFocus);
                return;
            } else {
                mutableLiveData.postValue(unableToAutoFocus);
                return;
            }
        }
        try {
            ListenableFuture b2 = b(1);
            if (b2 != null) {
                b2.addListener(new r6$$ExternalSyntheticLambda0(6, this, meteringPoint), this.d);
            }
        } catch (Exception e2) {
            Log.e("CameraWrapper", "Camera2Control Focus Mode Future Listener rejected by the executor", e2);
            this.r.addUxpEvent("ECWAF", new String[0]);
            FrameProducer.Event.FrameProducerWarning.UnableToAutoFocus unableToAutoFocus2 = FrameProducer.Event.FrameProducerWarning.UnableToAutoFocus.INSTANCE;
            if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                mutableLiveData.setValue(unableToAutoFocus2);
            } else {
                mutableLiveData.postValue(unableToAutoFocus2);
            }
        }
    }

    public final void setCustomFocusMode(Integer num) {
        if (isInitialized()) {
            if (num != null && !a(num.intValue())) {
                a(FrameProducer.Event.FrameProducerWarning.UnsupportedSetting.INSTANCE);
                if (num.equals(this.v)) {
                    this.v = null;
                    return;
                }
                return;
            }
            if (num != null) {
                b(num.intValue());
            } else {
                Camera2CameraControl camera2CameraControl = this.J;
                if (camera2CameraControl != null) {
                    BiometricPrompt biometricPrompt = new BiometricPrompt(OptionsBundle.from(MutableOptionsBundle.create()));
                    Camera2CameraControlCompatImpl camera2CameraControlCompatImpl = camera2CameraControl.compat;
                    synchronized (camera2CameraControlCompatImpl.lock) {
                        camera2CameraControlCompatImpl.configBuilder = new Toolbar.AnonymousClass1(5);
                    }
                    camera2CameraControlCompatImpl.addRequestOption(biometricPrompt);
                    CompletableDeferredImpl applyAsync = camera2CameraControl.compat.applyAsync(camera2CameraControl._useCaseCameraRequestControl, true);
                    CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
                    callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
                    CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
                    callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
                    callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
                    try {
                        applyAsync.invokeOnCompletion(new ClickableKt$$ExternalSyntheticLambda0(3, callbackToFutureAdapter$Completer, applyAsync));
                        callbackToFutureAdapter$Completer.tag = "setCaptureRequestOptions";
                    } catch (Exception e2) {
                        callbackToFutureAdapter$SafeFuture.setException(e2);
                    }
                    Futures.nonCancellationPropagating(callbackToFutureAdapter$SafeFuture);
                }
            }
        }
        this.v = num;
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void setTorchEnabled(boolean z, Function1 function1) {
        Function1 function12;
        CameraWrapper cameraWrapper;
        ListenableFuture enableTorch;
        LifecycleCamera lifecycleCamera = this.y;
        if (lifecycleCamera != null && this.z != null && ((AdapterCameraInfo) lifecycleCamera.getCameraInfo()).mCameraInfo.hasFlashUnit()) {
            if (Intrinsics.areEqual(this.O.getValue(), Boolean.valueOf(z))) {
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                    return;
                }
                return;
            }
            try {
                CameraControlInternal cameraControlInternal = this.z;
                cameraControlInternal.getClass();
                enableTorch = cameraControlInternal.enableTorch(z);
                cameraWrapper = this;
                function12 = function1;
            } catch (Exception e2) {
                e = e2;
                cameraWrapper = this;
                function12 = function1;
            }
            try {
                enableTorch.addListener(new Recorder$$ExternalSyntheticLambda16(cameraWrapper, z, function12, enableTorch, 2), cameraWrapper.d);
                return;
            } catch (Exception e3) {
                e = e3;
                Log.e("CameraWrapper", "CameraControl Torch Future Listener rejected by the executor", e);
                cameraWrapper.r.addUxpEvent("ECWTE", new String[0]);
                if (function12 == null) {
                    return;
                }
                function12.invoke(Boolean.FALSE);
            }
        }
        function12 = function1;
        this.r.addUxpEvent("ECWTE", new String[0]);
        if (function12 == null) {
            return;
        }
        function12.invoke(Boolean.FALSE);
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void startPreview(SurfaceHolder surfaceHolder, boolean z) {
        surfaceHolder.getClass();
        if (!isInitialized()) {
            a(FrameProducer.Event.FrameProducerWarning.CameraNotInitialized.INSTANCE);
            return;
        }
        if (surfaceHolder.getSurface() == null || !surfaceHolder.getSurface().isValid()) {
            surfaceHolder.addCallback(new Camera2Manager$start$1(new k(z), 1));
            return;
        }
        Surface surface = surfaceHolder.getSurface();
        surface.getClass();
        startPreview(surface, z);
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void startVideoRecording() {
        if (!isInitialized()) {
            FrameProducer.Event.FrameProducerWarning.CameraNotInitialized cameraNotInitialized = FrameProducer.Event.FrameProducerWarning.CameraNotInitialized.INSTANCE;
            MutableLiveData mutableLiveData = this.K;
            if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                mutableLiveData.setValue(cameraNotInitialized);
                return;
            } else {
                mutableLiveData.postValue(cameraNotInitialized);
                return;
            }
        }
        stopVideoRecording();
        Context context = (Context) this.e.get();
        if (context != null) {
            try {
                new File(new File(context.getExternalCacheDir(), ".temp.mp4").getPath()).delete();
            } catch (Exception e2) {
                Log.w("CameraWrapper", "Could not delete the video file", e2);
            }
        }
        try {
            this.H = new p(new e());
            Schema schema = this.F;
            schema.getClass();
            Executor executor = this.d;
            p pVar = this.H;
            pVar.getClass();
            this.G = schema.start(executor, pVar);
        } catch (Exception e3) {
            Recording recording = this.G;
            if (recording != null) {
                recording.close();
                this.G = null;
            }
            a(FrameProducer.Event.VideoRecordingError.StartRecording.INSTANCE);
            Log.e("CameraWrapper", "Could not start the video recording", e3);
        }
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void stopVideoRecording() {
        Recording recording = this.G;
        if (recording != null) {
            recording.close();
            this.G = null;
        }
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void takePicture() {
        if (!isInitialized()) {
            a(FrameProducer.Event.FrameProducerWarning.CameraNotInitialized.INSTANCE);
            return;
        }
        ImageCapture imageCapture = this.D;
        if (imageCapture == null) {
            a(FrameProducer.Event.FrameProducerWarning.PreviewNotInitialized.INSTANCE);
        } else {
            imageCapture.takePicture(this.d, this.Q);
        }
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void startPreview(Surface surface, boolean z) {
        surface.getClass();
        if (!surface.isValid()) {
            a(FrameProducer.Event.InitializationError.InvalidPreviewSurface.INSTANCE);
            return;
        }
        if (!isInitialized()) {
            a(FrameProducer.Event.FrameProducerWarning.CameraNotInitialized.INSTANCE);
            return;
        }
        Executor executor = this.d;
        executor.getClass();
        n nVar = new n(executor);
        nVar.b = surface;
        a(nVar, z);
    }

    @Override // com.miteksystems.misnap.camera.frameproducers.FrameProducer
    public final void startPreview(Preview.SurfaceProvider surfaceProvider, boolean z) {
        surfaceProvider.getClass();
        if (isInitialized()) {
            a(surfaceProvider, z);
        } else {
            a(FrameProducer.Event.FrameProducerWarning.CameraNotInitialized.INSTANCE);
        }
    }

    public final CameraInfo a(CameraSelectorFilter cameraSelectorFilter, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            cameraInfo.getClass();
            arrayList2.add(Camera2CameraInfo.from(cameraInfo));
        }
        Map map = MapsKt__MapsKt.toMap(CollectionsKt.zip(arrayList, arrayList2));
        ArrayList filterCameras = cameraSelectorFilter.filterCameras(CollectionsKt.toMutableList(map.values()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (filterCameras.contains(entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List list = CollectionsKt.toList(linkedHashMap.keySet());
        if (filterCameras.isEmpty() || list.isEmpty()) {
            Log.e("CameraWrapper", "Couldn't find a camera with the minimum set of requirements");
        }
        return (CameraInfo) CollectionsKt.firstOrNull(list);
    }

    public static Size a(Size size, Context context) {
        return WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context) == 1 ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static QualitySelector a(MiSnapSettings.Camera.VideoRecord.VideoQuality videoQuality) {
        int i2 = b.a[videoQuality.ordinal()];
        if (i2 == 1) {
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AutoValue_Quality_ConstantQuality[]{AutoValue_Quality_ConstantQuality.FHD, AutoValue_Quality_ConstantQuality.HD, AutoValue_Quality_ConstantQuality.HIGHEST});
            QualitySelector qualitySelector = QualitySelector.NONE;
            return QualitySelector.fromOrderedList(listOf, AutoValue_FallbackStrategy_RuleStrategy.NONE);
        }
        if (i2 == 2) {
            List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new AutoValue_Quality_ConstantQuality[]{AutoValue_Quality_ConstantQuality.HD, AutoValue_Quality_ConstantQuality.HIGHEST});
            QualitySelector qualitySelector2 = QualitySelector.NONE;
            return QualitySelector.fromOrderedList(listOf2, AutoValue_FallbackStrategy_RuleStrategy.NONE);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final void a(LifecycleOwner lifecycleOwner) {
        ProcessCameraProvider processCameraProvider = this.w;
        if (processCameraProvider == null || this.x == null) {
            return;
        }
        processCameraProvider.unbindAll();
        ProcessCameraProvider processCameraProvider2 = this.w;
        processCameraProvider2.getClass();
        CameraSelector cameraSelector = this.x;
        cameraSelector.getClass();
        LifecycleCamera bindToLifecycle = processCameraProvider2.bindToLifecycle(lifecycleOwner, cameraSelector, new UseCase[0]);
        this.y = bindToLifecycle;
        CameraControlInternal cameraControl = bindToLifecycle.getCameraControl();
        cameraControl.getClass();
        CameraControlInternal cameraControlInternal = (CameraControlInternal) ((AdapterCameraControl) cameraControl).mCameraControl;
        cameraControlInternal.getClass();
        TransactorKt.checkArgument("CameraControl doesn't contain Camera2 implementation.", cameraControlInternal instanceof CameraControlAdapter);
        Camera2CameraControl camera2CameraControl = ((CameraControlAdapter) cameraControlInternal).camera2cameraControl;
        camera2CameraControl.getClass();
        this.J = camera2CameraControl;
        this.z = bindToLifecycle.getCameraControl();
        CameraInfo cameraInfo = bindToLifecycle.getCameraInfo();
        cameraInfo.getClass();
        Camera2CameraInfo from = Camera2CameraInfo.from(cameraInfo);
        this.A = from.cameraId;
        this.I = from;
    }

    public final boolean a(int i2) {
        List list;
        Camera2CameraInfo camera2CameraInfo = this.I;
        if (camera2CameraInfo == null) {
            return false;
        }
        int[] iArr = (int[]) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null || (list = ArraysKt___ArraysKt.toList(iArr)) == null) {
            list = EmptyList.INSTANCE;
        }
        return list.contains(Integer.valueOf(i2));
    }

    public final void a(MeteringPoint meteringPoint) {
        CameraControlInternal cameraControlInternal = this.z;
        if (cameraControlInternal != null) {
            FocusMeteringAction focusMeteringAction = new FocusMeteringAction(meteringPoint);
            focusMeteringAction.mAutoCancelDurationInMillis = 3000L;
            ListenableFuture startFocusAndMetering = cameraControlInternal.startFocusAndMetering(new FocusMeteringAction(focusMeteringAction));
            Boolean bool = Boolean.TRUE;
            MutableLiveData mutableLiveData = this.N;
            if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                mutableLiveData.setValue(bool);
            } else {
                mutableLiveData.postValue(bool);
            }
            try {
                startFocusAndMetering.addListener(new CameraWrapper$$ExternalSyntheticLambda1(this, 2), this.d);
            } catch (Exception e2) {
                Log.e("CameraWrapper", "CameraControl Focus Future Listener rejected by the executor", e2);
                Boolean bool2 = Boolean.FALSE;
                if (Looper.getMainLooper().isCurrentThread()) {
                    mutableLiveData.setValue(bool2);
                } else {
                    mutableLiveData.postValue(bool2);
                }
                this.m = false;
                this.o.removeCallbacksAndMessages(null);
            }
        }
    }

    public final void a(FrameProducer.Event event) {
        if (event instanceof FrameProducer.Event.FrameProducerWarning) {
            this.r.addUxpEvent("ECWFW", event.toString());
        } else if (event instanceof FrameProducer.Event.InitializationError) {
            this.r.addUxpEvent("ECWIN", event.toString());
        } else if (event instanceof FrameProducer.Event.TakePhotoError) {
            this.r.addUxpEvent("ECWTP", event.toString());
        } else if (event instanceof FrameProducer.Event.VideoRecordingError) {
            this.r.addUxpEvent("ECWVR", event.toString());
        }
        MutableLiveData mutableLiveData = this.K;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(event);
        } else {
            mutableLiveData.postValue(event);
        }
    }
}
