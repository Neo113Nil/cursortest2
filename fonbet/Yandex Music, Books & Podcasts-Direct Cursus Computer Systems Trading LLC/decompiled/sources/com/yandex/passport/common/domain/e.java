package com.yandex.passport.common.domain;

import defpackage.avf;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.eeh;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.vqn;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class e extends a {
    public final a b;
    public final long c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlinx.coroutines.a aVar, a aVar2) {
        super(aVar);
        aVar.getClass();
        this.b = aVar2;
        this.c = com.yandex.passport.common.time.a.c(0, 0, 300, 7);
        b bVar = b.a;
        this.d = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object v(e eVar, Object obj, cg6 cg6Var) {
        c cVar;
        int i;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    a aVar = eVar.b;
                    cVar.l = 1;
                    obj2 = aVar.g(obj, cVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return ((z7o) obj2).a;
            }
        }
        cVar = new c(eVar, cg6Var);
        Object obj22 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        return ((z7o) obj22).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        if (defpackage.y2x.o(r7, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c3 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable z(e eVar, Object obj, cg6 cg6Var) {
        d dVar;
        int i;
        vqn vqnVar;
        Object obj2;
        vqn vqnVar2;
        e eVar2;
        Throwable a;
        Object u;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.o = i2 - Integer.MIN_VALUE;
                Object obj3 = dVar.m;
                nm6 nm6Var = nm6.a;
                i = dVar.o;
                if (i != 0) {
                    qgg.h0(obj3);
                    vqnVar = new vqn();
                    dVar.j = eVar;
                    dVar.k = obj;
                    dVar.l = vqnVar;
                    dVar.o = 1;
                    u = eVar.u(obj, dVar);
                    if (u != nm6Var) {
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vqnVar2 = dVar.l;
                    obj = dVar.k;
                    eVar2 = dVar.j;
                    qgg.h0(obj3);
                    vqnVar = vqnVar2;
                    eVar = eVar2;
                    if (vqnVar.a > eVar.x()) {
                        r7o r7oVar = z7o.b;
                        return new z7o(new t7o(new RuntimeException("Internal error")));
                    }
                    dVar.j = eVar;
                    dVar.k = obj;
                    dVar.l = vqnVar;
                    dVar.o = 1;
                    u = eVar.u(obj, dVar);
                    if (u != nm6Var) {
                        eVar2 = eVar;
                        vqnVar2 = vqnVar;
                        obj2 = u;
                        a = z7o.a(obj2);
                        if (a != null) {
                            return new z7o(avf.u(obj2));
                        }
                        int i3 = vqnVar2.a;
                        vqnVar2.a = i3 + 1;
                        if (i3 >= eVar2.x() || !eVar2.A(a)) {
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Maximum retries reached " + vqnVar2.a, 8);
                            }
                            return new z7o(new t7o(a));
                        }
                        b y = eVar2.y();
                        int i4 = vqnVar2.a + 1;
                        long w = eVar2.w();
                        y.getClass();
                        int ordinal = y.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                w = eeh.c(w * i4);
                            } else {
                                if (ordinal != 2) {
                                    b6e.s();
                                    return null;
                                }
                                w = com.yandex.passport.common.time.a.b(0L, 0L, 0L, (long) Math.pow(2.0d, i4));
                            }
                        }
                        dVar.j = eVar2;
                        dVar.k = obj;
                        dVar.l = vqnVar2;
                        dVar.o = 2;
                    }
                    return nm6Var;
                }
                vqnVar2 = dVar.l;
                obj = dVar.k;
                eVar2 = dVar.j;
                qgg.h0(obj3);
                obj2 = ((z7o) obj3).a;
                a = z7o.a(obj2);
                if (a != null) {
                }
            }
        }
        dVar = new d(eVar, cg6Var);
        Object obj32 = dVar.m;
        nm6 nm6Var2 = nm6.a;
        i = dVar.o;
        if (i != 0) {
        }
    }

    public boolean A(Throwable th) {
        return true;
    }

    @Override // androidx.core.app.n0
    public final Object s(Object obj, rhw rhwVar) {
        return z(this, obj, rhwVar);
    }

    public Object u(Object obj, d dVar) {
        return v(this, obj, dVar);
    }

    public long w() {
        return this.c;
    }

    public int x() {
        return this.d;
    }

    public abstract b y();
}
