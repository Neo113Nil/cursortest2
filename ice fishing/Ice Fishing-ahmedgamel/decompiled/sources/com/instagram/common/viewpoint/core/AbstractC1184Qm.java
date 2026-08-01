package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1184Qm {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final R2 A02;

    static {
        A04();
    }

    public static String A03(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-6, -1, 7, -14, -3, -6, -11, -79, 0, 3, -6, -10, -1, 5, -14, 5, -6, 0, -1};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i);

    public AbstractC1184Qm(R2 r22) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = r22;
    }

    public /* synthetic */ AbstractC1184Qm(R2 r22, C1908hp c1908hp) {
        this(r22);
    }

    public static C1908hp A00(R2 r22) {
        return new C1908hp(r22);
    }

    public static C1907ho A01(R2 r22) {
        return new C1907ho(r22);
    }

    public static AbstractC1184Qm A02(R2 r22, int i) {
        switch (i) {
            case 0:
                return A00(r22);
            case 1:
                return A01(r22);
            default:
                throw new IllegalArgumentException(A03(0, 19, 19));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
