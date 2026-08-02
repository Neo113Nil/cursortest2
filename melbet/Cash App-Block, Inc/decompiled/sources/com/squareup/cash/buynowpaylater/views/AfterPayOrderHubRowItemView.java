package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import app.cash.broadway.ui.Ui;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.buynowpaylater.viewmodels.ActionButton;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubRowModel;
import com.squareup.cash.buynowpaylater.viewmodels.Avatar;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextWithIcon;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.BadgedLayout;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class AfterPayOrderHubRowItemView extends ContourLayout implements Ui {
    public final MooncakePillButton actionButton;
    public final AppCompatTextView amountDueTextView;
    public final AppCompatImageView avatar;
    public final int avatarBadgeBaselineDropSize;
    public final BadgedLayout badgeLayout;
    public final Lazy darkMerchantDrawable$delegate;
    public Ui.EventReceiver eventReceiver;
    public final RealImageLoader imageLoader;
    public final AfterPayTextWithInfoView infoIcon;
    public final Lazy lightMerchantDrawable$delegate;
    public final AppCompatTextView primaryTextView;
    public final AppCompatTextView secondaryTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayOrderHubRowItemView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        realImageLoader.getClass();
        this.imageLoader = realImageLoader;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.avatarBadgeBaselineDropSize = 6;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        this.avatar = appCompatImageView;
        BadgedLayout badgedLayout = new BadgedLayout(context, realImageLoader);
        badgedLayout.setBaselineDrop(getDip(6));
        badgedLayout.addView(appCompatImageView);
        this.badgeLayout = badgedLayout;
        AfterPayTextWithInfoView afterPayTextWithInfoView = new AfterPayTextWithInfoView(context);
        afterPayTextWithInfoView.setVisibility(8);
        this.infoIcon = afterPayTextWithInfoView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        TextThemeInfo textThemeInfo = TextStyles.smallTitle;
        Strings.applyStyle(appCompatTextView, textThemeInfo);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        final int i = 1;
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setTextColor(colorPalette.label);
        final int i2 = 0;
        appCompatTextView.setPadding(0, 0, 0, getDip(4));
        this.primaryTextView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        Strings.applyStyle(appCompatTextView2, TextStyles.smallBody);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setTextColor(colorPalette.tertiaryLabel);
        this.secondaryTextView = appCompatTextView2;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, MooncakePillButton.Size.SMALL, MooncakePillButton.Style.PRIMARY, 2, null);
        mooncakePillButton.setPadding(getDip(16), 0, getDip(16), 0);
        mooncakePillButton.setSingleLine(true);
        mooncakePillButton.setTextSize(0, Views.sp((View) mooncakePillButton, 16.0f));
        mooncakePillButton.setVisibility(8);
        this.actionButton = mooncakePillButton;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        Strings.applyStyle(appCompatTextView3, textThemeInfo);
        appCompatTextView3.setEllipsize(truncateAt);
        appCompatTextView3.setSingleLine(true);
        appCompatTextView3.setTextColor(colorPalette.label);
        appCompatTextView3.setPadding(0, 0, 0, getDip(4));
        appCompatTextView3.setVisibility(8);
        this.amountDueTextView = appCompatTextView3;
        final int i3 = 5;
        this.lightMerchantDrawable$delegate = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(context, 5));
        this.darkMerchantDrawable$delegate = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(context, 4));
        contourWidthMatchParent();
        contourHeightWrapContent();
        setPaddingRelative(getDip(20), getDip(16), getDip(20), getDip(16));
        setClipToPadding(false);
        final int m3813getXdipTENr5nQ = m3813getXdipTENr5nQ(6);
        final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.avatar_small_size);
        final int i4 = 3;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new CalendarRowKt$$ExternalSyntheticLambda10(3));
        leftTo.widthOf(1, new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubRowItemView$$ExternalSyntheticLambda4
            public final /* synthetic */ AfterPayOrderHubRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i;
                int i6 = dimensionPixelSize;
                AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i5) {
                    case 0:
                        return new XInt(Math.min(afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.actionButton), afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.amountDueTextView)) - i6);
                    case 1:
                        return new XInt(afterPayOrderHubRowItemView.getDip(afterPayOrderHubRowItemView.avatarBadgeBaselineDropSize * 2) + i6);
                    case 2:
                        return new YInt(afterPayOrderHubRowItemView.getDip(afterPayOrderHubRowItemView.avatarBadgeBaselineDropSize) + i6);
                    default:
                        return new XInt(Math.min(afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.actionButton), afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.amountDueTextView)) - i6);
                }
            }
        });
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new CalendarRowKt$$ExternalSyntheticLambda10(4));
        final int i5 = 2;
        byteArrayProtoReader32.heightOf(1, new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubRowItemView$$ExternalSyntheticLambda4
            public final /* synthetic */ AfterPayOrderHubRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i5;
                int i6 = dimensionPixelSize;
                AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i52) {
                    case 0:
                        return new XInt(Math.min(afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.actionButton), afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.amountDueTextView)) - i6);
                    case 1:
                        return new XInt(afterPayOrderHubRowItemView.getDip(afterPayOrderHubRowItemView.avatarBadgeBaselineDropSize * 2) + i6);
                    case 2:
                        return new YInt(afterPayOrderHubRowItemView.getDip(afterPayOrderHubRowItemView.avatarBadgeBaselineDropSize) + i6);
                    default:
                        return new XInt(Math.min(afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.actionButton), afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.amountDueTextView)) - i6);
                }
            }
        });
        ContourLayout.layoutBy$default(this, badgedLayout, leftTo, byteArrayProtoReader32);
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubRowItemView$$ExternalSyntheticLambda5
            public final /* synthetic */ AfterPayOrderHubRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = i5;
                AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i6) {
                    case 2:
                        break;
                }
                return new YInt(afterPayOrderHubRowItemView.m3812centerYdBGyhoQ(afterPayOrderHubRowItemView.badgeLayout));
            }
        });
        leftTo2.rightTo(1, new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubRowItemView$$ExternalSyntheticLambda4
            public final /* synthetic */ AfterPayOrderHubRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i4;
                int i6 = m3813getXdipTENr5nQ;
                AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i52) {
                    case 0:
                        return new XInt(Math.min(afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.actionButton), afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.amountDueTextView)) - i6);
                    case 1:
                        return new XInt(afterPayOrderHubRowItemView.getDip(afterPayOrderHubRowItemView.avatarBadgeBaselineDropSize * 2) + i6);
                    case 2:
                        return new YInt(afterPayOrderHubRowItemView.getDip(afterPayOrderHubRowItemView.avatarBadgeBaselineDropSize) + i6);
                    default:
                        return new XInt(Math.min(afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.actionButton), afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.amountDueTextView)) - i6);
                }
            }
        });
        ContourLayout.layoutBy$default(this, appCompatTextView, leftTo2, ContourLayout.topTo(new CalendarRowKt$$ExternalSyntheticLambda10(5)));
        ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubRowItemView$$ExternalSyntheticLambda5
            public final /* synthetic */ AfterPayOrderHubRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = i4;
                AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i6) {
                    case 2:
                        break;
                }
                return new YInt(afterPayOrderHubRowItemView.m3812centerYdBGyhoQ(afterPayOrderHubRowItemView.badgeLayout));
            }
        });
        leftTo3.rightTo(1, new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubRowItemView$$ExternalSyntheticLambda4
            public final /* synthetic */ AfterPayOrderHubRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i2;
                int i6 = m3813getXdipTENr5nQ;
                AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i52) {
                    case 0:
                        return new XInt(Math.min(afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.actionButton), afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.amountDueTextView)) - i6);
                    case 1:
                        return new XInt(afterPayOrderHubRowItemView.getDip(afterPayOrderHubRowItemView.avatarBadgeBaselineDropSize * 2) + i6);
                    case 2:
                        return new YInt(afterPayOrderHubRowItemView.getDip(afterPayOrderHubRowItemView.avatarBadgeBaselineDropSize) + i6);
                    default:
                        return new XInt(Math.min(afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.actionButton), afterPayOrderHubRowItemView.m3816leftTENr5nQ(afterPayOrderHubRowItemView.amountDueTextView)) - i6);
                }
            }
        });
        ContourLayout.layoutBy$default(this, appCompatTextView2, leftTo3, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubRowItemView$$ExternalSyntheticLambda5
            public final /* synthetic */ AfterPayOrderHubRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = i2;
                AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i6) {
                    case 2:
                        break;
                }
                return new YInt(afterPayOrderHubRowItemView.m3812centerYdBGyhoQ(afterPayOrderHubRowItemView.badgeLayout));
            }
        }));
        final int i6 = 4;
        ContourLayout.layoutBy$default(this, mooncakePillButton, ContourLayout.rightTo(new CalendarRowKt$$ExternalSyntheticLambda10(6)), ContourLayout.centerVerticallyTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubRowItemView$$ExternalSyntheticLambda5
            public final /* synthetic */ AfterPayOrderHubRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i62 = i6;
                AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i62) {
                    case 2:
                        break;
                }
                return new YInt(afterPayOrderHubRowItemView.m3812centerYdBGyhoQ(afterPayOrderHubRowItemView.badgeLayout));
            }
        }));
        ContourLayout.layoutBy$default(this, afterPayTextWithInfoView, ContourLayout.rightTo(new CalendarRowKt$$ExternalSyntheticLambda10(7)), ContourLayout.centerVerticallyTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubRowItemView$$ExternalSyntheticLambda5
            public final /* synthetic */ AfterPayOrderHubRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i62 = i3;
                AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i62) {
                    case 2:
                        break;
                }
                return new YInt(afterPayOrderHubRowItemView.m3812centerYdBGyhoQ(afterPayOrderHubRowItemView.badgeLayout));
            }
        }));
        ContourLayout.layoutBy$default(this, appCompatTextView3, ContourLayout.rightTo(new CalendarRowKt$$ExternalSyntheticLambda10(2)), ContourLayout.centerVerticallyTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubRowItemView$$ExternalSyntheticLambda5
            public final /* synthetic */ AfterPayOrderHubRowItemView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i62 = i;
                AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i62) {
                    case 2:
                        break;
                }
                return new YInt(afterPayOrderHubRowItemView.m3812centerYdBGyhoQ(afterPayOrderHubRowItemView.badgeLayout));
            }
        }));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(AfterPayOrderHubRowModel.PaymentRowModel paymentRowModel) {
        paymentRowModel.getClass();
        String str = paymentRowModel.rowActionUrl;
        TextWithIcon textWithIcon = paymentRowModel.infoIcon;
        TextModel textModel = paymentRowModel.rightAlignedText;
        ActionButton actionButton = paymentRowModel.actionButton;
        Avatar avatar = paymentRowModel.avatar;
        if (str != null) {
            setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(16, this, str));
        } else {
            setOnClickListener(null);
            setClickable(false);
        }
        Image image = avatar.badge;
        if (image != null) {
            this.badgeLayout.setModel(new AvatarBadgeViewModel.IconUrl(image, null));
        }
        ImageUtilsKt.loadMerchantImage(this.avatar, this.imageLoader, avatar.image, ThemeHelpersKt.themeInfo(this).theme == Theme.MooncakeLight ? (Drawable) this.lightMerchantDrawable$delegate.getValue() : (Drawable) this.darkMerchantDrawable$delegate.getValue());
        ImageUtilsKt.applyTextModel(this.primaryTextView, paymentRowModel.title, new CalendarRowKt$$ExternalSyntheticLambda10(14));
        TextModel textModel2 = paymentRowModel.subtitle;
        if (textModel2 != null) {
            ImageUtilsKt.applyTextModel(this.secondaryTextView, textModel2, new CalendarRowKt$$ExternalSyntheticLambda10(14));
        }
        MooncakePillButton mooncakePillButton = this.actionButton;
        if (actionButton != null) {
            mooncakePillButton.setText(actionButton.text.text);
            mooncakePillButton.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(17, this, actionButton));
        } else {
            mooncakePillButton.setOnClickListener(null);
            mooncakePillButton.setClickable(false);
        }
        mooncakePillButton.setVisibility(actionButton != null ? 0 : 8);
        AppCompatTextView appCompatTextView = this.amountDueTextView;
        if (textModel != null) {
            ImageUtilsKt.applyTextModel(appCompatTextView, textModel, new CalendarRowKt$$ExternalSyntheticLambda10(14));
        }
        appCompatTextView.setVisibility(textModel != null ? 0 : 8);
        AfterPayTextWithInfoView afterPayTextWithInfoView = this.infoIcon;
        if (textWithIcon != null) {
            afterPayTextWithInfoView.setModel(textWithIcon);
            afterPayTextWithInfoView.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(18, this, paymentRowModel));
        }
        afterPayTextWithInfoView.setVisibility(textWithIcon == null ? 8 : 0);
    }
}
