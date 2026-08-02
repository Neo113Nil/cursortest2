package com.squareup.cash.investing.components.news;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.investing.components.common.InvestingImageView;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.contour.ContourLayout;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;

/* loaded from: classes6.dex */
public final class InvestingNewsArticleView extends ContourLayout {
    public final InvestingImageView avatarView;
    public final ComposeView border;
    public final TextView headlineView;
    public final TextView sourceView;
    public final TextView timestampView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingNewsArticleView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        realImageLoader.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        InvestingImageView investingImageView = new InvestingImageView(context, realImageLoader);
        this.avatarView = investingImageView;
        TextView textView = new TextView(context);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextSize(0, Views.sp((View) textView, 16.0f));
        textView.setTypeface(ResourcesCompat.getFont(context, R.font.cashsans_medium));
        textView.setTextColor(colorPalette.label);
        this.sourceView = textView;
        TextView textView2 = new TextView(context);
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setAllCaps(true);
        textView2.setTextSize(0, Views.sp((View) textView2, 12.0f));
        textView2.setTypeface(ResourcesCompat.getFont(context, R.font.cashsans_medium));
        textView2.setTextColor(colorPalette.placeholderLabel);
        this.timestampView = textView2;
        TextView textView3 = new TextView(context);
        textView3.setEllipsize(truncateAt);
        textView3.setMaxLines(3);
        textView3.setMinLines(3);
        textView3.setTextSize(0, Views.sp((View) textView3, 16.0f));
        textView3.setTypeface(ResourcesCompat.getFont(context, R.font.cashsans_medium));
        textView3.setTextColor(colorPalette.label);
        textView3.setLineSpacing(RecyclerView.DECELERATION_RATE, 1.375f);
        this.headlineView = textView3;
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(9), true, -1158123419));
        composeView.setVisibility(8);
        this.border = composeView;
        contourWidthOf(new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 1));
        contourHeightOf(new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 14));
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 15));
        leftTo.widthOf(1, new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 16));
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 17));
        byteArrayProtoReader32.heightOf(1, new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 2));
        ContourLayout.layoutBy$default(this, investingImageView, leftTo, byteArrayProtoReader32);
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 3));
        leftTo2.rightTo(1, new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 4));
        ContourLayout.layoutBy$default(this, textView, leftTo2, ContourLayout.topTo(new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 5)));
        ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 6));
        leftTo3.rightTo(1, new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 9));
        ContourLayout.layoutBy$default(this, textView2, leftTo3, ContourLayout.topTo(new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 10)));
        ByteArrayProtoReader32 leftTo4 = ContourLayout.leftTo(new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 11));
        leftTo4.rightTo(1, new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 12));
        ContourLayout.layoutBy$default(this, textView3, leftTo4, ContourLayout.topTo(new NewsArticleAdapter$$ExternalSyntheticLambda0(this, 13)));
        ContourLayout.layoutBy$default(this, composeView, ContourLayout.matchParentX(0, 0), ContourLayout.matchParentY$default(this));
    }
}
