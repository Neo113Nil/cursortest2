package com.anythink.expressad.foundation.webview;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19787a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19788b = 5;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19789c = 6;

    /* renamed from: d, reason: collision with root package name */
    public static final int f19790d = 7;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19791e = 8;

    public interface a {
        void a();

        void b();
    }

    Drawable getBackground();

    ViewGroup.LayoutParams getLayoutParams();

    float getProgress();

    int getVisibility();

    void initResource(boolean z3);

    void onThemeChange();

    void setBackgroundColor(int i);

    void setBackgroundDrawable(Drawable drawable);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setPaused(boolean z3);

    void setProgress(float f3, boolean z3);

    void setProgressBarListener(a aVar);

    void setProgressState(int i);

    void setVisibility(int i);

    void setVisible(boolean z3);

    void startEndAnimation();
}
