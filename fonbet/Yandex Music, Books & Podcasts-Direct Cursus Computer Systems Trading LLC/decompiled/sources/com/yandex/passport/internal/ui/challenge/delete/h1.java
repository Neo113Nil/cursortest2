package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.b6;
import defpackage.b6e;
import defpackage.bsh;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h1 extends bsh {
    public final com.yandex.passport.internal.usecase.ui.w g;
    public final com.yandex.passport.internal.usecase.ui.t h;
    public final com.yandex.passport.internal.account.b i;
    public final x0q j;
    public final com.yandex.passport.internal.l k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.yandex.passport.internal.ui.challenge.o oVar, q1 q1Var, com.yandex.passport.internal.ui.challenge.s sVar, boolean z, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.usecase.ui.w wVar, com.yandex.passport.internal.usecase.ui.t tVar, com.yandex.passport.internal.account.b bVar, com.yandex.passport.internal.flags.i iVar) {
        super(oVar, q1Var, sVar, z);
        oVar.getClass();
        q1Var.getClass();
        sVar.getClass();
        eVar.getClass();
        wVar.getClass();
        tVar.getClass();
        bVar.getClass();
        iVar.getClass();
        this.g = wVar;
        this.h = tVar;
        this.i = bVar;
        com.yandex.passport.common.coroutine.c.a(ot0.F(q1Var));
        this.j = y0q.b(1, 0, null, 6);
        com.yandex.passport.common.core.f j = j();
        com.yandex.passport.internal.l e = eVar.a().e(j);
        if (e == null) {
            throw new com.yandex.passport.api.exception.b(j);
        }
        this.k = e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.bsh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(cg6 cg6Var) {
        f1 f1Var;
        int i;
        if (cg6Var instanceof f1) {
            f1Var = (f1) cg6Var;
            int i2 = f1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = f1Var.j;
                Object obj2 = nm6.a;
                i = f1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "performChallengedAction", 8);
                    }
                    f1Var.l = 1;
                    if (h0(f1Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new com.yandex.passport.internal.ui.challenge.y(true);
            }
        }
        f1Var = new f1(this, cg6Var);
        Object obj3 = f1Var.j;
        Object obj22 = nm6.a;
        i = f1Var.l;
        if (i != 0) {
        }
        return new com.yandex.passport.internal.ui.challenge.y(true);
    }

    public final Object h0(cg6 cg6Var) {
        int i = c1.a[this.k.f().ordinal()];
        x0q x0qVar = this.j;
        if (i == 1) {
            Object emit = x0qVar.emit(w0.a, cg6Var);
            return emit == nm6.a ? emit : Unit.a;
        }
        Object emit2 = x0qVar.emit(a1.a, cg6Var);
        nm6 nm6Var = nm6.a;
        if (emit2 != nm6Var) {
            emit2 = Unit.a;
        }
        return emit2 == nm6Var ? emit2 : Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|12|(2:14|15)(2:17|18)))|33|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i0(cg6 cg6Var) {
        d1 d1Var;
        int i;
        Throwable a;
        if (cg6Var instanceof d1) {
            d1Var = (d1) cg6Var;
            int i2 = d1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = d1Var.j;
                nm6 nm6Var = nm6.a;
                i = d1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.internal.usecase.ui.t tVar = this.h;
                    com.yandex.passport.internal.l lVar = this.k;
                    d1Var.l = 1;
                    if (tVar.g(lVar, d1Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.i.a(j());
                Object obj2 = Unit.a;
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj2);
                if (a == null) {
                    return new com.yandex.passport.api.i0(a);
                }
                return com.yandex.passport.api.h0.c;
            }
        }
        d1Var = new d1(this, cg6Var);
        Object obj3 = d1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = d1Var.l;
        if (i != 0) {
        }
        this.i.a(j());
        Object obj22 = Unit.a;
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj22);
        if (a == null) {
        }
    }

    @Override // defpackage.bsh
    public final com.yandex.passport.common.core.f j() {
        return ((com.yandex.passport.internal.ui.challenge.o) ((b6) this.b)).d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        if (r3.emit(r2, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f2, code lost:
    
        if (r3.emit(r6, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        if (r3.emit(r10, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0066, code lost:
    
        if (r14 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j0(cg6 cg6Var) {
        e1 e1Var;
        int i;
        Object obj;
        Object obj2;
        int i2;
        Throwable a;
        if (cg6Var instanceof e1) {
            e1Var = (e1) cg6Var;
            int i3 = e1Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e1Var.n = i3 - Integer.MIN_VALUE;
                Object obj3 = e1Var.l;
                Object obj4 = nm6.a;
                i = e1Var.n;
                x0q x0qVar = this.j;
                if (i != 0) {
                    qgg.h0(obj3);
                    com.yandex.passport.internal.usecase.ui.u uVar = new com.yandex.passport.internal.usecase.ui.u(this.k);
                    e1Var.n = 1;
                    obj3 = this.g.g(uVar, e1Var);
                } else if (i == 1) {
                    qgg.h0(obj3);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4 || i == 5) {
                                qgg.h0(obj3);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = e1Var.j;
                        qgg.h0(obj3);
                        obj = obj2;
                        a = z7o.a(obj);
                        if (a != null) {
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onFailure " + a.getMessage(), 8);
                            }
                            if (a instanceof com.yandex.passport.common.exception.a) {
                                y0 y0Var = new y0(j(), true);
                                e1Var.j = obj;
                                e1Var.k = 0;
                                e1Var.n = 4;
                            } else {
                                z0 z0Var = new z0(new com.yandex.passport.api.i0(a));
                                e1Var.j = obj;
                                e1Var.k = 0;
                                e1Var.n = 5;
                            }
                        }
                        return Unit.a;
                    }
                    int i4 = e1Var.k;
                    Object obj5 = e1Var.j;
                    qgg.h0(obj3);
                    i2 = i4;
                    obj2 = obj5;
                    z0 z0Var2 = new z0((com.yandex.passport.api.j0) obj3);
                    e1Var.j = obj2;
                    e1Var.k = i2;
                    e1Var.n = 3;
                }
                obj = ((z7o) obj3).a;
                if (!(obj instanceof t7o)) {
                    e1Var.j = obj;
                    e1Var.k = 0;
                    e1Var.n = 2;
                    Object i0 = i0(e1Var);
                    if (i0 != obj4) {
                        obj2 = obj;
                        obj3 = i0;
                        i2 = 0;
                        z0 z0Var22 = new z0((com.yandex.passport.api.j0) obj3);
                        e1Var.j = obj2;
                        e1Var.k = i2;
                        e1Var.n = 3;
                    }
                    return obj4;
                }
                a = z7o.a(obj);
                if (a != null) {
                }
                return Unit.a;
            }
        }
        e1Var = new e1(this, cg6Var);
        Object obj32 = e1Var.l;
        Object obj42 = nm6.a;
        i = e1Var.n;
        x0q x0qVar2 = this.j;
        if (i != 0) {
        }
        obj = ((z7o) obj32).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        if (r8.emit(r2, r0) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        if (r2.emit(r8, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r2.emit(r8, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k0(com.yandex.passport.internal.ui.a aVar, Continuation continuation) {
        g1 g1Var;
        int i;
        x0q x0qVar;
        if (continuation instanceof g1) {
            g1Var = (g1) continuation;
            int i2 = g1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = g1Var.k;
                Object obj2 = nm6.a;
                i = g1Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean d = Intrinsics.d(aVar, v0.d);
                    x0q x0qVar2 = this.j;
                    if (d) {
                        y0 y0Var = new y0(j(), false);
                        g1Var.m = 1;
                    } else if (Intrinsics.d(aVar, v0.b)) {
                        z0 z0Var = new z0(com.yandex.passport.api.h0.a);
                        g1Var.m = 2;
                    } else {
                        if (!Intrinsics.d(aVar, v0.c)) {
                            b6e.s();
                            return null;
                        }
                        g1Var.j = x0qVar2;
                        g1Var.m = 3;
                        obj = i0(g1Var);
                        if (obj != obj2) {
                            x0qVar = x0qVar2;
                            z0 z0Var2 = new z0((com.yandex.passport.api.j0) obj);
                            g1Var.j = null;
                            g1Var.m = 4;
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i != 3) {
                    if (i == 4) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x0qVar = g1Var.j;
                qgg.h0(obj);
                z0 z0Var22 = new z0((com.yandex.passport.api.j0) obj);
                g1Var.j = null;
                g1Var.m = 4;
            }
        }
        g1Var = new g1(this, continuation);
        Object obj3 = g1Var.k;
        Object obj22 = nm6.a;
        i = g1Var.m;
        if (i != 0) {
        }
    }
}
