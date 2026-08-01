package com.anythink.core.common.r;

import com.anythink.core.api.ATAdRequest;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    h f16044a;

    /* renamed from: b, reason: collision with root package name */
    int f16045b;

    /* renamed from: c, reason: collision with root package name */
    boolean f16046c;

    /* renamed from: d, reason: collision with root package name */
    long f16047d;

    /* renamed from: e, reason: collision with root package name */
    d f16048e;

    /* renamed from: f, reason: collision with root package name */
    ATAdRequest f16049f;

    public b(h hVar, int i, ATAdRequest aTAdRequest) {
        this.f16044a = hVar;
        this.f16045b = i;
        this.f16049f = aTAdRequest;
    }

    private boolean c() {
        return this.f16046c;
    }

    private long d() {
        return this.f16047d;
    }

    public final ATAdRequest a() {
        return this.f16049f;
    }

    public final void b() {
        this.f16046c = true;
    }

    public final void a(long j6) {
        this.f16047d = j6;
    }

    public final void a(d dVar) {
        this.f16048e = dVar;
    }
}
