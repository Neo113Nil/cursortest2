package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.ik, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3364ik {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f31114a;

    public C3364ik(Yt yt) {
        AtomicLong atomicLong = new AtomicLong();
        this.f31114a = atomicLong;
        atomicLong.set(((C3052cu) yt.f28753a.f31863u).f29639u.get());
    }

    public final void a(long j6) {
        this.f31114a.set(j6);
    }
}
