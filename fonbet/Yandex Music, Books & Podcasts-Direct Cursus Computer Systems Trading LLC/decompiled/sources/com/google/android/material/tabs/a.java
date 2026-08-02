package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import defpackage.fxf;
import defpackage.wm0;

/* loaded from: classes3.dex */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.F || !(view instanceof TabLayout.a)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.a aVar = (TabLayout.a) view;
        int contentWidth = aVar.getContentWidth();
        int contentHeight = aVar.getContentHeight();
        int x = (int) fxf.x(aVar.getContext(), 24);
        if (contentWidth < x) {
            contentWidth = x;
        }
        int right = (aVar.getRight() + aVar.getLeft()) / 2;
        int bottom = (aVar.getBottom() + aVar.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = a(tabLayout, view);
        RectF a2 = a(tabLayout, view2);
        drawable.setBounds(wm0.c((int) a.left, f, (int) a2.left), drawable.getBounds().top, wm0.c((int) a.right, f, (int) a2.right), drawable.getBounds().bottom);
    }
}
