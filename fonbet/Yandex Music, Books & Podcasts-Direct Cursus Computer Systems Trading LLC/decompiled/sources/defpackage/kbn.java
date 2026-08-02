package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kbn {
    public final rmg a;
    public final frt b;
    public final oq7 c;
    public final cbn d;
    public final s6o e;
    public final b7o f;
    public final aiw g;
    public final List h;
    public final jyr i;
    public final jyr j;
    public final ReentrantLock k;
    public final xdr l;
    public final rjq m;
    public final um6 n;
    public final AtomicBoolean o;
    public rar p;
    public final bca q;
    public final tc4 r;
    public final tc4 s;
    public rar t;

    public kbn(rmg rmgVar, frt frtVar, oq7 oq7Var, lrc lrcVar, z66 z66Var, cbn cbnVar, t5v t5vVar, s6o s6oVar, b7o b7oVar, aiw aiwVar, List list) {
        list.getClass();
        this.a = rmgVar;
        this.b = frtVar;
        this.c = oq7Var;
        this.d = cbnVar;
        this.e = s6oVar;
        this.f = b7oVar;
        this.g = aiwVar;
        this.h = list;
        final int i = 0;
        this.i = btf.b(new Function0(this) { // from class: dbn
            public final /* synthetic */ kbn b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.b.a.a;
                    default:
                        return this.b.a.c;
                }
            }
        });
        final int i2 = 1;
        this.j = btf.b(new Function0(this) { // from class: dbn
            public final /* synthetic */ kbn b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.b.a.a;
                    default:
                        return this.b.a.c;
                }
            }
        });
        this.k = new ReentrantLock();
        this.l = ydr.a(t6o.a);
        rjq rjqVar = new rjq(false);
        this.m = rjqVar;
        this.n = hld.s(rjqVar, dm6.b);
        this.o = new AtomicBoolean(false);
        int i3 = 3;
        List h = u75.h(new prc(frtVar), new prc(z66Var), new prc(lrcVar), new prc(s6oVar));
        int i4 = 10;
        ArrayList arrayList = new ArrayList(v75.o(h, 10));
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(((d7o) it.next()).a());
        }
        pjc t0 = zsd.t0(arrayList);
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.q = new bca(((r92) ((byb) qdcVar.C(I)).b(r92.class)).h() ? t0 : new u21(i4, t0, new bca(frc.a.g, 20), new ng2(i3, i2, null)), 18);
        List list2 = this.h;
        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((d7o) it2.next()).a());
        }
        this.r = zsd.t0(CollectionsKt.h0(arrayList2, this.q));
        this.s = zsd.u0(new f9l(i4, new h0m(this.c.a.c, 27)), new f9l(16, new y4s(zsd.b0(new y4s(this.b.g(), 8)), 7)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(kbn kbnVar, String str, cg6 cg6Var) {
        ibn ibnVar;
        Object obj;
        int i;
        xdr xdrVar = kbnVar.l;
        if (cg6Var instanceof ibn) {
            ibnVar = (ibn) cg6Var;
            int i2 = ibnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ibnVar.l = i2 - Integer.MIN_VALUE;
                obj = ibnVar.j;
                nm6 nm6Var = nm6.a;
                i = ibnVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    qmg qmgVar = (qmg) ((jmg) kbnVar.j.getValue());
                    qmgVar.getClass();
                    str.getClass();
                    qmgVar.k = str;
                    wmg wmgVar = (wmg) kbnVar.i.getValue();
                    ibnVar.l = 1;
                    obj = wmgVar.a(ibnVar);
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
                if (((Boolean) obj).booleanValue()) {
                    t6o t6oVar = t6o.c;
                    xdrVar.getClass();
                    xdrVar.m(null, t6oVar);
                    return Boolean.TRUE;
                }
                t6o t6oVar2 = t6o.b;
                xdrVar.getClass();
                xdrVar.m(null, t6oVar2);
                return Boolean.TRUE;
            }
        }
        ibnVar = new ibn(kbnVar, cg6Var);
        obj = ibnVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ibnVar.l;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        fbn fbnVar;
        Object obj;
        int i;
        if (cg6Var instanceof fbn) {
            fbnVar = (fbn) cg6Var;
            int i2 = fbnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fbnVar.l = i2 - Integer.MIN_VALUE;
                obj = fbnVar.j;
                nm6 nm6Var = nm6.a;
                i = fbnVar.l;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    fbnVar.l = 1;
                    obj = this.e.a(fbnVar);
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
                if (((Boolean) obj).booleanValue()) {
                    ssg.a(4, "QueueRestoreFacade", "Restore forbidden by restrictions", null);
                    return Boolean.FALSE;
                }
                y7q y7qVar = (y7q) this.c.b.f.a.getValue();
                if (!Intrinsics.d(y7qVar, v7q.a)) {
                    if (Intrinsics.d(y7qVar, u7q.a)) {
                        ssg.a(4, "QueueRestoreFacade", "Queue usage is active", null);
                    } else if (Intrinsics.d(y7qVar, w7q.a)) {
                        ssg.a(4, "QueueRestoreFacade", "Queue usage is launching", null);
                    } else {
                        if (!(y7qVar instanceof x7q)) {
                            b6e.s();
                            return null;
                        }
                        ssg.a(4, "QueueRestoreFacade", "Queue usage is preparing", null);
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        fbnVar = new fbn(this, cg6Var);
        obj = fbnVar.j;
        nm6 nm6Var2 = nm6.a;
        i = fbnVar.l;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        hbn hbnVar;
        Object obj;
        int i;
        if (cg6Var instanceof hbn) {
            hbnVar = (hbn) cg6Var;
            int i2 = hbnVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hbnVar.m = i2 - Integer.MIN_VALUE;
                obj = hbnVar.k;
                Object obj2 = nm6.a;
                i = hbnVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(4, "QueueRestoreFacade", "restoreQueue  trigger=" + str, null);
                    hbnVar.j = str;
                    hbnVar.m = 1;
                    obj = b(hbnVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = hbnVar.j;
                    qgg.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Unit.a;
                }
                ReentrantLock reentrantLock = this.k;
                reentrantLock.lock();
                try {
                    rar rarVar = this.p;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    this.p = x97.y(this.n, dm6.b, null, new s1n(this, str, continuation, 10), 2);
                    reentrantLock.unlock();
                    return Unit.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        hbnVar = new hbn(this, cg6Var);
        obj = hbnVar.k;
        Object obj22 = nm6.a;
        i = hbnVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void d(String str, boolean z) {
        ssg.a(4, "QueueRestoreFacade", "try restore reason=".concat(str), null);
        x97.y(this.n, null, null, new cg1(this, str, z, (Continuation) null, 17), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x02d4, code lost:
    
        if (r1 == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x023c, code lost:
    
        if (c(r3, r4) == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0220, code lost:
    
        if (r3 != r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0077, code lost:
    
        if (c(r1, r4) == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020c, code lost:
    
        if (kotlin.Unit.a == r5) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, boolean z, Continuation continuation) {
        jbn jbnVar;
        int i;
        boolean z2;
        String str2;
        cbn cbnVar;
        int ordinal;
        Object obj;
        String str3 = str;
        if (continuation instanceof jbn) {
            jbnVar = (jbn) continuation;
            int i2 = jbnVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jbnVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = jbnVar.l;
                Object obj3 = nm6.a;
                i = jbnVar.n;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (z) {
                        if (str3 == null) {
                            str3 = "unknown";
                        }
                        jbnVar.j = null;
                        jbnVar.k = z;
                        jbnVar.n = 1;
                    } else {
                        int ordinal2 = this.f.b.a().ordinal();
                        if (ordinal2 != 0 && ordinal2 != 1) {
                            if (ordinal2 != 2 && ordinal2 != 3 && ordinal2 != 4 && ordinal2 != 5) {
                                b6e.s();
                                return null;
                            }
                            aiw aiwVar = this.g;
                            String str4 = str3 == null ? "unknown" : str3;
                            jbnVar.j = str3;
                            jbnVar.k = z;
                            jbnVar.n = 2;
                            afw afwVar = (afw) aiwVar.a.getValue();
                            afwVar.getClass();
                            l18 l18Var = l18.b;
                            if (!afwVar.a.d.a()) {
                                afwVar.a.g();
                                ssg.a(4, afw.l, "initialized by ".concat(str4), null);
                                qmg qmgVar = (qmg) afwVar.c();
                                qmgVar.getClass();
                                qmgVar.k = str4;
                                bdt I = hag.I(byb.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                if (((g80) ((byb) qdcVar.C(I)).b(g80.class)).h()) {
                                    ox6.B(afwVar.a().e(), afwVar.b, new vew(afwVar, 1));
                                } else {
                                    ((qmg) afwVar.c()).i();
                                    ox6.B(zsd.H0(afwVar.a().e(), 1), afwVar.b, new vew(afwVar, 2));
                                }
                                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                mrw mrwVar = (mrw) afwVar.i.getValue();
                                mrwVar.getClass();
                                bdt I2 = hag.I(byb.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                ox6.B(zsd.M0(((qgw) ((byb) qdcVar2.C(I2)).c(ern.a(qgw.class))).e, new j0v(continuation2, mrwVar, 10)), mrwVar.a, new zqw(mrwVar, 0));
                                xdr xdrVar = ((mrw) afwVar.i.getValue()).n;
                                d9w d9wVar = new d9w(11);
                                rea reaVar = q6k.g;
                                ox6.B(new ub7(12, q6k.m(xdrVar, d9wVar, reaVar), new d4t(2, 4, null)), afwVar.b, new azu(10, afwVar, atomicBoolean));
                                bdt I3 = hag.I(byb.class);
                                qdc qdcVar3 = l18Var.a;
                                qdcVar3.getClass();
                                if (((g80) ((byb) qdcVar3.C(I3)).b(g80.class)).h()) {
                                    ox6.B(new e7v(((oq7) afwVar.g.getValue()).a.c, 23), afwVar.b, new lot(24, atomicBoolean));
                                }
                                ox6.B(q6k.m(new f9l(27, new z78(afwVar.a().e(), 7)), new d9w(12), reaVar), afwVar.b, new vew(afwVar, 0));
                            }
                        }
                        z2 = z;
                        str2 = str;
                        b7o b7oVar = this.f;
                        jbnVar.j = str2;
                        jbnVar.k = z2;
                        jbnVar.n = 3;
                        obj2 = b7oVar.a(jbnVar);
                    }
                    return obj3;
                }
                if (i == 1) {
                    qgg.h0(obj2);
                    return Unit.a;
                }
                if (i == 2) {
                    z2 = jbnVar.k;
                    str2 = jbnVar.j;
                    qgg.h0(obj2);
                    b7o b7oVar2 = this.f;
                    jbnVar.j = str2;
                    jbnVar.k = z2;
                    jbnVar.n = 3;
                    obj2 = b7oVar2.a(jbnVar);
                } else {
                    if (i == 3) {
                        z2 = jbnVar.k;
                        str2 = jbnVar.j;
                        qgg.h0(obj2);
                        if (((Boolean) obj2).booleanValue()) {
                            String str5 = str2 == null ? "unknown" : str2;
                            jbnVar.j = str2;
                            jbnVar.k = z2;
                            jbnVar.n = 4;
                        }
                        cbnVar = this.f.b;
                        ordinal = cbnVar.a().ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 4) {
                            }
                            if (cbnVar.b() > 0) {
                            }
                        }
                        return Unit.a;
                    }
                    if (i == 4) {
                        z2 = jbnVar.k;
                        str2 = jbnVar.j;
                        qgg.h0(obj2);
                        cbnVar = this.f.b;
                        ordinal = cbnVar.a().ordinal();
                        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                            if (ordinal == 4 && ordinal != 5) {
                                b6e.s();
                                return null;
                            }
                            if (cbnVar.b() > 0) {
                                String str6 = str2 != null ? str2 : "unknown";
                                jbnVar.j = null;
                                jbnVar.k = z2;
                                jbnVar.n = 5;
                                cbn cbnVar2 = this.d;
                                if (cbnVar2.b() < 0) {
                                    long b = cbnVar2.b();
                                    StringBuilder sb = new StringBuilder("restoreAfterDelay canceled, because config.restoreYnisonTimeout()=");
                                    sb.append(b);
                                    sb.append(" (by trigger=");
                                    sb.append(str6);
                                    v3w.m(sb, ")", 4, "QueueRestoreFacade", null);
                                    obj = Unit.a;
                                } else {
                                    Continuation continuation3 = null;
                                    ssg.a(4, "QueueRestoreFacade", "restoreAfterDelay registered trigger=".concat(str6), null);
                                    rar rarVar = this.t;
                                    if (rarVar != null) {
                                        rarVar.g(null);
                                    }
                                    this.t = x97.y(this.n, dm6.b.plus(saf.p()), null, new c5l(this, str6, continuation3, 23), 2);
                                    obj = Unit.a;
                                }
                            }
                        }
                        return Unit.a;
                    }
                    if (i != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        jbnVar = new jbn(this, continuation);
        Object obj22 = jbnVar.l;
        Object obj32 = nm6.a;
        i = jbnVar.n;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        return Unit.a;
    }
}
