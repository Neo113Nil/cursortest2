package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.WebviewProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicRef;
import string.ReplaceModeKt;

/* loaded from: classes3.dex */
public final class AndroidCameraDevice implements CameraDeviceWrapper {
    public final AtomicRef _lastStateCallback;
    public final CameraDevice cameraDevice;
    public final Camera2ErrorProcessor cameraErrorListener;
    public final String cameraId;
    public final CameraMetadata cameraMetadata;
    public final AtomicBoolean closed;
    public final Recorder.AnonymousClass4 interopCaptureSessionListener;
    public final Threads threads;

    public AndroidCameraDevice(CameraMetadata cameraMetadata, CameraDevice cameraDevice, String str, Camera2ErrorProcessor camera2ErrorProcessor, Recorder.AnonymousClass4 anonymousClass4, Threads threads) {
        cameraMetadata.getClass();
        str.getClass();
        camera2ErrorProcessor.getClass();
        threads.getClass();
        this.cameraMetadata = cameraMetadata;
        this.cameraDevice = cameraDevice;
        this.cameraId = str;
        this.cameraErrorListener = camera2ErrorProcessor;
        this.interopCaptureSessionListener = anonymousClass4;
        this.threads = threads;
        this.closed = AtomicFU.atomic(false);
        this._lastStateCallback = AtomicFU.atomic((Object) null);
    }

