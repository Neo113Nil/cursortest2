package com.squareup.cash.shopping.views;

import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentAddCardViewEvent$ActionButtonPressed;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCancelPlanDialogViewEvent;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCardDetailsViewEvent$ConfirmButtonPressed;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCheckoutViewEvent;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentPlanDetailsViewEvent;
import com.squareup.cash.shopping.viewmodels.BrandsSearchViewEvent;
import com.squareup.cash.shopping.viewmodels.IncentiveSheetViewEvent;
import com.squareup.cash.shopping.viewmodels.ProductSearchViewEvent;
import com.squareup.cash.shopping.viewmodels.RestrictedItemWarningSheetViewEvent$Close;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.stablecoin.viewmodels.StablecoinHomeViewEvent$BackClicked;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class BrandsSearchView$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BrandsSearchView$$ExternalSyntheticLambda6(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        StablecoinHomeViewEvent$BackClicked stablecoinHomeViewEvent$BackClicked = StablecoinHomeViewEvent$BackClicked.INSTANCE;
        SingleUsePaymentCheckoutViewEvent.ActionButtonPressed actionButtonPressed = SingleUsePaymentCheckoutViewEvent.ActionButtonPressed.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(BrandsSearchViewEvent.NavigateUpClick.INSTANCE);
                break;
            case 1:
                function1.invoke(SingleUsePaymentAddCardViewEvent$ActionButtonPressed.INSTANCE);
                break;
            case 2:
                function1.invoke(SingleUsePaymentCancelPlanDialogViewEvent.GoBackPressed.INSTANCE);
                break;
            case 3:
                function1.invoke(SingleUsePaymentCancelPlanDialogViewEvent.CancelPlanPressed.INSTANCE);
                break;
            case 4:
                function1.invoke(SingleUsePaymentCardDetailsViewEvent$ConfirmButtonPressed.INSTANCE);
                break;
            case 5:
                function1.invoke(SingleUsePaymentPlanDetailsViewEvent.CardDetailsButtonPressed.INSTANCE);
                break;
            case 6:
                function1.invoke(SingleUsePaymentPlanDetailsViewEvent.CancelPlanButtonPressed.INSTANCE);
                break;
            case 7:
                function1.invoke(actionButtonPressed);
                break;
            case 8:
                function1.invoke(actionButtonPressed);
                break;
            case 9:
                function1.invoke(actionButtonPressed);
                break;
            case 10:
                function1.invoke(actionButtonPressed);
                break;
            case 11:
                function1.invoke(actionButtonPressed);
                break;
            case 12:
                function1.invoke(actionButtonPressed);
                break;
            case 13:
                function1.invoke(actionButtonPressed);
                break;
            case 14:
                function1.invoke(actionButtonPressed);
                break;
            case 15:
                function1.invoke(actionButtonPressed);
                break;
            case 16:
                function1.invoke(actionButtonPressed);
                break;
            case 17:
                function1.invoke(ShoppingWebViewEvent.CustomerDataAutofillPressed.INSTANCE);
                break;
            case 18:
                function1.invoke(ShoppingWebViewEvent.CardAutofillPressed.INSTANCE);
                break;
            case 19:
                function1.invoke(BrandsSearchViewEvent.RetrySearchClick.INSTANCE);
                break;
            case 20:
                function1.invoke(IncentiveSheetViewEvent.CloseSheet.INSTANCE);
                break;
            case 21:
                function1.invoke(IncentiveSheetViewEvent.ContinueWithCashAppPay.INSTANCE);
                break;
            case 22:
                function1.invoke(ProductSearchViewEvent.NavigateUpClick.INSTANCE);
                break;
            case 23:
                function1.invoke(ProductSearchViewEvent.FilterClick.INSTANCE);
                break;
            case 24:
                function1.invoke(ProductSearchViewEvent.RetrySearchClick.INSTANCE);
                break;
            case 25:
                function1.invoke(RestrictedItemWarningSheetViewEvent$Close.INSTANCE);
                break;
            case 26:
                function1.invoke(ShoppingWebViewEvent.FooterPillPressed.INSTANCE);
                break;
            case 27:
                function1.invoke(ShoppingWebViewEvent.Close.INSTANCE);
                break;
            case 28:
                function1.invoke(stablecoinHomeViewEvent$BackClicked);
                break;
            default:
                function1.invoke(stablecoinHomeViewEvent$BackClicked);
                break;
        }
        return Unit.INSTANCE;
    }
}
