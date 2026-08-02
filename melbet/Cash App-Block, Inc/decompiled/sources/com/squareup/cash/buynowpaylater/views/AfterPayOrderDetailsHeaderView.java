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
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsPaymentMethodModel;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.Avatar;
import com.squareup.cash.buynowpaylater.viewmodels.InfoTileCardViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.OrderPaymentViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterPayOrderDetailsHeaderView extends ContourLayout implements Ui {
    public final AppCompatImageView avatar;
    public final int avatarBadgeBaselineDropSize;
    public final BadgedLayout badgeLayout;
    public final Lazy darkMerchantDrawable$delegate;
    public final AppCompatTextView descriptionView;
    public Ui.EventReceiver eventReceiver;
    public final RealImageLoader imageLoader;
    public final AfterPayOrderHubInfoTileView infoTileView;
    public final Lazy lightMerchantDrawable$delegate;
    public final AfterPayOrderDetailsPaymentMethodView paymentMethodView;
    public final AppCompatTextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayOrderDetailsHeaderView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        int dip = Views.dip((View) this, 24);
        final int i = 2;
        this.avatarBadgeBaselineDropSize = 2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        this.avatar = appCompatImageView;
        BadgedLayout badgedLayout = new BadgedLayout(context, realImageLoader);
        badgedLayout.setBaselineDrop(getDip(2));
        badgedLayout.addView(appCompatImageView);
        this.badgeLayout = badgedLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setGravity(17);
        Strings.applyStyle(appCompatTextView, TextStyles.mainTitle);
        appCompatTextView.setTextColor(colorPalette.label);
        final int i2 = 1;
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.titleView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setGravity(17);
        Strings.applyStyle(appCompatTextView2, TextStyles.smallBody);
        appCompatTextView2.setTextColor(colorPalette.secondaryLabel);
        final int i3 = 0;
        appCompatTextView2.setSingleLine(false);
        this.descriptionView = appCompatTextView2;
        AfterPayOrderDetailsPaymentMethodView afterPayOrderDetailsPaymentMethodView = new AfterPayOrderDetailsPaymentMethodView(context, realImageLoader);
        afterPayOrderDetailsPaymentMethodView.setVisibility(8);
        this.paymentMethodView = afterPayOrderDetailsPaymentMethodView;
        AfterPayOrderHubInfoTileView afterPayOrderHubInfoTileView = new AfterPayOrderHubInfoTileView(context, new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ AfterPayOrderDetailsHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i3;
                AfterPayOrderDetailsHeaderView afterPayOrderDetailsHeaderView = this.f$0;
                switch (i4) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        Ui.EventReceiver eventReceiver = afterPayOrderDetailsHeaderView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AfterPayOrderDetailsViewEvent.OpenUrl(str));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 30) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.descriptionView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AfterPayOrderDetailsPaymentMethodView afterPayOrderDetailsPaymentMethodView2 = afterPayOrderDetailsHeaderView.paymentMethodView;
                        return new YInt(afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsPaymentMethodView2) + (afterPayOrderDetailsPaymentMethodView2.getVisibility() == 0 ? Views.dip((View) afterPayOrderDetailsHeaderView, 30) : 0));
                    case 3:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 12) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.badgeLayout));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 4) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.titleView));
                }
            }
        });
        afterPayOrderHubInfoTileView.setVisibility(8);
        this.infoTileView = afterPayOrderHubInfoTileView;
        this.lightMerchantDrawable$delegate = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(context, 2));
        final int i4 = 3;
        this.darkMerchantDrawable$delegate = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(context, 3));
        contourHeightWrapContent();
        final int dip2 = Views.dip((View) this, 64);
        ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new LoanDetailsSheetKt$$ExternalSyntheticLambda3(17));
        centerHorizontallyTo.widthOf(1, new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsHeaderView$$ExternalSyntheticLambda5
            public final /* synthetic */ AfterPayOrderDetailsHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i3;
                int i6 = dip2;
                AfterPayOrderDetailsHeaderView afterPayOrderDetailsHeaderView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i5) {
                    case 0:
                        return new XInt(afterPayOrderDetailsHeaderView.getDip(afterPayOrderDetailsHeaderView.avatarBadgeBaselineDropSize * 2) + i6);
                    default:
                        return new YInt(afterPayOrderDetailsHeaderView.getDip(afterPayOrderDetailsHeaderView.avatarBadgeBaselineDropSize) + i6);
                }
            }
        });
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new LoanDetailsSheetKt$$ExternalSyntheticLambda3(18));
        byteArrayProtoReader32.heightOf(1, new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsHeaderView$$ExternalSyntheticLambda5
            public final /* synthetic */ AfterPayOrderDetailsHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i2;
                int i6 = dip2;
                AfterPayOrderDetailsHeaderView afterPayOrderDetailsHeaderView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i5) {
                    case 0:
                        return new XInt(afterPayOrderDetailsHeaderView.getDip(afterPayOrderDetailsHeaderView.avatarBadgeBaselineDropSize * 2) + i6);
                    default:
                        return new YInt(afterPayOrderDetailsHeaderView.getDip(afterPayOrderDetailsHeaderView.avatarBadgeBaselineDropSize) + i6);
                }
            }
        });
        ContourLayout.layoutBy$default(this, badgedLayout, centerHorizontallyTo, byteArrayProtoReader32);
        ContourLayout.layoutBy$default(this, appCompatTextView, ContourLayout.matchParentX(dip, dip), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ AfterPayOrderDetailsHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i4;
                AfterPayOrderDetailsHeaderView afterPayOrderDetailsHeaderView = this.f$0;
                switch (i42) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        Ui.EventReceiver eventReceiver = afterPayOrderDetailsHeaderView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AfterPayOrderDetailsViewEvent.OpenUrl(str));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 30) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.descriptionView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AfterPayOrderDetailsPaymentMethodView afterPayOrderDetailsPaymentMethodView2 = afterPayOrderDetailsHeaderView.paymentMethodView;
                        return new YInt(afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsPaymentMethodView2) + (afterPayOrderDetailsPaymentMethodView2.getVisibility() == 0 ? Views.dip((View) afterPayOrderDetailsHeaderView, 30) : 0));
                    case 3:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 12) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.badgeLayout));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 4) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.titleView));
                }
            }
        }));
        final int i5 = 4;
        ContourLayout.layoutBy$default(this, appCompatTextView2, ContourLayout.matchParentX(dip, dip), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ AfterPayOrderDetailsHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i5;
                AfterPayOrderDetailsHeaderView afterPayOrderDetailsHeaderView = this.f$0;
                switch (i42) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        Ui.EventReceiver eventReceiver = afterPayOrderDetailsHeaderView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AfterPayOrderDetailsViewEvent.OpenUrl(str));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 30) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.descriptionView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AfterPayOrderDetailsPaymentMethodView afterPayOrderDetailsPaymentMethodView2 = afterPayOrderDetailsHeaderView.paymentMethodView;
                        return new YInt(afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsPaymentMethodView2) + (afterPayOrderDetailsPaymentMethodView2.getVisibility() == 0 ? Views.dip((View) afterPayOrderDetailsHeaderView, 30) : 0));
                    case 3:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 12) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.badgeLayout));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 4) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.titleView));
                }
            }
        }));
        ContourLayout.layoutBy$default(this, afterPayOrderDetailsPaymentMethodView, ContourLayout.matchParentX(dip, dip), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ AfterPayOrderDetailsHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i2;
                AfterPayOrderDetailsHeaderView afterPayOrderDetailsHeaderView = this.f$0;
                switch (i42) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        Ui.EventReceiver eventReceiver = afterPayOrderDetailsHeaderView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AfterPayOrderDetailsViewEvent.OpenUrl(str));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 30) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.descriptionView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AfterPayOrderDetailsPaymentMethodView afterPayOrderDetailsPaymentMethodView2 = afterPayOrderDetailsHeaderView.paymentMethodView;
                        return new YInt(afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsPaymentMethodView2) + (afterPayOrderDetailsPaymentMethodView2.getVisibility() == 0 ? Views.dip((View) afterPayOrderDetailsHeaderView, 30) : 0));
                    case 3:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 12) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.badgeLayout));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 4) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.titleView));
                }
            }
        }));
        ContourLayout.layoutBy$default(this, afterPayOrderHubInfoTileView, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ AfterPayOrderDetailsHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i;
                AfterPayOrderDetailsHeaderView afterPayOrderDetailsHeaderView = this.f$0;
                switch (i42) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        Ui.EventReceiver eventReceiver = afterPayOrderDetailsHeaderView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AfterPayOrderDetailsViewEvent.OpenUrl(str));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 30) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.descriptionView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        AfterPayOrderDetailsPaymentMethodView afterPayOrderDetailsPaymentMethodView2 = afterPayOrderDetailsHeaderView.paymentMethodView;
                        return new YInt(afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsPaymentMethodView2) + (afterPayOrderDetailsPaymentMethodView2.getVisibility() == 0 ? Views.dip((View) afterPayOrderDetailsHeaderView, 30) : 0));
                    case 3:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 12) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.badgeLayout));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderDetailsHeaderView, 4) + afterPayOrderDetailsHeaderView.m3810bottomdBGyhoQ(afterPayOrderDetailsHeaderView.titleView));
                }
            }
        }));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
        this.paymentMethodView.setEventReceiver(eventReceiver);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(AfterPayOrderDetailsViewModel.ShowingOrderDetailsViewModel showingOrderDetailsViewModel) {
        showingOrderDetailsViewModel.getClass();
        Avatar avatar = showingOrderDetailsViewModel.avatar;
        AfterPayOrderDetailsPaymentMethodModel afterPayOrderDetailsPaymentMethodModel = showingOrderDetailsViewModel.orderDetailsPaymentMethodModel;
        Image image = avatar.badge;
        if (image != null) {
            this.badgeLayout.setModel(new AvatarBadgeViewModel.IconUrl(image, null));
        }
        ImageUtilsKt.loadMerchantImage(this.avatar, this.imageLoader, avatar.image, ThemeHelpersKt.themeInfo(this).theme == Theme.MooncakeLight ? (Drawable) this.lightMerchantDrawable$delegate.getValue() : (Drawable) this.darkMerchantDrawable$delegate.getValue());
        TextModel textModel = showingOrderDetailsViewModel.merchantName;
        if (textModel != null) {
            ImageUtilsKt.applyTextModel(this.titleView, textModel, new CalendarRowKt$$ExternalSyntheticLambda10(14));
        }
        TextModel textModel2 = showingOrderDetailsViewModel.purchaseAmount;
        if (textModel2 != null) {
            ImageUtilsKt.applyTextModel(this.descriptionView, textModel2, new CalendarRowKt$$ExternalSyntheticLambda10(14));
        }
        InfoTileCardViewModel infoTileCardViewModel = showingOrderDetailsViewModel.infoTileCard;
        AfterPayOrderHubInfoTileView afterPayOrderHubInfoTileView = this.infoTileView;
        if (infoTileCardViewModel != null) {
            afterPayOrderHubInfoTileView.setModel(infoTileCardViewModel);
            afterPayOrderHubInfoTileView.setVisibility(0);
        } else {
            afterPayOrderHubInfoTileView.setVisibility(8);
        }
        OrderPaymentViewModel orderPaymentViewModel = afterPayOrderDetailsPaymentMethodModel.orderPaymentViewModel;
        AfterPayOrderDetailsPaymentMethodView afterPayOrderDetailsPaymentMethodView = this.paymentMethodView;
        if (orderPaymentViewModel == null) {
            afterPayOrderDetailsPaymentMethodView.setVisibility(8);
        } else {
            afterPayOrderDetailsPaymentMethodView.setVisibility(0);
            afterPayOrderDetailsPaymentMethodView.setModel(afterPayOrderDetailsPaymentMethodModel);
        }
    }
}
