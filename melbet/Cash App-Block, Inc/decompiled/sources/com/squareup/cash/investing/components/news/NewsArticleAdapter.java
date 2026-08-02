package com.squareup.cash.investing.components.news;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.size.DimensionKt;
import coil3.transform.CircleCropTransformation;
import coil3.transform.Transformation;
import com.squareup.cash.R;
import com.squareup.cash.arcade.treehouse.QrCodeScannerBinding$$ExternalSyntheticLambda0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.common.InvestingImageView;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.investingcrypto.viewmodels.news.Bookmark;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleListItem;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoViewAllNewsModel;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.cash.support.chat.views.transcript.ItemDiffCallback;
import com.squareup.cash.support.chat.views.transcript.NameDisplayViewHolder;
import com.squareup.contour.ContourLayout;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.ContextAwareKt;

/* loaded from: classes6.dex */
public final class NewsArticleAdapter extends ListAdapter {
    public QrCodeScannerBinding$$ExternalSyntheticLambda0 eventReceiver;
    public final RealImageLoader imageLoader;
    public final boolean showAsCards;

    public final class ArticleViewHolder extends RecyclerView.ViewHolder {
        public final InvestingNewsArticleView view;

        public ArticleViewHolder(InvestingNewsArticleView investingNewsArticleView) {
            super(investingNewsArticleView);
            this.view = investingNewsArticleView;
        }
    }

    public final class ViewAllViewHolder extends RecyclerView.ViewHolder {
        public final InvestingViewAllNewsView view;

        public ViewAllViewHolder(InvestingViewAllNewsView investingViewAllNewsView) {
            super(investingViewAllNewsView);
            this.view = investingViewAllNewsView;
        }
    }

