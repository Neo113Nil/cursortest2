package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import com.squareup.cash.R;
import com.squareup.cash.arcade.treehouse.ChildrenList$$ExternalSyntheticLambda0;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.buynowpaylater.viewmodels.InfoTileCardViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.protos.cash.cashapproxy.api.InfoTileIcon;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.util.android.drawable.RoundedRectShadowOutlineProvider;
import com.squareup.util.android.drawable.RoundedRectShadowOutlineProvider$Radius$Res;
import com.squareup.util.android.drawable.ViewShadowInfo;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* loaded from: classes5.dex */
public final class AfterPayOrderHubInfoTileView extends FrameLayout {
    public final FigmaTextView bodyTextView;
    public final ColorPalette colorPalette;
    public final AppCompatImageView iconImage;
    public final Function1 onUrlClicked;
    public final FigmaTextView titleTextView;

    public final class BackgroundDrawable extends ShapeDrawable {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayOrderHubInfoTileView(Context context, Function1 function1) {
        super(context);
        context.getClass();
        this.onUrlClicked = function1;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        this.iconImage = new AppCompatImageView(context);
        final int i = 2;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView, TextStyles.smallTitle);
        figmaTextView.setTextColor(colorPalette.label);
        this.titleTextView = figmaTextView;
        FigmaTextView figmaTextView2 = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView2, TextStyles.smallBody);
        int i2 = colorPalette.secondaryLabel;
        figmaTextView2.setTextColor(i2);
        figmaTextView2.setLinkTextColor(i2);
        figmaTextView2.setHighlightColor(colorPalette.tertiaryLabel);
        final int i3 = 1;
        figmaTextView2.setClickable(true);
        figmaTextView2.setMovementMethod(BetterLinkMovementMethod.getInstance());
        ViewCompat.ensureAccessibilityDelegateCompat(figmaTextView2);
        this.bodyTextView = figmaTextView2;
        setPadding(Views.dip((View) this, 20), Views.dip((View) this, 20), Views.dip((View) this, 20), Views.dip((View) this, 20));
        final int i4 = 0;
        setClipToPadding(false);
        setClipToOutline(false);
        final ContourLayout contourLayout = new ContourLayout(context);
        contourLayout.contourWidthMatchParent();
        contourLayout.contourHeightWrapContent();
        contourLayout.setPadding(contourLayout.getDip(16), contourLayout.getDip(20), contourLayout.getDip(16), contourLayout.getDip(20));
        float[] fArr = new float[8];
        for (int i5 = 0; i5 < 8; i5++) {
            fArr[i5] = Views.dip(context, 20.0f);
        }
        float[] fArr2 = new float[8];
        for (int i6 = 0; i6 < 8; i6++) {
            fArr2[i6] = Views.dip(context, 20.0f);
        }
        BackgroundDrawable backgroundDrawable = new BackgroundDrawable(new RoundRectShape(fArr, null, fArr2));
        backgroundDrawable.setTint(this.colorPalette.elevatedBackground);
        contourLayout.setBackground(backgroundDrawable);
        RoundedRectShadowOutlineProvider$Radius$Res roundedRectShadowOutlineProvider$Radius$Res = new RoundedRectShadowOutlineProvider$Radius$Res(R.dimen.afterpay_card_view_shadow_radius);
        Resources resources = contourLayout.getResources();
        resources.getClass();
        contourLayout.setOutlineProvider(new RoundedRectShadowOutlineProvider(roundedRectShadowOutlineProvider$Radius$Res, new ViewShadowInfo(resources, R.dimen.afterpay_card_view_shadow_offset, R.dimen.afterpay_card_view_shadow_alpha, R.dimen.afterpay_card_view_elevation)));
        AppCompatImageView appCompatImageView = this.iconImage;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new LoanDetailsSheetKt$$ExternalSyntheticLambda3(25));
        leftTo.widthOf(1, new ChildrenList$$ExternalSyntheticLambda0(contourLayout, 9));
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new LoanDetailsSheetKt$$ExternalSyntheticLambda3(26));
        byteArrayProtoReader32.heightOf(1, new ChildrenList$$ExternalSyntheticLambda0(contourLayout, 10));
        ContourLayout.layoutBy$default(contourLayout, appCompatImageView, leftTo, byteArrayProtoReader32);
        FigmaTextView figmaTextView3 = this.titleTextView;
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubInfoTileView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = i4;
                AfterPayOrderHubInfoTileView afterPayOrderHubInfoTileView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i7) {
                    case 0:
                        return new XInt(contourLayout2.m3813getXdipTENr5nQ(20) + contourLayout2.m3818rightTENr5nQ(afterPayOrderHubInfoTileView.iconImage));
                    case 1:
                        return new YInt(contourLayout2.m3814getYdipdBGyhoQ(9) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderHubInfoTileView.titleTextView));
                    default:
                        return new XInt(contourLayout2.m3813getXdipTENr5nQ(20) + contourLayout2.m3818rightTENr5nQ(afterPayOrderHubInfoTileView.iconImage));
                }
            }
        });
        leftTo2.rightTo(1, new LoanDetailsSheetKt$$ExternalSyntheticLambda3(27));
        ContourLayout.layoutBy$default(contourLayout, figmaTextView3, leftTo2, ContourLayout.topTo(new LoanDetailsSheetKt$$ExternalSyntheticLambda3(28)));
        FigmaTextView figmaTextView4 = this.bodyTextView;
        ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubInfoTileView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = i;
                AfterPayOrderHubInfoTileView afterPayOrderHubInfoTileView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i7) {
                    case 0:
                        return new XInt(contourLayout2.m3813getXdipTENr5nQ(20) + contourLayout2.m3818rightTENr5nQ(afterPayOrderHubInfoTileView.iconImage));
                    case 1:
                        return new YInt(contourLayout2.m3814getYdipdBGyhoQ(9) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderHubInfoTileView.titleTextView));
                    default:
                        return new XInt(contourLayout2.m3813getXdipTENr5nQ(20) + contourLayout2.m3818rightTENr5nQ(afterPayOrderHubInfoTileView.iconImage));
                }
            }
        });
        leftTo3.rightTo(1, new LoanDetailsSheetKt$$ExternalSyntheticLambda3(29));
        ContourLayout.layoutBy$default(contourLayout, figmaTextView4, leftTo3, ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubInfoTileView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = i3;
                AfterPayOrderHubInfoTileView afterPayOrderHubInfoTileView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i7) {
                    case 0:
                        return new XInt(contourLayout2.m3813getXdipTENr5nQ(20) + contourLayout2.m3818rightTENr5nQ(afterPayOrderHubInfoTileView.iconImage));
                    case 1:
                        return new YInt(contourLayout2.m3814getYdipdBGyhoQ(9) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderHubInfoTileView.titleTextView));
                    default:
                        return new XInt(contourLayout2.m3813getXdipTENr5nQ(20) + contourLayout2.m3818rightTENr5nQ(afterPayOrderHubInfoTileView.iconImage));
                }
            }
        }));
        addView(contourLayout);
    }

    public final void setModel(InfoTileCardViewModel infoTileCardViewModel) {
        infoTileCardViewModel.getClass();
        ImageUtilsKt.applyTextModel(this.titleTextView, infoTileCardViewModel.title, new CalendarRowKt$$ExternalSyntheticLambda10(14));
        TextModel textModel = infoTileCardViewModel.body;
        if (textModel != null) {
            ImageUtilsKt.applyTextModel(this.bodyTextView, textModel, new RewardSlotQueries$$ExternalSyntheticLambda0(this, 21));
        }
        InfoTileIcon infoTileIcon = infoTileCardViewModel.icon;
        AppCompatImageView appCompatImageView = this.iconImage;
        if (infoTileIcon == null) {
            appCompatImageView.setImageDrawable(null);
        } else if (AfterPayOrderHubInfoTileViewKt$WhenMappings.$EnumSwitchMapping$0[infoTileIcon.ordinal()] == 1) {
            appCompatImageView.setImageResource(R.drawable.ic_exclamation);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }
}
