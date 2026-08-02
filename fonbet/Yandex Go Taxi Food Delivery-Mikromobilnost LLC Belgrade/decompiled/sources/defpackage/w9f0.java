package defpackage;

import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class w9f0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProductsFragment b;

    public /* synthetic */ w9f0(ProductsFragment productsFragment, int i) {
        this.a = i;
        this.b = productsFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$7;
        zy11 renderEducationV2$lambda$34$lambda$33$lambda$32;
        zy11 onViewCreated$lambda$13;
        int i = this.a;
        ProductsFragment productsFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$7 = ProductsFragment.onViewCreated$lambda$7(productsFragment);
                return onViewCreated$lambda$7;
            case 1:
                renderEducationV2$lambda$34$lambda$33$lambda$32 = ProductsFragment.renderEducationV2$lambda$34$lambda$33$lambda$32(productsFragment);
                return renderEducationV2$lambda$34$lambda$33$lambda$32;
            default:
                onViewCreated$lambda$13 = ProductsFragment.onViewCreated$lambda$13(productsFragment);
                return onViewCreated$lambda$13;
        }
    }
}
