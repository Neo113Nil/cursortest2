package com.anythink.expressad.b;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    protected static final int f18201b = 1;

    /* renamed from: c, reason: collision with root package name */
    protected static final int f18202c = 2;

    /* renamed from: d, reason: collision with root package name */
    protected static final int f18203d = 4;

    /* renamed from: e, reason: collision with root package name */
    protected static final int f18204e = 8;

    /* renamed from: f, reason: collision with root package name */
    protected static final int f18205f = 16;

    /* renamed from: g, reason: collision with root package name */
    protected static final int f18206g = 32;

    /* renamed from: a, reason: collision with root package name */
    private int f18207a = 1;

    /* renamed from: h, reason: collision with root package name */
    protected e f18208h;

    private int a() {
        return this.f18207a;
    }

    private boolean c() {
        int i = this.f18207a;
        return i == 8 || i == 16;
    }

    private boolean d() {
        return this.f18207a == 2;
    }

    private boolean e() {
        return this.f18207a == 32;
    }

    private boolean f() {
        return this.f18207a == 4;
    }

    public void b() {
        this.f18207a = 8;
    }

    private void a(int i) {
        this.f18207a = i;
    }

    private void a(e eVar) {
        this.f18208h = eVar;
    }
}
