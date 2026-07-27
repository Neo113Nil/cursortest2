package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Mf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1077Mf {
    public final long A00;
    public final long A01;

    public C1077Mf(long j9, long j10) {
        this.A01 = j9;
        this.A00 = j10;
    }

    public final boolean A00(long j9, long j10) {
        return this.A00 == -1 ? j9 >= this.A01 : j10 != -1 && this.A01 <= j9 && j9 + j10 <= this.A01 + this.A00;
    }

    public final boolean A01(long j9, long j10) {
        return this.A01 <= j9 ? this.A00 == -1 || this.A01 + this.A00 > j9 : j10 == -1 || j9 + j10 > this.A01;
    }
}
