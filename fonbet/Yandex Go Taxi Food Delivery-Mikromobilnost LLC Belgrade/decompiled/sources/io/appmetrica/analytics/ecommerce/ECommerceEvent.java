package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.Bo;
import io.appmetrica.analytics.impl.C0179a4;
import io.appmetrica.analytics.impl.C0192ah;
import io.appmetrica.analytics.impl.C0921zo;
import io.appmetrica.analytics.impl.Do;
import io.appmetrica.analytics.impl.InterfaceC0886yi;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ECommerceEvent implements InterfaceC0886yi {
    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C0179a4(4, eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new C0192ah(6, eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new C0192ah(7, eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C0179a4(5, eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new C0921zo(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return new Bo(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new Do(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0886yi
    public abstract /* synthetic */ List toProto();
}
