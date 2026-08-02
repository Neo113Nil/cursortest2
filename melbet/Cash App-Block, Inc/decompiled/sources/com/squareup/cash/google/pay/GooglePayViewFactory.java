package com.squareup.cash.google.pay;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.blockers.screens.BlockersScreens;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class GooglePayViewFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new GooglePayViewFactory();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.squareup.cash.google.pay.GooglePayCompleteProvisioningView] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.squareup.cash.google.pay.GooglePayActivationView] */
    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        GooglePayProvisioningExitView googlePayProvisioningExitView;
        context.getClass();
        if (screen instanceof BlockersScreens.ProvisionGooglePayScreen) {
            return new UiFactory.ComposeUi(GooglePayLoadingViewKt.lambda$1818560934);
        }
        if (screen instanceof BlockersScreens.GooglePayActivationScreen) {
            googlePayProvisioningExitView = new GooglePayActivationView(context);
        } else if (screen instanceof BlockersScreens.GooglePayCompleteProvisioningScreen) {
            googlePayProvisioningExitView = new GooglePayCompleteProvisioningView(context);
        } else {
            if (!(screen instanceof BlockersScreens.GooglePayProvisioningExitScreen)) {
                return null;
            }
            googlePayProvisioningExitView = new GooglePayProvisioningExitView(context);
        }
        return new UiFactory.ViewUi(googlePayProvisioningExitView, googlePayProvisioningExitView);
    }
}
