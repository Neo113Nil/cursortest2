package com.squareup.cash.google.pay;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SearchView;
import androidx.camera.video.VideoCapture;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.core.view.WindowCompat$Api35Impl;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.InsetsCollector;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GooglePayActivationView extends FrameLayout implements Ui {
    public final PausedCompositionImpl loadingHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayActivationView(Context context) {
        super(context);
        context.getClass();
        this.loadingHelper = new PausedCompositionImpl(this, null, null, null, 62);
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
        setBackgroundColor(colorPalette.background);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new SearchView.AnonymousClass4(this, 8));
        } else {
            this.loadingHelper.setLoading(true);
        }
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(Unit unit) {
        unit.getClass();
    }
}
