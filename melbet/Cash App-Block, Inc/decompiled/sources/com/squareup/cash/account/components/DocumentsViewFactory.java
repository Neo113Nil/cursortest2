package com.squareup.cash.account.components;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.profile.screens.DocumentDownloaderScreen;
import com.squareup.cash.profile.screens.DocumentsDownloadOptionsScreen;
import com.squareup.cash.profile.screens.DocumentsScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class DocumentsViewFactory implements ViewFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new DocumentsViewFactory();
        }
    }

    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        ComposeUiView accountDocumentsDownloadOptionsView;
        context.getClass();
        if (screen instanceof DocumentsScreen) {
            accountDocumentsDownloadOptionsView = new AccountDocumentsView(context);
        } else if (screen instanceof DocumentDownloaderScreen) {
            accountDocumentsDownloadOptionsView = new AccountDocumentDownloaderDialogView(context);
        } else {
            if (!(screen instanceof DocumentsDownloadOptionsScreen)) {
                return null;
            }
            accountDocumentsDownloadOptionsView = new AccountDocumentsDownloadOptionsView(context);
        }
        return new ViewFactory.ScreenView(accountDocumentsDownloadOptionsView, accountDocumentsDownloadOptionsView);
    }
}
