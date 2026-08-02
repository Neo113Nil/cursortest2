package ru.yandex.taxi.masstransit.mapper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.yandex.mapkit.transport.masstransit.TransportContour;
import defpackage.aqb1;
import defpackage.avj0;
import defpackage.b3v0;
import defpackage.b64;
import defpackage.bdc;
import defpackage.bs30;
import defpackage.bt11;
import defpackage.bzy0;
import defpackage.cdc;
import defpackage.cvu0;
import defpackage.d611;
import defpackage.dj40;
import defpackage.dwh0;
import defpackage.e0h0;
import defpackage.e2r;
import defpackage.e3n;
import defpackage.e6v;
import defpackage.eay0;
import defpackage.ee01;
import defpackage.ef30;
import defpackage.eja1;
import defpackage.enm;
import defpackage.evu0;
import defpackage.f5q0;
import defpackage.f911;
import defpackage.fay0;
import defpackage.fc30;
import defpackage.fe01;
import defpackage.ff30;
import defpackage.fh4;
import defpackage.fj40;
import defpackage.ft20;
import defpackage.g8e;
import defpackage.g911;
import defpackage.gdc;
import defpackage.ge01;
import defpackage.gw00;
import defpackage.gz30;
import defpackage.h640;
import defpackage.h73;
import defpackage.h911;
import defpackage.hio;
import defpackage.hj40;
import defpackage.hj5;
import defpackage.hz30;
import defpackage.i0o;
import defpackage.i911;
import defpackage.ib11;
import defpackage.j73;
import defpackage.j911;
import defpackage.jar;
import defpackage.jl40;
import defpackage.jm30;
import defpackage.jr1;
import defpackage.jt01;
import defpackage.k911;
import defpackage.kd01;
import defpackage.kdc;
import defpackage.kj40;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.l540;
import defpackage.l911;
import defpackage.liu0;
import defpackage.lj40;
import defpackage.m1j;
import defpackage.m911;
import defpackage.n940;
import defpackage.nk31;
import defpackage.nra0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.obm;
import defpackage.oc30;
import defpackage.oj5;
import defpackage.oov0;
import defpackage.oyr;
import defpackage.pc30;
import defpackage.pj5;
import defpackage.ps20;
import defpackage.pwy0;
import defpackage.q2h0;
import defpackage.qc30;
import defpackage.qv10;
import defpackage.r440;
import defpackage.rc30;
import defpackage.rw30;
import defpackage.s5r;
import defpackage.s6b1;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sn4;
import defpackage.su30;
import defpackage.sy30;
import defpackage.t7s;
import defpackage.tbo;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tog0;
import defpackage.ty30;
import defpackage.ubo;
import defpackage.up11;
import defpackage.ux11;
import defpackage.uy30;
import defpackage.v1u;
import defpackage.vha1;
import defpackage.vng;
import defpackage.vs01;
import defpackage.vy30;
import defpackage.w1u;
import defpackage.w211;
import defpackage.w511;
import defpackage.wdt0;
import defpackage.wy30;
import defpackage.xjf;
import defpackage.xng0;
import defpackage.xob1;
import defpackage.xpw;
import defpackage.xyy0;
import defpackage.ycc;
import defpackage.yi40;
import defpackage.yi5;
import defpackage.yx11;
import defpackage.zi40;
import defpackage.zj5;
import defpackage.zuj0;
import defpackage.zzi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.model.EssentialPoint$Type;
import ru.yandex.taxi.masstransit.model.GroundThreadPriority;
import ru.yandex.taxi.masstransit.model.MtTransportSystemId;
import ru.yandex.taxi.masstransit.utils.VehicleType;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.utils.ForegroundColorSpanFix;
import ru.yandex.taxi.utils.StyledTypefaceSpan;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final zuj0 b;
    public final pwy0 c;
    public final wdt0 d;
    public final zzi e;
    public final h640 f;
    public final kj40 g;
    public final f h;
    public final hio i;

    public a(Context context, zuj0 zuj0Var, pwy0 pwy0Var, wdt0 wdt0Var, zzi zziVar, h640 h640Var, kj40 kj40Var, f fVar, hio hioVar) {
        this.a = context;
        this.b = zuj0Var;
        this.c = pwy0Var;
        this.d = wdt0Var;
        this.e = zziVar;
        this.f = h640Var;
        this.g = kj40Var;
        this.h = fVar;
        this.i = hioVar;
    }

    public static i0o b(fj40 fj40Var, h911 h911Var, k911 k911Var, String str) {
        hj40 hj40Var = (hj40) kotlin.collections.a.b0(fj40Var.e());
        String str2 = hj40Var != null ? hj40Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        return new i0o(str3, fj40Var.d(), k911Var, oyr.q(str, " ", str3, Extension.FIX_SPACE, fj40Var.d()), h911Var, String.valueOf(fj40Var.b()));
    }

    public static String c(wy30 wy30Var) {
        return wy30Var instanceof ty30 ? ((ty30) wy30Var).d : wy30Var instanceof sy30 ? ((sy30) wy30Var).e : "";
    }

    public static k911 l(hz30 hz30Var) {
        if (hz30Var instanceof gz30) {
            return new h911(((gz30) hz30Var).a);
        }
        boolean z = hz30Var instanceof bs30;
        f911 f911Var = f911.a;
        if (z) {
            return f911Var;
        }
        boolean z2 = hz30Var instanceof yi40;
        g911 g911Var = g911.a;
        if (z2 || (hz30Var instanceof zi40)) {
            return g911Var;
        }
        if (hz30Var instanceof l540) {
            return new h911(((l540) hz30Var).j);
        }
        if (hz30Var instanceof jm30) {
            return new h911(((jm30) hz30Var).e);
        }
        if (hz30Var instanceof r440) {
            return new h911(((r440) hz30Var).d);
        }
        if (hz30Var instanceof lj40) {
            return new i911(((lj40) hz30Var).h);
        }
        if (hz30Var instanceof nk31) {
            return f911Var;
        }
        if (hz30Var == null) {
            return j911.a;
        }
        w511.b();
        return null;
    }

    public final SpannableStringBuilder a(String str) {
        int m = s8o.m(new bdc(xng0.error), this.a);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new ForegroundColorSpanFix(m), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder d(kdc kdcVar, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(fh4.h(this.a, str2, kdcVar, new bdc(xng0.everFront)));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object[], m1j[]] */
    /* JADX WARN: Type inference failed for: r3v84, types: [java.lang.Object[], m1j[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(jm30 jm30Var, k911 k911Var, k911 k911Var2, Map map, boolean z, oov0 oov0Var, ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar, boolean z2, ContinuationImpl continuationImpl) {
        MtDetailRouteUiStateMapper$mapGroundItems$1 mtDetailRouteUiStateMapper$mapGroundItems$1;
        int i;
        obm obmVar;
        h911 h911Var;
        boolean z3;
        List list;
        int i2;
        h640 h640Var;
        avj0 avj0Var;
        boolean z4;
        String str;
        String str2;
        MtTransportType mtTransportType;
        MtDetailRouteUiStateMapper$mapGroundItems$1 mtDetailRouteUiStateMapper$mapGroundItems$12;
        CoroutineSingletons coroutineSingletons;
        ArrayList arrayList;
        Object obj;
        v1u v1uVar;
        Object next;
        ArrayList arrayList2;
        boolean z5;
        ArrayList arrayList3;
        boolean z6;
        v1u v1uVar2;
        Object next2;
        v1u v1uVar3;
        a aVar2;
        String m;
        kdc kdcVar;
        bdc bdcVar;
        Iterator it;
        Object obj2;
        Object next3;
        String m2;
        Object next4;
        Iterator it2;
        Object xyy0Var;
        i0o b;
        boolean z7;
        Object obj3;
        e6v e6vVar;
        jm30 jm30Var2;
        h911 h911Var2;
        e6v e6vVar2;
        Object obj4;
        i0o i0oVar;
        h911 h911Var3;
        Drawable mutate;
        a aVar3 = this;
        Map map2 = map;
        if (continuationImpl instanceof MtDetailRouteUiStateMapper$mapGroundItems$1) {
            mtDetailRouteUiStateMapper$mapGroundItems$1 = (MtDetailRouteUiStateMapper$mapGroundItems$1) continuationImpl;
            int i3 = mtDetailRouteUiStateMapper$mapGroundItems$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mtDetailRouteUiStateMapper$mapGroundItems$1.label = i3 - Integer.MIN_VALUE;
                MtDetailRouteUiStateMapper$mapGroundItems$1 mtDetailRouteUiStateMapper$mapGroundItems$13 = mtDetailRouteUiStateMapper$mapGroundItems$1;
                Object obj5 = mtDetailRouteUiStateMapper$mapGroundItems$13.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailRouteUiStateMapper$mapGroundItems$13.label;
                if (i != 0) {
                    kotlin.b.b(obj5);
                    kdc kdcVar2 = jm30Var.e;
                    boolean z8 = jm30Var.b;
                    List list2 = jm30Var.i;
                    int i4 = jm30Var.l;
                    h911 h911Var4 = new h911(kdcVar2);
                    w1u f = jm30Var.f();
                    List list3 = jm30Var.a;
                    String str3 = jm30Var.f;
                    MtTransportType mtTransportType2 = f.d.b;
                    int d = xob1.d(mtTransportType2);
                    avj0 avj0Var2 = (avj0) aVar3.b;
                    Drawable t = vng.t(d, avj0Var2.a);
                    if (t == null || (mutate = t.mutate()) == null) {
                        obmVar = null;
                    } else {
                        mutate.setTint(s8o.m(new bdc(xng0.textMinor), aVar3.a));
                        obmVar = new obm(mtTransportType2.getMapkitType(), mutate);
                    }
                    boolean isEmpty = list3.isEmpty();
                    h640 h640Var2 = aVar3.f;
                    if (isEmpty) {
                        v1uVar2 = v1u.h;
                        h911Var = h911Var4;
                        mtTransportType = mtTransportType2;
                        z4 = z8;
                        list = list2;
                        i2 = i4;
                        str2 = str3;
                        mtDetailRouteUiStateMapper$mapGroundItems$12 = mtDetailRouteUiStateMapper$mapGroundItems$13;
                        coroutineSingletons = coroutineSingletons2;
                        h640Var = h640Var2;
                        str = null;
                        avj0Var = avj0Var2;
                    } else {
                        String d2 = s6b1.d(jm30Var);
                        if (d2 == null) {
                            d2 = "";
                        }
                        MtTransportType mtTransportType3 = mtTransportType2;
                        bdc bdcVar2 = new bdc(xng0.everFront);
                        String str4 = d2;
                        h911Var = h911Var4;
                        bdc bdcVar3 = new bdc(xng0.error);
                        List list4 = list3;
                        bdc bdcVar4 = bdcVar2;
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            ycc.r(((w1u) it3.next()).g, arrayList4);
                            bdcVar3 = bdcVar3;
                        }
                        bdc bdcVar5 = bdcVar3;
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            avj0 avj0Var3 = avj0Var2;
                            Object next5 = it4.next();
                            boolean z9 = z8;
                            if (hashSet.add(((rc30) next5).getClass())) {
                                arrayList5.add(next5);
                            }
                            avj0Var2 = avj0Var3;
                            z8 = z9;
                        }
                        avj0 avj0Var4 = avj0Var2;
                        boolean z10 = z8;
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator it5 = list4.iterator();
                            while (it5.hasNext()) {
                                if (((w1u) it5.next()).g.isEmpty()) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        z3 = true;
                        h640Var2.getClass();
                        bzy0 a = h640.a(jm30Var);
                        boolean z11 = true;
                        if (arrayList5.size() == 1 && z3) {
                            rc30 rc30Var = (rc30) kotlin.collections.a.P(arrayList5);
                            if (jl40.l(rc30Var, oc30.a)) {
                                kdc kdcVar3 = jm30Var.e;
                                h911 h911Var5 = new h911(kdcVar3);
                                String str5 = str3;
                                String valueOf = String.valueOf(i4);
                                ArrayList arrayList6 = new ArrayList(tcc.n(list4, 10));
                                Iterator it6 = list4.iterator();
                                while (it6.hasNext()) {
                                    kdc kdcVar4 = kdcVar3;
                                    ArrayList arrayList7 = arrayList6;
                                    bdc bdcVar6 = bdcVar4;
                                    arrayList7.add(o((w1u) it6.next(), bdcVar6, bdcVar5, "", false, false, "", h911Var5, valueOf, z2));
                                    z11 = z11;
                                    arrayList6 = arrayList7;
                                    str5 = str5;
                                    mtTransportType3 = mtTransportType3;
                                    kdcVar3 = kdcVar4;
                                    list2 = list2;
                                    i4 = i4;
                                    bdcVar4 = bdcVar6;
                                    avj0Var4 = avj0Var4;
                                    h640Var2 = h640Var2;
                                }
                                str2 = str5;
                                list = list2;
                                i2 = i4;
                                h640Var = h640Var2;
                                avj0Var = avj0Var4;
                                z4 = z10;
                                str = null;
                                mtTransportType = mtTransportType3;
                                v1uVar = new v1u(arrayList6, 0, Collections.singletonList(a(avj0Var.h(kyh0.mt_closed_alert))), kdcVar3, a, 32);
                                aVar3 = this;
                                mtDetailRouteUiStateMapper$mapGroundItems$12 = mtDetailRouteUiStateMapper$mapGroundItems$13;
                                coroutineSingletons = coroutineSingletons2;
                            } else {
                                list = list2;
                                i2 = i4;
                                h640Var = h640Var2;
                                avj0Var = avj0Var4;
                                z4 = z10;
                                str = null;
                                str2 = str3;
                                mtTransportType = mtTransportType3;
                                if (rc30Var instanceof pc30) {
                                    bdc bdcVar7 = bdcVar4;
                                    kdc kdcVar5 = jm30Var.e;
                                    List list5 = list3;
                                    h911 h911Var6 = new h911(kdcVar5);
                                    String valueOf2 = String.valueOf(i2);
                                    int d3 = gw00.d(tcc.n(list4, 10));
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(d3 >= 16 ? d3 : 16);
                                    Iterator it7 = list4.iterator();
                                    while (it7.hasNext()) {
                                        w1u w1uVar = (w1u) it7.next();
                                        ArrayList arrayList8 = w1uVar.g;
                                        ArrayList arrayList9 = new ArrayList();
                                        for (Object obj6 : arrayList8) {
                                            List list6 = list5;
                                            if (obj6 instanceof pc30) {
                                                arrayList9.add(obj6);
                                            }
                                            list5 = list6;
                                        }
                                        List list7 = list5;
                                        Iterator it8 = arrayList9.iterator();
                                        if (it8.hasNext()) {
                                            next4 = it8.next();
                                            if (it8.hasNext()) {
                                                it2 = it7;
                                                long j = ((pc30) next4).b;
                                                do {
                                                    Object next6 = it8.next();
                                                    long j2 = j;
                                                    j = ((pc30) next6).b;
                                                    if (j2 > j) {
                                                        next4 = next6;
                                                    } else {
                                                        j = j2;
                                                    }
                                                } while (it8.hasNext());
                                            } else {
                                                it2 = it7;
                                            }
                                        } else {
                                            it2 = it7;
                                            next4 = null;
                                        }
                                        Pair pair = new Pair(w1uVar, (pc30) next4);
                                        linkedHashMap.put(pair.c(), pair.f());
                                        list5 = list7;
                                        it7 = it2;
                                    }
                                    List list8 = list5;
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        if (entry.getValue() != null) {
                                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    Iterator it9 = linkedHashMap2.entrySet().iterator();
                                    if (it9.hasNext()) {
                                        next3 = it9.next();
                                        if (it9.hasNext()) {
                                            pc30 pc30Var = (pc30) ((Map.Entry) next3).getValue();
                                            Object obj7 = next3;
                                            long j3 = pc30Var != null ? pc30Var.b : 0L;
                                            while (true) {
                                                Object next7 = it9.next();
                                                pc30 pc30Var2 = (pc30) ((Map.Entry) next7).getValue();
                                                long j4 = j3;
                                                j3 = pc30Var2 != null ? pc30Var2.b : 0L;
                                                if (j4 > j3) {
                                                    obj7 = next7;
                                                } else {
                                                    j3 = j4;
                                                }
                                                if (!it9.hasNext()) {
                                                    break;
                                                }
                                                bdcVar7 = bdcVar7;
                                                kdcVar5 = kdcVar5;
                                            }
                                            next3 = obj7;
                                        }
                                    } else {
                                        next3 = null;
                                    }
                                    Map.Entry entry2 = (Map.Entry) next3;
                                    if (entry2 == null) {
                                        v1uVar2 = v1u.h;
                                        aVar3 = this;
                                        mtDetailRouteUiStateMapper$mapGroundItems$12 = mtDetailRouteUiStateMapper$mapGroundItems$13;
                                    } else {
                                        w1u w1uVar2 = (w1u) entry2.getKey();
                                        pc30 pc30Var3 = (pc30) entry2.getValue();
                                        aVar2 = this;
                                        v1uVar3 = new v1u(Collections.singletonList(o(w1uVar2, bdcVar7, kdcVar5, "", false, false, "", h911Var6, valueOf2, z2)), list8.size() - 1, Collections.singletonList((pc30Var3 == null || (m2 = m(pc30Var3)) == null) ? "" : a(m2)), bdcVar5, a, 32);
                                        aVar3 = aVar2;
                                        mtDetailRouteUiStateMapper$mapGroundItems$12 = mtDetailRouteUiStateMapper$mapGroundItems$13;
                                        v1uVar2 = v1uVar3;
                                    }
                                } else {
                                    if (!(rc30Var instanceof qc30)) {
                                        w511.b();
                                        return null;
                                    }
                                    bdc bdcVar8 = bdcVar4;
                                    kdc kdcVar6 = jm30Var.e;
                                    h911 h911Var7 = new h911(kdcVar6);
                                    String valueOf3 = String.valueOf(i2);
                                    int d4 = gw00.d(tcc.n(list4, 10));
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(d4 >= 16 ? d4 : 16);
                                    Iterator it10 = list4.iterator();
                                    while (it10.hasNext()) {
                                        w1u w1uVar3 = (w1u) it10.next();
                                        ArrayList arrayList10 = w1uVar3.g;
                                        ArrayList arrayList11 = new ArrayList();
                                        for (Object obj8 : arrayList10) {
                                            if (obj8 instanceof qc30) {
                                                arrayList11.add(obj8);
                                            }
                                        }
                                        Iterator it11 = arrayList11.iterator();
                                        if (it11.hasNext()) {
                                            Object next8 = it11.next();
                                            if (it11.hasNext()) {
                                                kdcVar = kdcVar6;
                                                bdcVar = bdcVar8;
                                                long j5 = ((qc30) next8).b;
                                                while (true) {
                                                    Object next9 = it11.next();
                                                    it = it10;
                                                    long j6 = j5;
                                                    j5 = ((qc30) next9).b;
                                                    if (j6 < j5) {
                                                        next8 = next9;
                                                    } else {
                                                        j5 = j6;
                                                    }
                                                    if (!it11.hasNext()) {
                                                        break;
                                                    }
                                                    it10 = it;
                                                }
                                            } else {
                                                it = it10;
                                                kdcVar = kdcVar6;
                                                bdcVar = bdcVar8;
                                            }
                                            obj2 = next8;
                                        } else {
                                            it = it10;
                                            kdcVar = kdcVar6;
                                            bdcVar = bdcVar8;
                                            obj2 = null;
                                        }
                                        Pair pair2 = new Pair(w1uVar3, (qc30) obj2);
                                        linkedHashMap3.put(pair2.c(), pair2.f());
                                        bdcVar8 = bdcVar;
                                        kdcVar6 = kdcVar;
                                        it10 = it;
                                    }
                                    kdc kdcVar7 = kdcVar6;
                                    bdc bdcVar9 = bdcVar8;
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                                        if (entry3.getValue() != null) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    Iterator it12 = linkedHashMap4.entrySet().iterator();
                                    if (it12.hasNext()) {
                                        next2 = it12.next();
                                        if (it12.hasNext()) {
                                            qc30 qc30Var = (qc30) ((Map.Entry) next2).getValue();
                                            long j7 = qc30Var != null ? qc30Var.b : 0L;
                                            while (true) {
                                                Object next10 = it12.next();
                                                qc30 qc30Var2 = (qc30) ((Map.Entry) next10).getValue();
                                                Iterator it13 = it12;
                                                long j8 = qc30Var2 != null ? qc30Var2.b : 0L;
                                                if (j7 < j8) {
                                                    j7 = j8;
                                                    next2 = next10;
                                                }
                                                if (!it13.hasNext()) {
                                                    break;
                                                }
                                                it12 = it13;
                                            }
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                    Map.Entry entry4 = (Map.Entry) next2;
                                    if (entry4 == null) {
                                        v1uVar2 = v1u.h;
                                        aVar3 = this;
                                        mtDetailRouteUiStateMapper$mapGroundItems$12 = mtDetailRouteUiStateMapper$mapGroundItems$13;
                                    } else {
                                        w1u w1uVar4 = (w1u) entry4.getKey();
                                        qc30 qc30Var3 = (qc30) entry4.getValue();
                                        aVar2 = this;
                                        v1uVar3 = new v1u(Collections.singletonList(o(w1uVar4, bdcVar9, kdcVar7, "", false, false, "", h911Var7, valueOf3, z2)), list3.size() - 1, Collections.singletonList((qc30Var3 == null || (m = m(qc30Var3)) == null) ? "" : a(m)), bdcVar5, a, 32);
                                        aVar3 = aVar2;
                                        mtDetailRouteUiStateMapper$mapGroundItems$12 = mtDetailRouteUiStateMapper$mapGroundItems$13;
                                        v1uVar2 = v1uVar3;
                                    }
                                }
                                coroutineSingletons = coroutineSingletons2;
                            }
                        } else {
                            a aVar4 = this;
                            list = list2;
                            i2 = i4;
                            h640Var = h640Var2;
                            bdc bdcVar10 = bdcVar4;
                            avj0Var = avj0Var4;
                            z4 = z10;
                            str = null;
                            str2 = str3;
                            mtTransportType = mtTransportType3;
                            List x0 = kotlin.collections.a.x0(list4, new ff30(0, str4, map2));
                            ArrayList arrayList12 = new ArrayList();
                            for (Object obj9 : x0) {
                                w1u w1uVar5 = (w1u) obj9;
                                String str6 = w1uVar5.e;
                                if (str6 == null) {
                                    str6 = str4;
                                }
                                if (vha1.c(w1uVar5, (Map) map2.get(str6)).compareTo(GroundThreadPriority.NoAlerts) < 0) {
                                    arrayList12.add(obj9);
                                }
                            }
                            if (!arrayList12.isEmpty()) {
                                x0 = arrayList12;
                            }
                            List<w1u> list9 = x0;
                            List k0 = kotlin.collections.a.k0(list4, kotlin.collections.a.N0(list9));
                            ArrayList arrayList13 = new ArrayList();
                            for (w1u w1uVar6 : list9) {
                                String str7 = w1uVar6.e;
                                if (str7 == null) {
                                    str7 = str4;
                                }
                                Map map3 = (Map) map2.get(str7);
                                wy30 wy30Var = map3 != null ? (wy30) map3.get(w1uVar6.f) : null;
                                if (wy30Var != null) {
                                    arrayList13.add(wy30Var);
                                }
                            }
                            ArrayList arrayList14 = new ArrayList();
                            Iterator it14 = arrayList13.iterator();
                            while (it14.hasNext()) {
                                Object next11 = it14.next();
                                if (next11 instanceof uy30) {
                                    arrayList14.add(next11);
                                }
                            }
                            boolean z12 = !arrayList13.isEmpty() && arrayList14.size() == arrayList13.size();
                            int i5 = 10;
                            ArrayList arrayList15 = new ArrayList(tcc.n(list9, 10));
                            int i6 = 0;
                            for (Object obj10 : list9) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                w1u w1uVar7 = (w1u) obj10;
                                String str8 = w1uVar7.e;
                                if (str8 == null) {
                                    str8 = str4;
                                }
                                Map map4 = (Map) map2.get(str8);
                                wy30 wy30Var2 = map4 != null ? (wy30) map4.get(w1uVar7.f) : null;
                                String q = aVar4.q(wy30Var2);
                                if (q.length() == 0) {
                                    q = str2;
                                }
                                bdc bdcVar11 = bdcVar10;
                                kdc kdcVar8 = jm30Var.e;
                                if (i6 == 0) {
                                    arrayList2 = arrayList14;
                                    z5 = true;
                                } else {
                                    arrayList2 = arrayList14;
                                    z5 = false;
                                }
                                if (wy30Var2 == null || !((wy30Var2 instanceof ty30) || (wy30Var2 instanceof sy30))) {
                                    arrayList3 = arrayList15;
                                    z6 = false;
                                } else {
                                    arrayList3 = arrayList15;
                                    z6 = true;
                                }
                                String str9 = str4;
                                ArrayList arrayList16 = arrayList2;
                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                                ArrayList arrayList17 = arrayList3;
                                arrayList17.add(o(w1uVar7, bdcVar11, kdcVar8, q, z5, z6, c(wy30Var2), new h911(jm30Var.e), String.valueOf(i2), z2));
                                bdcVar10 = bdcVar11;
                                arrayList13 = arrayList13;
                                i5 = 10;
                                arrayList15 = arrayList17;
                                i6 = i7;
                                arrayList14 = arrayList16;
                                coroutineSingletons2 = coroutineSingletons3;
                                mtDetailRouteUiStateMapper$mapGroundItems$13 = mtDetailRouteUiStateMapper$mapGroundItems$13;
                                map2 = map;
                                aVar4 = this;
                                str4 = str9;
                            }
                            ArrayList arrayList18 = arrayList13;
                            aVar3 = aVar4;
                            ArrayList arrayList19 = arrayList14;
                            mtDetailRouteUiStateMapper$mapGroundItems$12 = mtDetailRouteUiStateMapper$mapGroundItems$13;
                            coroutineSingletons = coroutineSingletons2;
                            ArrayList arrayList20 = arrayList15;
                            int i8 = i5;
                            int size = k0.size();
                            if (z12) {
                                Iterator it15 = arrayList19.iterator();
                                if (it15.hasNext()) {
                                    next = it15.next();
                                    if (it15.hasNext()) {
                                        double d5 = ((uy30) next).d;
                                        do {
                                            Object next12 = it15.next();
                                            double d6 = ((uy30) next12).d;
                                            if (Double.compare(d5, d6) > 0) {
                                                next = next12;
                                                d5 = d6;
                                            }
                                        } while (it15.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                uy30 uy30Var = (uy30) next;
                                arrayList = scc.h(uy30Var != null ? aVar3.g.d(uy30Var) : null);
                            } else {
                                e2r l = kotlin.sequences.b.l(new h73(1, arrayList18), new ps20(26));
                                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                s5r s5rVar = new s5r(l);
                                while (s5rVar.hasNext()) {
                                    Object next13 = s5rVar.next();
                                    o430 o430Var = e3n.b;
                                    Long valueOf4 = Long.valueOf(e3n.o(kp50.V(((n940) next13).a, DurationUnit.SECONDS), DurationUnit.MINUTES));
                                    Object obj11 = linkedHashMap5.get(valueOf4);
                                    if (obj11 == null) {
                                        obj11 = new ArrayList();
                                        linkedHashMap5.put(valueOf4, obj11);
                                    }
                                    ((List) obj11).add(next13);
                                }
                                TreeMap treeMap = new TreeMap(linkedHashMap5);
                                ArrayList arrayList21 = new ArrayList();
                                Iterator it16 = treeMap.entrySet().iterator();
                                while (it16.hasNext()) {
                                    Iterator it17 = ((Iterable) ((Map.Entry) it16.next()).getValue()).iterator();
                                    while (true) {
                                        if (!it17.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it17.next();
                                        String str10 = ((n940) obj).b;
                                        if (str10 != null && str10.length() != 0) {
                                            break;
                                        }
                                    }
                                    n940 n940Var = (n940) obj;
                                    if (n940Var != null) {
                                        arrayList21.add(n940Var);
                                    }
                                }
                                List A0 = kotlin.collections.a.A0(arrayList21, 3);
                                ArrayList arrayList22 = new ArrayList(tcc.n(A0, i8));
                                Iterator it18 = A0.iterator();
                                while (it18.hasNext()) {
                                    arrayList22.add(((n940) it18.next()).b);
                                }
                                arrayList = arrayList22;
                            }
                            bdc bdcVar12 = new bdc(xng0.textMain);
                            String str11 = jm30Var.f().c;
                            v1uVar = new v1u(arrayList20, z12, size, arrayList, bdcVar12, str11.length() != 0 ? avj0Var.i(kyh0.mt_ground_direction, str11) : "", a);
                        }
                        v1uVar2 = v1uVar;
                    }
                    hj40 hj40Var = (hj40) kotlin.collections.a.R(list);
                    String str12 = hj40Var != null ? hj40Var.a : str;
                    if (str12 == null) {
                        str12 = "";
                    }
                    String str13 = jm30Var.f;
                    String valueOf5 = String.valueOf(i2);
                    String h = avj0Var.h(aqb1.a(mtTransportType));
                    String X = kotlin.collections.a.X(v1uVar2.a, Extension.FIX_SPACE, null, null, new ps20(27), 30);
                    String X2 = kotlin.collections.a.X(v1uVar2.d, Extension.FIX_SPACE, null, null, null, 62);
                    e6v yi5Var = new yi5(str12, str13, obmVar, v1uVar2, k911Var, kotlin.collections.a.X(scc.g(h, str12, v1uVar2.b ? ((Object) X) + " " + ((Object) X2) : avj0Var.i(kyh0.mt_approximate_bus_schedule_content_description, X, X2), avj0Var.i(kyh0.mt_appoximate_nearest_bus_content_description, str2)), Extension.FIX_SPACE, null, null, null, 62), kotlin.collections.a.X(scc.g(avj0Var.h(aqb1.a(mtTransportType)), str12, str2), Extension.FIX_SPACE, null, null, null, 62), h911Var, valueOf5);
                    h911 h911Var8 = h911Var;
                    h640Var.getClass();
                    bzy0 a2 = h640.a(jm30Var);
                    xyy0Var = a2 != null ? new xyy0(avj0Var.h(kyh0.mt_view_other_variants), a2, h911Var8, String.valueOf(i2)) : str;
                    b = b(jm30Var, h911Var8, k911Var2, avj0Var.h(aqb1.a(jm30Var.f().d.b)));
                    if (!z4 || oov0Var == null) {
                        z7 = z;
                        obj3 = str;
                        e6vVar = yi5Var;
                        jm30Var2 = jm30Var;
                        h911Var2 = h911Var8;
                        return kotlin.collections.a.m0(j73.A(new m1j[]{obj3, b}), kotlin.collections.a.m0(aVar3.g(jm30Var2, h911Var2, z7), j73.A(new m1j[]{e6vVar, xyy0Var})));
                    }
                    String valueOf6 = String.valueOf(i2);
                    boolean a3 = aVar.a();
                    aVar3.h.getClass();
                    hj40 hj40Var2 = (hj40) kotlin.collections.a.R(list);
                    String str14 = hj40Var2 != null ? hj40Var2.c : str;
                    hj40 hj40Var3 = (hj40) kotlin.collections.a.b0(list);
                    fe01 fe01Var = new fe01(str14, hj40Var3 != null ? hj40Var3.c : str);
                    VehicleType vehicleType = VehicleType.Bus;
                    MtTransportType mtTransportType4 = jm30Var.f().d.b;
                    MtDetailRouteUiStateMapper$mapGroundItems$1 mtDetailRouteUiStateMapper$mapGroundItems$14 = mtDetailRouteUiStateMapper$mapGroundItems$12;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.L$0 = jm30Var;
                    String str15 = str;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.L$1 = str15;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.L$2 = str15;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.L$3 = str15;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.L$4 = str15;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.L$5 = str15;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.L$6 = h911Var8;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.L$7 = yi5Var;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.L$8 = xyy0Var;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.L$9 = b;
                    z7 = z;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.Z$0 = z7;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.Z$1 = z2;
                    mtDetailRouteUiStateMapper$mapGroundItems$14.label = 1;
                    obj5 = aVar3.i(valueOf6, oov0Var, a3, fe01Var, h911Var8, vehicleType, mtTransportType4, mtDetailRouteUiStateMapper$mapGroundItems$14);
                    CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
                    if (obj5 == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    e6vVar2 = yi5Var;
                    obj4 = xyy0Var;
                    jm30Var2 = jm30Var;
                    i0oVar = b;
                    h911Var3 = h911Var8;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z13 = mtDetailRouteUiStateMapper$mapGroundItems$13.Z$0;
                    i0oVar = (i0o) mtDetailRouteUiStateMapper$mapGroundItems$13.L$9;
                    obj4 = (xyy0) mtDetailRouteUiStateMapper$mapGroundItems$13.L$8;
                    e6vVar2 = (m1j) mtDetailRouteUiStateMapper$mapGroundItems$13.L$7;
                    h911Var3 = (h911) mtDetailRouteUiStateMapper$mapGroundItems$13.L$6;
                    jm30Var2 = (jm30) mtDetailRouteUiStateMapper$mapGroundItems$13.L$0;
                    kotlin.b.b(obj5);
                    z7 = z13;
                }
                b = i0oVar;
                xyy0Var = obj4;
                e6vVar = e6vVar2;
                obj3 = (kd01) obj5;
                h911Var2 = h911Var3;
                return kotlin.collections.a.m0(j73.A(new m1j[]{obj3, b}), kotlin.collections.a.m0(aVar3.g(jm30Var2, h911Var2, z7), j73.A(new m1j[]{e6vVar, xyy0Var})));
            }
        }
        mtDetailRouteUiStateMapper$mapGroundItems$1 = new MtDetailRouteUiStateMapper$mapGroundItems$1(aVar3, continuationImpl);
        MtDetailRouteUiStateMapper$mapGroundItems$1 mtDetailRouteUiStateMapper$mapGroundItems$132 = mtDetailRouteUiStateMapper$mapGroundItems$1;
        Object obj52 = mtDetailRouteUiStateMapper$mapGroundItems$132.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailRouteUiStateMapper$mapGroundItems$132.label;
        if (i != 0) {
        }
        b = i0oVar;
        xyy0Var = obj4;
        e6vVar = e6vVar2;
        obj3 = (kd01) obj52;
        h911Var2 = h911Var3;
        return kotlin.collections.a.m0(j73.A(new m1j[]{obj3, b}), kotlin.collections.a.m0(aVar3.g(jm30Var2, h911Var2, z7), j73.A(new m1j[]{e6vVar, xyy0Var})));
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x054d, code lost:
    
        if (r1 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x097a, code lost:
    
        if (r9 == null) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x04a1, code lost:
    
        if (r2 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x053c, code lost:
    
        if (r1 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x053f, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x054f, code lost:
    
        r1 = ((defpackage.avj0) r21).h(defpackage.kyh0.scooters_parking);
        r0 = defpackage.scc.g(r37, new defpackage.e0o(r5, r0.j, r1, r0.f, r29, kotlin.collections.a.X(defpackage.j73.A(new java.lang.String[]{r5, r0.j, r1}), ru.CryptoPro.JCP.tools.CertReader.Extension.FIX_SPACE, null, null, null, 62), r47, defpackage.b64.e(r3, "_scooter_end")));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0a6d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r4v18, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v47, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0a6e -> B:10:0x0a82). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(rw30 rw30Var, Set set, oov0 oov0Var, ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar, boolean z, fay0 fay0Var, boolean z2, ContinuationImpl continuationImpl) {
        MtDetailRouteUiStateMapper$mapRouteItems$1 mtDetailRouteUiStateMapper$mapRouteItems$1;
        int i;
        Throwable th;
        Set set2;
        ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar2;
        boolean z3;
        boolean z4;
        rw30 rw30Var2;
        MtDetailRouteUiStateMapper$mapRouteItems$1 mtDetailRouteUiStateMapper$mapRouteItems$12;
        Iterator it;
        hj5 hj5Var;
        oov0 oov0Var2;
        fay0 fay0Var2;
        CoroutineSingletons coroutineSingletons;
        su30 su30Var;
        ArrayList arrayList;
        jar jarVar;
        String str;
        int i2;
        Object obj;
        jar jarVar2;
        oov0 oov0Var3;
        ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar3;
        su30 su30Var2;
        hj5 hj5Var2;
        String str2;
        fay0 fay0Var3;
        String str3;
        boolean z5;
        Iterator it2;
        rw30 rw30Var3;
        hj40 hj40Var;
        kdc kdcVar;
        hj40 hj40Var2;
        List list;
        String str4;
        yx11 yx11Var;
        ux11 ux11Var;
        l911 l911Var;
        int i3;
        String str5;
        String string;
        SpannableStringBuilder d;
        String str6;
        List singletonList;
        String str7;
        h911 h911Var;
        String str8;
        Integer num;
        String str9;
        String i4;
        String str10;
        i0o i0oVar;
        if (continuationImpl instanceof MtDetailRouteUiStateMapper$mapRouteItems$1) {
            mtDetailRouteUiStateMapper$mapRouteItems$1 = (MtDetailRouteUiStateMapper$mapRouteItems$1) continuationImpl;
            int i5 = mtDetailRouteUiStateMapper$mapRouteItems$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mtDetailRouteUiStateMapper$mapRouteItems$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = mtDetailRouteUiStateMapper$mapRouteItems$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailRouteUiStateMapper$mapRouteItems$1.label;
                zuj0 zuj0Var = this.b;
                String str11 = Extension.FIX_SPACE;
                if (i != 0) {
                    th = null;
                    kotlin.b.b(obj2);
                    su30 su30Var3 = rw30Var.a;
                    fc30 fc30Var = rw30Var.d;
                    ubo uboVar = su30Var3.g;
                    String str12 = su30Var3.e;
                    List list2 = su30Var3.a;
                    tbo tboVar = uboVar.a;
                    String str13 = tboVar.b;
                    avj0 avj0Var = (avj0) zuj0Var;
                    hj5 hj5Var3 = new hj5(tboVar.a, str13, k(tboVar, fc30Var.a), fc30Var.c, oyr.q(avj0Var.h(kyh0.mt_route_start_description), Extension.FIX_SPACE, tboVar.a, Extension.FIX_SPACE, str13), l((hz30) kotlin.collections.a.R(list2)), str12 == null ? String.valueOf(su30Var3.hashCode()) : str12);
                    tbo tboVar2 = su30Var3.g.b;
                    String str14 = tboVar2.b;
                    String q = oyr.q(tboVar2.a, Extension.FIX_SPACE, avj0Var.h(kyh0.mt_route_end_description), Extension.FIX_SPACE, str14);
                    String str15 = tboVar2.a;
                    obm k = k(tboVar2, fc30Var.b);
                    k911 l = l((hz30) kotlin.collections.a.b0(list2));
                    if (str12 == null) {
                        str12 = String.valueOf(su30Var3.hashCode());
                    }
                    jar jarVar3 = new jar(str15, str14, k, q, l, str12);
                    List list3 = list2;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                    Iterator it3 = list3.iterator();
                    set2 = set;
                    aVar2 = aVar;
                    z3 = z;
                    z4 = z2;
                    rw30Var2 = rw30Var;
                    mtDetailRouteUiStateMapper$mapRouteItems$12 = mtDetailRouteUiStateMapper$mapRouteItems$1;
                    it = it3;
                    hj5Var = hj5Var3;
                    oov0Var2 = oov0Var;
                    fay0Var2 = fay0Var;
                    coroutineSingletons = coroutineSingletons2;
                    su30Var = su30Var3;
                    arrayList = arrayList2;
                    jarVar = jarVar3;
                    str = Extension.FIX_SPACE;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = mtDetailRouteUiStateMapper$mapRouteItems$1.I$0;
                    boolean z6 = mtDetailRouteUiStateMapper$mapRouteItems$1.Z$1;
                    boolean z7 = mtDetailRouteUiStateMapper$mapRouteItems$1.Z$0;
                    ?? r6 = (Collection) mtDetailRouteUiStateMapper$mapRouteItems$1.L$21;
                    Iterator it4 = (Iterator) mtDetailRouteUiStateMapper$mapRouteItems$1.L$15;
                    ?? r8 = (Collection) mtDetailRouteUiStateMapper$mapRouteItems$1.L$14;
                    jar jarVar4 = (jar) mtDetailRouteUiStateMapper$mapRouteItems$1.L$11;
                    hj5 hj5Var4 = (hj5) mtDetailRouteUiStateMapper$mapRouteItems$1.L$8;
                    su30 su30Var4 = (su30) mtDetailRouteUiStateMapper$mapRouteItems$1.L$5;
                    fay0 fay0Var4 = (fay0) mtDetailRouteUiStateMapper$mapRouteItems$1.L$4;
                    ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar4 = (ru.yandex.taxi.masstransit.geopayment.tickets.model.a) mtDetailRouteUiStateMapper$mapRouteItems$1.L$3;
                    oov0 oov0Var4 = (oov0) mtDetailRouteUiStateMapper$mapRouteItems$1.L$2;
                    Set set3 = (Set) mtDetailRouteUiStateMapper$mapRouteItems$1.L$1;
                    rw30 rw30Var4 = (rw30) mtDetailRouteUiStateMapper$mapRouteItems$1.L$0;
                    kotlin.b.b(obj2);
                    rw30 rw30Var5 = rw30Var4;
                    fay0Var2 = fay0Var4;
                    int i7 = i6;
                    Set set4 = set3;
                    MtDetailRouteUiStateMapper$mapRouteItems$1 mtDetailRouteUiStateMapper$mapRouteItems$13 = mtDetailRouteUiStateMapper$mapRouteItems$1;
                    boolean z8 = z7;
                    it = it4;
                    zuj0 zuj0Var2 = zuj0Var;
                    oov0Var2 = oov0Var4;
                    su30 su30Var5 = su30Var4;
                    boolean z9 = z6;
                    jarVar = jarVar4;
                    ArrayList arrayList3 = r6;
                    a aVar5 = this;
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                    ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar6 = aVar4;
                    ArrayList arrayList4 = r8;
                    arrayList3.add((List) obj2);
                    coroutineSingletons = coroutineSingletons3;
                    arrayList = arrayList4;
                    hj5Var = hj5Var4;
                    aVar2 = aVar6;
                    z4 = z9;
                    su30Var = su30Var5;
                    str = str11;
                    rw30Var2 = rw30Var5;
                    zuj0Var = zuj0Var2;
                    i2 = i7;
                    set2 = set4;
                    mtDetailRouteUiStateMapper$mapRouteItems$12 = mtDetailRouteUiStateMapper$mapRouteItems$13;
                    z3 = z8;
                    th = null;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i8 = i2 + 1;
                        if (i2 < 0) {
                            Throwable th2 = th;
                            scc.m();
                            throw th2;
                        }
                        zuj0 zuj0Var3 = zuj0Var;
                        hz30 hz30Var = (hz30) next;
                        int i9 = i2;
                        List list4 = su30Var.a;
                        boolean z10 = z4;
                        hz30 hz30Var2 = (hz30) kotlin.collections.a.S(i9 - 1, list4);
                        hz30 hz30Var3 = (hz30) kotlin.collections.a.S(i8, list4);
                        Iterator it5 = kotlin.sequences.b.f(new enm(new h73(1, list4), new ft20(12, hz30Var), 0), 1).iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj = th;
                                break;
                            }
                            obj = it5.next();
                            hz30 hz30Var4 = (hz30) obj;
                            if ((hz30Var4 instanceof fj40) || (hz30Var4 instanceof bs30)) {
                                break;
                            }
                        }
                        hz30 hz30Var5 = (hz30) obj;
                        boolean contains = set2.contains(new Integer(hz30Var.b()));
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$0 = rw30Var2;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$1 = set2;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$2 = oov0Var2;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$3 = aVar2;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$4 = fay0Var2;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$5 = su30Var;
                        Throwable th3 = th;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$6 = th3;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$7 = th3;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$8 = hj5Var;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$9 = th3;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$10 = th3;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$11 = jarVar;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$12 = th3;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$13 = th3;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$14 = arrayList;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$15 = it;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$16 = th3;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$17 = th3;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$18 = th3;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$19 = th3;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$20 = th3;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.L$21 = arrayList;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.Z$0 = z3;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.Z$1 = z10;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.I$0 = i8;
                        ArrayList arrayList5 = arrayList;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.I$1 = i9;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.Z$2 = contains;
                        mtDetailRouteUiStateMapper$mapRouteItems$12.label = 1;
                        boolean z11 = hz30Var instanceof l540;
                        List list5 = EmptyList.a;
                        if (z11) {
                            l540 l540Var = (l540) hz30Var;
                            k911 l2 = l(hz30Var2);
                            k911 l3 = l(hz30Var3);
                            if (fay0Var2 == null) {
                                fay0Var3 = fay0Var2;
                                it2 = it;
                                jarVar2 = jarVar;
                                oov0Var3 = oov0Var2;
                                aVar3 = aVar2;
                                mtDetailRouteUiStateMapper$mapRouteItems$13 = mtDetailRouteUiStateMapper$mapRouteItems$12;
                                z8 = z3;
                                su30Var2 = su30Var;
                                rw30Var3 = rw30Var2;
                                i7 = i8;
                                z5 = z10;
                                set4 = set2;
                                coroutineSingletons3 = coroutineSingletons;
                                str11 = str;
                                zuj0Var2 = zuj0Var3;
                                obj2 = list5;
                                hj5Var2 = hj5Var;
                                aVar5 = this;
                                if (obj2 == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                z9 = z5;
                                oov0Var2 = oov0Var3;
                                su30Var5 = su30Var2;
                                aVar6 = aVar3;
                                rw30Var5 = rw30Var3;
                                ArrayList arrayList6 = arrayList5;
                                arrayList3 = arrayList6;
                                hj5Var4 = hj5Var2;
                                jarVar = jarVar2;
                                it = it2;
                                fay0Var2 = fay0Var3;
                                arrayList4 = arrayList6;
                            } else {
                                Iterator it6 = it;
                                jarVar2 = jarVar;
                                h911 h911Var2 = new h911(new bdc(xng0.controlMain));
                                double d2 = l540Var.d;
                                oov0Var3 = oov0Var2;
                                int i10 = l540Var.e;
                                su30Var2 = su30Var;
                                String g = t7s.g(zuj0Var3, ((long) d2) * 1000);
                                hj5Var2 = hj5Var;
                                String p = g8e.p(((avj0) zuj0Var3).h(kyh0.time_to_arrive_content_description), " ", g);
                                if (p.length() > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    str10 = g;
                                    aVar3 = aVar2;
                                    sb.append((Object) String.valueOf(p.charAt(0)).toUpperCase(Locale.ROOT));
                                    sb.append(p.substring(1));
                                    p = sb.toString();
                                } else {
                                    str10 = g;
                                    aVar3 = aVar2;
                                }
                                obm obmVar = fay0Var2.c;
                                CharSequence charSequence = fay0Var2.a;
                                ?? r7 = fay0Var2.b;
                                String str16 = r7 == 0 ? p : r7;
                                eay0 eay0Var = new eay0(obmVar, charSequence, str16, l540Var.f, l2, ((Object) charSequence) + " " + p, str10, h911Var2, String.valueOf(i10));
                                String str17 = fay0Var2.e;
                                if (str17 == null) {
                                    i0oVar = null;
                                } else {
                                    if (str17.length() > 0) {
                                        str17 = ((Object) String.valueOf(str17.charAt(0)).toUpperCase(Locale.ROOT)) + str17.substring(1);
                                    }
                                    String str18 = str17;
                                    i0oVar = new i0o(str18, l540Var.g, l3, str18, h911Var2, b64.e(i10, "_end"));
                                }
                                aVar5 = this;
                                it2 = it6;
                                obj2 = j73.A(new m1j[]{eay0Var, i0oVar});
                                fay0Var3 = fay0Var2;
                                mtDetailRouteUiStateMapper$mapRouteItems$13 = mtDetailRouteUiStateMapper$mapRouteItems$12;
                                z8 = z3;
                                zuj0Var2 = zuj0Var3;
                                rw30Var3 = rw30Var2;
                                i7 = i8;
                                z5 = z10;
                                set4 = set2;
                                coroutineSingletons3 = coroutineSingletons;
                                str11 = str;
                                if (obj2 == coroutineSingletons3) {
                                }
                            }
                        } else {
                            Iterator it7 = it;
                            jarVar2 = jarVar;
                            oov0Var3 = oov0Var2;
                            aVar3 = aVar2;
                            su30Var2 = su30Var;
                            hj5Var2 = hj5Var;
                            boolean z12 = hz30Var instanceof bs30;
                            str2 = "";
                            aVar5 = this;
                            Context context = aVar5.a;
                            if (z12) {
                                bs30 bs30Var = (bs30) hz30Var;
                                f5q0 f5q0Var = bs30Var.a;
                                if (f5q0Var == null || (str9 = f5q0Var.b) == null) {
                                    fay0Var3 = fay0Var2;
                                    mtDetailRouteUiStateMapper$mapRouteItems$13 = mtDetailRouteUiStateMapper$mapRouteItems$12;
                                    z8 = z3;
                                    str3 = str;
                                    it2 = it7;
                                    zuj0Var2 = zuj0Var3;
                                    rw30Var3 = rw30Var2;
                                    i7 = i8;
                                    z5 = z10;
                                    set4 = set2;
                                    coroutineSingletons3 = coroutineSingletons;
                                    obj2 = list5;
                                } else {
                                    String str19 = f5q0Var.a;
                                    str2 = str19 != null ? str19 : "";
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    Drawable t = vng.t(q2h0.ic_walk_16, context);
                                    if (t != null) {
                                        fay0Var3 = fay0Var2;
                                        mtDetailRouteUiStateMapper$mapRouteItems$13 = mtDetailRouteUiStateMapper$mapRouteItems$12;
                                        z8 = z3;
                                        spannableStringBuilder.append(" ", new CustomImageSpan(t, 2, false, false, new xjf("pedestrian-" + aVar5.c.getThemeType()), 12, null), 33);
                                    } else {
                                        fay0Var3 = fay0Var2;
                                        mtDetailRouteUiStateMapper$mapRouteItems$13 = mtDetailRouteUiStateMapper$mapRouteItems$12;
                                        z8 = z3;
                                    }
                                    spannableStringBuilder.append((CharSequence) str9);
                                    spannableStringBuilder.append((CharSequence) " · ");
                                    spannableStringBuilder.append((CharSequence) str2);
                                    int i11 = bs30Var.b;
                                    if (i11 < 995) {
                                        int ceil = (int) Math.ceil(i11 / 0.71d);
                                        i4 = g8e.p(str2, " · ", tje.U(context, dwh0.walking_navigation_steps, kyh0.walking_navigation_steps_other, ceil, Integer.valueOf(ceil)));
                                    } else {
                                        i4 = ((avj0) zuj0Var3).i(kyh0.mt_route_details_v2_walking_time, str2);
                                    }
                                    str3 = str;
                                    singletonList = Collections.singletonList(new nra0(spannableStringBuilder, str9, i4, g8e.p(((avj0) zuj0Var3).i(kyh0.mt_pedestrian_section_description, str9), str3, str2), String.valueOf(bs30Var.e)));
                                    it2 = it7;
                                    obj2 = singletonList;
                                    zuj0Var2 = zuj0Var3;
                                    rw30Var3 = rw30Var2;
                                    i7 = i8;
                                    z5 = z10;
                                    set4 = set2;
                                    coroutineSingletons3 = coroutineSingletons;
                                }
                            } else {
                                fay0Var3 = fay0Var2;
                                mtDetailRouteUiStateMapper$mapRouteItems$13 = mtDetailRouteUiStateMapper$mapRouteItems$12;
                                z8 = z3;
                                str3 = str;
                                if (hz30Var instanceof gz30) {
                                    if (z10) {
                                        gz30 gz30Var = (gz30) hz30Var;
                                        k911 l4 = l(hz30Var3);
                                        kdc kdcVar2 = gz30Var.a;
                                        int i12 = gz30Var.p;
                                        List list6 = gz30Var.k;
                                        String str20 = gz30Var.d;
                                        h911 h911Var3 = new h911(kdcVar2);
                                        String str21 = gz30Var.g;
                                        if (str21 != null) {
                                            if (evu0.J(str21)) {
                                                str21 = null;
                                            }
                                        }
                                        hj40 hj40Var3 = (hj40) kotlin.collections.a.R(list6);
                                        str21 = hj40Var3 != null ? hj40Var3.a : null;
                                        if (str21 == null) {
                                            str21 = "";
                                        }
                                        Integer num2 = gz30Var.c;
                                        if (num2 != null) {
                                            h911Var = h911Var3;
                                            str8 = ((avj0) zuj0Var3).i(kyh0.mobility_hub_multimodality_scooter_reservation, String.valueOf(num2.intValue()));
                                        } else {
                                            h911Var = h911Var3;
                                            str8 = null;
                                        }
                                        if (str20 != null && str20.length() != 0 && (num = gz30Var.l) != null) {
                                            str20 = ((avj0) zuj0Var3).i(kyh0.mobility_hub_multimodality_scooter_price_amount, str20, String.valueOf(num));
                                        }
                                        oj5 oj5Var = new oj5(str21, gz30Var.i, gz30Var.b, str8, gz30Var.e, gz30Var.d, gz30Var.l, gz30Var.m, kotlin.collections.a.X(j73.A(new String[]{str21, gz30Var.i, gz30Var.b, str8, str20}), Extension.FIX_SPACE, null, null, null, 62), h911Var, b64.e(i12, "_scooter_start"));
                                        String str22 = gz30Var.h;
                                        if (str22 != null) {
                                            if (evu0.J(str22)) {
                                                str22 = null;
                                            }
                                        }
                                        hj40 hj40Var4 = (hj40) kotlin.collections.a.b0(list6);
                                        str22 = hj40Var4 != null ? hj40Var4.a : null;
                                    }
                                    it2 = it7;
                                    zuj0Var2 = zuj0Var3;
                                    rw30Var3 = rw30Var2;
                                    i7 = i8;
                                    z5 = z10;
                                    set4 = set2;
                                    coroutineSingletons3 = coroutineSingletons;
                                    obj2 = list5;
                                } else if (hz30Var instanceof yi40) {
                                    yi40 yi40Var = (yi40) hz30Var;
                                    f5q0 f5q0Var2 = yi40Var.a;
                                    String string2 = context.getString(kyh0.mt_transfer);
                                    if (f5q0Var2 != null) {
                                        string2 = ((avj0) zuj0Var3).i(kyh0.mt_text_separator, string2, f5q0Var2.b);
                                    }
                                    String string3 = (f5q0Var2 == null || (str7 = f5q0Var2.a) == null || str7.length() == 0) ? context.getString(kyh0.mt_route_details_v2_transfer_other_transport) : ((avj0) zuj0Var3).i(kyh0.mt_route_details_v2_walking_time, str7);
                                    String str23 = f5q0Var2 != null ? f5q0Var2.b : null;
                                    singletonList = Collections.singletonList(new vs01(string2, str23 != null ? str23 : "", string3, String.valueOf(yi40Var.d)));
                                } else {
                                    if (hz30Var instanceof zi40) {
                                        zi40 zi40Var = (zi40) hz30Var;
                                        f5q0 f5q0Var3 = zi40Var.a;
                                        String string4 = context.getString(kyh0.mt_transfer_stop_text);
                                        MtTransportType mtTransportType = zi40Var.h;
                                        hj40 hj40Var5 = zi40Var.f;
                                        int i13 = zi40Var.k;
                                        if (f5q0Var3 != null) {
                                            i3 = i13;
                                            str5 = str3;
                                            string4 = ((avj0) zuj0Var3).i(kyh0.mt_text_separator, string4, f5q0Var3.b);
                                        } else {
                                            i3 = i13;
                                            str5 = str3;
                                        }
                                        if (f5q0Var3 == null || (str6 = f5q0Var3.a) == null || str6.length() == 0) {
                                            zuj0Var2 = zuj0Var3;
                                            string = context.getString(kyh0.mt_transfer_stop_text);
                                        } else {
                                            zuj0Var2 = zuj0Var3;
                                            string = ((avj0) zuj0Var2).i(kyh0.mt_route_details_v2_walking_to_line, str6);
                                        }
                                        String str24 = f5q0Var3 != null ? f5q0Var3.b : null;
                                        if (str24 == null) {
                                            str24 = "";
                                        }
                                        vs01 vs01Var = new vs01(string4, str24, string, String.valueOf(i3));
                                        if (hz30Var5 instanceof lj40) {
                                            d = null;
                                        } else {
                                            l911 l911Var2 = hj40Var5.e;
                                            d = bt11.d(context, l911Var2 != null ? l911Var2.b : null);
                                        }
                                        String str25 = hj40Var5.a;
                                        SpannableStringBuilder d3 = aVar5.d(zi40Var.b, zi40Var.c, zi40Var.d);
                                        m1j[] m1jVarArr = {vs01Var, new jt01(aVar5.p(zi40Var.e, mtTransportType), str25, d3, zi40Var.g, d, kotlin.collections.a.X(j73.A(new CharSequence[]{g8e.p(((avj0) zuj0Var2).h(aqb1.a(mtTransportType)), " ", str25), d3, d, zi40Var.g}), Extension.FIX_SPACE, null, null, null, 62), String.valueOf(i3))};
                                        String str26 = str5;
                                        it2 = it7;
                                        z5 = z10;
                                        str11 = str26;
                                        obj2 = j73.A(m1jVarArr);
                                    } else {
                                        zuj0Var2 = zuj0Var3;
                                        if (hz30Var instanceof jm30) {
                                            Serializable e = aVar5.e((jm30) hz30Var, l(hz30Var2), l(hz30Var3), rw30Var2.b, contains, oov0Var3, aVar3, z10, mtDetailRouteUiStateMapper$mapRouteItems$13);
                                            aVar5 = this;
                                            obj2 = e;
                                            oov0Var3 = oov0Var3;
                                            z5 = z10;
                                            rw30Var3 = rw30Var2;
                                            i7 = i8;
                                            set4 = set2;
                                            coroutineSingletons3 = coroutineSingletons;
                                            str11 = str3;
                                            it2 = it7;
                                        } else if (hz30Var instanceof r440) {
                                            str11 = str3;
                                            aVar5 = this;
                                            obj2 = h((r440) hz30Var, l(hz30Var2), l(hz30Var3), contains, oov0Var3, aVar3, z8, rw30Var2.b, z10, mtDetailRouteUiStateMapper$mapRouteItems$13);
                                            aVar3 = aVar3;
                                            oov0Var3 = oov0Var3;
                                            z5 = z10;
                                            mtDetailRouteUiStateMapper$mapRouteItems$13 = mtDetailRouteUiStateMapper$mapRouteItems$13;
                                            it2 = it7;
                                        } else {
                                            str11 = str3;
                                            aVar5 = this;
                                            if (hz30Var instanceof lj40) {
                                                lj40 lj40Var = (lj40) hz30Var;
                                                k911 l5 = l(hz30Var2);
                                                k911 l6 = l(hz30Var3);
                                                Map map = rw30Var2.b;
                                                aVar3 = aVar3;
                                                oov0Var3 = oov0Var3;
                                                kdc kdcVar3 = lj40Var.h;
                                                z5 = z10;
                                                Set set5 = lj40Var.a;
                                                mtDetailRouteUiStateMapper$mapRouteItems$13 = mtDetailRouteUiStateMapper$mapRouteItems$13;
                                                String str27 = lj40Var.c;
                                                it2 = it7;
                                                List list7 = lj40Var.f;
                                                i7 = i8;
                                                MtTransportType mtTransportType2 = lj40Var.g;
                                                set4 = set2;
                                                int i14 = lj40Var.o;
                                                i911 i911Var = new i911(kdcVar3);
                                                List list8 = lj40Var.l;
                                                rw30 rw30Var6 = rw30Var2;
                                                hj40 hj40Var6 = (hj40) kotlin.collections.a.R(list8);
                                                String str28 = hj40Var6 != null ? hj40Var6.a : null;
                                                if (str28 == null) {
                                                    str28 = "";
                                                }
                                                avj0 avj0Var2 = (avj0) zuj0Var2;
                                                String q2 = oyr.q(avj0Var2.h(aqb1.a(mtTransportType2)), " ", str28, str11, lj40Var.i);
                                                Map map2 = (Map) map.get(s6b1.c(lj40Var));
                                                wy30 wy30Var = map2 != null ? (wy30) map2.get(lj40Var.e) : null;
                                                String q3 = aVar5.q(wy30Var);
                                                List n = z5 ? aVar5.n(list7, i911Var, String.valueOf(i14)) : list5;
                                                MtTransportType mtTransportType3 = lj40Var.g;
                                                String str29 = lj40Var.d;
                                                ib11 ib11Var = new ib11(mtTransportType3, str29, lj40Var.h, new bdc(xng0.everFront), str29, q3, str27 == null ? "" : str27, true, wy30Var != null && ((wy30Var instanceof ty30) || (wy30Var instanceof sy30)), lj40Var.e, c(wy30Var), n);
                                                if (jl40.l(kotlin.collections.a.R(list8), kotlin.collections.a.b0(list8))) {
                                                    hj40Var = (hj40) kotlin.collections.a.S(1, list8);
                                                } else {
                                                    hj40Var = (hj40) kotlin.collections.a.b0(list8);
                                                    if (hj40Var == null) {
                                                        hj40Var = (hj40) kotlin.collections.a.S(1, list8);
                                                    }
                                                }
                                                String i15 = hj40Var != null ? avj0Var2.i(kyh0.mt_ground_direction, hj40Var.a) : null;
                                                zj5 zj5Var = new zj5(aVar5.p(lj40Var.b, mtTransportType2), str28, lj40Var.i, l5, q2, ib11Var, i15 == null ? "" : i15, i911Var, String.valueOf(i14));
                                                hj40 hj40Var7 = (hj40) kotlin.collections.a.b0(list8);
                                                String str30 = (hj40Var7 == null || (l911Var = hj40Var7.e) == null) ? null : l911Var.b;
                                                if (hz30Var5 instanceof lj40) {
                                                    str30 = null;
                                                }
                                                SpannableStringBuilder d4 = str30 != null ? bt11.d(context, str30) : null;
                                                hj40 hj40Var8 = (hj40) kotlin.collections.a.b0(list8);
                                                String str31 = hj40Var8 != null ? hj40Var8.a : null;
                                                if (str31 == null) {
                                                    str31 = "";
                                                }
                                                i0o i0oVar2 = new i0o(str31, d4, lj40Var.k, l6, kotlin.collections.a.X(j73.A(new CharSequence[]{g8e.p(avj0Var2.h(aqb1.a(mtTransportType2)), " ", str31), (d4 == null || evu0.J(d4)) ? null : d4, lj40Var.k}), Extension.FIX_SPACE, null, null, null, 62), str30, i911Var, String.valueOf(i14));
                                                List g2 = aVar5.g(lj40Var, i911Var, contains);
                                                if (set5 == null) {
                                                    list = g2;
                                                    kdcVar = kdcVar3;
                                                    yx11Var = null;
                                                } else {
                                                    kdcVar = kdcVar3;
                                                    SpannableStringBuilder d5 = aVar5.d(kdcVar, lj40Var.d, str27);
                                                    if (jl40.l(kotlin.collections.a.R(list8), kotlin.collections.a.b0(list8))) {
                                                        hj40Var2 = (hj40) kotlin.collections.a.S(1, list8);
                                                    } else {
                                                        hj40Var2 = (hj40) kotlin.collections.a.b0(list8);
                                                        if (hj40Var2 == null) {
                                                            hj40Var2 = (hj40) kotlin.collections.a.S(1, list8);
                                                        }
                                                    }
                                                    if (hj40Var2 != null) {
                                                        str4 = hj40Var2.a;
                                                        String i16 = avj0Var2.i(kyh0.mt_ground_direction, str4);
                                                        int H = evu0.H(i16, str4, 0, false, 6);
                                                        int[] iArr = up11.a;
                                                        list = g2;
                                                        StyledTypefaceSpan styledTypefaceSpan = new StyledTypefaceSpan(eja1.w(3, 0), 0, 2, null);
                                                        if (H != -1) {
                                                            ?? spannableStringBuilder2 = new SpannableStringBuilder(i16);
                                                            spannableStringBuilder2.setSpan(styledTypefaceSpan, H, str4.length() + H, 33);
                                                            str4 = spannableStringBuilder2;
                                                        }
                                                    } else {
                                                        list = g2;
                                                    }
                                                    str4 = "";
                                                    yx11Var = new yx11(d5, str4, ((Object) d5) + str11 + ((Object) str4), new i911(kdcVar), String.valueOf(i14));
                                                }
                                                List h = scc.h(yx11Var);
                                                if (!z5) {
                                                    list5 = aVar5.j(list7, l5, i911Var);
                                                }
                                                if (set5 == null) {
                                                    ux11Var = null;
                                                } else {
                                                    String str32 = (String) aVar5.i.a.get(set5);
                                                    ux11Var = new ux11(set5, str32 == null ? "" : str32, new i911(kdcVar), String.valueOf(i14));
                                                }
                                                obj2 = kotlin.collections.a.o0(kotlin.collections.a.m0(list, kotlin.collections.a.m0(scc.h(ux11Var), kotlin.collections.a.m0(list5, kotlin.collections.a.m0(h, Collections.singletonList(zj5Var))))), i0oVar2);
                                                coroutineSingletons3 = coroutineSingletons;
                                                rw30Var3 = rw30Var6;
                                            } else {
                                                aVar3 = aVar3;
                                                oov0Var3 = oov0Var3;
                                                z5 = z10;
                                                mtDetailRouteUiStateMapper$mapRouteItems$13 = mtDetailRouteUiStateMapper$mapRouteItems$13;
                                                it2 = it7;
                                                rw30 rw30Var7 = rw30Var2;
                                                i7 = i8;
                                                set4 = set2;
                                                if (!(hz30Var instanceof nk31)) {
                                                    w511.b();
                                                    return null;
                                                }
                                                nk31 nk31Var = (nk31) hz30Var;
                                                k911 l7 = l(hz30Var2);
                                                k911 l8 = l(hz30Var3);
                                                rw30Var3 = rw30Var7;
                                                String str33 = rw30Var3.g;
                                                CharSequence e2 = fh4.e(context, String.valueOf(nk31Var.c));
                                                obj2 = Collections.singletonList(new xpw(e2, nk31Var.a, nk31Var.b, cvu0.v(cvu0.v(cvu0.v(str33, "$INDEX$", String.valueOf(e2), false), "$TEXT$", nk31Var.a, false), "$TIME$", nk31Var.b, false), l7, l8, String.valueOf(nk31Var.e)));
                                                coroutineSingletons3 = coroutineSingletons;
                                            }
                                        }
                                        if (obj2 == coroutineSingletons3) {
                                        }
                                    }
                                    rw30Var3 = rw30Var2;
                                    i7 = i8;
                                    set4 = set2;
                                    coroutineSingletons3 = coroutineSingletons;
                                    if (obj2 == coroutineSingletons3) {
                                    }
                                }
                                it2 = it7;
                                obj2 = singletonList;
                                zuj0Var2 = zuj0Var3;
                                rw30Var3 = rw30Var2;
                                i7 = i8;
                                z5 = z10;
                                set4 = set2;
                                coroutineSingletons3 = coroutineSingletons;
                            }
                            str11 = str3;
                            if (obj2 == coroutineSingletons3) {
                            }
                        }
                        arrayList3.add((List) obj2);
                        coroutineSingletons = coroutineSingletons3;
                        arrayList = arrayList4;
                        hj5Var = hj5Var4;
                        aVar2 = aVar6;
                        z4 = z9;
                        su30Var = su30Var5;
                        str = str11;
                        rw30Var2 = rw30Var5;
                        zuj0Var = zuj0Var2;
                        i2 = i7;
                        set2 = set4;
                        mtDetailRouteUiStateMapper$mapRouteItems$12 = mtDetailRouteUiStateMapper$mapRouteItems$13;
                        z3 = z8;
                        th = null;
                        if (it.hasNext()) {
                            return kotlin.collections.a.m0(Collections.singletonList(jarVar), kotlin.collections.a.m0(tcc.o(arrayList), Collections.singletonList(hj5Var)));
                        }
                    }
                }
            }
        }
        mtDetailRouteUiStateMapper$mapRouteItems$1 = new MtDetailRouteUiStateMapper$mapRouteItems$1(this, continuationImpl);
        Object obj22 = mtDetailRouteUiStateMapper$mapRouteItems$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailRouteUiStateMapper$mapRouteItems$1.label;
        zuj0 zuj0Var4 = this.b;
        String str112 = Extension.FIX_SPACE;
        if (i != 0) {
        }
    }

    public final List g(fj40 fj40Var, k911 k911Var, boolean z) {
        int size = fj40Var.e().size() - 2;
        Integer valueOf = Integer.valueOf(size);
        liu0 liu0Var = null;
        if (size <= 0) {
            valueOf = null;
        }
        zuj0 zuj0Var = this.b;
        Context context = this.a;
        if (valueOf != null) {
            String T = tje.T(context, dwh0.mass_transit_route_stops, valueOf.intValue(), valueOf);
            int i = z ? e0h0.ic_chevron_up : e0h0.ic_chevron_down;
            int i2 = z ? kyh0.mt_route_details_collapse_stops_description : kyh0.mt_route_details_expand_stops_description;
            String string = fj40Var.getDuration() > 0.0d ? context.getString(kyh0.mt_text_separator, Arrays.copyOf(new Object[]{T, t7s.g(zuj0Var, ((long) fj40Var.getDuration()) * 1000)}, 2)) : T;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) string);
            Drawable t = vng.t(i, context);
            if (t != null) {
                spannableStringBuilder.append(" ", new CustomImageSpan(t, 2, false, false, null, 28, null), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) T);
            Drawable t2 = vng.t(i, context);
            if (t2 != null) {
                spannableStringBuilder2.append(" ", new CustomImageSpan(t2, 2, false, false, null, 28, null), 33);
            }
            liu0Var = new liu0(spannableStringBuilder, spannableStringBuilder2, fj40Var.getDuration() > 0.0d ? t7s.g(zuj0Var, ((long) fj40Var.getDuration()) * 1000) : "", fj40Var.b(), string, ((avj0) zuj0Var).h(i2), false, k911Var, String.valueOf(fj40Var.b()));
        } else {
            double duration = fj40Var.getDuration();
            Double valueOf2 = Double.valueOf(duration);
            if (duration <= 0.0d) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                String g = t7s.g(zuj0Var, ((long) fj40Var.getDuration()) * 1000);
                String h = ((avj0) zuj0Var).h(kyh0.mt_route_details_v2_no_intermediate_stops);
                liu0Var = new liu0(g, h, g, fj40Var.b(), context.getString(kyh0.mt_text_separator, Arrays.copyOf(new Object[]{g, h}, 2)), null, true, k911Var, String.valueOf(fj40Var.b()));
            }
        }
        List list = EmptyList.a;
        if (liu0Var == null) {
            return list;
        }
        List singletonList = Collections.singletonList(liu0Var);
        if (z) {
            List e = fj40Var.e();
            if (e.size() > 1) {
                list = e.subList(1, e.size() - 1);
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new m911(((hj40) it.next()).a, k911Var, String.valueOf(fj40Var.b())));
            }
            list = arrayList;
        }
        return kotlin.collections.a.m0(list, singletonList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(r440 r440Var, k911 k911Var, k911 k911Var2, boolean z, oov0 oov0Var, ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar, boolean z2, Map map, boolean z3, ContinuationImpl continuationImpl) {
        MtDetailRouteUiStateMapper$mapSuburbanItems$1 mtDetailRouteUiStateMapper$mapSuburbanItems$1;
        int i;
        Context context;
        kdc kdcVar;
        obm obmVar;
        String h;
        w211 w211Var;
        List list;
        h911 h911Var;
        CharSequence charSequence;
        CharSequence j;
        sn4 sn4Var;
        i0o b;
        CoroutineSingletons coroutineSingletons;
        boolean z4;
        boolean z5;
        h911 h911Var2;
        r440 r440Var2;
        pj5 pj5Var;
        b3v0 b3v0Var;
        sn4 sn4Var2;
        k911 k911Var3;
        kd01 kd01Var;
        h911 h911Var3;
        b3v0 b3v0Var2;
        sn4 sn4Var3;
        i0o i0oVar;
        Drawable mutate;
        TransportContour.Style style;
        Integer mainColor;
        a aVar2 = this;
        if (continuationImpl instanceof MtDetailRouteUiStateMapper$mapSuburbanItems$1) {
            mtDetailRouteUiStateMapper$mapSuburbanItems$1 = (MtDetailRouteUiStateMapper$mapSuburbanItems$1) continuationImpl;
            int i2 = mtDetailRouteUiStateMapper$mapSuburbanItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDetailRouteUiStateMapper$mapSuburbanItems$1.label = i2 - Integer.MIN_VALUE;
                MtDetailRouteUiStateMapper$mapSuburbanItems$1 mtDetailRouteUiStateMapper$mapSuburbanItems$12 = mtDetailRouteUiStateMapper$mapSuburbanItems$1;
                Object obj = mtDetailRouteUiStateMapper$mapSuburbanItems$12.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailRouteUiStateMapper$mapSuburbanItems$12.label;
                List list2 = EmptyList.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b3v0 f = r440Var.f();
                    String str = r440Var.e;
                    kdc kdcVar2 = r440Var.d;
                    boolean z6 = r440Var.b;
                    int i3 = r440Var.k;
                    h911 h911Var4 = new h911(kdcVar2);
                    TransportContour transportContour = f.g;
                    w211 w211Var2 = f.d;
                    MtTransportType mtTransportType = f.b;
                    cdc f2 = (transportContour == null || (style = transportContour.getStyle()) == null || (mainColor = style.getMainColor()) == null) ? null : s6b1.f(mainColor.intValue());
                    int d = xob1.d(mtTransportType);
                    avj0 avj0Var = (avj0) aVar2.b;
                    kdc kdcVar3 = f2;
                    Drawable t = vng.t(d, avj0Var.a);
                    Context context2 = aVar2.a;
                    if (t == null || (mutate = t.mutate()) == null) {
                        context = context2;
                        kdcVar = kdcVar2;
                        obmVar = null;
                    } else {
                        if (kdcVar3 == null) {
                            kdcVar3 = xob1.a(mtTransportType);
                        }
                        kdcVar = kdcVar2;
                        mutate.setTint(s8o.m(kdcVar3, context2));
                        context = context2;
                        obmVar = new obm(mtTransportType.getMapkitType(), mutate);
                    }
                    hj40 hj40Var = (hj40) kotlin.collections.a.R(r440Var.h);
                    String str2 = hj40Var != null ? hj40Var.a : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (z6) {
                        h = avj0Var.h(kyh0.mt_routes_aeroexpress);
                    } else {
                        TransportContour transportContour2 = f.g;
                        if (transportContour2 == null || (h = transportContour2.getName()) == null) {
                            h = avj0Var.h(kyh0.mt_routes_suburban);
                        }
                    }
                    String str3 = h;
                    obm obmVar2 = obmVar;
                    Map map2 = (Map) map.get(s6b1.c(r440Var));
                    wy30 wy30Var = map2 != null ? (wy30) map2.get(w211Var2) : null;
                    String q = aVar2.q(wy30Var);
                    String str4 = q.length() == 0 ? str : q;
                    if (z3) {
                        w211Var = w211Var2;
                        list = aVar2.n(f.f, h911Var4, String.valueOf(i3));
                    } else {
                        w211Var = w211Var2;
                        list = list2;
                    }
                    kdc kdcVar4 = kdcVar;
                    String str5 = str2;
                    Context context3 = context;
                    pj5 pj5Var2 = new pj5(obmVar2, str5, r440Var.e, k911Var, oyr.t(oyr.w(avj0Var.h(aqb1.a(mtTransportType)), " ", str2, Extension.FIX_SPACE, f.a), Extension.FIX_SPACE, str), new ib11(f.b, str3, r440Var.d, new bdc(xng0.everFront), str3, str4, null, !z6, wy30Var != null && ((wy30Var instanceof ty30) || (wy30Var instanceof sy30)), w211Var, c(wy30Var), list, 64), f.a, h911Var4, String.valueOf(i3));
                    h911 h911Var5 = new h911(kdcVar4);
                    if (z6) {
                        h911Var = h911Var5;
                        j = fh4.j(context3, context3.getString(kyh0.mt_routes_aeroexpress), kdcVar4, new bdc(xng0.everFront), tje.w(120, context3));
                    } else {
                        h911Var = h911Var5;
                        CharSequence b2 = s6b1.b(r440Var, context3);
                        if (b2 != null) {
                            charSequence = b2;
                            sn4Var = new sn4(charSequence, r440Var.f().a, h911Var, h911Var, String.valueOf(i3));
                            b = b(r440Var, h911Var4, k911Var2, avj0Var.h(aqb1.a(mtTransportType)));
                            f fVar = aVar2.h;
                            if (oov0Var == null && f.e) {
                                String valueOf = String.valueOf(i3);
                                boolean a = aVar.a();
                                fVar.getClass();
                                fe01 a2 = f.a(r440Var);
                                VehicleType vehicleType = VehicleType.Aeroexpress;
                                MtTransportType mtTransportType2 = f.b;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$0 = r440Var;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$1 = k911Var;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$2 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$3 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$4 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$5 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$6 = f;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$7 = h911Var4;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$8 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$9 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$10 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$11 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$12 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$13 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$14 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$15 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$16 = pj5Var2;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$17 = sn4Var;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$18 = b;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.Z$0 = z;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.Z$1 = z2;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.Z$2 = z3;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.label = 1;
                                coroutineSingletons = coroutineSingletons2;
                                obj = i(valueOf, oov0Var, a, a2, h911Var4, vehicleType, mtTransportType2, mtDetailRouteUiStateMapper$mapSuburbanItems$12);
                                h911Var3 = h911Var4;
                                if (obj != coroutineSingletons) {
                                    z4 = z;
                                    z5 = z3;
                                    r440Var2 = r440Var;
                                    pj5Var = pj5Var2;
                                    b3v0Var2 = f;
                                    sn4Var3 = sn4Var;
                                    i0oVar = b;
                                    k911Var3 = k911Var;
                                    kd01Var = (kd01) obj;
                                    aVar2 = this;
                                }
                            } else {
                                coroutineSingletons = coroutineSingletons2;
                                if (oov0Var != null || !z2) {
                                    aVar2 = this;
                                    z4 = z;
                                    z5 = z3;
                                    h911Var2 = h911Var4;
                                    r440Var2 = r440Var;
                                    pj5Var = pj5Var2;
                                    b3v0Var = f;
                                    sn4Var2 = sn4Var;
                                    k911Var3 = k911Var;
                                    kd01Var = null;
                                    if (!z5) {
                                        list2 = aVar2.j(b3v0Var.f, k911Var3, h911Var2);
                                    }
                                    return kotlin.collections.a.m0(Collections.singletonList(b), kotlin.collections.a.m0(aVar2.g(r440Var2, h911Var2, z4), kotlin.collections.a.m0(scc.h(kd01Var), kotlin.collections.a.m0(list2, kotlin.collections.a.m0(scc.h(sn4Var2), scc.h(pj5Var))))));
                                }
                                String valueOf2 = String.valueOf(i3);
                                boolean b3 = aVar.b();
                                fVar.getClass();
                                fe01 a3 = f.a(r440Var);
                                VehicleType vehicleType2 = VehicleType.Suburban;
                                MtTransportType mtTransportType3 = f.b;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$0 = r440Var;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$1 = k911Var;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$2 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$3 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$4 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$5 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$6 = f;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$7 = h911Var4;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$8 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$9 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$10 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$11 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$12 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$13 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$14 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$15 = null;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$16 = pj5Var2;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$17 = sn4Var;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$18 = b;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.Z$0 = z;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.Z$1 = z2;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.Z$2 = z3;
                                mtDetailRouteUiStateMapper$mapSuburbanItems$12.label = 2;
                                aVar2 = this;
                                obj = aVar2.i(valueOf2, oov0Var, b3, a3, h911Var4, vehicleType2, mtTransportType3, mtDetailRouteUiStateMapper$mapSuburbanItems$12);
                                h911Var3 = h911Var4;
                                if (obj != coroutineSingletons) {
                                    z4 = z;
                                    z5 = z3;
                                    r440Var2 = r440Var;
                                    pj5Var = pj5Var2;
                                    b3v0Var2 = f;
                                    sn4Var3 = sn4Var;
                                    i0oVar = b;
                                    k911Var3 = k911Var;
                                    kd01Var = (kd01) obj;
                                }
                            }
                            return coroutineSingletons;
                        }
                        j = fh4.j(context3, context3.getString(kyh0.mt_routes_suburban), kdcVar4, new bdc(xng0.everFront), tje.w(120, context3));
                    }
                    charSequence = j;
                    sn4Var = new sn4(charSequence, r440Var.f().a, h911Var, h911Var, String.valueOf(i3));
                    b = b(r440Var, h911Var4, k911Var2, avj0Var.h(aqb1.a(mtTransportType)));
                    f fVar2 = aVar2.h;
                    if (oov0Var == null) {
                    }
                    coroutineSingletons = coroutineSingletons2;
                    if (oov0Var != null) {
                    }
                    aVar2 = this;
                    z4 = z;
                    z5 = z3;
                    h911Var2 = h911Var4;
                    r440Var2 = r440Var;
                    pj5Var = pj5Var2;
                    b3v0Var = f;
                    sn4Var2 = sn4Var;
                    k911Var3 = k911Var;
                    kd01Var = null;
                    if (!z5) {
                    }
                    return kotlin.collections.a.m0(Collections.singletonList(b), kotlin.collections.a.m0(aVar2.g(r440Var2, h911Var2, z4), kotlin.collections.a.m0(scc.h(kd01Var), kotlin.collections.a.m0(list2, kotlin.collections.a.m0(scc.h(sn4Var2), scc.h(pj5Var))))));
                }
                if (i == 1) {
                    z5 = mtDetailRouteUiStateMapper$mapSuburbanItems$12.Z$2;
                    z4 = mtDetailRouteUiStateMapper$mapSuburbanItems$12.Z$0;
                    i0oVar = (i0o) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$18;
                    sn4Var3 = (sn4) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$17;
                    pj5Var = (pj5) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$16;
                    h911Var3 = (h911) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$7;
                    b3v0Var2 = (b3v0) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$6;
                    k911Var3 = (k911) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$1;
                    r440Var2 = (r440) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$0;
                    kotlin.b.b(obj);
                    kd01Var = (kd01) obj;
                    aVar2 = this;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z5 = mtDetailRouteUiStateMapper$mapSuburbanItems$12.Z$2;
                    z4 = mtDetailRouteUiStateMapper$mapSuburbanItems$12.Z$0;
                    i0oVar = (i0o) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$18;
                    sn4Var3 = (sn4) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$17;
                    pj5Var = (pj5) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$16;
                    h911Var3 = (h911) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$7;
                    b3v0Var2 = (b3v0) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$6;
                    k911Var3 = (k911) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$1;
                    r440Var2 = (r440) mtDetailRouteUiStateMapper$mapSuburbanItems$12.L$0;
                    kotlin.b.b(obj);
                    kd01Var = (kd01) obj;
                }
                b = i0oVar;
                sn4Var2 = sn4Var3;
                h911Var2 = h911Var3;
                b3v0Var = b3v0Var2;
                if (!z5) {
                }
                return kotlin.collections.a.m0(Collections.singletonList(b), kotlin.collections.a.m0(aVar2.g(r440Var2, h911Var2, z4), kotlin.collections.a.m0(scc.h(kd01Var), kotlin.collections.a.m0(list2, kotlin.collections.a.m0(scc.h(sn4Var2), scc.h(pj5Var))))));
            }
        }
        mtDetailRouteUiStateMapper$mapSuburbanItems$1 = new MtDetailRouteUiStateMapper$mapSuburbanItems$1(aVar2, continuationImpl);
        MtDetailRouteUiStateMapper$mapSuburbanItems$1 mtDetailRouteUiStateMapper$mapSuburbanItems$122 = mtDetailRouteUiStateMapper$mapSuburbanItems$1;
        Object obj2 = mtDetailRouteUiStateMapper$mapSuburbanItems$122.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailRouteUiStateMapper$mapSuburbanItems$122.label;
        List list22 = EmptyList.a;
        if (i != 0) {
        }
        b = i0oVar;
        sn4Var2 = sn4Var3;
        h911Var2 = h911Var3;
        b3v0Var = b3v0Var2;
        if (!z5) {
        }
        return kotlin.collections.a.m0(Collections.singletonList(b), kotlin.collections.a.m0(aVar2.g(r440Var2, h911Var2, z4), kotlin.collections.a.m0(scc.h(kd01Var), kotlin.collections.a.m0(list22, kotlin.collections.a.m0(scc.h(sn4Var2), scc.h(pj5Var))))));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, oov0 oov0Var, boolean z, fe01 fe01Var, h911 h911Var, VehicleType vehicleType, MtTransportType mtTransportType, ContinuationImpl continuationImpl) {
        MtDetailRouteUiStateMapper$mapTrainButtonsButtons$1 mtDetailRouteUiStateMapper$mapTrainButtonsButtons$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        h911 h911Var2;
        String str2;
        oov0 oov0Var2;
        boolean z2;
        MtTransportType mtTransportType2;
        Object obj;
        VehicleType vehicleType2;
        Object c;
        h911 h911Var3;
        ee01 ee01Var;
        if (continuationImpl instanceof MtDetailRouteUiStateMapper$mapTrainButtonsButtons$1) {
            mtDetailRouteUiStateMapper$mapTrainButtonsButtons$1 = (MtDetailRouteUiStateMapper$mapTrainButtonsButtons$1) continuationImpl;
            int i2 = mtDetailRouteUiStateMapper$mapTrainButtonsButtons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDetailRouteUiStateMapper$mapTrainButtonsButtons$1.label = i2 - Integer.MIN_VALUE;
                MtDetailRouteUiStateMapper$mapTrainButtonsButtons$1 mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12 = mtDetailRouteUiStateMapper$mapTrainButtonsButtons$1;
                Object obj2 = mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$0 = str;
                    mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$1 = oov0Var;
                    mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$2 = null;
                    h911Var2 = h911Var;
                    mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$3 = h911Var2;
                    mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$4 = vehicleType;
                    mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$5 = mtTransportType;
                    mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.Z$0 = z;
                    mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.label = 1;
                    Object b = this.h.b(oov0Var, fe01Var, vehicleType, mtTransportType, mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12);
                    if (b != coroutineSingletons) {
                        str2 = str;
                        oov0Var2 = oov0Var;
                        z2 = z;
                        mtTransportType2 = mtTransportType;
                        obj = b;
                        vehicleType2 = vehicleType;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee01 ee01Var2 = (ee01) mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$6;
                    h911Var3 = (h911) mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$3;
                    String str3 = (String) mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$0;
                    kotlin.b.b(obj2);
                    str2 = str3;
                    ee01Var = ee01Var2;
                    return new kd01(ee01Var, (ge01) obj2, h911Var3, h911Var3, str2);
                }
                boolean z3 = mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.Z$0;
                MtTransportType mtTransportType3 = (MtTransportType) mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$5;
                vehicleType2 = (VehicleType) mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$4;
                h911 h911Var4 = (h911) mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$3;
                oov0 oov0Var3 = (oov0) mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$1;
                str2 = (String) mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$0;
                kotlin.b.b(obj2);
                z2 = z3;
                oov0Var2 = oov0Var3;
                obj = obj2;
                h911Var2 = h911Var4;
                mtTransportType2 = mtTransportType3;
                ee01 ee01Var3 = (ee01) obj;
                mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$0 = str2;
                mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$1 = null;
                mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$2 = null;
                mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$3 = h911Var2;
                mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$4 = null;
                mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$5 = null;
                mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.L$6 = ee01Var3;
                mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.Z$0 = z2;
                mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12.label = 2;
                c = this.h.c(oov0Var2, z2, vehicleType2, mtTransportType2, mtDetailRouteUiStateMapper$mapTrainButtonsButtons$12);
                if (c != coroutineSingletons) {
                    h911Var3 = h911Var2;
                    ee01Var = ee01Var3;
                    obj2 = c;
                    return new kd01(ee01Var, (ge01) obj2, h911Var3, h911Var3, str2);
                }
                return coroutineSingletons;
            }
        }
        mtDetailRouteUiStateMapper$mapTrainButtonsButtons$1 = new MtDetailRouteUiStateMapper$mapTrainButtonsButtons$1(this, continuationImpl);
        MtDetailRouteUiStateMapper$mapTrainButtonsButtons$1 mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122 = mtDetailRouteUiStateMapper$mapTrainButtonsButtons$1;
        Object obj22 = mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122.label;
        if (i != 0) {
        }
        ee01 ee01Var32 = (ee01) obj;
        mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122.L$0 = str2;
        mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122.L$1 = null;
        mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122.L$2 = null;
        mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122.L$3 = h911Var2;
        mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122.L$4 = null;
        mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122.L$5 = null;
        mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122.L$6 = ee01Var32;
        mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122.Z$0 = z2;
        mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122.label = 2;
        c = this.h.c(oov0Var2, z2, vehicleType2, mtTransportType2, mtDetailRouteUiStateMapper$mapTrainButtonsButtons$122);
        if (c != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final ArrayList j(List list, k911 k911Var, k911 k911Var2) {
        Drawable t = vng.t(q2h0.ic_alert, ((avj0) this.b).a);
        obm obmVar = t != null ? new obm("alert", t) : null;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String m = m((rc30) it.next());
            arrayList.add(new jr1(obmVar, m, k911Var, k911Var2, m));
        }
        return arrayList;
    }

    public final obm k(tbo tboVar, obm obmVar) {
        Drawable c;
        EssentialPoint$Type essentialPoint$Type = tboVar.c;
        if (obmVar != null) {
            return obmVar;
        }
        int i = ef30.a[essentialPoint$Type.ordinal()];
        if (i == 1) {
            c = this.d.c(null);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            c = this.e.c(null);
        }
        if (c == null) {
            return null;
        }
        return new obm(essentialPoint$Type.getId() + "-" + this.c.getThemeType(), c);
    }

    public final String m(rc30 rc30Var) {
        boolean l = jl40.l(rc30Var, oc30.a);
        zuj0 zuj0Var = this.b;
        if (l) {
            return ((avj0) zuj0Var).h(kyh0.mt_closed_alert);
        }
        if (rc30Var instanceof pc30) {
            return ((avj0) zuj0Var).i(kyh0.mt_closed_until_alert, ((pc30) rc30Var).a);
        }
        if (rc30Var instanceof qc30) {
            return ((avj0) zuj0Var).i(kyh0.mt_last_trip_alert, ((qc30) rc30Var).a);
        }
        w511.b();
        return null;
    }

    public final List n(List list, k911 k911Var, String str) {
        if (list.isEmpty()) {
            return EmptyList.a;
        }
        Drawable t = vng.t(q2h0.ic_alert, ((avj0) this.b).a);
        obm obmVar = t != null ? new obm("alert", t) : null;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            String m = m((rc30) obj);
            arrayList.add(new d611(m, obmVar, new ib11(MtTransportType.UNKNOWN, m, new bdc(xng0.error), new bdc(xng0.everFront), "", "", null, false, false, null, null, null, 3648), k911Var, qv10.h(i, str, "_line_alert_")));
            i = i2;
        }
        return arrayList;
    }

    public final ib11 o(w1u w1uVar, bdc bdcVar, kdc kdcVar, String str, boolean z, boolean z2, String str2, h911 h911Var, String str3, boolean z3) {
        List list;
        String str4;
        if (z3) {
            ArrayList arrayList = w1uVar.g;
            w211 w211Var = w1uVar.f;
            list = n(arrayList, h911Var, oyr.q(str3, "_", w211Var.a, "_", w211Var.b));
        } else {
            list = EmptyList.a;
        }
        List list2 = list;
        boolean z4 = w1uVar.b;
        w211 w211Var2 = w1uVar.f;
        String str5 = w1uVar.a;
        dj40 dj40Var = w1uVar.d;
        zuj0 zuj0Var = this.b;
        if (z4) {
            StringBuilder v = oyr.v(str5, " · ");
            v.append(((avj0) zuj0Var).h(kyh0.mt_routes_bus_express));
            String sb = v.toString();
            return new ib11(dj40Var.b, sb, new gdc(tog0.mt_aeroexpress_color), bdcVar, sb, str, null, false, z2, w211Var2, str2, list2, 192);
        }
        boolean c = aqb1.c(dj40Var.b);
        MtTransportType mtTransportType = dj40Var.b;
        if (!c) {
            String str6 = w1uVar.a;
            return new ib11(mtTransportType, str6, kdcVar, bdcVar, z ? this.g.c(str6, mtTransportType) : "", str, null, false, z2, w211Var2, str2, list2, 192);
        }
        int b = aqb1.b(mtTransportType);
        Integer valueOf = Integer.valueOf(b);
        if (b == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            String h = ((avj0) zuj0Var).h(valueOf.intValue());
            if (h != null) {
                str4 = h;
                return new ib11(dj40Var.b, str4, kdcVar, bdcVar, str4, str, null, true, z2, w211Var2, str2, list2, 64);
            }
        }
        str4 = str5;
        return new ib11(dj40Var.b, str4, kdcVar, bdcVar, str4, str, null, true, z2, w211Var2, str2, list2, 64);
    }

    public final obm p(MtTransportSystemId mtTransportSystemId, MtTransportType mtTransportType) {
        Drawable drawable;
        Drawable mutate;
        Integer c = xob1.c(mtTransportSystemId);
        zuj0 zuj0Var = this.b;
        if (c != null) {
            drawable = vng.t(c.intValue(), ((avj0) zuj0Var).a);
        } else {
            Drawable t = vng.t(xob1.d(mtTransportType), ((avj0) zuj0Var).a);
            if (t == null || (mutate = t.mutate()) == null) {
                drawable = null;
            } else {
                mutate.setTint(s8o.m(new bdc(xng0.textMinor), this.a));
                drawable = mutate;
            }
        }
        if (drawable != null) {
            return new obm(mtTransportSystemId.name(), drawable);
        }
        return null;
    }

    public final String q(wy30 wy30Var) {
        boolean z = wy30Var instanceof ty30;
        kj40 kj40Var = this.g;
        if (z) {
            return kj40Var.b(((ty30) wy30Var).c);
        }
        if (wy30Var instanceof vy30) {
            List list = ((vy30) wy30Var).c;
            kj40Var.getClass();
            return kj40.e(1, list);
        }
        if (wy30Var instanceof sy30) {
            return kj40Var.b(((sy30) wy30Var).c());
        }
        if (!(wy30Var instanceof uy30)) {
            if (wy30Var == null) {
                return "";
            }
            w511.b();
            return null;
        }
        String d = kj40Var.d((uy30) wy30Var);
        String str = d != null ? d : "";
        if (str.length() <= 0) {
            return str;
        }
        return ((Object) String.valueOf(str.charAt(0)).toLowerCase(Locale.ROOT)) + str.substring(1);
    }
}
