package com.yandex.plus.bdui.plus.scaffold.controller;

import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes4.dex */
public final class a extends LinearLayout {
    public final void a(View view, int i, int i2) {
        view.getClass();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = i2;
        addViewInLayout(view, i, layoutParams, true);
    }
}
