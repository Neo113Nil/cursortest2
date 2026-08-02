package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.j.t;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public abstract class c implements t.c {

    /* renamed from: b, reason: collision with root package name */
    public final k f8312b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8313c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final m f8314d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8315e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8316f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8317g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8318h;
    protected final com.anythink.basead.exoplayer.j.h i;

    public c(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j6, long j9) {
        this.i = (com.anythink.basead.exoplayer.j.h) com.anythink.basead.exoplayer.k.a.a(hVar);
        this.f8312b = (k) com.anythink.basead.exoplayer.k.a.a(kVar);
        this.f8314d = mVar;
        this.f8315e = i;
        this.f8316f = obj;
        this.f8317g = j6;
        this.f8318h = j9;
    }

    private long c() {
        return this.f8318h - this.f8317g;
    }

    public abstract long d();
}
