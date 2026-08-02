package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ha, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1914ha extends AbstractC1216Qy {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(RK rk);

    public abstract boolean A0Y(RK rk);

    public abstract boolean A0Z(RK rk, int i, int i4, int i6, int i9);

    public abstract boolean A0a(RK rk, RK rk2, int i, int i4, int i6, int i9);

    @Override // com.instagram.common.viewpoint.core.AbstractC1216Qy
    public final boolean A0N(RK rk) {
        return !this.A00 || rk.A0f();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1216Qy
    public final boolean A0O(RK rk, C1215Qx c1215Qx, C1215Qx c1215Qx2) {
        if (c1215Qx != null && (c1215Qx.A01 != c1215Qx2.A01 || c1215Qx.A03 != c1215Qx2.A03)) {
            return A0Z(rk, c1215Qx.A01, c1215Qx.A03, c1215Qx2.A01, c1215Qx2.A03);
        }
        return A0X(rk);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1216Qy
    public final boolean A0P(RK rk, C1215Qx c1215Qx, C1215Qx c1215Qx2) {
        int i = c1215Qx.A01;
        int oldLeft = c1215Qx.A03;
        View view = rk.A0H;
        int oldTop = c1215Qx2 == null ? view.getLeft() : c1215Qx2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c1215Qx2 == null ? view.getTop() : c1215Qx2.A03;
        if (!rk.A0g() && (i != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0Z(rk, i, oldLeft, oldTop, top);
        }
        return A0Y(rk);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1216Qy
    public final boolean A0Q(RK rk, C1215Qx c1215Qx, C1215Qx c1215Qx2) {
        if (c1215Qx.A01 != c1215Qx2.A01 || c1215Qx.A03 != c1215Qx2.A03) {
            return A0Z(rk, c1215Qx.A01, c1215Qx.A03, c1215Qx2.A01, c1215Qx2.A03);
        }
        A0U(rk);
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1216Qy
    public final boolean A0R(RK rk, RK rk2, C1215Qx c1215Qx, C1215Qx c1215Qx2) {
        int i;
        int i4;
        int i6 = c1215Qx.A01;
        int i9 = c1215Qx.A03;
        if (rk2.A0l()) {
            i = c1215Qx.A01;
            i4 = c1215Qx.A03;
        } else {
            i = c1215Qx2.A01;
            i4 = c1215Qx2.A03;
        }
        return A0a(rk, rk2, i6, i9, i, i4);
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

    public final void A0W(RK rk, boolean z6) {
        A0K(rk);
    }
}
