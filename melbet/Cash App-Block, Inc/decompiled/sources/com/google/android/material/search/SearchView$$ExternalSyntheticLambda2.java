package com.google.android.material.search;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ViewUtils;

/* loaded from: classes4.dex */
public final /* synthetic */ class SearchView$$ExternalSyntheticLambda2 implements ViewUtils.OnApplyWindowInsetsListener, OnApplyWindowInsetsListener {
    public final /* synthetic */ SearchView f$0;

    public /* synthetic */ SearchView$$ExternalSyntheticLambda2(SearchView searchView) {
        this.f$0 = searchView;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = SearchView.$r8$clinit;
        int i2 = windowInsetsCompat.mImpl.getInsets(647).top;
        SearchView searchView = this.f$0;
        View view2 = searchView.statusBarSpacer;
        if (view2.getLayoutParams().height != i2) {
            view2.getLayoutParams().height = i2;
            view2.requestLayout();
        }
        if (!searchView.statusBarSpacerEnabledOverride) {
            view2.setVisibility(i2 > 0 ? 0 : 8);
        }
        return windowInsetsCompat;
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        MaterialToolbar materialToolbar = this.f$0.toolbar;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(materialToolbar);
        int i = isLayoutRtl ? relativePadding.end : relativePadding.start;
        int i2 = isLayoutRtl ? relativePadding.start : relativePadding.end;
        Insets insets = windowInsetsCompat.mImpl.getInsets(647);
        materialToolbar.setPadding(i + insets.left, relativePadding.top, i2 + insets.right, relativePadding.bottom);
        return windowInsetsCompat;
    }
}
