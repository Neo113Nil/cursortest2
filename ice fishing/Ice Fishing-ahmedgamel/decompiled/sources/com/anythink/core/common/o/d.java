package com.anythink.core.common.o;

import D.x;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    protected int f16739a;

    /* renamed from: b, reason: collision with root package name */
    protected int f16740b;

    /* renamed from: c, reason: collision with root package name */
    protected int f16741c;

    /* renamed from: d, reason: collision with root package name */
    protected int f16742d;

    /* renamed from: e, reason: collision with root package name */
    protected int f16743e;

    /* renamed from: f, reason: collision with root package name */
    protected long f16744f;

    /* renamed from: g, reason: collision with root package name */
    protected long f16745g;

    /* renamed from: h, reason: collision with root package name */
    protected int f16746h;

    public final int a() {
        return this.f16739a;
    }

    public final int b() {
        return this.f16740b;
    }

    public final int c() {
        return this.f16741c;
    }

    public final int d() {
        return this.f16742d;
    }

    public final int e() {
        return this.f16743e;
    }

    public final long f() {
        return this.f16744f;
    }

    public final long g() {
        return this.f16745g;
    }

    public final int h() {
        return this.f16746h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformaceEntry{totalMemory=");
        sb.append(this.f16739a);
        sb.append(", phoneVailMemory=");
        sb.append(this.f16740b);
        sb.append(", appJavaMemory=");
        sb.append(this.f16741c);
        sb.append(", appMaxJavaMemory=");
        sb.append(this.f16742d);
        sb.append(", cpuNum=");
        sb.append(this.f16743e);
        sb.append(", totalStorage=");
        sb.append(this.f16744f);
        sb.append(", lastStorage=");
        sb.append(this.f16745g);
        sb.append(", cpuRate=");
        return x.n(sb, this.f16746h, '}');
    }

    private void a(int i) {
        this.f16739a = i;
    }

    private void b(int i) {
        this.f16740b = i;
    }

    private void c(int i) {
        this.f16741c = i;
    }

    private void d(int i) {
        this.f16742d = i;
    }

    private void e(int i) {
        this.f16743e = i;
    }

    private void f(int i) {
        this.f16746h = i;
    }

    private void a(long j6) {
        this.f16744f = j6;
    }

    private void b(long j6) {
        this.f16745g = j6;
    }
}
