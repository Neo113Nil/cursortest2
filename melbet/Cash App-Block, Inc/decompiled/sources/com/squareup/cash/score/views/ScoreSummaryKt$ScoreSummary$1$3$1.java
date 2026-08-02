package com.squareup.cash.score.views;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.views.AnimationsKt;
import com.squareup.cash.maps.views.CashMapViewKt$CashMapView$3$1;
import com.squareup.cash.nearby.views.PulsingState;
import com.squareup.cash.score.views.ScoreDisplayContent;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda15;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ScoreSummaryKt$ScoreSummary$1$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $scoreDisplayContent$delegate;
    public final /* synthetic */ MutableState $unlockCelebrationText$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoreSummaryKt$ScoreSummary$1$3$1(int i, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.label = i;
        this.$unlockCelebrationText$delegate = mutableState;
        this.$scoreDisplayContent$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$scoreDisplayContent$delegate;
        MutableState mutableState2 = this.$unlockCelebrationText$delegate;
        switch (i) {
            case 0:
                return new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState, continuation, 0);
            case 1:
                return new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState, continuation, 1);
            case 2:
                return new ScoreSummaryKt$ScoreSummary$1$3$1(this.label, mutableState2, mutableState, continuation);
            case 3:
                return new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState, continuation, 3);
            case 4:
                return new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState, continuation, 4);
            case 5:
                return new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState, continuation, 5);
            case 6:
                return new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState, continuation, 6);
            case 7:
                return new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState, continuation, 7);
            default:
                return new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
        }
        return ((ScoreSummaryKt$ScoreSummary$1$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$unlockCelebrationText$delegate;
        MutableState mutableState2 = this.$scoreDisplayContent$delegate;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(500L, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                String str = (String) mutableState.getValue();
                str.getClass();
                mutableState2.setValue(new ScoreDisplayContent.Celebration(str));
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new DrawerViewKt$$ExternalSyntheticLambda2(6, mutableState));
                    CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$1 = new CashMapViewKt$CashMapView$3$1(mutableState2, continuation, 7);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow, cashMapViewKt$CashMapView$3$1, this) == coroutineSingletons2) {
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
                SafeTrace.throwOnFailure(obj);
                if (this.label > 0) {
                    PulsingState pulsingState = (PulsingState) mutableState.getValue();
                    if (pulsingState != null) {
                        pulsingState.payWaveStartTimes.add(Float.valueOf(pulsingState.elapsed));
                    }
                    mutableState2.setValue(Boolean.TRUE);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(500L, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                mutableState2.setValue((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue());
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(13, mutableState));
                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$1 = new TabContentPresenter$models$4$1$1$1(mutableState2, continuation, 21);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow2, tabContentPresenter$models$4$1$1$1, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(24, mutableState)), 24));
                    CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$12 = new CashMapViewKt$CashMapView$3$1(mutableState2, continuation, 15);
                    this.label = 1;
                    if (FlowKt.collectLatest(distinctUntilChanged, cashMapViewKt$CashMapView$3$12, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(500L, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                float[] fArr = Hero3DCardViewKt.X_AXIS;
                mutableState2.setValue((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue());
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow3 = Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(3, mutableState));
                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$12 = new TabContentPresenter$models$4$1$1$1(mutableState2, continuation, 25);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow3, tabContentPresenter$models$4$1$1$12, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Hero3DCardViewKt.coerceToFinite(((Quat) mutableState.getValue()).angleShortestPath((Quat) mutableState2.getValue())) > RecyclerView.DECELERATION_RATE) {
                        SafeFlow m3564flingTo38CYSgM$default = AnimationsKt.m3564flingTo38CYSgM$default((Quat) mutableState.getValue(), (Quat) mutableState2.getValue(), 0L, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 25.0f, new Float(0.001f), 1), 10);
                        TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$13 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 28);
                        this.label = 1;
                        if (FlowKt.collectLatest(m3564flingTo38CYSgM$default, tabContentPresenter$models$4$1$1$13, this) == coroutineSingletons9) {
                            break;
                        }
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScoreSummaryKt$ScoreSummary$1$3$1(MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$unlockCelebrationText$delegate = mutableState;
        this.$scoreDisplayContent$delegate = mutableState2;
    }
}
