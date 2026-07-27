package com.anythink.core.common.o;

import D.y;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    protected int f16110a;

    /* renamed from: b, reason: collision with root package name */
    protected int f16111b;

    /* renamed from: c, reason: collision with root package name */
    protected int f16112c;

    /* renamed from: d, reason: collision with root package name */
    protected int f16113d;

    /* renamed from: e, reason: collision with root package name */
    protected int f16114e;

    /* renamed from: f, reason: collision with root package name */
    protected long f16115f;

    /* renamed from: g, reason: collision with root package name */
    protected long f16116g;

    /* renamed from: h, reason: collision with root package name */
    protected int f16117h;

    public final int a() {
        return this.f16110a;
    }

    public final int b() {
        return this.f16111b;
    }

    public final int c() {
        return this.f16112c;
    }

    public final int d() {
        return this.f16113d;
    }

    public final int e() {
        return this.f16114e;
    }

    public final long f() {
        return this.f16115f;
    }

    public final long g() {
        return this.f16116g;
    }

    public final int h() {
        return this.f16117h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformaceEntry{totalMemory=");
        sb.append(this.f16110a);
        sb.append(", phoneVailMemory=");
        sb.append(this.f16111b);
        sb.append(", appJavaMemory=");
        sb.append(this.f16112c);
        sb.append(", appMaxJavaMemory=");
        sb.append(this.f16113d);
        sb.append(", cpuNum=");
        sb.append(this.f16114e);
        sb.append(", totalStorage=");
        sb.append(this.f16115f);
        sb.append(", lastStorage=");
        sb.append(this.f16116g);
        sb.append(", cpuRate=");
        return y.m(sb, this.f16117h, '}');
    }

    private void a(int i) {
        this.f16110a = i;
    }

    private void b(int i) {
        this.f16111b = i;
    }

    private void c(int i) {
        this.f16112c = i;
    }

    private void d(int i) {
        this.f16113d = i;
    }

    private void e(int i) {
        this.f16114e = i;
    }

    private void f(int i) {
        this.f16117h = i;
    }

    private void a(long j9) {
        this.f16115f = j9;
    }

    private void b(long j9) {
        this.f16116g = j9;
    }
}
