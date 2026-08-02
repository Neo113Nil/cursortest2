package com.squareup.cash.core.navigationcontainer;

import android.content.Context;
import android.os.Build;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;

/* loaded from: classes.dex */
public final class StableSystemBarsInsetsView extends FrameLayout {
    public Insets stableNavigationBarInsets;
    public Insets stableStatusBarInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StableSystemBarsInsetsView(Context context) {
        super(context);
        context.getClass();
        Insets insets = Insets.NONE;
        this.stableStatusBarInsets = insets;
        this.stableNavigationBarInsets = insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        int i = Build.VERSION.SDK_INT;
        WindowInsetsCompat.BuilderImpl builderImpl36 = i >= 36 ? new WindowInsetsCompat.BuilderImpl36(windowInsetsCompat) : i >= 35 ? new WindowInsetsCompat.BuilderImpl35(windowInsetsCompat) : i >= 34 ? new WindowInsetsCompat.BuilderImpl34(windowInsetsCompat) : i >= 31 ? new WindowInsetsCompat.BuilderImpl31(windowInsetsCompat) : i >= 30 ? new WindowInsetsCompat.BuilderImpl30(windowInsetsCompat) : new WindowInsetsCompat.BuilderImpl29(windowInsetsCompat);
        builderImpl36.setInsets(1, this.stableStatusBarInsets);
        builderImpl36.setInsets(2, this.stableNavigationBarInsets);
        return super.dispatchApplyWindowInsets(builderImpl36.build().toWindowInsets());
    }
}
