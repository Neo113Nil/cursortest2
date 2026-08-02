package com.squareup.cash.security.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt$overrideTheme$1;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import com.squareup.cash.security.screens.PasswordDialogScreen;
import com.squareup.cash.security.screens.SetPasswordScreen;
import com.squareup.cash.security.screens.VerifyPasswordScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class SecurityViewFactory implements ViewFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new SecurityViewFactory();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.squareup.cash.security.views.PasswordEntryView] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.squareup.cash.security.views.PasswordEntryView] */
    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        PasswordDialogView passwordDialogView;
        context.getClass();
        ThemeHelpersKt$overrideTheme$1 overrideTheme = ThemeHelpersKt.overrideTheme(context, new CalloutKt$$ExternalSyntheticLambda1(17));
        if (screen instanceof SetPasswordScreen) {
            passwordDialogView = new PasswordEntryView(overrideTheme);
        } else if (screen instanceof VerifyPasswordScreen) {
            passwordDialogView = new PasswordEntryView(overrideTheme);
        } else {
            if (!(screen instanceof PasswordDialogScreen)) {
                return null;
            }
            passwordDialogView = new PasswordDialogView(overrideTheme);
        }
        return new ViewFactory.ScreenView(passwordDialogView, passwordDialogView);
    }
}