    public final Pair checkAndSetStateCallback(SessionStateCallback sessionStateCallback) {
        if (this.closed.getValue()) {
            onSessionFinalizedWithTrace(sessionStateCallback);
            return new Pair(Boolean.FALSE, null);
        }
        Boolean bool = Boolean.TRUE;
        AtomicRef atomicRef = this._lastStateCallback;
        atomicRef.getClass();
        return new Pair(bool, AtomicRef.FU.getAndSet(atomicRef, sessionStateCallback));
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* renamed from: createCaptureRequest-2PPcXtw, reason: not valid java name */
    public final CaptureRequest.Builder mo58createCaptureRequest2PPcXtw(int i) {
        double d;
        CaptureRequest.Builder builder;
        StringBuilder sb = new StringBuilder("CXCP#createCaptureRequest-");
        String str = this.cameraId;
        sb.append(str);
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
            try {
                builder = this.cameraDevice.createCaptureRequest(i);
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                int i2 = 0;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason == 1) {
                            i2 = 3;
                        } else if (reason == 2) {
                            i2 = 6;
                        } else if (reason != 3) {
                            if (reason == 4) {
                                i2 = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i2 = 11;
                            } else {
                                i2 = 2;
                            }
                        }
                        camera2ErrorProcessor.m69onCameraError3M5Xam4(str, i2, true);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        camera2ErrorProcessor.m69onCameraError3M5Xam4(str, 9, false);
                    }
                    builder = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
            return builder;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01f0 A[Catch: all -> 0x00bd, TryCatch #9 {all -> 0x00bd, blocks: (B:34:0x00a2, B:36:0x00af, B:38:0x00b5, B:39:0x00c6, B:43:0x00f1, B:44:0x0114, B:46:0x011a, B:48:0x0128, B:49:0x0132, B:51:0x0138, B:54:0x014a, B:57:0x0157, B:63:0x015b, B:66:0x016d, B:79:0x0176, B:80:0x0179, B:83:0x017b, B:84:0x017e, B:87:0x0195, B:89:0x0199, B:98:0x01c6, B:101:0x01eb, B:108:0x01f0, B:110:0x01f6, B:112:0x01fa, B:114:0x01fe, B:117:0x0203, B:119:0x0207, B:120:0x020d, B:121:0x020e), top: B:8:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0199 A[Catch: all -> 0x00bd, TryCatch #9 {all -> 0x00bd, blocks: (B:34:0x00a2, B:36:0x00af, B:38:0x00b5, B:39:0x00c6, B:43:0x00f1, B:44:0x0114, B:46:0x011a, B:48:0x0128, B:49:0x0132, B:51:0x0138, B:54:0x014a, B:57:0x0157, B:63:0x015b, B:66:0x016d, B:79:0x0176, B:80:0x0179, B:83:0x017b, B:84:0x017e, B:87:0x0195, B:89:0x0199, B:98:0x01c6, B:101:0x01eb, B:108:0x01f0, B:110:0x01f6, B:112:0x01fa, B:114:0x01fe, B:117:0x0203, B:119:0x0207, B:120:0x020d, B:121:0x020e), top: B:8:0x003b }] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean createCaptureSession(SessionConfigData sessionConfigData) {
        String str;
        String str2;
        String str3;
        Camera2ErrorProcessor camera2ErrorProcessor;
        String str4;
        boolean z;
        Unit unit;
        Camera2ErrorProcessor camera2ErrorProcessor2;
        ArrayList arrayList;
        Executor executor;
        CameraDevice cameraDevice = this.cameraDevice;
        CaptureSessionState captureSessionState = sessionConfigData.stateCallback;
        List list = sessionConfigData.inputConfiguration;
        Pair checkAndSetStateCallback = checkAndSetStateCallback(captureSessionState);
        boolean booleanValue = ((Boolean) checkAndSetStateCallback.first).booleanValue();
        SessionStateCallback sessionStateCallback = (SessionStateCallback) checkAndSetStateCallback.second;
        if (!booleanValue) {
            return false;
        }
        if (sessionStateCallback != null) {
            onSessionDisconnectedWithTrace(sessionStateCallback);
        }
        String str5 = this.cameraId;
        String m = Recorder$$ExternalSyntheticOutline2.m("CXCP#createCaptureSession-", str5);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(m);
                Camera2ErrorProcessor camera2ErrorProcessor3 = this.cameraErrorListener;
                try {
                    int i = sessionConfigData.sessionType;
                    ArrayList arrayList2 = sessionConfigData.outputConfigurations;
                    str3 = "%.3f ms";
                    try {
                        try {
                            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                try {
                                    arrayList.add((OutputConfiguration) ((AndroidOutputConfiguration) it.next()).unwrapAs(Reflection.factory.getOrCreateKotlinClass(OutputConfiguration.class)));
                                } catch (Throwable th) {
                                    th = th;
                                    str2 = " - ";
                                    str = str3;
                                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, str, Recorder$$ExternalSyntheticOutline2.m108m(m, str2)));
                                    throw th;
                                }
                            }
                            executor = sessionConfigData.executor;
                            try {
                                str4 = " - ";
                                camera2ErrorProcessor = camera2ErrorProcessor3;
                            } catch (Exception e) {
                                e = e;
                                str4 = " - ";
                                camera2ErrorProcessor = camera2ErrorProcessor3;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            camera2ErrorProcessor = camera2ErrorProcessor3;
                            str4 = " - ";
                            if (e instanceof CameraAccessException) {
                                Camera2ErrorProcessor camera2ErrorProcessor4 = camera2ErrorProcessor;
                                if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                    if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                }
                                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                z = false;
                                camera2ErrorProcessor4.m69onCameraError3M5Xam4(str5, 9, false);
                                unit = null;
                                Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, str3, Recorder$$ExternalSyntheticOutline2.m108m(m, str4)));
                                if (unit == null) {
                                }
                                if (unit == null) {
                                }
                            } else {
                                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                CameraAccessException cameraAccessException = (CameraAccessException) e;
                                int reason = cameraAccessException.getReason();
                                int i2 = 3;
                                boolean z2 = true;
                                if (reason != 1) {
                                    if (reason != 2) {
                                        if (reason == 3) {
                                            camera2ErrorProcessor2 = camera2ErrorProcessor;
                                            i2 = 0;
                                        } else if (reason == 4) {
                                            camera2ErrorProcessor2 = camera2ErrorProcessor;
                                            i2 = 1;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i2 = 11;
                                        } else {
                                            i2 = 2;
                                        }
                                        z2 = true;
                                    } else {
                                        i2 = 6;
                                    }
                                    camera2ErrorProcessor2 = camera2ErrorProcessor;
                                    z2 = true;
                                } else {
                                    camera2ErrorProcessor2 = camera2ErrorProcessor;
                                }
                                camera2ErrorProcessor2.m69onCameraError3M5Xam4(str5, i2, z2);
                            }
                            unit = null;
                            z = false;
                            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, str3, Recorder$$ExternalSyntheticOutline2.m108m(m, str4)));
                            if (unit == null) {
                            }
                            if (unit == null) {
                            }
                        }
                        try {
                            AndroidCaptureSessionStateCallback androidCaptureSessionStateCallback = new AndroidCaptureSessionStateCallback(this, sessionConfigData.stateCallback, sessionStateCallback, this.cameraErrorListener, this.interopCaptureSessionListener, this.threads.getCamera2Handler());
                            executor.getClass();
                            SessionConfiguration sessionConfiguration = new SessionConfiguration(i, arrayList, executor, androidCaptureSessionStateCallback);
                            if (list != null) {
                                if (Build.VERSION.SDK_INT >= 31) {
                                    sessionConfiguration.setInputConfiguration(Api31Compat.newInputConfiguration(str5, list));
                                } else {
                                    sessionConfiguration.setInputConfiguration(new InputConfiguration(((InputConfigData) CollectionsKt.single(list)).width, ((InputConfigData) CollectionsKt.single(list)).height, ((InputConfigData) CollectionsKt.single(list)).f839format));
                                }
                            }
                            try {
                                Trace.beginSection("createCaptureRequest");
                                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(sessionConfigData.sessionTemplateId);
                                Trace.endSection();
                                createCaptureRequest.getClass();
                                Set set = (Set) ((Camera2CameraMetadata) this.cameraMetadata)._sessionKeys.getValue();
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
                                Iterator it2 = set.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(((CaptureRequest.Key) it2.next()).getName());
                                }
                                for (Map.Entry entry : sessionConfigData.sessionParameters.entrySet()) {
                                    Object key = entry.getKey();
                                    Object value = entry.getValue();
                                    if ((key instanceof CaptureRequest.Key) && arrayList3.contains(((CaptureRequest.Key) key).getName())) {
                                        ReplaceModeKt.writeParameter(createCaptureRequest, key, value);
                                    }
                                }
                                CaptureRequest build = createCaptureRequest.build();
                                build.getClass();
                                sessionConfiguration.setSessionParameters(build);
                                try {
                                    Trace.beginSection("Api28Compat.createCaptureSession");
                                    cameraDevice.createCaptureSession(sessionConfiguration);
                                    Trace.endSection();
                                    unit = Unit.INSTANCE;
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Exception e3) {
                            e = e3;
                            if (e instanceof CameraAccessException) {
                            }
                            unit = null;
                            z = false;
                            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, str3, Recorder$$ExternalSyntheticOutline2.m108m(m, str4)));
                            if (unit == null) {
                            }
                            if (unit == null) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = str3;
                        str2 = " - ";
                        Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, str, Recorder$$ExternalSyntheticOutline2.m108m(m, str2)));
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    camera2ErrorProcessor = camera2ErrorProcessor3;
                    str3 = "%.3f ms";
                } catch (Throwable th3) {
                    th = th3;
                    str3 = "%.3f ms";
                }
                z = false;
                Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, str3, Recorder$$ExternalSyntheticOutline2.m108m(m, str4)));
                if (unit == null) {
                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                    if (sessionStateCallback != null) {
                        onSessionFinalizedWithTrace(sessionStateCallback);
                    }
                }
                if (unit == null) {
                    return true;
                }
                return z;
            } catch (Throwable th4) {
                th = th4;
                str = "%.3f ms";
                str2 = " - ";
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0179 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:9:0x003c, B:11:0x0041, B:12:0x0052, B:14:0x0058, B:16:0x007b, B:19:0x007f, B:22:0x0084, B:25:0x008d, B:38:0x00a4, B:40:0x00a8, B:49:0x00d5, B:51:0x00fc, B:58:0x0101, B:60:0x0107, B:62:0x010b, B:64:0x010f, B:67:0x0114, B:69:0x0118, B:70:0x011e, B:71:0x011f), top: B:8:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101 A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:9:0x003c, B:11:0x0041, B:12:0x0052, B:14:0x0058, B:16:0x007b, B:19:0x007f, B:22:0x0084, B:25:0x008d, B:38:0x00a4, B:40:0x00a8, B:49:0x00d5, B:51:0x00fc, B:58:0x0101, B:60:0x0107, B:62:0x010b, B:64:0x010f, B:67:0x0114, B:69:0x0118, B:70:0x011e, B:71:0x011f), top: B:8:0x003c }] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean createCaptureSessionByOutputConfigurations(ArrayList arrayList, CaptureSessionState captureSessionState) {
        SessionStateCallback sessionStateCallback;
        Camera2ErrorProcessor camera2ErrorProcessor;
        boolean z;
        Unit unit;
        Camera2ErrorProcessor camera2ErrorProcessor2;
        ArrayList arrayList2;
        Threads threads = this.threads;
        CameraDevice cameraDevice = this.cameraDevice;
        captureSessionState.getClass();
        Pair checkAndSetStateCallback = checkAndSetStateCallback(captureSessionState);
        boolean booleanValue = ((Boolean) checkAndSetStateCallback.first).booleanValue();
        SessionStateCallback sessionStateCallback2 = (SessionStateCallback) checkAndSetStateCallback.second;
        if (!booleanValue) {
            return false;
        }
        if (sessionStateCallback2 != null) {
            onSessionDisconnectedWithTrace(sessionStateCallback2);
        }
        String str = this.cameraId;
        String m = Recorder$$ExternalSyntheticOutline2.m("CXCP#createCaptureSessionByOutputConfigurations-", str);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(m);
            Camera2ErrorProcessor camera2ErrorProcessor3 = this.cameraErrorListener;
            try {
                arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((OutputConfiguration) ((AndroidOutputConfiguration) it.next()).unwrapAs(Reflection.factory.getOrCreateKotlinClass(OutputConfiguration.class)));
                }
                sessionStateCallback = sessionStateCallback2;
            } catch (Exception e) {
                e = e;
                sessionStateCallback = sessionStateCallback2;
            }
            try {
                try {
                    camera2ErrorProcessor = camera2ErrorProcessor3;
                } catch (Exception e2) {
                    e = e2;
                    camera2ErrorProcessor = camera2ErrorProcessor3;
                }
                try {
                    cameraDevice.createCaptureSessionByOutputConfigurations(arrayList2, new AndroidCaptureSessionStateCallback(this, captureSessionState, sessionStateCallback, this.cameraErrorListener, this.interopCaptureSessionListener, threads.getCamera2Handler()), threads.getCamera2Handler());
                    unit = Unit.INSTANCE;
                } catch (Exception e3) {
                    e = e3;
                    if (e instanceof CameraAccessException) {
                        Camera2ErrorProcessor camera2ErrorProcessor4 = camera2ErrorProcessor;
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        z = false;
                        camera2ErrorProcessor4.m69onCameraError3M5Xam4(str, 9, false);
                        unit = null;
                        Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(m, " - ")));
                        if (unit == null) {
                        }
                        if (unit == null) {
                        }
                    } else {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i = 3;
                        boolean z2 = true;
                        if (reason != 1) {
                            if (reason == 2) {
                                i = 6;
                            } else if (reason == 3) {
                                camera2ErrorProcessor2 = camera2ErrorProcessor;
                                z2 = true;
                                i = 0;
                            } else if (reason == 4) {
                                camera2ErrorProcessor2 = camera2ErrorProcessor;
                                z2 = true;
                                i = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                            camera2ErrorProcessor2 = camera2ErrorProcessor;
                            z2 = true;
                        } else {
                            camera2ErrorProcessor2 = camera2ErrorProcessor;
                        }
                        camera2ErrorProcessor2.m69onCameraError3M5Xam4(str, i, z2);
                    }
                    unit = null;
                    z = false;
                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(m, " - ")));
                    if (unit == null) {
                    }
                    if (unit == null) {
                    }
                }
            } catch (Exception e4) {
                e = e4;
                camera2ErrorProcessor = camera2ErrorProcessor3;
                if (e instanceof CameraAccessException) {
                }
                unit = null;
                z = false;
                Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(m, " - ")));
                if (unit == null) {
                }
                if (unit == null) {
                }
            }
            z = false;
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(m, " - ")));
            if (unit == null) {
                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                if (sessionStateCallback != null) {
                    onSessionFinalizedWithTrace(sessionStateCallback);
                }
            }
            if (unit == null) {
                return true;
            }
            return z;
        } catch (Throwable th) {
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(m, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0156  */
    /* JADX WARN: Type inference failed for: r14v1, types: [androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor] */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean createConstrainedHighSpeedCaptureSession(ArrayList arrayList, CaptureSessionState captureSessionState) {
        String str;
        int i;
        String str2;
        ?? r9;
        SessionStateCallback sessionStateCallback;
        boolean z;
        Unit unit;
        int i2;
        Threads threads = this.threads;
        CameraDevice cameraDevice = this.cameraDevice;
        captureSessionState.getClass();
        Pair checkAndSetStateCallback = checkAndSetStateCallback(captureSessionState);
        boolean booleanValue = ((Boolean) checkAndSetStateCallback.first).booleanValue();
        SessionStateCallback sessionStateCallback2 = (SessionStateCallback) checkAndSetStateCallback.second;
        if (!booleanValue) {
            return false;
        }
        if (sessionStateCallback2 != null) {
            onSessionDisconnectedWithTrace(sessionStateCallback2);
        }
        String str3 = this.cameraId;
        String m = Recorder$$ExternalSyntheticOutline2.m("CXCP#createConstrainedHighSpeedCaptureSession-", str3);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(m);
            ?? r14 = this.cameraErrorListener;
            try {
                sessionStateCallback = sessionStateCallback2;
                try {
                    Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
                    Recorder.AnonymousClass4 anonymousClass4 = this.interopCaptureSessionListener;
                    try {
                        Handler camera2Handler = threads.getCamera2Handler();
                        str2 = m;
                        r9 = 1;
                        try {
                            try {
                                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, new AndroidCaptureSessionStateCallback(this, captureSessionState, sessionStateCallback, camera2ErrorProcessor, anonymousClass4, camera2Handler), threads.getCamera2Handler());
                                unit = Unit.INSTANCE;
                                z = false;
                                i2 = r9;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i3 = 3;
                                    if (reason != r9) {
                                        if (reason == 2) {
                                            i3 = 6;
                                        } else if (reason == 3) {
                                            i3 = 0;
                                        } else if (reason == 4) {
                                            i3 = r9 == true ? 1 : 0;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i3 = 11;
                                        } else {
                                            i3 = 2;
                                        }
                                    }
                                    r14.m69onCameraError3M5Xam4(str3, i3, r9);
                                } else {
                                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z = false;
                                    r14.m69onCameraError3M5Xam4(str3, 9, false);
                                    unit = null;
                                    i2 = r9;
                                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, i2, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str2, " - ")));
                                    if (unit == null) {
                                    }
                                    if (unit != null) {
                                    }
                                }
                                z = false;
                                unit = null;
                                i2 = r9;
                                Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, i2, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str2, " - ")));
                                if (unit == null) {
                                }
                                if (unit != null) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            str = str2;
                            i = r9;
                            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, i, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = m;
                        r9 = 1;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = m;
                        r9 = 1;
                    }
                } catch (Exception e3) {
                    e = e3;
                    r9 = 1;
                    str2 = m;
                } catch (Throwable th3) {
                    th = th3;
                    r9 = 1;
                    str2 = m;
                }
            } catch (Exception e4) {
                e = e4;
                str2 = m;
                sessionStateCallback = sessionStateCallback2;
                r9 = 1;
            } catch (Throwable th4) {
                th = th4;
                str2 = m;
                r9 = 1;
            }
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, i2, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str2, " - ")));
            if (unit == null) {
                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                if (sessionStateCallback != null) {
                    onSessionFinalizedWithTrace(sessionStateCallback);
                }
            }
            return unit != null ? i2 : z;
        } catch (Throwable th5) {
            th = th5;
            str = m;
            i = 1;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:8|9|(5:11|12|13|14|15)|(12:16|17|(3:19|20|21)(1:74)|23|24|25|(3:27|(3:29|(1:(2:32|(2:34|(1:36)(1:38))(1:39))(1:40))(1:41)|37)|42)(7:54|(2:63|(1:65)(1:66))|67|44|45|(2:47|(1:49))|(1:51)(2:52|53))|43|44|45|(0)|(0)(0))|75|76|77|78|79|80|(2:84|(1:86)(2:87|88))|89|90|45|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00be, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b8 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ba  */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean createExtensionSession(ExtensionSessionConfigData extensionSessionConfigData) {
        String str;
        String str2;
        long j;
        String str3;
        String str4;
        Unit unit;
        boolean z;
        int intValue;
        ArrayList arrayList;
        Iterator it;
        WebviewProxy.AnonymousClass1 anonymousClass1 = extensionSessionConfigData.executor;
        String str5 = "%.3f ms";
        CameraDevice cameraDevice = this.cameraDevice;
        ExtensionSessionState extensionSessionState = extensionSessionConfigData.extensionStateCallback;
        Integer num = extensionSessionConfigData.extensionMode;
        Pair checkAndSetStateCallback = checkAndSetStateCallback(extensionSessionState);
        boolean booleanValue = ((Boolean) checkAndSetStateCallback.first).booleanValue();
        SessionStateCallback sessionStateCallback = (SessionStateCallback) checkAndSetStateCallback.second;
        if (!booleanValue) {
            return false;
        }
        if (sessionStateCallback != null) {
            onSessionDisconnectedWithTrace(sessionStateCallback);
        }
        String str6 = this.cameraId;
        String m = Recorder$$ExternalSyntheticOutline2.m("CXCP#createExtensionSession-", str6);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(m);
                Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
                try {
                    intValue = num.intValue();
                    ArrayList arrayList2 = extensionSessionConfigData.outputConfigurations;
                    j = elapsedRealtimeNanos;
                    try {
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                        it = arrayList2.iterator();
                    } catch (Exception e) {
                        e = e;
                        str3 = str5;
                    } catch (Throwable th) {
                        th = th;
                        str3 = str5;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str3 = "%.3f ms";
                    j = elapsedRealtimeNanos;
                } catch (Throwable th2) {
                    th = th2;
                    str3 = "%.3f ms";
                    j = elapsedRealtimeNanos;
                }
                try {
                    while (true) {
                        str3 = str5;
                        if (!it.hasNext()) {
                            break;
                        }
                        try {
                            try {
                                int i = intValue;
                                arrayList.add((OutputConfiguration) ((AndroidOutputConfiguration) it.next()).unwrapAs(Reflection.factory.getOrCreateKotlinClass(OutputConfiguration.class)));
                                str5 = str3;
                                intValue = i;
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str2 = " - ";
                            str = str3;
                            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(j) / 1000000.0d)}, 1, (Locale) null, str, Recorder$$ExternalSyntheticOutline2.m108m(m, str2)));
                            throw th;
                        }
                        e = e3;
                        str4 = " - ";
                        if (!(e instanceof CameraAccessException)) {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (!(e instanceof IllegalStateException)) {
                                    throw e;
                                }
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            z = false;
                            camera2ErrorProcessor.m69onCameraError3M5Xam4(str6, 9, false);
                            unit = null;
                            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(j) / 1000000.0d)}, 1, (Locale) null, str3, Recorder$$ExternalSyntheticOutline2.m108m(m, str4)));
                            if (unit == null) {
                                Log.w("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                                if (sessionStateCallback != null) {
                                    onSessionFinalizedWithTrace(sessionStateCallback);
                                }
                            }
                            if (unit != null) {
                                return true;
                            }
                            return z;
                        }
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i2 = 3;
                        boolean z2 = true;
                        if (reason != 1) {
                            if (reason == 2) {
                                i2 = 6;
                            } else if (reason == 3) {
                                z2 = true;
                                i2 = 0;
                            } else if (reason == 4) {
                                z2 = true;
                                i2 = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i2 = 11;
                            } else {
                                i2 = 2;
                            }
                            z2 = true;
                        }
                        camera2ErrorProcessor.m69onCameraError3M5Xam4(str6, i2, z2);
                        z = false;
                        unit = null;
                        Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(j) / 1000000.0d)}, 1, (Locale) null, str3, Recorder$$ExternalSyntheticOutline2.m108m(m, str4)));
                        if (unit == null) {
                        }
                        if (unit != null) {
                        }
                    }
                    str4 = " - ";
                    ExtensionSessionConfiguration extensionSessionConfiguration = new ExtensionSessionConfiguration(intValue, arrayList, anonymousClass1, new AndroidExtensionSessionStateCallback(this, extensionSessionState, sessionStateCallback, this.cameraErrorListener, this.interopCaptureSessionListener, anonymousClass1));
                    AndroidOutputConfiguration androidOutputConfiguration = extensionSessionConfigData.postviewOutputConfiguration;
                    if (androidOutputConfiguration != null && Build.VERSION.SDK_INT >= 34) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) androidOutputConfiguration.unwrapAs(Reflection.factory.getOrCreateKotlinClass(OutputConfiguration.class));
                        if (outputConfiguration == null) {
                            throw new IllegalStateException("Failed to unwrap Postview OutputConfiguration");
                        }
                        Api34Compat.setPostviewOutputConfiguration(extensionSessionConfiguration, outputConfiguration);
                    }
                    cameraDevice.createExtensionSession(extensionSessionConfiguration);
                    unit = Unit.INSTANCE;
                    z = false;
                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(j) / 1000000.0d)}, 1, (Locale) null, str3, Recorder$$ExternalSyntheticOutline2.m108m(m, str4)));
                    if (unit == null) {
                    }
                    if (unit != null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str2 = " - ";
                    str = str3;
                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(j) / 1000000.0d)}, 1, (Locale) null, str, Recorder$$ExternalSyntheticOutline2.m108m(m, str2)));
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            str = "%.3f ms";
            str2 = " - ";
            j = elapsedRealtimeNanos;
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(j) / 1000000.0d)}, 1, (Locale) null, str, Recorder$$ExternalSyntheticOutline2.m108m(m, str2)));
            throw th;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final CaptureRequest.Builder createReprocessCaptureRequest(TotalCaptureResult totalCaptureResult) {
        double d;
        CaptureRequest.Builder builder;
        StringBuilder sb = new StringBuilder("CXCP#createReprocessCaptureRequest-");
        String str = this.cameraId;
        sb.append(str);
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
            try {
                builder = this.cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                int i = 0;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason == 1) {
                            i = 3;
                        } else if (reason == 2) {
                            i = 6;
                        } else if (reason != 3) {
                            if (reason == 4) {
                                i = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                        }
                        camera2ErrorProcessor.m69onCameraError3M5Xam4(str, i, true);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        camera2ErrorProcessor.m69onCameraError3M5Xam4(str, 9, false);
                    }
                    builder = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
            return builder;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0158  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean createReprocessableCaptureSession(InputConfiguration inputConfiguration, ArrayList arrayList, CaptureSessionState captureSessionState) {
        String str;
        ?? r9;
        String str2;
        String str3;
        SessionStateCallback sessionStateCallback;
        boolean z;
        boolean z2;
        Unit unit;
        boolean z3;
        Threads threads = this.threads;
        CameraDevice cameraDevice = this.cameraDevice;
        captureSessionState.getClass();
        Pair checkAndSetStateCallback = checkAndSetStateCallback(captureSessionState);
        boolean booleanValue = ((Boolean) checkAndSetStateCallback.first).booleanValue();
        SessionStateCallback sessionStateCallback2 = (SessionStateCallback) checkAndSetStateCallback.second;
        if (!booleanValue) {
            return false;
        }
        if (sessionStateCallback2 != null) {
            onSessionDisconnectedWithTrace(sessionStateCallback2);
        }
        String str4 = this.cameraId;
        String m = Recorder$$ExternalSyntheticOutline2.m("CXCP#createReprocessableCaptureSession-", str4);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(m);
                Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
                try {
                    sessionStateCallback = sessionStateCallback2;
                    try {
                        Camera2ErrorProcessor camera2ErrorProcessor2 = this.cameraErrorListener;
                        Recorder.AnonymousClass4 anonymousClass4 = this.interopCaptureSessionListener;
                        try {
                            Handler camera2Handler = threads.getCamera2Handler();
                            str3 = m;
                            z = true;
                            try {
                                cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayList, new AndroidCaptureSessionStateCallback(this, captureSessionState, sessionStateCallback, camera2ErrorProcessor2, anonymousClass4, camera2Handler), threads.getCamera2Handler());
                                unit = Unit.INSTANCE;
                                z2 = false;
                                z3 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i = 6;
                                        } else if (reason == 3) {
                                            i = 0;
                                        } else if (reason == 4) {
                                            i = z ? 1 : 0;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                    camera2ErrorProcessor.m69onCameraError3M5Xam4(str4, i, z);
                                } else {
                                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z2 = false;
                                    camera2ErrorProcessor.m69onCameraError3M5Xam4(str4, 9, false);
                                    unit = null;
                                    z3 = z;
                                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, (int) z3, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str3, " - ")));
                                    if (unit == null) {
                                    }
                                    if (unit != null) {
                                    }
                                }
                                z2 = false;
                                unit = null;
                                z3 = z;
                                Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, (int) z3, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str3, " - ")));
                                if (unit == null) {
                                }
                                if (unit != null) {
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = m;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            str2 = m;
                            threads = 1;
                            str = str2;
                            r9 = threads;
                            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, (int) r9, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                        str3 = m;
                    } catch (Throwable th2) {
                        th = th2;
                        threads = 1;
                        str2 = m;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = m;
                    sessionStateCallback = sessionStateCallback2;
                    z = true;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = m;
                    threads = 1;
                }
                Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, (int) z3, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str3, " - ")));
                if (unit == null) {
                    Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                    if (sessionStateCallback != null) {
                        onSessionFinalizedWithTrace(sessionStateCallback);
                    }
                }
                return unit != null ? z3 : z2;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = m;
            r9 = 1;
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, (int) r9, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4 A[Catch: all -> 0x0082, TryCatch #1 {all -> 0x0082, blocks: (B:9:0x003d, B:11:0x0042, B:12:0x005e, B:15:0x0064, B:18:0x006e, B:22:0x00c0, B:24:0x00c4, B:33:0x00f1, B:35:0x0118, B:52:0x011d, B:54:0x0123, B:56:0x0127, B:58:0x012b, B:61:0x0130, B:63:0x0134, B:64:0x013a, B:65:0x013b, B:72:0x0091, B:75:0x009b, B:78:0x00a8), top: B:8:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0195 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d A[Catch: all -> 0x0082, TryCatch #1 {all -> 0x0082, blocks: (B:9:0x003d, B:11:0x0042, B:12:0x005e, B:15:0x0064, B:18:0x006e, B:22:0x00c0, B:24:0x00c4, B:33:0x00f1, B:35:0x0118, B:52:0x011d, B:54:0x0123, B:56:0x0127, B:58:0x012b, B:61:0x0130, B:63:0x0134, B:64:0x013a, B:65:0x013b, B:72:0x0091, B:75:0x009b, B:78:0x00a8), top: B:8:0x003d }] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean createReprocessableCaptureSessionByConfigurations(InputConfigData inputConfigData, ArrayList arrayList, CaptureSessionState captureSessionState) {
        Camera2ErrorProcessor camera2ErrorProcessor;
        boolean z;
        Unit unit;
        Camera2ErrorProcessor camera2ErrorProcessor2;
        InputConfiguration inputConfiguration;
        ArrayList arrayList2;
        SessionStateCallback sessionStateCallback;
        Threads threads = this.threads;
        CameraDevice cameraDevice = this.cameraDevice;
        captureSessionState.getClass();
        Pair checkAndSetStateCallback = checkAndSetStateCallback(captureSessionState);
        boolean booleanValue = ((Boolean) checkAndSetStateCallback.first).booleanValue();
        SessionStateCallback sessionStateCallback2 = (SessionStateCallback) checkAndSetStateCallback.second;
        if (!booleanValue) {
            return false;
        }
        if (sessionStateCallback2 != null) {
            onSessionDisconnectedWithTrace(sessionStateCallback2);
        }
        String str = this.cameraId;
        String m = Recorder$$ExternalSyntheticOutline2.m("CXCP#createReprocessableCaptureSessionByConfigurations-", str);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(m);
            Camera2ErrorProcessor camera2ErrorProcessor3 = this.cameraErrorListener;
            try {
                inputConfiguration = new InputConfiguration(inputConfigData.width, inputConfigData.height, inputConfigData.f839format);
                arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        sessionStateCallback = sessionStateCallback2;
                    } catch (Exception e) {
                        e = e;
                        camera2ErrorProcessor = camera2ErrorProcessor3;
                        if (e instanceof CameraAccessException) {
                            Camera2ErrorProcessor camera2ErrorProcessor4 = camera2ErrorProcessor;
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (!(e instanceof IllegalStateException)) {
                                    throw e;
                                }
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            z = false;
                            camera2ErrorProcessor4.m69onCameraError3M5Xam4(str, 9, false);
                            unit = null;
                            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(m, " - ")));
                            if (unit == null) {
                            }
                            if (unit == null) {
                            }
                        } else {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            int i = 3;
                            boolean z2 = true;
                            if (reason != 1) {
                                if (reason == 2) {
                                    i = 6;
                                } else if (reason == 3) {
                                    camera2ErrorProcessor2 = camera2ErrorProcessor;
                                    z2 = true;
                                    i = 0;
                                } else if (reason == 4) {
                                    camera2ErrorProcessor2 = camera2ErrorProcessor;
                                    z2 = true;
                                    i = 1;
                                } else if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                                camera2ErrorProcessor2 = camera2ErrorProcessor;
                                z2 = true;
                            } else {
                                camera2ErrorProcessor2 = camera2ErrorProcessor;
                            }
                            camera2ErrorProcessor2.m69onCameraError3M5Xam4(str, i, z2);
                        }
                        unit = null;
                        z = false;
                        Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(m, " - ")));
                        if (unit == null) {
                        }
                        if (unit == null) {
                        }
                    }
                    try {
                        arrayList2.add((OutputConfiguration) ((AndroidOutputConfiguration) it.next()).unwrapAs(Reflection.factory.getOrCreateKotlinClass(OutputConfiguration.class)));
                        sessionStateCallback2 = sessionStateCallback;
                    } catch (Exception e2) {
                        e = e2;
                        camera2ErrorProcessor = camera2ErrorProcessor3;
                        sessionStateCallback2 = sessionStateCallback;
                        if (e instanceof CameraAccessException) {
                        }
                        unit = null;
                        z = false;
                        Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(m, " - ")));
                        if (unit == null) {
                        }
                        if (unit == null) {
                        }
                    }
                }
                sessionStateCallback = sessionStateCallback2;
            } catch (Exception e3) {
                e = e3;
            }
            try {
                camera2ErrorProcessor = camera2ErrorProcessor3;
                sessionStateCallback2 = sessionStateCallback;
            } catch (Exception e4) {
                e = e4;
                camera2ErrorProcessor = camera2ErrorProcessor3;
                sessionStateCallback2 = sessionStateCallback;
                if (e instanceof CameraAccessException) {
                }
                unit = null;
                z = false;
                Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(m, " - ")));
                if (unit == null) {
                }
                if (unit == null) {
                }
            }
            try {
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, arrayList2, new AndroidCaptureSessionStateCallback(this, captureSessionState, sessionStateCallback2, this.cameraErrorListener, this.interopCaptureSessionListener, threads.getCamera2Handler()), threads.getCamera2Handler());
                unit = Unit.INSTANCE;
            } catch (Exception e5) {
                e = e5;
                if (e instanceof CameraAccessException) {
                }
                unit = null;
                z = false;
                Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(m, " - ")));
                if (unit == null) {
                }
                if (unit == null) {
                }
            }
            z = false;
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(m, " - ")));
            if (unit == null) {
                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                if (sessionStateCallback2 != null) {
                    onSessionFinalizedWithTrace(sessionStateCallback2);
                }
            }
            if (unit == null) {
                return true;
            }
            return z;
        } catch (Throwable th) {
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(m, " - ")));
            throw th;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    public final String mo59getCameraIdDz_R5H8() {
        return this.cameraId;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* renamed from: onCameraAudioRestrictionUpdated-LwUUkyU, reason: not valid java name */
    public final void mo60onCameraAudioRestrictionUpdatedLwUUkyU(int i) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String str = this.cameraId;
            Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
            try {
                Api30Compat.setCameraAudioRestriction(this.cameraDevice, i);
            } catch (Exception e) {
                int i2 = 0;
                if (e instanceof CameraAccessException) {
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i2 = 3;
                    } else if (reason == 2) {
                        i2 = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i2 = 1;
                        } else if (reason != 5) {
                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i2 = 11;
                        } else {
                            i2 = 2;
                        }
                    }
                    camera2ErrorProcessor.m69onCameraError3M5Xam4(str, i2, true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    camera2ErrorProcessor.m69onCameraError3M5Xam4(str, 9, false);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final void onDeviceClosed() {
        if (!this.closed.getValue()) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return;
        }
        AtomicRef atomicRef = this._lastStateCallback;
        atomicRef.getClass();
        SessionStateCallback sessionStateCallback = (SessionStateCallback) AtomicRef.FU.getAndSet(atomicRef, null);
        if (sessionStateCallback != null) {
            onSessionFinalizedWithTrace(sessionStateCallback);
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final void onDeviceClosing() {
        SessionStateCallback sessionStateCallback;
        if (!this.closed.compareAndSet() || (sessionStateCallback = (SessionStateCallback) this._lastStateCallback.value) == null) {
            return;
        }
        onSessionDisconnectedWithTrace(sessionStateCallback);
    }

    public final void onSessionDisconnectedWithTrace(SessionStateCallback sessionStateCallback) {
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            sessionStateCallback.onSessionDisconnected();
        } finally {
            Trace.endSection();
        }
    }

    public final void onSessionFinalizedWithTrace(SessionStateCallback sessionStateCallback) {
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            sessionStateCallback.onSessionFinalized();
        } finally {
            Trace.endSection();
        }
    }

    public final String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) CameraId.m46toStringimpl(this.cameraId)) + ')';
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        if (kClass.equals(Reflection.factory.getOrCreateKotlinClass(CameraDevice.class))) {
            return this.cameraDevice;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0159  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean createCaptureSession(List list, CaptureSessionState captureSessionState) {
        String str;
        ?? r9;
        String str2;
        String str3;
        SessionStateCallback sessionStateCallback;
        boolean z;
        boolean z2;
        Unit unit;
        boolean z3;
        Threads threads = this.threads;
        CameraDevice cameraDevice = this.cameraDevice;
        list.getClass();
        captureSessionState.getClass();
        Pair checkAndSetStateCallback = checkAndSetStateCallback(captureSessionState);
        boolean booleanValue = ((Boolean) checkAndSetStateCallback.first).booleanValue();
        SessionStateCallback sessionStateCallback2 = (SessionStateCallback) checkAndSetStateCallback.second;
        if (!booleanValue) {
            return false;
        }
        if (sessionStateCallback2 != null) {
            onSessionDisconnectedWithTrace(sessionStateCallback2);
        }
        String str4 = this.cameraId;
        String m = Recorder$$ExternalSyntheticOutline2.m("CXCP#createCaptureSession-", str4);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(m);
                Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
                try {
                    sessionStateCallback = sessionStateCallback2;
                    try {
                        Camera2ErrorProcessor camera2ErrorProcessor2 = this.cameraErrorListener;
                        Recorder.AnonymousClass4 anonymousClass4 = this.interopCaptureSessionListener;
                        try {
                            Handler camera2Handler = threads.getCamera2Handler();
                            str3 = m;
                            z = true;
                            try {
                                cameraDevice.createCaptureSession(list, new AndroidCaptureSessionStateCallback(this, captureSessionState, sessionStateCallback, camera2ErrorProcessor2, anonymousClass4, camera2Handler), threads.getCamera2Handler());
                                unit = Unit.INSTANCE;
                                z2 = false;
                                z3 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i = 6;
                                        } else if (reason == 3) {
                                            i = 0;
                                        } else if (reason == 4) {
                                            i = z ? 1 : 0;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                    camera2ErrorProcessor.m69onCameraError3M5Xam4(str4, i, z);
                                } else {
                                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                        if (e instanceof IllegalStateException) {
                                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                        } else {
                                            throw e;
                                        }
                                    }
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z2 = false;
                                    camera2ErrorProcessor.m69onCameraError3M5Xam4(str4, 9, false);
                                    unit = null;
                                    z3 = z;
                                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, (int) z3, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str3, " - ")));
                                    if (unit == null) {
                                    }
                                    if (unit != null) {
                                    }
                                }
                                z2 = false;
                                unit = null;
                                z3 = z;
                                Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, (int) z3, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str3, " - ")));
                                if (unit == null) {
                                }
                                if (unit != null) {
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = m;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            str2 = m;
                            threads = 1;
                            str = str2;
                            r9 = threads;
                            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, (int) r9, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                        str3 = m;
                    } catch (Throwable th2) {
                        th = th2;
                        threads = 1;
                        str2 = m;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = m;
                    sessionStateCallback = sessionStateCallback2;
                    z = true;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = m;
                    threads = 1;
                }
                Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, (int) z3, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str3, " - ")));
                if (unit == null) {
                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                    if (sessionStateCallback != null) {
                        onSessionFinalizedWithTrace(sessionStateCallback);
                    }
                }
                return unit != null ? z3 : z2;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = m;
            r9 = 1;
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, (int) r9, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str, " - ")));
            throw th;
        }
    }
}
