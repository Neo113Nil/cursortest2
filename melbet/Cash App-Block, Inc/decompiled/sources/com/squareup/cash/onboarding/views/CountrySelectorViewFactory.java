package com.squareup.cash.onboarding.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import com.squareup.cash.onboarding.screens.CountrySelectorScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class CountrySelectorViewFactory implements ViewFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new CountrySelectorViewFactory();
        }
    }

    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        CountrySelectorDialog countrySelectorDialog = screen instanceof CountrySelectorScreen ? new CountrySelectorDialog(context) : null;
        if (countrySelectorDialog != null) {
            return new ViewFactory.ScreenView(countrySelectorDialog, countrySelectorDialog);
        }
        return null;
    }
}
