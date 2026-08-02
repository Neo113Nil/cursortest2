package com.squareup.cash.recurring;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.blockers.screens.BlockersScreens;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class RecurringViewFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RecurringViewFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (!(screen instanceof BlockersScreens.ConfirmFirstScheduledReloadNoticeScreen)) {
            return null;
        }
        ConfirmFirstScheduledReloadNoticeView confirmFirstScheduledReloadNoticeView = new ConfirmFirstScheduledReloadNoticeView(context);
        return new UiFactory.ViewUi(confirmFirstScheduledReloadNoticeView, confirmFirstScheduledReloadNoticeView);
    }
}
