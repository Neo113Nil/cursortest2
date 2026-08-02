package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.aur;
import defpackage.hrg;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.z7o;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class e0 extends aur implements pyc {
    public xqn j;
    public Object k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ com.yandex.passport.internal.ui.bouncer.model.j o;
    public /* synthetic */ com.yandex.passport.internal.ui.bouncer.model.l1 p;
    public final /* synthetic */ h0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, Continuation continuation) {
        super(3, continuation);
        this.q = h0Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e0 e0Var = new e0(this.q, (Continuation) obj3);
        e0Var.o = (com.yandex.passport.internal.ui.bouncer.model.j) obj;
        e0Var.p = (com.yandex.passport.internal.ui.bouncer.model.l1) obj2;
        return e0Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xqn i;
        int i2;
        Object b;
        int i3;
        xqn xqnVar;
        Object g;
        com.yandex.passport.internal.l lVar;
        t7o t7oVar;
        Object obj2;
        Throwable a;
        t7o t7oVar2;
        com.yandex.passport.internal.properties.k0 k0Var;
        h0 h0Var = this.q;
        com.yandex.passport.internal.ui.bouncer.model.j jVar = this.o;
        com.yandex.passport.internal.ui.bouncer.model.l1 l1Var = this.p;
        nm6 nm6Var = nm6.a;
        int i4 = this.n;
        boolean z = true;
        try {
            if (i4 == 0) {
                i = hrg.i(obj);
                try {
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.internal.properties.l lVar2 = l1Var.c;
                    this.o = jVar;
                    this.p = l1Var;
                    this.j = i;
                    this.k = h0Var;
                    i2 = 0;
                    this.l = 0;
                    this.m = 0;
                    this.n = 1;
                    b = h0.b(h0Var, jVar, lVar2, this);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    i3 = 0;
                } catch (wis e) {
                    e = e;
                    xqnVar = i;
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(e);
                    obj2 = t7oVar;
                    a = z7o.a(obj2);
                    if (a != null) {
                    }
                    Throwable a2 = z7o.a(obj2);
                    if (a2 != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    xqnVar = i;
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                    obj2 = t7oVar;
                    a = z7o.a(obj2);
                    if (a != null) {
                    }
                    Throwable a22 = z7o.a(obj2);
                    if (a22 != null) {
                    }
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.yandex.passport.internal.l lVar3 = (com.yandex.passport.internal.l) this.k;
                    xqnVar = this.j;
                    try {
                        qgg.h0(obj);
                        lVar = lVar3;
                        g = obj;
                        Object obj3 = ((z7o) g).a;
                        qgg.h0(obj3);
                        obj2 = new com.yandex.passport.internal.ui.bouncer.model.i0(new com.yandex.passport.internal.ui.bouncer.model.j1(lVar, (com.yandex.passport.internal.entities.e) obj3, jVar.w(), null, null, null, 56));
                    } catch (wis e2) {
                        e = e2;
                        r7o r7oVar22 = z7o.b;
                        t7oVar = new t7o(e);
                        obj2 = t7oVar;
                        a = z7o.a(obj2);
                        if (a != null) {
                        }
                        Throwable a222 = z7o.a(obj2);
                        if (a222 != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r7o r7oVar32 = z7o.b;
                        t7oVar = new t7o(th);
                        obj2 = t7oVar;
                        a = z7o.a(obj2);
                        if (a != null) {
                        }
                        Throwable a2222 = z7o.a(obj2);
                        if (a2222 != null) {
                        }
                    }
                    a = z7o.a(obj2);
                    if (a != null) {
                        try {
                            if (a instanceof b0) {
                                obj2 = ((b0) a).a;
                            } else {
                                if (!(a instanceof com.yandex.passport.common.exception.a) && !(a instanceof c0)) {
                                    if (!(a instanceof IOException)) {
                                        throw a;
                                    }
                                    com.yandex.passport.internal.ui.bouncer.model.b1 b1Var = l1Var.d;
                                    if (b1Var != null && (k0Var = b1Var.a.p) != null) {
                                        z = k0Var.a;
                                    }
                                    obj2 = new com.yandex.passport.internal.ui.bouncer.model.g(z);
                                }
                                com.yandex.passport.internal.ui.bouncer.model.b1 b1Var2 = l1Var.d;
                                com.yandex.passport.internal.properties.l lVar4 = b1Var2 != null ? b1Var2.a : null;
                                if (lVar4 != null) {
                                    com.yandex.passport.common.core.f x = jVar.x();
                                    com.yandex.passport.internal.l lVar5 = (com.yandex.passport.internal.l) xqnVar.a;
                                    obj2 = new com.yandex.passport.internal.ui.bouncer.model.c0(com.yandex.passport.internal.properties.l.a(lVar4, com.yandex.plus.pay.ui.core.b.J(x), lVar5 != null ? lVar5.e.v : null, null, 1073740735), null, (com.yandex.passport.internal.l) xqnVar.a, null, true, true, null, null, 202);
                                } else {
                                    obj2 = new com.yandex.passport.internal.ui.bouncer.model.o("GetClientTokenActor", "No login properties in current state", null);
                                }
                            }
                        } catch (wis e3) {
                            r7o r7oVar4 = z7o.b;
                            t7oVar2 = new t7o(e3);
                            obj2 = t7oVar2;
                            Throwable a22222 = z7o.a(obj2);
                            if (a22222 != null) {
                            }
                        } catch (CancellationException e4) {
                            throw e4;
                        } catch (Throwable th3) {
                            r7o r7oVar5 = z7o.b;
                            t7oVar2 = new t7o(th3);
                            obj2 = t7oVar2;
                            Throwable a222222 = z7o.a(obj2);
                            if (a222222 != null) {
                            }
                        }
                    }
                    Throwable a2222222 = z7o.a(obj2);
                    return a2222222 != null ? obj2 : new com.yandex.passport.internal.ui.bouncer.model.o("GetClientTokenActor", "Failure", a2222222);
                }
                int i5 = this.m;
                int i6 = this.l;
                h0 h0Var2 = (h0) this.k;
                xqn xqnVar2 = this.j;
                try {
                    qgg.h0(obj);
                    i3 = i6;
                    i = xqnVar2;
                    i2 = i5;
                    h0Var = h0Var2;
                    b = obj;
                } catch (wis e5) {
                    e = e5;
                    xqnVar = xqnVar2;
                    r7o r7oVar222 = z7o.b;
                    t7oVar = new t7o(e);
                    obj2 = t7oVar;
                    a = z7o.a(obj2);
                    if (a != null) {
                    }
                    Throwable a22222222 = z7o.a(obj2);
                    if (a22222222 != null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    xqnVar = xqnVar2;
                    r7o r7oVar322 = z7o.b;
                    t7oVar = new t7o(th);
                    obj2 = t7oVar;
                    a = z7o.a(obj2);
                    if (a != null) {
                    }
                    Throwable a222222222 = z7o.a(obj2);
                    if (a222222222 != null) {
                    }
                }
            }
            com.yandex.passport.internal.l lVar6 = (com.yandex.passport.internal.l) b;
            i.a = lVar6;
            com.yandex.passport.internal.usecase.s0 s0Var = h0Var.a;
            com.yandex.passport.internal.usecase.o0 o0Var = new com.yandex.passport.internal.usecase.o0(lVar6, (com.yandex.passport.internal.credentials.f) null, 6);
            this.o = jVar;
            this.p = l1Var;
            this.j = i;
            this.k = lVar6;
            this.l = i3;
            this.m = i2;
            this.n = 2;
            g = s0Var.g(o0Var, this);
            if (g != nm6Var) {
                xqnVar = i;
                lVar = lVar6;
                Object obj32 = ((z7o) g).a;
                qgg.h0(obj32);
                obj2 = new com.yandex.passport.internal.ui.bouncer.model.i0(new com.yandex.passport.internal.ui.bouncer.model.j1(lVar, (com.yandex.passport.internal.entities.e) obj32, jVar.w(), null, null, null, 56));
                a = z7o.a(obj2);
                if (a != null) {
                }
                Throwable a2222222222 = z7o.a(obj2);
                if (a2222222222 != null) {
                }
            }
            return nm6Var;
        } catch (CancellationException e6) {
            throw e6;
        }
    }
}
