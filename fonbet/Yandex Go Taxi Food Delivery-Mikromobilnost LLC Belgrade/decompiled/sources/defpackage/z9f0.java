package defpackage;

import android.view.View;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;

/* loaded from: classes13.dex */
public final /* synthetic */ class z9f0 implements mlf, llf {
    public final /* synthetic */ ProductsFragment a;

    public /* synthetic */ z9f0(ProductsFragment productsFragment) {
        this.a = productsFragment;
    }

    @Override // defpackage.mlf
    public void onRefresh() {
        ProductsFragment.onViewCreated$lambda$9$lambda$8(this.a);
    }

    @Override // defpackage.llf
    public boolean q(CustomSwipeRefreshLayout customSwipeRefreshLayout, View view) {
        boolean onViewCreated$lambda$10;
        onViewCreated$lambda$10 = ProductsFragment.onViewCreated$lambda$10(this.a, customSwipeRefreshLayout, view);
        return onViewCreated$lambda$10;
    }
}
