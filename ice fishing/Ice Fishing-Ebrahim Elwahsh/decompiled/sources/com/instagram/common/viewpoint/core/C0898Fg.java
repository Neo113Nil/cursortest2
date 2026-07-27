package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0898Fg extends AbstractC1783fo {
    public final /* synthetic */ C4T A00;

    public C0898Fg(C4T c4t) {
        this.A00 = c4t;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1783fo
    public final void A03() {
        Y2 y22;
        Y2 y23;
        String str;
        C1784fp c1784fp;
        Y2 y24;
        AbstractC2004jd abstractC2004jd;
        VA va;
        String str2;
        AbstractC2004jd abstractC2004jd2;
        C1839gi c1839gi;
        C1839gi c1839gi2;
        AbstractC2004jd abstractC2004jd3;
        AbstractC2004jd abstractC2004jd4;
        y22 = this.A00.A0C;
        if (!y22.A07()) {
            C4T c4t = this.A00;
            y23 = this.A00.A0C;
            c4t.setImpressionRecordingFlag(y23);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                C1496b9 c1496b9 = new C1496b9();
                c1784fp = this.A00.A09;
                C1496b9 A03 = c1496b9.A03(c1784fp);
                y24 = this.A00.A0C;
                C1496b9 A02 = A03.A02(y24);
                abstractC2004jd = this.A00.A0D;
                Map<String, String> A05 = A02.A04(abstractC2004jd.A0z()).A05();
                va = this.A00.A0F;
                str2 = this.A00.A0A;
                va.ABJ(str2, A05);
                abstractC2004jd2 = this.A00.A0D;
                C1103Ng A2A = abstractC2004jd2.A2A();
                c1839gi = this.A00.A0E;
                C1103Ng.A07(A2A, c1839gi);
                c1839gi2 = this.A00.A0E;
                c1839gi2.A0F().A3L();
                abstractC2004jd3 = this.A00.A03;
                String A0y = abstractC2004jd3.A0y();
                abstractC2004jd4 = this.A00.A0D;
                AbstractC1123Oa.A02(A0y, AbstractC1359Xm.A00(abstractC2004jd4.A10()));
            }
        }
    }
}
