package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0907Fp extends AbstractC1188Qq<FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1375Yb A04;
    public InterfaceC1381Yh A05;
    public String A06;
    public List<C1678e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC2005jd A0A;
    public final C1246Sx A0B;
    public final C1840gi A0C;
    public final VA A0D;
    public final Y2 A0E;
    public final C0916Fy A0F;
    public final C1785fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C0907Fp(C1840gi c1840gi, List<C1678e5> list, AbstractC2005jd abstractC2005jd, VA va, C1246Sx c1246Sx, C1785fp c1785fp, Y2 y22, InterfaceC1381Yh interfaceC1381Yh, String str, int i, int i6, int i9, int i10, C0916Fy c0916Fy, AbstractC1375Yb abstractC1375Yb) {
        this.A0C = c1840gi;
        this.A0D = va;
        this.A0B = c1246Sx;
        this.A0G = c1785fp;
        this.A0E = y22;
        this.A05 = interfaceC1381Yh;
        this.A0A = abstractC2005jd;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i10;
        this.A06 = str;
        this.A01 = i9;
        this.A02 = i6;
        this.A0F = c0916Fy;
        this.A04 = abstractC1375Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1188Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FY A0F(ViewGroup viewGroup, int i) {
        return new FY(AbstractC1610cy.A00(new C1556c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1188Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FY fy, int i) {
        fy.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1188Qq
    public final int A0B() {
        return this.A07.size();
    }
}
