package com.squareup.cash.common.messaging.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerFullScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class CommonMessagingViewFactory implements ViewFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new CommonMessagingViewFactory();
        }
    }

    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        ComposeUiView failureMessageFullScreenView;
        context.getClass();
        if (screen instanceof FailureMessageScreen) {
            failureMessageFullScreenView = new FailureMessageDialogView(context);
        } else if (screen instanceof FailureMessageBlockerScreen) {
            failureMessageFullScreenView = new FailureMessageDialogView(context);
        } else {
            if (!(screen instanceof FailureMessageBlockerFullScreen)) {
                return null;
            }
            failureMessageFullScreenView = new FailureMessageFullScreenView(context);
        }
        return new ViewFactory.ScreenView(failureMessageFullScreenView, failureMessageFullScreenView);
    }
}
