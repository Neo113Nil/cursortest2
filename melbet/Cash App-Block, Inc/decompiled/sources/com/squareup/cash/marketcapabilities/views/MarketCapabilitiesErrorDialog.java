package com.squareup.cash.marketcapabilities.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.AlertDialogView;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class MarketCapabilitiesErrorDialog extends AlertDialogView implements Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCapabilitiesErrorDialog(Context context) {
        super(context, null, false, 6);
        context.getClass();
        setTitle(R.string.market_caps_unavailable_title);
        setMessage(R.string.market_caps_unavailable_message);
        setPositiveButton(R.string.market_caps_unavailable_button, new RealGooglePayer$$ExternalSyntheticLambda0(this, 27));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(Unit unit) {
        unit.getClass();
    }
}
