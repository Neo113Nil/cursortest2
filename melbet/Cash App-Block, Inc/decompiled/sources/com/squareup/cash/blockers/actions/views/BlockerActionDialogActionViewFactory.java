package com.squareup.cash.blockers.actions.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.blockers.screens.BlockersScreens;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class BlockerActionDialogActionViewFactory implements ViewFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new BlockerActionDialogActionViewFactory();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.squareup.cash.blockers.actions.views.BlockerActionFileDownloadFailureDialog] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.squareup.cash.blockers.actions.views.BlockerActionFileDownloadDialog] */
    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        ComposeUiView composeUiView;
        context.getClass();
        if (screen instanceof BlockersScreens.BlockerActionConfirmDialogScreen) {
            composeUiView = new BlockerActionConfirmDialogView(context);
        } else if (screen instanceof BlockersScreens.BlockerActionFileDownloadDialogScreen) {
            composeUiView = new BlockerActionFileDownloadDialog(context, (BlockersScreens.BlockerActionFileDownloadDialogScreen) screen);
        } else if (screen instanceof BlockersScreens.BlockerActionFileDownloadFailureDialogScreen) {
            composeUiView = new BlockerActionFileDownloadFailureDialog(context);
        } else {
            if (!(screen instanceof BlockersScreens.BlockerActionDialogActionScreen)) {
                return null;
            }
            composeUiView = new BlockerActionDialogActionView(context);
        }
        return new ViewFactory.ScreenView(composeUiView, composeUiView);
    }
}
