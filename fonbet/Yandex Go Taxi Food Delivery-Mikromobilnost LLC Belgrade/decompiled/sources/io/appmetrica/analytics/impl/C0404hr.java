package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C0404hr implements InterfaceC0918zl {
    public final int a;
    public final int b;
    public int c = 0;

    public C0404hr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final boolean b() {
        int i = this.c;
        this.c = i + 1;
        return i < this.a;
    }

    public final void c() {
        this.c = 0;
    }
}
