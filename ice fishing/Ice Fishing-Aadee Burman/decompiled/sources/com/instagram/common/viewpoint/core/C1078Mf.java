package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Mf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1078Mf {
    public final long A00;
    public final long A01;

    public C1078Mf(long j6, long j9) {
        this.A01 = j6;
        this.A00 = j9;
    }

    public final boolean A00(long j6, long j9) {
        return this.A00 == -1 ? j6 >= this.A01 : j9 != -1 && this.A01 <= j6 && j6 + j9 <= this.A01 + this.A00;
    }

    public final boolean A01(long j6, long j9) {
        return this.A01 <= j6 ? this.A00 == -1 || this.A01 + this.A00 > j6 : j9 == -1 || j6 + j9 > this.A01;
    }
}
