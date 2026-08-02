package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C1130Nm A07;
    public final C1860gi A08;
    public C1118Na A01 = C1118Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C1860gi c1860gi, NY ny, C1130Nm c1130Nm) {
        this.A08 = c1860gi;
        this.A06 = ny;
        this.A07 = c1130Nm;
    }

    public final Cdo A09(int i) {
        this.A00 = i;
        return this;
    }

    public final Cdo A0A(C1118Na c1118Na) {
        this.A01 = c1118Na;
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

    public final Cdo A0E(boolean z6) {
        this.A05 = z6;
        return this;
    }

    public final C1683dq A0F() {
        return new C1683dq(this, null);
    }
}
