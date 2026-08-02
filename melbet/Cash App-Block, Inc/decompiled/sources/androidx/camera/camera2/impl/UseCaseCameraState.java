package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraControls3A;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.compat.AndroidFrameInfo;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import okhttp3.Cache;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class UseCaseCameraState {
    public final LinkedHashMap currentInternalParameters;
    public final LinkedHashSet currentListeners;
    public final LinkedHashMap currentParameters;
    public final LinkedHashSet currentStreams;
    public RequestTemplate currentTemplate;
    public AeMode lastAeMode;
    public AfMode lastAfMode;
    public AwbMode lastAwbMode;
    public final Object lock;
    public final AtomicInt pendingSignalCount;
    public final RequestListener requestListener;
    public final AtomicInt submittedRequestCounter;
    public final TemplateParamsOverride templateParamsOverride;
    public CompletableDeferredImpl updateSignal;
    public final ArrayDeque updateSignals;
    public boolean updating;
    public final UseCaseGraphContext useCaseGraphContext;

    public final class RequestListener implements Request.Listener {
        public RequestListener() {
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onFailed-CcXjc1I */
        public final void mo17onFailedCcXjc1I(RequestMetadata requestMetadata, long j, RequestFailure requestFailure) {
            Integer num;
            if (UseCaseCameraState.this.pendingSignalCount.value == 0 || (num = (Integer) requestMetadata.get(TagsKt.USE_CASE_CAMERA_STATE_CUSTOM_TAG)) == null) {
                return;
            }
            UseCaseCameraState useCaseCameraState = UseCaseCameraState.this;
            int intValue = num.intValue();
            synchronized (useCaseCameraState.lock) {
                ArrayDeque arrayDeque = useCaseCameraState.updateSignals;
                Throwable th = new Throwable("Failed in framework level".concat(" with CaptureFailure.reason = " + requestFailure.getReason()));
                while (!arrayDeque.isEmpty() && ((RequestSignal) arrayDeque.first()).requestNo <= intValue) {
                    ((RequestSignal) arrayDeque.first()).signal.completeExceptionally(th);
                    CollectionsKt__MutableCollectionsKt.removeFirst(arrayDeque);
                    UseCaseCameraState.this.pendingSignalCount.decrementAndGet();
                }
            }
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onTotalCaptureResult-CcXjc1I */
        public final void mo18onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
            Integer num;
            if (UseCaseCameraState.this.pendingSignalCount.value == 0 || (num = (Integer) requestMetadata.get(TagsKt.USE_CASE_CAMERA_STATE_CUSTOM_TAG)) == null) {
                return;
            }
            UseCaseCameraState useCaseCameraState = UseCaseCameraState.this;
            int intValue = num.intValue();
            synchronized (useCaseCameraState.lock) {
                ArrayDeque arrayDeque = useCaseCameraState.updateSignals;
                while (!arrayDeque.isEmpty() && ((RequestSignal) arrayDeque.first()).requestNo <= intValue) {
                    ((RequestSignal) arrayDeque.first()).signal.complete(Unit.INSTANCE);
                    CollectionsKt__MutableCollectionsKt.removeFirst(arrayDeque);
                    UseCaseCameraState.this.pendingSignalCount.decrementAndGet();
                }
            }
        }
    }

    public final class RequestSignal {
        public final int requestNo;
        public final CompletableDeferred signal;

        public RequestSignal(int i, CompletableDeferredImpl completableDeferredImpl) {
            completableDeferredImpl.getClass();
            this.requestNo = i;
            this.signal = completableDeferredImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestSignal)) {
                return false;
            }
            RequestSignal requestSignal = (RequestSignal) obj;
            return this.requestNo == requestSignal.requestNo && Intrinsics.areEqual(this.signal, requestSignal.signal);
        }

        public final int hashCode() {
            return this.signal.hashCode() + (Integer.hashCode(this.requestNo) * 31);
        }

        public final String toString() {
            return "RequestSignal(requestNo=" + this.requestNo + ", signal=" + this.signal + ')';
        }
    }

    public UseCaseCameraState(UseCaseGraphContext useCaseGraphContext, TemplateParamsOverride templateParamsOverride) {
        useCaseGraphContext.getClass();
        this.useCaseGraphContext = useCaseGraphContext;
        this.templateParamsOverride = templateParamsOverride;
        this.lock = new Object();
        this.submittedRequestCounter = AtomicFU.atomic(0);
        this.updateSignals = new ArrayDeque();
        this.currentParameters = new LinkedHashMap();
        this.currentInternalParameters = new LinkedHashMap();
        this.currentStreams = new LinkedHashSet();
        this.currentListeners = new LinkedHashSet();
        this.requestListener = new RequestListener();
        this.pendingSignalCount = AtomicFU.atomic(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitLatest(ContinuationImpl continuationImpl) {
        UseCaseCameraState$submitLatest$1 useCaseCameraState$submitLatest$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        CompletableDeferred completableDeferred;
        AutoCloseable autoCloseable;
        CompletableDeferredImpl completableDeferredImpl;
        int incrementAndGet;
        try {
            if (continuationImpl instanceof UseCaseCameraState$submitLatest$1) {
                useCaseCameraState$submitLatest$1 = (UseCaseCameraState$submitLatest$1) continuationImpl;
                int i2 = useCaseCameraState$submitLatest$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    useCaseCameraState$submitLatest$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = useCaseCameraState$submitLatest$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = useCaseCameraState$submitLatest$1.label;
                    if (i != 0) {
                        Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                        try {
                            CameraGraphImpl graph = this.useCaseGraphContext.getGraph();
                            useCaseCameraState$submitLatest$1.L$0 = m;
                            useCaseCameraState$submitLatest$1.label = 1;
                            obj = graph.acquireSession(useCaseCameraState$submitLatest$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ref$ObjectRef = m;
                        } catch (CancellationException e) {
                            e = e;
                            ref$ObjectRef = m;
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            }
                            synchronized (this.lock) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$ObjectRef = useCaseCameraState$submitLatest$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                        } catch (CancellationException e2) {
                            e = e2;
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "Cannot acquire session at " + this, e);
                            }
                            synchronized (this.lock) {
                                if (this.updating) {
                                    this.updating = false;
                                    ref$ObjectRef.element = this.updateSignal;
                                    this.updateSignal = null;
                                }
                            }
                            completableDeferred = (CompletableDeferred) ref$ObjectRef.element;
                            if (completableDeferred != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    autoCloseable = (AutoCloseable) obj;
                    CameraGraphSessionImpl cameraGraphSessionImpl = (CameraGraphSessionImpl) autoCloseable;
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    synchronized (this.lock) {
                        try {
                            if (this.currentStreams.isEmpty()) {
                                ref$ObjectRef2.element = null;
                            } else {
                                RequestTemplate requestTemplate = this.currentTemplate;
                                List list = CollectionsKt.toList(this.currentStreams);
                                LinkedHashMap plus = MapsKt__MapsKt.plus(this.templateParamsOverride.mo25getOverrideParamsxlOpshk(this.currentTemplate), MapsKt__MapsKt.toMap(this.currentParameters));
                                LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(this.currentInternalParameters);
                                Metadata.Key key = TagsKt.USE_CASE_CAMERA_STATE_CUSTOM_TAG;
                                AtomicInt atomicInt = this.submittedRequestCounter;
                                atomicInt.getClass();
                                mutableMap.put(key, new Integer(AtomicInt.FU.incrementAndGet(atomicInt)));
                                ArrayList mutableList = CollectionsKt.toMutableList((Collection) this.currentListeners);
                                mutableList.add(this.requestListener);
                                ref$ObjectRef2.element = new Request(list, plus, mutableMap, mutableList, requestTemplate, 32);
                            }
                            completableDeferredImpl = this.updateSignal;
                            ref$ObjectRef3.element = completableDeferredImpl;
                            this.updating = false;
                            this.updateSignal = null;
                        } finally {
                        }
                    }
                    if (ref$ObjectRef2.element == null) {
                        cameraGraphSessionImpl.stopRepeating();
                        ref$ObjectRef.element = ref$ObjectRef3.element;
                    } else {
                        if (completableDeferredImpl != null) {
                            synchronized (this.lock) {
                                this.updateSignals.addLast(new RequestSignal(this.submittedRequestCounter.value, completableDeferredImpl));
                                AtomicInt atomicInt2 = this.pendingSignalCount;
                                atomicInt2.getClass();
                                incrementAndGet = AtomicInt.FU.incrementAndGet(atomicInt2);
                            }
                            Okio.boxInt(incrementAndGet);
                        }
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Update RepeatingRequest: " + ref$ObjectRef2.element);
                        }
                        Request request = (Request) ref$ObjectRef2.element;
                        cameraGraphSessionImpl.getClass();
                        request.getClass();
                        if (cameraGraphSessionImpl.token.getReleased()) {
                            Handlers$$ExternalSyntheticBUOutline0.m("Cannot call startRepeating on ", cameraGraphSessionImpl, " after close.");
                        } else {
                            cameraGraphSessionImpl.graphProcessor.setRepeatingRequest(request);
                        }
                        update3A(cameraGraphSessionImpl, ((Request) ref$ObjectRef2.element).parameters);
                    }
                    Cache.Companion.closeFinally(autoCloseable, null);
                    completableDeferred = (CompletableDeferred) ref$ObjectRef.element;
                    if (completableDeferred != null) {
                        completableDeferred.complete(Unit.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }
            }
            CameraGraphSessionImpl cameraGraphSessionImpl2 = (CameraGraphSessionImpl) autoCloseable;
            Ref$ObjectRef ref$ObjectRef22 = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef32 = new Ref$ObjectRef();
            synchronized (this.lock) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Cache.Companion.closeFinally(autoCloseable, th);
                throw th2;
            }
        }
        useCaseCameraState$submitLatest$1 = new UseCaseCameraState$submitLatest$1(this, continuationImpl);
        Object obj2 = useCaseCameraState$submitLatest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = useCaseCameraState$submitLatest$1.label;
        if (i != 0) {
        }
        autoCloseable = (AutoCloseable) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void update3A(CameraGraphSessionImpl cameraGraphSessionImpl, Map map) {
        AeMode aeMode;
        AfMode afMode;
        Object obj;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        key.getClass();
        AwbMode awbMode = null;
        Object obj2 = map != null ? map.get(key) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num != null) {
            int intValue = num.intValue();
            List list = AeMode.values;
            aeMode = AeMode.Companion.m40fromIntOrNullkQd0u18(intValue);
        } else {
            aeMode = null;
        }
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
        key2.getClass();
        Object obj3 = map != null ? map.get(key2) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            Iterator it = AfMode.values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((AfMode) obj).value == intValue2) {
                        break;
                    }
                }
            }
            afMode = (AfMode) obj;
        } else {
            afMode = null;
        }
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
        key3.getClass();
        Object obj4 = map != null ? map.get(key3) : null;
        Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
        if (num3 != null) {
            int intValue3 = num3.intValue();
            Iterator it2 = AwbMode.values.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((AwbMode) next).value == intValue3) {
                    awbMode = next;
                    break;
                }
            }
            awbMode = awbMode;
        }
        AwbMode awbMode2 = awbMode;
        boolean z = false;
        boolean z2 = (aeMode == null || aeMode.equals(this.lastAeMode)) ? false : true;
        boolean z3 = (afMode == null || afMode.equals(this.lastAfMode)) ? false : true;
        if (awbMode2 != null && !awbMode2.equals(this.lastAwbMode)) {
            z = true;
        }
        if (z2 || z3 || z) {
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "UseCaseCameraState: Updating 3A modes: AE(" + aeMode + ", changed=" + z2 + "), AF(" + afMode + ", changed=" + z3 + "), AWB(" + awbMode2 + ", changed=" + z + ')');
            }
            CameraControls3A.m42update3AydBZfZg$default(cameraGraphSessionImpl, aeMode, afMode, awbMode2, null, null, null, 56);
            if (aeMode != null) {
                this.lastAeMode = aeMode;
            }
            if (afMode != null) {
                this.lastAfMode = afMode;
            }
            if (awbMode2 != null) {
                this.lastAwbMode = awbMode2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: updateAsync-Tp9XwKQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m38updateAsyncTp9XwKQ(LinkedHashMap linkedHashMap, Map map, Set set, RequestTemplate requestTemplate, Set set2, ContinuationImpl continuationImpl) {
        UseCaseCameraState$updateAsync$1 useCaseCameraState$updateAsync$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        if (continuationImpl instanceof UseCaseCameraState$updateAsync$1) {
            useCaseCameraState$updateAsync$1 = (UseCaseCameraState$updateAsync$1) continuationImpl;
            int i2 = useCaseCameraState$updateAsync$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                useCaseCameraState$updateAsync$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = useCaseCameraState$updateAsync$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = useCaseCameraState$updateAsync$1.label;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    synchronized (this.lock) {
                        try {
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "UseCaseCameraState#updateState: parameters = " + linkedHashMap + ", internalParameters = " + map + ", streams = " + set + ", template = " + requestTemplate);
                            }
                            if (linkedHashMap != null) {
                                this.currentParameters.clear();
                                this.currentParameters.putAll(linkedHashMap);
                            }
                            if (map != null) {
                                this.currentInternalParameters.clear();
                                this.currentInternalParameters.putAll(map);
                            }
                            if (set != null) {
                                this.currentStreams.clear();
                                this.currentStreams.addAll(set);
                            }
                            if (requestTemplate != null) {
                                this.currentTemplate = requestTemplate;
                            }
                            if (set2 != null) {
                                this.currentListeners.clear();
                                this.currentListeners.addAll(set2);
                            }
                            if (this.updateSignal == null) {
                                this.updateSignal = new CompletableDeferredImpl();
                            }
                            if (this.updating) {
                                CompletableDeferredImpl completableDeferredImpl = this.updateSignal;
                                completableDeferredImpl.getClass();
                                return completableDeferredImpl;
                            }
                            this.updating = true;
                            CompletableDeferredImpl completableDeferredImpl2 = this.updateSignal;
                            completableDeferredImpl2.getClass();
                            m.element = completableDeferredImpl2;
                            useCaseCameraState$updateAsync$1.L$0 = m;
                            useCaseCameraState$updateAsync$1.label = 1;
                            if (submitLatest(useCaseCameraState$updateAsync$1) == obj2) {
                                return obj2;
                            }
                            ref$ObjectRef = m;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = useCaseCameraState$updateAsync$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return ref$ObjectRef.element;
            }
        }
        useCaseCameraState$updateAsync$1 = new UseCaseCameraState$updateAsync$1(this, continuationImpl);
        Object obj3 = useCaseCameraState$updateAsync$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = useCaseCameraState$updateAsync$1.label;
        if (i != 0) {
        }
        return ref$ObjectRef.element;
    }
}
