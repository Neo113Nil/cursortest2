package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.b6e;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.dq7;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends com.yandex.passport.common.mvi.h {
    public final com.yandex.passport.common.core.f c;
    public final com.yandex.passport.common.ui.a d;
    public final com.yandex.passport.internal.core.accounts.e e;
    public final com.yandex.passport.internal.usecase.ui.t f;
    public final com.yandex.passport.internal.account.b g;
    public final com.yandex.passport.internal.usecase.ui.w h;
    public final com.yandex.passport.internal.report.reporters.o1 i;

    public o(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.ui.a aVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.usecase.ui.t tVar, com.yandex.passport.internal.account.b bVar, com.yandex.passport.internal.usecase.ui.w wVar, com.yandex.passport.internal.report.reporters.o1 o1Var) {
        fVar.getClass();
        aVar.getClass();
        eVar.getClass();
        tVar.getClass();
        bVar.getClass();
        wVar.getClass();
        o1Var.getClass();
        this.c = fVar;
        this.d = aVar;
        this.e = eVar;
        this.f = tVar;
        this.g = bVar;
        this.h = wVar;
        this.i = o1Var;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object c(Object obj, com.yandex.passport.common.mvi.g gVar) {
        if (!((h) obj).equals(h.a)) {
            b6e.s();
            return null;
        }
        if (!Intrinsics.d(h(), new z(null, null))) {
            return Unit.a;
        }
        Object n = n(gVar);
        return n == nm6.a ? n : Unit.a;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object d(Object obj, com.yandex.passport.common.mvi.g gVar) {
        i0 i0Var = (i0) obj;
        if (i0Var instanceof a0) {
            k();
        } else if (i0Var instanceof b0) {
            a(new q(t1.a));
        } else {
            if (i0Var instanceof c0) {
                Object n = n(gVar);
                return n == nm6.a ? n : Unit.a;
            }
            if (!(i0Var instanceof e0)) {
                if (i0Var instanceof d0) {
                    Object l = l(gVar);
                    return l == nm6.a ? l : Unit.a;
                }
                if (!(i0Var instanceof f0)) {
                    if (i0Var instanceof g0) {
                        Object m = m(((g0) i0Var).a, gVar);
                        return m == nm6.a ? m : Unit.a;
                    }
                    if (!(i0Var instanceof h0)) {
                        b6e.s();
                        return null;
                    }
                    int ordinal = ((h0) i0Var).a.ordinal();
                    if (ordinal == 0 || ordinal == 1) {
                        k();
                    } else if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    Unit unit = Unit.a;
                    nm6 nm6Var = nm6.a;
                    return unit;
                }
                com.yandex.passport.sloth.h0 h0Var = ((f0) i0Var).a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New sloth external request: " + h0Var, 8);
                }
                if (h0Var instanceof com.yandex.passport.sloth.c0) {
                    g(new x(this.c, false));
                } else if (h0Var instanceof com.yandex.passport.sloth.a0) {
                    Throwable th = ((com.yandex.passport.sloth.a0) h0Var).a;
                    if (!com.yandex.plus.core.locale.b.q(th)) {
                        a(new q(new s1(th)));
                    } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Internet connection is lost in Sloth.", 8);
                    }
                } else {
                    this.i.u(h0Var.toString(), com.yandex.passport.internal.report.reporters.n1.DELETE_FOREVER_ACCOUNT);
                }
                Unit unit2 = Unit.a;
                nm6 nm6Var2 = nm6.a;
                return unit2;
            }
            a(new q(new s1(((e0) i0Var).a)));
        }
        return Unit.a;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Unit f(Throwable th) {
        a(new q(new s1(th)));
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(2:15|16)(2:18|19)))|34|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r6 = defpackage.z7o.b;
        r6 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        r6 = defpackage.z7o.b;
        r6 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(com.yandex.passport.internal.l lVar, cg6 cg6Var) {
        j jVar;
        int i;
        Throwable a;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.m = i2 - Integer.MIN_VALUE;
                Object obj = jVar.k;
                nm6 nm6Var = nm6.a;
                i = jVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.internal.usecase.ui.t tVar = this.f;
                    jVar.j = lVar;
                    jVar.m = 1;
                    if (tVar.g(lVar, jVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lVar = jVar.j;
                    qgg.h0(obj);
                }
                this.g.a(lVar.b);
                Object obj2 = Unit.a;
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj2);
                if (a == null) {
                    return new s1(a);
                }
                return u1.a;
            }
        }
        jVar = new j(this, cg6Var);
        Object obj3 = jVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jVar.m;
        if (i != 0) {
        }
        this.g.a(lVar.b);
        Object obj22 = Unit.a;
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj22);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        k kVar;
        int i;
        com.yandex.passport.internal.l lVar;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.m = i2 - Integer.MIN_VALUE;
                Object obj = kVar.k;
                nm6 nm6Var = nm6.a;
                i = kVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    dq7 dq7Var = ca8.a;
                    mn7 mn7Var = mn7.d;
                    com.yandex.passport.internal.storage.a aVar = new com.yandex.passport.internal.storage.a(this, fVar, continuation, 8);
                    kVar.j = fVar;
                    kVar.m = 1;
                    obj = x97.V(mn7Var, aVar, kVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = kVar.j;
                    qgg.h0(obj);
                }
                lVar = (com.yandex.passport.internal.l) obj;
                if (lVar == null) {
                    return lVar;
                }
                throw new com.yandex.passport.api.exception.b(com.yandex.plus.pay.ui.core.b.J(fVar));
            }
        }
        kVar = new k(this, cg6Var);
        Object obj2 = kVar.k;
        nm6 nm6Var2 = nm6.a;
        i = kVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        lVar = (com.yandex.passport.internal.l) obj2;
        if (lVar == null) {
        }
    }

    public final void k() {
        a(new q(r1.a));
        a(new p(null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        if (r9 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0056, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(cg6 cg6Var) {
        l lVar;
        int i;
        com.yandex.passport.internal.l lVar2;
        Object obj;
        Object obj2;
        o oVar;
        Throwable a;
        if (cg6Var instanceof l) {
            lVar = (l) cg6Var;
            int i2 = lVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.o = i2 - Integer.MIN_VALUE;
                Object obj3 = lVar.m;
                nm6 nm6Var = nm6.a;
                i = lVar.o;
                com.yandex.passport.common.core.f fVar = this.c;
                if (i != 0) {
                    qgg.h0(obj3);
                    a(new p(null));
                    lVar.o = 1;
                    obj3 = j(fVar, lVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oVar = lVar.l;
                            obj2 = lVar.k;
                            qgg.h0(obj3);
                            oVar.a(new q((v1) obj3));
                            obj = obj2;
                            a = z7o.a(obj);
                            if (a != null) {
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onFailure " + a.getMessage(), 8);
                                }
                                if (a instanceof com.yandex.passport.common.exception.a) {
                                    g(new x(fVar, true));
                                } else {
                                    a(new q(new s1(a)));
                                }
                            }
                            return Unit.a;
                        }
                        lVar2 = lVar.j;
                        qgg.h0(obj3);
                        obj = ((z7o) obj3).a;
                        if (!(obj instanceof t7o)) {
                            lVar.j = null;
                            lVar.k = obj;
                            lVar.l = this;
                            lVar.o = 3;
                            Object i3 = i(lVar2, lVar);
                            if (i3 != nm6Var) {
                                obj2 = obj;
                                obj3 = i3;
                                oVar = this;
                                oVar.a(new q((v1) obj3));
                                obj = obj2;
                            }
                            return nm6Var;
                        }
                        a = z7o.a(obj);
                        if (a != null) {
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj3);
                }
                lVar2 = (com.yandex.passport.internal.l) obj3;
                com.yandex.passport.internal.usecase.ui.u uVar = new com.yandex.passport.internal.usecase.ui.u(lVar2);
                lVar.j = lVar2;
                lVar.o = 2;
                obj3 = this.h.g(uVar, lVar);
            }
        }
        lVar = new l(this, cg6Var);
        Object obj32 = lVar.m;
        nm6 nm6Var2 = nm6.a;
        i = lVar.o;
        com.yandex.passport.common.core.f fVar2 = this.c;
        if (i != 0) {
        }
        lVar2 = (com.yandex.passport.internal.l) obj32;
        com.yandex.passport.internal.usecase.ui.u uVar2 = new com.yandex.passport.internal.usecase.ui.u(lVar2);
        lVar.j = lVar2;
        lVar.o = 2;
        obj32 = this.h.g(uVar2, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(com.yandex.passport.sloth.b1 b1Var, cg6 cg6Var) {
        m mVar;
        Object obj;
        nm6 nm6Var;
        int i;
        o oVar;
        if (cg6Var instanceof m) {
            mVar = (m) cg6Var;
            int i2 = mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.m = i2 - Integer.MIN_VALUE;
                obj = mVar.k;
                nm6Var = nm6.a;
                i = mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New sloth result: " + b1Var, 8);
                    }
                    if (Intrinsics.d(b1Var, com.yandex.passport.sloth.e.a)) {
                        k();
                    } else if (Intrinsics.d(b1Var, com.yandex.passport.sloth.i0.a)) {
                        mVar.m = 1;
                        obj = j(this.c, mVar);
                    } else {
                        this.i.u(com.yandex.passport.sloth.g.a(b1Var), com.yandex.passport.internal.report.reporters.n1.DELETE_FOREVER_ACCOUNT);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = mVar.j;
                    qgg.h0(obj);
                    oVar.a(new q((v1) obj));
                    return Unit.a;
                }
                qgg.h0(obj);
                mVar.j = this;
                mVar.m = 2;
                obj = i((com.yandex.passport.internal.l) obj, mVar);
                if (obj != nm6Var) {
                    oVar = this;
                    oVar.a(new q((v1) obj));
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        mVar = new m(this, cg6Var);
        obj = mVar.k;
        nm6Var = nm6.a;
        i = mVar.m;
        if (i != 0) {
        }
        mVar.j = this;
        mVar.m = 2;
        obj = i((com.yandex.passport.internal.l) obj, mVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(cg6 cg6Var) {
        n nVar;
        int i;
        com.yandex.passport.internal.l lVar;
        w vVar;
        if (cg6Var instanceof n) {
            nVar = (n) cg6Var;
            int i2 = nVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.l = i2 - Integer.MIN_VALUE;
                Object obj = nVar.j;
                Object obj2 = nm6.a;
                i = nVar.l;
                com.yandex.passport.common.core.f fVar = this.c;
                if (i != 0) {
                    qgg.h0(obj);
                    nVar.l = 1;
                    obj = j(fVar, nVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                lVar = (com.yandex.passport.internal.l) obj;
                if (i.a[lVar.f().ordinal()] != 1) {
                    vVar = u.a;
                } else {
                    vVar = new v(new com.yandex.passport.sloth.data.m(new com.yandex.passport.sloth.data.t(lVar.h(), fVar, com.yandex.plus.core.network.api.utils.a.T(this.d)), fVar.a, new com.yandex.passport.common.properties.a(15, false, false), 4));
                }
                a(new p(vVar));
                return Unit.a;
            }
        }
        nVar = new n(this, cg6Var);
        Object obj3 = nVar.j;
        Object obj22 = nm6.a;
        i = nVar.l;
        com.yandex.passport.common.core.f fVar2 = this.c;
        if (i != 0) {
        }
        lVar = (com.yandex.passport.internal.l) obj3;
        if (i.a[lVar.f().ordinal()] != 1) {
        }
        a(new p(vVar));
        return Unit.a;
    }
}
