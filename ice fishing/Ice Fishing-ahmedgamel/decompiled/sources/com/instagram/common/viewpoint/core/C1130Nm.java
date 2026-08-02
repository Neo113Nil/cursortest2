package com.instagram.common.viewpoint.core;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.Nm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1130Nm implements Serializable {
    public static final long serialVersionUID = 351643298236575728L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C1130Nm(C1129Nl c1129Nl) {
        String str;
        this.A02 = c1129Nl.A02;
        this.A01 = c1129Nl.A01;
        this.A00 = c1129Nl.A00;
        str = c1129Nl.A03;
        this.A03 = str;
    }

    public final String A00() {
        return this.A00;
    }

    public final String A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }
}
