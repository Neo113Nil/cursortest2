package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0930Fs extends AbstractC1804fo {
    public final /* synthetic */ VA A00;
    public final /* synthetic */ Y2 A01;
    public final /* synthetic */ C1698e5 A02;
    public final /* synthetic */ C0928Fq A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0930Fs(C0928Fq c0928Fq, String str, C1698e5 c1698e5, VA va, Map map, Y2 y22) {
        this.A03 = c0928Fq;
        this.A04 = str;
        this.A02 = c1698e5;
        this.A00 = va;
        this.A05 = map;
        this.A01 = y22;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1804fo
    public final void A03() {
        C1805fp c1805fp;
        SparseBooleanArray sparseBooleanArray;
        C1805fp c1805fp2;
        C1124Ng c1124Ng;
        C1860gi c1860gi;
        SparseBooleanArray sparseBooleanArray2;
        c1805fp = this.A03.A02;
        if (!c1805fp.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A05;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                VA va = this.A00;
                String str = this.A04;
                C1517b9 c1517b9 = new C1517b9(this.A05);
                c1805fp2 = this.A03.A03;
                va.ABJ(str, c1517b9.A03(c1805fp2).A02(this.A01).A05());
                c1124Ng = this.A03.A00;
                c1860gi = this.A03.A06;
                C1124Ng.A07(c1124Ng, c1860gi);
                sparseBooleanArray2 = this.A03.A05;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
