package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$5$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.SequenceBuilderIterator;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import okio.internal.FileSystem$commonDeleteRecursively$sequence$1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class MouseWheelScrollingLogic extends NonTouchScrollingLogic {
    public final BufferedChannel channel;
    public final BiometricPrompt mouseWheelScrollConfig;
    public StandaloneCoroutine receivingMouseWheelEventsJob;

    public final class MouseWheelScrollDelta {
        public final boolean shouldApplyImmediately;
        public final long timeMillis;
        public final long value;

        public MouseWheelScrollDelta(boolean z, long j, long j2) {
            this.value = j;
            this.timeMillis = j2;
            this.shouldApplyImmediately = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
            return Offset.m622equalsimpl0(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.shouldApplyImmediately) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.value) * 31, 31, this.timeMillis);
        }

        public final MouseWheelScrollDelta plus(MouseWheelScrollDelta mouseWheelScrollDelta) {
            return new MouseWheelScrollDelta(this.shouldApplyImmediately, Offset.m626plusMKHz9U(this.value, mouseWheelScrollDelta.value), Math.max(this.timeMillis, mouseWheelScrollDelta.timeMillis));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
            sb.append((Object) Offset.m628toStringimpl(this.value));
            sb.append(", timeMillis=");
            sb.append(this.timeMillis);
            sb.append(", shouldApplyImmediately=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.shouldApplyImmediately, ')');
        }
    }

    public MouseWheelScrollingLogic(ScrollingLogic scrollingLogic, BiometricPrompt biometricPrompt, HeroCardViewKt$Render$1$5$1.AnonymousClass2.C00682 c00682, Density density) {
        super(scrollingLogic, c00682, density);
        this.mouseWheelScrollConfig = biometricPrompt;
        this.channel = PapaEvent.Channel$default(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0158, code lost:
    
        if (r0.invoke(r1, r10) != r11) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$dispatchMouseWheelScroll(MouseWheelScrollingLogic mouseWheelScrollingLogic, ScrollingLogic scrollingLogic, MouseWheelScrollDelta mouseWheelScrollDelta, float f, float f2, ContinuationImpl continuationImpl) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        int i;
        Ref$FloatRef ref$FloatRef;
        float f3;
        ScrollingLogic scrollingLogic2;
        long Velocity;
        MouseWheelScrollingLogic mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
        Recorder.AnonymousClass4 anonymousClass4 = mouseWheelScrollingLogic2.velocityTracker;
        if (continuationImpl instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) continuationImpl;
            int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.label = i2 - PKIFailureInfo.systemUnavail;
                MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$12 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
                Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    m.element = mouseWheelScrollDelta;
                    long j = mouseWheelScrollDelta.timeMillis;
                    long j2 = mouseWheelScrollDelta.value;
                    ((VelocityTracker1D) anonymousClass4.val$audioErrorConsumer).addDataPoint(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((VelocityTracker1D) anonymousClass4.this$0).addDataPoint(j, Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)));
                    MouseWheelScrollDelta sumOrNull = sumOrNull(mouseWheelScrollingLogic2.channel);
                    if (sumOrNull != null) {
                        long j3 = sumOrNull.timeMillis;
                        long j4 = sumOrNull.value;
                        ((VelocityTracker1D) anonymousClass4.val$audioErrorConsumer).addDataPoint(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                        ((VelocityTracker1D) anonymousClass4.this$0).addDataPoint(j3, Float.intBitsToFloat((int) (j4 & BodyPartID.bodyIdMax)));
                        m.element = ((MouseWheelScrollDelta) m.element).plus(sumOrNull);
                    }
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    float m247toFloatk4lQ0M = scrollingLogic.m247toFloatk4lQ0M(scrollingLogic.m246reverseIfNeededMKHz9U(((MouseWheelScrollDelta) m.element).value));
                    ref$FloatRef2.element = m247toFloatk4lQ0M;
                    if (Draggable2DKt.access$isLowScrollingDelta(m247toFloatk4lQ0M)) {
                        return Unit.INSTANCE;
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = AnimatableKt.AnimationState$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 30);
                    mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
                    MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(ref$FloatRef2, ref$ObjectRef, m, f, mouseWheelScrollingLogic2, f2, scrollingLogic, null);
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0 = scrollingLogic;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1 = ref$FloatRef2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.F$0 = f2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label = 1;
                    if (mouseWheelScrollingLogic2.userScroll$foundation(mouseWheelScrollingLogic$dispatchMouseWheelScroll$3, mouseWheelScrollingLogic$dispatchMouseWheelScroll$12) != coroutineSingletons) {
                        ref$FloatRef = ref$FloatRef2;
                        f3 = f2;
                        scrollingLogic2 = scrollingLogic;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.F$0;
                ref$FloatRef = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1;
                scrollingLogic2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0;
                SafeTrace.throwOnFailure(obj);
                Velocity = VelocityKt.Velocity(((VelocityTracker1D) anonymousClass4.val$audioErrorConsumer).calculateVelocity(Float.MAX_VALUE), ((VelocityTracker1D) anonymousClass4.this$0).calculateVelocity(Float.MAX_VALUE));
                if (Velocity.m1066equalsimpl0(Velocity)) {
                    float reverseIfNeeded = scrollingLogic2.reverseIfNeeded(Math.signum(ref$FloatRef.element)) * Math.min(Math.abs(ref$FloatRef.element) / 100.0f, f3) * 1000.0f;
                    Velocity = reverseIfNeeded == RecyclerView.DECELERATION_RATE ? 0L : scrollingLogic2.orientation == Orientation.Horizontal ? VelocityKt.Velocity(reverseIfNeeded, RecyclerView.DECELERATION_RATE) : VelocityKt.Velocity(RecyclerView.DECELERATION_RATE, reverseIfNeeded);
                }
                Function2 function2 = mouseWheelScrollingLogic2.onScrollStopped;
                Velocity velocity = new Velocity(Velocity);
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0 = null;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1 = null;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label = 2;
            }
        }
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(mouseWheelScrollingLogic2, continuationImpl);
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$122 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        Object obj2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.label;
        if (i != 0) {
        }
        Velocity = VelocityKt.Velocity(((VelocityTracker1D) anonymousClass4.val$audioErrorConsumer).calculateVelocity(Float.MAX_VALUE), ((VelocityTracker1D) anonymousClass4.this$0).calculateVelocity(Float.MAX_VALUE));
        if (Velocity.m1066equalsimpl0(Velocity)) {
        }
        Function2 function22 = mouseWheelScrollingLogic2.onScrollStopped;
        Velocity velocity2 = new Velocity(Velocity);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.L$0 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.L$1 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$dispatchMouseWheelScroll$waitNextScrollDelta(MouseWheelScrollingLogic mouseWheelScrollingLogic, Ref$ObjectRef ref$ObjectRef, Ref$FloatRef ref$FloatRef, ScrollingLogic scrollingLogic, Ref$ObjectRef ref$ObjectRef2, long j, ContinuationImpl continuationImpl) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;
        int i;
        ScrollingLogic scrollingLogic2;
        Ref$ObjectRef ref$ObjectRef3;
        MouseWheelScrollingLogic mouseWheelScrollingLogic2;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$FloatRef ref$FloatRef2;
        MouseWheelScrollDelta mouseWheelScrollDelta;
        boolean z;
        if (continuationImpl instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) continuationImpl;
            int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (j < 0) {
                        return Boolean.FALSE;
                    }
                    ThumbNode$onAttach$1 thumbNode$onAttach$1 = new ThumbNode$onAttach$1(mouseWheelScrollingLogic, continuation, 17);
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$0 = mouseWheelScrollingLogic;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$1 = ref$ObjectRef;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$2 = ref$FloatRef;
                    scrollingLogic2 = scrollingLogic;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$3 = scrollingLogic2;
                    ref$ObjectRef3 = ref$ObjectRef2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$4 = ref$ObjectRef3;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label = 1;
                    obj = JobKt.withTimeoutOrNull(j, thumbNode$onAttach$1, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
                    ref$ObjectRef4 = ref$ObjectRef;
                    ref$FloatRef2 = ref$FloatRef;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$ObjectRef ref$ObjectRef5 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$4;
                    ScrollingLogic scrollingLogic3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$3;
                    ref$FloatRef2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$2;
                    ref$ObjectRef4 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$1;
                    MouseWheelScrollingLogic mouseWheelScrollingLogic3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ref$ObjectRef3 = ref$ObjectRef5;
                    scrollingLogic2 = scrollingLogic3;
                    mouseWheelScrollingLogic2 = mouseWheelScrollingLogic3;
                }
                mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
                if (mouseWheelScrollDelta == null) {
                    boolean z2 = ((MouseWheelScrollDelta) ref$ObjectRef4.element).shouldApplyImmediately;
                    long j2 = mouseWheelScrollDelta.value;
                    ref$ObjectRef4.element = new MouseWheelScrollDelta(z2, j2, mouseWheelScrollDelta.timeMillis);
                    ref$FloatRef2.element = scrollingLogic2.m249toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic2.m246reverseIfNeededMKHz9U(j2));
                    ref$ObjectRef3.element = AnimatableKt.AnimationState$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 30);
                    Recorder.AnonymousClass4 anonymousClass4 = mouseWheelScrollingLogic2.velocityTracker;
                    long j3 = mouseWheelScrollDelta.timeMillis;
                    long j4 = mouseWheelScrollDelta.value;
                    ((VelocityTracker1D) anonymousClass4.val$audioErrorConsumer).addDataPoint(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                    ((VelocityTracker1D) anonymousClass4.this$0).addDataPoint(j3, Float.intBitsToFloat((int) (j4 & BodyPartID.bodyIdMax)));
                    z = !Draggable2DKt.access$isLowScrollingDelta(ref$FloatRef2.element);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(continuationImpl);
        Object obj2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        mouseWheelScrollDelta = (MouseWheelScrollDelta) obj2;
        if (mouseWheelScrollDelta == null) {
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MouseWheelScrollDelta sumOrNull(BufferedChannel bufferedChannel) {
        MouseWheelScrollDelta mouseWheelScrollDelta = null;
        SequenceBuilderIterator it = SequencesKt__SequenceBuilderKt.iterator(new FileSystem$commonDeleteRecursively$sequence$1(new TrackpadScrollingLogic$$ExternalSyntheticLambda0(bufferedChannel, 1), 0 == true ? 1 : 0, 2));
        while (it.hasNext()) {
            MouseWheelScrollDelta mouseWheelScrollDelta2 = (MouseWheelScrollDelta) it.next();
            if (mouseWheelScrollDelta != null) {
                mouseWheelScrollDelta2 = mouseWheelScrollDelta.plus(mouseWheelScrollDelta2);
            }
            mouseWheelScrollDelta = mouseWheelScrollDelta2;
        }
        return mouseWheelScrollDelta;
    }

    public final float dispatchMouseWheelScroll(ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1, float f) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        long m248toOffsettuRUvjQ = scrollingLogic.m248toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f));
        ScrollingLogic scrollingLogic2 = scrollingLogic$nestedScrollScope$1.this$0;
        return scrollingLogic.m247toFloatk4lQ0M(scrollingLogic.m246reverseIfNeededMKHz9U(scrollingLogic2.m245performScroll3eAAhYA(scrollingLogic2.outerStateScope, m248toOffsettuRUvjQ, 1)));
    }

    /* renamed from: onMouseWheel-O0kMr_c, reason: not valid java name */
    public final boolean m227onMouseWheelO0kMr_c(PointerEvent pointerEvent) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.mouseWheelScrollConfig.mClientFragmentManager;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = pointerEvent.changes;
        Offset offset = new Offset(0L);
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            j = offset.packedValue;
            if (i >= size) {
                break;
            }
            offset = new Offset(Offset.m626plusMKHz9U(j, ((PointerInputChange) list.get(i)).scrollDelta));
            i++;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) * f) & BodyPartID.bodyIdMax);
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        float m249toSingleAxisDeltaFromAnglek4lQ0M = scrollingLogic.m249toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m246reverseIfNeededMKHz9U(floatToRawIntBits));
        if (m249toSingleAxisDeltaFromAnglek4lQ0M != RecyclerView.DECELERATION_RATE) {
            ScrollableState scrollableState = scrollingLogic.scrollableState;
            z = m249toSingleAxisDeltaFromAnglek4lQ0M > RecyclerView.DECELERATION_RATE ? scrollableState.getCanScrollForward() : scrollableState.getCanScrollBackward();
        }
        if (z) {
            return !(this.channel.mo1159trySendJP2dKIU(new MouseWheelScrollDelta(false, floatToRawIntBits, ((PointerInputChange) CollectionsKt.first(pointerEvent.changes)).uptimeMillis)) instanceof ChannelResult.Failed);
        }
        return this.isScrolling;
    }

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void m228onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEvent.f858type == 6) {
            List list = pointerEvent.changes;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((PointerInputChange) list.get(i)).isConsumed()) {
                    return;
                }
            }
            if (pointerEventPass == PointerEventPass.Initial && this.isScrolling) {
                m227onMouseWheelO0kMr_c(pointerEvent);
                NonTouchScrollingLogic.consume$foundation(pointerEvent);
            }
            if (pointerEventPass == PointerEventPass.Main && !this.isScrolling && m227onMouseWheelO0kMr_c(pointerEvent)) {
                NonTouchScrollingLogic.consume$foundation(pointerEvent);
            }
        }
    }

    public final void startReceivingEvents(CoroutineScope coroutineScope) {
        if (this.receivingMouseWheelEventsJob == null) {
            this.receivingMouseWheelEventsJob = JobKt.launch$default(coroutineScope, null, null, new VirtualCameraState$connect$2$1(this, (Continuation) null, 20), 3);
        }
    }
}
