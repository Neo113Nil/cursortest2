package com.squareup.cash.investing.components.autoinvest;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.runtime.PausedCompositionImpl;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.components.LoadingHelper$Position;
import com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class InvestingCancelRecurringPurchaseScreen extends FrameLayout implements Ui {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingCancelRecurringPurchaseScreen(Context context) {
        super(context);
        context.getClass();
        setBackgroundColor(ThemeHelpersKt.themeInfo(this).colorPalette.background);
        setContentDescription(context.getString(R.string.investing_components_cancel_recurring_purchase_content_description));
        new PausedCompositionImpl(this, null, new ToolbarTuckTargets(LoadingHelper$Position.Center, new SplitButtons$$ExternalSyntheticLambda0(2)), null, 54).setLoading(true);
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
