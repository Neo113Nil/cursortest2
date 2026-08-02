package com.anythink.basead.exoplayer.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private int f7504a;

    public void a() {
        this.f7504a = 0;
    }

    public final boolean b() {
        return c(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return c(4);
    }

    public final boolean d() {
        return c(1);
    }

    private void d(int i) {
        this.f7504a = (~i) & this.f7504a;
    }

    public final void a(int i) {
        this.f7504a = i;
    }

    public final void b(int i) {
        this.f7504a = i | this.f7504a;
    }

    public final boolean c(int i) {
        return (this.f7504a & i) == i;
    }
}
