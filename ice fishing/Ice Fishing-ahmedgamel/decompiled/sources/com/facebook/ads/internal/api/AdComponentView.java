package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public interface AdComponentView {
    void addView(View view);

    void addView(View view, int i);

    void addView(View view, int i, int i4);

    void addView(View view, int i, ViewGroup.LayoutParams layoutParams);

    void addView(View view, ViewGroup.LayoutParams layoutParams);

    void onWindowFocusChanged(boolean z6);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);
}
