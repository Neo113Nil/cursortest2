package com.squareup.cash.shopping.settings.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import com.squareup.cash.shopping.settings.screens.ShoppingSettingsAutofillScreen;
import com.squareup.cash.shopping.settings.screens.ShoppingSettingsScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class ShoppingSettingsUiFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ShoppingSettingsUiFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (screen.equals(ShoppingSettingsScreen.INSTANCE)) {
            return new UiFactory.ComposeUi(ErrorDialogKt.lambda$1214835769);
        }
        if (screen.equals(ShoppingSettingsAutofillScreen.INSTANCE)) {
            return new UiFactory.ComposeUi(ErrorDialogKt.lambda$133223582);
        }
        if (screen instanceof ErrorScreen) {
            return new UiFactory.ComposeUi(ErrorDialogKt.lambda$983817354);
        }
        return null;
    }
}
