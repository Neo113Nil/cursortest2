package com.yandex.plus.bdui.flex.ui;

import com.yandex.passport.internal.report.we;
import defpackage.aa0;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.gld;
import defpackage.jqj;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.o91;
import defpackage.ps;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rar;
import defpackage.t7o;
import defpackage.v3a;
import defpackage.wis;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class n {
    public final Object a;
    public final com.yandex.plus.bdui.m b;
    public final ps c;
    public final o91 d;
    public final com.yandex.plus.bdui.plus.checkout.o e;
    public final kotlinx.coroutines.a f;
    public final kotlinx.coroutines.a g;
    public final mm6 h;
    public final com.yandex.plus.log.api.b i;
    public i j;
    public final LinkedHashMap k;
    public com.yandex.passport.internal.ui.challenge.vpn.c l;

    public n(v3a v3aVar, com.yandex.plus.bdui.m mVar, ps psVar, o91 o91Var, com.yandex.plus.bdui.plus.checkout.o oVar, kotlinx.coroutines.a aVar, kotlinx.coroutines.a aVar2, mm6 mm6Var, com.yandex.plus.log.api.b bVar) {
        v3aVar.getClass();
        mVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        mm6Var.getClass();
        bVar.getClass();
        this.a = v3aVar;
        this.b = mVar;
        this.c = psVar;
        this.d = o91Var;
        this.e = oVar;
        this.f = aVar;
        this.g = aVar2;
        this.h = mm6Var;
        this.i = bVar;
        this.j = g.c;
        this.k = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r9.c(r10, r1) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008d, code lost:
    
        if (r12 == r2) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(n nVar, mm6 mm6Var, Collection collection, cg6 cg6Var) {
        k kVar;
        int i;
        rar rarVar;
        f fVar;
        com.yandex.plus.log.api.b bVar = nVar.i;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.m = i2 - Integer.MIN_VALUE;
                Object obj = kVar.k;
                Object obj2 = nm6.a;
                i = kVar.m;
                Object[] objArr = 0;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "executeUpdateTasks(); update tasks size = " + collection.size());
                    }
                    com.yandex.passport.internal.entities.j jVar = ((p) CollectionsKt.P(collection)).a.r;
                    if (jVar != null) {
                        if (bVar.b(aVar)) {
                            bVar.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "executeUpdateTasks(); start preview job");
                        }
                        rarVar = x97.y(mm6Var, null, null, new com.yandex.passport.internal.ui.sloth.q((Object) nVar, (Object) jVar, (Continuation) (objArr == true ? 1 : 0), 24), 3);
                    } else {
                        rarVar = null;
                    }
                    kVar.j = rarVar;
                    kVar.m = 1;
                    obj = nVar.h(collection, kVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rarVar = kVar.j;
                    qgg.h0(obj);
                }
                fVar = (f) obj;
                if (rarVar != null) {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar2)) {
                        bVar.c(aVar2, "PlusUiControllerUpdateCoordinatorImpl", "executeUpdateTasks(); cancel preview job");
                    }
                    rarVar.g(null);
                }
                if (fVar instanceof e) {
                    if (!(fVar instanceof d)) {
                        b6e.s();
                        return null;
                    }
                    d dVar = (d) fVar;
                    p pVar = dVar.b;
                    Throwable th = dVar.a;
                    if (pVar != null) {
                        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                        if (bVar.b(aVar3)) {
                            bVar.a(aVar3, "PlusUiControllerUpdateCoordinatorImpl", "handleUpdateErrors(); prepare update for " + pVar.a.c + " failed!", th);
                        }
                    } else {
                        com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
                        if (bVar.b(aVar4)) {
                            bVar.a(aVar4, "PlusUiControllerUpdateCoordinatorImpl", "handleUpdateErrors(); prepare updates failed!", th);
                        }
                    }
                    nVar.g(pVar != null ? pVar.b : null, pVar != null ? pVar.c : null, th);
                    return Unit.a;
                }
                List list = ((e) fVar).a;
                kVar.j = null;
                kVar.m = 2;
            }
        }
        kVar = new k(nVar, cg6Var);
        Object obj3 = kVar.k;
        Object obj22 = nm6.a;
        i = kVar.m;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        fVar = (f) obj3;
        if (rarVar != null) {
        }
        if (fVar instanceof e) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:21|22))(4:23|(1:25)|26|(1:28))|12|13|(2:15|16)(2:18|19)))|35|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        r7 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        r7 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(n nVar, p pVar, cg6 cg6Var) {
        l lVar;
        int i;
        Throwable a;
        if (cg6Var instanceof l) {
            lVar = (l) cg6Var;
            int i2 = lVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.m = i2 - Integer.MIN_VALUE;
                Object obj = lVar.k;
                nm6 nm6Var = nm6.a;
                i = lVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.b bVar = nVar.i;
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "prepareUpdateSafe(); preparing update for " + pVar.a.c + "...");
                    }
                    r7o r7oVar = z7o.b;
                    we weVar = pVar.d;
                    com.yandex.plus.bdui.shared.b bVar2 = pVar.c;
                    lVar.j = pVar;
                    lVar.m = 1;
                    obj = weVar.invoke(bVar2, lVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = lVar.j;
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a == null) {
                    throw new c(pVar, a);
                }
                qgg.h0(obj);
                return obj;
            }
        }
        lVar = new l(nVar, cg6Var);
        Object obj2 = lVar.k;
        nm6 nm6Var2 = nm6.a;
        i = lVar.m;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj2);
        if (a == null) {
        }
    }

    public static boolean f(i iVar) {
        return !iVar.equals(g.c);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:33|34|(1:36)|37|38|(1:40)(6:41|12|13|(0)|21|(1:22))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        r9 = r12;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
    
        r9 = r12;
        r8 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b5 -> B:12:0x00b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, cg6 cg6Var) {
        j jVar;
        int i;
        int i2;
        Iterator it;
        Object t7oVar;
        Throwable a;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i3 = jVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.p = i3 - Integer.MIN_VALUE;
                Object obj = jVar.n;
                nm6 nm6Var = nm6.a;
                i = jVar.p;
                com.yandex.plus.log.api.b bVar = this.i;
                if (i != 0) {
                    qgg.h0(obj);
                    i2 = 0;
                    it = CollectionsKt.j0(list).iterator();
                    while (it.hasNext()) {
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = jVar.m;
                com.yandex.plus.bdui.shared.b bVar2 = jVar.l;
                p pVar = jVar.k;
                it = jVar.j;
                try {
                    try {
                        qgg.h0(obj);
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (wis e2) {
                    e = e2;
                    r7o r7oVar = z7o.b;
                    t7oVar = new t7o(e);
                    a = z7o.a(t7oVar);
                    if (a != null) {
                    }
                    while (it.hasNext()) {
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    th = th;
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                    a = z7o.a(t7oVar);
                    if (a != null) {
                    }
                    while (it.hasNext()) {
                    }
                    return Unit.a;
                }
                t7oVar = Unit.a;
                r7o r7oVar3 = z7o.b;
                a = z7o.a(t7oVar);
                if (a != null) {
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "applyUpdates(); apply update for " + pVar.a.c + " failed!");
                    }
                    g(pVar.b, bVar2, a);
                    return Unit.a;
                }
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    p pVar2 = (p) pair.a;
                    com.yandex.plus.bdui.shared.b bVar3 = (com.yandex.plus.bdui.shared.b) pair.b;
                    b bVar4 = pVar2.a;
                    com.yandex.plus.bdui.ui.c cVar = bVar4.c;
                    com.yandex.passport.internal.entities.j jVar2 = bVar4.r;
                    if (jVar2 != null) {
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar2)) {
                            bVar.c(aVar2, "PlusUiControllerUpdateCoordinatorImpl", "applyUpdates(); applying update for " + cVar + "...");
                        }
                        r7o r7oVar4 = z7o.b;
                        aa0 aa0Var = new aa0(pVar2, bVar3, jVar2, null, 13);
                        jVar.getClass();
                        jVar.j = it;
                        jVar.k = pVar2;
                        jVar.l = bVar3;
                        jVar.m = i2;
                        jVar.p = 1;
                        if (jVar2.P(aa0Var, jVar) == nm6Var) {
                            return nm6Var;
                        }
                        pVar = pVar2;
                        bVar2 = bVar3;
                        t7oVar = Unit.a;
                        r7o r7oVar32 = z7o.b;
                        a = z7o.a(t7oVar);
                        if (a != null) {
                        }
                        while (it.hasNext()) {
                        }
                    } else {
                        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
                        if (bVar.b(aVar3)) {
                            bVar.c(aVar3, "PlusUiControllerUpdateCoordinatorImpl", "applyUpdates(); no views for " + cVar + '!');
                        }
                    }
                }
                return Unit.a;
            }
        }
        jVar = new j(this, cg6Var);
        Object obj2 = jVar.n;
        nm6 nm6Var2 = nm6.a;
        i = jVar.p;
        com.yandex.plus.log.api.b bVar5 = this.i;
        if (i != 0) {
        }
    }

    public final void d() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.i;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "cancelUpdate(); state = " + this.j);
        }
        i iVar = this.j;
        h hVar = iVar instanceof h ? (h) iVar : null;
        if (hVar != null) {
            if (bVar.b(aVar)) {
                bVar.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "cancelUpdate(); cancel update job");
            }
            hVar.a.g(null);
        }
        this.j = g.a;
    }

    public final void e(Function1 function1) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.i;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "executeAfterUpdate()");
        }
        x97.y(this.h, this.f, null, new jqj(function1, (Continuation) null, 4), 2);
    }

    public final void g(com.yandex.plus.bdui.query.e eVar, com.yandex.plus.bdui.shared.b bVar, Throwable th) {
        boolean booleanValue = ((Boolean) this.c.invoke()).booleanValue();
        com.yandex.plus.bdui.m mVar = this.b;
        com.yandex.plus.log.api.b bVar2 = this.i;
        if (booleanValue) {
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
            if (bVar2.b(aVar)) {
                bVar2.a(aVar, "PlusUiControllerUpdateCoordinatorImpl", "Update content failed! Handle engine critical error...", th);
            }
            this.d.invoke(mVar, eVar, null);
            return;
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
        if (bVar2.b(aVar2)) {
            bVar2.a(aVar2, "PlusUiControllerUpdateCoordinatorImpl", "Update content failed! Fallback to onErrorAction...", th);
        }
        com.yandex.plus.bdui.action.a a = this.e.a(th);
        com.yandex.plus.bdui.action.c cVar = mVar.a;
        if (bVar == null) {
            bVar = com.yandex.plus.bdui.shared.b.a;
        }
        cVar.a(a, new com.yandex.plus.bdui.action.h(bVar), null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:35|36))(3:37|38|(1:40))|11|12|(1:14)(1:33)|15|(2:17|18)(2:20|(3:22|(1:24)(1:30)|(2:26|27)(2:28|29))(2:31|32))))|47|6|7|(0)(0)|11|12|(0)(0)|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        r7 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0054, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004c, code lost:
    
        r7 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Collection collection, cg6 cg6Var) {
        m mVar;
        int i;
        List list;
        if (cg6Var instanceof m) {
            mVar = (m) cg6Var;
            int i2 = mVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.l = i2 - Integer.MIN_VALUE;
                Object obj = mVar.j;
                nm6 nm6Var = nm6.a;
                i = mVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    we weVar = new we(collection, this, continuation, 19);
                    mVar.l = 1;
                    obj = gld.Q(weVar, mVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                list = (List) (!(obj instanceof t7o) ? null : obj);
                if (list == null) {
                    return new e(list);
                }
                Throwable a = z7o.a(obj);
                if (a == null) {
                    return new d(null, new IllegalStateException("Result must has value or exception!"));
                }
                c cVar = a instanceof c ? (c) a : null;
                if (cVar != null) {
                    return new d(cVar.a, cVar.b);
                }
                return new d(null, a);
            }
        }
        mVar = new m(this, cg6Var);
        Object obj2 = mVar.j;
        nm6 nm6Var2 = nm6.a;
        i = mVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        list = (List) (!(obj2 instanceof t7o) ? null : obj2);
        if (list == null) {
        }
    }

    public final void i(rar rarVar, Function1 function1) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.i;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "Job.scheduleAfterUpdate(); action ".concat(function1 != null ? "is not null" : "is null"));
        }
        rarVar.R(new com.yandex.passport.internal.ui.bouncer.o(23, this, function1));
    }
}
