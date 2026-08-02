package com.squareup.cash.blockers.views;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SearchView;
import androidx.camera.video.VideoCapture;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.core.view.WindowCompat$Api35Impl;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.blockers.viewmodels.CardActivationViewEvent$Back;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.DialogResultListener;
import com.squareup.cash.ui.InsetsCollector;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class CardActivationView extends FrameLayout implements DialogResultListener, Ui {
    public Ui.EventReceiver eventReceiver;
    public final PausedCompositionImpl loadingHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardActivationView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.loadingHelper = new PausedCompositionImpl(this, null, null, null, 62);
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
        setBackgroundColor(colorPalette.background);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new SearchView.AnonymousClass4(this, 4));
        } else {
            this.loadingHelper.setLoading(true);
        }
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogCanceled(Screen screen) {
        screen.getClass();
        if (screen instanceof FailureMessageBlockerScreen) {
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver != null) {
                eventReceiver.sendEvent(CardActivationViewEvent$Back.INSTANCE);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
        }
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        if (screen instanceof FailureMessageBlockerScreen) {
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver != null) {
                eventReceiver.sendEvent(CardActivationViewEvent$Back.INSTANCE);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
        }
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(Unit unit) {
        unit.getClass();
    }
}
