package com.anythink.basead.mixad.f;

import android.content.Context;
import android.widget.FrameLayout;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public final class a {
    private static FrameLayout.LayoutParams a(int i) {
        return a(i, 0, 0);
    }

    public static FrameLayout.LayoutParams a(int i, int i4, int i9) {
        Context g9 = t.b().g();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (i == 1) {
            layoutParams.gravity = 83;
            layoutParams.leftMargin = q.a(g9, 2.0f);
            layoutParams.bottomMargin = q.a(g9, 2.0f);
            return layoutParams;
        }
        if (i4 > 0) {
            layoutParams.width = i4;
        }
        if (i9 > 0) {
            layoutParams.height = i9;
        }
        layoutParams.gravity = 85;
        layoutParams.bottomMargin = q.a(g9, 2.0f);
        layoutParams.rightMargin = q.a(g9, 2.0f);
        return layoutParams;
    }
}
