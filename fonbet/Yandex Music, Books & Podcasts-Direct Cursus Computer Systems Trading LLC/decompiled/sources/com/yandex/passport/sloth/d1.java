package com.yandex.passport.sloth;

import defpackage.cg6;
import defpackage.dfi;
import defpackage.nm6;
import defpackage.o6c;
import defpackage.r2f;
import defpackage.wqr;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class d1 implements Closeable {
    public final com.yandex.passport.sloth.data.m a;
    public final com.yandex.passport.sloth.command.g b;
    public final v c;
    public final com.yandex.passport.sloth.url.b0 d;
    public final i e;
    public final com.yandex.passport.sloth.url.v f;
    public final com.yandex.passport.sloth.ui.z0 g;
    public final com.yandex.passport.sloth.url.a h;
    public final a1 i;
    public final c1 j;

    public d1(com.yandex.passport.sloth.data.m mVar, com.yandex.passport.sloth.command.g gVar, v vVar, com.yandex.passport.sloth.url.b0 b0Var, i iVar, com.yandex.passport.sloth.url.v vVar2, com.yandex.passport.sloth.ui.z0 z0Var, com.yandex.passport.sloth.url.a aVar, a1 a1Var) {
        mVar.getClass();
        gVar.getClass();
        vVar.getClass();
        b0Var.getClass();
        iVar.getClass();
        vVar2.getClass();
        z0Var.getClass();
        aVar.getClass();
        a1Var.getClass();
        this.a = mVar;
        this.b = gVar;
        this.c = vVar;
        this.d = b0Var;
        this.e = iVar;
        this.f = vVar2;
        this.g = z0Var;
        this.h = aVar;
        this.i = a1Var;
        this.j = new c1(this);
    }

    public final Object a(cg6 cg6Var) {
        com.yandex.passport.sloth.data.o0 o0Var = this.a.a;
        o0Var.getClass();
        this.i.a(new n0(16, r0.SESSION_START, dfi.n("variant", o0Var.toString())));
        Object m = this.f.m(o0Var, cg6Var);
        return m == nm6.a ? m : Unit.a;
    }

    public final Object b(CoroutineContext coroutineContext, cg6 cg6Var) {
        i iVar = this.e;
        iVar.getClass();
        coroutineContext.getClass();
        wqr wqrVar = iVar.c;
        if (wqrVar != null) {
            wqrVar.g(null);
        }
        wqr wqrVar2 = new wqr((r2f) coroutineContext.get(o6c.l));
        iVar.c = wqrVar2;
        wqrVar2.R(new com.yandex.passport.internal.ui.bouncer.roundabout.k(11, iVar));
        Object a = a(cg6Var);
        return a == nm6.a ? a : Unit.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }
}
