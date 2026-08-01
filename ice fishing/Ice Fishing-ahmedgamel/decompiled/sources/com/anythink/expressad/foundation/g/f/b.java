package com.anythink.expressad.foundation.g.f;

/* loaded from: classes.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    private int f19232a;

    /* renamed from: b, reason: collision with root package name */
    private int f19233b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19234c;

    /* renamed from: d, reason: collision with root package name */
    private int f19235d;

    /* renamed from: e, reason: collision with root package name */
    private int f19236e;

    /* renamed from: f, reason: collision with root package name */
    private int f19237f;

    /* renamed from: g, reason: collision with root package name */
    private int f19238g;

    /* renamed from: h, reason: collision with root package name */
    private int f19239h;

    public b() {
        this((byte) 0);
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int a() {
        return this.f19234c;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int b() {
        return this.f19232a;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int c() {
        return this.f19233b;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final boolean d() {
        int i = this.f19233b + 1;
        this.f19233b = i;
        return i <= this.f19234c;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int e() {
        return this.f19236e;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int f() {
        return this.f19237f;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int g() {
        return this.f19238g;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int h() {
        return this.f19239h;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int i() {
        return this.f19235d;
    }

    private b(byte b9) {
        this.f19235d = 2;
        this.f19236e = 0;
        this.f19237f = 0;
        this.f19238g = 0;
        this.f19239h = 0;
        this.f19232a = 30000;
        this.f19234c = 0;
    }

    private b(int i, int i6, int i9, int i10, int i11, int i12) {
        this.f19235d = 2;
        this.f19236e = 0;
        this.f19237f = 0;
        this.f19238g = 0;
        this.f19239h = 0;
        this.f19236e = Math.max(i, 0);
        this.f19237f = Math.max(i6, 0);
        this.f19238g = Math.max(i9, 0);
        this.f19239h = Math.max(i10, 0);
        this.f19234c = Math.max(i11, 0);
        this.f19235d = i12;
    }

    public b(char c9) {
        this.f19235d = 2;
        this.f19236e = 0;
        this.f19237f = 0;
        this.f19238g = 0;
        this.f19239h = 0;
        this.f19236e = Math.max(5000, 0);
        this.f19237f = Math.max(5000, 0);
        this.f19238g = Math.max(5000, 0);
        this.f19239h = Math.max(6000, 0);
        this.f19234c = Math.max(0, 0);
    }
}