    public NewsArticleAdapter(RealImageLoader realImageLoader) {
        super(new ItemDiffCallback(1));
        this.imageLoader = realImageLoader;
        this.showAsCards = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        InvestingCryptoNewsArticleListItem investingCryptoNewsArticleListItem = (InvestingCryptoNewsArticleListItem) this.mDiffer.mReadOnlyList.get(i);
        if (investingCryptoNewsArticleListItem instanceof InvestingCryptoNewsArticleViewModel) {
            return 1;
        }
        if (investingCryptoNewsArticleListItem instanceof InvestingCryptoViewAllNewsModel) {
            return 2;
        }
        if (investingCryptoNewsArticleListItem instanceof Bookmark) {
            return 3;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        InvestingCryptoNewsArticleListItem investingCryptoNewsArticleListItem = (InvestingCryptoNewsArticleListItem) this.mDiffer.mReadOnlyList.get(i);
        if (!(investingCryptoNewsArticleListItem instanceof InvestingCryptoNewsArticleViewModel)) {
            if (!(investingCryptoNewsArticleListItem instanceof InvestingCryptoViewAllNewsModel)) {
                if (investingCryptoNewsArticleListItem instanceof Bookmark) {
                    return;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            InvestingViewAllNewsView investingViewAllNewsView = ((ViewAllViewHolder) viewHolder).view;
            investingViewAllNewsView.getClass();
            Integer forTheme = DimensionKt.forTheme(((InvestingCryptoViewAllNewsModel) investingCryptoNewsArticleListItem).accentColor, ThemeHelpersKt.themeInfo(investingViewAllNewsView));
            forTheme.getClass();
            int intValue = forTheme.intValue();
            AppCompatImageView appCompatImageView = investingViewAllNewsView.iconView;
            Context context = investingViewAllNewsView.getContext();
            context.getClass();
            appCompatImageView.setImageDrawable(PlatformKt.getDrawableCompat(context, R.drawable.investing_components_view_all_news, forTheme));
            investingViewAllNewsView.labelView.setTextColor(intValue);
            investingViewAllNewsView.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 6));
            return;
        }
        InvestingNewsArticleView investingNewsArticleView = ((ArticleViewHolder) viewHolder).view;
        InvestingCryptoNewsArticleViewModel investingCryptoNewsArticleViewModel = (InvestingCryptoNewsArticleViewModel) investingCryptoNewsArticleListItem;
        TextView textView = investingNewsArticleView.sourceView;
        TextView textView2 = investingNewsArticleView.timestampView;
        InvestingImageView investingImageView = investingNewsArticleView.avatarView;
        Image image = investingCryptoNewsArticleViewModel.avatar;
        String str = investingCryptoNewsArticleViewModel.timestamp;
        ColorModel colorModel = investingCryptoNewsArticleViewModel.accentColor;
        new InvestingCryptoAvatarContentModel$Image(image, colorModel);
        RealImageLoader realImageLoader = investingImageView.imageLoader;
        ThemeInfo themeInfo = investingImageView.themeInfo;
        investingImageView.setVisibility(0);
        Integer forTheme2 = DimensionKt.forTheme(colorModel, themeInfo);
        forTheme2.getClass();
        int intValue2 = forTheme2.intValue();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(intValue2);
        shapeDrawable.setIntrinsicWidth(-1);
        shapeDrawable.setIntrinsicHeight(-1);
        Context context2 = investingImageView.getContext();
        context2.getClass();
        ImageRequest.Builder builder = new ImageRequest.Builder(context2);
        builder.data = ThemablesKt.urlForTheme(image, themeInfo);
        Transformation[] transformationArr = {new CircleCropTransformation()};
        Extras.Key key = ImageRequestsKt.transformationsKey;
        ImageRequestsKt.transformations(builder, ArraysKt___ArraysKt.toList(transformationArr));
        ImageRequests_androidKt.placeholder(builder, shapeDrawable);
        ImageRequests_androidKt.error(builder, shapeDrawable);
        ImageRequests_androidKt.target(builder, investingImageView);
        realImageLoader.enqueue(builder.build());
        investingNewsArticleView.headlineView.setText(investingCryptoNewsArticleViewModel.headline);
        textView2.setText(str);
        textView2.setVisibility((str == null || StringsKt.isBlank(str)) ? 8 : 0);
        textView.setText(investingCryptoNewsArticleViewModel.provider);
        ContourLayout.updateLayoutBy$default(investingNewsArticleView, textView, null, textView2.getVisibility() == 8 ? ContourLayout.centerVerticallyTo(new NewsArticleAdapter$$ExternalSyntheticLambda0(investingNewsArticleView, 7)) : ContourLayout.topTo(new NewsArticleAdapter$$ExternalSyntheticLambda0(investingNewsArticleView, 8)), 1);
        investingNewsArticleView.setOnClickListener(new CardItemView$$ExternalSyntheticLambda0(this, investingCryptoNewsArticleViewModel, i, 2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new NameDisplayViewHolder(new Space(viewGroup.getContext()));
                }
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown view type "));
                return null;
            }
            Context context = viewGroup.getContext();
            context.getClass();
            InvestingViewAllNewsView investingViewAllNewsView = new InvestingViewAllNewsView(context);
            ContextAwareKt.InvestingCarouselCard(investingViewAllNewsView);
            return new ViewAllViewHolder(investingViewAllNewsView);
        }
        Context context2 = viewGroup.getContext();
        context2.getClass();
        InvestingNewsArticleView investingNewsArticleView = new InvestingNewsArticleView(context2, this.imageLoader);
        if (this.showAsCards) {
            investingNewsArticleView.border.setVisibility(0);
            investingNewsArticleView.contourWidthOf(new NewsArticleAdapter$$ExternalSyntheticLambda0(investingNewsArticleView, 0));
            ContextAwareKt.InvestingCarouselCard(investingNewsArticleView);
        } else {
            TextView textView = investingNewsArticleView.headlineView;
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setMinLines(0);
            investingNewsArticleView.setBackground(RipplesKt.createRippleDrawable$default(investingNewsArticleView, Integer.valueOf(ThemeHelpersKt.themeInfo(investingNewsArticleView).colorPalette.background), 2));
            investingNewsArticleView.contourWidthOf(new NewsArticleAdapter$$ExternalSyntheticLambda1(0));
        }
        return new ArticleViewHolder(investingNewsArticleView);
    }
}
