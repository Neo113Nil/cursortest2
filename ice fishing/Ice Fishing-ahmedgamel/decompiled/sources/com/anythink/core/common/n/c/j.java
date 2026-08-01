package com.anythink.core.common.n.c;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: a, reason: collision with root package name */
    private x f15868a;

    public j(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f15868a = xVar;
    }

    public final x a() {
        return this.f15868a;
    }

    @Override // com.anythink.core.common.n.c.x
    public final x f() {
        return this.f15868a.f();
    }

    @Override // com.anythink.core.common.n.c.x
    public final boolean f_() {
        return this.f15868a.f_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final void g() {
        this.f15868a.g();
    }

    @Override // com.anythink.core.common.n.c.x
    public final long g_() {
        return this.f15868a.g_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final x h_() {
        return this.f15868a.h_();
    }

    @Override // com.anythink.core.common.n.c.x
    public final long i_() {
        return this.f15868a.i_();
    }

    public final j a(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f15868a = xVar;
        return this;
    }

    @Override // com.anythink.core.common.n.c.x
    public final x a(long j6, TimeUnit timeUnit) {
        return this.f15868a.a(j6, timeUnit);
    }

    @Override // com.anythink.core.common.n.c.x
    public final x a(long j6) {
        return this.f15868a.a(j6);
    }
}
