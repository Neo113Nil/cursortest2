package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jnl {
    public final mm6 a;
    public final rpq b;
    public final List c;
    public final Function0 d;
    public final ekl e;
    public final boolean f;
    public final xdr g;
    public final fkn h;
    public final jyr i;
    public final HashMap j;
    public final HashMap k;
    public final xdr l;
    public dnl m;

    public jnl(tf6 tf6Var, jyr jyrVar, rpq rpqVar, List list, ufl uflVar, ekl eklVar, boolean z) {
        tf6Var.getClass();
        list.getClass();
        uflVar.getClass();
        eklVar.getClass();
        this.a = tf6Var;
        this.b = rpqVar;
        this.c = list;
        this.d = uflVar;
        this.e = eklVar;
        this.f = z;
        xdr a = ydr.a(null);
        this.g = a;
        this.h = new fkn(a);
        this.i = jyrVar;
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = ydr.a(Boolean.FALSE);
        x97.y(tf6Var, null, null, new b5l(zsd.b0(new qll(a.i(), 1)), (Continuation) null, this, 13), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(jnl jnlVar, dnl dnlVar, ajl ajlVar, cg6 cg6Var) {
        inl inlVar;
        Object obj;
        Object obj2;
        int i;
        int i2;
        dnl dnlVar2;
        snq snqVar;
        mwk mwkVar;
        int i3;
        nxk nxkVar;
        ajl ajlVar2;
        Object value;
        zml zmlVar;
        dnl dnlVar3;
        ajl ajlVar3;
        nxk nxkVar2;
        dnl dnlVar4 = dnlVar;
        List list = jnlVar.c;
        xdr xdrVar = jnlVar.g;
        if (cg6Var instanceof inl) {
            inlVar = (inl) cg6Var;
            int i4 = inlVar.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                inlVar.v = i4 - Integer.MIN_VALUE;
                obj = inlVar.t;
                obj2 = nm6.a;
                i = inlVar.v;
                int i5 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (jnlVar.f) {
                        if (Intrinsics.d(dnlVar4, jnlVar.m)) {
                            do {
                                value = xdrVar.getValue();
                                zml zmlVar2 = (zml) value;
                                if (zmlVar2 != null) {
                                    List list2 = zmlVar2.a;
                                    boolean z = zmlVar2.b;
                                    String str = zmlVar2.c;
                                    nxk nxkVar3 = zmlVar2.d;
                                    list2.getClass();
                                    str.getClass();
                                    nxkVar3.getClass();
                                    ajlVar.getClass();
                                    zmlVar = new zml(list2, z, str, nxkVar3, ajlVar);
                                } else {
                                    zmlVar = null;
                                }
                            } while (!xdrVar.k(value, zmlVar));
                            return Unit.a;
                        }
                        jnlVar.m = null;
                    }
                    snq snqVar2 = dnlVar4.a;
                    mwk mwkVar2 = dnlVar4.c;
                    nxk nxkVar4 = dnlVar4.b;
                    List list3 = snqVar2.c;
                    String str2 = snqVar2.a;
                    List<drf> list4 = list3;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        for (drf drfVar : list4) {
                            drfVar.getClass();
                            wfm wfmVar = drfVar instanceof wfm ? (wfm) drfVar : null;
                            if ((wfmVar != null ? wfmVar.d() : null) == f73.d) {
                                i2 = 1;
                                break;
                            }
                        }
                    }
                    i2 = 0;
                    if (i2 == 0) {
                        zml zmlVar3 = new zml(jnlVar.d(new lum(str2, CollectionsKt.g0(list, snqVar2.c)).G()), false, mwkVar2.b(), nxkVar4, ajlVar);
                        xdrVar.getClass();
                        xdrVar.m(null, zmlVar3);
                        jnlVar.m = dnlVar4;
                        return Unit.a;
                    }
                    zml zmlVar4 = new zml(jnlVar.d(new lum(str2, list).G()), true, mwkVar2.b(), nxkVar4, ajlVar);
                    xdrVar.getClass();
                    xdrVar.m(null, zmlVar4);
                    xdr xdrVar2 = jnlVar.l;
                    lf2 lf2Var = new lf2(i5, 10, continuation);
                    inlVar.j = dnlVar4;
                    inlVar.k = ajlVar;
                    inlVar.l = snqVar2;
                    inlVar.m = mwkVar2;
                    inlVar.n = nxkVar4;
                    inlVar.s = i2;
                    inlVar.v = 1;
                    if (zsd.h0(xdrVar2, lf2Var, inlVar) != obj2) {
                        dnlVar2 = dnlVar4;
                        snqVar = snqVar2;
                        mwkVar = mwkVar2;
                        i3 = i2;
                        nxkVar = nxkVar4;
                        ajlVar2 = ajlVar;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ajl ajlVar4 = inlVar.r;
                    nxk nxkVar5 = inlVar.q;
                    mwk mwkVar3 = inlVar.p;
                    xdr xdrVar3 = inlVar.o;
                    dnlVar3 = inlVar.j;
                    qgg.h0(obj);
                    ajlVar3 = ajlVar4;
                    nxkVar2 = nxkVar5;
                    mwkVar = mwkVar3;
                    xdrVar = xdrVar3;
                    zml zmlVar5 = new zml((List) obj, false, mwkVar.b(), nxkVar2, ajlVar3);
                    xdrVar.getClass();
                    xdrVar.m(null, zmlVar5);
                    dnlVar4 = dnlVar3;
                    jnlVar.m = dnlVar4;
                    return Unit.a;
                }
                i3 = inlVar.s;
                nxkVar = inlVar.n;
                mwkVar = inlVar.m;
                snqVar = inlVar.l;
                ajlVar2 = inlVar.k;
                dnlVar2 = inlVar.j;
                qgg.h0(obj);
                String str3 = snqVar.a;
                ArrayList G = new lum(str3, CollectionsKt.g0(list, snqVar.c)).G();
                inlVar.j = dnlVar2;
                inlVar.k = null;
                inlVar.l = null;
                inlVar.m = null;
                inlVar.n = null;
                inlVar.o = xdrVar;
                inlVar.p = mwkVar;
                inlVar.q = nxkVar;
                inlVar.r = ajlVar2;
                inlVar.s = i3;
                inlVar.v = 2;
                obj = jnlVar.b(inlVar, str3, G);
                if (obj != obj2) {
                    dnlVar3 = dnlVar2;
                    ajlVar3 = ajlVar2;
                    nxkVar2 = nxkVar;
                    zml zmlVar52 = new zml((List) obj, false, mwkVar.b(), nxkVar2, ajlVar3);
                    xdrVar.getClass();
                    xdrVar.m(null, zmlVar52);
                    dnlVar4 = dnlVar3;
                    jnlVar.m = dnlVar4;
                    return Unit.a;
                }
                return obj2;
            }
        }
        inlVar = new inl(jnlVar, cg6Var);
        obj = inlVar.t;
        obj2 = nm6.a;
        i = inlVar.v;
        int i52 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        String str32 = snqVar.a;
        ArrayList G2 = new lum(str32, CollectionsKt.g0(list, snqVar.c)).G();
        inlVar.j = dnlVar2;
        inlVar.k = null;
        inlVar.l = null;
        inlVar.m = null;
        inlVar.n = null;
        inlVar.o = xdrVar;
        inlVar.p = mwkVar;
        inlVar.q = nxkVar;
        inlVar.r = ajlVar2;
        inlVar.s = i3;
        inlVar.v = 2;
        obj = jnlVar.b(inlVar, str32, G2);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0104 A[LOOP:0: B:11:0x00fe->B:13:0x0104, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f A[LOOP:1: B:16:0x0129->B:18:0x012f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0157 A[LOOP:2: B:21:0x0151->B:23:0x0157, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(cg6 cg6Var, String str, ArrayList arrayList) {
        enl enlVar;
        int i;
        ArrayList d;
        ArrayList arrayList2;
        long longValue;
        xqn xqnVar;
        String str2;
        long j;
        ArrayList arrayList3;
        xqn xqnVar2;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        if (cg6Var instanceof enl) {
            enlVar = (enl) cg6Var;
            int i2 = enlVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                enlVar.t = i2 - Integer.MIN_VALUE;
                Object obj = enlVar.r;
                nm6 nm6Var = nm6.a;
                i = enlVar.t;
                if (i != 0) {
                    qgg.h0(obj);
                    d = d(arrayList);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = d.iterator();
                    while (it5.hasNext()) {
                        Object next = it5.next();
                        drf a = ((rnq) next).a();
                        a.getClass();
                        wfm wfmVar = a instanceof wfm ? (wfm) a : null;
                        if ((wfmVar != null ? wfmVar.d() : null) == f73.d) {
                            arrayList4.add(next);
                        }
                    }
                    arrayList2 = new ArrayList();
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        rnq rnqVar = (rnq) it6.next();
                        rnqVar.getClass();
                        vfg vfgVar = rnqVar instanceof vfg ? (vfg) rnqVar : null;
                        if (vfgVar != null) {
                            arrayList2.add(vfgVar);
                        }
                    }
                    xqn xqnVar3 = new xqn();
                    longValue = ((Number) this.d.invoke()).longValue();
                    gis.a.getClass();
                    rdi.a.getClass();
                    long a2 = rdi.a();
                    enlVar.j = str;
                    enlVar.k = arrayList;
                    enlVar.l = d;
                    enlVar.m = arrayList2;
                    enlVar.n = xqnVar3;
                    enlVar.o = xqnVar3;
                    enlVar.p = longValue;
                    enlVar.q = a2;
                    enlVar.t = 1;
                    Object Q = gld.Q(new fnl(arrayList2, longValue, null), enlVar);
                    if (Q == nm6Var) {
                        return nm6Var;
                    }
                    xqnVar = xqnVar3;
                    obj = Q;
                    str2 = str;
                    j = a2;
                    arrayList3 = arrayList;
                    xqnVar2 = xqnVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = enlVar.q;
                    longValue = enlVar.p;
                    xqnVar2 = enlVar.o;
                    xqnVar = enlVar.n;
                    arrayList2 = enlVar.m;
                    d = enlVar.l;
                    arrayList3 = enlVar.k;
                    str2 = enlVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList5 = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList5.add(((rnq) it.next()).a());
                }
                xqnVar2.a = arrayList5;
                long f = nsa.f(fis.b(j));
                ArrayList arrayList6 = new ArrayList(v75.o(arrayList2, 10));
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(((vfg) it2.next()).a());
                }
                List list = (List) xqnVar.a;
                List list2 = list;
                ArrayList arrayList7 = new ArrayList(v75.o(list2, 10));
                it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(((drf) it3.next()).a().a);
                }
                Pair pair = new Pair("max_timeout", Long.valueOf(longValue));
                Pair pair2 = new Pair("actual_time_spent", Long.valueOf(f));
                Pair pair3 = new Pair("count_blocks_to_load", Integer.valueOf(arrayList6.size()));
                Pair pair4 = new Pair("count_blocks_loaded", Integer.valueOf(arrayList6.size() - list.size()));
                Pair pair5 = new Pair("skeleton_id", str2);
                Pair pair6 = new Pair("blocks_to_load", CollectionsKt.X(arrayList6, null, null, null, new sjl(21), 31));
                ArrayList arrayList8 = new ArrayList();
                it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    if (!arrayList7.contains(((drf) next2).a().a)) {
                        arrayList8.add(next2);
                    }
                }
                Map e = uah.e(pair, pair2, pair3, pair4, pair5, pair6, new Pair("blocks_loaded", CollectionsKt.X(arrayList8, null, null, null, new sjl(22), 31)));
                ekl eklVar = this.e;
                eklVar.getClass();
                ot0.A(eklVar.e(), "PlayerLoadBlocksData", e);
                ArrayList arrayList9 = new ArrayList();
                for (Object obj2 : d) {
                    if (!((List) xqnVar.a).contains(((rnq) obj2).a())) {
                        arrayList9.add(obj2);
                    }
                }
                ssg.a(3, "PlayerScreen:Skeleton", dfi.f("show ", arrayList9.size(), arrayList3.size(), "/", " blocks"), null);
                return arrayList9;
            }
        }
        enlVar = new enl(this, cg6Var);
        Object obj3 = enlVar.r;
        nm6 nm6Var2 = nm6.a;
        i = enlVar.t;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj3;
        ArrayList arrayList52 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        xqnVar2.a = arrayList52;
        long f2 = nsa.f(fis.b(j));
        ArrayList arrayList62 = new ArrayList(v75.o(arrayList2, 10));
        it2 = arrayList2.iterator();
        while (it2.hasNext()) {
        }
        List list3 = (List) xqnVar.a;
        List list22 = list3;
        ArrayList arrayList72 = new ArrayList(v75.o(list22, 10));
        it3 = list22.iterator();
        while (it3.hasNext()) {
        }
        Pair pair7 = new Pair("max_timeout", Long.valueOf(longValue));
        Pair pair22 = new Pair("actual_time_spent", Long.valueOf(f2));
        Pair pair32 = new Pair("count_blocks_to_load", Integer.valueOf(arrayList62.size()));
        Pair pair42 = new Pair("count_blocks_loaded", Integer.valueOf(arrayList62.size() - list3.size()));
        Pair pair52 = new Pair("skeleton_id", str2);
        Pair pair62 = new Pair("blocks_to_load", CollectionsKt.X(arrayList62, null, null, null, new sjl(21), 31));
        ArrayList arrayList82 = new ArrayList();
        it4 = arrayList62.iterator();
        while (it4.hasNext()) {
        }
        Map e2 = uah.e(pair7, pair22, pair32, pair42, pair52, pair62, new Pair("blocks_loaded", CollectionsKt.X(arrayList82, null, null, null, new sjl(22), 31)));
        ekl eklVar2 = this.e;
        eklVar2.getClass();
        ot0.A(eklVar2.e(), "PlayerLoadBlocksData", e2);
        ArrayList arrayList92 = new ArrayList();
        while (r2.hasNext()) {
        }
        ssg.a(3, "PlayerScreen:Skeleton", dfi.f("show ", arrayList92.size(), arrayList3.size(), "/", " blocks"), null);
        return arrayList92;
    }

    public final yfg c(rnq rnqVar) {
        yfg ojnVar;
        String str = rnqVar.a().a().a;
        HashMap hashMap = this.k;
        yfg yfgVar = (yfg) hashMap.get(str);
        if (yfgVar != null) {
            if (!Intrinsics.d(yfgVar.b().a(), rnqVar.a())) {
                yfgVar = null;
            }
            if (yfgVar != null) {
                return yfgVar;
            }
        }
        vfg vfgVar = rnqVar instanceof vfg ? (vfg) rnqVar : null;
        if (vfgVar == null) {
            return null;
        }
        boolean z = vfgVar instanceof tfg;
        mm6 mm6Var = this.a;
        if (z) {
            ojnVar = new gr1((tfg) vfgVar, mm6Var);
        } else {
            if (!(vfgVar instanceof ufg)) {
                b6e.s();
                return null;
            }
            ojnVar = new ojn((ufg) vfgVar, mm6Var);
        }
        hashMap.put(rnqVar.a().a().a, ojnVar);
        return ojnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x000b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d(List list) {
        knq a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s63 s63Var = (s63) it.next();
            drf drfVar = s63Var.a;
            String str = drfVar.a().a;
            HashMap hashMap = this.j;
            rnq rnqVar = (rnq) hashMap.get(str);
            rnq rnqVar2 = null;
            if (rnqVar != null) {
                if (!Intrinsics.d(rnqVar.a(), drfVar)) {
                    rnqVar = null;
                }
                if (rnqVar != null) {
                    rnqVar2 = rnqVar;
                    if (rnqVar2 == null) {
                        arrayList.add(rnqVar2);
                    }
                }
            }
            nnq nnqVar = (nnq) this.i.getValue();
            nnqVar.getClass();
            prf a2 = nnqVar.a(drfVar.a().b);
            rnq b = (a2 == null || (a = a2.a()) == null) ? null : a.b(s63Var);
            if (b != null) {
                hashMap.put(str, b);
                rnqVar2 = b;
            }
            if (rnqVar2 == null) {
            }
        }
        return arrayList;
    }
}
