package com.anythink.basead.exoplayer.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private int f6718a;

    public void a() {
        this.f6718a = 0;
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
        this.f6718a = (~i) & this.f6718a;
    }

    public final void a(int i) {
        this.f6718a = i;
    }

    public final void b(int i) {
        this.f6718a = i | this.f6718a;
    }

    public final boolean c(int i) {
        return (this.f6718a & i) == i;
    }
}
