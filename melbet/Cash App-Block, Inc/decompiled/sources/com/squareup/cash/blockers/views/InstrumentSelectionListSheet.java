package com.squareup.cash.blockers.views;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import app.cash.broadway.ui.Ui;
import coil3.RealImageLoader;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionListSheetViewModel;
import com.squareup.cash.instruments.views.InstrumentOptionView;
import com.squareup.cash.mooncake.components.MooncakeButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class InstrumentSelectionListSheet extends LinearLayout implements Ui, OutsideTapCloses {
    public final MooncakeButton closeButton;
    public final ColorPalette colorPalette;
    public Ui.EventReceiver eventReceiver;
    public final RealImageLoader imageLoader;
    public final LinearLayout optionsContainer;
    public final FigmaTextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSelectionListSheet(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        figmaTextView.setPadding(Views.dip((View) figmaTextView, 20), Views.dip((View) figmaTextView, 32), Views.dip((View) figmaTextView, 20), Views.dip((View) figmaTextView, 40));
        figmaTextView.setGravity(1);
        Strings.applyStyle(figmaTextView, TextStyles.mainTitle);
        figmaTextView.setTextColor(colorPalette.label);
        this.titleView = figmaTextView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setShowDividers(2);
        int i = colorPalette.hairline;
        linearLayout.setDividerDrawable(new DividerDrawable(i));
        this.optionsContainer = linearLayout;
        MooncakeButton mooncakeButton = new MooncakeButton(context, null);
        mooncakeButton.setBackground(RipplesKt.createRippleDrawable$default(mooncakeButton, Integer.valueOf(colorPalette.elevatedBackground), 2));
        this.closeButton = mooncakeButton;
        setOrientation(1);
        setShowDividers(2);
        setDividerDrawable(new DividerDrawable(i));
        addView(figmaTextView);
        addView(linearLayout);
        addView(mooncakeButton);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(InstrumentSelectionListSheetViewModel instrumentSelectionListSheetViewModel) {
        instrumentSelectionListSheetViewModel.getClass();
        String str = instrumentSelectionListSheetViewModel.title;
        FigmaTextView figmaTextView = this.titleView;
        figmaTextView.setText(str);
        figmaTextView.setVisibility((str == null || StringsKt.isBlank(str)) ? 8 : 0);
        LinearLayout linearLayout = this.optionsContainer;
        linearLayout.removeAllViews();
        for (InstrumentSelectionListSheetViewModel.Option option : instrumentSelectionListSheetViewModel.options) {
            Context context = getContext();
            context.getClass();
            InstrumentOptionView instrumentOptionView = new InstrumentOptionView(context, this.imageLoader);
            instrumentOptionView.setModel(option.model);
            Integer num = option.clickId;
            ColorPalette colorPalette = this.colorPalette;
            if (num != null) {
                instrumentOptionView.setEnabled(true);
                instrumentOptionView.setFocusable(true);
                instrumentOptionView.setClickable(true);
                instrumentOptionView.setBackground(RipplesKt.createRippleDrawable$default(instrumentOptionView, Integer.valueOf(colorPalette.elevatedBackground), 2));
                instrumentOptionView.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(10, this, num));
            } else {
                instrumentOptionView.setEnabled(false);
                instrumentOptionView.setFocusable(false);
                instrumentOptionView.setBackgroundColor(colorPalette.elevatedBackground);
                instrumentOptionView.setOnClickListener(null);
                instrumentOptionView.setClickable(false);
                instrumentOptionView.setAccessibilityDelegate(Views.removeAccessibilityClickActionDelegate);
            }
            linearLayout.addView(instrumentOptionView);
        }
        String str2 = instrumentSelectionListSheetViewModel.closeButtonText;
        MooncakeButton mooncakeButton = this.closeButton;
        mooncakeButton.setText(str2);
        mooncakeButton.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 26));
    }
}
