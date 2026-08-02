package com.squareup.cash.pdf.view;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import com.squareup.cash.pdf.screen.PdfScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class PdfViewFactory implements ViewFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new PdfViewFactory();
        }
    }

    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (!(screen instanceof PdfScreen)) {
            return null;
        }
        PdfPreviewView pdfPreviewView = new PdfPreviewView(context);
        return new ViewFactory.ScreenView(pdfPreviewView, pdfPreviewView);
    }
}
