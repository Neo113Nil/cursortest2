package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.ms, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3587ms {

    /* renamed from: a, reason: collision with root package name */
    public final N3.a f32619a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32620b;

    /* renamed from: c, reason: collision with root package name */
    public final T2.a f32621c;

    public C3587ms(N3.a aVar, long j6, T2.a aVar2) {
        this.f32619a = aVar;
        this.f32621c = aVar2;
        aVar2.getClass();
        this.f32620b = SystemClock.elapsedRealtime() + j6;
    }
}
