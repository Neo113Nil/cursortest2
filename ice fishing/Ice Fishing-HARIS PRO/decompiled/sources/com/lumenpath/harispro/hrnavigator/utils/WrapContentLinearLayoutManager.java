package com.lumenpath.harispro.hrnavigator.utils;

import D1.i;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import k0.K;
import k0.Q;
import k0.X;

/* loaded from: classes.dex */
public final class WrapContentLinearLayoutManager extends LinearLayoutManager {
    @Override // k0.K
    public final void g0(Q q2, X x2, int i, int i2) {
        i.e(q2, "recycler");
        i.e(x2, "state");
        int b2 = x2.b();
        if (b2 == 0 || x2.f3427g) {
            super.g0(q2, x2, i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int D2 = D() + G();
        for (int i3 = 0; i3 < b2; i3++) {
            try {
                View view = q2.k(i3, Long.MAX_VALUE).f3449a;
                b(view, -1, false);
                O(view);
                D2 += K.z(view);
                m0(view, q2);
            } catch (IndexOutOfBoundsException unused) {
                super.g0(q2, x2, i, i2);
                return;
            }
        }
        this.f3385b.setMeasuredDimension(size, D2);
    }
}
