package com.yandex.plus.experiments.impl.providers;

import com.yandex.plus.core.graphql.daily.progress.s;
import defpackage.aur;
import defpackage.btf;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.mu7;
import defpackage.nm6;
import defpackage.ou7;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.r7o;
import defpackage.rqi;
import defpackage.saf;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.wis;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.z7o;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class h {
    public final tf6 a;
    public final kotlinx.coroutines.a b;
    public final com.yandex.plus.core.android.extensions.c c;
    public final com.yandex.plus.experiments.impl.mappers.a d;
    public final com.yandex.plus.experiments.api.providers.a e;
    public final com.yandex.plus.experiments.api.cache.c f;
    public final com.yandex.plus.experiments.api.cache.c g;
    public final com.yandex.plus.log.api.b h;
    public final jyr i;
    public final qqi j;
    public final xdr k;
    public ou7 l;

    public h(tf6 tf6Var, kotlinx.coroutines.a aVar, com.yandex.plus.core.android.extensions.c cVar, com.yandex.plus.experiments.impl.mappers.a aVar2, com.yandex.plus.experiments.api.providers.a aVar3, com.yandex.plus.experiments.api.cache.c cVar2, com.yandex.plus.experiments.api.cache.c cVar3, com.yandex.plus.log.api.b bVar) {
        aVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        bVar.getClass();
        this.a = tf6Var;
        this.b = aVar;
        this.c = cVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = cVar2;
        this.g = cVar3;
        this.h = bVar;
        this.i = btf.b(new s(18, this));
        this.j = rqi.a();
        this.k = ydr.a(null);
        x97.y(tf6Var, aVar, null, new a(this, null, 0), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r8 == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r8 == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h hVar, cg6 cg6Var) {
        c cVar;
        int i;
        com.yandex.plus.experiments.api.cache.f fVar;
        com.yandex.plus.experiments.api.cache.c cVar2 = hVar.f;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cVar.l = 1;
                    obj = cVar2.d(cVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        fVar = (com.yandex.plus.experiments.api.cache.f) obj;
                        Object a = hVar.d.a(fVar);
                        xdr xdrVar = hVar.k;
                        r7o r7oVar = z7o.b;
                        com.yandex.plus.core.b bVar = new com.yandex.plus.core.b(a instanceof t7o ? null : a);
                        xdrVar.getClass();
                        xdrVar.m(null, bVar);
                        return a;
                    }
                    qgg.h0(obj);
                }
                fVar = (com.yandex.plus.experiments.api.cache.f) obj;
                if (fVar == null) {
                    cVar.l = 2;
                    obj = com.yandex.plus.experiments.api.cache.c.c(cVar2, cVar);
                }
                Object a2 = hVar.d.a(fVar);
                xdr xdrVar2 = hVar.k;
                r7o r7oVar2 = z7o.b;
                com.yandex.plus.core.b bVar2 = new com.yandex.plus.core.b(a2 instanceof t7o ? null : a2);
                xdrVar2.getClass();
                xdrVar2.m(null, bVar2);
                return a2;
            }
        }
        cVar = new c(hVar, cg6Var);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        fVar = (com.yandex.plus.experiments.api.cache.f) obj2;
        if (fVar == null) {
        }
        Object a22 = hVar.d.a(fVar);
        xdr xdrVar22 = hVar.k;
        r7o r7oVar22 = z7o.b;
        com.yandex.plus.core.b bVar22 = new com.yandex.plus.core.b(a22 instanceof t7o ? null : a22);
        xdrVar22.getClass();
        xdrVar22.m(null, bVar22);
        return a22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r15 == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h hVar, cg6 cg6Var) {
        f fVar;
        int i;
        Object a;
        com.yandex.plus.experiments.api.a aVar;
        com.yandex.plus.experiments.api.a aVar2;
        com.yandex.plus.log.api.b bVar;
        com.yandex.plus.log.api.a aVar3;
        xdr xdrVar = hVar.k;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fVar.k;
                nm6 nm6Var = nm6.a;
                i = fVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    xdrVar.getClass();
                    xdrVar.m(null, com.yandex.plus.core.c.a);
                    com.yandex.plus.experiments.api.providers.a aVar4 = hVar.e;
                    fVar.m = 1;
                    a = aVar4.a(fVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar2 = fVar.j;
                        qgg.h0(obj);
                        com.yandex.plus.core.b bVar2 = new com.yandex.plus.core.b(aVar2);
                        xdrVar.getClass();
                        xdrVar.m(null, bVar2);
                        bVar = hVar.h;
                        aVar3 = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar3)) {
                            bVar.c(aVar3, "ExperimentsRepository", "Updated experiments from remote server: " + aVar2);
                        }
                        return aVar2;
                    }
                    qgg.h0(obj);
                    a = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (a instanceof t7o) {
                    a = null;
                }
                aVar = (com.yandex.plus.experiments.api.a) a;
                if (aVar != null) {
                    return null;
                }
                long a2 = hVar.c.a();
                hVar.d.getClass();
                com.yandex.plus.experiments.api.cache.f fVar2 = new com.yandex.plus.experiments.api.cache.f(aVar.a, aVar.b, aVar.c, aVar.d, a2);
                com.yandex.plus.experiments.api.cache.c cVar = hVar.f;
                fVar.j = aVar;
                fVar.m = 2;
                if (cVar.g(fVar2, fVar) != nm6Var) {
                    aVar2 = aVar;
                    com.yandex.plus.core.b bVar22 = new com.yandex.plus.core.b(aVar2);
                    xdrVar.getClass();
                    xdrVar.m(null, bVar22);
                    bVar = hVar.h;
                    aVar3 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar3)) {
                    }
                    return aVar2;
                }
                return nm6Var;
            }
        }
        fVar = new f(hVar, cg6Var);
        Object obj2 = fVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fVar.m;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (a instanceof t7o) {
        }
        aVar = (com.yandex.plus.experiments.api.a) a;
        if (aVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(h hVar, cg6 cg6Var) {
        g gVar;
        int i;
        hVar.getClass();
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gVar.j;
                nm6 nm6Var = nm6.a;
                i = gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ou7 ou7Var = hVar.l;
                    if (ou7Var != null) {
                        gVar.l = 1;
                        if (saf.C(ou7Var, gVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hVar.l = null;
                hVar.k.l(null);
                return Unit.a;
            }
        }
        gVar = new g(hVar, cg6Var);
        Object obj2 = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        if (i != 0) {
        }
        hVar.l = null;
        hVar.k.l(null);
        return Unit.a;
    }

    public final Object d(long j, aur aurVar) {
        Object j0 = x97.y(this.a, this.b, null, new b(this, j, null), 2).j0(aurVar);
        return j0 == nm6.a ? j0 : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r6 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        d dVar;
        int i;
        try {
            if (cg6Var instanceof d) {
                dVar = (d) cg6Var;
                int i2 = dVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = dVar.j;
                    Object obj2 = nm6.a;
                    i = dVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        dVar.l = 1;
                        obj = g(dVar);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            r7o r7oVar = z7o.b;
                            return obj;
                        }
                        qgg.h0(obj);
                    }
                    mu7 mu7Var = (mu7) obj;
                    r7o r7oVar2 = z7o.b;
                    dVar.l = 2;
                    obj = mu7Var.H(dVar);
                }
            }
            if (i != 0) {
            }
            mu7 mu7Var2 = (mu7) obj;
            r7o r7oVar22 = z7o.b;
            dVar.l = 2;
            obj = mu7Var2.H(dVar);
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            return new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th);
        }
        dVar = new d(this, cg6Var);
        Object obj3 = dVar.j;
        Object obj22 = nm6.a;
        i = dVar.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object f() {
        x97.y(this.a, this.b, null, new a(this, 0 == true ? 1 : 0, 2), 2);
        com.yandex.plus.core.d dVar = (com.yandex.plus.core.d) this.k.getValue();
        com.yandex.plus.experiments.api.a aVar = dVar != null ? (com.yandex.plus.experiments.api.a) dVar.getValue() : null;
        if (aVar != null) {
            r7o r7oVar = z7o.b;
            return aVar;
        }
        r7o r7oVar2 = z7o.b;
        return new t7o(new IllegalStateException("No experiments"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:12:0x0042, B:14:0x0046, B:23:0x0053), top: B:11:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(cg6 cg6Var) {
        e eVar;
        int i;
        qqi qqiVar;
        ou7 ou7Var;
        try {
            if (cg6Var instanceof e) {
                eVar = (e) cg6Var;
                int i2 = eVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = eVar.k;
                    nm6 nm6Var = nm6.a;
                    i = eVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar2 = this.j;
                        eVar.j = qqiVar2;
                        eVar.m = 1;
                        if (qqiVar2.a(eVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = eVar.j;
                        qgg.h0(obj);
                    }
                    Continuation continuation = null;
                    ou7Var = this.l;
                    if (ou7Var != null) {
                        if (!ou7Var.b()) {
                            ou7Var = null;
                        }
                        if (ou7Var != null) {
                            return ou7Var;
                        }
                    }
                    ou7Var = x97.p(this.a, this.b, null, new com.yandex.plus.bdui.ui.b(this, continuation, 5), 2);
                    this.l = ou7Var;
                    return ou7Var;
                }
            }
            ou7Var = this.l;
            if (ou7Var != null) {
            }
            ou7Var = x97.p(this.a, this.b, null, new com.yandex.plus.bdui.ui.b(this, continuation, 5), 2);
            this.l = ou7Var;
            return ou7Var;
        } finally {
            qqiVar.b(null);
        }
        eVar = new e(this, cg6Var);
        Object obj2 = eVar.k;
        nm6 nm6Var2 = nm6.a;
        i = eVar.m;
        if (i != 0) {
        }
        Continuation continuation2 = null;
    }
}
