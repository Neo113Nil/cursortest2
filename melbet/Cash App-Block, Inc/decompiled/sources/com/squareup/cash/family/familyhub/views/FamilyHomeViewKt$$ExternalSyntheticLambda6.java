package com.squareup.cash.family.familyhub.views;

import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewEvent;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.viewmodels.ControlErrorViewEvent$Confirm;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$P2PEvent$ApprovedRowClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$P2PEvent$BlockedRowClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$P2PEvent$P2PLimitClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$LimitClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailIntroductionViewEvent$Close;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.ManagedAccountLoginQrCodeProviderViewEvent$ButtonPressed;
import com.squareup.cash.family.familyhub.viewmodels.SetDependentCustomLimitErrorViewEvent$Confirm;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetailViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class FamilyHomeViewKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ FamilyHomeViewKt$$ExternalSyntheticLambda6(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DependentControlViewEvent$P2PEvent$ApprovedRowClicked dependentControlViewEvent$P2PEvent$ApprovedRowClicked = DependentControlViewEvent$P2PEvent$ApprovedRowClicked.INSTANCE;
        DependentControlViewEvent$P2PEvent$BlockedRowClicked dependentControlViewEvent$P2PEvent$BlockedRowClicked = DependentControlViewEvent$P2PEvent$BlockedRowClicked.INSTANCE;
        AmountChooserViewEvent.TapConfigButton tapConfigButton = AmountChooserViewEvent.TapConfigButton.INSTANCE;
        AmountChooserViewEvent.TapSecondaryButton tapSecondaryButton = AmountChooserViewEvent.TapSecondaryButton.INSTANCE;
        AmountChooserViewEvent.TapPrimaryButton tapPrimaryButton = AmountChooserViewEvent.TapPrimaryButton.INSTANCE;
        SetDependentCustomLimitErrorViewEvent$Confirm setDependentCustomLimitErrorViewEvent$Confirm = SetDependentCustomLimitErrorViewEvent$Confirm.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(FamilyHomeViewEvent.TapBack.INSTANCE);
                break;
            case 1:
                function1.invoke(ControlErrorViewEvent$Confirm.INSTANCE);
                break;
            case 2:
                function1.invoke(DependentDetailViewEvent.OpenControlsAndLimitClicked.INSTANCE);
                break;
            case 3:
                function1.invoke(DependentDetailViewEvent.OpenNotificationSettingsClicked.INSTANCE);
                break;
            case 4:
                function1.invoke(new DependentControlViewEvent$ToggleEvent$LimitClicked(ControlType.CASH_CARD));
                break;
            case 5:
                function1.invoke(dependentControlViewEvent$P2PEvent$ApprovedRowClicked);
                break;
            case 6:
                function1.invoke(dependentControlViewEvent$P2PEvent$BlockedRowClicked);
                break;
            case 7:
                function1.invoke(DependentControlViewEvent$P2PEvent$P2PLimitClicked.INSTANCE);
                break;
            case 8:
                function1.invoke(DependentControlViewEvent.TapBack.INSTANCE);
                break;
            case 9:
                function1.invoke(dependentControlViewEvent$P2PEvent$ApprovedRowClicked);
                break;
            case 10:
                function1.invoke(dependentControlViewEvent$P2PEvent$BlockedRowClicked);
                break;
            case 11:
                function1.invoke(DependentControlsAndLimitsViewEvent.TapBack.INSTANCE);
                break;
            case 12:
                function1.invoke(DependentDetailViewEvent.TapSendCash.INSTANCE);
                break;
            case 13:
                function1.invoke(DependentDetailIntroductionViewEvent$Close.INSTANCE);
                break;
            case 14:
                function1.invoke(DependentDetailViewEvent.TapBack.INSTANCE);
                break;
            case 15:
                function1.invoke(DependentDetailViewEvent.TapShowQrCode.INSTANCE);
                break;
            case 16:
                function1.invoke(DependentDetailViewEvent.TapProfile.INSTANCE);
                break;
            case 17:
                function1.invoke(tapConfigButton);
                break;
            case 18:
                function1.invoke(tapPrimaryButton);
                break;
            case 19:
                function1.invoke(AmountChooserViewEvent.TapDismiss.INSTANCE);
                break;
            case 20:
                function1.invoke(tapConfigButton);
                break;
            case 21:
                function1.invoke(tapSecondaryButton);
                break;
            case 22:
                function1.invoke(tapSecondaryButton);
                break;
            case 23:
                function1.invoke(tapPrimaryButton);
                break;
            case 24:
                function1.invoke(FamilyHomeViewEvent.TapMembersSectionHeaderButton.INSTANCE);
                break;
            case 25:
                function1.invoke(FamilyPendingRequestsViewEvent.TapBack.INSTANCE);
                break;
            case 26:
                function1.invoke(ManagedAccountLoginQrCodeProviderViewEvent$ButtonPressed.INSTANCE);
                break;
            case 27:
                function1.invoke(setDependentCustomLimitErrorViewEvent$Confirm);
                break;
            case 28:
                function1.invoke(setDependentCustomLimitErrorViewEvent$Confirm);
                break;
            default:
                function1.invoke(SponsorDetailViewEvent.TapStartGraduation.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
