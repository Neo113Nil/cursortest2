package app.cash.passcode.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import app.cash.passcode.screens.EndAppLock;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class PasscodeViewFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new PasscodeViewFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (screen instanceof EndAppLock) {
            return new UiFactory.ComposeUi(ComposableSingletons$PasscodeViewFactoryKt.f59lambda$2113484977);
        }
        return null;
    }
}
