package com.anythink.expressad.foundation.webview;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19945a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19946b = 5;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19947c = 6;

    /* renamed from: d, reason: collision with root package name */
    public static final int f19948d = 7;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19949e = 8;

    public interface a {
        void a();

        void b();
    }

    Drawable getBackground();

    ViewGroup.LayoutParams getLayoutParams();

    float getProgress();

    int getVisibility();

    void initResource(boolean z8);

    void onThemeChange();

    void setBackgroundColor(int i);

    void setBackgroundDrawable(Drawable drawable);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setPaused(boolean z8);

    void setProgress(float f6, boolean z8);

    void setProgressBarListener(a aVar);

    void setProgressState(int i);

    void setVisibility(int i);

    void setVisible(boolean z8);

    void startEndAnimation();
}
