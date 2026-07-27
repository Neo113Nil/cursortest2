package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0906Fp extends AbstractC1187Qq<FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1374Yb A04;
    public InterfaceC1380Yh A05;
    public String A06;
    public List<C1677e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC2004jd A0A;
    public final C1245Sx A0B;
    public final C1839gi A0C;
    public final VA A0D;
    public final Y2 A0E;
    public final C0915Fy A0F;
    public final C1784fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C0906Fp(C1839gi c1839gi, List<C1677e5> list, AbstractC2004jd abstractC2004jd, VA va, C1245Sx c1245Sx, C1784fp c1784fp, Y2 y22, InterfaceC1380Yh interfaceC1380Yh, String str, int i, int i4, int i9, int i10, C0915Fy c0915Fy, AbstractC1374Yb abstractC1374Yb) {
        this.A0C = c1839gi;
        this.A0D = va;
        this.A0B = c1245Sx;
        this.A0G = c1784fp;
        this.A0E = y22;
        this.A05 = interfaceC1380Yh;
        this.A0A = abstractC2004jd;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i10;
        this.A06 = str;
        this.A01 = i9;
        this.A02 = i4;
        this.A0F = c0915Fy;
        this.A04 = abstractC1374Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1187Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FY A0F(ViewGroup viewGroup, int i) {
        return new FY(AbstractC1609cy.A00(new C1555c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1187Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FY fy, int i) {
        fy.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1187Qq
    public final int A0B() {
        return this.A07.size();
    }
}
