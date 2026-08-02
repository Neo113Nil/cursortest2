package com.squareup.cash.appupdate.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.appupdate.screen.AppUpdateDialogScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class AppUpdateUiFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new AppUpdateUiFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (screen instanceof AppUpdateDialogScreen) {
            return new UiFactory.ComposeUi(AppUpdateDialogKt.f144lambda$680233379);
        }
        return null;
    }
}
