package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4028v1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3974u1 f34625a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3543m1 f34626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34627c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34628d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34629e;

    /* renamed from: f, reason: collision with root package name */
    public int f34630f;

    /* renamed from: g, reason: collision with root package name */
    public int f34631g;

    /* renamed from: h, reason: collision with root package name */
    public int f34632h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f34633j;

    /* renamed from: k, reason: collision with root package name */
    public int f34634k;

    /* renamed from: l, reason: collision with root package name */
    public long f34635l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f34636m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f34637n;

    public C4028v1(int i, C3974u1 c3974u1, InterfaceC3543m1 interfaceC3543m1) {
        this.f34625a = c3974u1;
        int a9 = c3974u1.a();
        boolean z3 = true;
        if (a9 != 1) {
            if (a9 == 2) {
                a9 = 2;
            } else {
                z3 = false;
            }
        }
        AbstractC2772Sd.i(z3);
        int i6 = ((i / 10) + 48) | (((i % 10) + 48) << 8);
        this.f34627c = (a9 == 2 ? 1667497984 : 1651965952) | i6;
        long j6 = c3974u1.f34451c;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i9 = c3974u1.f34452d;
        this.f34629e = AbstractC3159eu.w(i9, c3974u1.f34450b * 1000000, j6, roundingMode);
        this.f34626b = interfaceC3543m1;
        this.f34628d = a9 == 2 ? 1650720768 | i6 : -1;
        this.f34635l = -1L;
        this.f34636m = new long[512];
        this.f34637n = new int[512];
        this.f34630f = i9;
    }

    public final C3060d1 a(long j6) {
        if (this.f34634k == 0) {
            C3167f1 c3167f1 = new C3167f1(0L, this.f34635l);
            return new C3060d1(c3167f1, c3167f1);
        }
        int i = (int) (j6 / ((this.f34629e * 1) / this.f34630f));
        int r9 = AbstractC3159eu.r(this.f34637n, i, true, true);
        if (this.f34637n[r9] == i) {
            C3167f1 b9 = b(r9);
            return new C3060d1(b9, b9);
        }
        C3167f1 b10 = b(r9);
        int i6 = r9 + 1;
        return i6 < this.f34636m.length ? new C3060d1(b10, b(i6)) : new C3060d1(b10, b10);
    }

    public final C3167f1 b(int i) {
        return new C3167f1(((this.f34629e * 1) / this.f34630f) * this.f34637n[i], this.f34636m[i]);
    }
}
