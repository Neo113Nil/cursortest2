package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0889Ec implements Comparable<C0889Ec> {
    public final boolean A00;
    public final boolean A01;

    public C0889Ec(C2420qI c2420qI, int i) {
        this.A00 = (c2420qI.A0H & 1) != 0;
        this.A01 = C07779h.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0889Ec c0889Ec) {
        return AbstractC2272ns.A01().A09(this.A01, c0889Ec.A01).A09(this.A00, c0889Ec.A00).A05();
    }
}
