package defpackage;

import android.util.Log;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class ed {
    static {
        u75.h(new d85(c3x.h(4294798348L)), new d85(c3x.h(4287433981L)), new d85(c3x.h(4289789725L)), new d85(c3x.h(4290275675L)), new d85(c3x.h(4294832396L)), new d85(c3x.h(4279041465L)), new d85(c3x.h(4294773981L)), new d85(c3x.h(4279012861L)), new d85(c3x.h(4294773848L)), new d85(c3x.h(4294965753L)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x05fb, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r14.K(), java.lang.Integer.valueOf(r5)) == false) goto L245;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v110 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(List list, long j, yci yciVar, yci yciVar2, boolean z, List list2, List list3, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, boolean z6, Integer num2, Function1 function1, hq5 hq5Var, int i) {
        Function1 function12;
        yci yciVar3;
        yci yciVar4;
        List list4;
        ?? r5;
        ArrayList arrayList;
        Function1 function13;
        long j2;
        ArrayList arrayList2;
        ArrayList<List> arrayList3;
        int i2;
        ArrayList arrayList4;
        aqi aqiVar;
        ?? r10;
        boolean z7;
        oq5 oq5Var;
        Function1 function14;
        boolean z8;
        Object next;
        yci yciVar5;
        Function1 function15;
        xqn xqnVar;
        int i3;
        aqi aqiVar2;
        Long l;
        Object obj;
        List list5 = list;
        boolean z9 = z;
        List list6 = list3;
        boolean z10 = z3;
        boolean z11 = z5;
        list5.getClass();
        yciVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1092233847);
        int i4 = (i & 6) == 0 ? (oq5Var2.h(list5) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= oq5Var2.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= oq5Var2.c(3.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= oq5Var2.e(30000L) ? 2048 : 1024;
        }
        int i5 = i & 24576;
        int i6 = RemoteCameraConfig.Notification.ID;
        if (i5 == 0) {
            i4 |= oq5Var2.f(yciVar) ? 16384 : 8192;
        }
        int i7 = i4 | 196608;
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i7 |= oq5Var2.g(z9) ? 1048576 : 524288;
        }
        List list7 = list2;
        if ((i & 12582912) == 0) {
            i7 |= oq5Var2.h(list7) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i7 |= oq5Var2.h(list6) ? 67108864 : 33554432;
        }
        boolean z12 = z2;
        if ((i & 805306368) == 0) {
            i7 |= oq5Var2.g(z12) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        boolean z13 = z4;
        Integer num3 = num;
        int i8 = (oq5Var2.g(z10) ? 4 : 2) | (oq5Var2.g(z13) ? 32 : 16) | (oq5Var2.f(num3) ? 256 : 128) | (oq5Var2.g(z11) ? 2048 : 1024);
        if (oq5Var2.g(z6)) {
            i6 = 16384;
        }
        int i9 = i8 | i6 | (oq5Var2.f(num2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if ((i7 & 306783379) == 306783378 && (599187 & i9) == 599186 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar5 = yciVar2;
            function15 = function1;
            yciVar4 = yciVar;
            list4 = list6;
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            int i10 = i & 1;
            vci vciVar = vci.a;
            if (i10 == 0 || oq5Var2.y()) {
                function12 = d5.u;
                yciVar3 = vciVar;
            } else {
                oq5Var2.S();
                yciVar3 = yciVar2;
                function12 = function1;
            }
            oq5Var2.q();
            yci yciVar6 = yciVar3;
            if (!list5.isEmpty()) {
                List list8 = list5;
                if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                    Iterator it = list8.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        if (((List) it.next()).size() != ((List) list5.get(0)).size()) {
                            Log.e("AccumulationGraph", "Lists must be the same size");
                            xmn r = oq5Var2.r();
                            if (r != null) {
                                r.d = new bd(list5, j, yciVar, yciVar6, z9, list7, list6, z12, z10, z13, num3, z11, z6, num2, function12, i, 1);
                                return;
                            }
                            return;
                        }
                        list5 = list;
                        z9 = z;
                        list7 = list2;
                        list6 = list3;
                        z12 = z2;
                        z10 = z3;
                        z13 = z4;
                        num3 = num;
                        z11 = z5;
                        it = it2;
                    }
                }
            }
            int i11 = i7;
            yci yciVar7 = yciVar6;
            List<List> list9 = list;
            if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                for (List list10 : list9) {
                    if (!(list10 instanceof Collection) || !list10.isEmpty()) {
                        Iterator it3 = list10.iterator();
                        while (it3.hasNext()) {
                            if (((jod) it3.next()).a.longValue() < 0.0f) {
                                Log.e("AccumulationGraph", "Values of the points must be non-negative");
                                xmn r2 = oq5Var2.r();
                                if (r2 != null) {
                                    r2.d = new bd(list, j, yciVar, yciVar7, z, list2, list3, z2, z3, z4, num, z5, z6, num2, function12, i, 2);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    yciVar7 = yciVar7;
                    function12 = function12;
                }
            }
            yciVar4 = yciVar;
            list4 = list3;
            Function1 function16 = function12;
            yci yciVar8 = yciVar7;
            oq5Var2.a0(1399201148);
            Object K = oq5Var2.K();
            Object obj2 = gq5.a;
            if (K == obj2) {
                r5 = 0;
                K = szf.g0(new cma(0));
                oq5Var2.k0(K);
            } else {
                r5 = 0;
            }
            aqi aqiVar3 = (aqi) K;
            oq5Var2.p(r5);
            oq5Var2.a0(1399203004);
            Object K2 = oq5Var2.K();
            if (K2 == obj2) {
                K2 = szf.g0(new cma((float) r5));
                oq5Var2.k0(K2);
            }
            aqi aqiVar4 = (aqi) K2;
            oq5Var2.p(r5);
            int i12 = i11;
            ArrayList arrayList5 = new ArrayList(v75.o(list9, 10));
            Iterator it4 = list9.iterator();
            while (it4.hasNext()) {
                List list11 = (List) it4.next();
                ArrayList arrayList6 = new ArrayList();
                Iterator it5 = list11.iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    int i13 = i12;
                    Iterator it6 = it4;
                    Iterator it7 = it5;
                    if (((jod) next2).b >= j - 30000) {
                        arrayList6.add(next2);
                    }
                    i12 = i13;
                    it4 = it6;
                    it5 = it7;
                }
                arrayList5.add(arrayList6);
            }
            int i14 = i12;
            if (z) {
                ArrayList arrayList7 = new ArrayList(v75.o(list9, 10));
                for (List list12 : list9) {
                    ListIterator listIterator = list12.listIterator(list12.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            if (((jod) obj).b < j - 30000) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    jod jodVar = (jod) obj;
                    arrayList7.add(jodVar != null ? (Long) jodVar.a : null);
                }
                j2 = 0;
                ArrayList arrayList8 = new ArrayList(v75.o(arrayList5, 10));
                Iterator it8 = arrayList5.iterator();
                int i15 = 0;
                while (it8.hasNext()) {
                    Object next3 = it8.next();
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        u75.n();
                        throw null;
                    }
                    List<jod> list13 = (List) next3;
                    ArrayList arrayList9 = arrayList5;
                    Iterator it9 = it8;
                    ArrayList arrayList10 = new ArrayList(v75.o(list13, 10));
                    for (jod jodVar2 : list13) {
                        Function1 function17 = function16;
                        long j3 = jodVar2.b;
                        long longValue = jodVar2.a.longValue();
                        Long l2 = (Long) arrayList7.get(i15);
                        arrayList10.add(new jod(Long.valueOf(longValue - (l2 != null ? l2.longValue() : 0L)), j3));
                        function16 = function17;
                        arrayList7 = arrayList7;
                    }
                    arrayList8.add(arrayList10);
                    arrayList5 = arrayList9;
                    it8 = it9;
                    i15 = i16;
                }
                arrayList = arrayList5;
                function13 = function16;
                arrayList2 = arrayList8;
            } else {
                arrayList = arrayList5;
                function13 = function16;
                j2 = 0;
                arrayList2 = arrayList;
            }
            ArrayList arrayList11 = new ArrayList();
            xqn xqnVar2 = new xqn();
            if (arrayList2.isEmpty()) {
                arrayList3 = arrayList2;
                i2 = i9;
            } else {
                int size = ((List) arrayList2.get(0)).size();
                ArrayList arrayList12 = new ArrayList(size);
                int i17 = 0;
                while (i17 < size) {
                    arrayList12.add(new jod(Long.valueOf(j2), j2));
                    i17++;
                    i9 = i9;
                    arrayList2 = arrayList2;
                }
                arrayList3 = arrayList2;
                i2 = i9;
                for (List list14 : arrayList3) {
                    List list15 = list14;
                    Iterator it10 = list15.iterator();
                    ArrayList arrayList13 = new ArrayList(Math.min(v75.o(arrayList12, 10), v75.o(list15, 10)));
                    for (Iterator it11 = arrayList12.iterator(); it11.hasNext() && it10.hasNext(); it11 = it11) {
                        Object next4 = it11.next();
                        jod jodVar3 = (jod) it10.next();
                        arrayList13.add(new jod(Long.valueOf(jodVar3.a.longValue() + ((jod) next4).a.longValue()), jodVar3.b));
                    }
                    arrayList11.add(arrayList13);
                    arrayList12 = arrayList13;
                }
                List list16 = (List) CollectionsKt.Z(arrayList11);
                if (list16 != null) {
                    Iterator it12 = list16.iterator();
                    if (it12.hasNext()) {
                        l = Long.valueOf(((jod) it12.next()).a.longValue());
                        while (it12.hasNext()) {
                            Long valueOf = Long.valueOf(((jod) it12.next()).a.longValue());
                            if (l.compareTo(valueOf) < 0) {
                                l = valueOf;
                            }
                        }
                        xqnVar2.a = l;
                    }
                }
                l = null;
                xqnVar2.a = l;
            }
            ArrayList arrayList14 = new ArrayList();
            int size2 = arrayList11.size();
            for (int i18 = 0; i18 < size2; i18++) {
                arrayList14.add(new ArrayList());
                int size3 = ((Collection) arrayList11.get(i18)).size();
                int i19 = 0;
                while (i19 < size3) {
                    if (i19 == 0) {
                        ((List) arrayList14.get(i18)).add(((List) arrayList11.get(i18)).get(i19));
                        xqnVar = xqnVar2;
                        i3 = size2;
                        aqiVar2 = aqiVar4;
                    } else {
                        xqnVar = xqnVar2;
                        i3 = size2;
                        aqiVar2 = aqiVar4;
                        ((List) arrayList14.get(i18)).add(new jod(((jod) ((List) arrayList11.get(i18)).get(i19 - 1)).a, ((jod) ((List) arrayList11.get(i18)).get(i19)).b));
                        ((List) arrayList14.get(i18)).add(((List) arrayList11.get(i18)).get(i19));
                    }
                    i19++;
                    xqnVar2 = xqnVar;
                    size2 = i3;
                    aqiVar4 = aqiVar2;
                }
            }
            xqn xqnVar3 = xqnVar2;
            aqi aqiVar5 = aqiVar4;
            int i20 = i14 >> 15;
            oq5Var2.a0(733328855);
            iz2 iz2Var = b2c.b;
            wg3 e = ug3.e(iz2Var, false, oq5Var2, 0);
            oq5Var2.a0(-1323940314);
            int i21 = oq5Var2.P;
            a l3 = oq5Var2.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(yciVar8);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, e, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l3, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O) {
                arrayList4 = arrayList14;
            } else {
                arrayList4 = arrayList14;
            }
            ouj.x(i21, oq5Var2, i21, kb5Var3);
            A.invoke(new lrq(oq5Var2), oq5Var2, 0);
            oq5Var2.a0(2058660585);
            oq5Var2.a0(-1903499430);
            Object K3 = oq5Var2.K();
            if (K3 == obj2) {
                aqiVar = aqiVar5;
                r10 = 0;
                K3 = new cd(aqiVar3, aqiVar, 0);
                oq5Var2.k0(K3);
            } else {
                aqiVar = aqiVar5;
                r10 = 0;
            }
            oq5Var2.p(r10);
            yci d = androidx.compose.ui.layout.a.d(yciVar4, (Function1) K3);
            oq5Var2.a0(733328855);
            wg3 e2 = ug3.e(iz2Var, r10, oq5Var2, r10);
            oq5Var2.a0(-1323940314);
            int i22 = oq5Var2.P;
            a l4 = oq5Var2.l();
            wn5 A2 = ghh.A(d);
            oq5Var2.d0();
            aqi aqiVar6 = aqiVar;
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, e2, kb5Var);
            g0g.U(oq5Var2, l4, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i22))) {
                ouj.x(i22, oq5Var2, i22, kb5Var3);
            }
            A2.invoke(new lrq(oq5Var2), oq5Var2, 0);
            oq5Var2.a0(2058660585);
            int i23 = 2058660585;
            int i24 = 6;
            ksw.j(6, oq5Var2, d.c(vciVar, 1.0f), new dd(arrayList, xqnVar3, arrayList4, list, list2, aqiVar6, aqiVar3, j, z));
            boolean z14 = true;
            k5r.s(oq5Var2, false, true, false, false);
            oq5Var2.a0(-1903313024);
            if (z5 || z3) {
                float f = 1;
                int i25 = -1323940314;
                yci q = androidx.compose.foundation.layout.a.q(vciVar, f, f, 0.0f, 0.0f, 12);
                int i26 = d85.o;
                yci m = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.b(q, d85.b(d85.d, 0.5f, 0.0f, 0.0f, 0.0f, 14), vnj.i), f);
                oq5Var2.a0(-483455358);
                ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                oq5Var2.a0(-1323940314);
                int i27 = oq5Var2.P;
                a l5 = oq5Var2.l();
                wn5 A3 = ghh.A(m);
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, a, kb5Var);
                g0g.U(oq5Var2, l5, kb5Var2);
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i27))) {
                    ouj.x(i27, oq5Var2, i27, kb5Var3);
                }
                A3.invoke(new lrq(oq5Var2), oq5Var2, 0);
                oq5Var2.a0(2058660585);
                oq5Var2.a0(631766870);
                int i28 = 0;
                oq5 oq5Var3 = oq5Var2;
                for (Object obj3 : CollectionsKt.j0(arrayList3)) {
                    int i29 = i28 + 1;
                    if (i28 < 0) {
                        u75.n();
                        throw null;
                    }
                    List list17 = (List) obj3;
                    nx0 g = qx0.g(8);
                    oq5Var3.a0(693286680);
                    nho a2 = lho.a(g, b2c.k, oq5Var3, i24);
                    oq5Var3.a0(i25);
                    int i30 = oq5Var3.P;
                    a l6 = oq5Var3.l();
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    wn5 A4 = ghh.A(vciVar);
                    oq5Var3.d0();
                    boolean z15 = z14;
                    if (oq5Var3.O) {
                        oq5Var3.k(grbVar2);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(oq5Var3, a2, wp5.f);
                    g0g.U(oq5Var3, l6, wp5.e);
                    kb5 kb5Var4 = wp5.g;
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i30))) {
                        ouj.x(i30, oq5Var3, i30, kb5Var4);
                    }
                    A4.invoke(new lrq(oq5Var3), oq5Var3, 0);
                    oq5Var3.a0(i23);
                    Integer valueOf2 = i28 >= list.size() - list4.size() ? Integer.valueOf((list.size() - 1) - i28) : null;
                    int i31 = i24;
                    int i32 = i25;
                    oq5 oq5Var4 = oq5Var3;
                    Function1 function18 = function13;
                    h4a.i(null, valueOf2 != null ? (String) list4.get(valueOf2.intValue()) : null, null, false, z2, false, oq5Var4, (i20 & 57344) | 196614, 12);
                    Iterator it13 = list17.iterator();
                    if (it13.hasNext()) {
                        next = it13.next();
                        if (it13.hasNext()) {
                            long longValue2 = ((jod) next).a.longValue();
                            do {
                                Object next5 = it13.next();
                                long longValue3 = ((jod) next5).a.longValue();
                                if (longValue2 < longValue3) {
                                    next = next5;
                                    longValue2 = longValue3;
                                }
                            } while (it13.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    jod jodVar4 = (jod) next;
                    int i33 = i2 << 12;
                    h4a.i(num, function18.invoke(jodVar4 != null ? (Long) jodVar4.a : null), null, false, z3, z4, oq5Var4, ((i2 >> 6) & 14) | (i33 & 57344) | (i33 & 458752), 12);
                    jod jodVar5 = (jod) CollectionsKt.Z(list17);
                    int i34 = i2 << 3;
                    h4a.i(num2, function18.invoke(jodVar5 != null ? (Long) jodVar5.a : null), null, false, z5, z6, oq5Var4, ((i2 >> 15) & 14) | (i34 & 57344) | (i34 & 458752), 12);
                    k5r.s(oq5Var4, false, z15, false, false);
                    i28 = i29;
                    z14 = z15;
                    i25 = i32;
                    i24 = i31;
                    i23 = 2058660585;
                    function13 = function18;
                    oq5Var3 = oq5Var4;
                }
                z7 = z14;
                oq5Var = oq5Var3;
                function14 = function13;
                z8 = false;
                k5r.s(oq5Var, false, false, z7, false);
                oq5Var.p(false);
            } else {
                z7 = true;
                oq5Var = oq5Var2;
                function14 = function13;
                z8 = false;
            }
            k5r.s(oq5Var, z8, z8, z7, z8);
            oq5Var.p(z8);
            yciVar5 = yciVar8;
            function15 = function14;
        }
        xmn r3 = oq5Var.r();
        if (r3 != null) {
            r3.d = new bd(list, j, yciVar4, yciVar5, z, list2, list4, z2, z3, z4, num, z5, z6, num2, function15, i, 0);
        }
    }

    public static final float b(aqi aqiVar) {
        return ((cma) aqiVar.getValue()).a;
    }

    public static final nh0 c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return ph0.a();
        }
        nh0 a = ph0.a();
        a.f(((Number) ((Pair) CollectionsKt.Q(arrayList)).a).floatValue(), ((Number) ((Pair) CollectionsKt.Q(arrayList)).b).floatValue());
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            Pair pair = (Pair) obj;
            if (i != 0) {
                a.e(((Number) pair.a).floatValue(), ((Number) pair.b).floatValue());
            }
            i = i2;
        }
        return a;
    }
}
