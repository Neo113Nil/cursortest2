package com.squareup.cash.billssubscriptions.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.billssubscriptions.screens.BillsSubscriptionsMerchantListScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class BillsSubscriptionsUiFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new BillsSubscriptionsUiFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (screen instanceof BillsSubscriptionsMerchantListScreen) {
            return new UiFactory.ComposeUi(BillsSubscriptionsMerchantListViewKt.lambda$1814575545);
        }
        return null;
    }
}
