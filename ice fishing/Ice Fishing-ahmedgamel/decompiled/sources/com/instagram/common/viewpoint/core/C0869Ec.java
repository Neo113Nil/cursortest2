package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0869Ec implements Comparable<C0869Ec> {
    public final boolean A00;
    public final boolean A01;

    public C0869Ec(C2400qI c2400qI, int i) {
        this.A00 = (c2400qI.A0H & 1) != 0;
        this.A01 = C07579h.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0869Ec c0869Ec) {
        return AbstractC2252ns.A01().A09(this.A01, c0869Ec.A01).A09(this.A00, c0869Ec.A00).A05();
    }
}
