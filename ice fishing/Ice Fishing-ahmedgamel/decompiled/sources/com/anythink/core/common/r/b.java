package com.anythink.core.common.r;

import com.anythink.core.api.ATAdRequest;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    h f16831a;

    /* renamed from: b, reason: collision with root package name */
    int f16832b;

    /* renamed from: c, reason: collision with root package name */
    boolean f16833c;

    /* renamed from: d, reason: collision with root package name */
    long f16834d;

    /* renamed from: e, reason: collision with root package name */
    d f16835e;

    /* renamed from: f, reason: collision with root package name */
    ATAdRequest f16836f;

    public b(h hVar, int i, ATAdRequest aTAdRequest) {
        this.f16831a = hVar;
        this.f16832b = i;
        this.f16836f = aTAdRequest;
    }

    private boolean c() {
        return this.f16833c;
    }

    private long d() {
        return this.f16834d;
    }

    public final ATAdRequest a() {
        return this.f16836f;
    }

    public final void b() {
        this.f16833c = true;
    }

    public final void a(long j6) {
        this.f16834d = j6;
    }

    public final void a(d dVar) {
        this.f16835e = dVar;
    }
}
