package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* compiled from: MouseWheelScrollingLogic.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001ABR\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00121\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#H\u0016J\u001f\u0010$\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'J\u0014\u0010(\u001a\u0004\u0018\u00010\u001e*\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\u001b\u0010)\u001a\u00020%*\u00020\u00032\u0006\u0010*\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u001eH\u0002J*\u0010/\u001a\u00020\r*\u00020\u00032\u0006\u0010*\u001a\u00020\u001e2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0082@¢\u0006\u0002\u00103JY\u00104\u001a\u00020\r*\u0002052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u0002012\u0006\u0010:\u001a\u00020;2!\u0010<\u001a\u001d\u0012\u0013\u0012\u001101¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020%0=H\u0082@¢\u0006\u0002\u0010?J\u0014\u0010/\u001a\u000201*\u0002052\u0006\u0010@\u001a\u000201H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "Landroidx/compose/foundation/gestures/NonTouchScrollingLogic;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "mouseWheelScrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "onScrollStopped", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Velocity;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "velocity", "Lkotlin/coroutines/Continuation;", "", "", "density", "Landroidx/compose/ui/unit/Density;", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/unit/Density;)V", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "receivingMouseWheelEventsJob", "Lkotlinx/coroutines/Job;", "startReceivingEvents", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "onMouseWheel", "", "onMouseWheel-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "sumOrNull", "canConsumeDelta", "scrollDelta", "Landroidx/compose/ui/geometry/Offset;", "canConsumeDelta-Uv8p0NA", "(Landroidx/compose/foundation/gestures/ScrollingLogic;J)Z", "trackVelocity", "dispatchMouseWheelScroll", "threshold", "", "speed", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateMouseWheelScroll", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "animationState", "Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/AnimationVector1D;", "targetValue", "durationMillis", "", "shouldCancelAnimation", "Lkotlin/Function1;", "lastValue", "(Landroidx/compose/foundation/gestures/NestedScrollScope;Landroidx/compose/animation/core/AnimationState;FILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "MouseWheelScrollDelta", "foundation"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic extends NonTouchScrollingLogic {
    public static final int $stable = 8;
    private final Channel<MouseWheelScrollDelta> channel;
    private final ScrollConfig mouseWheelScrollConfig;
    private Job receivingMouseWheelEventsJob;

    public MouseWheelScrollingLogic(ScrollingLogic scrollingLogic, ScrollConfig scrollConfig, Function2<? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function2, Density density) {
        super(scrollingLogic, function2, density);
        this.mouseWheelScrollConfig = scrollConfig;
        this.channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    }

    @Override // androidx.compose.foundation.gestures.NonTouchScrollingLogic
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo667onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        if (PointerEventType.m8090equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m8105getScroll7fucELk())) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                if (changes.get(i).isConsumed()) {
                    return;
                }
            }
            if (pass == PointerEventPass.Initial && getIsScrolling()) {
                m666onMouseWheelO0kMr_c(pointerEvent, bounds);
                consume$foundation(pointerEvent);
            }
            if (pass == PointerEventPass.Main && !getIsScrolling() && m666onMouseWheelO0kMr_c(pointerEvent, bounds)) {
                consume$foundation(pointerEvent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MouseWheelScrollingLogic.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "", "value", "Landroidx/compose/ui/geometry/Offset;", "timeMillis", "", "shouldApplyImmediately", "", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue-F1C5BW0", "()J", "J", "getTimeMillis", "getShouldApplyImmediately", "()Z", "plus", "other", "component1", "component1-F1C5BW0", "component2", "component3", "copy", "copy-9KIMszo", "(JJZ)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "equals", "hashCode", "", "toString", "", "foundation"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    static final /* data */ class MouseWheelScrollDelta {
        private final boolean shouldApplyImmediately;
        private final long timeMillis;
        private final long value;

        public /* synthetic */ MouseWheelScrollDelta(long j, long j2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z);
        }

        /* renamed from: copy-9KIMszo$default, reason: not valid java name */
        public static /* synthetic */ MouseWheelScrollDelta m668copy9KIMszo$default(MouseWheelScrollDelta mouseWheelScrollDelta, long j, long j2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = mouseWheelScrollDelta.value;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = mouseWheelScrollDelta.timeMillis;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                z = mouseWheelScrollDelta.shouldApplyImmediately;
            }
            return mouseWheelScrollDelta.m670copy9KIMszo(j3, j4, z);
        }

        /* renamed from: component1-F1C5BW0, reason: not valid java name and from getter */
        public final long getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        /* renamed from: copy-9KIMszo, reason: not valid java name */
        public final MouseWheelScrollDelta m670copy9KIMszo(long value, long timeMillis, boolean shouldApplyImmediately) {
            return new MouseWheelScrollDelta(value, timeMillis, shouldApplyImmediately, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) other;
            return Offset.m6516equalsimpl0(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        public int hashCode() {
            return (((Offset.m6521hashCodeimpl(this.value) * 31) + UByte$$ExternalSyntheticBackport0.m(this.timeMillis)) * 31) + UByte$$ExternalSyntheticBackport0.m(this.shouldApplyImmediately);
        }

        public String toString() {
            return "MouseWheelScrollDelta(value=" + ((Object) Offset.m6527toStringimpl(this.value)) + ", timeMillis=" + this.timeMillis + ", shouldApplyImmediately=" + this.shouldApplyImmediately + ')';
        }

        private MouseWheelScrollDelta(long j, long j2, boolean z) {
            this.value = j;
            this.timeMillis = j2;
            this.shouldApplyImmediately = z;
        }

        /* renamed from: getValue-F1C5BW0, reason: not valid java name */
        public final long m671getValueF1C5BW0() {
            return this.value;
        }

        public final long getTimeMillis() {
            return this.timeMillis;
        }

        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        public final MouseWheelScrollDelta plus(MouseWheelScrollDelta other) {
            return new MouseWheelScrollDelta(Offset.m6524plusMKHz9U(this.value, other.value), Math.max(this.timeMillis, other.timeMillis), this.shouldApplyImmediately, null);
        }
    }

    @Override // androidx.compose.foundation.gestures.NonTouchScrollingLogic
    public void startReceivingEvents(CoroutineScope coroutineScope) {
        Job launch$default;
        if (this.receivingMouseWheelEventsJob == null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MouseWheelScrollingLogic$startReceivingEvents$1(this, null), 3, null);
            this.receivingMouseWheelEventsJob = launch$default;
        }
    }

    /* renamed from: onMouseWheel-O0kMr_c, reason: not valid java name */
    private final boolean m666onMouseWheelO0kMr_c(PointerEvent pointerEvent, long bounds) {
        long mo557calculateMouseWheelScroll8xgXZGE = this.mouseWheelScrollConfig.mo557calculateMouseWheelScroll8xgXZGE(getDensity(), pointerEvent, bounds);
        if (m665canConsumeDeltaUv8p0NA(getScrollingLogic(), mo557calculateMouseWheelScroll8xgXZGE)) {
            return ChannelResult.m12015isSuccessimpl(this.channel.mo11990trySendJP2dKIU(new MouseWheelScrollDelta(mo557calculateMouseWheelScroll8xgXZGE, ((PointerInputChange) CollectionsKt.first((List) pointerEvent.getChanges())).getUptimeMillis(), !this.mouseWheelScrollConfig.isSmoothScrollingEnabled() || this.mouseWheelScrollConfig.isPreciseWheelScroll(pointerEvent), null)));
        }
        return getIsScrolling();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MouseWheelScrollDelta sumOrNull(final Channel<MouseWheelScrollDelta> channel) {
        MouseWheelScrollDelta mouseWheelScrollDelta = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta2 : NonTouchScrollingLogicKt.untilNull(new Function0() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MouseWheelScrollingLogic.MouseWheelScrollDelta sumOrNull$lambda$0;
                sumOrNull$lambda$0 = MouseWheelScrollingLogic.sumOrNull$lambda$0(Channel.this);
                return sumOrNull$lambda$0;
            }
        })) {
            mouseWheelScrollDelta = mouseWheelScrollDelta == null ? mouseWheelScrollDelta2 : mouseWheelScrollDelta.plus(mouseWheelScrollDelta2);
        }
        return mouseWheelScrollDelta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MouseWheelScrollDelta sumOrNull$lambda$0(Channel channel) {
        return (MouseWheelScrollDelta) ChannelResult.m12010getOrNullimpl(channel.mo11998tryReceivePtdJZtk());
    }

    /* renamed from: canConsumeDelta-Uv8p0NA, reason: not valid java name */
    private final boolean m665canConsumeDeltaUv8p0NA(ScrollingLogic scrollingLogic, long j) {
        float m739toSingleAxisDeltaFromAnglek4lQ0M = scrollingLogic.m739toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m735reverseIfNeededMKHz9U(j));
        if (m739toSingleAxisDeltaFromAnglek4lQ0M == 0.0f) {
            return false;
        }
        if (m739toSingleAxisDeltaFromAnglek4lQ0M > 0.0f) {
            return scrollingLogic.getScrollableState().getCanScrollForward();
        }
        return scrollingLogic.getScrollableState().getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVelocity(MouseWheelScrollDelta scrollDelta) {
        getVelocityTracker().m583addDeltaUv8p0NA(scrollDelta.getTimeMillis(), scrollDelta.m671getValueF1C5BW0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010f, code lost:
    
        if (r0.invoke(r1, r9) != r10) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, androidx.compose.animation.core.AnimationState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dispatchMouseWheelScroll(ScrollingLogic scrollingLogic, MouseWheelScrollDelta mouseWheelScrollDelta, float f, float f2, Continuation<? super Unit> continuation) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        int i;
        boolean isLowScrollingDelta;
        Ref.FloatRef floatRef;
        float f3;
        ScrollingLogic scrollingLogic2;
        long m584calculateVelocity9UxMQ8M;
        if (continuation instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) continuation;
            if ((mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.label & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.label -= Integer.MIN_VALUE;
                MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$12 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
                Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = mouseWheelScrollDelta;
                    trackVelocity(mouseWheelScrollDelta);
                    MouseWheelScrollDelta sumOrNull = sumOrNull(this.channel);
                    if (sumOrNull != null) {
                        trackVelocity(sumOrNull);
                        objectRef.element = ((MouseWheelScrollDelta) objectRef.element).plus(sumOrNull);
                    }
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    floatRef2.element = scrollingLogic.m737toFloatk4lQ0M(scrollingLogic.m735reverseIfNeededMKHz9U(((MouseWheelScrollDelta) objectRef.element).m671getValueF1C5BW0()));
                    isLowScrollingDelta = MouseWheelScrollingLogicKt.isLowScrollingDelta(floatRef2.element);
                    if (isLowScrollingDelta) {
                        return Unit.INSTANCE;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
                    Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(floatRef2, objectRef2, objectRef, f, this, f2, scrollingLogic, null);
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0 = scrollingLogic;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1 = floatRef2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.F$0 = f2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label = 1;
                    if (userScroll$foundation(mouseWheelScrollingLogic$dispatchMouseWheelScroll$3, mouseWheelScrollingLogic$dispatchMouseWheelScroll$12) != coroutine_suspended) {
                        floatRef = floatRef2;
                        f3 = f2;
                        scrollingLogic2 = scrollingLogic;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                f3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.F$0;
                floatRef = (Ref.FloatRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1;
                scrollingLogic2 = (ScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0;
                ResultKt.throwOnFailure(obj);
                m584calculateVelocity9UxMQ8M = getVelocityTracker().m584calculateVelocity9UxMQ8M();
                if (Velocity.m9973equalsimpl0(m584calculateVelocity9UxMQ8M, Velocity.INSTANCE.m9985getZero9UxMQ8M())) {
                    m584calculateVelocity9UxMQ8M = scrollingLogic2.m740toVelocityadjELrA(scrollingLogic2.reverseIfNeeded(Math.signum(floatRef.element)) * Math.min(Math.abs(floatRef.element) / 100, f3) * 1000);
                }
                Function2<Velocity, Continuation<? super Unit>, Object> onScrollStopped = getOnScrollStopped();
                Velocity m9965boximpl = Velocity.m9965boximpl(m584calculateVelocity9UxMQ8M);
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0 = null;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1 = null;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label = 2;
            }
        }
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(this, continuation);
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$122 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        Object obj2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.label;
        if (i != 0) {
        }
        m584calculateVelocity9UxMQ8M = getVelocityTracker().m584calculateVelocity9UxMQ8M();
        if (Velocity.m9973equalsimpl0(m584calculateVelocity9UxMQ8M, Velocity.INSTANCE.m9985getZero9UxMQ8M())) {
        }
        Function2<Velocity, Continuation<? super Unit>, Object> onScrollStopped2 = getOnScrollStopped();
        Velocity m9965boximpl2 = Velocity.m9965boximpl(m584calculateVelocity9UxMQ8M);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.L$0 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.L$1 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object dispatchMouseWheelScroll$waitNextScrollDelta(MouseWheelScrollingLogic mouseWheelScrollingLogic, Ref.ObjectRef<MouseWheelScrollDelta> objectRef, Ref.FloatRef floatRef, ScrollingLogic scrollingLogic, Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef2, long j, Continuation<? super Boolean> continuation) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;
        int i;
        Ref.FloatRef floatRef2;
        ScrollingLogic scrollingLogic2;
        Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef3;
        Ref.ObjectRef<MouseWheelScrollDelta> objectRef4;
        MouseWheelScrollDelta mouseWheelScrollDelta;
        boolean isLowScrollingDelta;
        MouseWheelScrollingLogic mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
        if (continuation instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) continuation;
            if ((mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label -= Integer.MIN_VALUE;
                Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
                boolean z = false;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (j < 0) {
                        return Boxing.boxBoolean(false);
                    }
                    MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(mouseWheelScrollingLogic2, null);
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$0 = mouseWheelScrollingLogic2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$1 = objectRef;
                    floatRef2 = floatRef;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$2 = floatRef2;
                    scrollingLogic2 = scrollingLogic;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$3 = scrollingLogic2;
                    objectRef3 = objectRef2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$4 = objectRef3;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label = 1;
                    obj = TimeoutKt.withTimeoutOrNull(j, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef4 = objectRef;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef5 = (Ref.ObjectRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$4;
                    ScrollingLogic scrollingLogic3 = (ScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$3;
                    Ref.FloatRef floatRef3 = (Ref.FloatRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$2;
                    objectRef4 = (Ref.ObjectRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$1;
                    MouseWheelScrollingLogic mouseWheelScrollingLogic3 = (MouseWheelScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    objectRef3 = objectRef5;
                    scrollingLogic2 = scrollingLogic3;
                    floatRef2 = floatRef3;
                    mouseWheelScrollingLogic2 = mouseWheelScrollingLogic3;
                }
                mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
                if (mouseWheelScrollDelta != null) {
                    objectRef4.element = MouseWheelScrollDelta.m668copy9KIMszo$default(mouseWheelScrollDelta, 0L, 0L, objectRef4.element.getShouldApplyImmediately(), 3, null);
                    floatRef2.element = scrollingLogic2.m739toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic2.m735reverseIfNeededMKHz9U(objectRef4.element.m671getValueF1C5BW0()));
                    objectRef3.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
                    mouseWheelScrollingLogic2.trackVelocity(mouseWheelScrollDelta);
                    isLowScrollingDelta = MouseWheelScrollingLogicKt.isLowScrollingDelta(floatRef2.element);
                    z = !isLowScrollingDelta;
                }
                return Boxing.boxBoolean(z);
            }
        }
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(continuation);
        Object obj2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        mouseWheelScrollDelta = (MouseWheelScrollDelta) obj2;
        if (mouseWheelScrollDelta != null) {
        }
        return Boxing.boxBoolean(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateMouseWheelScroll(final NestedScrollScope nestedScrollScope, AnimationState<Float, AnimationVector1D> animationState, float f, int i, final Function1<? super Float, Boolean> function1, Continuation<? super Unit> continuation) {
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = animationState.getValue().floatValue();
        Object animateTo = SuspendAnimationKt.animateTo(animationState, Boxing.boxFloat(f), AnimationSpecKt.tween$default(i, 0, EasingKt.getLinearEasing(), 2, null), true, new Function1() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit animateMouseWheelScroll$lambda$0;
                animateMouseWheelScroll$lambda$0 = MouseWheelScrollingLogic.animateMouseWheelScroll$lambda$0(Ref.FloatRef.this, this, nestedScrollScope, function1, (AnimationScope) obj);
                return animateMouseWheelScroll$lambda$0;
            }
        }, continuation);
        return animateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit animateMouseWheelScroll$lambda$0(Ref.FloatRef floatRef, MouseWheelScrollingLogic mouseWheelScrollingLogic, NestedScrollScope nestedScrollScope, Function1 function1, AnimationScope animationScope) {
        boolean isLowScrollingDelta;
        boolean isLowScrollingDelta2;
        float floatValue = ((Number) animationScope.getValue()).floatValue() - floatRef.element;
        isLowScrollingDelta = MouseWheelScrollingLogicKt.isLowScrollingDelta(floatValue);
        if (!isLowScrollingDelta) {
            isLowScrollingDelta2 = MouseWheelScrollingLogicKt.isLowScrollingDelta(floatValue - mouseWheelScrollingLogic.dispatchMouseWheelScroll(nestedScrollScope, floatValue));
            if (!isLowScrollingDelta2) {
                animationScope.cancelAnimation();
                return Unit.INSTANCE;
            }
            floatRef.element += floatValue;
        }
        if (((Boolean) function1.invoke(Float.valueOf(floatRef.element))).booleanValue()) {
            animationScope.cancelAnimation();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float dispatchMouseWheelScroll(NestedScrollScope nestedScrollScope, float f) {
        ScrollingLogic scrollingLogic = getScrollingLogic();
        return scrollingLogic.m737toFloatk4lQ0M(scrollingLogic.m735reverseIfNeededMKHz9U(nestedScrollScope.mo672scrollByOzD1aCk(scrollingLogic.m738toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f)), NestedScrollSource.INSTANCE.m8018getUserInputWNlRxjI())));
    }
}
