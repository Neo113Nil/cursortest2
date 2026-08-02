package com.squareup.cash.initialscreenloader.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.initialscreenloader.screens.AppUpgradeRequiredScreen;
import com.squareup.cash.initialscreenloader.screens.AppUpgradeSuggestedScreen;
import com.squareup.cash.initialscreenloader.screens.GenericErrorScreen;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.cash.initialscreenloader.screens.InitiateSessionFailedScreen;
import com.squareup.cash.initialscreenloader.screens.ScenarioPlanErrorScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class InitialScreenLoaderViewFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new InitialScreenLoaderViewFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (screen instanceof AppUpgradeRequiredScreen) {
            return new UiFactory.ComposeUi(InitialScreenPlaceholderViewKt.lambda$1919818681);
        }
        if (screen instanceof AppUpgradeSuggestedScreen) {
            return new UiFactory.ComposeUi(InitialScreenPlaceholderViewKt.lambda$1462918064);
        }
        if (screen instanceof InitiateSessionFailedScreen) {
            return new UiFactory.ComposeUi(InitialScreenPlaceholderViewKt.f441lambda$94044478);
        }
        if (screen instanceof GenericErrorScreen) {
            return new UiFactory.ComposeUi(InitialScreenPlaceholderViewKt.lambda$705530051);
        }
        if (screen instanceof InitialScreenPlaceholder) {
            return new UiFactory.ComposeUi(InitialScreenPlaceholderViewKt.lambda$1505104580);
        }
        if (screen.equals(ScenarioPlanErrorScreen.INSTANCE)) {
            return new UiFactory.ComposeUi(InitialScreenPlaceholderViewKt.f440lambda$1990288187);
        }
        return null;
    }
}
