package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0960Gw {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public C0960Gw(long j6, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.A06 = j6;
        this.A07 = j9;
        this.A03 = j10;
        this.A01 = j11;
        this.A02 = j12;
        this.A00 = j13;
        this.A05 = j14;
        this.A04 = A05(j9, j10, j11, j12, j13, j14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00() {
        return this.A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A01() {
        return this.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A02() {
        return this.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A06;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A07;
    }

    public static long A05(long j6, long j9, long j10, long bytesToSkip, long confidenceInterval, long j11) {
        if (bytesToSkip + 1 >= confidenceInterval || j9 + 1 >= j10) {
            return bytesToSkip;
        }
        long j12 = (long) ((j6 - j9) * ((confidenceInterval - bytesToSkip) / (j10 - j9)));
        return C5C.A0T(((bytesToSkip + j12) - j11) - (j12 / 20), bytesToSkip, confidenceInterval - 1);
    }

    private void A0B() {
        this.A04 = A05(this.A07, this.A03, this.A01, this.A02, this.A00, this.A05);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(long j6, long j9) {
        this.A01 = j6;
        this.A00 = j9;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(long j6, long j9) {
        this.A03 = j6;
        this.A02 = j9;
        A0B();
    }
}
