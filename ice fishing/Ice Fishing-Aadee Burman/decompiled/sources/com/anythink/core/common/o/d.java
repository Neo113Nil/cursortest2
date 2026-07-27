package com.anythink.core.common.o;

import D.y;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    protected int f15952a;

    /* renamed from: b, reason: collision with root package name */
    protected int f15953b;

    /* renamed from: c, reason: collision with root package name */
    protected int f15954c;

    /* renamed from: d, reason: collision with root package name */
    protected int f15955d;

    /* renamed from: e, reason: collision with root package name */
    protected int f15956e;

    /* renamed from: f, reason: collision with root package name */
    protected long f15957f;

    /* renamed from: g, reason: collision with root package name */
    protected long f15958g;

    /* renamed from: h, reason: collision with root package name */
    protected int f15959h;

    public final int a() {
        return this.f15952a;
    }

    public final int b() {
        return this.f15953b;
    }

    public final int c() {
        return this.f15954c;
    }

    public final int d() {
        return this.f15955d;
    }

    public final int e() {
        return this.f15956e;
    }

    public final long f() {
        return this.f15957f;
    }

    public final long g() {
        return this.f15958g;
    }

    public final int h() {
        return this.f15959h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformaceEntry{totalMemory=");
        sb.append(this.f15952a);
        sb.append(", phoneVailMemory=");
        sb.append(this.f15953b);
        sb.append(", appJavaMemory=");
        sb.append(this.f15954c);
        sb.append(", appMaxJavaMemory=");
        sb.append(this.f15955d);
        sb.append(", cpuNum=");
        sb.append(this.f15956e);
        sb.append(", totalStorage=");
        sb.append(this.f15957f);
        sb.append(", lastStorage=");
        sb.append(this.f15958g);
        sb.append(", cpuRate=");
        return y.q(sb, this.f15959h, '}');
    }

    private void a(int i) {
        this.f15952a = i;
    }

    private void b(int i) {
        this.f15953b = i;
    }

    private void c(int i) {
        this.f15954c = i;
    }

    private void d(int i) {
        this.f15955d = i;
    }

    private void e(int i) {
        this.f15956e = i;
    }

    private void f(int i) {
        this.f15959h = i;
    }

    private void a(long j6) {
        this.f15957f = j6;
    }

    private void b(long j6) {
        this.f15958g = j6;
    }
}
