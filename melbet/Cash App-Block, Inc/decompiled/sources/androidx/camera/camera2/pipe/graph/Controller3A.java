package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Log;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FlashMode;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class Controller3A {
    public static final Map aePrecaptureAndAfCancelParams;
    public static final Map aePrecaptureCancelParams;
    public static final List aeUnlockedStateList;
    public static final List afUnlockedStateList;
    public static final List awbUnlockedStateList;
    public static final CompletableDeferredImpl deferredResult3ASubmitFailed;
    public static final Map parameterForAfTriggerCancel;
    public static final Map parameterForAfTriggerStart;
    public static final Map parametersForAePrecapture;
    public static final Map parametersForAePrecaptureAndAfTrigger;
    public static final ObjectList$$ExternalSyntheticLambda0 unlock3APostCaptureAfUnlockedCondition;
    public final Listener3A graphListener3A;
    public final GraphProcessorImpl graphProcessor;
    public final GraphState3A graphState3A;
    public CompletableDeferredImpl lastUpdate3AResult;
    public final CameraMetadata metadata;
    public static final List aeConvergedStateList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 4, 3});
    public static final List awbConvergedStateList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 3});
    public static final List afConvergedStateList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 6, 4, 5});
    public static final List aeLockedStateList = CollectionsKt__CollectionsJVMKt.listOf(3);
    public static final List awbLockedStateList = CollectionsKt__CollectionsJVMKt.listOf(3);
    public static final List afLockedStateList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{4, 5});
    public static final List aePostPrecaptureStateList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 4, 3});
    public static final List awbPostPrecaptureStateList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 3});

    static {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        parameterForAfTriggerStart = MapsKt__MapsJVMKt.mapOf(new Pair(key, 1));
        parameterForAfTriggerCancel = MapsKt__MapsJVMKt.mapOf(new Pair(key, 2));
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        parametersForAePrecapture = MapsKt__MapsJVMKt.mapOf(new Pair(key2, 1));
        parametersForAePrecaptureAndAfTrigger = MapsKt__MapsKt.mapOf(new Pair(key, 1), new Pair(key2, 1));
        deferredResult3ASubmitFailed = JobKt.CompletableDeferred(new Result3A(4, null));
        aeUnlockedStateList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 2, 4});
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 3, 1, 2, 6});
        afUnlockedStateList = listOf;
        awbUnlockedStateList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 2});
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        MapsKt__MapsJVMKt.mapOf(new Pair(key3, bool));
        MapsKt__MapsKt.mapOf(new Pair(key, 2), new Pair(key3, bool));
        MapsKt__MapsJVMKt.mapOf(new Pair(key3, Boolean.FALSE));
        aePrecaptureCancelParams = MapsKt__MapsJVMKt.mapOf(new Pair(key2, 2));
        aePrecaptureAndAfCancelParams = MapsKt__MapsKt.mapOf(new Pair(key, 2), new Pair(key2, 2));
        Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair(CaptureResult.CONTROL_AF_STATE, listOf));
        mapOf.getClass();
        unlock3APostCaptureAfUnlockedCondition = new ObjectList$$ExternalSyntheticLambda0(mapOf, 8);
    }

    public Controller3A(GraphProcessorImpl graphProcessorImpl, CameraMetadata cameraMetadata, GraphState3A graphState3A, Listener3A listener3A) {
        graphProcessorImpl.getClass();
        cameraMetadata.getClass();
        graphState3A.getClass();
        listener3A.getClass();
        this.graphProcessor = graphProcessorImpl;
        this.metadata = cameraMetadata;
        this.graphState3A = graphState3A;
        this.graphListener3A = listener3A;
    }

    /* renamed from: update3A-169HPGg$default, reason: not valid java name */
    public static CompletableDeferredImpl m85update3A169HPGg$default(Controller3A controller3A, AeMode aeMode, AfMode afMode, AwbMode awbMode, FlashMode flashMode, List list, List list2, List list3, int i) {
        AfMode afMode2 = (i & 2) != 0 ? null : afMode;
        AwbMode awbMode2 = (i & 4) != 0 ? null : awbMode;
        FlashMode flashMode2 = (i & 8) != 0 ? null : flashMode;
        List list4 = (i & 16) != 0 ? null : list;
        List list5 = (i & 32) != 0 ? null : list2;
        List list6 = (i & 64) != 0 ? null : list3;
        if (controller3A.graphProcessor.graphLoop.getRepeatingRequest() == null) {
            GraphState3A.m87update7jOEVJU$default(controller3A.graphState3A, aeMode, afMode2, awbMode2, flashMode2, list4, list5, list6, null, null, null, 896);
            controller3A.graphProcessor.update3AParameters(controller3A.graphState3A.toCaptureRequestParametersMap());
            return deferredResult3ASubmitFailed;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aeMode != null) {
            int i2 = aeMode.value;
            CaptureResult.Key key = CaptureResult.CONTROL_AE_MODE;
            key.getClass();
        }
        if (afMode2 != null) {
            int i3 = afMode2.value;
            CaptureResult.Key key2 = CaptureResult.CONTROL_AF_MODE;
            key2.getClass();
        }
        if (awbMode2 != null) {
            int i4 = awbMode2.value;
            CaptureResult.Key key3 = CaptureResult.CONTROL_AWB_MODE;
            key3.getClass();
        }
        if (flashMode2 != null) {
            int i5 = flashMode2.value;
            CaptureResult.Key key4 = CaptureResult.FLASH_MODE;
            key4.getClass();
        }
        Result3AStateListenerImpl result3AStateListenerImpl = new Result3AStateListenerImpl(MapsKt__MapsKt.toMap(linkedHashMap));
        Listener3A listener3A = controller3A.graphListener3A;
        listener3A.getClass();
        listener3A.listeners.add(result3AStateListenerImpl);
        GraphState3A.m87update7jOEVJU$default(controller3A.graphState3A, aeMode, afMode2, awbMode2, flashMode2, list4, list5, list6, null, null, null, 896);
        controller3A.graphProcessor.update3AParameters(controller3A.graphState3A.toCaptureRequestParametersMap());
        CompletableDeferredImpl completableDeferredImpl = result3AStateListenerImpl._result;
        synchronized (controller3A) {
            try {
                Log.d("CXCP", "Controller3A#update3A: cancelling previous request " + controller3A.lastUpdate3AResult);
                CompletableDeferredImpl completableDeferredImpl2 = controller3A.lastUpdate3AResult;
                if (completableDeferredImpl2 != null) {
                    completableDeferredImpl2.cancel(JobKt.CancellationException("A newer call for 3A state update initiated.", null));
                }
                controller3A.lastUpdate3AResult = completableDeferredImpl;
            } catch (Throwable th) {
                throw th;
            }
        }
        return completableDeferredImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00cb, code lost:
    
        if (r8.trigger(androidx.camera.camera2.pipe.graph.Controller3A.parameterForAfTriggerCancel) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00d3, code lost:
    
        if (r37.value == 1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* renamed from: lock3A-Qz1gx5w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m86lock3AQz1gx5w(List list, List list2, List list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, Function1 function1, int i, Long l, Long l2, ContinuationImpl continuationImpl) {
        Controller3A$lock3A$1 controller3A$lock3A$1;
        int i2;
        Ref$ObjectRef m;
        int i3;
        CompletableDeferredImpl completableDeferredImpl;
        String str;
        Lock3ABehavior lock3ABehavior4;
        AeMode aeMode2;
        Long l3;
        Function1 function12;
        int i4;
        Boolean bool;
        Boolean bool2;
        int i5;
        String str2;
        Object awaitInternal;
        Result3AStateListenerImpl result3AStateListenerImpl;
        Object obj;
        Lock3ABehavior lock3ABehavior5;
        boolean z;
        boolean z2;
        boolean z3;
        Map map;
        CompletableDeferredImpl completableDeferredImpl2;
        AeMode aeMode3;
        Result3A result3A;
        AndroidFrameMetadata androidFrameMetadata;
        String str3;
        Long l4;
        Lock3ABehavior lock3ABehavior6 = lock3ABehavior3;
        int i6 = i;
        Listener3A listener3A = this.graphListener3A;
        CompletableDeferredImpl completableDeferredImpl3 = deferredResult3ASubmitFailed;
        GraphState3A graphState3A = this.graphState3A;
        GraphProcessorImpl graphProcessorImpl = this.graphProcessor;
        if (continuationImpl instanceof Controller3A$lock3A$1) {
            controller3A$lock3A$1 = (Controller3A$lock3A$1) continuationImpl;
            int i7 = controller3A$lock3A$1.label;
            if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                controller3A$lock3A$1.label = i7 - PKIFailureInfo.systemUnavail;
                Object obj2 = controller3A$lock3A$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = controller3A$lock3A$1.label;
                if (i2 != 0) {
                    m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj2);
                    m.element = lock3ABehavior2;
                    CameraMetadata.Companion companion = CameraMetadata.Companion;
                    CameraMetadata cameraMetadata = this.metadata;
                    companion.getClass();
                    if (!CameraMetadata.Companion.getSupportsAutoFocusTrigger(cameraMetadata)) {
                        m.element = null;
                    }
                    if (lock3ABehavior == null && m.element == null && lock3ABehavior6 == null) {
                        return JobKt.CompletableDeferred(new Result3A(0, null));
                    }
                    GraphState3A.m87update7jOEVJU$default(this.graphState3A, null, null, null, null, list, list2, list3, null, null, null, 911);
                    graphProcessorImpl.update3AParameters(graphState3A.toCaptureRequestParametersMap());
                    if (graphProcessorImpl.graphLoop.getRepeatingRequest() != null) {
                        Lock3ABehavior lock3ABehavior7 = (Lock3ABehavior) m.element;
                        if (lock3ABehavior7 != null && lock3ABehavior7.value == 3) {
                            Log.d("CXCP", "lock3A - sending a request to unlock af first.");
                        }
                        if (lock3ABehavior != null) {
                            i3 = 1;
                        } else {
                            i3 = 1;
                        }
                        Lock3ABehavior lock3ABehavior8 = (Lock3ABehavior) m.element;
                        if ((lock3ABehavior8 == null || lock3ABehavior8.value == i3) && (lock3ABehavior6 == null || lock3ABehavior6.value == i3)) {
                            completableDeferredImpl = completableDeferredImpl3;
                            str = "CXCP";
                            lock3ABehavior4 = lock3ABehavior;
                            aeMode2 = aeMode;
                            l3 = l2;
                            lock3ABehavior5 = (Lock3ABehavior) m.element;
                            Integer num = new Integer(i6);
                            Boolean bool3 = lock3ABehavior4 == null ? null : Boolean.TRUE;
                            Boolean bool4 = lock3ABehavior6 == null ? null : Boolean.TRUE;
                            z = bool3 != null;
                            z2 = lock3ABehavior5 != null;
                            z3 = bool4 != null;
                            if (!z || z2 || z3) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                if (z) {
                                    linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, aeLockedStateList);
                                }
                                if (z2) {
                                    linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, afLockedStateList);
                                }
                                if (z3) {
                                    linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, awbLockedStateList);
                                }
                                map = linkedHashMap;
                            } else {
                                map = EmptyMap.INSTANCE;
                                map.getClass();
                            }
                            if (map.isEmpty()) {
                                completableDeferredImpl2 = null;
                            } else {
                                Result3AStateListenerImpl result3AStateListenerImpl2 = new Result3AStateListenerImpl(new ObjectList$$ExternalSyntheticLambda0(map, 8), num, l3);
                                listener3A.getClass();
                                listener3A.listeners.add(result3AStateListenerImpl2);
                                GraphState3A.m87update7jOEVJU$default(this.graphState3A, null, null, null, null, null, null, null, bool3, null, bool4, 383);
                                Log.d(str, "lock3A - submitting request with aeLock=" + bool3 + " , awbLock=" + bool4);
                                graphProcessorImpl.update3AParameters(graphState3A.toCaptureRequestParametersMap());
                                completableDeferredImpl2 = result3AStateListenerImpl2._result;
                            }
                            if (lock3ABehavior5 == null) {
                                completableDeferredImpl2.getClass();
                                return completableDeferredImpl2;
                            }
                            if (aeMode2 != null) {
                                int i8 = aeMode2.value;
                                aeMode3 = ((State3A) graphState3A._state.value).aeMode;
                                GraphState3A.m87update7jOEVJU$default(this.graphState3A, new AeMode(i8), null, null, null, null, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                                graphProcessorImpl.update3AParameters(graphState3A.toCaptureRequestParametersMap());
                            } else {
                                aeMode3 = null;
                            }
                            Log.d(str, "lock3A - submitting a request to lock af.");
                            if (!graphProcessorImpl.trigger(parameterForAfTriggerStart)) {
                                return completableDeferredImpl;
                            }
                            GraphState3A.m87update7jOEVJU$default(this.graphState3A, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 767);
                            if (aeMode3 != null) {
                                GraphState3A.m87update7jOEVJU$default(this.graphState3A, new AeMode(aeMode3.value), null, null, null, null, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                                graphProcessorImpl.update3AParameters(graphState3A.toCaptureRequestParametersMap());
                            }
                            completableDeferredImpl2.getClass();
                            return completableDeferredImpl2;
                        }
                        if (function1 == null) {
                            int i9 = (lock3ABehavior == null || lock3ABehavior.value == i3) ? 0 : i3;
                            Lock3ABehavior lock3ABehavior9 = (Lock3ABehavior) m.element;
                            int i10 = (lock3ABehavior9 == null || lock3ABehavior9.value == i3) ? 0 : i3;
                            boolean z4 = (lock3ABehavior6 == null || lock3ABehavior6.value == i3) ? false : true;
                            if (i9 == 0 && i10 == 0 && !z4) {
                                obj = EmptyMap.INSTANCE;
                                obj.getClass();
                                completableDeferredImpl = completableDeferredImpl3;
                            } else {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                if (i9 != 0) {
                                    completableDeferredImpl = completableDeferredImpl3;
                                    linkedHashMap2.put(CaptureResult.CONTROL_AE_STATE, aeConvergedStateList);
                                } else {
                                    completableDeferredImpl = completableDeferredImpl3;
                                }
                                if (z4) {
                                    linkedHashMap2.put(CaptureResult.CONTROL_AWB_STATE, awbConvergedStateList);
                                }
                                if (i10 != 0) {
                                    linkedHashMap2.put(CaptureResult.CONTROL_AF_STATE, afConvergedStateList);
                                }
                                obj = linkedHashMap2;
                            }
                            function12 = new ObjectList$$ExternalSyntheticLambda0(obj, 8);
                        } else {
                            completableDeferredImpl = completableDeferredImpl3;
                            function12 = function1;
                        }
                        Result3AStateListenerImpl result3AStateListenerImpl3 = new Result3AStateListenerImpl(function12, new Integer(i6), l);
                        listener3A.getClass();
                        listener3A.listeners.add(result3AStateListenerImpl3);
                        if (lock3ABehavior == null) {
                            i4 = 3;
                        } else {
                            i4 = 3;
                            if (lock3ABehavior.value == 3) {
                                bool = Boolean.FALSE;
                                bool2 = (lock3ABehavior6 != null && lock3ABehavior6.value == i4) ? Boolean.FALSE : null;
                                if (bool == null || bool2 != null) {
                                    Log.d("CXCP", "lock3A - setting aeLock=" + bool + ", awbLock=" + bool2);
                                    GraphState3A.m87update7jOEVJU$default(this.graphState3A, null, null, null, null, null, null, null, bool, null, bool2, 383);
                                }
                                graphProcessorImpl.update3AParameters(graphState3A.toCaptureRequestParametersMap());
                                StringBuilder sb = new StringBuilder("lock3A - waiting for");
                                String str4 = "";
                                if (lock3ABehavior != null) {
                                    i5 = 1;
                                    if (lock3ABehavior.value != 1) {
                                        str2 = " ae";
                                        sb.append(str2);
                                        Lock3ABehavior lock3ABehavior10 = (Lock3ABehavior) m.element;
                                        sb.append((lock3ABehavior10 != null || lock3ABehavior10.value == i5) ? "" : " af");
                                        if (lock3ABehavior6 != null && lock3ABehavior6.value != i5) {
                                            str4 = " awb";
                                        }
                                        sb.append(str4);
                                        sb.append(" to converge before locking them.");
                                        Log.d("CXCP", sb.toString());
                                        CompletableDeferredImpl completableDeferredImpl4 = result3AStateListenerImpl3._result;
                                        controller3A$lock3A$1.L$0 = lock3ABehavior;
                                        controller3A$lock3A$1.L$1 = lock3ABehavior6;
                                        controller3A$lock3A$1.L$2 = aeMode;
                                        controller3A$lock3A$1.L$4 = l2;
                                        controller3A$lock3A$1.L$5 = m;
                                        controller3A$lock3A$1.L$6 = result3AStateListenerImpl3;
                                        controller3A$lock3A$1.I$0 = i6;
                                        controller3A$lock3A$1.label = 1;
                                        awaitInternal = completableDeferredImpl4.awaitInternal(controller3A$lock3A$1);
                                        if (awaitInternal != coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        lock3ABehavior4 = lock3ABehavior;
                                        result3AStateListenerImpl = result3AStateListenerImpl3;
                                        aeMode2 = aeMode;
                                        l3 = l2;
                                    }
                                } else {
                                    i5 = 1;
                                }
                                str2 = "";
                                sb.append(str2);
                                Lock3ABehavior lock3ABehavior102 = (Lock3ABehavior) m.element;
                                sb.append((lock3ABehavior102 != null || lock3ABehavior102.value == i5) ? "" : " af");
                                if (lock3ABehavior6 != null) {
                                    str4 = " awb";
                                }
                                sb.append(str4);
                                sb.append(" to converge before locking them.");
                                Log.d("CXCP", sb.toString());
                                CompletableDeferredImpl completableDeferredImpl42 = result3AStateListenerImpl3._result;
                                controller3A$lock3A$1.L$0 = lock3ABehavior;
                                controller3A$lock3A$1.L$1 = lock3ABehavior6;
                                controller3A$lock3A$1.L$2 = aeMode;
                                controller3A$lock3A$1.L$4 = l2;
                                controller3A$lock3A$1.L$5 = m;
                                controller3A$lock3A$1.L$6 = result3AStateListenerImpl3;
                                controller3A$lock3A$1.I$0 = i6;
                                controller3A$lock3A$1.label = 1;
                                awaitInternal = completableDeferredImpl42.awaitInternal(controller3A$lock3A$1);
                                if (awaitInternal != coroutineSingletons) {
                                }
                            }
                        }
                        bool = null;
                        if (lock3ABehavior6 != null) {
                            if (bool == null) {
                            }
                            Log.d("CXCP", "lock3A - setting aeLock=" + bool + ", awbLock=" + bool2);
                            GraphState3A.m87update7jOEVJU$default(this.graphState3A, null, null, null, null, null, null, null, bool, null, bool2, 383);
                            graphProcessorImpl.update3AParameters(graphState3A.toCaptureRequestParametersMap());
                            StringBuilder sb2 = new StringBuilder("lock3A - waiting for");
                            String str42 = "";
                            if (lock3ABehavior != null) {
                            }
                            str2 = "";
                            sb2.append(str2);
                            Lock3ABehavior lock3ABehavior1022 = (Lock3ABehavior) m.element;
                            sb2.append((lock3ABehavior1022 != null || lock3ABehavior1022.value == i5) ? "" : " af");
                            if (lock3ABehavior6 != null) {
                            }
                            sb2.append(str42);
                            sb2.append(" to converge before locking them.");
                            Log.d("CXCP", sb2.toString());
                            CompletableDeferredImpl completableDeferredImpl422 = result3AStateListenerImpl3._result;
                            controller3A$lock3A$1.L$0 = lock3ABehavior;
                            controller3A$lock3A$1.L$1 = lock3ABehavior6;
                            controller3A$lock3A$1.L$2 = aeMode;
                            controller3A$lock3A$1.L$4 = l2;
                            controller3A$lock3A$1.L$5 = m;
                            controller3A$lock3A$1.L$6 = result3AStateListenerImpl3;
                            controller3A$lock3A$1.I$0 = i6;
                            controller3A$lock3A$1.label = 1;
                            awaitInternal = completableDeferredImpl422.awaitInternal(controller3A$lock3A$1);
                            if (awaitInternal != coroutineSingletons) {
                            }
                        }
                        if (bool == null) {
                        }
                        Log.d("CXCP", "lock3A - setting aeLock=" + bool + ", awbLock=" + bool2);
                        GraphState3A.m87update7jOEVJU$default(this.graphState3A, null, null, null, null, null, null, null, bool, null, bool2, 383);
                        graphProcessorImpl.update3AParameters(graphState3A.toCaptureRequestParametersMap());
                        StringBuilder sb22 = new StringBuilder("lock3A - waiting for");
                        String str422 = "";
                        if (lock3ABehavior != null) {
                        }
                        str2 = "";
                        sb22.append(str2);
                        Lock3ABehavior lock3ABehavior10222 = (Lock3ABehavior) m.element;
                        sb22.append((lock3ABehavior10222 != null || lock3ABehavior10222.value == i5) ? "" : " af");
                        if (lock3ABehavior6 != null) {
                        }
                        sb22.append(str422);
                        sb22.append(" to converge before locking them.");
                        Log.d("CXCP", sb22.toString());
                        CompletableDeferredImpl completableDeferredImpl4222 = result3AStateListenerImpl3._result;
                        controller3A$lock3A$1.L$0 = lock3ABehavior;
                        controller3A$lock3A$1.L$1 = lock3ABehavior6;
                        controller3A$lock3A$1.L$2 = aeMode;
                        controller3A$lock3A$1.L$4 = l2;
                        controller3A$lock3A$1.L$5 = m;
                        controller3A$lock3A$1.L$6 = result3AStateListenerImpl3;
                        controller3A$lock3A$1.I$0 = i6;
                        controller3A$lock3A$1.label = 1;
                        awaitInternal = completableDeferredImpl4222.awaitInternal(controller3A$lock3A$1);
                        if (awaitInternal != coroutineSingletons) {
                        }
                    }
                    return completableDeferredImpl3;
                }
                if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i11 = controller3A$lock3A$1.I$0;
                Result3AStateListenerImpl result3AStateListenerImpl4 = controller3A$lock3A$1.L$6;
                Ref$ObjectRef ref$ObjectRef = controller3A$lock3A$1.L$5;
                l3 = controller3A$lock3A$1.L$4;
                aeMode2 = controller3A$lock3A$1.L$2;
                Lock3ABehavior lock3ABehavior11 = controller3A$lock3A$1.L$1;
                lock3ABehavior4 = controller3A$lock3A$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                completableDeferredImpl = completableDeferredImpl3;
                awaitInternal = obj2;
                m = ref$ObjectRef;
                i6 = i11;
                result3AStateListenerImpl = result3AStateListenerImpl4;
                lock3ABehavior6 = lock3ABehavior11;
                result3A = (Result3A) awaitInternal;
                StringBuilder sb3 = new StringBuilder("lock3A - converged at frame number=");
                androidFrameMetadata = result3A.frameMetadata;
                if (androidFrameMetadata == null) {
                    str3 = "CXCP";
                    l4 = new Long(androidFrameMetadata.captureResult.getFrameNumber());
                } else {
                    str3 = "CXCP";
                    l4 = null;
                }
                sb3.append(l4);
                sb3.append(", status=");
                sb3.append((Object) ("Status(value=" + result3A.status + ')'));
                str = str3;
                Log.d(str, sb3.toString());
                if (result3A.status != 0) {
                    return result3AStateListenerImpl._result;
                }
                lock3ABehavior5 = (Lock3ABehavior) m.element;
                Integer num2 = new Integer(i6);
                if (lock3ABehavior4 == null) {
                }
                if (lock3ABehavior6 == null) {
                }
                if (bool3 != null) {
                }
                if (lock3ABehavior5 != null) {
                }
                if (bool4 != null) {
                }
                if (z) {
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                if (z) {
                }
                if (z2) {
                }
                if (z3) {
                }
                map = linkedHashMap3;
                if (map.isEmpty()) {
                }
                if (lock3ABehavior5 == null) {
                }
            }
        }
        controller3A$lock3A$1 = new Controller3A$lock3A$1(this, continuationImpl);
        Object obj22 = controller3A$lock3A$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = controller3A$lock3A$1.label;
        if (i2 != 0) {
        }
        result3A = (Result3A) awaitInternal;
        StringBuilder sb32 = new StringBuilder("lock3A - converged at frame number=");
        androidFrameMetadata = result3A.frameMetadata;
        if (androidFrameMetadata == null) {
        }
        sb32.append(l4);
        sb32.append(", status=");
        sb32.append((Object) ("Status(value=" + result3A.status + ')'));
        str = str3;
        Log.d(str, sb32.toString());
        if (result3A.status != 0) {
        }
        lock3ABehavior5 = (Lock3ABehavior) m.element;
        Integer num22 = new Integer(i6);
        if (lock3ABehavior4 == null) {
        }
        if (lock3ABehavior6 == null) {
        }
        if (bool3 != null) {
        }
        if (lock3ABehavior5 != null) {
        }
        if (bool4 != null) {
        }
        if (z) {
        }
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        if (z) {
        }
        if (z2) {
        }
        if (z3) {
        }
        map = linkedHashMap32;
        if (map.isEmpty()) {
        }
        if (lock3ABehavior5 == null) {
        }
    }
}
