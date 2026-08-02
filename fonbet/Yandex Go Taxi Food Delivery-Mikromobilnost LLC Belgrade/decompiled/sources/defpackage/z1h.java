package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.savings.internal.entities.SavingsClosingVersion;
import com.ybsdk.feature.savings.internal.screens.close.SavingsAccountCloseFragment;
import com.ybsdk.feature.savings.internal.screens.close.SavingsAccountCloseParams;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositFragment;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositParams;
import com.ybsdk.feature.savings.internal.screens.create.SavingsAccountCreationFragment;
import com.ybsdk.feature.savings.internal.screens.create.SavingsAccountCreationParams;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardParams;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardFragmentV4;
import com.ybsdk.feature.savings.internal.screens.diffrate.DiffRateCalendarFragment;
import com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationFragment;
import com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationParams;
import com.ybsdk.feature.savings.internal.screens.fund.operation.FundOperationFragment;
import com.ybsdk.feature.savings.internal.screens.fund.operation.FundOperationParams;
import com.ybsdk.feature.savings.internal.screens.goal.SavingsAccountGoalFragment;
import com.ybsdk.feature.savings.internal.screens.goal.SavingsAccountGoalParams;
import com.ybsdk.feature.savings.internal.screens.lock.SavingsAccountLockFragment;
import com.ybsdk.feature.savings.internal.screens.lock.SavingsAccountLockParams;
import com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameFragment;
import com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameParams;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

