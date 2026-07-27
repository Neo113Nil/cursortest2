package com.anythink.expressad.b;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    protected static final int f18359b = 1;

    /* renamed from: c, reason: collision with root package name */
    protected static final int f18360c = 2;

    /* renamed from: d, reason: collision with root package name */
    protected static final int f18361d = 4;

    /* renamed from: e, reason: collision with root package name */
    protected static final int f18362e = 8;

    /* renamed from: f, reason: collision with root package name */
    protected static final int f18363f = 16;

    /* renamed from: g, reason: collision with root package name */
    protected static final int f18364g = 32;

    /* renamed from: a, reason: collision with root package name */
    private int f18365a = 1;

    /* renamed from: h, reason: collision with root package name */
    protected e f18366h;

    private int a() {
        return this.f18365a;
    }

    private boolean c() {
        int i = this.f18365a;
        return i == 8 || i == 16;
    }

    private boolean d() {
        return this.f18365a == 2;
    }

    private boolean e() {
        return this.f18365a == 32;
    }

    private boolean f() {
        return this.f18365a == 4;
    }

    public void b() {
        this.f18365a = 8;
    }

    private void a(int i) {
        this.f18365a = i;
    }

    private void a(e eVar) {
        this.f18366h = eVar;
    }
}
