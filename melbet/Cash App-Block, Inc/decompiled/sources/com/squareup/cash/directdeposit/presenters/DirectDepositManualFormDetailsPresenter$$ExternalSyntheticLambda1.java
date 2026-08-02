package com.squareup.cash.directdeposit.presenters;

import androidx.compose.runtime.Updater;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormDetailsScreen;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class DirectDepositManualFormDetailsPresenter$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardStudioPresenter f$0;

    public /* synthetic */ DirectDepositManualFormDetailsPresenter$$ExternalSyntheticLambda1(CardStudioPresenter cardStudioPresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = cardStudioPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CardStudioPresenter cardStudioPresenter = this.f$0;
        switch (i) {
            case 0:
                return Updater.mutableStateOf$default(((DirectDepositManualFormDetailsScreen) cardStudioPresenter.appConfig).companyName.getValue());
            default:
                return ((LocalizedMoneyFormatter.Factory) cardStudioPresenter.ioContext).create(MoneyFormatterConfig.COMPACT);
        }
    }
}
