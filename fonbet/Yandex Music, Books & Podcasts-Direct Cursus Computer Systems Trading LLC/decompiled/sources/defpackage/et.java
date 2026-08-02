package defpackage;

import android.os.Parcelable;
import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class et {
    public final i5h a;
    public final xiu b;

    public et(i5h i5hVar, xiu xiuVar) {
        this.a = i5hVar;
        this.b = xiuVar;
    }

    public static /* synthetic */ Serializable e(et etVar, String str, uhn uhnVar, Boolean bool, Integer num, Continuation continuation, int i) {
        Continuation continuation2;
        Integer num2;
        Boolean bool2;
        Boolean bool3 = Boolean.TRUE;
        if ((i & 2) != 0) {
            uhnVar = null;
        }
        if ((i & 8) != 0) {
            continuation2 = continuation;
            num2 = num;
            bool2 = null;
        } else {
            continuation2 = continuation;
            num2 = num;
            bool2 = bool;
        }
        return etVar.d(str, uhnVar, bool3, bool2, num2, continuation2);
    }

    public final Object a(String str, Iterable iterable, Map map, cg6 cg6Var) {
        if (qld.H(iterable)) {
            return Unit.a;
        }
        Object v = this.b.v(str, iterable, map, cg6Var);
        nm6 nm6Var = nm6.a;
        if (v != nm6Var) {
            v = Unit.a;
        }
        return v == nm6Var ? v : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r6 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Iterable iterable, cg6 cg6Var) {
        ts tsVar;
        int i;
        et etVar;
        Iterable iterable2;
        Object v;
        if (cg6Var instanceof ts) {
            tsVar = (ts) cg6Var;
            int i2 = tsVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tsVar.n = i2 - Integer.MIN_VALUE;
                Object obj = tsVar.l;
                nm6 nm6Var = nm6.a;
                i = tsVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    tsVar.j = this;
                    tsVar.k = str;
                    tsVar.n = 1;
                    obj = f(str, iterable, tsVar);
                    if (obj != nm6Var) {
                        etVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = tsVar.k;
                etVar = tsVar.j;
                qgg.h0(obj);
                iterable2 = (Iterable) obj;
                tsVar.j = null;
                tsVar.k = null;
                tsVar.n = 2;
                etVar.getClass();
                if (qld.H(iterable2)) {
                    v = etVar.b.v(str, iterable2, null, tsVar);
                    if (v != nm6Var) {
                        v = Unit.a;
                    }
                    if (v != nm6Var) {
                        v = Unit.a;
                    }
                } else {
                    v = Unit.a;
                }
            }
        }
        tsVar = new ts(this, cg6Var);
        Object obj2 = tsVar.l;
        nm6 nm6Var2 = nm6.a;
        i = tsVar.n;
        if (i != 0) {
        }
        iterable2 = (Iterable) obj2;
        tsVar.j = null;
        tsVar.k = null;
        tsVar.n = 2;
        etVar.getClass();
        if (qld.H(iterable2)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r7.a(r6, (java.lang.Iterable) r9, r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Iterable iterable, Map map, cg6 cg6Var) {
        us usVar;
        int i;
        et etVar;
        if (cg6Var instanceof us) {
            usVar = (us) cg6Var;
            int i2 = usVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                usVar.o = i2 - Integer.MIN_VALUE;
                Object obj = usVar.m;
                nm6 nm6Var = nm6.a;
                i = usVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    usVar.j = map;
                    usVar.k = this;
                    usVar.l = str;
                    usVar.o = 1;
                    obj = f(str, iterable, usVar);
                    if (obj != nm6Var) {
                        etVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Map map2 = usVar.j;
                    qgg.h0(obj);
                    return Unit.a;
                }
                str = usVar.l;
                etVar = usVar.k;
                map = usVar.j;
                qgg.h0(obj);
                usVar.j = null;
                usVar.k = null;
                usVar.l = null;
                usVar.o = 2;
            }
        }
        usVar = new us(this, cg6Var);
        Object obj2 = usVar.m;
        nm6 nm6Var2 = nm6.a;
        i = usVar.o;
        if (i != 0) {
        }
        usVar.j = null;
        usVar.k = null;
        usVar.l = null;
        usVar.o = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        if (r12 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
    
        if (r12 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(String str, vhn vhnVar, Boolean bool, Boolean bool2, Integer num, Continuation continuation) {
        vs vsVar;
        int i;
        if (continuation instanceof vs) {
            vsVar = (vs) continuation;
            int i2 = vsVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vsVar.p = i2 - Integer.MIN_VALUE;
                Object obj = vsVar.n;
                nm6 nm6Var = nm6.a;
                i = vsVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    vsVar.j = vhnVar;
                    vsVar.k = bool;
                    vsVar.l = bool2;
                    vsVar.m = num;
                    vsVar.p = 1;
                    obj = this.a.b(str, vsVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(h4a.X((zv) it.next()));
                        }
                        return arrayList;
                    }
                    num = vsVar.m;
                    bool2 = vsVar.l;
                    bool = vsVar.k;
                    vhnVar = vsVar.j;
                    qgg.h0(obj);
                }
                cw w = ((MainDatabase) obj).w();
                ysr ysrVar = new ysr("album_mview");
                um4 um4Var = new um4(pgp.a);
                um4Var.i("(available=1 OR for_premium=1 OR for_options!='')", xz0.X(new Object[0]));
                if (bool != null) {
                    um4Var.c("liked", bool.booleanValue());
                }
                if (vhnVar != null) {
                    um4Var.h("album_type", vhnVar);
                }
                if (bool2 != null) {
                    um4Var.c("album_for_kids", bool2.booleanValue());
                }
                tt0.K(ysrVar, um4Var);
                ysrVar.f = "timestamp DESC";
                if (num != null) {
                    ysrVar.b(String.valueOf(num.intValue()));
                }
                atn a = ysrVar.a();
                vsVar.j = null;
                vsVar.k = null;
                vsVar.l = null;
                vsVar.m = null;
                vsVar.p = 2;
                obj = w.b(a, vsVar);
            }
        }
        vsVar = new vs(this, continuation);
        Object obj2 = vsVar.n;
        nm6 nm6Var2 = nm6.a;
        i = vsVar.p;
        if (i != 0) {
        }
        cw w2 = ((MainDatabase) obj2).w();
        ysr ysrVar2 = new ysr("album_mview");
        um4 um4Var2 = new um4(pgp.a);
        um4Var2.i("(available=1 OR for_premium=1 OR for_options!='')", xz0.X(new Object[0]));
        if (bool != null) {
        }
        if (vhnVar != null) {
        }
        if (bool2 != null) {
        }
        tt0.K(ysrVar2, um4Var2);
        ysrVar2.f = "timestamp DESC";
        if (num != null) {
        }
        atn a2 = ysrVar2.a();
        vsVar.j = null;
        vsVar.k = null;
        vsVar.l = null;
        vsVar.m = null;
        vsVar.p = 2;
        obj2 = w2.b(a2, vsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, Iterable iterable, cg6 cg6Var) {
        ws wsVar;
        int i;
        ArrayList arrayList;
        Object obj;
        Date date;
        Object obj2;
        if (cg6Var instanceof ws) {
            wsVar = (ws) cg6Var;
            int i2 = wsVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wsVar.n = i2 - Integer.MIN_VALUE;
                Object obj3 = wsVar.l;
                Serializable serializable = nm6.a;
                i = wsVar.n;
                if (i != 0) {
                    ArrayList q = su4.q(obj3);
                    ArrayList arrayList2 = new ArrayList(v75.o(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((oq) it.next()).a);
                    }
                    wsVar.j = iterable;
                    wsVar.k = q;
                    wsVar.n = 1;
                    Serializable h = h(str, arrayList2, wsVar);
                    if (h == serializable) {
                        return serializable;
                    }
                    obj3 = h;
                    arrayList = q;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = wsVar.k;
                    iterable = wsVar.j;
                    qgg.h0(obj3);
                }
                List list = (List) obj3;
                for (oq oqVar : iterable) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (Intrinsics.d(((oq) obj).a, oqVar.a)) {
                            break;
                        }
                    }
                    oq oqVar2 = (oq) obj;
                    if (oqVar2 != null) {
                        oqVar.getClass();
                        if (oqVar != oqVar2) {
                            if (Intrinsics.d(oqVar2.a, oqVar.a) && Intrinsics.d(oqVar2.b, oqVar.b) && oqVar2.g == oqVar.g && Intrinsics.d(oqVar2.i, oqVar.i) && oqVar2.d() == oqVar.d() && Intrinsics.d(oqVar2.k, oqVar.k) && Intrinsics.d(oqVar2.e, oqVar.e) && Intrinsics.d(oqVar2.f, oqVar.f) && oqVar2.l == oqVar.l && Intrinsics.d(oqVar2.m, oqVar.m) && Intrinsics.d(oqVar2.o, oqVar.o) && Intrinsics.d(oqVar2.s, oqVar.s) && Intrinsics.d(oqVar2.t, oqVar.t) && oqVar2.q == oqVar.q && oqVar2.r == oqVar.r && Intrinsics.d(oqVar2.y, oqVar.y) && oqVar2.z == oqVar.z && Intrinsics.d(oqVar2.c, oqVar.c) && Intrinsics.d(oqVar2.w, oqVar.w) && Intrinsics.d(oqVar2.u, oqVar.u)) {
                                List<zp2> list2 = oqVar2.n;
                                List list3 = oqVar.n;
                                if (list2.size() == list3.size()) {
                                    for (zp2 zp2Var : list2) {
                                        Iterator it3 = list3.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = it3.next();
                                            if (Intrinsics.d(((zp2) obj2).a, zp2Var.a)) {
                                                break;
                                            }
                                        }
                                        zp2 zp2Var2 = (zp2) obj2;
                                        if (zp2Var2 != null) {
                                            zp2Var.getClass();
                                            if (zp2Var2 == zp2Var || (Intrinsics.d(zp2Var.a, zp2Var2.a) && Intrinsics.d(zp2Var.b, zp2Var2.b) && Intrinsics.d(zp2Var.f, zp2Var2.f))) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    oq e = oq.e(oqVar, null, 536870911);
                    if (oqVar2 != null && (date = oqVar2.E) != null) {
                        e.E = date;
                    }
                    arrayList.add(e);
                }
                return arrayList;
            }
        }
        wsVar = new ws(this, cg6Var);
        Object obj32 = wsVar.l;
        Serializable serializable2 = nm6.a;
        i = wsVar.n;
        if (i != 0) {
        }
        List list4 = (List) obj32;
        while (r13.hasNext()) {
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(String str, String str2, cg6 cg6Var) {
        xs xsVar;
        int i;
        oq oqVar;
        if (cg6Var instanceof xs) {
            xsVar = (xs) cg6Var;
            int i2 = xsVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xsVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xsVar.j;
                nm6 nm6Var = nm6.a;
                i = xsVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Iterable c = t75.c(str2);
                    xsVar.l = 1;
                    obj = h(str, c, xsVar);
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
                oqVar = (oq) CollectionsKt.firstOrNull((List) obj);
                if (oqVar != null) {
                    Parcelable.Creator<oq> creator = oq.CREATOR;
                    if (!cxb.Y(oqVar.a)) {
                        return oqVar;
                    }
                }
                return null;
            }
        }
        xsVar = new xs(this, cg6Var);
        Object obj2 = xsVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xsVar.l;
        if (i != 0) {
        }
        oqVar = (oq) CollectionsKt.firstOrNull((List) obj2);
        if (oqVar != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(String str, Iterable iterable, cg6 cg6Var) {
        ys ysVar;
        int i;
        if (cg6Var instanceof ys) {
            ysVar = (ys) cg6Var;
            int i2 = ysVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ysVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ysVar.k;
                nm6 nm6Var = nm6.a;
                i = ysVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ysVar.j = iterable;
                    ysVar.m = 1;
                    obj = this.a.b(str, ysVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Iterable iterable2 = ysVar.j;
                        qgg.h0(obj);
                        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                        ArrayList arrayList = new ArrayList(v75.o(linkedHashSet, 10));
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            arrayList.add(h4a.X((zv) it.next()));
                        }
                        return arrayList;
                    }
                    iterable = ysVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                zs zsVar = new zs(ueoVar, null, iterable, 0);
                ysVar.j = null;
                ysVar.m = 2;
                obj = tyf.N(ueoVar, zsVar, ysVar);
            }
        }
        ysVar = new ys(this, cg6Var);
        Object obj2 = ysVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ysVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        zs zsVar2 = new zs(ueoVar2, null, iterable, 0);
        ysVar.j = null;
        ysVar.m = 2;
        obj2 = tyf.N(ueoVar2, zsVar2, ysVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0040, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable i(String str, cg6 cg6Var) {
        at atVar;
        int i;
        if (cg6Var instanceof at) {
            atVar = (at) cg6Var;
            int i2 = atVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                atVar.l = i2 - Integer.MIN_VALUE;
                Object obj = atVar.j;
                nm6 nm6Var = nm6.a;
                i = atVar.l;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    atVar.l = 1;
                    obj = this.a.b(str, atVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Iterable<j10> iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        for (j10 j10Var : iterable) {
                            String str2 = j10Var.a;
                            tfs tfsVar = wc7.a;
                            Date b = wc7.a.b(j10Var.b);
                            if (b == null) {
                                b = new Date(0L);
                            }
                            arrayList.add(new q1g(b, str2));
                        }
                        return arrayList;
                    }
                    qgg.h0(obj);
                }
                z20 y = ((MainDatabase) obj).y();
                atVar.l = 2;
                obj = up6.G(y.a, true, true, new u10(i3), atVar);
            }
        }
        atVar = new at(this, cg6Var);
        Object obj2 = atVar.j;
        nm6 nm6Var2 = nm6.a;
        i = atVar.l;
        int i32 = 1;
        if (i != 0) {
        }
        z20 y2 = ((MainDatabase) obj2).y();
        atVar.l = 2;
        obj2 = up6.G(y2.a, true, true, new u10(i32), atVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r13 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, Iterable iterable, cg6 cg6Var) {
        bt btVar;
        int i;
        if (cg6Var instanceof bt) {
            btVar = (bt) cg6Var;
            int i2 = btVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                btVar.m = i2 - Integer.MIN_VALUE;
                Object obj = btVar.k;
                nm6 nm6Var = nm6.a;
                i = btVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (qld.H(iterable)) {
                        return Unit.a;
                    }
                    btVar.j = iterable;
                    btVar.m = 1;
                    obj = this.a.b(str, btVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Iterable iterable2 = btVar.j;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    iterable = btVar.j;
                    qgg.h0(obj);
                }
                MainDatabase mainDatabase = (MainDatabase) obj;
                ct ctVar = new ct(mainDatabase, (Continuation) null, iterable, mainDatabase.y(), 0);
                btVar.j = null;
                btVar.m = 2;
            }
        }
        btVar = new bt(this, cg6Var);
        Object obj2 = btVar.k;
        nm6 nm6Var2 = nm6.a;
        i = btVar.m;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        ct ctVar2 = new ct(mainDatabase2, (Continuation) null, iterable, mainDatabase2.y(), 0);
        btVar.j = null;
        btVar.m = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r8 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, int i, cg6 cg6Var) {
        dt dtVar;
        nm6 nm6Var;
        int i2;
        MainDatabase mainDatabase;
        Object G;
        if (cg6Var instanceof dt) {
            dtVar = (dt) cg6Var;
            int i3 = dtVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dtVar.p = i3 - Integer.MIN_VALUE;
                Object obj = dtVar.n;
                nm6Var = nm6.a;
                i2 = dtVar.p;
                if (i2 != 0) {
                    qgg.h0(obj);
                    dtVar.j = str2;
                    dtVar.m = i;
                    dtVar.p = 1;
                    obj = this.a.b(str, dtVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mainDatabase = dtVar.l;
                        qgg.h0(obj);
                        mainDatabase.F("album");
                        return Unit.a;
                    }
                    i = dtVar.m;
                    str2 = dtVar.j;
                    qgg.h0(obj);
                }
                mainDatabase = (MainDatabase) obj;
                z20 y = mainDatabase.y();
                dtVar.j = null;
                dtVar.k = obj;
                dtVar.l = mainDatabase;
                dtVar.m = i;
                dtVar.p = 2;
                G = up6.G(y.a, false, true, new x20(i, str2, 0), dtVar);
                if (G != nm6Var) {
                    G = Unit.a;
                }
            }
        }
        dtVar = new dt(this, cg6Var);
        Object obj2 = dtVar.n;
        nm6Var = nm6.a;
        i2 = dtVar.p;
        if (i2 != 0) {
        }
        mainDatabase = (MainDatabase) obj2;
        z20 y2 = mainDatabase.y();
        dtVar.j = null;
        dtVar.k = obj2;
        dtVar.l = mainDatabase;
        dtVar.m = i;
        dtVar.p = 2;
        G = up6.G(y2.a, false, true, new x20(i, str2, 0), dtVar);
        if (G != nm6Var) {
        }
    }
}
