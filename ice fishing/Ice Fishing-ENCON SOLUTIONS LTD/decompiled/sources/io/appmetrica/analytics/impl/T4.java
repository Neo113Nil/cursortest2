package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class T4 {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f5089a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5090b = "[ComponentMigrationToV113]";

    public T4(X4 x4) {
        this.f5089a = x4;
    }

    public final X4 a() {
        return this.f5089a;
    }

    public final String b() {
        return this.f5090b;
    }

    public abstract boolean b(int i2);

    public abstract void c();

    public final void a(int i2) {
        if (b(i2)) {
            c();
        }
    }
}
