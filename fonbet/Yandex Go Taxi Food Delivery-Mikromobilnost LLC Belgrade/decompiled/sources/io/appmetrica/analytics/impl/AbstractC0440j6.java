package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.j6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0440j6 implements InterfaceC0716sm {
    public BaseRequestConfig a;
    public final BaseRequestConfig.RequestConfigLoader b;
    public G6 c;

    public AbstractC0440j6(BaseRequestConfig.RequestConfigLoader<Object, G6> requestConfigLoader, Bp bp, ArgumentsMerger<Object, Object> argumentsMerger) {
        this.b = requestConfigLoader;
        Jb.k().v().a(this);
        a(new G6(bp, Jb.k().v(), Jb.k().s(), argumentsMerger));
    }

    public synchronized void a(Object obj) {
        if (!((ArgumentsMerger) this.c.componentArguments).compareWithOtherArguments(obj)) {
            a(new G6(c(), Jb.I.v(), Jb.I.s(), (ArgumentsMerger) ((ArgumentsMerger) this.c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.c.componentArguments;
    }

    public final synchronized Bp c() {
        return this.c.a;
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final synchronized void e() {
        this.a = null;
    }

    public final synchronized void a(G6 g6) {
        this.c = g6;
    }

    public final synchronized void a(Bp bp) {
        a(new G6(bp, Jb.I.v(), Jb.I.s(), b()));
        e();
    }

    public final synchronized BaseRequestConfig a() {
        try {
            if (this.a == null) {
                this.a = this.b.load(this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
