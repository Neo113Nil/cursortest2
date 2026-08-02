package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Handler;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.InputRequest;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream$StreamUseCase;
import androidx.camera.camera2.pipe.OutputStream$StreamUseHint;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.media.AndroidImageWriter;
import androidx.camera.camera2.pipe.media.ImageWrapper;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.swampgl.components.Scene;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.atomicfu.AtomicLong;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import string.ReplaceModeKt;

/* loaded from: classes3.dex */
public final class Camera2CaptureSequenceProcessor {
    public final boolean awaitRepeatingRequestOnDisconnect;
    public final int debugId;
    public boolean disconnected;
    public final AndroidImageWriter imageWriter;
    public Camera2CaptureSequence lastSingleRepeatingRequestSequence;
    public final Object lock;
    public final Map outputToSurfaceMap;
    public final CameraCaptureSessionWrapper session;
    public final StreamGraphImpl streamGraph;
    public final Map streamToSurfaceMap;
    public final StrictMode strictMode;
    public final int template;
    public final Threads threads;

    public Camera2CaptureSequenceProcessor(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, Threads threads, int i, Map map, Map map2, StreamGraphImpl streamGraphImpl, StrictMode strictMode, boolean z) {
        cameraCaptureSessionWrapper.getClass();
        threads.getClass();
        map.getClass();
        map2.getClass();
        strictMode.getClass();
        this.session = cameraCaptureSessionWrapper;
        this.threads = threads;
        this.template = i;
        this.streamToSurfaceMap = map;
        this.outputToSurfaceMap = map2;
        this.streamGraph = streamGraphImpl;
        this.strictMode = strictMode;
        this.awaitRepeatingRequestOnDisconnect = z;
        AtomicInt atomicInt = Camera2CaptureSequenceProcessorKt.captureSequenceProcessorDebugIds;
        atomicInt.getClass();
        this.debugId = AtomicInt.FU.incrementAndGet(atomicInt);
        this.lock = new Object();
        List list = streamGraphImpl.inputs;
        AndroidImageWriter androidImageWriter = null;
        if (!list.isEmpty()) {
            StreamGraphImpl.InputStreamImpl inputStreamImpl = (StreamGraphImpl.InputStreamImpl) CollectionsKt.first(list);
            Surface inputSurface = cameraCaptureSessionWrapper.getInputSurface();
            if (inputSurface == null) {
                a$$ExternalSyntheticBUOutline0.m$1("inputSurface is required to create instance of imageWriter.");
                throw null;
            }
            try {
                int i2 = inputStreamImpl.id;
                int i3 = inputStreamImpl.f840format;
                Handler camera2Handler = threads.getCamera2Handler();
                camera2Handler.getClass();
                ImageWriter newInstance = ImageWriter.newInstance(inputSurface, 1, i3);
                newInstance.getClass();
                AndroidImageWriter androidImageWriter2 = new AndroidImageWriter(newInstance, i2);
                newInstance.setOnImageReleasedListener(androidImageWriter2, camera2Handler);
                androidImageWriter = androidImageWriter2;
            } catch (RuntimeException e) {
                Log.e("CXCP", "Failed to create ImageWriter for session " + this.session + "! Reprocessing will not be supported!", e);
            }
            if (androidImageWriter != null) {
                Log.d("CXCP", "Created ImageWriter " + androidImageWriter + " for session " + this.session);
            }
        }
        this.imageWriter = androidImageWriter;
    }

