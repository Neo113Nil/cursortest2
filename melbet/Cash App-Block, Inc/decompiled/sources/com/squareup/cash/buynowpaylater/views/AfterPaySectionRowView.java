package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import android.text.TextUtils;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.wire.ByteArrayProtoReader32;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* loaded from: classes5.dex */
public final class AfterPaySectionRowView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final FigmaTextView detail;
    public final FigmaTextView title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPaySectionRowView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        figmaTextView.setTextColor(colorPalette.label);
        int i = colorPalette.secondaryLabel;
        figmaTextView.setLinkTextColor(i);
        figmaTextView.setMovementMethod(BetterLinkMovementMethod.getInstance());
        int i2 = colorPalette.tertiaryLabel;
        figmaTextView.setHighlightColor(i2);
        figmaTextView.setClickable(true);
        figmaTextView.setSingleLine();
        figmaTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.title = figmaTextView;
        FigmaTextView figmaTextView2 = new FigmaTextView(context, null, 2, null);
        figmaTextView2.setTextColor(colorPalette.label);
        figmaTextView2.setLinkTextColor(i);
        figmaTextView2.setMovementMethod(BetterLinkMovementMethod.getInstance());
        figmaTextView2.setHighlightColor(i2);
        figmaTextView2.setClickable(true);
        this.detail = figmaTextView2;
        contourWidthMatchParent();
        contourHeightWrapContent();
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new CalendarRowKt$$ExternalSyntheticLambda10(9));
        leftTo.rightTo(2, new RewardSlotQueries$$ExternalSyntheticLambda0(this, 23));
        ContourLayout.layoutBy$default(this, figmaTextView, leftTo, ContourLayout.topTo(new CalendarRowKt$$ExternalSyntheticLambda10(10)));
        ContourLayout.layoutBy$default(this, figmaTextView2, ContourLayout.rightTo(new CalendarRowKt$$ExternalSyntheticLambda10(11)), ContourLayout.topTo(new CalendarRowKt$$ExternalSyntheticLambda10(12)));
    }
}
