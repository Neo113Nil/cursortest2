package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class AV extends AbstractC2395pt {
    public static byte[] A01;
    public static final AnonymousClass23<AV> A02;
    public static final String A03;
    public final float A00;

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 75);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{22, 3, 20, 5, 3, 8, 18, 70, 11, 19, 21, 18, 70, 4, 3, 70, 15, 8, 70, 18, 14, 3, 70, 20, 7, 8, 1, 3, 70, 9, 0, 70, 61, 86, 74, 70, 87, 86, 86, 59};
    }

    static {
        A03();
        A03 = C5C.A0h(1);
        A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.q1
            @Override // com.instagram.common.viewpoint.core.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                AV A00;
                A00 = AV.A00(bundle);
                return A00;
            }
        };
    }

    public AV() {
        this.A00 = -1.0f;
    }

    public AV(float f2) {
        AbstractC06443y.A09(f2 >= 0.0f && f2 <= 100.0f, A02(0, 40, 45));
        this.A00 = f2;
    }

    public static AV A00(Bundle bundle) {
        AbstractC06443y.A07(bundle.getInt(AbstractC2395pt.A02, -1) == 1);
        float f2 = bundle.getFloat(A03, -1.0f);
        return f2 == -1.0f ? new AV() : new AV(f2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AV) && this.A00 == ((AV) obj).A00;
    }

    public final int hashCode() {
        return CB.A00(Float.valueOf(this.A00));
    }
}
