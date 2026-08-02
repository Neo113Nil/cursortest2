package com.squareup.cash.blockers.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.camera.video.VideoCapture;
import androidx.core.view.WindowCompat$Api35Impl;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.util.android.Views;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class CheckmarkView extends FrameLayout implements OnBackListener, Ui {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckmarkView(Context context) {
        super(context);
        context.getClass();
        View mooncakeLargeIcon = new MooncakeLargeIcon(context, null, MooncakeLargeIcon.Icon.Success, 2);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = Views.dip(mooncakeLargeIcon, 80);
        marginLayoutParams.leftMargin = Views.dip(mooncakeLargeIcon, 32);
        marginLayoutParams.rightMargin = Views.dip(mooncakeLargeIcon, 32);
        mooncakeLargeIcon.setLayoutParams(marginLayoutParams);
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
        setBackgroundColor(colorPalette.background);
        addView(mooncakeLargeIcon);
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        return true;
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
