package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import app.cash.broadway.ui.Ui;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.size.Scale;
import com.squareup.cash.R;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsPaymentMethodModel;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.OrderPaymentViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.mooncake.components.MooncakeImageButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.theming.PressKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ByteArrayProtoReader32;

/* loaded from: classes5.dex */
public final class AfterPayOrderDetailsPaymentMethodView extends ContourLayout implements Ui {
    public final AppCompatImageView cardIcon;
    public Ui.EventReceiver eventReceiver;
    public final RealImageLoader imageLoader;
    public final MooncakeImageButton infoIcon;
    public final FigmaTextView paymentDetails;
    public final FigmaTextView paymentName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayOrderDetailsPaymentMethodView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.density * 12.0f);
        gradientDrawable.setColor(colorPalette.placeholderBackground);
        appCompatImageView.setBackground(gradientDrawable);
        appCompatImageView.setClipToOutline(true);
        this.cardIcon = appCompatImageView;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        figmaTextView.setMaxLines(1);
        figmaTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.paymentName = figmaTextView;
        FigmaTextView figmaTextView2 = new FigmaTextView(context, null, 2, null);
        figmaTextView2.setMaxLines(1);
        figmaTextView2.setEllipsize(TextUtils.TruncateAt.END);
        this.paymentDetails = figmaTextView2;
        MooncakeImageButton mooncakeImageButton = new MooncakeImageButton(context, null, 6);
        mooncakeImageButton.setImageResource(R.drawable.icon_info);
        mooncakeImageButton.setImageTintList(ColorStateList.valueOf(colorPalette.placeholderIcon));
        mooncakeImageButton.setClickable(false);
        this.infoIcon = mooncakeImageButton;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        int i = colorPalette.background;
        gradientDrawable2.setColor(i);
        gradientDrawable2.setCornerRadius(this.density * 12.0f);
        setBackground(new RippleDrawable(ColorStateList.valueOf(PressKt.pressColor$default(ThemeHelpersKt.themeInfo(this), Integer.valueOf(i), 2)), gradientDrawable2, gradientDrawable2));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setStroke(getDip(1), colorPalette.outlineButtonBorder);
        gradientDrawable3.setCornerRadius(this.density * 12.0f);
        setForeground(gradientDrawable3);
        int dip = getDip(12);
        setPaddingRelative(dip, dip, dip, dip);
        setClipToPadding(false);
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new LoanDetailsSheetKt$$ExternalSyntheticLambda3(19));
        leftTo.widthOf(1, new AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(this, 1));
        ByteArrayProtoReader32 centerVerticallyTo = ContourLayout.centerVerticallyTo(new LoanDetailsSheetKt$$ExternalSyntheticLambda3(20));
        centerVerticallyTo.heightOf(1, new AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(this, 2));
        ContourLayout.layoutBy$default(this, appCompatImageView, leftTo, centerVerticallyTo);
        ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(this, 3));
        rightTo.widthOf(1, new AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(this, 4));
        ByteArrayProtoReader32 centerVerticallyTo2 = ContourLayout.centerVerticallyTo(new LoanDetailsSheetKt$$ExternalSyntheticLambda3(21));
        centerVerticallyTo2.heightOf(1, new AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(this, 5));
        ContourLayout.layoutBy$default(this, mooncakeImageButton, rightTo, centerVerticallyTo2);
        contourWidthMatchParent();
        contourHeightOf(new LazyListState$$ExternalSyntheticLambda3(this, dip, 8));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(AfterPayOrderDetailsPaymentMethodModel afterPayOrderDetailsPaymentMethodModel) {
        ByteArrayProtoReader32 leftTo;
        afterPayOrderDetailsPaymentMethodModel.getClass();
        OrderPaymentViewModel orderPaymentViewModel = afterPayOrderDetailsPaymentMethodModel.orderPaymentViewModel;
        FigmaTextView figmaTextView = this.paymentName;
        FigmaTextView figmaTextView2 = this.paymentDetails;
        if (orderPaymentViewModel != null) {
            Image image = orderPaymentViewModel.image;
            if (image != null) {
                Context context = getContext();
                context.getClass();
                ImageRequest.Builder builder = new ImageRequest.Builder(context);
                builder.data = ThemablesKt.urlForTheme(image, ThemeHelpersKt.themeInfo(this));
                ImageRequests_androidKt.target(builder, this.cardIcon);
                builder.scale = Scale.FILL;
                this.imageLoader.enqueue(builder.build());
            }
            TextModel textModel = orderPaymentViewModel.name;
            if (textModel != null) {
                ImageUtilsKt.applyTextModel(figmaTextView, textModel, new CalendarRowKt$$ExternalSyntheticLambda10(14));
            }
            TextModel textModel2 = orderPaymentViewModel.details;
            if (textModel2 != null) {
                ImageUtilsKt.applyTextModel(figmaTextView2, textModel2, new CalendarRowKt$$ExternalSyntheticLambda10(14));
            }
            TextModel textModel3 = orderPaymentViewModel.infoText;
            MooncakeImageButton mooncakeImageButton = this.infoIcon;
            if (textModel3 != null) {
                mooncakeImageButton.setVisibility(0);
                AfterPayOrderDetailsViewEvent afterPayOrderDetailsViewEvent = afterPayOrderDetailsPaymentMethodModel.onPaymentMethodClick;
                if (afterPayOrderDetailsViewEvent != null) {
                    setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(14, this, afterPayOrderDetailsViewEvent));
                }
            } else {
                mooncakeImageButton.setVisibility(8);
                setOnClickListener(null);
                setClickable(false);
            }
        }
        CharSequence text = figmaTextView2.getText();
        if (text == null || text.length() == 0) {
            leftTo = ContourLayout.leftTo(new AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(this, 0));
            leftTo.rightTo(2, new AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(this, 6));
        } else {
            leftTo = ContourLayout.leftTo(new AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(this, 7));
            leftTo.rightTo(2, new AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(this, 8));
        }
        CharSequence text2 = figmaTextView2.getText();
        ContourLayout.layoutBy$default(this, figmaTextView, leftTo, (text2 == null || text2.length() == 0) ? ContourLayout.centerVerticallyTo(new LoanDetailsSheetKt$$ExternalSyntheticLambda3(22)) : ContourLayout.topTo(new LoanDetailsSheetKt$$ExternalSyntheticLambda3(23)));
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(this, 9));
        leftTo2.rightTo(2, new AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(this, 10));
        ContourLayout.layoutBy$default(this, figmaTextView2, leftTo2, ContourLayout.topTo(new AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(this, 11)));
    }
}
