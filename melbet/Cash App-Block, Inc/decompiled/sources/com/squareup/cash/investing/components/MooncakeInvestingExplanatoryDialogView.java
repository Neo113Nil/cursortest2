package com.squareup.cash.investing.components;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.InvestingExplanatoryViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.OutsideTapCloses;

/* loaded from: classes6.dex */
public final class MooncakeInvestingExplanatoryDialogView extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeInvestingExplanatoryDialogView(Context context) {
        super(context, null, false, 6);
        context.getClass();
        setPositiveButton(R.string.investing_components_ok, new RealGooglePayer$$ExternalSyntheticLambda0(this, 14));
        this.dialog.buttonsContainer.primary.setTextColor(ThemeHelpersKt.themeInfo(this).colorPalette.tint);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(InvestingExplanatoryViewModel investingExplanatoryViewModel) {
        investingExplanatoryViewModel.getClass();
        setMessage(investingExplanatoryViewModel.message);
    }
}