    public static final void access$awaitRepeatingRequestStarted(Camera2CaptureSequenceProcessor camera2CaptureSequenceProcessor, Camera2CaptureSequence camera2CaptureSequence) {
        Log.d("CXCP", "Waiting for the last repeating request sequence: " + camera2CaptureSequence);
        if (((Unit) camera2CaptureSequenceProcessor.threads.runBlockingCheckedOrNull(2000L, new Scene.AnonymousClass1(camera2CaptureSequence, (Continuation) null, 3))) == null) {
            Log.e("CXCP", camera2CaptureSequenceProcessor + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + camera2CaptureSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0694 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Camera2CaptureSequence build$1(boolean z, List list, Map map, Map map2, Map map3, Toolbar.AnonymousClass1 anonymousClass1, List list2) {
        CaptureRequest.Builder mo58createCaptureRequest2PPcXtw;
        ArrayMap arrayMap;
        ArrayMap arrayMap2;
        Iterator it;
        Iterator it2;
        boolean m51equalsimpl0;
        long j;
        boolean m52equalsimpl0;
        boolean isTerminated;
        Image image;
        boolean z2;
        List list3;
        Iterator it3;
        ArrayList arrayList;
        boolean m51equalsimpl02;
        boolean z3;
        boolean z4;
        list.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        anonymousClass1.getClass();
        list2.getClass();
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        ArrayMap arrayMap5 = new ArrayMap();
        CameraCaptureSessionWrapper cameraCaptureSessionWrapper = this.session;
        StreamGraphImpl streamGraphImpl = this.streamGraph;
        List list4 = list;
        if (list4.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$1("build(...) should never be called with an empty request list!");
            return null;
        }
        if (cameraCaptureSessionWrapper instanceof AndroidCameraConstrainedHighSpeedCaptureSession) {
            Iterator it4 = list.iterator();
            Boolean bool = null;
            Boolean bool2 = null;
            while (it4.hasNext()) {
                Request request = (Request) it4.next();
                List list5 = request.streams;
                Iterator it5 = it4;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    Iterator it6 = list5.iterator();
                    while (it6.hasNext()) {
                        ((StreamId) it6.next()).getClass();
                        ArrayList arrayList4 = streamGraphImpl.outputs;
                        if (arrayList4 == null || !arrayList4.isEmpty()) {
                            Iterator it7 = arrayList4.iterator();
                            while (it7.hasNext()) {
                                Iterator it8 = it6;
                                StreamGraphImpl.OutputStreamImpl outputStreamImpl = (StreamGraphImpl.OutputStreamImpl) it7.next();
                                list3 = list4;
                                OutputStream$StreamUseCase outputStream$StreamUseCase = outputStreamImpl.streamUseCase;
                                OutputStream$StreamUseHint outputStream$StreamUseHint = outputStreamImpl.streamUseHint;
                                if (outputStream$StreamUseCase == null) {
                                    it3 = it7;
                                    arrayList = arrayList2;
                                    m51equalsimpl02 = false;
                                } else {
                                    it3 = it7;
                                    arrayList = arrayList2;
                                    m51equalsimpl02 = OutputStream$StreamUseCase.m51equalsimpl0(outputStream$StreamUseCase.value, 1L);
                                }
                                if (!m51equalsimpl02) {
                                    if (!(outputStream$StreamUseHint == null ? false : OutputStream$StreamUseHint.m52equalsimpl0(outputStream$StreamUseHint.value, 0L)) && outputStream$StreamUseHint != null) {
                                        list4 = list3;
                                        it6 = it8;
                                        arrayList2 = arrayList;
                                        it7 = it3;
                                    }
                                }
                                z3 = true;
                            }
                        }
                        list4 = list4;
                        it6 = it6;
                        arrayList2 = arrayList2;
                    }
                }
                list3 = list4;
                arrayList = arrayList2;
                z3 = false;
                Boolean valueOf = Boolean.valueOf(z3);
                if (bool2 != null && !bool2.equals(valueOf)) {
                    Log.e("CXCP", "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: " + bool2.booleanValue() + ". Current request contains preview stream use case or hint: " + z3 + '.');
                }
                List list6 = request.streams;
                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                    Iterator it9 = list6.iterator();
                    while (it9.hasNext()) {
                        ((StreamId) it9.next()).getClass();
                        ArrayList arrayList5 = streamGraphImpl.outputs;
                        if (arrayList5 == null || !arrayList5.isEmpty()) {
                            Iterator it10 = arrayList5.iterator();
                            while (it10.hasNext()) {
                                StreamGraphImpl.OutputStreamImpl outputStreamImpl2 = (StreamGraphImpl.OutputStreamImpl) it10.next();
                                OutputStream$StreamUseCase outputStream$StreamUseCase2 = outputStreamImpl2.streamUseCase;
                                if (!(outputStream$StreamUseCase2 == null ? false : OutputStream$StreamUseCase.m51equalsimpl0(outputStream$StreamUseCase2.value, 3L))) {
                                    OutputStream$StreamUseHint outputStream$StreamUseHint2 = outputStreamImpl2.streamUseHint;
                                    if (outputStream$StreamUseHint2 == null ? false : OutputStream$StreamUseHint.m52equalsimpl0(outputStream$StreamUseHint2.value, 1L)) {
                                    }
                                }
                                z4 = true;
                            }
                        }
                    }
                }
                z4 = false;
                Boolean valueOf2 = Boolean.valueOf(z4);
                if (bool != null && !bool.equals(valueOf2)) {
                    Log.e("CXCP", "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: " + bool.booleanValue() + ". Current request contains video stream use case: " + z4 + '.');
                }
                ArrayList arrayList6 = streamGraphImpl.outputs;
                if (arrayList6 == null || !arrayList6.isEmpty()) {
                    Iterator it11 = arrayList6.iterator();
                    while (it11.hasNext()) {
                        if (!((StreamGraphImpl.OutputStreamImpl) it11.next()).isValidForHighSpeedOperatingMode()) {
                            Log.e("CXCP", "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are " + streamGraphImpl.outputs);
                            return null;
                        }
                    }
                }
                bool2 = valueOf;
                bool = valueOf2;
                it4 = it5;
                list4 = list3;
                arrayList2 = arrayList;
            }
        }
        ArrayList arrayList7 = arrayList2;
        if (list4.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$1("build(...) should never be called with an empty request list!");
            return null;
        }
        Iterator it12 = list.iterator();
        do {
            char c = '!';
            if (!it12.hasNext()) {
                Iterator it13 = list.iterator();
                while (it13.hasNext()) {
                    Request request2 = (Request) it13.next();
                    Log.d("CXCP", "Building CaptureRequest for " + request2);
                    RequestTemplate requestTemplate = request2.template;
                    int i = requestTemplate != null ? requestTemplate.value : this.template;
                    CameraCaptureSessionWrapper cameraCaptureSessionWrapper2 = this.session;
                    InputRequest inputRequest = request2.inputRequest;
                    if (inputRequest != null) {
                        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) inputRequest.frameInfo.unwrapAs(Reflection.factory.getOrCreateKotlinClass(TotalCaptureResult.class));
                        if (totalCaptureResult == null) {
                            Handlers$$ExternalSyntheticBUOutline0.m("Failed to unwrap FrameInfo ", inputRequest.frameInfo, " as TotalCaptureResult");
                            return null;
                        }
                        mo58createCaptureRequest2PPcXtw = cameraCaptureSessionWrapper2.getDevice().createReprocessCaptureRequest(totalCaptureResult);
                    } else {
                        mo58createCaptureRequest2PPcXtw = cameraCaptureSessionWrapper2.getDevice().mo58createCaptureRequest2PPcXtw(i);
                    }
                    if (mo58createCaptureRequest2PPcXtw == null) {
                        if (inputRequest != null) {
                            Log.i("CXCP", "Failed to create a ReprocessingCaptureRequest.Builder from " + inputRequest.frameInfo + c);
                        } else {
                            Log.i("CXCP", "Failed to create a CaptureRequest.Builder from " + ((Object) RequestTemplate.m54toStringimpl(i)) + c);
                        }
                        mo58createCaptureRequest2PPcXtw = null;
                    }
                    if (mo58createCaptureRequest2PPcXtw == null) {
                        return null;
                    }
                    Metadata.Key key = CameraPipeKeys.camera2CaptureRequestTag;
                    Map map4 = map3;
                    Object obj = map4.get(key);
                    if (obj == null) {
                        obj = map.get(key);
                    }
                    mo58createCaptureRequest2PPcXtw.setTag(obj);
                    int size = request2.streams.size();
                    boolean z5 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        Surface surface = (Surface) arrayMap5.get(request2.streams.get(i2));
                        if (surface != null) {
                            mo58createCaptureRequest2PPcXtw.addTarget(surface);
                            z5 = true;
                        }
                    }
                    if (!z5) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return null;
                    }
                    InputRequest inputRequest2 = request2.inputRequest;
                    if (inputRequest2 == null) {
                        ReplaceModeKt.writeParameters(mo58createCaptureRequest2PPcXtw, map);
                        ReplaceModeKt.writeParameters(mo58createCaptureRequest2PPcXtw, map2);
                        ReplaceModeKt.writeParameters(mo58createCaptureRequest2PPcXtw, request2.parameters);
                        ReplaceModeKt.writeParameters(mo58createCaptureRequest2PPcXtw, map4);
                    } else {
                        if (this.imageWriter == null) {
                            Log.e("CXCP", "Failed to queue request to ImageWriter - No ImageWriter available!");
                            return null;
                        }
                        ImageWrapper imageWrapper = inputRequest2.image;
                        synchronized (this.lock) {
                            if (this.disconnected) {
                                Log.w("CXCP", this + " disconnected. " + imageWrapper + " can't be queued to " + this.imageWriter);
                                return null;
                            }
                            Log.d("CXCP", "Queuing image " + imageWrapper + " for reprocessing to ImageWriter " + this.imageWriter);
                            AndroidImageWriter androidImageWriter = this.imageWriter;
                            androidImageWriter.getClass();
                            try {
                                image = (Image) imageWrapper.unwrapAs(Reflection.factory.getOrCreateKotlinClass(Image.class));
                            } catch (Throwable th) {
                                Log.w("CXCP", "Failed to queue image to " + androidImageWriter + " due to error " + th.getMessage() + ". Ignoring failure and closing " + imageWrapper);
                                if (imageWrapper instanceof AutoCloseable) {
                                    imageWrapper.close();
                                } else {
                                    if (!(imageWrapper instanceof ExecutorService)) {
                                        Path$$ExternalSyntheticBUOutline0.m$3();
                                        return null;
                                    }
                                    ExecutorService executorService = (ExecutorService) imageWrapper;
                                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z6 = false;
                                        while (!isTerminated) {
                                            try {
                                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z6) {
                                                    executorService.shutdownNow();
                                                    z6 = true;
                                                }
                                            }
                                        }
                                        if (z6) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                }
                            }
                            if (image == null) {
                                Log.w("CXCP", "Failed to unwrap image wrapper " + imageWrapper);
                                Log.d("CXCP", "Failed to queue image " + imageWrapper + " for reprocessing to ImageWriter " + this.imageWriter);
                                return null;
                            }
                            androidImageWriter.imageWriter.queueInputImage(image);
                            ReplaceModeKt.writeParameters(mo58createCaptureRequest2PPcXtw, request2.parameters);
                        }
                    }
                    AtomicLong atomicLong = Camera2CaptureSequenceProcessorKt.requestTags;
                    atomicLong.getClass();
                    long incrementAndGet = AtomicLong.FU.incrementAndGet(atomicLong);
                    CaptureRequest build = mo58createCaptureRequest2PPcXtw.build();
                    build.getClass();
                    CameraCaptureSessionWrapper cameraCaptureSessionWrapper3 = this.session;
                    if (cameraCaptureSessionWrapper3 instanceof AndroidCameraConstrainedHighSpeedCaptureSession) {
                        AndroidCameraConstrainedHighSpeedCaptureSession androidCameraConstrainedHighSpeedCaptureSession = (AndroidCameraConstrainedHighSpeedCaptureSession) cameraCaptureSessionWrapper3;
                        CameraDeviceWrapper cameraDeviceWrapper = androidCameraConstrainedHighSpeedCaptureSession.device;
                        arrayMap = arrayMap4;
                        try {
                            Trace.beginSection("CXCP#createHighSpeedRequestList");
                            List<CaptureRequest> list7 = androidCameraConstrainedHighSpeedCaptureSession.session.createHighSpeedRequestList(build);
                            try {
                                Trace.endSection();
                            } catch (IllegalArgumentException unused2) {
                                Log.w("CXCP", "Failed to createHighSpeedRequestList from " + cameraDeviceWrapper + " because the output surface was destroyed before calling createHighSpeedRequestList.");
                                list7 = null;
                                if (list7 != null) {
                                }
                            } catch (IllegalStateException unused3) {
                                Log.w("CXCP", "Failed to createHighSpeedRequestList. " + cameraDeviceWrapper + " may be closed.");
                                list7 = null;
                                if (list7 != null) {
                                }
                            } catch (UnsupportedOperationException unused4) {
                                Log.w("CXCP", "Failed to createHighSpeedRequestList from " + cameraDeviceWrapper + " because the output surface was not available.");
                                list7 = null;
                                if (list7 != null) {
                                }
                            }
                            if (list7 != null) {
                                return null;
                            }
                            List list8 = request2.streams;
                            if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                                Iterator it14 = list8.iterator();
                                while (it14.hasNext()) {
                                    ((StreamId) it14.next()).getClass();
                                    ArrayList arrayList8 = this.streamGraph.outputs;
                                    if (arrayList8 == null || !arrayList8.isEmpty()) {
                                        Iterator it15 = arrayList8.iterator();
                                        while (it15.hasNext()) {
                                            StreamGraphImpl.OutputStreamImpl outputStreamImpl3 = (StreamGraphImpl.OutputStreamImpl) it15.next();
                                            OutputStream$StreamUseCase outputStream$StreamUseCase3 = outputStreamImpl3.streamUseCase;
                                            if (outputStream$StreamUseCase3 == null) {
                                                it = it14;
                                                it2 = it15;
                                                m51equalsimpl0 = false;
                                            } else {
                                                it = it14;
                                                it2 = it15;
                                                m51equalsimpl0 = OutputStream$StreamUseCase.m51equalsimpl0(outputStream$StreamUseCase3.value, 3L);
                                            }
                                            if (m51equalsimpl0) {
                                                j = 1;
                                            } else {
                                                OutputStream$StreamUseHint outputStream$StreamUseHint3 = outputStreamImpl3.streamUseHint;
                                                if (outputStream$StreamUseHint3 == null) {
                                                    m52equalsimpl0 = false;
                                                    j = 1;
                                                } else {
                                                    j = 1;
                                                    m52equalsimpl0 = OutputStream$StreamUseHint.m52equalsimpl0(outputStream$StreamUseHint3.value, 1L);
                                                }
                                                if (!m52equalsimpl0) {
                                                    it14 = it;
                                                    it15 = it2;
                                                }
                                            }
                                            int size2 = list7.size();
                                            int i3 = 0;
                                            while (i3 < size2) {
                                                int i4 = size2;
                                                int i5 = i3;
                                                Camera2RequestMetadata camera2RequestMetadata = new Camera2RequestMetadata(this.session, list7.get(i3), map, map2, map4, arrayMap5, z, request2, incrementAndGet);
                                                arrayList3.add(list7.get(i5));
                                                arrayList7.add(camera2RequestMetadata);
                                                i3 = i5 + 1;
                                                size2 = i4;
                                                map4 = map3;
                                                arrayMap3 = arrayMap3;
                                                j = j;
                                            }
                                            arrayMap2 = arrayMap3;
                                        }
                                    }
                                    it14 = it14;
                                    map4 = map3;
                                    arrayList7 = arrayList7;
                                    arrayMap3 = arrayMap3;
                                }
                            }
                            arrayMap2 = arrayMap3;
                            arrayList7 = arrayList7;
                            Camera2RequestMetadata camera2RequestMetadata2 = new Camera2RequestMetadata(this.session, list7.get(0), map, map2, map3, arrayMap5, z, request2, incrementAndGet);
                            arrayList3.add(list7.get(0));
                            arrayList7.add(camera2RequestMetadata2);
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    } else {
                        arrayMap = arrayMap4;
                        arrayMap2 = arrayMap3;
                        Camera2RequestMetadata camera2RequestMetadata3 = new Camera2RequestMetadata(cameraCaptureSessionWrapper3, build, map, map2, map3, arrayMap5, z, request2, incrementAndGet);
                        arrayList3.add(build);
                        arrayList7.add(camera2RequestMetadata3);
                    }
                    arrayMap3 = arrayMap2;
                    arrayMap4 = arrayMap;
                    c = '!';
                }
                return new Camera2CaptureSequence(this.session.getDevice().mo59getCameraIdDz_R5H8(), z, arrayList3, arrayList7, list2, anonymousClass1, arrayMap3, arrayMap4, this.streamGraph, this.strictMode);
            }
            Request request3 = (Request) it12.next();
            Iterator it16 = request3.streams.iterator();
            z2 = false;
            while (it16.hasNext()) {
                int i6 = ((StreamId) it16.next()).value;
                if (!arrayMap5.containsKey(new StreamId(i6))) {
                    Surface surface2 = (Surface) this.streamToSurfaceMap.get(new StreamId(i6));
                    if (surface2 != null) {
                        arrayMap3.put(surface2, new StreamId(i6));
                        arrayMap5.put(new StreamId(i6), surface2);
                        CameraStream m89getaKI5c8E = this.streamGraph.m89getaKI5c8E(i6);
                        if (m89getaKI5c8E == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                            return null;
                        }
                        Iterator it17 = m89getaKI5c8E.outputs.iterator();
                        while (it17.hasNext()) {
                            StreamGraphImpl.OutputStreamImpl outputStreamImpl4 = (StreamGraphImpl.OutputStreamImpl) it17.next();
                            Object obj2 = this.outputToSurfaceMap.get(new OutputId(outputStreamImpl4.id));
                            if (obj2 == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                                return null;
                            }
                            arrayMap4.put((Surface) obj2, new OutputId(outputStreamImpl4.id));
                        }
                    } else {
                        continue;
                    }
                }
                z2 = true;
            }
            if (!z2) {
                Log.i("CXCP", "  Failed to bind any surfaces for " + request3 + '!');
                return null;
            }
        } while (z2);
        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        return null;
    }

    public final void disconnect$camera_camera2_pipe() {
        Camera2CaptureSequence camera2CaptureSequence;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.lock) {
                try {
                    if (this.disconnected) {
                        camera2CaptureSequence = null;
                    } else {
                        this.disconnected = true;
                        AndroidImageWriter androidImageWriter = this.imageWriter;
                        if (androidImageWriter != null) {
                            CameraState$Type$EnumUnboxingLocalUtility.m(androidImageWriter);
                        }
                        Surface inputSurface = this.session.getInputSurface();
                        if (inputSurface != null) {
                            inputSurface.release();
                        }
                        camera2CaptureSequence = this.lastSingleRepeatingRequestSequence;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.awaitRepeatingRequestOnDisconnect && camera2CaptureSequence != null) {
                access$awaitRepeatingRequestStarted(this, camera2CaptureSequence);
            }
        } finally {
            Trace.endSection();
        }
    }

    public final Integer submit$1(Camera2CaptureSequence camera2CaptureSequence) {
        Integer repeatingBurst;
        synchronized (this.lock) {
            if (this.disconnected) {
                Log.w("CXCP", this + " disconnected. " + camera2CaptureSequence + " won't be submitted");
                return null;
            }
            if (camera2CaptureSequence.captureRequestList.size() == 1) {
                CameraCaptureSessionWrapper cameraCaptureSessionWrapper = this.session;
                if (!(cameraCaptureSessionWrapper instanceof AndroidCameraConstrainedHighSpeedCaptureSession)) {
                    if (camera2CaptureSequence.repeating) {
                        if (this.awaitRepeatingRequestOnDisconnect) {
                            this.lastSingleRepeatingRequestSequence = camera2CaptureSequence;
                        }
                        repeatingBurst = cameraCaptureSessionWrapper.setRepeatingRequest((CaptureRequest) camera2CaptureSequence.captureRequestList.get(0), camera2CaptureSequence);
                    } else {
                        repeatingBurst = cameraCaptureSessionWrapper.capture((CaptureRequest) camera2CaptureSequence.captureRequestList.get(0), camera2CaptureSequence);
                    }
                    return repeatingBurst;
                }
            }
            boolean z = camera2CaptureSequence.repeating;
            CameraCaptureSessionWrapper cameraCaptureSessionWrapper2 = this.session;
            ArrayList arrayList = camera2CaptureSequence.captureRequestList;
            repeatingBurst = z ? cameraCaptureSessionWrapper2.setRepeatingBurst(arrayList, camera2CaptureSequence) : cameraCaptureSessionWrapper2.captureBurst(arrayList, camera2CaptureSequence);
            return repeatingBurst;
        }
    }

    public final String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.debugId;
    }
}
