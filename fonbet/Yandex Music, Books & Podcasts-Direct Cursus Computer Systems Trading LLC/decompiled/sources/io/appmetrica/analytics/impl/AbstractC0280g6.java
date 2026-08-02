package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0280g6 implements InterfaceC0152bm {
    public BaseRequestConfig a;
    public final BaseRequestConfig.RequestConfigLoader b;
    public D6 c;

    public AbstractC0280g6(@NonNull BaseRequestConfig.RequestConfigLoader<Object, D6> requestConfigLoader, @NonNull C0385jp c0385jp, @NonNull ArgumentsMerger<Object, Object> argumentsMerger) {
        this.b = requestConfigLoader;
        C0747wb.k().v().a(this);
        a(new D6(c0385jp, C0747wb.k().v(), C0747wb.k().s(), argumentsMerger));
    }

    public synchronized void a(@NonNull Object obj) {
        if (!((ArgumentsMerger) this.c.componentArguments).compareWithOtherArguments(obj)) {
            a(new D6(c(), C0747wb.I.v(), C0747wb.I.s(), (ArgumentsMerger) ((ArgumentsMerger) this.c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    @NonNull
    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.c.componentArguments;
    }

    @NonNull
    public final synchronized C0385jp c() {
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

    public final synchronized void a(@NonNull D6 d6) {
        this.c = d6;
    }

    public final synchronized void a(@NonNull C0385jp c0385jp) {
        a(new D6(c0385jp, C0747wb.I.v(), C0747wb.I.s(), b()));
        e();
    }

    @NonNull
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
