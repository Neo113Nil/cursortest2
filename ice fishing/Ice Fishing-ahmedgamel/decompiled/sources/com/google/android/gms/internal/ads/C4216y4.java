package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4216y4 {

    /* renamed from: a, reason: collision with root package name */
    public final Dt f35872a;

    /* renamed from: b, reason: collision with root package name */
    public final Cr f35873b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35874c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35875d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35876e;

    /* renamed from: f, reason: collision with root package name */
    public long f35877f;

    /* renamed from: g, reason: collision with root package name */
    public long f35878g;

    /* renamed from: h, reason: collision with root package name */
    public long f35879h;

    public C4216y4(int i) {
        switch (i) {
            case 1:
                this.f35872a = new Dt();
                this.f35877f = com.anythink.basead.exoplayer.b.f7168b;
                this.f35878g = com.anythink.basead.exoplayer.b.f7168b;
                this.f35879h = com.anythink.basead.exoplayer.b.f7168b;
                this.f35873b = new Cr();
                break;
            default:
                this.f35872a = new Dt();
                this.f35877f = com.anythink.basead.exoplayer.b.f7168b;
                this.f35878g = com.anythink.basead.exoplayer.b.f7168b;
                this.f35879h = com.anythink.basead.exoplayer.b.f7168b;
                this.f35873b = new Cr();
                break;
        }
    }

    public static long a(Cr cr) {
        int i = cr.f24998b;
        if (cr.B() < 9) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        byte[] bArr = new byte[9];
        cr.H(bArr, 0, 9);
        cr.E(i);
        byte b9 = bArr[0];
        if ((b9 & 196) != 68) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        byte b10 = bArr[2];
        if ((b10 & 4) != 4) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        byte b11 = bArr[4];
        if ((b11 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        long j6 = b9;
        long j9 = b10;
        long j10 = (248 & j9) >> 3;
        long j11 = (j9 & 3) << 13;
        return j11 | ((bArr[1] & 255) << 20) | ((j6 & 3) << 28) | (((j6 & 56) >> 3) << 30) | (j10 << 15) | ((bArr[3] & 255) << 5) | ((b11 & 248) >> 3);
    }

    public static final int c(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public void b(K0 k02) {
        byte[] bArr = AbstractC3182eu.f30783b;
        int length = bArr.length;
        this.f35873b.z(0, bArr);
        this.f35874c = true;
        k02.f26573y = 0;
    }
}
