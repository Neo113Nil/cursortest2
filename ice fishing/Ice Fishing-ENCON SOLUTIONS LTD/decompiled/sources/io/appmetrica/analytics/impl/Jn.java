package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class Jn implements Gi {

    /* renamed from: a, reason: collision with root package name */
    public final int f4611a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4612b;

    /* renamed from: c, reason: collision with root package name */
    public int f4613c = 0;

    public Jn(int i2, int i3) {
        this.f4611a = i2;
        this.f4612b = i3;
    }

    public final int a() {
        return this.f4612b;
    }

    public final boolean b() {
        int i2 = this.f4613c;
        this.f4613c = i2 + 1;
        return i2 < this.f4611a;
    }

    public final void c() {
        this.f4613c = 0;
    }
}
