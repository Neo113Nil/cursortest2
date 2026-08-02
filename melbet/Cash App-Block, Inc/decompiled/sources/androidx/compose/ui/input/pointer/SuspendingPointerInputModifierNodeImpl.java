package androidx.compose.ui.input.pointer;

import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements PointerInputScope, Density, PointerInputModifierNode {
    public PointerInputEventHandler _pointerInputEventHandler;
    public long boundsSize;
    public PointerEvent currentEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
    public final MutableVector dispatchingPointerHandlers;
    public Object key1;
    public Object key2;
    public Object[] keys;
    public PointerEvent lastPointerEvent;
    public final MutableVector pointerHandlers;
    public final MutableVector pointerHandlersLock;
    public StandaloneCoroutine pointerInputJob;

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputEventHandler = pointerInputEventHandler;
        MutableVector mutableVector = new MutableVector(0, new PointerEventHandlerCoroutine[16]);
        this.pointerHandlers = mutableVector;
        this.pointerHandlersLock = mutableVector;
        this.dispatchingPointerHandlers = new MutableVector(0, new PointerEventHandlerCoroutine[16]);
        this.boundsSize = 0L;
    }

    public final Object awaitPointerEventScope(Function2 function2, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(cancellableContinuationImpl);
        synchronized (this.pointerHandlersLock) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(pointerEventHandlerCoroutine, pointerEventHandlerCoroutine, function2)), CoroutineSingletons.COROUTINE_SUSPENDED);
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(Unit.INSTANCE);
        }
        cancellableContinuationImpl.invokeOnCancellation(new BoundsAnimation$animate$1(pointerEventHandlerCoroutine, 8));
        return cancellableContinuationImpl.getResult();
    }

    public final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        CancellableContinuationImpl cancellableContinuationImpl;
        CancellableContinuationImpl cancellableContinuationImpl2;
        synchronized (this.pointerHandlersLock) {
            MutableVector mutableVector = this.dispatchingPointerHandlers;
            mutableVector.addAll(mutableVector.size, this.pointerHandlers);
        }
        try {
            int ordinal = pointerEventPass.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    MutableVector mutableVector2 = this.dispatchingPointerHandlers;
                    int i = mutableVector2.size - 1;
                    Object[] objArr = mutableVector2.content;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (PointerEventHandlerCoroutine) objArr[i];
                            if (pointerEventPass == pointerEventHandlerCoroutine.awaitPass && (cancellableContinuationImpl2 = pointerEventHandlerCoroutine.pointerAwaiter) != null) {
                                pointerEventHandlerCoroutine.pointerAwaiter = null;
                                Result.Companion companion = Result.Companion;
                                cancellableContinuationImpl2.resumeWith(pointerEvent);
                            }
                            i--;
                        }
                    }
                    this.dispatchingPointerHandlers.clear();
                }
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            MutableVector mutableVector3 = this.dispatchingPointerHandlers;
            Object[] objArr2 = mutableVector3.content;
            int i2 = mutableVector3.size;
            for (int i3 = 0; i3 < i2; i3++) {
                PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = (PointerEventHandlerCoroutine) objArr2[i3];
                if (pointerEventPass == pointerEventHandlerCoroutine2.awaitPass && (cancellableContinuationImpl = pointerEventHandlerCoroutine2.pointerAwaiter) != null) {
                    pointerEventHandlerCoroutine2.pointerAwaiter = null;
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuationImpl.resumeWith(pointerEvent);
                }
            }
            this.dispatchingPointerHandlers.clear();
        } catch (Throwable th) {
            this.dispatchingPointerHandlers.clear();
            throw th;
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return DepthSortedSetKt.requireLayoutNode(this).density.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return DepthSortedSetKt.requireLayoutNode(this).density.getFontScale();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        List list = pointerEvent.changes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((PointerInputChange) list.get(i)).getPressed()) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    PointerInputChange pointerInputChange = (PointerInputChange) list.get(i2);
                    arrayList.add(new PointerInputChange(pointerInputChange.m815getIdJ3iCeTQ(), pointerInputChange.getUptimeMillis(), pointerInputChange.m816getPositionF1C5BW0(), pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m816getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), pointerInputChange.m818getTypeT8wyACA()));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList, null);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.boundsSize = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        Continuation continuation = null;
        if (this.pointerInputJob == null) {
            this.pointerInputJob = JobKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new ThumbNode$onAttach$1(this, continuation, 26), 1);
        }
        dispatchPointerEvent(pointerEvent, pointerEventPass);
        List list = pointerEvent.changes;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerEvent = null;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed((PointerInputChange) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    public final void resetPointerInputHandler() {
        StandaloneCoroutine standaloneCoroutine = this.pointerInputJob;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancelInternal(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    public final class PointerEventHandlerCoroutine implements Density, Continuation {
        public final /* synthetic */ SuspendingPointerInputModifierNodeImpl $$delegate_0;
        public final CancellableContinuationImpl completion;
        public CancellableContinuationImpl pointerAwaiter;
        public PointerEventPass awaitPass = PointerEventPass.Main;
        public final EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;

        public PointerEventHandlerCoroutine(CancellableContinuationImpl cancellableContinuationImpl) {
            this.$$delegate_0 = SuspendingPointerInputModifierNodeImpl.this;
            this.completion = cancellableContinuationImpl;
        }

        public final Object awaitPointerEvent(PointerEventPass pointerEventPass, Continuation continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
            cancellableContinuationImpl.initCancellability();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return result;
        }

        @Override // kotlin.coroutines.Continuation
        public final CoroutineContext getContext() {
            return this.context;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public final long m831getExtendedTouchPaddingNHjbRc() {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            long mo237toSizeXkaWNTQ = suspendingPointerInputModifierNodeImpl.mo237toSizeXkaWNTQ(DepthSortedSetKt.requireLayoutNode(suspendingPointerInputModifierNodeImpl).viewConfiguration.mo873getMinimumTouchTargetSizeMYxV2XQ());
            long j = suspendingPointerInputModifierNodeImpl.boundsSize;
            float max = Math.max(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat((int) (mo237toSizeXkaWNTQ >> 32)) - ((int) (j >> 32))) / 2.0f;
            float max2 = Math.max(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat((int) (mo237toSizeXkaWNTQ & BodyPartID.bodyIdMax)) - ((int) (j & BodyPartID.bodyIdMax))) / 2.0f;
            return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & BodyPartID.bodyIdMax);
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        public final ViewConfiguration getViewConfiguration() {
            return DepthSortedSetKt.requireLayoutNode(SuspendingPointerInputModifierNodeImpl.this).viewConfiguration;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (suspendingPointerInputModifierNodeImpl.pointerHandlersLock) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.remove(this);
            }
            this.completion.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public final int mo229roundToPxR2X_6o(long j) {
            return this.$$delegate_0.mo229roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public final int mo230roundToPx0680j_4(float f) {
            return this.$$delegate_0.mo230roundToPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-GaN1DYA */
        public final float mo231toDpGaN1DYA(long j) {
            return this.$$delegate_0.mo231toDpGaN1DYA(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public final float mo232toDpu2uoSUM(float f) {
            return f / this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public final long mo234toDpSizekrfVVM(long j) {
            return this.$$delegate_0.mo234toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public final float mo235toPxR2X_6o(long j) {
            return this.$$delegate_0.mo235toPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public final float mo236toPx0680j_4(float f) {
            return this.$$delegate_0.getDensity() * f;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public final long mo237toSizeXkaWNTQ(long j) {
            return this.$$delegate_0.mo237toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-0xMU5do */
        public final long mo238toSp0xMU5do(float f) {
            return this.$$delegate_0.mo238toSp0xMU5do(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public final long mo239toSpkPz2Gy4(float f) {
            return this.$$delegate_0.mo239toSpkPz2Gy4(f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function2] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object withTimeout(long j, Function2 function2, BaseContinuationImpl baseContinuationImpl) {
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1;
            int i;
            CancellableContinuationImpl cancellableContinuationImpl;
            try {
                if (baseContinuationImpl instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) baseContinuationImpl;
                    int i2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            if (j <= 0 && (cancellableContinuationImpl = this.pointerAwaiter) != null) {
                                Result.Companion companion = Result.Companion;
                                cancellableContinuationImpl.resumeWith(new Result.Failure(new PointerEventTimeoutCancellationException(j)));
                            }
                            StandaloneCoroutine launch$default = JobKt.launch$default(SuspendingPointerInputModifierNodeImpl.this.getCoroutineScope(), null, null, new FlashControl$applyScreenFlash$3(j, (Object) this, (Continuation) null, 4), 3);
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.L$0 = launch$default;
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label = 1;
                            obj = function2.invoke(this, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1);
                            this = launch$default;
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            StandaloneCoroutine standaloneCoroutine = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            this = standaloneCoroutine;
                        }
                        this.cancel(CancelTimeoutCancellationException.INSTANCE);
                        return obj;
                    }
                }
                if (i != 0) {
                }
                this.cancel(CancelTimeoutCancellationException.INSTANCE);
                return obj;
            } catch (Throwable th) {
                this.cancel(CancelTimeoutCancellationException.INSTANCE);
                throw th;
            }
            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(this, baseContinuationImpl);
            Object obj2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object withTimeoutOrNull(long j, Function2 function2, BaseContinuationImpl baseContinuationImpl) {
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1;
            int i;
            try {
                if (baseContinuationImpl instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) baseContinuationImpl;
                    int i2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.result;
                        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = 1;
                            Object withTimeout = withTimeout(j, function2, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1);
                            return withTimeout == obj2 ? obj2 : withTimeout;
                        }
                        if (i == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                if (i != 0) {
                }
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, baseContinuationImpl);
            Object obj3 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.result;
            Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public final float mo233toDpu2uoSUM(int i) {
            return this.$$delegate_0.mo233toDpu2uoSUM(i);
        }
    }
}
