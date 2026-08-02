package com.squareup.cash.maps.views;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.runtime.MutableState;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyInstrumentModel;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.transfers.presenters.AddMoneyPresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CashMapViewKt$CashMapView$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $isMapLoading$delegate;
    public /* synthetic */ boolean $isPagerPageVisible;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashMapViewKt$CashMapView$3$1(boolean z, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$isPagerPageVisible = z;
        this.$isMapLoading$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$isMapLoading$delegate;
        switch (i) {
            case 0:
                return new CashMapViewKt$CashMapView$3$1(this.$isPagerPageVisible, mutableState, continuation, 0);
            case 1:
                CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$1 = new CashMapViewKt$CashMapView$3$1(mutableState, continuation, 1);
                cashMapViewKt$CashMapView$3$1.$isPagerPageVisible = ((Boolean) obj).booleanValue();
                return cashMapViewKt$CashMapView$3$1;
            case 2:
                CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$12 = new CashMapViewKt$CashMapView$3$1(mutableState, continuation, 2);
                cashMapViewKt$CashMapView$3$12.$isPagerPageVisible = ((Boolean) obj).booleanValue();
                return cashMapViewKt$CashMapView$3$12;
            case 3:
                CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$13 = new CashMapViewKt$CashMapView$3$1(mutableState, continuation, 3);
                cashMapViewKt$CashMapView$3$13.$isPagerPageVisible = ((Boolean) obj).booleanValue();
                return cashMapViewKt$CashMapView$3$13;
            case 4:
                CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$14 = new CashMapViewKt$CashMapView$3$1(mutableState, continuation, 4);
                cashMapViewKt$CashMapView$3$14.$isPagerPageVisible = ((Boolean) obj).booleanValue();
                return cashMapViewKt$CashMapView$3$14;
            case 5:
                CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$15 = new CashMapViewKt$CashMapView$3$1(mutableState, continuation, 5);
                cashMapViewKt$CashMapView$3$15.$isPagerPageVisible = ((Boolean) obj).booleanValue();
                return cashMapViewKt$CashMapView$3$15;
            case 6:
                CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$16 = new CashMapViewKt$CashMapView$3$1(mutableState, continuation, 6);
                cashMapViewKt$CashMapView$3$16.$isPagerPageVisible = ((Boolean) obj).booleanValue();
                return cashMapViewKt$CashMapView$3$16;
            case 7:
                CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$17 = new CashMapViewKt$CashMapView$3$1(mutableState, continuation, 7);
                cashMapViewKt$CashMapView$3$17.$isPagerPageVisible = ((Boolean) obj).booleanValue();
                return cashMapViewKt$CashMapView$3$17;
            case 8:
                return new CashMapViewKt$CashMapView$3$1(this.$isPagerPageVisible, mutableState, continuation, 8);
            case 9:
                return new CashMapViewKt$CashMapView$3$1(this.$isPagerPageVisible, mutableState, continuation, 9);
            case 10:
                return new CashMapViewKt$CashMapView$3$1(this.$isPagerPageVisible, mutableState, continuation, 10);
            case 11:
                return new CashMapViewKt$CashMapView$3$1(this.$isPagerPageVisible, mutableState, continuation, 11);
            case 12:
                return new CashMapViewKt$CashMapView$3$1(this.$isPagerPageVisible, mutableState, continuation, 12);
            case 13:
                return new CashMapViewKt$CashMapView$3$1(this.$isPagerPageVisible, mutableState, continuation, 13);
            case 14:
                CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$18 = new CashMapViewKt$CashMapView$3$1(mutableState, continuation, 14);
                cashMapViewKt$CashMapView$3$18.$isPagerPageVisible = ((Boolean) obj).booleanValue();
                return cashMapViewKt$CashMapView$3$18;
            default:
                CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$19 = new CashMapViewKt$CashMapView$3$1(mutableState, continuation, 15);
                cashMapViewKt$CashMapView$3$19.$isPagerPageVisible = ((Boolean) obj).booleanValue();
                return cashMapViewKt$CashMapView$3$19;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((CashMapViewKt$CashMapView$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((CashMapViewKt$CashMapView$3$1) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((CashMapViewKt$CashMapView$3$1) create(bool2, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((CashMapViewKt$CashMapView$3$1) create(bool3, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((CashMapViewKt$CashMapView$3$1) create(bool4, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((CashMapViewKt$CashMapView$3$1) create(bool5, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((CashMapViewKt$CashMapView$3$1) create(bool6, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((CashMapViewKt$CashMapView$3$1) create(bool7, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((CashMapViewKt$CashMapView$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((CashMapViewKt$CashMapView$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((CashMapViewKt$CashMapView$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((CashMapViewKt$CashMapView$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((CashMapViewKt$CashMapView$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((CashMapViewKt$CashMapView$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((CashMapViewKt$CashMapView$3$1) create(bool8, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((CashMapViewKt$CashMapView$3$1) create(bool9, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$isMapLoading$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!this.$isPagerPageVisible) {
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                boolean z = this.$isPagerPageVisible;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(BankAccountLinkingViewModel.copy$default((BankAccountLinkingViewModel) mutableState.getValue(), null, null, null, null, 0, 0, null, null, null, z, null, 7167));
                break;
            case 2:
                boolean z2 = this.$isPagerPageVisible;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(Boolean.valueOf(z2));
                break;
            case 3:
                boolean z3 = this.$isPagerPageVisible;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(Boolean.valueOf(z3));
                break;
            case 4:
                boolean z4 = this.$isPagerPageVisible;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(VerifyAliasPresenter.State.copy$default((VerifyAliasPresenter.State) mutableState.getValue(), null, z4, false, null, false, 0, 61));
                break;
            case 5:
                boolean z5 = this.$isPagerPageVisible;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(VerifyContactsViewModel.copy$default((VerifyContactsViewModel) mutableState.getValue(), z5, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE));
                break;
            case 6:
                boolean z6 = this.$isPagerPageVisible;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(VerifyInstrumentModel.copy$default((VerifyInstrumentModel) mutableState.getValue(), null, z6, 11));
                break;
            case 7:
                boolean z7 = this.$isPagerPageVisible;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                float[] fArr = CardSceneEffectKt.X_AXIS;
                ((Function1) mutableState.getValue()).invoke(Boolean.valueOf(z7));
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (this.$isPagerPageVisible) {
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (this.$isPagerPageVisible) {
                    CubicBezierEasing cubicBezierEasing = SuggestionUiKt.SUGGESTION_ANIMATION_EASING;
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (this.$isPagerPageVisible) {
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!this.$isPagerPageVisible) {
                    mutableState.setValue(null);
                }
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, this.$isPagerPageVisible, null, null, null, null, false, null, 536739839));
                break;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!this.$isPagerPageVisible) {
                    List list = AddMoneyPresenter.PRESET_AMOUNTS;
                    mutableState.setValue(Boolean.FALSE);
                }
                break;
            case 14:
                boolean z8 = this.$isPagerPageVisible;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue()).cardInteraction;
                if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                    cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1.onCardFlip(z8);
                }
                break;
            default:
                boolean z9 = this.$isPagerPageVisible;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$12 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue()).cardInteraction;
                if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$12 != null) {
                    cardSchemePresenter$toHeroModule$cardDetails$2$1$1$12.onCardFlip(z9);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashMapViewKt$CashMapView$3$1(MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$isMapLoading$delegate = mutableState;
    }
}
