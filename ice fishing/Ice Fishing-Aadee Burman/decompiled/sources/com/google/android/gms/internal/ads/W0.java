package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f28291a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28292b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28293c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28294d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28295e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28296f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28297g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28298h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f28299j;

    /* renamed from: k, reason: collision with root package name */
    public final S0.s f28300k;

    /* renamed from: l, reason: collision with root package name */
    public final O3 f28301l;

    public W0(int i, int i6, int i9, int i10, int i11, int i12, int i13, long j6, S0.s sVar, O3 o32) {
        this.f28291a = i;
        this.f28292b = i6;
        this.f28293c = i9;
        this.f28294d = i10;
        this.f28295e = i11;
        this.f28296f = c(i11);
        this.f28297g = i12;
        this.f28298h = i13;
        this.i = d(i13);
        this.f28299j = j6;
        this.f28300k = sVar;
        this.f28301l = o32;
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
        long j6 = this.f28299j;
        return j6 == 0 ? com.anythink.basead.exoplayer.b.f6382b : (j6 * 1000000) / this.f28295e;
    }

    public final DP b(byte[] bArr, O3 o32) {
        bArr[4] = com.anythink.core.common.s.a.c.f16316a;
        O3 o33 = this.f28301l;
        if (o33 != null) {
            o32 = o33.b(o32);
        }
        C3299hP c3299hP = new C3299hP();
        c3299hP.e(com.anythink.basead.exoplayer.k.o.f8429K);
        int i = this.f28294d;
        if (i <= 0) {
            i = -1;
        }
        c3299hP.f30793o = i;
        c3299hP.f30772G = this.f28297g;
        c3299hP.f30774I = this.f28295e;
        c3299hP.J = AbstractC3159eu.b(this.f28298h, ByteOrder.LITTLE_ENDIAN);
        c3299hP.f30795q = Collections.singletonList(bArr);
        c3299hP.f30789k = o32;
        return new DP(c3299hP);
    }

    public W0(byte[] bArr, int i) {
        C4233yr c4233yr = new C4233yr(bArr, bArr.length);
        c4233yr.d(i * 8);
        this.f28291a = c4233yr.h(16);
        this.f28292b = c4233yr.h(16);
        this.f28293c = c4233yr.h(24);
        this.f28294d = c4233yr.h(24);
        int h9 = c4233yr.h(20);
        this.f28295e = h9;
        this.f28296f = c(h9);
        this.f28297g = c4233yr.h(3) + 1;
        int h10 = c4233yr.h(5) + 1;
        this.f28298h = h10;
        this.i = d(h10);
        this.f28299j = c4233yr.i(36);
        this.f28300k = null;
        this.f28301l = null;
    }
}
