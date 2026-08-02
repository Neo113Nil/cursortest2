package com.squareup.cash.nearby.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.nearby.screens.NearbyOrderedListsScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class NearbyUiFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new NearbyUiFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (screen instanceof NearbyOrderedListsScreen) {
            return new UiFactory.ComposeUi(DotGridKt.f508lambda$595004657);
        }
        return null;
    }
}
