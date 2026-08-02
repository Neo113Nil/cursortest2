package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;

/* renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0822Bk {
    public final C6 A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final DownloadRequest A07;

    public C0822Bk(DownloadRequest downloadRequest, int i, long j6, long j9, long j10, int i4, int i6) {
        this(downloadRequest, i, j6, j9, j10, i4, i6, new C6());
    }

    public C0822Bk(DownloadRequest downloadRequest, int i, long j6, long j9, long j10, int i4, int i6, C6 c62) {
        AbstractC06443y.A01(c62);
        AbstractC06443y.A07((i6 == 0) == (i != 4));
        if (i4 != 0) {
            AbstractC06443y.A07((i == 2 || i == 0) ? false : true);
        }
        this.A07 = downloadRequest;
        this.A02 = i;
        this.A05 = j6;
        this.A06 = j9;
        this.A04 = j10;
        this.A03 = i4;
        this.A01 = i6;
        this.A00 = c62;
    }

    public final float A00() {
        return this.A00.A00;
    }

    public final long A01() {
        return this.A00.A01;
    }

    public final boolean A02() {
        return this.A02 == 3 || this.A02 == 4;
    }
}
