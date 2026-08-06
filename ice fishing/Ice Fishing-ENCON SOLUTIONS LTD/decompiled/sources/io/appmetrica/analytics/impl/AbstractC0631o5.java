package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0631o5 implements InterfaceC0361dj {

    /* renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f6659a;

    /* renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f6660b;

    /* renamed from: c, reason: collision with root package name */
    public L5 f6661c;

    public AbstractC0631o5(BaseRequestConfig.RequestConfigLoader<Object, L5> requestConfigLoader, C0415fm c0415fm, ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f6660b = requestConfigLoader;
        C0610na.k().v().a(this);
        a(new L5(c0415fm, C0610na.k().v(), C0610na.k().s(), argumentsMerger));
    }

    public final synchronized void a(L5 l5) {
        this.f6661c = l5;
    }

    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f6661c.componentArguments;
    }

    public final synchronized C0415fm c() {
        return this.f6661c.f4671a;
    }

    public final void d() {
        synchronized (this) {
            this.f6659a = null;
        }
    }

    public final synchronized void e() {
        this.f6659a = null;
    }

    public synchronized void a(Object obj) {
        if (!((ArgumentsMerger) this.f6661c.componentArguments).compareWithOtherArguments(obj)) {
            a(new L5(c(), C0610na.f6575I.v(), C0610na.f6575I.s(), (ArgumentsMerger) ((ArgumentsMerger) this.f6661c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(C0415fm c0415fm) {
        a(new L5(c0415fm, C0610na.f6575I.v(), C0610na.f6575I.s(), b()));
        e();
    }

    public final synchronized BaseRequestConfig a() {
        try {
            if (this.f6659a == null) {
                this.f6659a = this.f6660b.load(this.f6661c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6659a;
    }
}
