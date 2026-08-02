package com.squareup.cash.blockers.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.camera.video.VideoCapture;
import androidx.core.view.WindowCompat$Api35Impl;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.InsetsCollector;

/* loaded from: classes4.dex */
public final class SpinnerView extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpinnerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
        setBackgroundColor(colorPalette.background);
    }
}
