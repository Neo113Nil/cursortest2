package com.squareup.cash.instruments.views;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import coil3.RealImageLoader;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSheetHeaderViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarView;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;

/* loaded from: classes4.dex */
public final class InstrumentSheetHeaderView extends LinearLayout {
    public final FigmaTextView additionalInfoView;
    public final InstrumentAvatarView avatarView;
    public final FigmaTextView subtitleView;
    public final FigmaTextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSheetHeaderView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        InstrumentAvatarView instrumentAvatarView = new InstrumentAvatarView(context, InstrumentAvatarView.Size.LARGE, realImageLoader);
        this.avatarView = instrumentAvatarView;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        figmaTextView.setPadding(Views.dip((View) figmaTextView, 24), Views.dip((View) figmaTextView, 16), Views.dip((View) figmaTextView, 24), Views.dip((View) figmaTextView, 0));
        figmaTextView.setGravity(1);
        Strings.applyStyle(figmaTextView, TextStyles.header4);
        figmaTextView.setTextColor(colorPalette.label);
        this.titleView = figmaTextView;
        FigmaTextView figmaTextView2 = new FigmaTextView(context, null, 2, null);
        figmaTextView2.setPadding(Views.dip((View) figmaTextView2, 42), Views.dip((View) figmaTextView2, 8), Views.dip((View) figmaTextView2, 42), Views.dip((View) figmaTextView2, 0));
        figmaTextView2.setGravity(1);
        Strings.applyStyle(figmaTextView2, TextStyles.smallBody);
        figmaTextView2.setTextColor(colorPalette.secondaryLabel);
        this.subtitleView = figmaTextView2;
        FigmaTextView figmaTextView3 = new FigmaTextView(context, null, 2, null);
        figmaTextView3.setPadding(figmaTextView3.getPaddingLeft(), Views.dip((View) figmaTextView3, 32), figmaTextView3.getPaddingRight(), figmaTextView3.getPaddingBottom());
        figmaTextView3.setGravity(1);
        Strings.applyStyle(figmaTextView3, TextStyles.caption);
        figmaTextView3.setTextColor(colorPalette.label);
        this.additionalInfoView = figmaTextView3;
        setOrientation(1);
        setGravity(1);
        setPadding(Views.dip((View) this, 0), Views.dip((View) this, 40), Views.dip((View) this, 0), Views.dip((View) this, 48));
        addView(instrumentAvatarView);
        addView(figmaTextView);
        addView(figmaTextView2);
        addView(figmaTextView3);
    }

    public final void setModel(InstrumentSheetHeaderViewModel instrumentSheetHeaderViewModel) {
        instrumentSheetHeaderViewModel.getClass();
        InstrumentAvatarViewModel instrumentAvatarViewModel = instrumentSheetHeaderViewModel.avatar;
        String str = instrumentSheetHeaderViewModel.subtitle;
        this.avatarView.setModel(instrumentAvatarViewModel);
        String str2 = instrumentSheetHeaderViewModel.title;
        FigmaTextView figmaTextView = this.titleView;
        figmaTextView.setText(str2);
        figmaTextView.setVisibility((str2 == null || str2.length() == 0) ? 8 : 0);
        FigmaTextView figmaTextView2 = this.subtitleView;
        figmaTextView2.setText(str);
        figmaTextView2.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        FigmaTextView figmaTextView3 = this.additionalInfoView;
        figmaTextView3.setText((CharSequence) null);
        figmaTextView3.setVisibility(8);
    }
}
