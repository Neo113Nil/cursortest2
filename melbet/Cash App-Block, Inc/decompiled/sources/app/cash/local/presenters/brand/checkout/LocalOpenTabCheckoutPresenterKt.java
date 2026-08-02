package app.cash.local.presenters.brand.checkout;

import app.cash.local.viewmodels.LocalCheckoutOrderSummaryViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentSectionViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentTimingViewModel;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import com.squareup.cash.work.service.real.CashAppServiceModule;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class LocalOpenTabCheckoutPresenterKt {
    public static final LocalOpenTabCheckoutViewModel EMPTY_MODEL;

    static {
        OrderBuilderModel.BuyerInfo.UiReady.Editing asEditable = CashAppServiceModule.asEditable(new OrderBuilderModel.BuyerInfo.Unvalidated(null, null, null));
        EmptyList emptyList = EmptyList.INSTANCE;
        LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel = new LocalCheckoutPaymentSectionViewModel("", emptyList);
        LocalCheckoutPaymentTimingViewModel.Option option = LocalCheckoutPaymentTimingViewModel.Option.PAY_AT_END;
        EMPTY_MODEL = new LocalOpenTabCheckoutViewModel(asEditable, localCheckoutPaymentSectionViewModel, new LocalCheckoutPaymentTimingViewModel(option, CollectionsKt__CollectionsKt.listOf((Object[]) new LocalCheckoutPaymentTimingViewModel.OptionViewModel[]{new LocalCheckoutPaymentTimingViewModel.OptionViewModel(option), new LocalCheckoutPaymentTimingViewModel.OptionViewModel(LocalCheckoutPaymentTimingViewModel.Option.PAY_NOW)})), null, new LocalCheckoutOrderSummaryViewModel(0, emptyList, null, false, 60), "", "", false, false);
    }
}
