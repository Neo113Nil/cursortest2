package io.appmetrica.analytics.screenshot.impl;

import i1.AbstractC0251h;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7671a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7672b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7673c;

    public C0950p(boolean z2, List list, long j2) {
        this.f7671a = z2;
        this.f7672b = list;
        this.f7673c = j2;
    }

    public final long a() {
        return this.f7673c;
    }

    public final boolean b() {
        return this.f7671a;
    }

    public final List c() {
        return this.f7672b;
    }

    public final String toString() {
        return "ContentObserverCaptorConfig(enabled=" + this.f7671a + ", mediaStoreColumnNames='" + this.f7672b + "', detectWindowSeconds=" + this.f7673c + ')';
    }

    public C0950p() {
        this(new O().f7601a, AbstractC0251h.U(new O().f7603c), new O().f7602b);
    }
}
