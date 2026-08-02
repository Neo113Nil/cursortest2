package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xlg {
    public final rtl a;
    public final i2m b;
    public final uys c;
    public final pi4 d;
    public final frt e;
    public final i5h f;
    public final mka g;
    public final ykf h = new ykf(4, this);

    public xlg(rtl rtlVar, i2m i2mVar, uys uysVar, pi4 pi4Var, yx4 yx4Var, frt frtVar, i5h i5hVar, mka mkaVar) {
        this.a = rtlVar;
        this.b = i2mVar;
        this.c = uysVar;
        this.d = pi4Var;
        this.e = frtVar;
        this.f = i5hVar;
        this.g = mkaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0142, code lost:
    
        if (r0.b(r11, r8, r6) == r4) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(xlg xlgVar, cvl cvlVar, ArrayList arrayList, int i, cg6 cg6Var) {
        llg llgVar;
        int i2;
        ArrayList arrayList2;
        int i3;
        long j;
        String str;
        int i4;
        int i5;
        cvl cvlVar2 = cvlVar;
        int i6 = i;
        if (cg6Var instanceof llg) {
            llgVar = (llg) cg6Var;
            int i7 = llgVar.s;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                llgVar.s = i7 - Integer.MIN_VALUE;
                llg llgVar2 = llgVar;
                Object obj = llgVar2.q;
                nm6 nm6Var = nm6.a;
                i2 = llgVar2.s;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (i6 < 0 || i6 > cvlVar2.g) {
                        su4.s(2, null, k5r.i(i6, "addTracksToPlaylist(): incorrect position "), null);
                        return Unit.a;
                    }
                    long j2 = cvlVar2.k;
                    if (j2 < 0) {
                        su4.s(2, null, "addTracksToPlaylist(): negative nativePlaylistId", null);
                        return Unit.a;
                    }
                    Date date = new Date(System.currentTimeMillis());
                    arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new t2m((rr5) it.next(), date));
                    }
                    String str2 = xlgVar.e.c().a;
                    str2.getClass();
                    i2m i2mVar = xlgVar.b;
                    long j3 = cvlVar2.k;
                    Integer num = new Integer(i6);
                    llgVar2.j = cvlVar2;
                    llgVar2.k = arrayList2;
                    llgVar2.l = str2;
                    llgVar2.m = i6;
                    llgVar2.p = j2;
                    i3 = 0;
                    llgVar2.n = 0;
                    llgVar2.o = 0;
                    llgVar2.s = 1;
                    j = j2;
                    if (i2mVar.a(str2, j3, arrayList2, num, llgVar2) != nm6Var) {
                        str = str2;
                        i4 = 0;
                        i5 = 0;
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = llgVar2.o;
                int i9 = llgVar2.n;
                long j4 = llgVar2.p;
                int i10 = llgVar2.m;
                str = llgVar2.l;
                arrayList2 = llgVar2.k;
                cvl cvlVar3 = llgVar2.j;
                qgg.h0(obj);
                i4 = i8;
                j = j4;
                cvlVar2 = cvlVar3;
                i3 = 0;
                i5 = i9;
                i6 = i10;
                if (!Intrinsics.d(cvlVar2.l, yxr.b)) {
                    ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i11 = i3 + 1;
                        if (i3 < 0) {
                            u75.n();
                            throw null;
                        }
                        rr5 rr5Var = ((t2m) next).a;
                        rr5Var.getClass();
                        arrayList3.add(new r5j(rr5Var, kys.INSERT, cvlVar2.k, i6 + i3, null));
                        str = str;
                        it2 = it2;
                        i3 = i11;
                    }
                    uys uysVar = xlgVar.c;
                    llgVar2.j = null;
                    llgVar2.k = null;
                    llgVar2.l = null;
                    llgVar2.m = i6;
                    llgVar2.p = j;
                    llgVar2.n = i5;
                    llgVar2.o = i4;
                    llgVar2.s = 2;
                }
                return Unit.a;
            }
        }
        llgVar = new llg(xlgVar, cg6Var);
        llg llgVar22 = llgVar;
        Object obj2 = llgVar22.q;
        nm6 nm6Var2 = nm6.a;
        i2 = llgVar22.s;
        if (i2 != 0) {
        }
        if (!Intrinsics.d(cvlVar2.l, yxr.b)) {
        }
        return Unit.a;
    }

    public static final Serializable b(xlg xlgVar, String str, cvl cvlVar, aur aurVar) {
        long j = cvlVar.k;
        rtl rtlVar = xlgVar.a;
        return j >= 0 ? rtlVar.f(str, j, aurVar) : rtlVar.d(str, new nvl(cvlVar.c.a, cvlVar.a), true, aurVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(xlg xlgVar, cvl cvlVar, cg6 cg6Var) {
        mlg mlgVar;
        int i;
        String str;
        if (cg6Var instanceof mlg) {
            mlgVar = (mlg) cg6Var;
            int i2 = mlgVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mlgVar.m = i2 - Integer.MIN_VALUE;
                Object obj = mlgVar.k;
                nm6 nm6Var = nm6.a;
                i = mlgVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    String str2 = cvlVar.c.a;
                    pjc g = xlgVar.e.g();
                    mlgVar.j = str2;
                    mlgVar.m = 1;
                    obj = zsd.g0(g, mlgVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    str = str2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = mlgVar.j;
                    qgg.h0(obj);
                }
                return Boolean.valueOf(Intrinsics.d(str, ((xxq) obj).a));
            }
        }
        mlgVar = new mlg(xlgVar, cg6Var);
        Object obj2 = mlgVar.k;
        nm6 nm6Var2 = nm6.a;
        i = mlgVar.m;
        if (i != 0) {
        }
        return Boolean.valueOf(Intrinsics.d(str, ((xxq) obj2).a));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2 A[LOOP:0: B:20:0x00bc->B:22:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(xlg xlgVar, long j, String str, cg6 cg6Var) {
        slg slgVar;
        Object obj;
        nm6 nm6Var;
        int i;
        i2m i2mVar;
        Object e;
        long j2;
        String str2;
        int i2;
        int i3;
        String str3;
        long j3;
        uys uysVar;
        ArrayList arrayList;
        Iterator it;
        List list;
        i2m i2mVar2 = xlgVar.b;
        if (cg6Var instanceof slg) {
            slgVar = (slg) cg6Var;
            int i4 = slgVar.q;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                slgVar.q = i4 - Integer.MIN_VALUE;
                slg slgVar2 = slgVar;
                obj = slgVar2.o;
                nm6Var = nm6.a;
                i = slgVar2.q;
                if (i != 0) {
                    qgg.h0(obj);
                    String str4 = xlgVar.e.c().a;
                    str4.getClass();
                    slgVar2.k = str4;
                    slgVar2.j = j;
                    slgVar2.m = 0;
                    slgVar2.n = 0;
                    slgVar2.q = 1;
                    i2mVar = i2mVar2;
                    e = i2mVar.e(str4, j, str, slgVar2);
                    if (e != nm6Var) {
                        j2 = j;
                        str2 = str4;
                        i2 = 0;
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = slgVar2.l;
                        qgg.h0(obj);
                        return new Integer(list.size());
                    }
                    i2 = slgVar2.n;
                    i3 = slgVar2.m;
                    j3 = slgVar2.j;
                    str3 = slgVar2.k;
                    qgg.h0(obj);
                    List list2 = (List) obj;
                    uysVar = xlgVar.c;
                    List list3 = list2;
                    arrayList = new ArrayList(v75.o(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        i1m i1mVar = (i1m) it.next();
                        rr5 A = q6k.A(i1mVar.c, i1mVar.d);
                        int i5 = i1mVar.e;
                        long j4 = i1mVar.b;
                        List list4 = list2;
                        StringBuilder l = f1d.l(i5, "delete ", A.d(), " at ", " from playlist_id ");
                        l.append(j4);
                        ssg.a(3, null, l.toString(), null);
                        arrayList.add(new r5j(A, kys.DELETE, j4, i5, null));
                        it = it;
                        list2 = list4;
                    }
                    List list5 = list2;
                    slgVar2.k = null;
                    slgVar2.l = list5;
                    slgVar2.j = j3;
                    slgVar2.m = i3;
                    slgVar2.n = i2;
                    slgVar2.q = 3;
                    if (uysVar.b(slgVar2, str3, arrayList) != nm6Var) {
                        list = list5;
                        return new Integer(list.size());
                    }
                    return nm6Var;
                }
                int i6 = slgVar2.n;
                int i7 = slgVar2.m;
                j2 = slgVar2.j;
                String str5 = slgVar2.k;
                qgg.h0(obj);
                e = obj;
                i2mVar = i2mVar2;
                i2 = i6;
                i3 = i7;
                str2 = str5;
                slgVar2.k = str2;
                slgVar2.j = j2;
                slgVar2.m = i3;
                slgVar2.n = i2;
                slgVar2.q = 2;
                obj = i2mVar.b(slgVar2, str2, (List) e);
                if (obj != nm6Var) {
                    str3 = str2;
                    j3 = j2;
                    List list22 = (List) obj;
                    uysVar = xlgVar.c;
                    List list32 = list22;
                    arrayList = new ArrayList(v75.o(list32, 10));
                    it = list32.iterator();
                    while (it.hasNext()) {
                    }
                    List list52 = list22;
                    slgVar2.k = null;
                    slgVar2.l = list52;
                    slgVar2.j = j3;
                    slgVar2.m = i3;
                    slgVar2.n = i2;
                    slgVar2.q = 3;
                    if (uysVar.b(slgVar2, str3, arrayList) != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        slgVar = new slg(xlgVar, cg6Var);
        slg slgVar22 = slgVar;
        obj = slgVar22.o;
        nm6Var = nm6.a;
        i = slgVar22.q;
        if (i != 0) {
        }
        slgVar22.k = str2;
        slgVar22.j = j2;
        slgVar22.m = i3;
        slgVar22.n = i2;
        slgVar22.q = 2;
        obj = i2mVar.b(slgVar22, str2, (List) e);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r14 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(xlg xlgVar, List list, cg6 cg6Var) {
        tlg tlgVar;
        int i;
        List list2;
        String str;
        int i2;
        int i3;
        if (cg6Var instanceof tlg) {
            tlgVar = (tlg) cg6Var;
            int i4 = tlgVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tlgVar.p = i4 - Integer.MIN_VALUE;
                Object obj = tlgVar.n;
                nm6 nm6Var = nm6.a;
                i = tlgVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    String str2 = xlgVar.e.c().a;
                    str2.getClass();
                    i5h i5hVar = xlgVar.f;
                    tlgVar.j = list;
                    tlgVar.k = str2;
                    tlgVar.l = 0;
                    tlgVar.m = 0;
                    tlgVar.p = 1;
                    Object b = i5hVar.b(str2, tlgVar);
                    if (b != nm6Var) {
                        list2 = list;
                        str = str2;
                        obj = b;
                        i2 = 0;
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return new Integer(((Number) obj).intValue());
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = tlgVar.m;
                i3 = tlgVar.l;
                String str3 = tlgVar.k;
                List list3 = tlgVar.j;
                qgg.h0(obj);
                str = str3;
                list2 = list3;
                ueo ueoVar = (ueo) obj;
                ulg ulgVar = new ulg(ueoVar, null, xlgVar, str, list2);
                tlgVar.j = null;
                tlgVar.k = null;
                tlgVar.l = i3;
                tlgVar.m = i2;
                tlgVar.p = 2;
                obj = tyf.N(ueoVar, ulgVar, tlgVar);
            }
        }
        tlgVar = new tlg(xlgVar, cg6Var);
        Object obj2 = tlgVar.n;
        nm6 nm6Var2 = nm6.a;
        i = tlgVar.p;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        ulg ulgVar2 = new ulg(ueoVar2, null, xlgVar, str, list2);
        tlgVar.j = null;
        tlgVar.k = null;
        tlgVar.l = i3;
        tlgVar.m = i2;
        tlgVar.p = 2;
        obj2 = tyf.N(ueoVar2, ulgVar2, tlgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x018c, code lost:
    
        if (defpackage.tyf.N(r1, r0, r10) != r11) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(xlg xlgVar, cvl cvlVar, List list, List list2, cg6 cg6Var) {
        vlg vlgVar;
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j;
        int i3;
        ArrayList arrayList3;
        long j2;
        String str;
        long j3;
        ArrayList arrayList4;
        if (cg6Var instanceof vlg) {
            vlgVar = (vlg) cg6Var;
            int i4 = vlgVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vlgVar.t = i4 - Integer.MIN_VALUE;
                vlg vlgVar2 = vlgVar;
                Object obj = vlgVar2.r;
                nm6 nm6Var = nm6.a;
                i = vlgVar2.t;
                if (i != 0) {
                    qgg.h0(obj);
                    long time = new Date(System.currentTimeMillis()).getTime();
                    long j4 = cvlVar.k;
                    b38 K = qgg.K(list, list2);
                    ArrayList arrayList5 = K.a;
                    List<pws> j0 = CollectionsKt.j0(K.b);
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        ec4 ec4Var = (ec4) it.next();
                        mqs mqsVar = ec4Var.d;
                        mqs mqsVar2 = ec4Var.c;
                        Integer num = ec4Var.b;
                        int i5 = ec4Var.a;
                        if (mqsVar2 == null || num == null) {
                            j3 = j4;
                            arrayList4 = arrayList8;
                            arrayList7.add(new Pair(mqsVar, new Integer(i5)));
                        } else {
                            j3 = j4;
                            arrayList4 = arrayList8;
                            arrayList6.add(new r5j(mqsVar2.d(), kys.DELETE, j3, num.intValue(), new Long(time)));
                            arrayList6.add(new r5j(mqsVar.d(), kys.INSERT, j3, num.intValue(), null));
                            arrayList4.add(new vat(mqsVar.d(), new Integer(i5), num));
                        }
                        arrayList8 = arrayList4;
                        j4 = j3;
                    }
                    long j5 = j4;
                    ArrayList arrayList9 = arrayList8;
                    for (pws pwsVar : j0) {
                        mqs mqsVar3 = pwsVar.a;
                        arrayList6.add(new r5j(mqsVar3.d(), kys.DELETE, j5, pwsVar.b, new Long(time)));
                    }
                    String str2 = xlgVar.e.c().a;
                    str2.getClass();
                    i5h i5hVar = xlgVar.f;
                    vlgVar2.j = arrayList6;
                    vlgVar2.k = arrayList7;
                    vlgVar2.l = arrayList9;
                    vlgVar2.m = str2;
                    vlgVar2.n = time;
                    vlgVar2.o = j5;
                    i2 = 0;
                    vlgVar2.p = 0;
                    vlgVar2.q = 0;
                    vlgVar2.t = 1;
                    Object b = i5hVar.b(str2, vlgVar2);
                    if (b != nm6Var) {
                        arrayList = arrayList6;
                        arrayList2 = arrayList7;
                        j = time;
                        i3 = 0;
                        arrayList3 = arrayList9;
                        j2 = j5;
                        str = str2;
                        obj = b;
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
                int i6 = vlgVar2.q;
                int i7 = vlgVar2.p;
                long j6 = vlgVar2.o;
                long j7 = vlgVar2.n;
                String str3 = vlgVar2.m;
                ArrayList arrayList10 = vlgVar2.l;
                ArrayList arrayList11 = vlgVar2.k;
                ArrayList arrayList12 = vlgVar2.j;
                qgg.h0(obj);
                arrayList3 = arrayList10;
                arrayList = arrayList12;
                j = j7;
                i2 = i6;
                j2 = j6;
                str = str3;
                arrayList2 = arrayList11;
                i3 = i7;
                ueo ueoVar = (ueo) obj;
                wlg wlgVar = new wlg(ueoVar, null, xlgVar, str, j2, arrayList3, arrayList2, arrayList);
                vlgVar2.j = null;
                vlgVar2.k = null;
                vlgVar2.l = null;
                vlgVar2.m = null;
                vlgVar2.n = j;
                vlgVar2.o = j2;
                vlgVar2.p = i3;
                vlgVar2.q = i2;
                vlgVar2.t = 2;
            }
        }
        vlgVar = new vlg(xlgVar, cg6Var);
        vlg vlgVar22 = vlgVar;
        Object obj2 = vlgVar22.r;
        nm6 nm6Var2 = nm6.a;
        i = vlgVar22.t;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        wlg wlgVar2 = new wlg(ueoVar2, null, xlgVar, str, j2, arrayList3, arrayList2, arrayList);
        vlgVar22.j = null;
        vlgVar22.k = null;
        vlgVar22.l = null;
        vlgVar22.m = null;
        vlgVar22.n = j;
        vlgVar22.o = j2;
        vlgVar22.p = i3;
        vlgVar22.q = i2;
        vlgVar22.t = 2;
    }

    public final eno g(Function1 function1) {
        String str = this.e.c().a;
        str.getClass();
        return this.f.f(str, new String[]{"playlist", "playlist_track"}, function1);
    }
}
