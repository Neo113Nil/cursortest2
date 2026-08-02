package com.squareup.cash.investing.components.categories;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryTileContentModel;
import com.squareup.cash.investingcrypto.components.common.drawables.ContentMaskDrawable;
import com.squareup.cash.investingcrypto.components.common.drawables.InvestingCryptoDrawables$rippleOnPress$ripple$1;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.theming.PressKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.util.android.Views;
import defpackage.JsonLogicResult;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.CharsKt;

/* loaded from: classes6.dex */
public final class CategoryAdapter extends RecyclerView.Adapter {
    public List data = EmptyList.INSTANCE;
    public GpsConfigQueries$$ExternalSyntheticLambda2 listener;
    public final MooncakeInvestingCategoryTileView$Factory$Impl tileFactory;

    public final class ViewHolder extends RecyclerView.ViewHolder {
        public final MooncakeInvestingCategoryTileView view;

        public ViewHolder(MooncakeInvestingCategoryTileView mooncakeInvestingCategoryTileView) {
            super(mooncakeInvestingCategoryTileView);
            this.view = mooncakeInvestingCategoryTileView;
        }
    }

    public CategoryAdapter(MooncakeInvestingCategoryTileView$Factory$Impl mooncakeInvestingCategoryTileView$Factory$Impl) {
        this.tileFactory = mooncakeInvestingCategoryTileView$Factory$Impl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.getClass();
        InvestingCategoryTileContentModel investingCategoryTileContentModel = (InvestingCategoryTileContentModel) this.data.get(i);
        MooncakeInvestingCategoryTileView mooncakeInvestingCategoryTileView = viewHolder2.view;
        ImageView imageView = mooncakeInvestingCategoryTileView.iconView;
        investingCategoryTileContentModel.getClass();
        AppCompatTextView appCompatTextView = mooncakeInvestingCategoryTileView.labelView;
        String str = investingCategoryTileContentModel.title;
        appCompatTextView.setText(str);
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                appCompatTextView.setMaxLines(1);
                break;
            } else {
                if (CharsKt.isWhitespace(str.charAt(i2))) {
                    appCompatTextView.setMaxLines(2);
                    break;
                }
                i2++;
            }
        }
        Integer forTheme = ThemablesKt.forTheme(investingCategoryTileContentModel.backgroundColor, ThemeHelpersKt.themeInfo(mooncakeInvestingCategoryTileView));
        int intValue = forTheme != null ? forTheme.intValue() : -7334914;
        LayerDrawable layerWith = JsonLogicResult.layerWith(FragmentKt.roundedRect(mooncakeInvestingCategoryTileView.density * 24.0f, intValue), mooncakeInvestingCategoryTileView.gradientDrawable);
        mooncakeInvestingCategoryTileView.setBackground(JsonLogicResult.layerWith(layerWith, new InvestingCryptoDrawables$rippleOnPress$ripple$1(ColorStateList.valueOf(PressKt.pressColor$default(ThemeHelpersKt.themeInfo(mooncakeInvestingCategoryTileView), Integer.valueOf(intValue), 2)), null, new ContentMaskDrawable(layerWith))));
        RealImageLoader realImageLoader = mooncakeInvestingCategoryTileView.imageLoader;
        Context context = mooncakeInvestingCategoryTileView.getContext();
        context.getClass();
        ImageRequest.Builder builder = new ImageRequest.Builder(context);
        builder.data = investingCategoryTileContentModel.imageUrl;
        ImageRequests_androidKt.target(builder, imageView);
        realImageLoader.enqueue(builder.build());
        imageView.setImageTintList(ColorStateList.valueOf(intValue));
        if (this.listener != null) {
            mooncakeInvestingCategoryTileView.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(23, this, investingCategoryTileContentModel));
        } else {
            mooncakeInvestingCategoryTileView.setOnClickListener(null);
            mooncakeInvestingCategoryTileView.setClickable(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        MooncakeInvestingCategoryTileView$Factory$Impl mooncakeInvestingCategoryTileView$Factory$Impl = this.tileFactory;
        mooncakeInvestingCategoryTileView$Factory$Impl.getClass();
        RealImageLoader realImageLoader = (RealImageLoader) mooncakeInvestingCategoryTileView$Factory$Impl.delegateFactory.sandboxer.invoke();
        realImageLoader.getClass();
        MooncakeInvestingCategoryTileView mooncakeInvestingCategoryTileView = new MooncakeInvestingCategoryTileView(context, realImageLoader);
        mooncakeInvestingCategoryTileView.setLayoutParams(new ViewGroup.MarginLayoutParams(Views.dip((View) mooncakeInvestingCategoryTileView, 144), Views.dip((View) mooncakeInvestingCategoryTileView, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE)));
        return new ViewHolder(mooncakeInvestingCategoryTileView);
    }
}
