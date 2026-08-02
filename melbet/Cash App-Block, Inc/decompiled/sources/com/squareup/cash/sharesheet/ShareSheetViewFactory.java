package com.squareup.cash.sharesheet;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class ShareSheetViewFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new ShareSheetViewFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (screen.equals(ShareSheetScreen.INSTANCE)) {
            return new UiFactory.ComposeUi(ShareSheetViewKt.f657lambda$1501910899);
        }
        return null;
    }
}
