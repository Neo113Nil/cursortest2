package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* renamed from: com.google.android.gms.internal.ads.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3598n2 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f32664a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f32665b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final C3921t2 f32666c = new C3921t2(0);

    /* renamed from: d, reason: collision with root package name */
    public C3657o7 f32667d;

    /* renamed from: e, reason: collision with root package name */
    public int f32668e;

    /* renamed from: f, reason: collision with root package name */
    public int f32669f;

    /* renamed from: g, reason: collision with root package name */
    public long f32670g;

    public final long a(K0 k02, int i) {
        k02.z(this.f32664a, 0, i, false);
        long j6 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            j6 = (j6 << 8) | (r0[i6] & 255);
        }
        return j6;
    }
}
