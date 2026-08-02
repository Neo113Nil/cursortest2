package com.squareup.cash.blockers.views;

import android.content.Context;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.util.Strings;
import com.squareup.wire.ByteArrayProtoReader32;

/* loaded from: classes4.dex */
public final class LabelValueView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ColorPalette colorPalette;
    public final FigmaTextView label;
    public final FigmaTextView value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LabelValueView(Context context) {
        super(context);
        context.getClass();
        this.colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        int i = 2;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, i, 0 == true ? 1 : 0);
        TextThemeInfo textThemeInfo = TextStyles.caption;
        Strings.applyStyle(figmaTextView, textThemeInfo);
        figmaTextView.setGravity(8388611);
        this.label = figmaTextView;
        FigmaTextView figmaTextView2 = new FigmaTextView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Strings.applyStyle(figmaTextView2, textThemeInfo);
        figmaTextView2.setGravity(8388613);
        this.value = figmaTextView2;
        contourWidthMatchParent();
        contourHeightWrapContent();
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new LabelValueView$$ExternalSyntheticLambda0(0));
        leftTo.widthOf(1, new LabelValueView$$ExternalSyntheticLambda0(23));
        ContourLayout.layoutBy$default(this, figmaTextView, leftTo, ContourLayout.topTo(new LabelValueView$$ExternalSyntheticLambda0(24)));
        ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new LabelValueView$$ExternalSyntheticLambda0(25));
        rightTo.widthOf(1, new LabelValueView$$ExternalSyntheticLambda0(26));
        ContourLayout.layoutBy$default(this, figmaTextView2, rightTo, ContourLayout.topTo(new LabelValueView$$ExternalSyntheticLambda0(27)));
    }
}
