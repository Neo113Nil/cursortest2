package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.In, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0983In extends AbstractC1784fo {
    public static byte[] A01;
    public final /* synthetic */ AbstractC0979Ij A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-37, -32, -39, -31, -26, -35, -36, -41, -39, -36, -41, -31, -26, -36, -35, -16};
    }

    public C0983In(AbstractC0979Ij abstractC0979Ij) {
        this.A00 = abstractC0979Ij;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1784fo
    public final void A03() {
        int i;
        boolean z3;
        boolean z6;
        if (!this.A00.A0A.A07()) {
            this.A00.A0A.A05();
            if (!TextUtils.isEmpty(this.A00.A06.A2E())) {
                Map<String, String> A05 = new C1497b9().A03(this.A00.A0D).A02(this.A00.A0A).A04(this.A00.A06.A0z()).A05();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 96));
                i = this.A00.A02;
                A05.put(A00(0, 16, 42), append.append(i).toString());
                this.A00.A08.ABJ(this.A00.A06.A2E(), A05);
                C1336Wl.A00(this.A00.A07).A0E(this.A00.A0C.A8l(), this.A00.A06.A2E());
                C1104Ng.A07(this.A00.A06.A2A(), this.A00.A07);
                this.A00.A07.A0F().A3L();
                z3 = this.A00.A04;
                if (!z3) {
                    AbstractC1124Oa.A02(this.A00.A06.A0y(), AbstractC1360Xm.A00(this.A00.A06.A10()));
                }
                z6 = this.A00.A05;
                if (!z6) {
                    this.A00.A0B.A4j(this.A00.A0C.A8G());
                }
            }
        }
    }
}
