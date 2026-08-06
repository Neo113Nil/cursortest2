package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.C0311bl;
import io.appmetrica.analytics.impl.C0363dl;
import io.appmetrica.analytics.impl.C0414fl;
import io.appmetrica.analytics.impl.C0448h3;
import io.appmetrica.analytics.impl.C0614ne;
import io.appmetrica.analytics.impl.Kf;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ECommerceEvent implements Kf {
    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C0448h3(4, eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new C0614ne(6, eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new C0614ne(7, eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C0448h3(5, eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new C0311bl(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return new C0363dl(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new C0414fl(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public abstract /* synthetic */ List toProto();
}
