package com.squareup.cash.investing.components.news;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.ResourcesCompat;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class InvestingViewAllNewsView extends FrameLayout {
    public final AppCompatImageView iconView;
    public final TextView labelView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingViewAllNewsView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(Views.dip((View) linearLayout, 24), linearLayout.getPaddingTop(), Views.dip((View) linearLayout, 24), linearLayout.getPaddingBottom());
        addView(linearLayout);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        linearLayout.addView(appCompatImageView);
        this.iconView = appCompatImageView;
        TextView textView = new TextView(context);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setLetterSpacing(0.01f);
        textView.setTextSize(0, Views.sp((View) textView, 16.0f));
        textView.setTypeface(ResourcesCompat.getFont(context, R.font.cashsans_medium));
        textView.setTextColor(colorPalette.investing);
        textView.setText(R.string.investing_components_view_all_news);
        textView.setPadding(textView.getPaddingLeft(), Views.dip((View) textView, 8), textView.getPaddingRight(), textView.getPaddingBottom());
        linearLayout.addView(textView);
        this.labelView = textView;
        setLayoutParams(new FrameLayout.LayoutParams(Views.dip((View) this, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE), -1));
    }
}
