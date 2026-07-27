package com.anythink.basead.exoplayer.c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f6887a;

    /* renamed from: b, reason: collision with root package name */
    public int f6888b;

    /* renamed from: c, reason: collision with root package name */
    public int f6889c;

    /* renamed from: d, reason: collision with root package name */
    public int f6890d;

    /* renamed from: e, reason: collision with root package name */
    public int f6891e;

    /* renamed from: f, reason: collision with root package name */
    public int f6892f;

    /* renamed from: g, reason: collision with root package name */
    public int f6893g;

    /* renamed from: h, reason: collision with root package name */
    public int f6894h;
    public int i;

    private synchronized void a() {
    }

    private void a(d dVar) {
        this.f6887a += dVar.f6887a;
        this.f6888b += dVar.f6888b;
        this.f6889c += dVar.f6889c;
        this.f6890d += dVar.f6890d;
        this.f6891e += dVar.f6891e;
        this.f6892f += dVar.f6892f;
        this.f6893g += dVar.f6893g;
        this.f6894h = Math.max(this.f6894h, dVar.f6894h);
        this.i += dVar.i;
    }
}
