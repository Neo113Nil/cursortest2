package com.squareup.cash.blockers.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatImageView;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.SelectedInstrumentModel;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.instruments.views.InstrumentAvatarView;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.theming.PressKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.util.Strings;
import com.squareup.wire.ByteArrayProtoReader32;

/* loaded from: classes4.dex */
public final class SelectedInstrumentView extends ContourLayout {
    public final InstrumentAvatarView avatarView;
    public final AppCompatImageView chevronIcon;
    public final ColorPalette colorPalette;
    public final FigmaTextView subtitleSuffixView;
    public final FigmaTextView subtitleView;
    public final FigmaTextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedInstrumentView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        InstrumentAvatarView instrumentAvatarView = new InstrumentAvatarView(context, InstrumentAvatarView.Size.SMALL, realImageLoader);
        this.avatarView = instrumentAvatarView;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView, TextStyles.smallTitle);
        figmaTextView.setTextColor(colorPalette.label);
        this.titleView = figmaTextView;
        FigmaTextView figmaTextView2 = new FigmaTextView(context, null, 2, null);
        TextThemeInfo textThemeInfo = TextStyles.smallBody;
        Strings.applyStyle(figmaTextView2, textThemeInfo);
        int i = colorPalette.secondaryLabel;
        figmaTextView2.setTextColor(i);
        figmaTextView2.setSingleLine();
        figmaTextView2.setEllipsize(TextUtils.TruncateAt.END);
        figmaTextView2.setCompoundDrawablePadding(getDip(6));
        this.subtitleView = figmaTextView2;
        FigmaTextView figmaTextView3 = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView3, textThemeInfo);
        figmaTextView3.setTextColor(i);
        this.subtitleSuffixView = figmaTextView3;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageDrawable(PlatformKt.getDrawableCompat(context, R.drawable.mooncake_chevron_down, Integer.valueOf(colorPalette.chevron)));
        this.chevronIcon = appCompatImageView;
        contourHeightOf(new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 10));
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 1));
        leftTo.widthOf(1, new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 2));
        ByteArrayProtoReader32 centerVerticallyTo = ContourLayout.centerVerticallyTo(new LabelValueView$$ExternalSyntheticLambda0(29));
        centerVerticallyTo.heightOf(1, new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 3));
        ContourLayout.layoutBy$default(this, instrumentAvatarView, leftTo, centerVerticallyTo);
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 4));
        leftTo2.rightTo(1, new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 5));
        ContourLayout.layoutBy$default(this, figmaTextView, leftTo2, ContourLayout.topTo(new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 6)));
        ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 7));
        leftTo3.widthOf(2, new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 8));
        ContourLayout.layoutBy$default(this, figmaTextView2, leftTo3, ContourLayout.topTo(new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 11)));
        ContourLayout.layoutBy$default(this, figmaTextView3, ContourLayout.leftTo(new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 12)), ContourLayout.topTo(new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 13)));
        ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 14));
        rightTo.widthOf(1, new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 15));
        ContourLayout.layoutBy$default(this, appCompatImageView, rightTo, ContourLayout.centerVerticallyTo(new RewardQueries$$ExternalSyntheticLambda4(1)));
        setFocusable(true);
    }

    public final void setModel(SelectedInstrumentModel selectedInstrumentModel) {
        selectedInstrumentModel.getClass();
        String str = selectedInstrumentModel.title;
        String str2 = selectedInstrumentModel.subtitleSuffix;
        FigmaTextView figmaTextView = this.titleView;
        figmaTextView.setText(str);
        String str3 = selectedInstrumentModel.subtitle;
        FigmaTextView figmaTextView2 = this.subtitleView;
        figmaTextView2.setText(str3);
        figmaTextView2.setVisibility(str3 != null ? 0 : 8);
        FigmaTextView figmaTextView3 = this.subtitleSuffixView;
        figmaTextView3.setText(" " + str2);
        figmaTextView3.setVisibility(str2 != null ? 0 : 8);
        ContourLayout.updateLayoutBy$default(this, figmaTextView, null, (figmaTextView2.getVisibility() == 0 || figmaTextView3.getVisibility() == 0) ? ContourLayout.topTo(new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 0)) : ContourLayout.centerVerticallyTo(new LabelValueView$$ExternalSyntheticLambda0(28)), 1);
        this.avatarView.setModel(selectedInstrumentModel.avatar);
        SelectedInstrumentView$$ExternalSyntheticLambda1 selectedInstrumentView$$ExternalSyntheticLambda1 = new SelectedInstrumentView$$ExternalSyntheticLambda1(this, 9);
        setBackground(new RippleDrawable(ColorStateList.valueOf(PressKt.pressColor$default(ThemeHelpersKt.themeInfo(this), null, 3)), (Drawable) selectedInstrumentView$$ExternalSyntheticLambda1.invoke(0), (Drawable) selectedInstrumentView$$ExternalSyntheticLambda1.invoke(-16777216)));
        this.chevronIcon.setVisibility(0);
    }
}
