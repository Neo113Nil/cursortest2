package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0910Fs extends AbstractC1784fo {
    public final /* synthetic */ VA A00;
    public final /* synthetic */ Y2 A01;
    public final /* synthetic */ C1678e5 A02;
    public final /* synthetic */ C0908Fq A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0910Fs(C0908Fq c0908Fq, String str, C1678e5 c1678e5, VA va, Map map, Y2 y22) {
        this.A03 = c0908Fq;
        this.A04 = str;
        this.A02 = c1678e5;
        this.A00 = va;
        this.A05 = map;
        this.A01 = y22;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1784fo
    public final void A03() {
        C1785fp c1785fp;
        SparseBooleanArray sparseBooleanArray;
        C1785fp c1785fp2;
        C1104Ng c1104Ng;
        C1840gi c1840gi;
        SparseBooleanArray sparseBooleanArray2;
        c1785fp = this.A03.A02;
        if (!c1785fp.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A05;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                VA va = this.A00;
                String str = this.A04;
                C1497b9 c1497b9 = new C1497b9(this.A05);
                c1785fp2 = this.A03.A03;
                va.ABJ(str, c1497b9.A03(c1785fp2).A02(this.A01).A05());
                c1104Ng = this.A03.A00;
                c1840gi = this.A03.A06;
                C1104Ng.A07(c1104Ng, c1840gi);
                sparseBooleanArray2 = this.A03.A05;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
