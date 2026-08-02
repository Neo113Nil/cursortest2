package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class GU extends AbstractRunnableC1347Wc {
    public static byte[] A01;
    public final /* synthetic */ C4V A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{102, 89, 84, 85, 95, 16, 71, 81, 67, 16, 94, 85, 70, 85, 66, 16, c.f17104b, 66, 85, c.f17104b, 81, 66, 85, 84};
    }

    public GU(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        boolean z6;
        z6 = this.A00.A0E;
        if (!z6) {
            this.A00.A0Q(A00(0, 24, 46));
        }
    }
}
