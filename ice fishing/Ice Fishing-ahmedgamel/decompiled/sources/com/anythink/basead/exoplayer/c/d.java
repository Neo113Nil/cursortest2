package com.anythink.basead.exoplayer.c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f6730a;

    /* renamed from: b, reason: collision with root package name */
    public int f6731b;

    /* renamed from: c, reason: collision with root package name */
    public int f6732c;

    /* renamed from: d, reason: collision with root package name */
    public int f6733d;

    /* renamed from: e, reason: collision with root package name */
    public int f6734e;

    /* renamed from: f, reason: collision with root package name */
    public int f6735f;

    /* renamed from: g, reason: collision with root package name */
    public int f6736g;

    /* renamed from: h, reason: collision with root package name */
    public int f6737h;
    public int i;

    private synchronized void a() {
    }

    private void a(d dVar) {
        this.f6730a += dVar.f6730a;
        this.f6731b += dVar.f6731b;
        this.f6732c += dVar.f6732c;
        this.f6733d += dVar.f6733d;
        this.f6734e += dVar.f6734e;
        this.f6735f += dVar.f6735f;
        this.f6736g += dVar.f6736g;
        this.f6737h = Math.max(this.f6737h, dVar.f6737h);
        this.i += dVar.i;
    }
}
