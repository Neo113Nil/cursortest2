package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ha, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1894ha extends AbstractC1196Qy {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(RK rk);

    public abstract boolean A0Y(RK rk);

    public abstract boolean A0Z(RK rk, int i, int i6, int i9, int i10);

    public abstract boolean A0a(RK rk, RK rk2, int i, int i6, int i9, int i10);

    @Override // com.instagram.common.viewpoint.core.AbstractC1196Qy
    public final boolean A0N(RK rk) {
        return !this.A00 || rk.A0f();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1196Qy
    public final boolean A0O(RK rk, C1195Qx c1195Qx, C1195Qx c1195Qx2) {
        if (c1195Qx != null && (c1195Qx.A01 != c1195Qx2.A01 || c1195Qx.A03 != c1195Qx2.A03)) {
            return A0Z(rk, c1195Qx.A01, c1195Qx.A03, c1195Qx2.A01, c1195Qx2.A03);
        }
        return A0X(rk);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1196Qy
    public final boolean A0P(RK rk, C1195Qx c1195Qx, C1195Qx c1195Qx2) {
        int i = c1195Qx.A01;
        int oldLeft = c1195Qx.A03;
        View view = rk.A0H;
        int oldTop = c1195Qx2 == null ? view.getLeft() : c1195Qx2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c1195Qx2 == null ? view.getTop() : c1195Qx2.A03;
        if (!rk.A0g() && (i != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0Z(rk, i, oldLeft, oldTop, top);
        }
        return A0Y(rk);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1196Qy
    public final boolean A0Q(RK rk, C1195Qx c1195Qx, C1195Qx c1195Qx2) {
        if (c1195Qx.A01 != c1195Qx2.A01 || c1195Qx.A03 != c1195Qx2.A03) {
            return A0Z(rk, c1195Qx.A01, c1195Qx.A03, c1195Qx2.A01, c1195Qx2.A03);
        }
        A0U(rk);
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1196Qy
    public final boolean A0R(RK rk, RK rk2, C1195Qx c1195Qx, C1195Qx c1195Qx2) {
        int i;
        int i6;
        int i9 = c1195Qx.A01;
        int i10 = c1195Qx.A03;
        if (rk2.A0l()) {
            i = c1195Qx.A01;
            i6 = c1195Qx.A03;
        } else {
            i = c1195Qx2.A01;
            i6 = c1195Qx2.A03;
        }
        return A0a(rk, rk2, i9, i10, i, i6);
    }

    public final void A0T(RK rk) {
        A0K(rk);
    }

    public final void A0U(RK rk) {
        A0K(rk);
    }

    public final void A0V(RK rk) {
        A0K(rk);
    }

    public final void A0W(RK rk, boolean z3) {
        A0K(rk);
    }
}
