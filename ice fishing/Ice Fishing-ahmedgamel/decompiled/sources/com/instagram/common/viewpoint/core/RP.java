package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class RP {
    public RM A00 = new RM();
    public final RN A01;

    public RP(RN rn) {
        this.A01 = rn;
    }

    public final View A00(int i, int i4, int i6, int i9) {
        int A8h = this.A01.A8h();
        int next = this.A01.A8g();
        int childEnd = i4 > i ? 1 : -1;
        View view = null;
        while (i != i4) {
            View A7H = this.A01.A7H(i);
            int A7K = this.A01.A7K(A7H);
            int i10 = this.A01.A7J(A7H);
            this.A00.A03(A8h, next, A7K, i10);
            if (i6 != 0) {
                this.A00.A01();
                this.A00.A02(i6);
                if (this.A00.A04()) {
                    return A7H;
                }
            }
            if (i9 != 0) {
                this.A00.A01();
                this.A00.A02(i9);
                if (this.A00.A04()) {
                    view = A7H;
                }
            }
            i += childEnd;
        }
        return view;
    }
}
