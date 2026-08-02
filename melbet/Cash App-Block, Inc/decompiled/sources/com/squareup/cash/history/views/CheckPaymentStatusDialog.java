package com.squareup.cash.history.views;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorKt;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.history.viewmodels.CheckStatusViewEvent;
import com.squareup.cash.history.viewmodels.CheckStatusViewModel;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.widget.MaxWidthLinearLayout;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import com.squareup.util.android.Views;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class CheckPaymentStatusDialog extends MaxWidthLinearLayout implements OutsideTapCloses, Ui {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(CheckPaymentStatusDialog.class, "messageView", "getMessageView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(CheckPaymentStatusDialog.class, "negativeButtonView", "getNegativeButtonView()Landroid/widget/Button;", 0), new PropertyReference1Impl(CheckPaymentStatusDialog.class, "positiveButtonView", "getPositiveButtonView()Landroid/widget/Button;", 0), new PropertyReference1Impl(CheckPaymentStatusDialog.class, "title", "getTitle()Landroid/widget/TextView;", 0)};
    public final Colors arcadeColors;
    public Ui.EventReceiver eventReceiver;
    public final Lazy messageView$delegate;
    public final Lazy negativeButtonView$delegate;
    public final Lazy positiveButtonView$delegate;
    public final Lazy title$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPaymentStatusDialog(Context context) {
        super(context, null);
        context.getClass();
        this.messageView$delegate = KotterKnifeKt.bindView(this, R.id.message);
        this.negativeButtonView$delegate = KotterKnifeKt.bindView(this, R.id.dialog_negative);
        this.positiveButtonView$delegate = KotterKnifeKt.bindView(this, R.id.dialog_positive);
        this.arcadeColors = ThemeHelpersKt.themeInfo(this).arcadeColors;
        this.title$delegate = KotterKnifeKt.bindView(this, R.id.title);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.maxWidth = getResources().getDimensionPixelSize(R.dimen.dialog_max_width);
        requestLayout();
        setOrientation(1);
        View.inflate(context, R.layout.activity_check_payment_status_dialog, this);
    }

    public final TextView getTitle$1() {
        return (TextView) this.title$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(CheckStatusViewModel checkStatusViewModel) {
        checkStatusViewModel.getClass();
        KProperty[] kPropertyArr = $$delegatedProperties;
        final int i = 0;
        KProperty kProperty = kPropertyArr[0];
        Lazy lazy = this.messageView$delegate;
        TextView textView = (TextView) lazy.getValue(this, kProperty);
        Colors colors = this.arcadeColors;
        textView.setTextColor(ColorKt.m694toArgb8_81llA(colors.semantic.text.prominent));
        getTitle$1().setTextColor(ColorKt.m694toArgb8_81llA(colors.semantic.text.prominent));
        final int i2 = 1;
        getTitle$1().setTypeface(Typeface.defaultFromStyle(1));
        ((TextView) lazy.getValue(this, kPropertyArr[0])).setPadding(Views.dip((View) this, 24), 36, Views.dip((View) this, 24), Views.dip((View) this, 42));
        TextView title$1 = getTitle$1();
        String str = checkStatusViewModel.title;
        String str2 = checkStatusViewModel.cancelPaymentButtonLabel;
        title$1.setText(str);
        getTitle$1().setVisibility(str == null ? 8 : 0);
        ((TextView) lazy.getValue(this, kPropertyArr[0])).setText(checkStatusViewModel.message);
        KProperty kProperty2 = kPropertyArr[1];
        Lazy lazy2 = this.negativeButtonView$delegate;
        ((Button) lazy2.getValue(this, kProperty2)).setText(str2);
        ((Button) lazy2.getValue(this, kPropertyArr[1])).setVisibility(str2 != null ? 0 : 8);
        ((Button) lazy2.getValue(this, kPropertyArr[1])).setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.history.views.CheckPaymentStatusDialog$$ExternalSyntheticLambda0
            public final /* synthetic */ CheckPaymentStatusDialog f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                CheckPaymentStatusDialog checkPaymentStatusDialog = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = checkPaymentStatusDialog.eventReceiver;
                        if (eventReceiver == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                        Parcelable.Creator<AlertDialogResult> creator = AlertDialogResult.CREATOR;
                        eventReceiver.sendEvent(new CheckStatusViewEvent.NegativeClicked());
                        return;
                    default:
                        Ui.EventReceiver eventReceiver2 = checkPaymentStatusDialog.eventReceiver;
                        if (eventReceiver2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                        Parcelable.Creator<AlertDialogResult> creator2 = AlertDialogResult.CREATOR;
                        eventReceiver2.sendEvent(new CheckStatusViewEvent.PositiveClicked());
                        return;
                }
            }
        });
        ((Button) this.positiveButtonView$delegate.getValue(this, kPropertyArr[2])).setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.history.views.CheckPaymentStatusDialog$$ExternalSyntheticLambda0
            public final /* synthetic */ CheckPaymentStatusDialog f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                CheckPaymentStatusDialog checkPaymentStatusDialog = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = checkPaymentStatusDialog.eventReceiver;
                        if (eventReceiver == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                        Parcelable.Creator<AlertDialogResult> creator = AlertDialogResult.CREATOR;
                        eventReceiver.sendEvent(new CheckStatusViewEvent.NegativeClicked());
                        return;
                    default:
                        Ui.EventReceiver eventReceiver2 = checkPaymentStatusDialog.eventReceiver;
                        if (eventReceiver2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                        Parcelable.Creator<AlertDialogResult> creator2 = AlertDialogResult.CREATOR;
                        eventReceiver2.sendEvent(new CheckStatusViewEvent.PositiveClicked());
                        return;
                }
            }
        });
    }
}
