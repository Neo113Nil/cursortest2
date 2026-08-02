package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Mv {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27155a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27156b;

    /* renamed from: c, reason: collision with root package name */
    public final V2.a f27157c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27158d;

    /* renamed from: e, reason: collision with root package name */
    public final double f27159e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27160f;

    public Mv(Object obj, V2.a aVar, double d9, int i) {
        if (aVar == null) {
            throw new IllegalArgumentException("Clock cannot be null.");
        }
        this.f27155a = obj;
        this.f27157c = aVar;
        this.f27156b = System.currentTimeMillis();
        this.f27158d = Math.min(Math.max(((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33022f0)).longValue() * 1000, 10000L), com.anythink.expressad.f.a.b.aD);
        this.f27159e = d9;
        this.f27160f = i;
    }

    public final long a() {
        this.f27157c.getClass();
        return this.f27158d - (System.currentTimeMillis() - this.f27156b);
    }
}
