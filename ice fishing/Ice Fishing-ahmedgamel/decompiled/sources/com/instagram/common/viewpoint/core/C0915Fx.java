package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0915Fx extends AbstractC1784fo {
    public final /* synthetic */ C4U A00;

    public C0915Fx(C4U c4u) {
        this.A00 = c4u;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1784fo
    public final void A03() {
        Y2 y22;
        Y2 y23;
        String str;
        C1785fp c1785fp;
        Y2 y24;
        AbstractC2005jd abstractC2005jd;
        VA va;
        String str2;
        AbstractC2005jd abstractC2005jd2;
        C1840gi c1840gi;
        C1840gi c1840gi2;
        AbstractC2005jd abstractC2005jd3;
        AbstractC2005jd abstractC2005jd4;
        y22 = this.A00.A04;
        if (!y22.A07()) {
            C4U c4u = this.A00;
            y23 = this.A00.A04;
            c4u.setImpressionRecordingFlag(y23);
            str = this.A00.A08;
            if (!TextUtils.isEmpty(str)) {
                C1497b9 c1497b9 = new C1497b9();
                c1785fp = this.A00.A07;
                C1497b9 A03 = c1497b9.A03(c1785fp);
                y24 = this.A00.A04;
                C1497b9 A02 = A03.A02(y24);
                abstractC2005jd = this.A00.A0D;
                Map<String, String> A05 = A02.A04(abstractC2005jd.A0z()).A05();
                va = this.A00.A0F;
                str2 = this.A00.A08;
                va.ABJ(str2, A05);
                abstractC2005jd2 = this.A00.A0D;
                C1104Ng A2A = abstractC2005jd2.A2A();
                c1840gi = this.A00.A0E;
                C1104Ng.A07(A2A, c1840gi);
                c1840gi2 = this.A00.A0E;
                c1840gi2.A0F().A3L();
                abstractC2005jd3 = this.A00.A0D;
                String A0y = abstractC2005jd3.A0y();
                abstractC2005jd4 = this.A00.A0D;
                AbstractC1124Oa.A02(A0y, AbstractC1360Xm.A00(abstractC2005jd4.A10()));
            }
        }
    }
}
