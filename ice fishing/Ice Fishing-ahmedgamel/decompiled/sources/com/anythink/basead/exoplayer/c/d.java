package com.anythink.basead.exoplayer.c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f7516a;

    /* renamed from: b, reason: collision with root package name */
    public int f7517b;

    /* renamed from: c, reason: collision with root package name */
    public int f7518c;

    /* renamed from: d, reason: collision with root package name */
    public int f7519d;

    /* renamed from: e, reason: collision with root package name */
    public int f7520e;

    /* renamed from: f, reason: collision with root package name */
    public int f7521f;

    /* renamed from: g, reason: collision with root package name */
    public int f7522g;

    /* renamed from: h, reason: collision with root package name */
    public int f7523h;
    public int i;

    private synchronized void a() {
    }

    private void a(d dVar) {
        this.f7516a += dVar.f7516a;
        this.f7517b += dVar.f7517b;
        this.f7518c += dVar.f7518c;
        this.f7519d += dVar.f7519d;
        this.f7520e += dVar.f7520e;
        this.f7521f += dVar.f7521f;
        this.f7522g += dVar.f7522g;
        this.f7523h = Math.max(this.f7523h, dVar.f7523h);
        this.i += dVar.i;
    }
}
