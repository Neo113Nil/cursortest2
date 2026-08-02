package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraControls3A;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FlashMode;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.InputRequest;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.camera.camera2.pipe.core.MutexToken;
import androidx.camera.camera2.pipe.graph.GraphCommand;
import androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl;
import androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda5;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class CameraGraphSessionImpl implements CameraControls3A, AutoCloseable {
    public final Controller3A controller3A;
    public final int debugId;
    public final GraphProcessorImpl graphProcessor;
    public final CameraGraphRequestListenersImpl listeners;
    public final CameraGraphParametersImpl parameters;
    public final MutexToken token;

    public CameraGraphSessionImpl(MutexToken mutexToken, GraphProcessorImpl graphProcessorImpl, Controller3A controller3A, FrameCaptureQueue frameCaptureQueue, CameraGraphParametersImpl cameraGraphParametersImpl, CameraGraphRequestListenersImpl cameraGraphRequestListenersImpl) {
        mutexToken.getClass();
        graphProcessorImpl.getClass();
        controller3A.getClass();
        frameCaptureQueue.getClass();
        cameraGraphParametersImpl.getClass();
        cameraGraphRequestListenersImpl.getClass();
        this.token = mutexToken;
        this.graphProcessor = graphProcessorImpl;
        this.controller3A = controller3A;
        this.parameters = cameraGraphParametersImpl;
        this.listeners = cameraGraphRequestListenersImpl;
        AtomicInt atomicInt = CameraGraphSessionImplKt.cameraGraphSessionIds;
        atomicInt.getClass();
        this.debugId = AtomicInt.FU.incrementAndGet(atomicInt);
    }

    /* renamed from: lock3A--tS25XM$default, reason: not valid java name */
    public static Object m84lock3AtS25XM$default(CameraGraphSessionImpl cameraGraphSessionImpl, List list, List list2, List list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, SliderKt$$ExternalSyntheticLambda5 sliderKt$$ExternalSyntheticLambda5, long j, long j2, ContinuationImpl continuationImpl, int i) {
        List list4 = (i & 8) != 0 ? null : list;
        List list5 = (i & 16) != 0 ? null : list2;
        List list6 = (i & 32) != 0 ? null : list3;
        AeMode aeMode2 = (i & 512) != 0 ? null : aeMode;
        SliderKt$$ExternalSyntheticLambda5 sliderKt$$ExternalSyntheticLambda52 = (i & 1024) != 0 ? null : sliderKt$$ExternalSyntheticLambda5;
        if (!cameraGraphSessionImpl.token.getReleased()) {
            return cameraGraphSessionImpl.controller3A.m86lock3AQz1gx5w(list4, list5, list6, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode2, sliderKt$$ExternalSyntheticLambda52, 60, new Long(j), new Long(j2), continuationImpl);
        }
        Handlers$$ExternalSyntheticBUOutline0.m("Cannot call lock3A on ", cameraGraphSessionImpl, " after close.");
        return null;
    }

    public static CompletableDeferredImpl lock3AForCapture$default(CameraGraphSessionImpl cameraGraphSessionImpl, final boolean z, final boolean z2, long j) {
        if (cameraGraphSessionImpl.token.getReleased()) {
            Handlers$$ExternalSyntheticBUOutline0.m("Cannot call lock3AForCapture on ", cameraGraphSessionImpl, " after close.");
            return null;
        }
        Controller3A controller3A = cameraGraphSessionImpl.controller3A;
        controller3A.getClass();
        Map map = Controller3A.parametersForAePrecaptureAndAfTrigger;
        Map map2 = z ? map : Controller3A.parametersForAePrecapture;
        Function1 function1 = new Function1() { // from class: androidx.camera.camera2.pipe.graph.Controller3A$$ExternalSyntheticLambda0
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
            
                if ((r3 != null ? androidx.camera.camera2.pipe.graph.Controller3A.aePostPrecaptureStateList.contains(r3) : true) != false) goto L27;
             */
            /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                Object obj2;
                AndroidFrameMetadata androidFrameMetadata = (AndroidFrameMetadata) obj;
                androidFrameMetadata.getClass();
                CaptureResult.Key key = CaptureResult.CONTROL_AF_MODE;
                key.getClass();
                Integer num = (Integer) androidFrameMetadata.get(key);
                if (num != null) {
                    int intValue = num.intValue();
                    List list = AfMode.values;
                    if (intValue != 0) {
                        if (z) {
                            CaptureResult.Key key2 = CaptureResult.CONTROL_AF_STATE;
                            key2.getClass();
                            Object obj3 = androidFrameMetadata.get(key2);
                            List list2 = Controller3A.afLockedStateList;
                            if (obj3 != null) {
                                z3 = list2.contains(obj3);
                            }
                        } else if (intValue == 3 || intValue == 4) {
                            List list3 = Controller3A.afConvergedStateList;
                            CaptureResult.Key key3 = CaptureResult.CONTROL_AF_STATE;
                            key3.getClass();
                            z3 = CollectionsKt.contains(list3, androidFrameMetadata.get(key3));
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                CaptureResult.Key key4 = CaptureResult.CONTROL_AE_MODE;
                key4.getClass();
                Integer num2 = (Integer) androidFrameMetadata.get(key4);
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    List list4 = AeMode.values;
                    if (intValue2 != 0) {
                        CaptureResult.Key key5 = CaptureResult.CONTROL_AE_STATE;
                        key5.getClass();
                        Object obj4 = androidFrameMetadata.get(key5);
                    }
                    z4 = true;
                    CaptureResult.Key key6 = CaptureResult.CONTROL_AWB_MODE;
                    key6.getClass();
                    Integer num3 = (Integer) androidFrameMetadata.get(key6);
                    int intValue3 = num3 == null ? num3.intValue() : 0;
                    List list5 = AwbMode.values;
                    z5 = z2;
                    if (z5 || num3 != null) {
                        if (z5 && intValue3 != 0) {
                            CaptureResult.Key key7 = CaptureResult.CONTROL_AWB_STATE;
                            key7.getClass();
                            obj2 = androidFrameMetadata.get(key7);
                            List list6 = Controller3A.awbPostPrecaptureStateList;
                            if (obj2 != null) {
                                z6 = list6.contains(obj2);
                            }
                        }
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    Log.d("CXCP", "lock3AForCapture state " + ((Object) FrameNumber.m47toStringimpl(androidFrameMetadata.captureResult.getFrameNumber())) + ": meetsAeCondition = " + z4 + ", meetsAfCondition = " + z3 + ", meetsAwbCondition = " + z6);
                    return Boolean.valueOf(!z4 && z3 && z6);
                }
                z4 = false;
                CaptureResult.Key key62 = CaptureResult.CONTROL_AWB_MODE;
                key62.getClass();
                Integer num32 = (Integer) androidFrameMetadata.get(key62);
                if (num32 == null) {
                }
                List list52 = AwbMode.values;
                z5 = z2;
                if (z5) {
                }
                if (z5) {
                    CaptureResult.Key key72 = CaptureResult.CONTROL_AWB_STATE;
                    key72.getClass();
                    obj2 = androidFrameMetadata.get(key72);
                    List list62 = Controller3A.awbPostPrecaptureStateList;
                    if (obj2 != null) {
                    }
                }
                z6 = true;
                Log.d("CXCP", "lock3AForCapture state " + ((Object) FrameNumber.m47toStringimpl(androidFrameMetadata.captureResult.getFrameNumber())) + ": meetsAeCondition = " + z4 + ", meetsAfCondition = " + z3 + ", meetsAwbCondition = " + z6);
                return Boolean.valueOf(!z4 && z3 && z6);
            }
        };
        Listener3A listener3A = controller3A.graphListener3A;
        CompletableDeferredImpl completableDeferredImpl = Controller3A.deferredResult3ASubmitFailed;
        GraphProcessorImpl graphProcessorImpl = controller3A.graphProcessor;
        if (graphProcessorImpl.graphLoop.getRepeatingRequest() == null) {
            return completableDeferredImpl;
        }
        if (map2 != null) {
            map = map2;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Intrinsics.areEqual(((Map.Entry) it.next()).getValue(), (Object) 1);
        }
        Result3AStateListenerImpl result3AStateListenerImpl = new Result3AStateListenerImpl(function1, 60, Long.valueOf(j));
        listener3A.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = listener3A.listeners;
        copyOnWriteArrayList.add(result3AStateListenerImpl);
        Log.d("CXCP", "lock3AForCapture - sending a request to trigger ae precapture metering and af.");
        if (graphProcessorImpl.trigger(map)) {
            graphProcessorImpl.update3AParameters(controller3A.graphState3A.toCaptureRequestParametersMap());
            return result3AStateListenerImpl._result;
        }
        copyOnWriteArrayList.remove(result3AStateListenerImpl);
        return completableDeferredImpl;
    }

    public static CompletableDeferredImpl unlock3A$default(CameraGraphSessionImpl cameraGraphSessionImpl, long j, int i) {
        Object obj;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = (i & 1) != 0 ? null : bool;
        Boolean bool3 = (i & 4) != 0 ? null : bool;
        long j2 = (i & 32) != 0 ? 3000000000L : j;
        if (cameraGraphSessionImpl.token.getReleased()) {
            Handlers$$ExternalSyntheticBUOutline0.m("Cannot call unlock3A on ", cameraGraphSessionImpl, " after close.");
            return null;
        }
        Controller3A controller3A = cameraGraphSessionImpl.controller3A;
        Long l = new Long(j2);
        CompletableDeferredImpl completableDeferredImpl = Controller3A.deferredResult3ASubmitFailed;
        GraphProcessorImpl graphProcessorImpl = controller3A.graphProcessor;
        CameraMetadata.Companion companion = CameraMetadata.Companion;
        CameraMetadata cameraMetadata = controller3A.metadata;
        companion.getClass();
        Boolean bool4 = !CameraMetadata.Companion.getSupportsAutoFocusTrigger(cameraMetadata) ? null : bool;
        if (!Intrinsics.areEqual(bool2, bool) && !Intrinsics.areEqual(bool4, bool) && !Intrinsics.areEqual(bool3, bool)) {
            return JobKt.CompletableDeferred(new Result3A(0, null));
        }
        if (graphProcessorImpl.graphLoop.getRepeatingRequest() == null) {
            return completableDeferredImpl;
        }
        if (Intrinsics.areEqual(bool4, bool)) {
            Log.d("CXCP", "unlock3A - sending a request to unlock af first.");
            if (!graphProcessorImpl.trigger(Controller3A.parameterForAfTriggerCancel)) {
                Log.d("CXCP", "unlock3A - failed to send a request to unlock af first.");
                return completableDeferredImpl;
            }
            GraphState3A.m87update7jOEVJU$default(controller3A.graphState3A, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767);
        }
        boolean areEqual = Intrinsics.areEqual(bool2, bool);
        boolean areEqual2 = Intrinsics.areEqual(bool4, bool);
        boolean areEqual3 = Intrinsics.areEqual(bool3, bool);
        if (areEqual || areEqual2 || areEqual3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (areEqual) {
                linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, Controller3A.aeUnlockedStateList);
            }
            if (areEqual2) {
                linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, Controller3A.afUnlockedStateList);
            }
            if (areEqual3) {
                linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, Controller3A.awbUnlockedStateList);
            }
            obj = linkedHashMap;
        } else {
            obj = EmptyMap.INSTANCE;
            obj.getClass();
        }
        Result3AStateListenerImpl result3AStateListenerImpl = new Result3AStateListenerImpl(new ObjectList$$ExternalSyntheticLambda0(obj, 8), 60, l);
        Listener3A listener3A = controller3A.graphListener3A;
        listener3A.getClass();
        listener3A.listeners.add(result3AStateListenerImpl);
        Boolean bool5 = Intrinsics.areEqual(bool2, bool) ? Boolean.FALSE : null;
        Boolean bool6 = Intrinsics.areEqual(bool3, bool) ? Boolean.FALSE : null;
        if (bool5 != null || bool6 != null) {
            Log.d("CXCP", "unlock3A - updating graph state, aeLock=" + bool5 + ", awbLock=" + bool6);
            GraphState3A.m87update7jOEVJU$default(controller3A.graphState3A, null, null, null, null, null, null, null, bool5, null, bool6, 383);
        }
        graphProcessorImpl.update3AParameters(controller3A.graphState3A.toCaptureRequestParametersMap());
        return result3AStateListenerImpl._result;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.parameters.lock) {
        }
        synchronized (this.listeners.lock) {
        }
        this.token.release();
    }

    public final CompletableDeferredImpl setTorchOn() {
        AeMode aeMode = null;
        if (this.token.getReleased()) {
            Handlers$$ExternalSyntheticBUOutline0.m("Cannot call setTorchOn on ", this, " after close.");
            return null;
        }
        Controller3A controller3A = this.controller3A;
        AeMode aeMode2 = ((State3A) controller3A.graphState3A._state.value).aeMode;
        List list = AeMode.values;
        int i = 1;
        if ((aeMode2 == null || aeMode2.value != 1) && (aeMode2 == null || aeMode2.value != 0)) {
            aeMode = new AeMode(i);
        }
        return Controller3A.m85update3A169HPGg$default(controller3A, aeMode, null, null, new FlashMode(2), null, null, null, 118);
    }

    public final void stopRepeating() {
        if (this.token.getReleased()) {
            Handlers$$ExternalSyntheticBUOutline0.m("Cannot call stopRepeating on ", this, " after close.");
        } else {
            this.graphProcessor.setRepeatingRequest(null);
        }
    }

    public final void submit(ArrayList arrayList) {
        Object obj;
        if (this.token.getReleased()) {
            Handlers$$ExternalSyntheticBUOutline0.m("Cannot call submit on ", this, " after close.");
            return;
        }
        if (arrayList.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot call submit with an empty list of Requests!");
            return;
        }
        GraphProcessorImpl graphProcessorImpl = this.graphProcessor;
        graphProcessorImpl.getClass();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Request) obj).inputRequest != null) {
                    break;
                }
            }
        }
        Request request = (Request) obj;
        if (request == null || graphProcessorImpl.cameraGraphConfig.input != null) {
            GraphLoop graphLoop = graphProcessorImpl.graphLoop;
            graphLoop.getClass();
            if (graphLoop.processingQueue.tryEmit(new GraphCommand.Capture(arrayList))) {
                return;
            }
            graphLoop.abortRequests(arrayList);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot submit ");
        sb.append(request);
        InputRequest inputRequest = request.inputRequest;
        sb.append(" with input request ");
        sb.append(inputRequest);
        sb.append(" to ");
        sb.append(graphProcessorImpl);
        sb.append(" because CameraGraph was not configured to support reprocessing");
        throw new IllegalStateException(sb.toString().toString());
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.debugId;
    }

    public final CompletableDeferredImpl unlock3APostCapture(boolean z) {
        Result3AStateListenerImpl result3AStateListenerImpl;
        if (this.token.getReleased()) {
            Handlers$$ExternalSyntheticBUOutline0.m("Cannot call unlock3APostCapture on ", this, " after close.");
            return null;
        }
        CompletableDeferredImpl completableDeferredImpl = Controller3A.deferredResult3ASubmitFailed;
        Controller3A controller3A = this.controller3A;
        GraphProcessorImpl graphProcessorImpl = controller3A.graphProcessor;
        if (graphProcessorImpl.graphLoop.getRepeatingRequest() != null) {
            Log.d("CXCP", "unlock3APostCapture - sending a request to reset af and ae precapture metering.");
            if (graphProcessorImpl.trigger(z ? Controller3A.aePrecaptureAndAfCancelParams : Controller3A.aePrecaptureCancelParams)) {
                if (z) {
                    result3AStateListenerImpl = new Result3AStateListenerImpl(Controller3A.unlock3APostCaptureAfUnlockedCondition, null, null);
                } else {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    result3AStateListenerImpl = new Result3AStateListenerImpl(emptyMap);
                }
                Listener3A listener3A = controller3A.graphListener3A;
                listener3A.getClass();
                listener3A.listeners.add(result3AStateListenerImpl);
                graphProcessorImpl.update3AParameters(controller3A.graphState3A.toCaptureRequestParametersMap());
                return result3AStateListenerImpl._result;
            }
        }
        return completableDeferredImpl;
    }
}
