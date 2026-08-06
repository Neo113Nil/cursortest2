package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7648a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7649b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7650c;

    public i0(boolean z2, List list, long j2) {
        this.f7648a = z2;
        this.f7649b = list;
        this.f7650c = j2;
    }

    public final long a() {
        return this.f7650c;
    }

    public final boolean b() {
        return this.f7648a;
    }

    public final List c() {
        return this.f7649b;
    }

    public final String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.f7648a + ", mediaStoreColumnNames=" + this.f7649b + ", detectWindowSeconds=" + this.f7650c + ')';
    }

    public i0(C0950p c0950p) {
        this(c0950p.b(), c0950p.c(), c0950p.a());
    }
}
