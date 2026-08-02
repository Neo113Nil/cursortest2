package com.squareup.cash.dialog;

import com.squareup.cash.banking.viewmodels.DemandDepositDialogViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeEvent;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeExpiredEvent;
import com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.error.PhysicalDepositErrorEvent;
import com.squareup.cash.deposits.physical.viewmodels.location.LocationDeniedEvents;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmExplainerViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmPmdExplainerViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmRetailerEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.LimitReachedDialogEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapEvent;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.ui.overlays.viewmodels.AlertDialogViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposeDialogKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ComposeDialogKt$$ExternalSyntheticLambda4(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PaperMoneyDepositBarcodeEvent.Exit exit = PaperMoneyDepositBarcodeEvent.Exit.INSTANCE;
        AtmExplainerViewEvent.Done done = AtmExplainerViewEvent.Done.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(AlertDialogViewEvent.TapOutside.INSTANCE);
                break;
            case 1:
                function1.invoke(PaperMoneyDepositBarcodeEvent.FeeInformationClick.INSTANCE);
                break;
            case 2:
                function1.invoke(exit);
                break;
            case 3:
                function1.invoke(exit);
                break;
            case 4:
                function1.invoke(PaperMoneyDepositBarcodeExpiredEvent.Close.INSTANCE);
                break;
            case 5:
                function1.invoke(LocationDetailsViewEvent.PrimaryButtonClick.INSTANCE);
                break;
            case 6:
                function1.invoke(LocationDetailsViewEvent.CopyAddressClick.INSTANCE);
                break;
            case 7:
                function1.invoke(LocationDetailsViewEvent.FeeInformationClick.INSTANCE);
                break;
            case 8:
                function1.invoke(LocationDetailsViewEvent.SecondaryButtonClick.INSTANCE);
                break;
            case 9:
                function1.invoke(PhysicalDepositErrorEvent.ActionNegativeClick.INSTANCE);
                break;
            case 10:
                function1.invoke(PhysicalDepositErrorEvent.ActionPositiveClick.INSTANCE);
                break;
            case 11:
                function1.invoke(LocationDeniedEvents.Ignore.INSTANCE);
                break;
            case 12:
                function1.invoke(LocationDeniedEvents.UpdatePermissions.INSTANCE);
                break;
            case 13:
                function1.invoke(AtmPmdExplainerViewEvent.Exit.INSTANCE);
                break;
            case 14:
                function1.invoke(AtmRetailerEvent.ExitClick.INSTANCE);
                break;
            case 15:
                function1.invoke(AtmRetailerEvent.HelpClick.INSTANCE);
                break;
            case 16:
                function1.invoke(AtmRetailerEvent.SearchClick.INSTANCE);
                break;
            case 17:
                function1.invoke(done);
                break;
            case 18:
                function1.invoke(done);
                break;
            case 19:
                function1.invoke(LimitReachedDialogEvent.ActionPositiveClick.INSTANCE);
                break;
            case 20:
                function1.invoke(LimitReachedDialogEvent.ActionNegativeClick.INSTANCE);
                break;
            case 21:
                function1.invoke(PaperMoneyDepositMapEvent.SearchClick.INSTANCE);
                break;
            case 22:
                function1.invoke(PaperMoneyDepositMapEvent.ShowBarcodeClick.INSTANCE);
                break;
            case 23:
                function1.invoke(PaperMoneyDepositMapEvent.BackClick.INSTANCE);
                break;
            case 24:
                function1.invoke(PaperMoneyDepositMapEvent.HelpClick.INSTANCE);
                break;
            case 25:
                function1.invoke(AlertDialogResult.POSITIVE);
                break;
            case 26:
                function1.invoke(AlertDialogResult.NEGATIVE);
                break;
            case 27:
                function1.invoke(AlertDialogViewEvent.BackPressed.INSTANCE);
                break;
            case 28:
                function1.invoke(DemandDepositDialogViewEvent.TapPrimaryButton.INSTANCE);
                break;
            default:
                function1.invoke(DemandDepositDialogViewEvent.TapSecondaryButton.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
