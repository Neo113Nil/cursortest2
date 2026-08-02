package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29090b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29091c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29092d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29093e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29094f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29095g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29096h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f29097j;

    /* renamed from: k, reason: collision with root package name */
    public final S0.s f29098k;

    /* renamed from: l, reason: collision with root package name */
    public final O3 f29099l;

    public W0(int i, int i4, int i6, int i9, int i10, int i11, int i12, long j6, S0.s sVar, O3 o32) {
        this.f29089a = i;
        this.f29090b = i4;
        this.f29091c = i6;
        this.f29092d = i9;
        this.f29093e = i10;
        this.f29094f = c(i10);
        this.f29095g = i11;
        this.f29096h = i12;
        this.i = d(i12);
        this.f29097j = j6;
        this.f29098k = sVar;
        this.f29099l = o32;
    }

    public static int c(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int d(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long a() {
        long j6 = this.f29097j;
        return j6 == 0 ? com.anythink.basead.exoplayer.b.f7168b : (j6 * 1000000) / this.f29093e;
    }

    public final DP b(byte[] bArr, O3 o32) {
        bArr[4] = com.anythink.core.common.s.a.c.f17103a;
        O3 o33 = this.f29099l;
        if (o33 != null) {
            o32 = o33.b(o32);
        }
        C3322hP c3322hP = new C3322hP();
        c3322hP.e(com.anythink.basead.exoplayer.k.o.f9215K);
        int i = this.f29092d;
        if (i <= 0) {
            i = -1;
        }
        c3322hP.f31559o = i;
        c3322hP.f31538G = this.f29095g;
        c3322hP.f31540I = this.f29093e;
        c3322hP.J = AbstractC3182eu.b(this.f29096h, ByteOrder.LITTLE_ENDIAN);
        c3322hP.f31561q = Collections.singletonList(bArr);
        c3322hP.f31555k = o32;
        return new DP(c3322hP);
    }

    public W0(byte[] bArr, int i) {
        C4256yr c4256yr = new C4256yr(bArr, bArr.length);
        c4256yr.d(i * 8);
        this.f29089a = c4256yr.h(16);
        this.f29090b = c4256yr.h(16);
        this.f29091c = c4256yr.h(24);
        this.f29092d = c4256yr.h(24);
        int h3 = c4256yr.h(20);
        this.f29093e = h3;
        this.f29094f = c(h3);
        this.f29095g = c4256yr.h(3) + 1;
        int h9 = c4256yr.h(5) + 1;
        this.f29096h = h9;
        this.i = d(h9);
        this.f29097j = c4256yr.i(36);
        this.f29098k = null;
        this.f29099l = null;
    }
}
