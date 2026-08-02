package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* renamed from: com.google.android.gms.internal.ads.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3621n2 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f33442a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f33443b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final C3944t2 f33444c = new C3944t2(0);

    /* renamed from: d, reason: collision with root package name */
    public C3680o7 f33445d;

    /* renamed from: e, reason: collision with root package name */
    public int f33446e;

    /* renamed from: f, reason: collision with root package name */
    public int f33447f;

    /* renamed from: g, reason: collision with root package name */
    public long f33448g;

    public final long a(K0 k02, int i) {
        k02.A(this.f33442a, 0, i, false);
        long j6 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            j6 = (j6 << 8) | (r0[i4] & 255);
        }
        return j6;
    }
}
