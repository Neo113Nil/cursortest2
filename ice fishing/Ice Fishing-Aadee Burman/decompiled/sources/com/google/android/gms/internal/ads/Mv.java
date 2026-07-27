package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Mv {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26370a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26371b;

    /* renamed from: c, reason: collision with root package name */
    public final T2.a f26372c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26373d;

    /* renamed from: e, reason: collision with root package name */
    public final double f26374e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26375f;

    public Mv(Object obj, T2.a aVar, double d2, int i) {
        if (aVar == null) {
            throw new IllegalArgumentException("Clock cannot be null.");
        }
        this.f26370a = obj;
        this.f26372c = aVar;
        this.f26371b = System.currentTimeMillis();
        this.f26373d = Math.min(Math.max(((Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32242f0)).longValue() * 1000, 10000L), com.anythink.expressad.f.a.b.aD);
        this.f26374e = d2;
        this.f26375f = i;
    }

    public final long a() {
        this.f26372c.getClass();
        return this.f26373d - (System.currentTimeMillis() - this.f26371b);
    }
}
