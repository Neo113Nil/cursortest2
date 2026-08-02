package com.instagram.common.viewpoint.core;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1815fz {
    public C1819g3 A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C1815fz A00(C1819g3 c1819g3) {
        this.A00 = c1819g3;
        return this;
    }

    public final C1815fz A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C1815fz A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C1815fz A03(boolean z6) {
        this.A04 = z6;
        return this;
    }

    public final C1815fz A04(boolean z6) {
        this.A03 = z6;
        return this;
    }

    public final C1816g0 A05() {
        return new C1816g0(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
