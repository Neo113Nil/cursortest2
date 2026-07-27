package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.j.t;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public abstract class c implements t.c {

    /* renamed from: b, reason: collision with root package name */
    public final k f7526b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7527c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final m f7528d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7529e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7530f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7531g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7532h;
    protected final com.anythink.basead.exoplayer.j.h i;

    public c(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j6, long j9) {
        this.i = (com.anythink.basead.exoplayer.j.h) com.anythink.basead.exoplayer.k.a.a(hVar);
        this.f7526b = (k) com.anythink.basead.exoplayer.k.a.a(kVar);
        this.f7528d = mVar;
        this.f7529e = i;
        this.f7530f = obj;
        this.f7531g = j6;
        this.f7532h = j9;
    }

    private long c() {
        return this.f7532h - this.f7531g;
    }

    public abstract long d();
}
