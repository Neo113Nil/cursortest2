package com.squareup.cash.localization.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.localization.screens.LanguageDisclosureScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class LocalizationUiFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new LocalizationUiFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (screen instanceof LanguageDisclosureScreen) {
            return new UiFactory.ComposeUi(ComposableSingletons$LocalizationUiFactoryKt.f462lambda$934918789);
        }
        return null;
    }
}
