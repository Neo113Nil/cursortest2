package app.cash.local.presenters.brand.checkout;

import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import com.squareup.cash.work.service.real.CashAppServiceModule;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class LocalBrandLocationCheckoutPresenterKt {
    public static final LocalBrandLocationCheckoutViewModel EMPTY_MODEL;

    static {
        EmptyList emptyList = EmptyList.INSTANCE;
        EMPTY_MODEL = new LocalBrandLocationCheckoutViewModel(emptyList, null, null, null, null, CashAppServiceModule.asEditable(new OrderBuilderModel.BuyerInfo.Unvalidated(null, null, null)), null, null, null, null, "", emptyList, emptyList, null, null, null, null, OrderBuilderModel.OrderType.Pickup.INSTANCE, null, null, null, null, null, null, false, 63299608);
    }
}
