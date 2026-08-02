package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1255Sm {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C1256Sn A00;
    public final C1257So A01;
    public final C1856ge A02;
    public final InterfaceC1836gK A03;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{122, 108, 71, 125, 96, 108, 106, 121, 107};
    }

    static {
        A01();
        A06 = C1255Sm.class.getSimpleName();
    }

    public C1255Sm(C1856ge c1856ge, CY cy, C1256Sn c1256Sn, C1257So c1257So) {
        this.A02 = c1856ge;
        this.A03 = cy.A5U(EnumC1837gL.A06);
        this.A00 = c1256Sn;
        this.A01 = c1257So;
        this.A03.A41(new C1868gq(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (!this.A03.AAe()) {
                this.A02.A05().AAO();
                return;
            }
            String btExtras = this.A03.A7i().optString(A00(0, 9, 7));
            if (!TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || C1310Up.A0j(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
