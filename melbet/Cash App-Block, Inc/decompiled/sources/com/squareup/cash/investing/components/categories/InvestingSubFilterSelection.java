package com.squareup.cash.investing.components.categories;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import com.squareup.cash.R;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.contour.ContourLayout;

/* loaded from: classes6.dex */
public final class InvestingSubFilterSelection extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ColorPalette colorPalette;
    public final AppCompatTextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingSubFilterSelection(Context context) {
        super(context, null);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setGravity(1);
        appCompatTextView.setTextSize(18.0f);
        BundleKt.setTypeface(appCompatTextView, R.font.cashsans_medium);
        appCompatTextView.setTextColor(colorPalette.label);
        this.titleView = appCompatTextView;
        contourHeightOf(new InvestingSubFilterSelection$$ExternalSyntheticLambda3(this, 2));
        ContourLayout.layoutBy$default(this, appCompatTextView, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(8)));
    }
}
