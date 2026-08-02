package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0927Fp extends AbstractC1208Qq<FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1395Yb A04;
    public InterfaceC1401Yh A05;
    public String A06;
    public List<C1698e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC2025jd A0A;
    public final C1266Sx A0B;
    public final C1860gi A0C;
    public final VA A0D;
    public final Y2 A0E;
    public final C0936Fy A0F;
    public final C1805fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C0927Fp(C1860gi c1860gi, List<C1698e5> list, AbstractC2025jd abstractC2025jd, VA va, C1266Sx c1266Sx, C1805fp c1805fp, Y2 y22, InterfaceC1401Yh interfaceC1401Yh, String str, int i, int i4, int i6, int i9, C0936Fy c0936Fy, AbstractC1395Yb abstractC1395Yb) {
        this.A0C = c1860gi;
        this.A0D = va;
        this.A0B = c1266Sx;
        this.A0G = c1805fp;
        this.A0E = y22;
        this.A05 = interfaceC1401Yh;
        this.A0A = abstractC2025jd;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i9;
        this.A06 = str;
        this.A01 = i6;
        this.A02 = i4;
        this.A0F = c0936Fy;
        this.A04 = abstractC1395Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1208Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FY A0F(ViewGroup viewGroup, int i) {
        return new FY(AbstractC1630cy.A00(new C1576c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1208Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FY fy, int i) {
        fy.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1208Qq
    public final int A0B() {
        return this.A07.size();
    }
}
