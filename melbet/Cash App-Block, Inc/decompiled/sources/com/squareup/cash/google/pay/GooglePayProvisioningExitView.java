package com.squareup.cash.google.pay;

import android.content.Context;
import android.widget.FrameLayout;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GooglePayProvisioningExitView extends FrameLayout implements Ui {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayProvisioningExitView(Context context) {
        super(context);
        context.getClass();
        setBackgroundColor(ThemeHelpersKt.themeInfo(this).colorPalette.background);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(Unit unit) {
        unit.getClass();
    }
}
