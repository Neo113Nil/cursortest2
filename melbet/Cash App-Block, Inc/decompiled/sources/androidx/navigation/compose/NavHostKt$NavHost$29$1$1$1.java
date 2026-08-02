package androidx.navigation.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.MutatorMutex;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.navigation.NavBackStackEntry;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CardRegistry$CardTransition$TransitionType;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.cash.wallet.views.CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroTagViewKt$Render$4$1$WhenMappings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$29$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $backStackEntry;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $transitionState;
    public float $value;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1$1$1(float f, SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$value = f;
        this.$transitionState = seekableTransitionState;
        this.$backStackEntry = navBackStackEntry;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$backStackEntry;
        Object obj3 = this.$transitionState;
        switch (i) {
            case 0:
                return new NavHostKt$NavHost$29$1$1$1(this.$value, (SeekableTransitionState) obj3, (NavBackStackEntry) obj2, continuation);
            case 1:
                return new NavHostKt$NavHost$29$1$1$1((Animatable) obj3, this.$value, (SpringSpec) obj2, continuation, 1);
            case 2:
                return new NavHostKt$NavHost$29$1$1$1((RecurringReloadConfigurationViewModel.SelectDay) obj3, this.$value, (ScrollState) obj2, continuation, 2);
            case 3:
                NavHostKt$NavHost$29$1$1$1 navHostKt$NavHost$29$1$1$1 = new NavHostKt$NavHost$29$1$1$1((ProduceStateScope) obj3, (MutableState) obj2, continuation, 3);
                navHostKt$NavHost$29$1$1$1.$value = ((Number) obj).floatValue();
                return navHostKt$NavHost$29$1$1$1;
            case 4:
                return new NavHostKt$NavHost$29$1$1$1((CardRegistry) obj3, (MutableState) obj2, continuation, 4);
            default:
                return new NavHostKt$NavHost$29$1$1$1((MutableFloatState) obj3, (MutableState) obj2, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 3:
                break;
        }
        return ((NavHostKt$NavHost$29$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0274, code lost:
    
        if (r0 == r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0231, code lost:
    
        if (r12.seekTo(r0, r12.targetState$delegate.getValue(), r18) == r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fe, code lost:
    
        if (r1.snapTo(r2, r18) == r11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017e, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r1, r1, r2, null, r4, r18, 4) != r11) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014c, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(300, r18) == r11) goto L67;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object mutate$default;
        float f;
        float f2;
        float f3;
        int i = this.$r8$classId;
        Object obj2 = this.$backStackEntry;
        Object obj3 = this.$transitionState;
        switch (i) {
            case 0:
                SeekableTransitionState seekableTransitionState = (SeekableTransitionState) obj3;
                float f4 = this.$value;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (f4 > RecyclerView.DECELERATION_RATE) {
                        this.label = 1;
                        break;
                    }
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                if (f4 == RecyclerView.DECELERATION_RATE) {
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                    this.label = 2;
                    Transition transition = seekableTransitionState.transition;
                    if (transition != null) {
                        if (!Intrinsics.areEqual(seekableTransitionState.currentState$delegate.getValue(), navBackStackEntry) || !Intrinsics.areEqual(seekableTransitionState.targetState$delegate.getValue(), navBackStackEntry)) {
                            mutate$default = MutatorMutex.mutate$default(seekableTransitionState.mutatorMutex, new SessionWorker$doWork$2$2(seekableTransitionState, navBackStackEntry, transition, false, null, 3), this);
                            if (mutate$default != coroutineSingletons) {
                                mutate$default = Unit.INSTANCE;
                                break;
                            }
                        } else {
                            mutate$default = Unit.INSTANCE;
                            break;
                        }
                    } else {
                        mutate$default = Unit.INSTANCE;
                        break;
                    }
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default((Animatable) obj3, new Float(this.$value), (SpringSpec) obj2, null, null, this, 12) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((RecurringReloadConfigurationViewModel.SelectDay) obj3).selectedIndex != null) {
                        float f5 = this.$value;
                        ScrollState scrollState = (ScrollState) obj2;
                        int intValue = ((int) ((r2.intValue() - 1) * f5)) - ((int) ((scrollState.viewportSize$delegate.getIntValue() / 2) - (f5 / 2.0f)));
                        int i5 = intValue >= 0 ? intValue : 0;
                        this.label = 1;
                        if (PlatformKt.scrollBy(scrollState, i5 - scrollState.value$delegate.getIntValue(), this) == coroutineSingletons3) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                ProduceStateScope produceStateScope = (ProduceStateScope) obj3;
                float f6 = this.$value;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (f6 == RecyclerView.DECELERATION_RATE) {
                        produceStateScope.setValue(new Float(RecyclerView.DECELERATION_RATE));
                    } else {
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = CardTransitionKt.LocalCardRegistry;
                        if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                            this.$value = f6;
                            this.label = 1;
                            break;
                        }
                        Animatable Animatable = AnimatableKt.Animatable(((Number) produceStateScope.getValue()).floatValue(), 0.01f);
                        Float f7 = new Float(1.0f);
                        SpringSpec spring$default = AnimatableKt.spring$default(1.0f, 200.0f, null, 4);
                        CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0 cardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0 = new CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0(produceStateScope, 3);
                        this.$value = f6;
                        this.label = 2;
                    }
                } else if (i6 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable Animatable2 = AnimatableKt.Animatable(((Number) produceStateScope.getValue()).floatValue(), 0.01f);
                    Float f72 = new Float(1.0f);
                    SpringSpec spring$default2 = AnimatableKt.spring$default(1.0f, 200.0f, null, 4);
                    CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0 cardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda02 = new CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0(produceStateScope, 3);
                    this.$value = f6;
                    this.label = 2;
                    break;
                } else if (i6 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
            case 4:
                CardRegistry cardRegistry = (CardRegistry) obj3;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType = (CardRegistry$CardTransition$TransitionType) ((MutableState) obj2).getValue();
                    int i8 = cardRegistry$CardTransition$TransitionType == null ? -1 : HeroTagViewKt$Render$4$1$WhenMappings.$EnumSwitchMapping$0[cardRegistry$CardTransition$TransitionType.ordinal()];
                    if (i8 == -1) {
                        break;
                    } else {
                        if (i8 == 1) {
                            f = 0.0f;
                        } else if (i8 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            f = 1.0f;
                        }
                        Animatable animatable = cardRegistry.activeHeroTagFocusGain;
                        Float f8 = new Float(f);
                        SpringSpec springSpec = new SpringSpec(1.0f, 50.0f, new Float(1.0E-4f));
                        this.$value = f;
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, f8, springSpec, null, null, this, 12) != coroutineSingletons5) {
                            f2 = f;
                        }
                        break;
                    }
                } else if (i7 == 1) {
                    f2 = this.$value;
                    SafeTrace.throwOnFailure(obj);
                } else if (i7 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                Animatable animatable2 = cardRegistry.activeHeroTagFocusGain;
                Float f9 = new Float(f2);
                this.$value = f2;
                this.label = 2;
                break;
            default:
                MutableFloatState mutableFloatState = (MutableFloatState) obj3;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(7, DurationUnit.SECONDS);
                    this.$value = floatValue;
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons6) {
                        break;
                    } else {
                        f3 = floatValue;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    f3 = this.$value;
                    SafeTrace.throwOnFailure(obj);
                }
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
                if (f3 == parcelableSnapshotMutableFloatState.getFloatValue()) {
                    ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(((Boolean) ((MutableState) obj2).getValue()).booleanValue() ? 1.0f : 0.0f);
                    Timber.Forest.v("Reset dragFraction to %f", new Float(parcelableSnapshotMutableFloatState.getFloatValue()));
                } else {
                    Timber.Forest.v("Cancelled dragFraction reset because the user is dragging again", new Object[0]);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavHostKt$NavHost$29$1$1$1(Object obj, float f, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$transitionState = obj;
        this.$value = f;
        this.$backStackEntry = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavHostKt$NavHost$29$1$1$1(Object obj, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$transitionState = obj;
        this.$backStackEntry = mutableState;
    }
}
