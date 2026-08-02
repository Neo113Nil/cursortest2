package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.atomicfu.AtomicInt;

/* loaded from: classes3.dex */
public class AndroidCameraCaptureSession implements CameraCaptureSessionWrapper {
    public final Handler callbackHandler;
    public final CameraCaptureSession cameraCaptureSession;
    public final Camera2ErrorProcessor cameraErrorListener;
    public final CameraDeviceWrapper device;

    public AndroidCameraCaptureSession(CameraDeviceWrapper cameraDeviceWrapper, CameraCaptureSession cameraCaptureSession, Camera2ErrorProcessor camera2ErrorProcessor, Handler handler) {
        cameraDeviceWrapper.getClass();
        cameraCaptureSession.getClass();
        camera2ErrorProcessor.getClass();
        handler.getClass();
        this.device = cameraDeviceWrapper;
        this.cameraCaptureSession = cameraCaptureSession;
        this.cameraErrorListener = camera2ErrorProcessor;
        this.callbackHandler = handler;
        AtomicInt atomicInt = CameraInterop.captureSessionIds;
        atomicInt.getClass();
        AtomicInt.FU.incrementAndGet(atomicInt);
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public final boolean abortCaptures() {
        double d;
        Unit unit;
        StringBuilder sb = new StringBuilder("CXCP#abortCaptures-");
        CameraDeviceWrapper cameraDeviceWrapper = this.device;
        sb.append(cameraDeviceWrapper.mo59getCameraIdDz_R5H8());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String mo59getCameraIdDz_R5H8 = cameraDeviceWrapper.mo59getCameraIdDz_R5H8();
            Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
            try {
                this.cameraCaptureSession.abortCaptures();
                unit = Unit.INSTANCE;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i = 3;
                        if (reason != 1) {
                            if (reason == 2) {
                                i = 6;
                            } else if (reason == 3) {
                                i = 0;
                            } else if (reason == 4) {
                                i = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                        }
                        camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, i, true);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, 9, false);
                    }
                    unit = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
            return unit != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public final Integer capture(CaptureRequest captureRequest, Camera2CaptureSequence camera2CaptureSequence) {
        double d;
        Integer num;
        captureRequest.getClass();
        StringBuilder sb = new StringBuilder("CXCP#capture-");
        CameraDeviceWrapper cameraDeviceWrapper = this.device;
        sb.append(cameraDeviceWrapper.mo59getCameraIdDz_R5H8());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String mo59getCameraIdDz_R5H8 = cameraDeviceWrapper.mo59getCameraIdDz_R5H8();
            Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
            try {
                d = 1000000.0d;
                try {
                    try {
                        num = Integer.valueOf(this.cameraCaptureSession.capture(captureRequest, camera2CaptureSequence, this.callbackHandler));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                            camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (!(e instanceof IllegalStateException)) {
                                    throw e;
                                }
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, 9, false);
                        }
                        num = null;
                        Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                        return num;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
            return num;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public final Integer captureBurst(ArrayList arrayList, Camera2CaptureSequence camera2CaptureSequence) {
        double d;
        Integer num;
        arrayList.getClass();
        StringBuilder sb = new StringBuilder("CXCP#captureBurst-");
        CameraDeviceWrapper cameraDeviceWrapper = this.device;
        sb.append(cameraDeviceWrapper.mo59getCameraIdDz_R5H8());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String mo59getCameraIdDz_R5H8 = cameraDeviceWrapper.mo59getCameraIdDz_R5H8();
            Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
            try {
                d = 1000000.0d;
                try {
                    try {
                        num = Integer.valueOf(this.cameraCaptureSession.captureBurst(arrayList, camera2CaptureSequence, this.callbackHandler));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                            camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (!(e instanceof IllegalStateException)) {
                                    throw e;
                                }
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, 9, false);
                        }
                        num = null;
                        Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                        return num;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
            return num;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.cameraCaptureSession.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean finalizeOutputConfigurations(List list) {
        String mo59getCameraIdDz_R5H8;
        Camera2ErrorProcessor camera2ErrorProcessor;
        double d;
        Unit unit;
        CameraCaptureSession cameraCaptureSession;
        List list2;
        list.getClass();
        StringBuilder sb = new StringBuilder("CXCP#finalizeOutputConfigurations-");
        CameraDeviceWrapper cameraDeviceWrapper = this.device;
        sb.append(cameraDeviceWrapper.mo59getCameraIdDz_R5H8());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            mo59getCameraIdDz_R5H8 = cameraDeviceWrapper.mo59getCameraIdDz_R5H8();
            camera2ErrorProcessor = this.cameraErrorListener;
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                cameraCaptureSession = this.cameraCaptureSession;
                list2 = list;
                d = 1000000.0d;
            } catch (Exception e) {
                e = e;
                d = 1000000.0d;
            }
            try {
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((OutputConfiguration) ((AndroidOutputConfiguration) it.next()).unwrapAs(Reflection.factory.getOrCreateKotlinClass(OutputConfiguration.class)));
                }
                cameraCaptureSession.getClass();
                cameraCaptureSession.finalizeOutputConfigurations(arrayList);
                unit = Unit.INSTANCE;
            } catch (Exception e2) {
                e = e2;
                if (e instanceof CameraAccessException) {
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    int i = 3;
                    if (reason != 1) {
                        if (reason == 2) {
                            i = 6;
                        } else if (reason == 3) {
                            i = 0;
                        } else if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, i, true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, 9, false);
                }
                unit = null;
                Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                if (unit == null) {
                }
            }
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
            return unit == null;
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
            throw th;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public final CameraDeviceWrapper getDevice() {
        return this.device;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public final Surface getInputSurface() {
        return this.cameraCaptureSession.getInputSurface();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public final Integer setRepeatingBurst(ArrayList arrayList, Camera2CaptureSequence camera2CaptureSequence) {
        double d;
        Integer num;
        arrayList.getClass();
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingBurst-");
        CameraDeviceWrapper cameraDeviceWrapper = this.device;
        sb.append(cameraDeviceWrapper.mo59getCameraIdDz_R5H8());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String mo59getCameraIdDz_R5H8 = cameraDeviceWrapper.mo59getCameraIdDz_R5H8();
            Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
            try {
                d = 1000000.0d;
                try {
                    try {
                        num = Integer.valueOf(this.cameraCaptureSession.setRepeatingBurst(arrayList, camera2CaptureSequence, this.callbackHandler));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                            camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (!(e instanceof IllegalStateException)) {
                                    throw e;
                                }
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, 9, false);
                        }
                        num = null;
                        Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                        return num;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
            return num;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public final Integer setRepeatingRequest(CaptureRequest captureRequest, Camera2CaptureSequence camera2CaptureSequence) {
        double d;
        Integer num;
        captureRequest.getClass();
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingRequest-");
        CameraDeviceWrapper cameraDeviceWrapper = this.device;
        sb.append(cameraDeviceWrapper.mo59getCameraIdDz_R5H8());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String mo59getCameraIdDz_R5H8 = cameraDeviceWrapper.mo59getCameraIdDz_R5H8();
            Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
            try {
                d = 1000000.0d;
                try {
                    try {
                        num = Integer.valueOf(this.cameraCaptureSession.setRepeatingRequest(captureRequest, camera2CaptureSequence, this.callbackHandler));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                            camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (!(e instanceof IllegalStateException)) {
                                    throw e;
                                }
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, 9, false);
                        }
                        num = null;
                        Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                        return num;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
            return num;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public final boolean stopRepeating() {
        double d;
        Unit unit;
        StringBuilder sb = new StringBuilder("CXCP#stopRepeating-");
        CameraDeviceWrapper cameraDeviceWrapper = this.device;
        sb.append(cameraDeviceWrapper.mo59getCameraIdDz_R5H8());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String mo59getCameraIdDz_R5H8 = cameraDeviceWrapper.mo59getCameraIdDz_R5H8();
            Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
            try {
                this.cameraCaptureSession.stopRepeating();
                unit = Unit.INSTANCE;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i = 3;
                        if (reason != 1) {
                            if (reason == 2) {
                                i = 6;
                            } else if (reason == 3) {
                                i = 0;
                            } else if (reason == 4) {
                                i = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                        }
                        camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, i, true);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        camera2ErrorProcessor.m69onCameraError3M5Xam4(mo59getCameraIdDz_R5H8, 9, false);
                    }
                    unit = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(sb2, " - ")));
            return unit != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public Object unwrapAs(KClass kClass) {
        kClass.getClass();
        if (kClass.equals(Reflection.factory.getOrCreateKotlinClass(CameraCaptureSession.class))) {
            return this.cameraCaptureSession;
        }
        return null;
    }
}
