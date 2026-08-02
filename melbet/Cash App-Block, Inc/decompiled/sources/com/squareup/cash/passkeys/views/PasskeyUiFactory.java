package com.squareup.cash.passkeys.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.passkeys.screens.PasskeyManagementScreen;
import com.squareup.cash.passkeys.screens.PasskeyUpsellScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class PasskeyUiFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new PasskeyUiFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (screen instanceof PasskeyManagementScreen) {
            return new UiFactory.ComposeUi(PasskeyUpsellViewKt.f540lambda$767517435);
        }
        if (screen instanceof PasskeyUpsellScreen) {
            return new UiFactory.ComposeUi(PasskeyUpsellViewKt.f541lambda$947839080);
        }
        return null;
    }
}
