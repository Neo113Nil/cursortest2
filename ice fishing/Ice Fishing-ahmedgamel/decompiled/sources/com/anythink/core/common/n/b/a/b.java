package com.anythink.core.common.n.b.a;

/* loaded from: classes.dex */
public abstract class b implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    protected final String f15733c;

    public b(String str, Object... objArr) {
        this.f15733c = c.a(str, objArr);
    }

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f15733c);
        try {
            c();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
