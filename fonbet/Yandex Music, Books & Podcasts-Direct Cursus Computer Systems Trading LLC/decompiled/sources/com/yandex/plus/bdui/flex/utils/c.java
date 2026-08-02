package com.yandex.plus.bdui.flex.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.xq0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class c extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    public final void a(int i, View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null && (layoutParams = generateDefaultLayoutParams()) == null) {
            xq0.x("generateDefaultLayoutParams() cannot return null  ");
        } else {
            addViewInLayout(view, i, layoutParams);
        }
    }
}
