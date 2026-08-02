package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n3$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.math.MathKt__MathJVMKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ref$ObjectRef $animationState;
    public final /* synthetic */ float $speed;
    public final /* synthetic */ Ref$ObjectRef $targetScrollDelta;
    public final /* synthetic */ Ref$FloatRef $targetValue;
    public final /* synthetic */ ScrollingLogic $this_dispatchMouseWheelScroll;
    public final /* synthetic */ float $threshold;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Ref$BooleanRef L$1;
    public Ref$BooleanRef L$2;
    public int label;
    public final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(Ref$FloatRef ref$FloatRef, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, float f, MouseWheelScrollingLogic mouseWheelScrollingLogic, float f2, ScrollingLogic scrollingLogic, Continuation continuation) {
        super(2, continuation);
        this.$targetValue = ref$FloatRef;
        this.$animationState = ref$ObjectRef;
        this.$targetScrollDelta = ref$ObjectRef2;
        this.$threshold = f;
        this.this$0 = mouseWheelScrollingLogic;
        this.$speed = f2;
        this.$this_dispatchMouseWheelScroll = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, continuation);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) create((ScrollingLogic$nestedScrollScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x017c -> B:7:0x017d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0190 -> B:9:0x0077). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1;
        Ref$BooleanRef ref$BooleanRef;
        Ref$FloatRef ref$FloatRef;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$BooleanRef ref$BooleanRef2;
        int i;
        int i2;
        int i3;
        ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$12;
        int i4;
        MouseWheelScrollingLogic mouseWheelScrollingLogic;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$BooleanRef ref$BooleanRef3;
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label;
        Ref$ObjectRef ref$ObjectRef4 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetScrollDelta;
        Ref$BooleanRef ref$BooleanRef4 = null;
        MouseWheelScrollingLogic mouseWheelScrollingLogic2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.this$0;
        Ref$FloatRef ref$FloatRef2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetValue;
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        Ref$ObjectRef ref$ObjectRef5 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$animationState;
        if (i5 == 0) {
            SafeTrace.throwOnFailure(obj);
            scrollingLogic$nestedScrollScope$1 = (ScrollingLogic$nestedScrollScope$1) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            Ref$BooleanRef ref$BooleanRef5 = new Ref$BooleanRef();
            ref$BooleanRef5.element = true;
            ref$BooleanRef = ref$BooleanRef5;
            if (!ref$BooleanRef.element) {
            }
        } else if (i5 == 1) {
            Ref$BooleanRef ref$BooleanRef6 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2;
            Ref$BooleanRef ref$BooleanRef7 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1;
            ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$13 = (ScrollingLogic$nestedScrollScope$1) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            SafeTrace.throwOnFailure(obj);
            i2 = 2;
            ref$ObjectRef3 = ref$ObjectRef5;
            mouseWheelScrollingLogic = mouseWheelScrollingLogic2;
            scrollingLogic$nestedScrollScope$12 = scrollingLogic$nestedScrollScope$13;
            i3 = 3;
            ref$BooleanRef3 = null;
            ref$BooleanRef6.element = ((Boolean) obj).booleanValue();
            ref$BooleanRef = ref$BooleanRef7;
            i8 = 1;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
            ref$BooleanRef4 = ref$BooleanRef3;
            i6 = i3;
            mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
            scrollingLogic$nestedScrollScope$1 = scrollingLogic$nestedScrollScope$12;
            ref$ObjectRef5 = ref$ObjectRef3;
            i7 = i2;
            if (!ref$BooleanRef.element) {
            }
        } else if (i5 == 2) {
            i4 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.I$0;
            Ref$BooleanRef ref$BooleanRef8 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1;
            ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$14 = (ScrollingLogic$nestedScrollScope$1) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            SafeTrace.throwOnFailure(obj);
            ref$ObjectRef = ref$ObjectRef4;
            ref$FloatRef = ref$FloatRef2;
            i2 = 2;
            i = 1;
            ref$ObjectRef2 = ref$ObjectRef5;
            ref$BooleanRef2 = ref$BooleanRef8;
            scrollingLogic$nestedScrollScope$12 = scrollingLogic$nestedScrollScope$14;
            i3 = 3;
            if (ref$BooleanRef2.element) {
            }
        } else {
            if (i5 != 3) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$BooleanRef ref$BooleanRef9 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2;
            Ref$BooleanRef ref$BooleanRef10 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1;
            ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$15 = (ScrollingLogic$nestedScrollScope$1) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            SafeTrace.throwOnFailure(obj);
            ref$BooleanRef2 = ref$BooleanRef9;
            i2 = 2;
            i = 1;
            ref$ObjectRef3 = ref$ObjectRef5;
            mouseWheelScrollingLogic = mouseWheelScrollingLogic2;
            Ref$BooleanRef ref$BooleanRef11 = ref$BooleanRef10;
            scrollingLogic$nestedScrollScope$12 = scrollingLogic$nestedScrollScope$15;
            i3 = 3;
            ref$BooleanRef3 = null;
            Object access$dispatchMouseWheelScroll$waitNextScrollDelta = obj;
            ref$BooleanRef2.element = ((Boolean) access$dispatchMouseWheelScroll$waitNextScrollDelta).booleanValue();
            int i9 = i;
            ref$BooleanRef = ref$BooleanRef11;
            i8 = i9;
            ref$BooleanRef4 = ref$BooleanRef3;
            i6 = i3;
            mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
            scrollingLogic$nestedScrollScope$1 = scrollingLogic$nestedScrollScope$12;
            ref$ObjectRef5 = ref$ObjectRef3;
            i7 = i2;
            if (!ref$BooleanRef.element) {
                ref$BooleanRef.element = false;
                float floatValue = ref$FloatRef2.element - ((Number) ((AnimationState) ref$ObjectRef5.element).value$delegate.getValue()).floatValue();
                if (!((MouseWheelScrollingLogic.MouseWheelScrollDelta) ref$ObjectRef4.element).shouldApplyImmediately) {
                    float abs = Math.abs(floatValue);
                    float f = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$threshold;
                    if (abs >= f) {
                        float signum = Math.signum(floatValue) * f;
                        mouseWheelScrollingLogic2.dispatchMouseWheelScroll(scrollingLogic$nestedScrollScope$1, signum);
                        AnimationState animationState = (AnimationState) ref$ObjectRef5.element;
                        AnimationState copy$default = AnimatableKt.copy$default(animationState, ((Number) animationState.value$delegate.getValue()).floatValue() + signum, RecyclerView.DECELERATION_RATE, 30);
                        ref$ObjectRef5.element = copy$default;
                        int roundToInt = MathKt__MathJVMKt.roundToInt(Math.abs(ref$FloatRef2.element - ((Number) copy$default.value$delegate.getValue()).floatValue()) / mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$speed);
                        if (roundToInt > 100) {
                            roundToInt = 100;
                        }
                        AnimationState animationState2 = (AnimationState) ref$ObjectRef5.element;
                        float f2 = ref$FloatRef2.element;
                        Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef4;
                        Ref$FloatRef ref$FloatRef3 = ref$FloatRef2;
                        ref$ObjectRef2 = ref$ObjectRef5;
                        OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(mouseWheelScrollingLogic2, ref$ObjectRef6, ref$FloatRef3, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$this_dispatchMouseWheelScroll, ref$BooleanRef, 2);
                        ref$ObjectRef = ref$ObjectRef6;
                        ref$FloatRef = ref$FloatRef3;
                        ref$BooleanRef2 = ref$BooleanRef;
                        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = scrollingLogic$nestedScrollScope$1;
                        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1 = ref$BooleanRef2;
                        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2 = ref$BooleanRef4;
                        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.I$0 = roundToInt;
                        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label = i7;
                        MouseWheelScrollingLogic mouseWheelScrollingLogic3 = mouseWheelScrollingLogic2;
                        Ref$FloatRef ref$FloatRef4 = new Ref$FloatRef();
                        ref$FloatRef4.element = ((Number) animationState2.value$delegate.getValue()).floatValue();
                        ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$16 = scrollingLogic$nestedScrollScope$1;
                        Float f3 = new Float(f2);
                        TweenSpec tween$default = AnimatableKt.tween$default(roundToInt, 0, EasingKt.LinearEasing, i7);
                        n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0(ref$FloatRef4, mouseWheelScrollingLogic3, scrollingLogic$nestedScrollScope$16, overlayKt$$ExternalSyntheticLambda3, 3);
                        mouseWheelScrollingLogic2 = mouseWheelScrollingLogic3;
                        scrollingLogic$nestedScrollScope$12 = scrollingLogic$nestedScrollScope$16;
                        int i10 = roundToInt;
                        i2 = i7;
                        i3 = 3;
                        i = 1;
                        Object animateTo = AnimatableKt.animateTo(animationState2, f3, tween$default, true, n3__externalsyntheticlambda0, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
                        if (animateTo != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            animateTo = Unit.INSTANCE;
                        }
                        if (animateTo != coroutineSingletons) {
                            i4 = i10;
                            if (ref$BooleanRef2.element) {
                                long j = 50 - i4;
                                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = scrollingLogic$nestedScrollScope$12;
                                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1 = ref$BooleanRef2;
                                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2 = ref$BooleanRef2;
                                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label = i3;
                                mouseWheelScrollingLogic = mouseWheelScrollingLogic2;
                                ref$ObjectRef3 = ref$ObjectRef2;
                                ref$BooleanRef3 = ref$BooleanRef4;
                                ref$ObjectRef4 = ref$ObjectRef;
                                ref$FloatRef2 = ref$FloatRef;
                                access$dispatchMouseWheelScroll$waitNextScrollDelta = MouseWheelScrollingLogic.access$dispatchMouseWheelScroll$waitNextScrollDelta(mouseWheelScrollingLogic, ref$ObjectRef4, ref$FloatRef2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$this_dispatchMouseWheelScroll, ref$ObjectRef3, j, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
                                if (access$dispatchMouseWheelScroll$waitNextScrollDelta != coroutineSingletons) {
                                    ref$BooleanRef11 = ref$BooleanRef2;
                                    ref$BooleanRef2.element = ((Boolean) access$dispatchMouseWheelScroll$waitNextScrollDelta).booleanValue();
                                    int i92 = i;
                                    ref$BooleanRef = ref$BooleanRef11;
                                    i8 = i92;
                                    ref$BooleanRef4 = ref$BooleanRef3;
                                    i6 = i3;
                                    mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
                                    scrollingLogic$nestedScrollScope$1 = scrollingLogic$nestedScrollScope$12;
                                    ref$ObjectRef5 = ref$ObjectRef3;
                                    i7 = i2;
                                    if (!ref$BooleanRef.element) {
                                        return Unit.INSTANCE;
                                    }
                                }
                            } else {
                                scrollingLogic$nestedScrollScope$1 = scrollingLogic$nestedScrollScope$12;
                                i6 = i3;
                                i7 = i2;
                                i8 = i;
                                ref$BooleanRef = ref$BooleanRef2;
                                ref$ObjectRef5 = ref$ObjectRef2;
                                ref$ObjectRef4 = ref$ObjectRef;
                                ref$FloatRef2 = ref$FloatRef;
                                if (!ref$BooleanRef.element) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                i3 = i6;
                i2 = i7;
                ref$ObjectRef3 = ref$ObjectRef5;
                Ref$BooleanRef ref$BooleanRef12 = ref$BooleanRef;
                scrollingLogic$nestedScrollScope$12 = scrollingLogic$nestedScrollScope$1;
                int i11 = i8;
                mouseWheelScrollingLogic = mouseWheelScrollingLogic2;
                ref$BooleanRef3 = ref$BooleanRef4;
                mouseWheelScrollingLogic.dispatchMouseWheelScroll(scrollingLogic$nestedScrollScope$12, floatValue);
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = scrollingLogic$nestedScrollScope$12;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1 = ref$BooleanRef12;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2 = ref$BooleanRef12;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label = i11;
                Object access$dispatchMouseWheelScroll$waitNextScrollDelta2 = MouseWheelScrollingLogic.access$dispatchMouseWheelScroll$waitNextScrollDelta(mouseWheelScrollingLogic, ref$ObjectRef4, ref$FloatRef2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$this_dispatchMouseWheelScroll, ref$ObjectRef3, 50L, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
                if (access$dispatchMouseWheelScroll$waitNextScrollDelta2 != coroutineSingletons) {
                    ref$BooleanRef12.element = ((Boolean) access$dispatchMouseWheelScroll$waitNextScrollDelta2).booleanValue();
                    ref$BooleanRef = ref$BooleanRef12;
                    i8 = i11;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
                    ref$BooleanRef4 = ref$BooleanRef3;
                    i6 = i3;
                    mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
                    scrollingLogic$nestedScrollScope$1 = scrollingLogic$nestedScrollScope$12;
                    ref$ObjectRef5 = ref$ObjectRef3;
                    i7 = i2;
                    if (!ref$BooleanRef.element) {
                    }
                }
                return coroutineSingletons;
            }
        }
    }
}
