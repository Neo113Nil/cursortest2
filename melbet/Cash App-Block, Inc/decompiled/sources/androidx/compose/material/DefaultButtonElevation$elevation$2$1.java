package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.DragInteraction$Start;
import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.squareup.cash.wallet.views.CardLockViewKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class DefaultButtonElevation$elevation$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Animatable $animatable;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ Object $interaction;
    public final /* synthetic */ int $r8$classId;
    public float $target;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultButtonElevation$elevation$2$1(Animatable animatable, float f, boolean z, Object obj, Interaction interaction, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$animatable = animatable;
        this.$target = f;
        this.$enabled = z;
        this.this$0 = obj;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$interaction;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                return new DefaultButtonElevation$elevation$2$1(this.$animatable, this.$target, this.$enabled, (DefaultButtonElevation) obj3, (Interaction) obj2, continuation, 0);
            case 1:
                return new DefaultButtonElevation$elevation$2$1(this.$animatable, this.$target, this.$enabled, (ButtonElevation) obj3, (Interaction) obj2, continuation, 1);
            default:
                return new DefaultButtonElevation$elevation$2$1(this.$enabled, this.$animatable, (Animatable) obj3, (LottieCompositionResult) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((DefaultButtonElevation$elevation$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0228, code lost:
    
        if (r0 == r12) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01fd, code lost:
    
        if ((r4 instanceof androidx.compose.foundation.interaction.FocusInteraction$Focus) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        if (r10.snapTo(r0, r18) != r12) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r2, r1, null, null, r18, 12) == r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0057, code lost:
    
        if (r4.snapTo(r0, r18) == r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010f, code lost:
    
        if (r4.snapTo(r1, r18) == r12) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014d, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m565animateElevationrAjV9yQ(r4, r0, r11, (androidx.compose.foundation.interaction.Interaction) r3, r18) == r12) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018d, code lost:
    
        if (r4.snapTo(r1, r18) == r12) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object snapTo;
        float f;
        float f2;
        int i = this.$r8$classId;
        Object obj2 = this.$interaction;
        Animatable animatable = this.$animatable;
        boolean z = this.$enabled;
        Object obj3 = this.this$0;
        TweenSpec tweenSpec = null;
        Interaction focusInteraction$Focus = null;
        tweenSpec = null;
        tweenSpec = null;
        switch (i) {
            case 0:
                DefaultButtonElevation defaultButtonElevation = (DefaultButtonElevation) obj3;
                float f3 = this.$target;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Dp.m1037equalsimpl0(((Dp) animatable.targetValue$delegate.getValue()).value, f3)) {
                        if (!z) {
                            Dp dp = new Dp(f3);
                            this.label = 1;
                            break;
                        } else {
                            float f4 = ((Dp) animatable.targetValue$delegate.getValue()).value;
                            Interaction press = Dp.m1037equalsimpl0(f4, defaultButtonElevation.pressedElevation) ? new PressInteraction.Press(0L) : Dp.m1037equalsimpl0(f4, defaultButtonElevation.hoveredElevation) ? new HoverInteraction$Enter() : Dp.m1037equalsimpl0(f4, defaultButtonElevation.focusedElevation) ? new FocusInteraction$Focus() : null;
                            Interaction interaction = (Interaction) obj2;
                            this.label = 2;
                            TweenSpec tweenSpec2 = ElevationKt.DefaultOutgoingSpec;
                            TweenSpec tweenSpec3 = ElevationKt.DefaultIncomingSpec;
                            if (interaction != null) {
                                if ((interaction instanceof PressInteraction.Press) || (interaction instanceof DragInteraction$Start) || (interaction instanceof HoverInteraction$Enter) || (interaction instanceof FocusInteraction$Focus)) {
                                    tweenSpec = tweenSpec3;
                                }
                            } else if (press != null) {
                                if (!(press instanceof PressInteraction.Press) && !(press instanceof DragInteraction$Start)) {
                                    if (!(press instanceof HoverInteraction$Enter)) {
                                        break;
                                    } else {
                                        tweenSpec = ElevationKt.HoveredOutgoingSpec;
                                    }
                                }
                                tweenSpec = tweenSpec2;
                            }
                            TweenSpec tweenSpec4 = tweenSpec;
                            Animatable animatable2 = this.$animatable;
                            if (tweenSpec4 == null) {
                                snapTo = animatable2.snapTo(new Dp(f3), this);
                                if (snapTo != coroutineSingletons) {
                                    snapTo = Unit.INSTANCE;
                                    break;
                                }
                            } else {
                                snapTo = Animatable.animateTo$default(animatable2, new Dp(f3), tweenSpec4, null, null, this, 12);
                                if (snapTo != coroutineSingletons) {
                                    snapTo = Unit.INSTANCE;
                                    break;
                                }
                            }
                        }
                    }
                } else if (i2 != 1 && i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                ButtonElevation buttonElevation = (ButtonElevation) obj3;
                float f5 = this.$target;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Dp.m1037equalsimpl0(((Dp) animatable.targetValue$delegate.getValue()).value, f5)) {
                        if (!z) {
                            Dp dp2 = new Dp(f5);
                            this.label = 1;
                            break;
                        } else {
                            float f6 = ((Dp) animatable.targetValue$delegate.getValue()).value;
                            if (Dp.m1037equalsimpl0(f6, buttonElevation.pressedElevation)) {
                                focusInteraction$Focus = new PressInteraction.Press(0L);
                            } else if (Dp.m1037equalsimpl0(f6, buttonElevation.hoveredElevation)) {
                                focusInteraction$Focus = new HoverInteraction$Enter();
                            } else if (Dp.m1037equalsimpl0(f6, buttonElevation.focusedElevation)) {
                                focusInteraction$Focus = new FocusInteraction$Focus();
                            }
                            this.label = 2;
                            break;
                        }
                    }
                } else if (i3 != 1 && i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                float f7 = RecyclerView.DECELERATION_RATE;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z) {
                        Float f8 = new Float(1.0f);
                        this.label = 1;
                        break;
                    }
                } else if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i4 == 2) {
                    float f9 = this.$target;
                    SafeTrace.throwOnFailure(obj);
                    f = f9;
                    if (z) {
                        Float f10 = new Float(RecyclerView.DECELERATION_RATE);
                        this.$target = f;
                        this.label = 3;
                        if (Animatable.animateTo$default(this.$animatable, f10, null, null, null, this, 14) != coroutineSingletons3) {
                            f2 = f;
                            f = f2;
                        }
                        break;
                    }
                    Animatable animatable3 = (Animatable) obj3;
                    if (!z) {
                    }
                    Float f11 = new Float(f7);
                    this.$target = f;
                    this.label = 4;
                } else if (i4 == 3) {
                    f2 = this.$target;
                    SafeTrace.throwOnFailure(obj);
                    f = f2;
                    Animatable animatable32 = (Animatable) obj3;
                    if (!z) {
                        f7 = 0.75f;
                    }
                    Float f112 = new Float(f7);
                    this.$target = f;
                    this.label = 4;
                    break;
                } else if (i4 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                int i5 = CardLockViewKt.$r8$clinit;
                LottieComposition lottieComposition = (LottieComposition) ((LottieCompositionResult) obj2).getValue();
                float duration = (lottieComposition != null ? lottieComposition.getDuration() : 1000.0f) * 0.75f;
                f = z ? duration * 0.25f : duration * 0.75f;
                Animatable animatable4 = (Animatable) obj3;
                Float f12 = new Float(z ? 1.0f : 0.75f);
                TweenSpec tween$default = AnimatableKt.tween$default((int) f, 0, null, 6);
                this.$target = f;
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultButtonElevation$elevation$2$1(boolean z, Animatable animatable, Animatable animatable2, LottieCompositionResult lottieCompositionResult, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$enabled = z;
        this.$animatable = animatable;
        this.this$0 = animatable2;
        this.$interaction = lottieCompositionResult;
    }
}
