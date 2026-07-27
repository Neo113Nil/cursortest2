package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.hm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1905hm implements QP {
    public static byte[] A01;
    public final /* synthetic */ C7M A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-26, 4, 15, 15, 8, 7, -61, 4, 23, 23, 4, 6, 11, -61, 18, 17, -61, 4, -61, 6, 11, 12, 15, 7, -61, 26, 11, 12, 6, 11, -61, 12, 22, -61, 17, 18, 23, -61, 7, 8, 23, 4, 6, 11, 8, 7, -35, -61, -53, -55, -44, -44, -51, -52, -120, -52, -51, -36, -55, -53, -48, -120, -41, -42, -120, -55, -42, -120, -55, -44, -38, -51, -55, -52, -31, -120, -52, -51, -36, -55, -53, -48, -51, -52, -120, -53, -48, -47, -44, -52, -120};
    }

    public C1905hm(C7M c7m) {
        this.A00 = c7m;
    }

    @Override // com.instagram.common.viewpoint.core.QP
    public final void A4K(View view, int i, ViewGroup.LayoutParams layoutParams) {
        RK A0F = C7M.A0F(view);
        if (A0F != null) {
            if (A0F.A0i() || A0F.A0l()) {
                A0F.A0V();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 91) + A0F + this.A00.A1J());
            }
        }
        this.A00.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.QP
    public final void A5w(int i) {
        RK A0F;
        View view = A7H(i);
        if (view != null && (A0F = C7M.A0F(view)) != null) {
            if (!A0F.A0i() || A0F.A0l()) {
                A0F.A0Z(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 32) + A0F + this.A00.A1J());
            }
        }
        this.A00.detachViewFromParent(i);
    }

    @Override // com.instagram.common.viewpoint.core.QP
    public final View A7H(int i) {
        return this.A00.getChildAt(i);
    }

    @Override // com.instagram.common.viewpoint.core.QP
    public final int A7I() {
        return this.A00.getChildCount();
    }

    @Override // com.instagram.common.viewpoint.core.QP
    public final RK A7L(View view) {
        return C7M.A0F(view);
    }

    @Override // com.instagram.common.viewpoint.core.QP
    public final int AA7(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.instagram.common.viewpoint.core.QP
    public final void ADo(View view) {
        RK A0F = C7M.A0F(view);
        if (A0F != null) {
            A0F.A0D(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.QP
    public final void AEa(View view) {
        RK A0F = C7M.A0F(view);
        if (A0F != null) {
            A0F.A0E(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.QP
    public final void AIQ() {
        int A7I = A7I();
        for (int i = 0; i < A7I; i++) {
            View A7H = A7H(i);
            this.A00.A1g(A7H);
            A7H.clearAnimation();
        }
        this.A00.removeAllViews();
    }

    @Override // com.instagram.common.viewpoint.core.QP
    public final void AIW(int i) {
        View childAt = this.A00.getChildAt(i);
        if (childAt != null) {
            this.A00.A1g(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i);
    }

    @Override // com.instagram.common.viewpoint.core.QP
    public final void addView(View view, int i) {
        this.A00.addView(view, i);
        this.A00.A1f(view);
    }
}
