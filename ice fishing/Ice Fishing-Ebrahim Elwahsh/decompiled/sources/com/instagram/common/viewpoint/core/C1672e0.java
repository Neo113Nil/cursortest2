package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.e0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1672e0 {
    public final int[] A00(View view, int i, int i4) {
        R3 r32 = (R3) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), r32.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i4, childWidthSpec + view.getPaddingBottom(), r32.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + r32.leftMargin + r32.rightMargin, childWidthSpec3 + r32.bottomMargin + r32.topMargin};
    }
}
