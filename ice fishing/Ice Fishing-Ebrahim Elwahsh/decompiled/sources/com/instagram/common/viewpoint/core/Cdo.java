package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C1109Nm A07;
    public final C1839gi A08;
    public C1097Na A01 = C1097Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C1839gi c1839gi, NY ny, C1109Nm c1109Nm) {
        this.A08 = c1839gi;
        this.A06 = ny;
        this.A07 = c1109Nm;
    }

    public final Cdo A09(int i) {
        this.A00 = i;
        return this;
    }

    public final Cdo A0A(C1097Na c1097Na) {
        this.A01 = c1097Na;
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

    public final Cdo A0E(boolean z8) {
        this.A05 = z8;
        return this;
    }

    public final C1662dq A0F() {
        return new C1662dq(this, null);
    }
}
