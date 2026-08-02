package com.squareup.cash.profile.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.video.VideoCapture;
import androidx.core.view.WindowCompat$Api35Impl;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ReferralStatusViewEvent;
import com.squareup.cash.account.settings.viewmodels.ReferralStatusViewModel;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.payments.viewmodels.BillViewModel;
import com.squareup.cash.payments.views.BillView;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class ReferralStatusView extends LinearLayout implements Ui {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(ReferralStatusView.class, "singleRewardContainer", "getSingleRewardContainer()Landroid/view/View;", 0), new PropertyReference1Impl(ReferralStatusView.class, "singleRewardAvailableView", "getSingleRewardAvailableView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(ReferralStatusView.class, "singleRewardCompleteView", "getSingleRewardCompleteView()Landroid/widget/ImageView;", 0), new PropertyReference1Impl(ReferralStatusView.class, "headerView", "getHeaderView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(ReferralStatusView.class, "mainView", "getMainView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(ReferralStatusView.class, "billsContainer", "getBillsContainer()Landroid/view/ViewGroup;", 0), new PropertyReference1Impl(ReferralStatusView.class, "doneButton", "getDoneButton()Landroid/widget/Button;", 0)};
    public final Lazy billsContainer$delegate;
    public final ColorPalette colorPalette;
    public final Lazy doneButton$delegate;
    public Ui.EventReceiver eventReceiver;
    public final Lazy headerView$delegate;
    public final LayoutInflater inflater;
    public final Lazy mainView$delegate;
    public final Lazy singleRewardAvailableView$delegate;
    public final Lazy singleRewardCompleteView$delegate;
    public final Lazy singleRewardContainer$delegate;
    public final int singleSuccessStrokeColor;
    public final ThemeInfo themeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralStatusView(Context context) {
        super(context);
        context.getClass();
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
        View.inflate(context, R.layout.referral_status_view, this);
        this.singleRewardContainer$delegate = KotterKnifeKt.bindView(this, R.id.single_referral_container);
        this.singleRewardAvailableView$delegate = KotterKnifeKt.bindView(this, R.id.single_referral_available);
        this.singleRewardCompleteView$delegate = KotterKnifeKt.bindView(this, R.id.single_referral_complete);
        this.headerView$delegate = KotterKnifeKt.bindView(this, R.id.header);
        this.mainView$delegate = KotterKnifeKt.bindView(this, R.id.main);
        this.billsContainer$delegate = KotterKnifeKt.bindView(this, R.id.bills_container);
        this.doneButton$delegate = KotterKnifeKt.bindView(this, R.id.done);
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.inflater = from;
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        this.themeInfo = themeInfo;
        this.colorPalette = themeInfo.colorPalette;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        this.singleSuccessStrokeColor = context.getColor(typedValue.resourceId);
    }

    public final TextView getSingleRewardAvailableView() {
        return (TextView) this.singleRewardAvailableView$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ColorPalette colorPalette = this.colorPalette;
        setBackgroundColor(colorPalette.behindBackground);
        ThemeInfo themeInfo = this.themeInfo;
        Theme theme = themeInfo.theme;
        Theme theme2 = Theme.MooncakeLight;
        ColorPalette colorPalette2 = themeInfo.colorPalette;
        int i = theme == theme2 ? colorPalette2.green : colorPalette2.label;
        getSingleRewardAvailableView().setTextColor(i);
        KProperty[] kPropertyArr = $$delegatedProperties;
        ((TextView) this.headerView$delegate.getValue(this, kPropertyArr[3])).setTextColor(colorPalette.label);
        ((TextView) this.mainView$delegate.getValue(this, kPropertyArr[4])).setTextColor(colorPalette.tertiaryLabel);
        KProperty kProperty = kPropertyArr[6];
        Lazy lazy = this.doneButton$delegate;
        ((Button) lazy.getValue(this, kProperty)).setTextColor(i);
        ((Button) lazy.getValue(this, kPropertyArr[6])).setBackground(RipplesKt.createRippleDrawable$default(this, Integer.valueOf(colorPalette.behindBackground), 2));
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
            throw null;
        }
        eventReceiver.sendEvent(ReferralStatusViewEvent.ViewAttached.INSTANCE);
        ((Button) lazy.getValue(this, kPropertyArr[6])).setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 9));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(ReferralStatusViewEvent.ViewDetached.INSTANCE);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
            throw null;
        }
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(ReferralStatusViewModel referralStatusViewModel) {
        referralStatusViewModel.getClass();
        KProperty[] kPropertyArr = $$delegatedProperties;
        ((TextView) this.headerView$delegate.getValue(this, kPropertyArr[3])).setText(referralStatusViewModel.getHeaderText());
        ((TextView) this.mainView$delegate.getValue(this, kPropertyArr[4])).setText(referralStatusViewModel.getMainText());
        KProperty kProperty = kPropertyArr[5];
        Lazy lazy = this.billsContainer$delegate;
        ((ViewGroup) lazy.getValue(this, kProperty)).removeAllViews();
        boolean z = referralStatusViewModel instanceof ReferralStatusViewModel.SinglePayment;
        Lazy lazy2 = this.singleRewardContainer$delegate;
        if (z) {
            ReferralStatusViewModel.SinglePayment singlePayment = (ReferralStatusViewModel.SinglePayment) referralStatusViewModel;
            ((View) lazy2.getValue(this, kPropertyArr[0])).setVisibility(0);
            boolean z2 = singlePayment instanceof ReferralStatusViewModel.SinglePayment.CompletedSinglePayment;
            Lazy lazy3 = this.singleRewardCompleteView$delegate;
            if (z2) {
                getSingleRewardAvailableView().setVisibility(4);
                ((ImageView) lazy3.getValue(this, kPropertyArr[2])).setVisibility(0);
                ((ImageView) lazy3.getValue(this, kPropertyArr[2])).setImageTintList(ColorStateList.valueOf(this.singleSuccessStrokeColor));
                return;
            } else {
                if (!(singlePayment instanceof ReferralStatusViewModel.SinglePayment.IncompleteSinglePayment)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ReferralStatusViewModel.SinglePayment.IncompleteSinglePayment incompleteSinglePayment = (ReferralStatusViewModel.SinglePayment.IncompleteSinglePayment) singlePayment;
                getSingleRewardAvailableView().setVisibility(0);
                ((ImageView) lazy3.getValue(this, kPropertyArr[2])).setVisibility(4);
                getSingleRewardAvailableView().setTextColor(incompleteSinglePayment.paymentTextColor);
                getSingleRewardAvailableView().setText(incompleteSinglePayment.paymentText);
                return;
            }
        }
        if (!(referralStatusViewModel instanceof ReferralStatusViewModel.MultiplePayments)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ((View) lazy2.getValue(this, kPropertyArr[0])).setVisibility(8);
        for (BillViewModel billViewModel : ((ReferralStatusViewModel.MultiplePayments) referralStatusViewModel).bills) {
            View inflate = this.inflater.inflate(R.layout.referral_status_bill, (ViewGroup) lazy.getValue(this, kPropertyArr[5]), false);
            inflate.getClass();
            BillView billView = (BillView) inflate;
            Lazy lazy4 = billView.completeView$delegate;
            ViewGroup.LayoutParams layoutParams = billView.getLayoutParams();
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 1.0f;
            billView.setLayoutParams(layoutParams2);
            billViewModel.getClass();
            billView.getAvailableView().setText(billViewModel.text);
            billView.getAvailableView().setTextColor(billViewModel.textColor);
            boolean z3 = billViewModel.isCompleted;
            View availableView = z3 ? (View) lazy4.getValue(billView, BillView.$$delegatedProperties[1]) : billView.getAvailableView();
            View availableView2 = z3 ? billView.getAvailableView() : (View) lazy4.getValue(billView, BillView.$$delegatedProperties[1]);
            availableView.setVisibility(0);
            availableView2.setVisibility(4);
            ((ViewGroup) lazy.getValue(this, kPropertyArr[5])).addView(billView);
        }
    }
}
