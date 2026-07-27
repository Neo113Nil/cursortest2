package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ov {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26780a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26781b;

    /* renamed from: c, reason: collision with root package name */
    public final S2.a f26782c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26783d;

    /* renamed from: e, reason: collision with root package name */
    public final double f26784e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26785f;

    public Ov(Object obj, S2.a aVar, double d2, int i) {
        if (aVar == null) {
            throw new IllegalArgumentException("Clock cannot be null.");
        }
        this.f26780a = obj;
        this.f26782c = aVar;
        this.f26781b = System.currentTimeMillis();
        this.f26783d = Math.min(Math.max(((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31660f0)).longValue() * 1000, 10000L), com.anythink.expressad.f.a.b.aD);
        this.f26784e = d2;
        this.f26785f = i;
    }

    public final long a() {
        this.f26782c.getClass();
        return this.f26783d - (System.currentTimeMillis() - this.f26781b);
    }
}
