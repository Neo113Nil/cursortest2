package com.squareup.cash.investing.components;

import android.content.Context;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.components.categories.InvestingCategoryFilterPill;
import com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView;
import com.squareup.cash.investing.components.categories.InvestingFilterGroupCarouselView;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes6.dex */
public final /* synthetic */ class MyFirstConfigurationView$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MyFirstConfigurationView$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 1:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 2:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 3:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 4:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 5:
                InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel = (InvestingStockSelectionViewModel.SearchResultItemModel) obj;
                searchResultItemModel.getClass();
                return searchResultItemModel.symbol;
            case 6:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                return new YInt(((Huffman.Node) layoutSpec.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() / 2);
            case 7:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 8:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 9:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 10:
                ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                layoutSpec2.getClass();
                return new YInt(((Huffman.Node) layoutSpec2.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() / 2);
            case 11:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 12:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 13:
                int i = MooncakeMyInvestmentsTileView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 14:
                int i2 = MooncakeMyInvestmentsTileView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 15:
                int i3 = MooncakeMyInvestmentsTileView.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 16:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 17:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 18:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 19:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 20:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 21:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 22:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 23:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.inPlaceLoadingTransition(animatedContentTransitionScopeImpl);
            case 24:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                return Strings.inPlaceLoadingTransition(animatedContentTransitionScopeImpl2);
            case 25:
                int i4 = InvestingCategoryFilterPill.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 26:
                int i5 = InvestingCategoryFilterPill.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 27:
                int i6 = InvestingCategoryFilterPill.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 28:
                int i7 = InvestingFilterCategoriesView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            default:
                Context context = (Context) obj;
                context.getClass();
                InvestingFilterGroupCarouselView investingFilterGroupCarouselView = new InvestingFilterGroupCarouselView(context, null);
                investingFilterGroupCarouselView.setElevation(4.0f);
                return investingFilterGroupCarouselView;
        }
    }
}
