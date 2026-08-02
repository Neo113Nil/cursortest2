package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class jkw {
    public final f5v a;
    public final pfn b;
    public final l0t c;
    public final b8u d;
    public final cut e;
    public final yr f;
    public final k21 g;
    public final ofo h;
    public final b5d i;
    public final q4d j;

    public jkw(l0t l0tVar, f5v f5vVar, b8u b8uVar, cut cutVar, yr yrVar, k21 k21Var, ofo ofoVar, b5d b5dVar, q4d q4dVar, pfn pfnVar) {
        l0tVar.getClass();
        f5vVar.getClass();
        b8uVar.getClass();
        cutVar.getClass();
        yrVar.getClass();
        k21Var.getClass();
        ofoVar.getClass();
        b5dVar.getClass();
        q4dVar.getClass();
        pfnVar.getClass();
        f5vVar.getClass();
        pfnVar.getClass();
        this.a = f5vVar;
        this.b = pfnVar;
        this.c = l0tVar;
        this.d = b8uVar;
        this.e = cutVar;
        this.f = yrVar;
        this.g = k21Var;
        this.h = ofoVar;
        this.i = b5dVar;
        this.j = q4dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object g(jkw jkwVar, s9p s9pVar, o4q o4qVar, gxc gxcVar, cg6 cg6Var) {
        bkw bkwVar;
        int i;
        y4v y4vVar;
        if (cg6Var instanceof bkw) {
            bkwVar = (bkw) cg6Var;
            int i2 = bkwVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bkwVar.m = i2 - Integer.MIN_VALUE;
                Object obj = bkwVar.k;
                nm6 nm6Var = nm6.a;
                i = bkwVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    f5v f5vVar = jkwVar.a;
                    u4v u4vVar = new u4v(s9pVar, false);
                    pfn pfnVar = jkwVar.b;
                    bkwVar.j = o4qVar;
                    bkwVar.m = 1;
                    obj = f5vVar.c(u4vVar, pfnVar, gxcVar, bkwVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o4qVar = bkwVar.j;
                    qgg.h0(obj);
                }
                y4vVar = (y4v) obj;
                if (y4vVar instanceof x4v) {
                    if (y4vVar instanceof w4v) {
                        return ((w4v) y4vVar).a;
                    }
                    b6e.s();
                    return null;
                }
                Object obj2 = ((x4v) y4vVar).b;
                if (obj2 instanceof u4q) {
                    obj2 = u4q.h((u4q) obj2, o4qVar, null, 55);
                } else if (!(obj2 instanceof s4q)) {
                    b6e.s();
                    return null;
                }
                return new qj6(obj2);
            }
        }
        bkwVar = new bkw(jkwVar, cg6Var);
        Object obj3 = bkwVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bkwVar.m;
        if (i != 0) {
        }
        y4vVar = (y4v) obj3;
        if (y4vVar instanceof x4v) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, iow iowVar, cg6 cg6Var) {
        ckw ckwVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof ckw) {
            ckwVar = (ckw) cg6Var;
            int i2 = ckwVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ckwVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ckwVar.k;
                nm6 nm6Var = nm6.a;
                i = ckwVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ckwVar.j = iowVar;
                    ckwVar.m = 1;
                    obj = this.f.a(str, ckwVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iowVar = ckwVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    oq oqVar = (oq) ((qj6) rj6Var).a;
                    return new qj6(new o9q(oqVar, oqVar.F, iowVar));
                }
                if (rj6Var instanceof pj6) {
                    return rj6Var;
                }
                b6e.s();
                return null;
            }
        }
        ckwVar = new ckw(this, cg6Var);
        Object obj2 = ckwVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ckwVar.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, iow iowVar, cg6 cg6Var) {
        dkw dkwVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof dkw) {
            dkwVar = (dkw) cg6Var;
            int i2 = dkwVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dkwVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dkwVar.k;
                nm6 nm6Var = nm6.a;
                i = dkwVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    dkwVar.j = iowVar;
                    dkwVar.m = 1;
                    obj = k21.b(this.g, str, true, dkwVar, 28);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iowVar = dkwVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    i21 i21Var = (i21) ((qj6) rj6Var).a;
                    return new qj6(new p9q(i21Var.a, i21Var.g, iowVar));
                }
                if (rj6Var instanceof pj6) {
                    return rj6Var;
                }
                b6e.s();
                return null;
            }
        }
        dkwVar = new dkw(this, cg6Var);
        Object obj2 = dkwVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dkwVar.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        ekw ekwVar;
        int i;
        StationId f;
        rj6 rj6Var;
        if (cg6Var instanceof ekw) {
            ekwVar = (ekw) cg6Var;
            int i2 = ekwVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ekwVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ekwVar.k;
                nm6 nm6Var = nm6.a;
                i = ekwVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    f = StationId.f(str);
                    if (Intrinsics.d(f, StationId.a)) {
                        f = null;
                    }
                    if (f == null) {
                        return new nj6(null);
                    }
                    d5d N = ox6.N(f);
                    n5n a = this.j.a();
                    ekwVar.j = f;
                    ekwVar.m = 1;
                    obj = this.i.b(N, a, ekwVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = ekwVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return new qj6(new baq(f, (e5d) ((qj6) rj6Var).a));
                }
                if (rj6Var instanceof pj6) {
                    return rj6Var;
                }
                b6e.s();
                return null;
            }
        }
        ekwVar = new ekw(this, cg6Var);
        Object obj2 = ekwVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ekwVar.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, iow iowVar, String str3, cg6 cg6Var) {
        fkw fkwVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof fkw) {
            fkwVar = (fkw) cg6Var;
            int i2 = fkwVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fkwVar.n = i2 - Integer.MIN_VALUE;
                fkw fkwVar2 = fkwVar;
                Object obj = fkwVar2.l;
                nm6 nm6Var = nm6.a;
                i = fkwVar2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    fkwVar2.j = iowVar;
                    fkwVar2.k = str3;
                    fkwVar2.n = 1;
                    obj = cut.h(this.e, str, str2, false, false, fkwVar2, 124);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = fkwVar2.k;
                    iowVar = fkwVar2.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        return rj6Var;
                    }
                    b6e.s();
                    return null;
                }
                rrl rrlVar = (rrl) ((qj6) rj6Var).a;
                cvl cvlVar = rrlVar.a;
                List list = rrlVar.c;
                if (list == null) {
                    list = c5b.a;
                }
                return new qj6(new q9q(iowVar, cvlVar, list, str3));
            }
        }
        fkwVar = new fkw(this, cg6Var);
        fkw fkwVar22 = fkwVar;
        Object obj2 = fkwVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = fkwVar22.n;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(List list, boolean z, cg6 cg6Var) {
        gkw gkwVar;
        int i;
        if (cg6Var instanceof gkw) {
            gkwVar = (gkw) cg6Var;
            int i2 = gkwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gkwVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gkwVar.j;
                nm6 nm6Var = nm6.a;
                i = gkwVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(2, "YnisonMetaLoaderNetApiImpl", dfi.c(list.size(), "launched for ", " tracks"), null);
                    ak1 ak1Var = new ak1(list, (Continuation) null, this, z);
                    gkwVar.l = 1;
                    obj = gld.Q(ak1Var, gkwVar);
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
                return v75.p((Iterable) obj);
            }
        }
        gkwVar = new gkw(this, cg6Var);
        Object obj2 = gkwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gkwVar.l;
        if (i != 0) {
        }
        return v75.p((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[LOOP:1: B:22:0x0078->B:24:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(List list, cg6 cg6Var) {
        hkw hkwVar;
        int i;
        Iterator it;
        if (cg6Var instanceof hkw) {
            hkwVar = (hkw) cg6Var;
            int i2 = hkwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hkwVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hkwVar.j;
                nm6 nm6Var = nm6.a;
                i = hkwVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(2, "YnisonMetaLoaderNetApiImpl", dfi.c(list.size(), "launched for ", " video clips"), null);
                    wzv wzvVar = new wzv(list, (Continuation) null, this);
                    hkwVar.l = 1;
                    obj = gld.Q(wzvVar, hkwVar);
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
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (obj2 instanceof qj6) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    z75.t(arrayList2, (Iterable) ((qj6) it.next()).a);
                }
                return arrayList2;
            }
        }
        hkwVar = new hkw(this, cg6Var);
        Object obj3 = hkwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hkwVar.l;
        if (i != 0) {
        }
        ArrayList arrayList3 = new ArrayList();
        while (r8.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, o4q o4qVar, gxc gxcVar, cg6 cg6Var) {
        ikw ikwVar;
        int i;
        rj6 rj6Var;
        p4q p4qVar;
        if (cg6Var instanceof ikw) {
            ikwVar = (ikw) cg6Var;
            int i2 = ikwVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ikwVar.o = i2 - Integer.MIN_VALUE;
                Object obj = ikwVar.m;
                nm6 nm6Var = nm6.a;
                i = ikwVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    ikwVar.j = str;
                    ikwVar.k = o4qVar;
                    ikwVar.l = gxcVar;
                    ikwVar.o = 1;
                    obj = this.h.c(str, ikwVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gxcVar = ikwVar.l;
                    o4qVar = ikwVar.k;
                    str = ikwVar.j;
                    qgg.h0(obj);
                }
                o4q o4qVar2 = o4qVar;
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        return rj6Var;
                    }
                    b6e.s();
                    return null;
                }
                yku ykuVar = (yku) ((qj6) rj6Var).a;
                unu unuVar = new unu(ykuVar.a, str);
                v4q v4qVar = new v4q(this.b, ykuVar.b, gxcVar);
                s4v s4vVar = new s4v(ykuVar.c, ykuVar.d);
                int ordinal = ykuVar.e.ordinal();
                if (ordinal == 0) {
                    p4qVar = p4q.a;
                } else if (ordinal == 1) {
                    p4qVar = p4q.b;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    p4qVar = p4q.c;
                }
                return new qj6(new w4q(unuVar, v4qVar, s4vVar, o4qVar2, p4qVar, null));
            }
        }
        ikwVar = new ikw(this, cg6Var);
        Object obj2 = ikwVar.m;
        nm6 nm6Var2 = nm6.a;
        i = ikwVar.o;
        if (i != 0) {
        }
        o4q o4qVar22 = o4qVar;
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
