package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7654a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7655b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7656c;

    public C0945k(boolean z2, List list, long j2) {
        this.f7654a = z2;
        this.f7655b = list;
        this.f7656c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0945k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C0945k c0945k = (C0945k) obj;
        return this.f7654a == c0945k.f7654a && kotlin.jvm.internal.i.a(this.f7655b, c0945k.f7655b) && this.f7656c == c0945k.f7656c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7656c) + ((this.f7655b.hashCode() + (Boolean.hashCode(this.f7654a) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.f7654a + ", mediaStoreColumnNames=" + this.f7655b + ", detectWindowSeconds=" + this.f7656c + ')';
    }

    public C0945k(B b2) {
        this(b2.b(), b2.c(), b2.a());
    }
}
