package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0919Fg extends AbstractC1804fo {
    public final /* synthetic */ C4T A00;

    public C0919Fg(C4T c4t) {
        this.A00 = c4t;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1804fo
    public final void A03() {
        Y2 y22;
        Y2 y23;
        String str;
        C1805fp c1805fp;
        Y2 y24;
        AbstractC2025jd abstractC2025jd;
        VA va;
        String str2;
        AbstractC2025jd abstractC2025jd2;
        C1860gi c1860gi;
        C1860gi c1860gi2;
        AbstractC2025jd abstractC2025jd3;
        AbstractC2025jd abstractC2025jd4;
        y22 = this.A00.A0C;
        if (!y22.A07()) {
            C4T c4t = this.A00;
            y23 = this.A00.A0C;
            c4t.setImpressionRecordingFlag(y23);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                C1517b9 c1517b9 = new C1517b9();
                c1805fp = this.A00.A09;
                C1517b9 A03 = c1517b9.A03(c1805fp);
                y24 = this.A00.A0C;
                C1517b9 A02 = A03.A02(y24);
                abstractC2025jd = this.A00.A0D;
                Map<String, String> A05 = A02.A04(abstractC2025jd.A0z()).A05();
                va = this.A00.A0F;
                str2 = this.A00.A0A;
                va.ABJ(str2, A05);
                abstractC2025jd2 = this.A00.A0D;
                C1124Ng A2A = abstractC2025jd2.A2A();
                c1860gi = this.A00.A0E;
                C1124Ng.A07(A2A, c1860gi);
                c1860gi2 = this.A00.A0E;
                c1860gi2.A0F().A3L();
                abstractC2025jd3 = this.A00.A03;
                String A0y = abstractC2025jd3.A0y();
                abstractC2025jd4 = this.A00.A0D;
                AbstractC1144Oa.A02(A0y, AbstractC1380Xm.A00(abstractC2025jd4.A10()));
            }
        }
    }
}
