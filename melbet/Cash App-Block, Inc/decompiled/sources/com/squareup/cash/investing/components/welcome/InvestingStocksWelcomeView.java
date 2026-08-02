package com.squareup.cash.investing.components.welcome;

import android.content.Context;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.NestedScrollingChild;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.contour.ContourLayout;
import com.squareup.wire.ByteArrayProtoReader32;

/* loaded from: classes6.dex */
public final class InvestingStocksWelcomeView extends ContourLayout implements NestedScrollingChild {
    public final ComposeView heroView;
    public InvestingHomeViewModel.StocksWelcome lastRenderedModel;

    public InvestingStocksWelcomeView(Context context, RealImageLoader realImageLoader) {
        super(context);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        this.heroView = composeView;
        contourHeightOf(new TooltipBoxKt$$ExternalSyntheticLambda2(this, 5));
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new InvestmentEntityQueries$$ExternalSyntheticLambda1(11));
        leftTo.rightTo(1, new InvestmentEntityQueries$$ExternalSyntheticLambda1(12));
        ContourLayout.layoutBy$default(this, composeView, leftTo, ContourLayout.topTo(new InvestmentEntityQueries$$ExternalSyntheticLambda1(13)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof RecyclerView) {
            RecyclerView.ItemAnimator itemAnimator = ((RecyclerView) parent).mItemAnimator;
            if ((itemAnimator instanceof DefaultItemAnimator) && ((DefaultItemAnimator) itemAnimator).mSupportsChangeAnimations) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            }
        }
    }
}
