package com.anythink.expressad.foundation.g.f;

/* loaded from: classes.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    private int f20019a;

    /* renamed from: b, reason: collision with root package name */
    private int f20020b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20021c;

    /* renamed from: d, reason: collision with root package name */
    private int f20022d;

    /* renamed from: e, reason: collision with root package name */
    private int f20023e;

    /* renamed from: f, reason: collision with root package name */
    private int f20024f;

    /* renamed from: g, reason: collision with root package name */
    private int f20025g;

    /* renamed from: h, reason: collision with root package name */
    private int f20026h;

    public b() {
        this((byte) 0);
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int a() {
        return this.f20021c;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int b() {
        return this.f20019a;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int c() {
        return this.f20020b;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final boolean d() {
        int i = this.f20020b + 1;
        this.f20020b = i;
        return i <= this.f20021c;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int e() {
        return this.f20023e;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int f() {
        return this.f20024f;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int g() {
        return this.f20025g;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int h() {
        return this.f20026h;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int i() {
        return this.f20022d;
    }

    private b(byte b9) {
        this.f20022d = 2;
        this.f20023e = 0;
        this.f20024f = 0;
        this.f20025g = 0;
        this.f20026h = 0;
        this.f20019a = 30000;
        this.f20021c = 0;
    }

    private b(int i, int i4, int i6, int i9, int i10, int i11) {
        this.f20022d = 2;
        this.f20023e = 0;
        this.f20024f = 0;
        this.f20025g = 0;
        this.f20026h = 0;
        this.f20023e = Math.max(i, 0);
        this.f20024f = Math.max(i4, 0);
        this.f20025g = Math.max(i6, 0);
        this.f20026h = Math.max(i9, 0);
        this.f20021c = Math.max(i10, 0);
        this.f20022d = i11;
    }

    public b(char c9) {
        this.f20022d = 2;
        this.f20023e = 0;
        this.f20024f = 0;
        this.f20025g = 0;
        this.f20026h = 0;
        this.f20023e = Math.max(5000, 0);
        this.f20024f = Math.max(5000, 0);
        this.f20025g = Math.max(5000, 0);
        this.f20026h = Math.max(6000, 0);
        this.f20021c = Math.max(0, 0);
    }
}
