package com.squareup.cash.investing.components.news;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class NewsArticleAdapter$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingNewsArticleView f$0;

    public /* synthetic */ NewsArticleAdapter$$ExternalSyntheticLambda0(InvestingNewsArticleView investingNewsArticleView, int i) {
        this.$r8$classId = i;
        this.f$0 = investingNewsArticleView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        InvestingNewsArticleView investingNewsArticleView = this.f$0;
        switch (i) {
            case 0:
                return new XInt(investingNewsArticleView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE));
            case 1:
                return new XInt(investingNewsArticleView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE));
            case 2:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(investingNewsArticleView.m3814getYdipdBGyhoQ(40));
            case 3:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(investingNewsArticleView.m3813getXdipTENr5nQ(16) + investingNewsArticleView.m3818rightTENr5nQ(investingNewsArticleView.avatarView));
            case 4:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingNewsArticleView.m3813getXdipTENr5nQ(24));
            case 5:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(investingNewsArticleView.m3819topdBGyhoQ(investingNewsArticleView.avatarView));
            case 6:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(investingNewsArticleView.m3816leftTENr5nQ(investingNewsArticleView.sourceView));
            case 7:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(investingNewsArticleView.m3812centerYdBGyhoQ(investingNewsArticleView.avatarView));
            case 8:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(investingNewsArticleView.m3819topdBGyhoQ(investingNewsArticleView.avatarView));
            case 9:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(investingNewsArticleView.m3818rightTENr5nQ(investingNewsArticleView.sourceView));
            case 10:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(investingNewsArticleView.m3814getYdipdBGyhoQ(2) + investingNewsArticleView.m3810bottomdBGyhoQ(investingNewsArticleView.sourceView));
            case 11:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(investingNewsArticleView.m3816leftTENr5nQ(investingNewsArticleView.avatarView));
            case 12:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(investingNewsArticleView.m3818rightTENr5nQ(investingNewsArticleView.sourceView));
            case 13:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(investingNewsArticleView.m3814getYdipdBGyhoQ(20) + investingNewsArticleView.m3810bottomdBGyhoQ(investingNewsArticleView.avatarView));
            case 14:
                return new YInt(investingNewsArticleView.m3814getYdipdBGyhoQ(24) + investingNewsArticleView.m3810bottomdBGyhoQ(investingNewsArticleView.headlineView));
            case 15:
                return new XInt(investingNewsArticleView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 16:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(investingNewsArticleView.m3813getXdipTENr5nQ(40));
            default:
                return new YInt(investingNewsArticleView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
        }
    }
}
