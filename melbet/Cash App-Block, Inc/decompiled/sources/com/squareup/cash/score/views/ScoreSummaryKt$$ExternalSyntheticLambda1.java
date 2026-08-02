package com.squareup.cash.score.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.crypto.backend.balance.RestrictedBalance;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.investing.viewmodels.TransferStockViewModel;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.cash.score.views.ScoreDisplayContent;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardRegistry$CardTransition$TransitionType;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.cards.CardTheme;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class ScoreSummaryKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ ScoreSummaryKt$$ExternalSyntheticLambda1(MutableState mutableState, MutableState mutableState2, int i) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
        this.f$1 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        Money money;
        Money money2;
        Long l;
        CardTheme cardTheme;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        MutableState mutableState2 = this.f$0;
        switch (i) {
            case 0:
                if (Intrinsics.areEqual((ScoreDisplayContent) mutableState2.getValue(), ScoreDisplayContent.Score.INSTANCE) && (str = (String) mutableState.getValue()) != null) {
                    mutableState2.setValue(new ScoreDisplayContent.Celebration(str));
                }
                return Unit.INSTANCE;
            case 1:
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) mutableState2.getValue();
                if (balanceSnapshot == null || (money = balanceSnapshot.balance) == null) {
                    return null;
                }
                RestrictedBalance restrictedBalance = (RestrictedBalance) mutableState.getValue();
                long longValue = (restrictedBalance == null || (money2 = restrictedBalance.amount) == null || (l = money2.amount) == null) ? 0L : l.longValue();
                Long l2 = money.amount;
                l2.getClass();
                return new Money(Long.valueOf(l2.longValue() + longValue), money.currency_code, 4);
            case 2:
                if (mutableState2.getValue() != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                }
                Boolean bool = (Boolean) mutableState.getValue();
                bool.getClass();
                return bool;
            case 3:
                return new Pair(mutableState2.getValue(), mutableState.getValue());
            case 4:
                return new Pair((FidesmoDeviceState) mutableState2.getValue(), (FidesmoDeprovisioningPresenter.DeprovisionPhase) mutableState.getValue());
            case 5:
                return new Pair((FidesmoDeviceState) mutableState2.getValue(), (FidesmoProvisioningPresenter.ActivationPhase) mutableState.getValue());
            case 6:
                return Boolean.valueOf(((TransferStockViewModel.Content.FullScreenContent.DialogContent) mutableState2.getValue()) != null || ((Boolean) mutableState.getValue()).booleanValue());
            case 7:
                if (((Boolean) mutableState2.getValue()).booleanValue()) {
                    mutableState.setValue(OffersSearchViewModel.OffersSearchListViewModel.Loading.INSTANCE);
                }
                return Unit.INSTANCE;
            case 8:
                mutableState2.setValue(Boolean.FALSE);
                mutableState.setValue(AutofillViewModel.Success.INSTANCE);
                return Unit.INSTANCE;
            case 9:
                return new Pair((List) mutableState2.getValue(), (List) mutableState.getValue());
            case 10:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CardTransitionKt.LocalCardRegistry;
                CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType = (CardRegistry$CardTransition$TransitionType) mutableState2.getValue();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    return cardRegistry$CardTransition$TransitionType;
                }
                return null;
            case 11:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CardTransitionKt.LocalCardRegistry;
                CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType2 = (CardRegistry$CardTransition$TransitionType) mutableState2.getValue();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    return cardRegistry$CardTransition$TransitionType2;
                }
                return null;
            case 12:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = CardTransitionKt.LocalCardRegistry;
                CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType3 = (CardRegistry$CardTransition$TransitionType) mutableState2.getValue();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    return cardRegistry$CardTransition$TransitionType3;
                }
                return null;
            case 13:
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) mutableState2.getValue();
                if (heroCardDetails != null && (cardTheme = heroCardDetails.cardTheme) != null) {
                    return cardTheme;
                }
                CardSchemeViewModel.Module.CardAnimation cardAnimation = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue()).animation;
                CardTheme cardTheme2 = cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Updated ? ((CardSchemeViewModel.Module.CardAnimation.Updated) cardAnimation).cardTheme : null;
                return cardTheme2 == null ? ((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue()).cardTheme : cardTheme2;
            case 14:
                float[] fArr = Hero3DCardViewKt.X_AXIS;
                if (!((Boolean) mutableState2.getValue()).booleanValue() && ((CardModelView) mutableState.getValue()) == null) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            default:
                List list = (List) mutableState2.getValue();
                if (list.isEmpty() || !((Boolean) mutableState.getValue()).booleanValue()) {
                    return null;
                }
                return list;
        }
    }
}
