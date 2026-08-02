package com.yandex.plus.adapter.auth.passport750;

import com.yandex.passport.api.a1;
import com.yandex.passport.api.b1;
import com.yandex.passport.api.c1;
import com.yandex.passport.api.d1;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.k;
import com.yandex.passport.api.m1;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.q2;
import com.yandex.passport.api.r;
import com.yandex.passport.api.s;
import com.yandex.passport.api.t;
import com.yandex.passport.api.u;
import com.yandex.passport.api.v;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z0;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.autologin.ui.n;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.entities.p;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.ui.bouncer.o;
import com.yandex.plus.home.common.utils.m;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.eno;
import defpackage.inr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v75;
import defpackage.wis;
import defpackage.x0q;
import defpackage.x7j;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.ydr;
import defpackage.z7o;
import defpackage.zsd;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class i {
    public final com.yandex.passport.api.g a;
    public final xdr b = ydr.a(null);
    public final x0q c = y0q.b(0, 0, null, 7);
    public final m d = (m) m.a.getValue();

    public i(com.yandex.passport.api.g gVar) {
        this.a = gVar;
    }

    public static com.yandex.passport.api.h i(com.yandex.plus.adapter.auth.api.c cVar) {
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            return com.yandex.passport.api.h.e;
        }
        if (ordinal == 1) {
            return com.yandex.passport.api.h.c;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.internal.flags.experiments.d dVar, cg6 cg6Var) {
        a aVar;
        int i;
        Object t;
        try {
            if (cg6Var instanceof a) {
                aVar = (a) cg6Var;
                int i2 = aVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.j;
                    nm6 nm6Var = nm6.a;
                    i = aVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        String str = dVar.b;
                        str.getClass();
                        com.yandex.passport.api.g gVar = this.a;
                        aVar.l = 1;
                        t = gVar.t(str, aVar);
                        if (t == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        t = ((z7o) obj).a;
                    }
                    qgg.h0(t);
                    Unit unit = Unit.a;
                    r7o r7oVar2 = z7o.b;
                    return unit;
                }
            }
            if (i != 0) {
            }
            qgg.h0(t);
            Unit unit2 = Unit.a;
            r7o r7oVar22 = z7o.b;
            return unit2;
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            return new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th);
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[Catch: all -> 0x002b, CancellationException -> 0x002d, wis -> 0x0030, TryCatch #2 {wis -> 0x0030, CancellationException -> 0x002d, all -> 0x002b, blocks: (B:10:0x0023, B:11:0x0066, B:13:0x006c, B:14:0x0083, B:16:0x0089, B:18:0x0095, B:19:0x009a, B:26:0x003c), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.plus.adapter.auth.api.d dVar, cg6 cg6Var) {
        b bVar;
        int i;
        Object m;
        try {
            if (cg6Var instanceof b) {
                bVar = (b) cg6Var;
                int i2 = bVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.j;
                    nm6 nm6Var = nm6.a;
                    i = bVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        com.yandex.passport.api.h i3 = i(dVar.a);
                        long h = h();
                        i3.getClass();
                        com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.a(i3.d());
                        a.getClass();
                        z1 z1Var = new z1(a, h);
                        com.yandex.passport.api.g gVar = this.a;
                        bVar.l = 1;
                        m = gVar.m(z1Var, bVar);
                        if (m == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        m = ((z7o) obj).a;
                    }
                    r7o r7oVar2 = z7o.b;
                    if (!(m instanceof t7o)) {
                        com.yandex.passport.internal.account.f fVar = (com.yandex.passport.internal.account.f) m;
                        boolean z = fVar.g;
                        p pVar = fVar.t;
                        ArrayList arrayList = new ArrayList(v75.o(pVar, 10));
                        Iterator it = pVar.a.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((m1) it.next()).a);
                        }
                        m = new com.yandex.plus.adapter.auth.api.a(arrayList, z);
                    }
                    qgg.h0(m);
                    return m;
                }
            }
            if (i != 0) {
            }
            r7o r7oVar22 = z7o.b;
            if (!(m instanceof t7o)) {
            }
            qgg.h0(m);
            return m;
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            return new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th);
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074 A[Catch: all -> 0x002b, CancellationException -> 0x002d, wis -> 0x002f, TryCatch #2 {wis -> 0x002f, CancellationException -> 0x002d, all -> 0x002b, blocks: (B:10:0x0023, B:11:0x006e, B:13:0x0074, B:14:0x0078, B:21:0x003b), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.plus.adapter.auth.api.e eVar, cg6 cg6Var) {
        c cVar;
        int i;
        Object l;
        try {
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
                        r7o r7oVar = z7o.b;
                        com.yandex.passport.api.h i3 = i(eVar.a);
                        long h = h();
                        i3.getClass();
                        com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.a(i3.d());
                        a.getClass();
                        z1 z1Var = new z1(a, h);
                        com.yandex.passport.internal.credentials.f fVar = new com.yandex.passport.internal.credentials.f(eVar.b, eVar.c);
                        com.yandex.passport.api.g gVar = this.a;
                        cVar.l = 1;
                        l = gVar.l(z1Var, fVar, cVar);
                        if (l == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        l = ((z7o) obj).a;
                    }
                    r7o r7oVar2 = z7o.b;
                    if (!(l instanceof t7o)) {
                        l = ((k) l).a;
                    }
                    qgg.h0(l);
                    return l;
                }
            }
            if (i != 0) {
            }
            r7o r7oVar22 = z7o.b;
            if (!(l instanceof t7o)) {
            }
            qgg.h0(l);
            return l;
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            return new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th);
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(com.yandex.plus.adapter.auth.api.e eVar, cg6 cg6Var) {
        d dVar;
        int i;
        Object k;
        try {
            if (cg6Var instanceof d) {
                dVar = (d) cg6Var;
                int i2 = dVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = dVar.j;
                    nm6 nm6Var = nm6.a;
                    i = dVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        com.yandex.passport.api.h i3 = i(eVar.a);
                        long h = h();
                        i3.getClass();
                        com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.a(i3.d());
                        a.getClass();
                        z1 z1Var = new z1(a, h);
                        com.yandex.passport.api.g gVar = this.a;
                        o oVar = new o(19, z1Var, eVar);
                        dVar.l = 1;
                        k = gVar.k(oVar, dVar);
                        if (k == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        k = ((z7o) obj).a;
                    }
                    qgg.h0(k);
                    r7o r7oVar2 = z7o.b;
                    return k;
                }
            }
            if (i != 0) {
            }
            qgg.h0(k);
            r7o r7oVar22 = z7o.b;
            return k;
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
        Object obj2 = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(com.yandex.plus.adapter.auth.api.d dVar, cg6 cg6Var) {
        e eVar;
        int i;
        Object a;
        try {
            if (cg6Var instanceof e) {
                eVar = (e) cg6Var;
                int i2 = eVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = eVar.j;
                    nm6 nm6Var = nm6.a;
                    i = eVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        com.yandex.passport.api.h i3 = i(dVar.a);
                        long h = h();
                        i3.getClass();
                        com.yandex.passport.api.impl.b a2 = com.yandex.passport.api.impl.b.a(i3.d());
                        a2.getClass();
                        z1 z1Var = new z1(a2, h);
                        com.yandex.passport.api.g gVar = this.a;
                        eVar.l = 1;
                        a = gVar.a(z1Var, eVar);
                        if (a == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        a = ((z7o) obj).a;
                    }
                    qgg.h0(a);
                    r7o r7oVar2 = z7o.b;
                    return a;
                }
            }
            if (i != 0) {
            }
            qgg.h0(a);
            r7o r7oVar22 = z7o.b;
            return a;
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            return new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th);
        }
        eVar = new e(this, cg6Var);
        Object obj2 = eVar.j;
        nm6 nm6Var2 = nm6.a;
        i = eVar.l;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(2:11|12)(2:14|15))(2:16|17))(5:46|47|(1:(1:(1:51)(2:55|56))(1:57))(1:58)|52|(2:54|25))|18|(3:20|21|(2:23|(1:25)(1:26))(1:27))(2:28|(2:30|(2:32|(2:34|(2:36|37)(2:38|39))(2:40|41))(2:42|43))(2:44|45))))|66|6|7|(0)(0)|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0043, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0108, code lost:
    
        r10 = defpackage.z7o.b;
        r10 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0105, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0040, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0107, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x003d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fe, code lost:
    
        r10 = defpackage.z7o.b;
        r10 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8 A[Catch: all -> 0x003d, CancellationException -> 0x0040, wis -> 0x0043, TryCatch #2 {wis -> 0x0043, CancellationException -> 0x0040, all -> 0x003d, blocks: (B:17:0x0038, B:18:0x00b2, B:20:0x00b8, B:28:0x00c7, B:30:0x00cb, B:32:0x00cf, B:34:0x00d3, B:36:0x00d7, B:37:0x00dd, B:38:0x00de, B:39:0x00e3, B:40:0x00e4, B:41:0x00e9, B:42:0x00ea, B:43:0x00f5, B:44:0x00f6, B:45:0x00fd, B:47:0x0049, B:51:0x0076, B:52:0x0084, B:55:0x0079, B:56:0x007e, B:57:0x007f, B:58:0x0082), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7 A[Catch: all -> 0x003d, CancellationException -> 0x0040, wis -> 0x0043, TryCatch #2 {wis -> 0x0043, CancellationException -> 0x0040, all -> 0x003d, blocks: (B:17:0x0038, B:18:0x00b2, B:20:0x00b8, B:28:0x00c7, B:30:0x00cb, B:32:0x00cf, B:34:0x00d3, B:36:0x00d7, B:37:0x00dd, B:38:0x00de, B:39:0x00e3, B:40:0x00e4, B:41:0x00e9, B:42:0x00ea, B:43:0x00f5, B:44:0x00f6, B:45:0x00fd, B:47:0x0049, B:51:0x0076, B:52:0x0084, B:55:0x0079, B:56:0x007e, B:57:0x007f, B:58:0x0082), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(com.yandex.plus.adapter.auth.api.f fVar, cg6 cg6Var) {
        f fVar2;
        int i;
        y1 y1Var;
        v vVar;
        if (cg6Var instanceof f) {
            fVar2 = (f) cg6Var;
            int i2 = fVar2.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar2.m = i2 - Integer.MIN_VALUE;
                Object obj = fVar2.k;
                nm6 nm6Var = nm6.a;
                i = fVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    j jVar = new j();
                    jVar.L(null);
                    jVar.N(i(fVar.a));
                    com.yandex.passport.internal.entities.k l = jVar.l();
                    com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k();
                    kVar.b(null);
                    kVar.b = l;
                    int ordinal = fVar.b.ordinal();
                    if (ordinal == 0) {
                        y1Var = y1.a;
                    } else if (ordinal == 1) {
                        y1Var = y1.b;
                    } else {
                        if (ordinal != 2) {
                            throw new x7j();
                        }
                        y1Var = y1.d;
                    }
                    kVar.f = y1Var;
                    l t = com.yandex.plus.pay.ui.core.b.t(kVar);
                    n nVar = new n(this.a.i().a, 2);
                    m mVar = this.d;
                    mVar.getClass();
                    eno enoVar = new eno(new inr(mVar, nVar, t, (Continuation) null));
                    fVar2.j = null;
                    fVar2.m = 1;
                    obj = zsd.g0(enoVar, fVar2);
                    if (obj == nm6Var) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Serializable serializable = fVar2.j;
                        qgg.h0(obj);
                        return serializable;
                    }
                    qgg.h0(obj);
                }
                vVar = (v) obj;
                if (vVar instanceof t) {
                    if (vVar instanceof u) {
                        throw new com.yandex.plus.adapter.auth.api.b("Operation `OpenUrl` is unsupported!");
                    }
                    if (vVar instanceof r) {
                        throw new com.yandex.plus.adapter.auth.api.b("Other error", ((r) vVar).a);
                    }
                    if (vVar instanceof s) {
                        throw new com.yandex.plus.adapter.auth.api.b(1);
                    }
                    if (vVar instanceof com.yandex.passport.api.p) {
                        throw new com.yandex.plus.adapter.auth.api.b(0);
                    }
                    throw new x7j();
                }
                Object l2 = new Long(((t) vVar).a.b);
                r7o r7oVar2 = z7o.b;
                Object obj2 = l2;
                if (obj2 instanceof t7o) {
                    return obj2;
                }
                long longValue = ((Number) obj2).longValue();
                Long l3 = new Long(longValue);
                xdr xdrVar = this.b;
                xdrVar.getClass();
                xdrVar.m(null, l3);
                com.yandex.plus.adapter.auth.passport.api.a aVar = new com.yandex.plus.adapter.auth.passport.api.a(longValue);
                fVar2.j = (Serializable) obj2;
                fVar2.m = 2;
                return this.c.emit(aVar, fVar2) == nm6Var ? nm6Var : obj2;
            }
        }
        fVar2 = new f(this, cg6Var);
        Object obj3 = fVar2.k;
        nm6 nm6Var2 = nm6.a;
        i = fVar2.m;
        if (i != 0) {
        }
        vVar = (v) obj3;
        if (vVar instanceof t) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(2:11|12)(2:14|15))(2:16|17))(6:42|43|(1:(1:(1:47)(2:52|53))(1:54))(1:55)|48|49|(2:51|39))|18|(2:20|(2:22|(2:24|(2:26|27)(2:28|29))(2:30|31))(2:32|33))(3:34|35|(2:37|(1:39)(1:40))(1:41))))|63|6|7|(0)(0)|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0049, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0046, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0104, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0043, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fb, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb A[Catch: all -> 0x0043, CancellationException -> 0x0046, wis -> 0x0049, TryCatch #2 {wis -> 0x0049, CancellationException -> 0x0046, all -> 0x0043, blocks: (B:17:0x003e, B:18:0x00c5, B:20:0x00cb, B:22:0x00cf, B:24:0x00d3, B:26:0x00d7, B:27:0x00dd, B:28:0x00de, B:29:0x00e3, B:30:0x00e4, B:31:0x00e9, B:32:0x00ea, B:33:0x00f5, B:34:0x00f6, B:43:0x004f, B:47:0x007b, B:49:0x008c, B:52:0x0080, B:53:0x0085, B:54:0x0086, B:55:0x0089), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6 A[Catch: all -> 0x0043, CancellationException -> 0x0046, wis -> 0x0049, TRY_LEAVE, TryCatch #2 {wis -> 0x0049, CancellationException -> 0x0046, all -> 0x0043, blocks: (B:17:0x003e, B:18:0x00c5, B:20:0x00cb, B:22:0x00cf, B:24:0x00d3, B:26:0x00d7, B:27:0x00dd, B:28:0x00de, B:29:0x00e3, B:30:0x00e4, B:31:0x00e9, B:32:0x00ea, B:33:0x00f5, B:34:0x00f6, B:43:0x004f, B:47:0x007b, B:49:0x008c, B:52:0x0080, B:53:0x0085, B:54:0x0086, B:55:0x0089), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(com.yandex.plus.adapter.auth.api.f fVar, cg6 cg6Var) {
        g gVar;
        int i;
        y1 y1Var;
        d1 d1Var;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = gVar.k;
                nm6 nm6Var = nm6.a;
                i = gVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    y1 y1Var2 = y1.a;
                    j2 j2Var = new j2();
                    q2 q2Var = q2.a;
                    n2 n2Var = n2.a;
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    z1 d = com.yandex.plus.core.locale.b.d(i(fVar.a), h());
                    int ordinal = fVar.b.ordinal();
                    if (ordinal == 0) {
                        y1Var = y1.a;
                    } else if (ordinal == 1) {
                        y1Var = y1.b;
                    } else {
                        if (ordinal != 2) {
                            throw new x7j();
                        }
                        y1Var = y1.d;
                    }
                    com.yandex.passport.internal.properties.u uVar = new com.yandex.passport.internal.properties.u(com.yandex.passport.internal.ui.a.D(d), y1Var, null, true, new com.yandex.passport.internal.properties.v(j2Var, q2Var, n2Var, true), e5bVar);
                    n nVar = new n(this.a.i().a, 11);
                    m mVar = this.d;
                    mVar.getClass();
                    eno enoVar = new eno(new inr(mVar, nVar, uVar, (Continuation) null));
                    gVar.j = null;
                    gVar.m = 1;
                    obj = zsd.g0(enoVar, gVar);
                    if (obj == nm6Var) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = gVar.j;
                        qgg.h0(obj);
                        return obj2;
                    }
                    qgg.h0(obj);
                }
                d1Var = (d1) obj;
                if (d1Var instanceof c1) {
                    if (d1Var instanceof a1) {
                        throw new com.yandex.plus.adapter.auth.api.b("Other error", ((a1) d1Var).a);
                    }
                    if (d1Var instanceof b1) {
                        throw new com.yandex.plus.adapter.auth.api.b(1);
                    }
                    if (d1Var instanceof z0) {
                        throw new com.yandex.plus.adapter.auth.api.b(0);
                    }
                    throw new x7j();
                }
                Object obj3 = Unit.a;
                r7o r7oVar2 = z7o.b;
                if (obj3 instanceof t7o) {
                    return obj3;
                }
                this.b.l(null);
                gVar.j = obj3;
                gVar.m = 2;
                return this.c.emit(com.yandex.plus.adapter.auth.passport.api.b.b, gVar) == nm6Var ? nm6Var : obj3;
            }
        }
        gVar = new g(this, cg6Var);
        Object obj4 = gVar.k;
        nm6 nm6Var2 = nm6.a;
        i = gVar.m;
        if (i != 0) {
        }
        d1Var = (d1) obj4;
        if (d1Var instanceof c1) {
        }
    }

    public final long h() {
        Object value = this.b.getValue();
        if (value != null) {
            return ((Number) value).longValue();
        }
        xq0.q("userId is not specified!");
        return 0L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(5:11|12|13|14|16)(2:19|20))(3:21|22|23))(3:29|30|(2:32|28)(1:33))|24|(1:26)|14|16))|7|(0)(0)|24|(0)|14|16) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0030, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r12 = defpackage.z7o.b;
        r12 = new defpackage.t7o(r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x0027, B:12:0x00b9, B:26:0x009e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(com.yandex.passport.common.network.n nVar, cg6 cg6Var) {
        h hVar;
        int i;
        t7o t7oVar;
        Object t7oVar2;
        int i2;
        i iVar;
        z1 z1Var;
        int i3;
        Object c;
        try {
            if (cg6Var instanceof h) {
                hVar = (h) cg6Var;
                int i4 = hVar.q;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    hVar.q = i4 - Integer.MIN_VALUE;
                    Object obj = hVar.o;
                    nm6 nm6Var = nm6.a;
                    i = hVar.q;
                    if (i != 0) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        com.yandex.passport.api.h i5 = i((com.yandex.plus.adapter.auth.api.c) nVar.b);
                        long h = h();
                        i5.getClass();
                        com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.a(i5.d());
                        a.getClass();
                        z1 z1Var2 = new z1(a, h);
                        com.yandex.passport.api.g gVar = this.a;
                        String str = (String) nVar.c;
                        hVar.j = nVar;
                        hVar.k = this;
                        hVar.l = z1Var2;
                        i2 = 0;
                        hVar.m = 0;
                        hVar.n = 0;
                        hVar.q = 1;
                        t7oVar2 = gVar.j(z1Var2, str, hVar);
                        if (t7oVar2 == nm6Var) {
                            return nm6Var;
                        }
                        iVar = this;
                        z1Var = z1Var2;
                        i3 = 0;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            c = ((z7o) obj).a;
                            qgg.h0(c);
                            Unit unit = Unit.a;
                            r7o r7oVar2 = z7o.b;
                            t7oVar2 = unit;
                            qgg.h0(t7oVar2);
                            return Unit.a;
                        }
                        int i6 = hVar.n;
                        i3 = hVar.m;
                        z1Var = hVar.l;
                        iVar = hVar.k;
                        com.yandex.passport.common.network.n nVar2 = hVar.j;
                        qgg.h0(obj);
                        t7oVar2 = ((z7o) obj).a;
                        i2 = i6;
                        nVar = nVar2;
                    }
                    r7o r7oVar3 = z7o.b;
                    if (!(t7oVar2 instanceof t7o)) {
                        com.yandex.passport.api.g gVar2 = iVar.a;
                        String str2 = (String) nVar.c;
                        hVar.j = null;
                        hVar.k = null;
                        hVar.l = null;
                        hVar.m = i3;
                        hVar.n = i2;
                        hVar.q = 2;
                        c = gVar2.c(z1Var, str2, hVar);
                    }
                    qgg.h0(t7oVar2);
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            r7o r7oVar32 = z7o.b;
            if (!(t7oVar2 instanceof t7o)) {
            }
            qgg.h0(t7oVar2);
            return Unit.a;
        } catch (wis e) {
            r7o r7oVar4 = z7o.b;
            t7oVar = new t7o(e);
            return t7oVar;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar5 = z7o.b;
            t7oVar = new t7o(th);
            return t7oVar;
        }
        hVar = new h(this, cg6Var);
        Object obj2 = hVar.o;
        nm6 nm6Var2 = nm6.a;
        i = hVar.q;
    }
}
