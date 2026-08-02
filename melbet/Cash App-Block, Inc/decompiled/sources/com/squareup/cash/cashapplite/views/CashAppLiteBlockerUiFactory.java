package com.squareup.cash.cashapplite.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.blockers.views.BlockerUiFactory;
import com.squareup.cash.cashapplite.screens.PasskeySignatureBlockerScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class CashAppLiteBlockerUiFactory implements BlockerUiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new CashAppLiteBlockerUiFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        screen.getClass();
        context.getClass();
        if (screen instanceof PasskeySignatureBlockerScreen) {
            return new UiFactory.ComposeUi(KycAppletTileKt.lambda$965951453);
        }
        return null;
    }
}
