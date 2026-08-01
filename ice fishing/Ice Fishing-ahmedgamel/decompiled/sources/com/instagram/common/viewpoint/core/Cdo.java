package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C1110Nm A07;
    public final C1840gi A08;
    public C1098Na A01 = C1098Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C1840gi c1840gi, NY ny, C1110Nm c1110Nm) {
        this.A08 = c1840gi;
        this.A06 = ny;
        this.A07 = c1110Nm;
    }

    public final Cdo A09(int i) {
        this.A00 = i;
        return this;
    }

    public final Cdo A0A(C1098Na c1098Na) {
        this.A01 = c1098Na;
        return this;
    }

    public final Cdo A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final Cdo A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final Cdo A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final Cdo A0E(boolean z3) {
        this.A05 = z3;
        return this;
    }

    public final C1663dq A0F() {
        return new C1663dq(this, null);
    }
}
