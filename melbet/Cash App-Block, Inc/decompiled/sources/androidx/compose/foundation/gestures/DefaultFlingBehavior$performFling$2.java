package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.squareup.cash.account.components.accountswitcher.AnimationPhase;
import com.squareup.cash.account.components.accountswitcher.ManagedAccountSwitchLoadingContentKt;
import com.squareup.cash.account.components.accountswitcher.ManagedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.wallet.views.CardRegistry$CardTransition$TransitionType;
import com.squareup.cash.wallet.views.CardScreenId;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements Function2 {
    public float $initialVelocity;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_performFling;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(Animatable animatable, float f, Motion motion, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.L$0 = animatable;
        this.$initialVelocity = f;
        this.L$1 = motion;
        this.this$0 = mutableState;
        this.$this_performFling = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$this_performFling;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, (DefaultFlingBehavior) obj3, (ScrollScope) obj2, continuation);
            case 1:
                return new DefaultFlingBehavior$performFling$2((SnapFlingBehavior) this.L$1, this.$initialVelocity, (Function1) obj3, (ScrollScope) obj2, continuation);
            case 2:
                return new DefaultFlingBehavior$performFling$2((MutableState) this.L$0, (MutableState) this.L$1, (Animatable) obj3, this.$initialVelocity, (Animatable) obj2, continuation, 2);
            case 3:
                return new DefaultFlingBehavior$performFling$2((Animatable) this.L$0, this.$initialVelocity, (Motion) this.L$1, (MutableState) obj3, (MutableState) obj2, continuation);
            case 4:
                DefaultFlingBehavior$performFling$2 defaultFlingBehavior$performFling$2 = new DefaultFlingBehavior$performFling$2((SnapshotStateMap) obj3, (CardScreenId) obj2, continuation);
                defaultFlingBehavior$performFling$2.L$1 = obj;
                return defaultFlingBehavior$performFling$2;
            default:
                return new DefaultFlingBehavior$performFling$2((CardScene) this.L$0, (CardModelView.ViewModel) this.L$1, (Quat) obj3, this.$initialVelocity, (EquatableBitmap) obj2, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((DefaultFlingBehavior$performFling$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((DefaultFlingBehavior$performFling$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((DefaultFlingBehavior$performFling$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((DefaultFlingBehavior$performFling$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((DefaultFlingBehavior$performFling$2) create((CardRegistry$CardTransition$TransitionType) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((DefaultFlingBehavior$performFling$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
    
        if (r0 != r13) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0171, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r1, r1, r2, null, null, r16, 12) == r12) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0141, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(500, r16) == r12) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01db, code lost:
    
        if (kotlinx.coroutines.JobKt.coroutineScope(r1, r16) != r14) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e9, code lost:
    
        if (kotlinx.coroutines.JobKt.coroutineScope(r1, r16) == r14) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$$ExternalSyntheticLambda0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x01e9 -> B:80:0x01ed). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AnimationState AnimationState$default;
        Ref$FloatRef ref$FloatRef;
        final Ref$FloatRef ref$FloatRef2;
        SnapFlingBehavior snapFlingBehavior;
        Object access$tryApproach;
        Animatable Animatable;
        float f;
        Object animateTo$default;
        int i = this.$r8$classId;
        final int i2 = 0;
        int i3 = 28;
        float f2 = RecyclerView.DECELERATION_RATE;
        Object obj2 = this.this$0;
        Object obj3 = this.$this_performFling;
        final int i4 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                float f3 = this.$initialVelocity;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Math.abs(f3) > 1.0f) {
                        Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                        ref$FloatRef3.element = f3;
                        Ref$FloatRef ref$FloatRef4 = new Ref$FloatRef();
                        AnimationState$default = AnimatableKt.AnimationState$default(RecyclerView.DECELERATION_RATE, f3, 28);
                        try {
                            DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) obj2;
                            DecayAnimationSpecImpl decayAnimationSpecImpl = defaultFlingBehavior.flingDecay;
                            MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(ref$FloatRef4, (ScrollScope) obj3, ref$FloatRef3, defaultFlingBehavior);
                            this.L$0 = ref$FloatRef3;
                            this.L$1 = AnimationState$default;
                            this.label = 1;
                            if (AnimatableKt.animateDecay(AnimationState$default, decayAnimationSpecImpl, false, menuKt$$ExternalSyntheticLambda0, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ref$FloatRef = ref$FloatRef3;
                        } catch (CancellationException unused) {
                            ref$FloatRef = ref$FloatRef3;
                            ref$FloatRef.element = ((Number) AnimationState$default.getVelocity()).floatValue();
                            f3 = ref$FloatRef.element;
                            return new Float(f3);
                        }
                    }
                    return new Float(f3);
                }
                if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AnimationState$default = (AnimationState) this.L$1;
                ref$FloatRef = (Ref$FloatRef) this.L$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                } catch (CancellationException unused2) {
                    ref$FloatRef.element = ((Number) AnimationState$default.getVelocity()).floatValue();
                    f3 = ref$FloatRef.element;
                    return new Float(f3);
                }
                f3 = ref$FloatRef.element;
                return new Float(f3);
            case 1:
                final Function1 function1 = (Function1) obj2;
                float f4 = this.$initialVelocity;
                SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) this.L$1;
                SnapLayoutInfoProvider snapLayoutInfoProvider = snapFlingBehavior2.snapLayoutInfoProvider;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float calculateApproachOffset = snapLayoutInfoProvider.calculateApproachOffset(f4, AnimatableKt.calculateTargetValue(snapFlingBehavior2.decayAnimationSpec, RecyclerView.DECELERATION_RATE, f4));
                    if (Float.isNaN(calculateApproachOffset)) {
                        InlineClassHelperKt.throwIllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    ref$FloatRef2 = new Ref$FloatRef();
                    float signum = Math.signum(f4) * Math.abs(calculateApproachOffset);
                    ref$FloatRef2.element = signum;
                    function1.invoke(new Float(signum));
                    snapFlingBehavior = snapFlingBehavior2;
                    float f5 = ref$FloatRef2.element;
                    float f6 = this.$initialVelocity;
                    ?? r4 = new Function1() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            int i7 = i2;
                            Function1 function12 = function1;
                            Ref$FloatRef ref$FloatRef5 = ref$FloatRef2;
                            float floatValue = ((Float) obj4).floatValue();
                            switch (i7) {
                                case 0:
                                    float f7 = ref$FloatRef5.element - floatValue;
                                    ref$FloatRef5.element = f7;
                                    function12.invoke(Float.valueOf(f7));
                                    break;
                                default:
                                    float f8 = ref$FloatRef5.element - floatValue;
                                    ref$FloatRef5.element = f8;
                                    function12.invoke(Float.valueOf(f8));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = ref$FloatRef2;
                    this.label = 1;
                    access$tryApproach = SnapFlingBehavior.access$tryApproach(snapFlingBehavior, (ScrollScope) obj3, f5, f6, r4, this);
                    if (access$tryApproach == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$FloatRef ref$FloatRef5 = (Ref$FloatRef) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    access$tryApproach = obj;
                    ref$FloatRef2 = ref$FloatRef5;
                    snapFlingBehavior = snapFlingBehavior2;
                }
                AnimationState animationState = (AnimationState) access$tryApproach;
                float calculateSnapOffset = snapLayoutInfoProvider.calculateSnapOffset(((Number) animationState.getVelocity()).floatValue());
                if (Float.isNaN(calculateSnapOffset)) {
                    InlineClassHelperKt.throwIllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                ref$FloatRef2.element = calculateSnapOffset;
                AnimationState copy$default = AnimatableKt.copy$default(animationState, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 30);
                AnimationSpec animationSpec = snapFlingBehavior.snapAnimationSpec;
                Function1 function12 = new Function1() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i7 = i4;
                        Function1 function122 = function1;
                        Ref$FloatRef ref$FloatRef52 = ref$FloatRef2;
                        float floatValue = ((Float) obj4).floatValue();
                        switch (i7) {
                            case 0:
                                float f7 = ref$FloatRef52.element - floatValue;
                                ref$FloatRef52.element = f7;
                                function122.invoke(Float.valueOf(f7));
                                break;
                            default:
                                float f8 = ref$FloatRef52.element - floatValue;
                                ref$FloatRef52.element = f8;
                                function122.invoke(Float.valueOf(f8));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 2;
                Object access$animateWithTarget = zzacp.access$animateWithTarget((ScrollScope) obj3, calculateSnapOffset, calculateSnapOffset, copy$default, animationSpec, function12, this);
                return access$animateWithTarget == coroutineSingletons2 ? coroutineSingletons2 : access$animateWithTarget;
            case 2:
                Animatable animatable = (Animatable) obj3;
                Animatable animatable2 = (Animatable) obj2;
                MutableState mutableState = (MutableState) this.L$0;
                MutableState mutableState2 = (MutableState) this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CubicBezierEasing cubicBezierEasing = ManagedAccountSwitchLoadingContentKt.BounceYEasing;
                    if (((AnimationPhase) mutableState2.getValue()) != AnimationPhase.IDLE_BOUNCE) {
                        return Unit.INSTANCE;
                    }
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        mutableState2.setValue(AnimationPhase.SETTLING);
                        return Unit.INSTANCE;
                    }
                    ManagedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1 managedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1 = new ManagedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1(animatable2, this.$initialVelocity, animatable, null);
                    this.label = 1;
                } else if (i7 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2(animatable2, animatable, continuation, i3);
                    this.label = 2;
                    break;
                } else {
                    if (i7 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        AnimationPhase animationPhase = AnimationPhase.SETTLING;
                        CubicBezierEasing cubicBezierEasing2 = ManagedAccountSwitchLoadingContentKt.BounceYEasing;
                        mutableState2.setValue(animationPhase);
                        return Unit.INSTANCE;
                    }
                    ManagedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1 managedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$12 = new ManagedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1(animatable2, this.$initialVelocity, animatable, null);
                    this.label = 1;
                    break;
                }
            case 3:
                MutableState mutableState3 = (MutableState) obj3;
                float f7 = this.$initialVelocity;
                Animatable animatable3 = (Animatable) this.L$0;
                MutableState mutableState4 = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Number) animatable3.getValue()).floatValue() == f7 && !animatable3.isRunning()) {
                        mutableState4.setValue(Boolean.FALSE);
                        mutableState3.setValue(Boolean.TRUE);
                        return Unit.INSTANCE;
                    }
                    mutableState4.setValue(Boolean.TRUE);
                    this.label = 1;
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        mutableState3.setValue(Boolean.TRUE);
                        mutableState4.setValue(Boolean.FALSE);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Animatable animatable4 = (Animatable) this.L$0;
                Float f8 = new Float(f7);
                Object obj4 = ((Motion) this.L$1).springs.text;
                SpringSpec springSpec = new SpringSpec(1.0f, 50.0f, new Float(0.001f));
                this.label = 2;
                break;
            case 4:
                CardScreenId cardScreenId = (CardScreenId) obj3;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj2;
                CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType = (CardRegistry$CardTransition$TransitionType) this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                try {
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (cardRegistry$CardTransition$TransitionType == CardRegistry$CardTransition$TransitionType.SOURCE) {
                            f2 = 1.0f;
                        }
                        if (snapshotStateMap != null && !snapshotStateMap.containsKey(cardScreenId)) {
                            Animatable = AnimatableKt.Animatable(1.0f - f2, 0.01f);
                            snapshotStateMap.put(cardScreenId, Animatable);
                            if (cardRegistry$CardTransition$TransitionType == CardRegistry$CardTransition$TransitionType.TARGET) {
                                this.L$1 = cardRegistry$CardTransition$TransitionType;
                                this.L$0 = Animatable;
                                this.$initialVelocity = f2;
                                this.label = 1;
                                if (JobKt.delay(200L, this) == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                                f = f2;
                            }
                            Float f9 = new Float(f2);
                            Animatable animatable5 = Animatable;
                            SpringSpec springSpec2 = new SpringSpec(1.0f, cardRegistry$CardTransition$TransitionType != CardRegistry$CardTransition$TransitionType.TARGET ? 70.0f : 200.0f, new Float(1.0E-4f));
                            this.L$1 = null;
                            this.L$0 = null;
                            this.$initialVelocity = f2;
                            this.label = 2;
                            animateTo$default = Animatable.animateTo$default(animatable5, f9, springSpec2, null, null, this, 12);
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i9 != 1) {
                        if (i9 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        animateTo$default = obj;
                        return Unit.INSTANCE;
                    }
                    f = this.$initialVelocity;
                    Animatable = (Animatable) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    f2 = f;
                    Float f92 = new Float(f2);
                    Animatable animatable52 = Animatable;
                    SpringSpec springSpec22 = new SpringSpec(1.0f, cardRegistry$CardTransition$TransitionType != CardRegistry$CardTransition$TransitionType.TARGET ? 70.0f : 200.0f, new Float(1.0E-4f));
                    this.L$1 = null;
                    this.L$0 = null;
                    this.$initialVelocity = f2;
                    this.label = 2;
                    animateTo$default = Animatable.animateTo$default(animatable52, f92, springSpec22, null, null, this, 12);
                } finally {
                    snapshotStateMap.remove(cardScreenId);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardScene cardScene = (CardScene) this.L$0;
                    CardModelView.ViewModel viewModel = (CardModelView.ViewModel) this.L$1;
                    if (viewModel == null) {
                        return Unit.INSTANCE;
                    }
                    this.label = 1;
                    if (cardScene.updateCard(viewModel, (Quat) obj2, new Vector4(RecyclerView.DECELERATION_RATE, this.$initialVelocity), (EquatableBitmap) obj3, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$initialVelocity = f;
        this.this$0 = defaultFlingBehavior;
        this.$this_performFling = scrollScope;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(SnapFlingBehavior snapFlingBehavior, float f, Function1 function1, ScrollScope scrollScope, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.L$1 = snapFlingBehavior;
        this.$initialVelocity = f;
        this.this$0 = function1;
        this.$this_performFling = scrollScope;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(SnapshotStateMap snapshotStateMap, CardScreenId cardScreenId, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.this$0 = snapshotStateMap;
        this.$this_performFling = cardScreenId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultFlingBehavior$performFling$2(Object obj, Object obj2, Object obj3, float f, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.L$1 = obj2;
        this.this$0 = obj3;
        this.$initialVelocity = f;
        this.$this_performFling = obj4;
    }
}
