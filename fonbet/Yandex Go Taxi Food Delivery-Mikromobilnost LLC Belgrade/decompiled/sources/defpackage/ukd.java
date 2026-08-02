package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.CompositeOfferContainerView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.CompositeProductsLayout;

/* loaded from: classes2.dex */
public final class ukd implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CompositeOfferContainerView b;
    public final /* synthetic */ int c;

    public /* synthetic */ ukd(CompositeOfferContainerView compositeOfferContainerView, int i, int i2) {
        this.a = i2;
        this.b = compositeOfferContainerView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        CompositeOfferContainerView compositeOfferContainerView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = compositeOfferContainerView.findViewById(i2);
                    if (findViewById != null) {
                        return (CompositeProductsLayout) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.CompositeProductsLayout");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            default:
                kgx kgxVar2 = (kgx) obj;
                try {
                    KeyEvent.Callback findViewById2 = compositeOfferContainerView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (rkd) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.offer.CompositeOffer");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
        }
    }
}
