package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.ik, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3387ik {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f31884a;

    public C3387ik(Yt yt) {
        AtomicLong atomicLong = new AtomicLong();
        this.f31884a = atomicLong;
        atomicLong.set(((C3075cu) yt.f29532a.f32643u).f30409u.get());
    }

    public final void a(long j6) {
        this.f31884a.set(j6);
    }
}
