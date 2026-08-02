package io.appmetrica.analytics.locationinternal.impl;

import defpackage.jl40;
import java.util.List;

/* loaded from: classes9.dex */
public final class B0 implements D0 {
    public final C0 a = new C0();
    public p2 b;
    public volatile A0 c;

    public B0(p2 p2Var) {
        p2Var = p2Var == null ? o2.a() : p2Var;
        this.b = p2Var;
        this.c = C0.a(p2Var);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.D0
    public final j2 a(C0993v0 c0993v0) {
        C0993v0 c0993v02;
        this.c.b.a(c0993v0.b);
        this.c.a.a(c0993v0.a);
        if (this.c.c.a() != i2.NOT_CHANGED) {
            this.c.b.c();
            this.c.a.c();
            c0993v02 = new C0993v0((List) this.c.a.e, (List) this.c.b.e);
        } else {
            c0993v02 = null;
        }
        return new j2(this.c.c.a(), c0993v02);
    }

    public final synchronized void a(p2 p2Var) {
        if (!jl40.l(this.b, p2Var)) {
            this.b = p2Var;
            this.a.getClass();
            this.c = C0.a(p2Var);
        }
    }
}
