package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.squareup.cash.R;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextWithIcon;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;

/* loaded from: classes5.dex */
public final class AfterPayTextWithInfoView extends LinearLayout {
    public final FigmaTextView label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayTextWithInfoView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        figmaTextView.setGravity(17);
        Strings.applyStyle(figmaTextView, TextStyles.mainBody);
        figmaTextView.setTextColor(colorPalette.secondaryLabel);
        figmaTextView.setPadding(0, 0, Views.dip((View) figmaTextView, 6), 0);
        setVerticalGravity(16);
        this.label = figmaTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R.drawable.icon_info);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(colorPalette.placeholderIcon));
        setVerticalGravity(16);
        setClickable(true);
        setOrientation(0);
        addView(figmaTextView);
        addView(appCompatImageView);
    }

    public final void setModel(TextWithIcon textWithIcon) {
        textWithIcon.getClass();
        TextModel textModel = textWithIcon.textModel;
        FigmaTextView figmaTextView = this.label;
        if (textModel == null) {
            figmaTextView.setVisibility(8);
        } else {
            figmaTextView.setVisibility(0);
            ImageUtilsKt.applyTextModel(figmaTextView, textModel, new CalendarRowKt$$ExternalSyntheticLambda10(14));
        }
    }
}
