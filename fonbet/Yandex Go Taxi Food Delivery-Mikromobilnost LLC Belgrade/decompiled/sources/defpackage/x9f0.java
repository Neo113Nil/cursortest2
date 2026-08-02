package defpackage;

import android.net.Uri;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class x9f0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProductsFragment b;

    public /* synthetic */ x9f0(ProductsFragment productsFragment, int i) {
        this.a = i;
        this.b = productsFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 showBottomSheet$lambda$44$lambda$43;
        boolean onViewCreated$lambda$11;
        zy11 onViewCreated$lambda$12;
        boolean onViewCreated$lambda$15;
        boolean onViewCreated$lambda$16;
        int i = this.a;
        ProductsFragment productsFragment = this.b;
        switch (i) {
            case 0:
                showBottomSheet$lambda$44$lambda$43 = ProductsFragment.showBottomSheet$lambda$44$lambda$43(productsFragment, ((Boolean) obj).booleanValue());
                return showBottomSheet$lambda$44$lambda$43;
            case 1:
                onViewCreated$lambda$11 = ProductsFragment.onViewCreated$lambda$11(productsFragment, (Uri) obj);
                return Boolean.valueOf(onViewCreated$lambda$11);
            case 2:
                onViewCreated$lambda$12 = ProductsFragment.onViewCreated$lambda$12(productsFragment, (tb6) obj);
                return onViewCreated$lambda$12;
            case 3:
                onViewCreated$lambda$15 = ProductsFragment.onViewCreated$lambda$15(productsFragment, (Uri) obj);
                return Boolean.valueOf(onViewCreated$lambda$15);
            default:
                onViewCreated$lambda$16 = ProductsFragment.onViewCreated$lambda$16(productsFragment, (Uri) obj);
                return Boolean.valueOf(onViewCreated$lambda$16);
        }
    }
}
