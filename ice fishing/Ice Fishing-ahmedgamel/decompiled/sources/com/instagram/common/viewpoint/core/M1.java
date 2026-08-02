package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class M1 extends AbstractC1208Qq<C0928Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1401Yh A03;
    public C1805fp A04;
    public String A05;
    public List<C1698e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC2025jd A08;
    public final C1266Sx A09;
    public final C1860gi A0A;
    public final VA A0B;
    public final UK A0C;
    public final Y2 A0D;
    public final C6X A0E;
    public final DZ A0F;

    public M1(C1860gi c1860gi, List<C1698e5> list, AbstractC2025jd abstractC2025jd, VA va, UK uk, InterfaceC1401Yh interfaceC1401Yh, String str, C6X c6x, DZ dz) {
        this.A0A = c1860gi;
        this.A0B = va;
        this.A0C = uk;
        this.A09 = uk.A14();
        this.A04 = uk.A1G();
        this.A0D = uk.A1E();
        this.A03 = interfaceC1401Yh;
        this.A08 = abstractC2025jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c6x;
        this.A0F = dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1208Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0928Fq A0F(ViewGroup viewGroup, int i) {
        return new C0928Fq(AbstractC1540bW.A00(new C1576c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1208Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C0928Fq c0928Fq, int i) {
        C1698e5 c1698e5 = this.A06.get(i);
        c0928Fq.A0q(this.A04);
        c0928Fq.A0p(c1698e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1208Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i, int i4, int i6) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i4;
        this.A01 = i6;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C1805fp c1805fp) {
        this.A04 = c1805fp;
    }
}
