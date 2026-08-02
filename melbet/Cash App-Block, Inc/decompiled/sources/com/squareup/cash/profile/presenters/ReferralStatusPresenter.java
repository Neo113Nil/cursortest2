package com.squareup.cash.profile.presenters;

import android.app.Application;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ReferralStatusViewModel;
import com.squareup.cash.cdf.referralreward.ReferralRewardReceiveCompleteStatus;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.UtilsKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.payments.viewmodels.BillViewModel;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.screens.ReferralStatusPresentationArgs$RewardInfo;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.util.android.AndroidColorManager;
import java.util.ArrayList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes7.dex */
public final class ReferralStatusPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public ReferralRewardReceiveCompleteStatus analyticsCompleteResult;
    public final ProfileScreens.ReferralStatusScreen args;
    public long attachTime;
    public final AndroidClock clock;
    public final AndroidColorManager colorManager;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealReferralManager referralManager;

    public ReferralStatusPresenter(AndroidColorManager androidColorManager, AndroidClock androidClock, Analytics analytics, LocalizedMoneyFormatter.Factory factory, RealReferralManager realReferralManager, BetterNavigator.ScreenNavigator screenNavigator, ProfileScreens.ReferralStatusScreen referralStatusScreen) {
        referralStatusScreen.getClass();
        this.colorManager = androidColorManager;
        this.clock = androidClock;
        this.analytics = analytics;
        this.referralManager = realReferralManager;
        this.navigator = screenNavigator;
        this.args = referralStatusScreen;
        this.moneyFormatter = factory.createRounded();
        this.analyticsCompleteResult = new ReferralRewardReceiveCompleteStatus(null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MoneyFormatter moneyFormatter;
        Object incompleteSinglePayment;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-140980237);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = FlowKt.distinctUntilChanged(new SupportHomePresenter$models$lambda$5$$inlined$map$1(this.referralManager.rewardStatus(), 9));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, this.args.rewardInfo, null, gapComposer, 0, 2);
        Updater.LaunchedEffect(gapComposer, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, 0 == true ? 1 : 0, this, 4));
        ReferralStatusPresentationArgs$RewardInfo referralStatusPresentationArgs$RewardInfo = (ReferralStatusPresentationArgs$RewardInfo) collectAsState.getValue();
        Application application = this.colorManager.context;
        ArrayList arrayList = new ArrayList();
        int i2 = referralStatusPresentationArgs$RewardInfo.availablePayments;
        RewardStatus.Expiration expiration = referralStatusPresentationArgs$RewardInfo.expiration;
        int i3 = referralStatusPresentationArgs$RewardInfo.completedPayments;
        int i4 = i2 + i3;
        ReferralRewardReceiveCompleteStatus referralRewardReceiveCompleteStatus = this.analyticsCompleteResult;
        long j = i4;
        Money money = referralStatusPresentationArgs$RewardInfo.paymentAmount;
        Long l = money.amount;
        CurrencyCode currencyCode = money.currency_code;
        this.analyticsCompleteResult = ReferralRewardReceiveCompleteStatus.copy$default(referralRewardReceiveCompleteStatus, null, l, currencyCode != null ? UtilsKt.getAsCdfCurrencyCode(currencyCode) : null, Long.valueOf(j), 1);
        int i5 = 0;
        while (true) {
            moneyFormatter = this.moneyFormatter;
            if (i5 >= i4) {
                break;
            }
            arrayList.add(new BillViewModel(moneyFormatter.format(money), expiration == RewardStatus.Expiration.EXPIRING ? application.getColor(R.color.referral_reward_expiring) : application.getColor(R.color.referral_reward), i5 < i3));
            i5++;
        }
        if (arrayList.size() > 1) {
            incompleteSinglePayment = new ReferralStatusViewModel.MultiplePayments(arrayList, i4, referralStatusPresentationArgs$RewardInfo.paymentAmount, referralStatusPresentationArgs$RewardInfo.headerText, referralStatusPresentationArgs$RewardInfo.mainText);
        } else if (arrayList.isEmpty() || !((BillViewModel) arrayList.get(0)).isCompleted) {
            incompleteSinglePayment = new ReferralStatusViewModel.SinglePayment.IncompleteSinglePayment(expiration == RewardStatus.Expiration.EXPIRING ? application.getColor(R.color.referral_reward_expiring) : application.getColor(R.color.referral_reward), moneyFormatter.format(money), referralStatusPresentationArgs$RewardInfo.paymentAmount, referralStatusPresentationArgs$RewardInfo.headerText, referralStatusPresentationArgs$RewardInfo.mainText);
        } else {
            incompleteSinglePayment = new ReferralStatusViewModel.SinglePayment.CompletedSinglePayment(money, referralStatusPresentationArgs$RewardInfo.headerText, referralStatusPresentationArgs$RewardInfo.mainText);
        }
        gapComposer.end(false);
        return incompleteSinglePayment;
    }
}
