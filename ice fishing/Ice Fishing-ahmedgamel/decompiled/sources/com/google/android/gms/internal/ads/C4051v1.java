package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4051v1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3997u1 f35388a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3566m1 f35389b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35390c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35391d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35392e;

    /* renamed from: f, reason: collision with root package name */
    public int f35393f;

    /* renamed from: g, reason: collision with root package name */
    public int f35394g;

    /* renamed from: h, reason: collision with root package name */
    public int f35395h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f35396j;

    /* renamed from: k, reason: collision with root package name */
    public int f35397k;

    /* renamed from: l, reason: collision with root package name */
    public long f35398l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f35399m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f35400n;

    public C4051v1(int i, C3997u1 c3997u1, InterfaceC3566m1 interfaceC3566m1) {
        this.f35388a = c3997u1;
        int a9 = c3997u1.a();
        boolean z6 = true;
        if (a9 != 1) {
            if (a9 == 2) {
                a9 = 2;
            } else {
                z6 = false;
            }
        }
        AbstractC2792Sd.i(z6);
        int i4 = ((i / 10) + 48) | (((i % 10) + 48) << 8);
        this.f35390c = (a9 == 2 ? 1667497984 : 1651965952) | i4;
        long j6 = c3997u1.f35225c;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i6 = c3997u1.f35226d;
        this.f35392e = AbstractC3182eu.w(i6, c3997u1.f35224b * 1000000, j6, roundingMode);
        this.f35389b = interfaceC3566m1;
        this.f35391d = a9 == 2 ? 1650720768 | i4 : -1;
        this.f35398l = -1L;
        this.f35399m = new long[512];
        this.f35400n = new int[512];
        this.f35393f = i6;
    }

    public final C3083d1 a(long j6) {
        if (this.f35397k == 0) {
            C3190f1 c3190f1 = new C3190f1(0L, this.f35398l);
            return new C3083d1(c3190f1, c3190f1);
        }
        int i = (int) (j6 / ((this.f35392e * 1) / this.f35393f));
        int r9 = AbstractC3182eu.r(this.f35400n, i, true, true);
        if (this.f35400n[r9] == i) {
            C3190f1 b9 = b(r9);
            return new C3083d1(b9, b9);
        }
        C3190f1 b10 = b(r9);
        int i4 = r9 + 1;
        return i4 < this.f35399m.length ? new C3083d1(b10, b(i4)) : new C3083d1(b10, b10);
    }

    public final C3190f1 b(int i) {
        return new C3190f1(((this.f35392e * 1) / this.f35393f) * this.f35400n[i], this.f35399m[i]);
    }
}
