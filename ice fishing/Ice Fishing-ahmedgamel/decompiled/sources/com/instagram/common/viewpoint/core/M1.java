package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class M1 extends AbstractC1188Qq<C0908Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1381Yh A03;
    public C1785fp A04;
    public String A05;
    public List<C1678e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC2005jd A08;
    public final C1246Sx A09;
    public final C1840gi A0A;
    public final VA A0B;
    public final UK A0C;
    public final Y2 A0D;
    public final C6X A0E;
    public final DZ A0F;

    public M1(C1840gi c1840gi, List<C1678e5> list, AbstractC2005jd abstractC2005jd, VA va, UK uk, InterfaceC1381Yh interfaceC1381Yh, String str, C6X c6x, DZ dz) {
        this.A0A = c1840gi;
        this.A0B = va;
        this.A0C = uk;
        this.A09 = uk.A14();
        this.A04 = uk.A1G();
        this.A0D = uk.A1E();
        this.A03 = interfaceC1381Yh;
        this.A08 = abstractC2005jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c6x;
        this.A0F = dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1188Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0908Fq A0F(ViewGroup viewGroup, int i) {
        return new C0908Fq(AbstractC1520bW.A00(new C1556c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1188Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C0908Fq c0908Fq, int i) {
        C1678e5 c1678e5 = this.A06.get(i);
        c0908Fq.A0q(this.A04);
        c0908Fq.A0p(c1678e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1188Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i, int i6, int i9) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i6;
        this.A01 = i9;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C1785fp c1785fp) {
        this.A04 = c1785fp;
    }
}
