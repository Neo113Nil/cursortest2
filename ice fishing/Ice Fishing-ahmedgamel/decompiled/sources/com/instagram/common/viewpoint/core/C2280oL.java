package com.instagram.common.viewpoint.core;

import com.anythink.core.common.d.j;
import java.math.RoundingMode;

/* renamed from: com.facebook.ads.redexgen.X.oL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2280oL implements C9F {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public C2280oL(C9Q c9q) {
        int i;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        i = c9q.A02;
        this.A02 = i;
        i6 = c9q.A01;
        this.A01 = i6;
        i9 = c9q.A05;
        this.A05 = i9;
        i10 = c9q.A04;
        this.A04 = i10;
        i11 = c9q.A03;
        this.A03 = i11;
        i12 = c9q.A00;
        this.A00 = i12;
    }

    public static int A00(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return j.v.f12600w;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    private final int A01(int i) {
        int A00 = A00(i);
        int maxByteRate = this.A03;
        return AbstractC0784As.A02((maxByteRate * A00) / 1000000);
    }

    private final int A02(int i, int i6) {
        int bufferSizeUs;
        int i9 = this.A04;
        if (i == 5) {
            int bufferSizeUs2 = this.A00;
            i9 *= bufferSizeUs2;
        }
        if (i6 != -1) {
            bufferSizeUs = AbstractC1165Pr.A00(i6, 8, RoundingMode.CEILING);
        } else {
            bufferSizeUs = A00(i);
        }
        return AbstractC0784As.A02((i9 * bufferSizeUs) / 1000000);
    }

    public static int A03(int i, int i6, int i9) {
        return AbstractC0784As.A02(((i * i6) * i9) / 1000000);
    }

    private final int A04(int i, int i6, int i9) {
        int maxAppBufferSize = this.A05 * i;
        int targetBufferSize = this.A02;
        int minAppBufferSize = A03(targetBufferSize, i6, i9);
        int targetBufferSize2 = this.A01;
        return C5C.A07(maxAppBufferSize, minAppBufferSize, A03(targetBufferSize2, i6, i9));
    }

    private final int A05(int i, int i6, int i9, int i10, int i11, int i12) {
        switch (i9) {
            case 0:
                return A04(i, i11, i10);
            case 1:
                return A01(i6);
            case 2:
                return A02(i6, i12);
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.instagram.common.viewpoint.core.C9F
    public final int A75(int i, int i6, int i9, int i10, int i11, int i12, double d2) {
        int bufferSize = A05(i, i6, i9, i10, i11, i12);
        return (((Math.max(i, (int) (bufferSize * d2)) + i10) - 1) / i10) * i10;
    }
}