/* loaded from: classes3.dex */
public final class z1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ tcm0 b;

    public /* synthetic */ z1h(tcm0 tcm0Var, int i) {
        this.a = i;
        this.b = tcm0Var;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        tcm0 tcm0Var = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.DiffRateCalendar)) {
                    return x0hVar;
                }
                tcm0Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("SavingsDiffRateCalendarScreen", false, null, TransitionPolicyType.NONE, qoi0.a(DiffRateCalendarFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 4, null)), null, 6);
            case 1:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.FundOperation)) {
                    return x0hVar;
                }
                DeeplinkAction.FundOperation fundOperation = (DeeplinkAction.FundOperation) baseDeeplinkAction;
                String type = fundOperation.getType();
                String agreementId = fundOperation.getAgreementId();
                tcm0Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("FundOperationScreen", false, new FundOperationParams(type, agreementId), null, qoi0.a(FundOperationFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 2:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.OpenFund)) {
                    return x0hVar;
                }
                DeeplinkAction.OpenFund openFund = (DeeplinkAction.OpenFund) baseDeeplinkAction;
                String fundId = openFund.getFundId();
                String preselectedAgreementId = openFund.getPreselectedAgreementId();
                tcm0Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("FundCreationScreen", false, new FundCreationParams(fundId, preselectedAgreementId), null, qoi0.a(FundCreationFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 3:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SavingsAccountClose)) {
                    return x0hVar;
                }
                DeeplinkAction.SavingsAccountClose savingsAccountClose = (DeeplinkAction.SavingsAccountClose) baseDeeplinkAction;
                String type2 = savingsAccountClose.getType();
                String title = savingsAccountClose.getTitle();
                String subtitle = savingsAccountClose.getSubtitle();
                String agreementId2 = savingsAccountClose.getAgreementId();
                String imageUrl = savingsAccountClose.getImageUrl();
                String actionButtonTitle = savingsAccountClose.getActionButtonTitle();
                String secondaryButtonTitle = savingsAccountClose.getSecondaryButtonTitle();
                Boolean showSecondary = savingsAccountClose.getShowSecondary();
                tcm0Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("SavingsAccountCloseScreen", false, new SavingsAccountCloseParams(type2, title, subtitle, agreementId2, imageUrl, actionButtonTitle, secondaryButtonTitle, showSecondary), null, qoi0.a(SavingsAccountCloseFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 4:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SavingsAccountCloseDeposit)) {
                    return x0hVar;
                }
                DeeplinkAction.SavingsAccountCloseDeposit savingsAccountCloseDeposit = (DeeplinkAction.SavingsAccountCloseDeposit) baseDeeplinkAction;
                String title2 = savingsAccountCloseDeposit.getTitle();
                String subtitle2 = savingsAccountCloseDeposit.getSubtitle();
                String agreementId3 = savingsAccountCloseDeposit.getAgreementId();
                String imageUrl2 = savingsAccountCloseDeposit.getImageUrl();
                String actionButtonTitle2 = savingsAccountCloseDeposit.getActionButtonTitle();
                String secondaryButtonTitle2 = savingsAccountCloseDeposit.getSecondaryButtonTitle();
                String date = savingsAccountCloseDeposit.getDate();
                String full = savingsAccountCloseDeposit.getFull();
                String total = savingsAccountCloseDeposit.getTotal();
                String profit = savingsAccountCloseDeposit.getProfit();
                String penalty = savingsAccountCloseDeposit.getPenalty();
                String version = savingsAccountCloseDeposit.getVersion();
                tcm0Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("SavingsAccountCloseDepositScreen", false, new SavingsAccountCloseDepositParams(date, title2, subtitle2, imageUrl2, agreementId3, actionButtonTitle2, secondaryButtonTitle2, jl40.l(version, "V2") ? SavingsClosingVersion.V2 : SavingsClosingVersion.V1, full, total, profit, penalty), null, qoi0.a(SavingsAccountCloseDepositFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 5:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SavingsAccountCreate)) {
                    return x0hVar;
                }
                DeeplinkAction.SavingsAccountCreate savingsAccountCreate = (DeeplinkAction.SavingsAccountCreate) baseDeeplinkAction;
                String tariffId = savingsAccountCreate.getTariffId();
                String sourceAgreementId = savingsAccountCreate.getSourceAgreementId();
                MoneyEntity amount = savingsAccountCreate.getAmount();
                tcm0Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("SavingsAccountCreationScreen", false, new SavingsAccountCreationParams(tariffId, sourceAgreementId, amount), null, qoi0.a(SavingsAccountCreationFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 6:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SavingsAccount)) {
                    return x0hVar;
                }
                DeeplinkAction.SavingsAccount savingsAccount = (DeeplinkAction.SavingsAccount) baseDeeplinkAction;
                return new v0h(Collections.singletonList(tcm0Var.b(savingsAccount.getAgreementId(), savingsAccount.getBackgroundColorParams())), null, 6);
            case 7:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SavingsAccountGoal)) {
                    return x0hVar;
                }
                DeeplinkAction.SavingsAccountGoal savingsAccountGoal = (DeeplinkAction.SavingsAccountGoal) baseDeeplinkAction;
                String title3 = savingsAccountGoal.getTitle();
                String subtitle3 = savingsAccountGoal.getSubtitle();
                Date date2 = savingsAccountGoal.getDate();
                MoneyEntity amount2 = savingsAccountGoal.getAmount();
                String agreementId4 = savingsAccountGoal.getAgreementId();
                tcm0Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("SavingsAccountGoalScreen", false, new SavingsAccountGoalParams(agreementId4, title3, subtitle3, date2, amount2), null, qoi0.a(SavingsAccountGoalFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 8:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SavingsAccountLock)) {
                    return x0hVar;
                }
                DeeplinkAction.SavingsAccountLock savingsAccountLock = (DeeplinkAction.SavingsAccountLock) baseDeeplinkAction;
                String title4 = savingsAccountLock.getTitle();
                String subtitle4 = savingsAccountLock.getSubtitle();
                String agreementId5 = savingsAccountLock.getAgreementId();
                tcm0Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("SavingsAccountLockScreen", false, new SavingsAccountLockParams(title4, subtitle4, agreementId5), null, qoi0.a(SavingsAccountLockFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            case 9:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SavingsAccountRename)) {
                    return x0hVar;
                }
                DeeplinkAction.SavingsAccountRename savingsAccountRename = (DeeplinkAction.SavingsAccountRename) baseDeeplinkAction;
                String title5 = savingsAccountRename.getTitle();
                String subtitle5 = savingsAccountRename.getSubtitle();
                String type3 = savingsAccountRename.getType();
                String currentName = savingsAccountRename.getCurrentName();
                String agreementId6 = savingsAccountRename.getAgreementId();
                tcm0Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("SavingsAccountNameScreen", false, new SavingsAccountNameParams(title5, subtitle5, type3, currentName, agreementId6), null, qoi0.a(SavingsAccountNameFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SavingsDashboard)) {
                    return x0hVar;
                }
                Map<String, String> additionalData = ((DeeplinkAction.SavingsDashboard) baseDeeplinkAction).getAdditionalData();
                adp0 adp0Var = tcm0Var.b;
                adp0Var.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("SavingsDashboard", false, new SavingsDashboardParams(additionalData), null, qoi0.a(((CommonFeatureFlag) ((ndm0) adp0Var.a).a.d(wlp.p0).getData()).isEnabled() ? SavingsDashboardFragmentV4.class : SavingsDashboardFragmentV2.class), OpenScreenRequirement.WithYbSession.INSTANCE, 10, null)), null, 6);
        }
    }
}
