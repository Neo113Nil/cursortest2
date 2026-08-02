package com.yandex.plus.core.window;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import defpackage.kqv;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a {
    public static final a a = new a();

    public static Rect b(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @NotNull
    public final kqv a(@NotNull Context context) {
        context.getClass();
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        windowInsets.getClass();
        return kqv.h(null, windowInsets);
    }
}
