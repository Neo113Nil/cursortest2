package com.anythink.core.common.n.c;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: a, reason: collision with root package name */
    private x f16655a;

    public j(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16655a = xVar;
    }

    public final x a() {
        return this.f16655a;
    }

    @Override // com.anythink.core.common.n.c.x
    public final x f() {
        return this.f16655a.f();
    }

    @Override // com.anythink.core.common.n.c.x
    public final boolean f_() {
        return this.f16655a.f_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final void g() {
        this.f16655a.g();
    }

    @Override // com.anythink.core.common.n.c.x
    public final long g_() {
        return this.f16655a.g_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final x h_() {
        return this.f16655a.h_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final long i_() {
        return this.f16655a.i_();
    }

    public final j a(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16655a = xVar;
        return this;
    }

    @Override // com.anythink.core.common.n.c.x
    public final x a(long j6, TimeUnit timeUnit) {
        return this.f16655a.a(j6, timeUnit);
    }

    @Override // com.anythink.core.common.n.c.x
    public final x a(long j6) {
        return this.f16655a.a(j6);
    }
}
