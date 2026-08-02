package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.buynowpaylater.viewmodels.OrderDetailRowModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes5.dex */
public final class AfterPayPurchaseDetailsView extends LinearLayout implements Ui {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ColorPalette colorPalette;
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayPurchaseDetailsView(Context context) {
        super(context);
        context.getClass();
        this.colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        setOrientation(1);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(List<? extends OrderDetailRowModel> list) {
        list.getClass();
        removeAllViews();
        for (OrderDetailRowModel orderDetailRowModel : list) {
            if (orderDetailRowModel instanceof OrderDetailRowModel.Spacer) {
                View view = new View(getContext());
                view.setLayoutParams(new LinearLayout.LayoutParams(-2, Views.dip(view, 16)));
                addView(view);
            } else if (orderDetailRowModel instanceof OrderDetailRowModel.Divider) {
                View appCompatImageView = new AppCompatImageView(getContext());
                appCompatImageView.setBackground(new DividerDrawable(this.colorPalette.hairline));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, Views.dip(appCompatImageView, 32), 0, Views.dip(appCompatImageView, 32));
                appCompatImageView.setLayoutParams(layoutParams);
                addView(appCompatImageView);
            } else {
                if (!(orderDetailRowModel instanceof OrderDetailRowModel.OrderDetailRowHeader)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                Context context = getContext();
                context.getClass();
                AfterPaySectionRowView afterPaySectionRowView = new AfterPaySectionRowView(context);
                OrderDetailRowModel.OrderDetailRowHeader orderDetailRowHeader = (OrderDetailRowModel.OrderDetailRowHeader) orderDetailRowModel;
                TextModel textModel = orderDetailRowHeader.title;
                TextModel textModel2 = orderDetailRowHeader.detail;
                RewardSlotQueries$$ExternalSyntheticLambda0 rewardSlotQueries$$ExternalSyntheticLambda0 = new RewardSlotQueries$$ExternalSyntheticLambda0(this, 22);
                FigmaTextView figmaTextView = afterPaySectionRowView.title;
                if (textModel != null) {
                    ImageUtilsKt.applyTextModel(figmaTextView, textModel, rewardSlotQueries$$ExternalSyntheticLambda0);
                } else {
                    figmaTextView.setText((CharSequence) null);
                }
                FigmaTextView figmaTextView2 = afterPaySectionRowView.detail;
                if (textModel2 != null) {
                    ImageUtilsKt.applyTextModel(figmaTextView2, textModel2, rewardSlotQueries$$ExternalSyntheticLambda0);
                } else {
                    figmaTextView2.setText((CharSequence) null);
                }
                addView(afterPaySectionRowView);
            }
        }
    }
}
