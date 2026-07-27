package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* renamed from: com.google.android.gms.internal.ads.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3503l2 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f32518a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f32519b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final C3826r2 f32520c = new C3826r2(0);

    /* renamed from: d, reason: collision with root package name */
    public C3562m7 f32521d;

    /* renamed from: e, reason: collision with root package name */
    public int f32522e;

    /* renamed from: f, reason: collision with root package name */
    public int f32523f;

    /* renamed from: g, reason: collision with root package name */
    public long f32524g;

    public final long a(J0 j02, int i) {
        j02.E(this.f32518a, 0, i, false);
        long j9 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            j9 = (j9 << 8) | (r0[i4] & 255);
        }
        return j9;
    }
}
