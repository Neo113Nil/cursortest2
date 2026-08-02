package com.yandex.passport.sloth.ui.dependencies;

import android.app.Activity;
import android.content.Context;
import android.os.Trace;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.j0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v0;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
import com.yandex.plus.home.repository.api.model.webconfig.v;
import com.yandex.plus.home.repository.api.model.webconfig.z;
import com.yandex.plus.pay.adapter.api.d0;
import com.yandex.plus.pay.adapter.api.g0;
import com.yandex.plus.pay.adapter.api.h0;
import com.yandex.plus.pay.adapter.internal.c1;
import defpackage.a53;
import defpackage.aaa;
import defpackage.ac1;
import defpackage.agv;
import defpackage.anb;
import defpackage.ao1;
import defpackage.arf;
import defpackage.awr;
import defpackage.axr;
import defpackage.b6e;
import defpackage.b8u;
import defpackage.bb5;
import defpackage.bdt;
import defpackage.bnb;
import defpackage.btf;
import defpackage.bxr;
import defpackage.c01;
import defpackage.c5b;
import defpackage.c63;
import defpackage.caa;
import defpackage.cba;
import defpackage.cd2;
import defpackage.cd6;
import defpackage.cg6;
import defpackage.cnb;
import defpackage.cq4;
import defpackage.cr;
import defpackage.cut;
import defpackage.cvl;
import defpackage.cwr;
import defpackage.cyr;
import defpackage.d51;
import defpackage.d63;
import defpackage.daa;
import defpackage.dda;
import defpackage.dm6;
import defpackage.dnb;
import defpackage.drs;
import defpackage.dwr;
import defpackage.e2l;
import defpackage.e5b;
import defpackage.e63;
import defpackage.e6q;
import defpackage.eaa;
import defpackage.eca;
import defpackage.elm;
import defpackage.epk;
import defpackage.eqi;
import defpackage.eun;
import defpackage.ewr;
import defpackage.ezc;
import defpackage.f43;
import defpackage.f63;
import defpackage.f9b;
import defpackage.faa;
import defpackage.fkn;
import defpackage.fun;
import defpackage.fwr;
import defpackage.fyr;
import defpackage.g0q;
import defpackage.g43;
import defpackage.g63;
import defpackage.g68;
import defpackage.g8c;
import defpackage.gag;
import defpackage.ghh;
import defpackage.gld;
import defpackage.go1;
import defpackage.gso;
import defpackage.guu;
import defpackage.gwr;
import defpackage.h43;
import defpackage.h63;
import defpackage.h9b;
import defpackage.hag;
import defpackage.hld;
import defpackage.hrg;
import defpackage.hwr;
import defpackage.i0j;
import defpackage.i1h;
import defpackage.i1m;
import defpackage.i43;
import defpackage.i63;
import defpackage.i6b;
import defpackage.i9b;
import defpackage.iik;
import defpackage.ime;
import defpackage.irk;
import defpackage.it0;
import defpackage.iwr;
import defpackage.j0q;
import defpackage.j1g;
import defpackage.j43;
import defpackage.j63;
import defpackage.j94;
import defpackage.j9b;
import defpackage.jac;
import defpackage.jou;
import defpackage.jwr;
import defpackage.jyr;
import defpackage.k43;
import defpackage.k63;
import defpackage.k8k;
import defpackage.k9b;
import defpackage.kba;
import defpackage.kij;
import defpackage.kjm;
import defpackage.klx;
import defpackage.kok;
import defpackage.kou;
import defpackage.kt6;
import defpackage.l0t;
import defpackage.l18;
import defpackage.l43;
import defpackage.l48;
import defpackage.l5;
import defpackage.l8k;
import defpackage.lah;
import defpackage.lbq;
import defpackage.lg3;
import defpackage.lok;
import defpackage.m43;
import defpackage.m8k;
import defpackage.m9b;
import defpackage.mah;
import defpackage.mj6;
import defpackage.mok;
import defpackage.mqs;
import defpackage.muu;
import defpackage.mvp;
import defpackage.n31;
import defpackage.n43;
import defpackage.n8k;
import defpackage.ngg;
import defpackage.nj6;
import defpackage.nm6;
import defpackage.nok;
import defpackage.nsh;
import defpackage.nvl;
import defpackage.nwr;
import defpackage.o8k;
import defpackage.og;
import defpackage.omb;
import defpackage.ook;
import defpackage.oou;
import defpackage.op5;
import defpackage.oq;
import defpackage.owr;
import defpackage.p73;
import defpackage.pd;
import defpackage.pj6;
import defpackage.pok;
import defpackage.psd;
import defpackage.pv9;
import defpackage.q1g;
import defpackage.q6k;
import defpackage.qdc;
import defpackage.qg;
import defpackage.qgg;
import defpackage.qj6;
import defpackage.qld;
import defpackage.qok;
import defpackage.quj;
import defpackage.qzm;
import defpackage.r4u;
import defpackage.raa;
import defpackage.rj6;
import defpackage.roi;
import defpackage.rok;
import defpackage.rr5;
import defpackage.rrl;
import defpackage.rsh;
import defpackage.ru0;
import defpackage.rus;
import defpackage.ryu;
import defpackage.s1;
import defpackage.sba;
import defpackage.sok;
import defpackage.ssg;
import defpackage.suk;
import defpackage.szj;
import defpackage.t2m;
import defpackage.t75;
import defpackage.taa;
import defpackage.tah;
import defpackage.tba;
import defpackage.tf6;
import defpackage.tkb;
import defpackage.tok;
import defpackage.u2m;
import defpackage.u51;
import defpackage.u75;
import defpackage.uaa;
import defpackage.ub7;
import defpackage.uba;
import defpackage.unk;
import defpackage.upi;
import defpackage.uq;
import defpackage.v75;
import defpackage.vba;
import defpackage.vqn;
import defpackage.wba;
import defpackage.wkb;
import defpackage.wop;
import defpackage.wpi;
import defpackage.x1u;
import defpackage.x97;
import defpackage.xba;
import defpackage.xdr;
import defpackage.xiu;
import defpackage.xka;
import defpackage.xpk;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.y9w;
import defpackage.ydr;
import defpackage.yk;
import defpackage.yka;
import defpackage.yr;
import defpackage.yvr;
import defpackage.z1g;
import defpackage.z66;
import defpackage.z75;
import defpackage.zmb;
import defpackage.zsd;
import defpackage.zvr;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;

/* loaded from: classes4.dex */
public final class m {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public m(cq4 cq4Var, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5, z66 z66Var, xka xkaVar, xba xbaVar, dda ddaVar) {
        Object daaVar;
        this.a = 4;
        jyrVar.getClass();
        jyrVar2.getClass();
        jyrVar3.getClass();
        jyrVar4.getClass();
        jyrVar5.getClass();
        z66Var.getClass();
        xkaVar.getClass();
        xbaVar.getClass();
        this.b = cq4Var;
        this.c = z66Var;
        this.d = xkaVar;
        this.e = xbaVar;
        this.f = ddaVar;
        this.g = jyrVar;
        xdr a = ydr.a(eca.d);
        this.h = a;
        fkn fknVar = ((kij) jyrVar2.getValue()).c;
        xdr xdrVar = ((e6q) ((uaa) jyrVar3.getValue())).e;
        xdr xdrVar2 = ((cba) jyrVar4.getValue()).e;
        xdr xdrVar3 = ((aaa) jyrVar5.getValue()).e;
        n31 n31Var = new n31(4, this);
        fknVar.getClass();
        xdrVar.getClass();
        xdrVar2.getClass();
        xdrVar3.getClass();
        fkn u0 = lg3.u0(zsd.R(a, fknVar, xdrVar, xdrVar2, xdrVar3, new bb5(n31Var, null)), cq4Var, n31Var.invoke(a.getValue(), fknVar.a.getValue(), xdrVar.getValue(), xdrVar2.getValue(), xdrVar3.getValue()));
        this.i = u0;
        ub7 ub7Var = new ub7(4, u0, this);
        wba wbaVar = (wba) u0.a.getValue();
        if (wbaVar instanceof vba) {
            daaVar = new faa(a(this, ((vba) wbaVar).a.size()));
        } else if (Intrinsics.d(wbaVar, sba.a)) {
            daaVar = caa.a;
        } else if (Intrinsics.d(wbaVar, uba.a)) {
            daaVar = eaa.a;
        } else {
            if (!(wbaVar instanceof tba)) {
                b6e.s();
                throw null;
            }
            daaVar = new daa(a(this, ((tba) wbaVar).a.size()));
        }
        this.j = zsd.F0(ub7Var, cq4Var, lbq.a, daaVar);
        this.k = new j0q();
    }

    public static void A(nwr nwrVar, cr crVar, a53 a53Var) {
        gwr gwrVar;
        f9b f9bVar = nwrVar.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) crVar.g;
        h63 h63Var = (h63) a53Var.a;
        if (h63Var == null || (gwrVar = (gwr) a53Var.b) == null) {
            return;
        }
        List list = gwrVar.b;
        List list2 = gwrVar.c;
        List list3 = h63Var.c;
        HashSet hashSet = new HashSet();
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            hashSet.add(((r4u) it.next()).a);
        }
        List list4 = h63Var.d;
        HashSet hashSet2 = new HashSet();
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            hashSet2.add(((r4u) it2.next()).a);
        }
        if (Intrinsics.d(h63Var.a, gwrVar.a.a) && !Intrinsics.d(h63Var.b, Boolean.TRUE)) {
            f9bVar.f.addAll(wop.i(hashSet, hashSet2));
            return;
        }
        if (list == null || list2 == null) {
            return;
        }
        List<fyr> list5 = list;
        HashSet hashSet3 = new HashSet();
        Iterator it3 = list5.iterator();
        while (it3.hasNext()) {
            hashSet3.add(((fyr) it3.next()).a);
        }
        List<fyr> list6 = list2;
        HashSet hashSet4 = new HashSet();
        Iterator it4 = list6.iterator();
        while (it4.hasNext()) {
            hashSet4.add(((fyr) it4.next()).a);
        }
        LinkedHashSet i = wop.i(hashSet3, hashSet4);
        LinkedHashSet i2 = wop.i(hashSet, hashSet2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : i) {
            if (i2.contains((String) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : i2) {
            if (!i.contains((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        f9bVar.f.addAll(arrayList);
        nwrVar.b.f.addAll(arrayList2);
        for (fyr fyrVar : list5) {
            linkedHashMap.put(fyrVar.a, new k9b(new o8k(j1g.a, fyrVar.b)));
        }
        for (fyr fyrVar2 : list6) {
            linkedHashMap.put(fyrVar2.a, new k9b(new o8k(j1g.c, fyrVar2.b)));
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            linkedHashMap.put((String) it5.next(), new k9b(new o8k(j1g.b, null)));
        }
    }

    public static final float a(m mVar, int i) {
        if (i == 0) {
            return 0.0f;
        }
        return 1.0f - (i / ((eca) ((xdr) mVar.h).getValue()).a().size());
    }

    public void B(int i) {
        roi roiVar = (roi) this.j;
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        int i2 = 0;
        ArrayList arrayList2 = null;
        int i3 = 0;
        roi roiVar2 = null;
        roi roiVar3 = null;
        while (i3 < roiVar.b) {
            if (i <= roiVar.c(i3)) {
                Object remove = arrayList.remove(i3);
                int f = roiVar.f(i3);
                int f2 = ((roi) this.i).f(i3);
                if (arrayList2 == null) {
                    arrayList2 = u75.j(remove);
                    roiVar3 = new roi();
                    roiVar3.a(f);
                    roiVar2 = new roi();
                    roiVar2.a(f2);
                } else {
                    roiVar2.getClass();
                    roiVar3.getClass();
                    arrayList2.add(remove);
                    roiVar3.a(f);
                    roiVar2.a(f2);
                }
            } else {
                i3++;
            }
        }
        if (arrayList2 != null) {
            roiVar2.getClass();
            roiVar3.getClass();
            int size = arrayList2.size() - 1;
            while (i2 < size) {
                int i4 = i2 + 1;
                int size2 = arrayList2.size();
                for (int i5 = i4; i5 < size2; i5++) {
                    int c = roiVar3.c(i2);
                    int c2 = roiVar3.c(i5);
                    if (c < c2 || (c2 == c && roiVar2.c(i2) < roiVar2.c(i5))) {
                        Object obj = arrayList2.get(i2);
                        arrayList2.set(i2, arrayList2.get(i5));
                        arrayList2.set(i5, obj);
                        int c3 = roiVar2.c(i2);
                        roiVar2.g(i2, roiVar2.c(i5));
                        roiVar2.g(i5, c3);
                        int c4 = roiVar3.c(i2);
                        roiVar3.g(i2, roiVar3.c(i5));
                        roiVar3.g(i5, c4);
                    }
                }
                i2 = i4;
            }
            eqi eqiVar = (eqi) this.e;
            eqiVar.f(arrayList2, eqiVar.c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
    
        if (i(r13, r8, r11, r12) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.yandex.plus.home.repository.api.model.webconfig.a0, com.yandex.plus.pay.adapter.api.j, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [ezc, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(String str, a0 a0Var, com.yandex.plus.pay.adapter.api.j jVar, cg6 cg6Var) {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.c cVar;
        int i;
        Object obj;
        ?? r10;
        int i2;
        com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.c cVar2;
        String str2;
        Object obj2;
        a0 a0Var2;
        com.yandex.plus.pay.adapter.api.j jVar2;
        com.yandex.plus.pay.adapter.api.o oVar;
        Object obj3;
        Object obj4;
        com.yandex.plus.acquisition.sdk.common.api.di.b bVar;
        Object obj5;
        z zVar;
        Object obj6;
        Object obj7;
        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.b bVar2;
        anb anbVar;
        kotlinx.coroutines.a aVar = (kotlinx.coroutines.a) this.g;
        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = (com.yandex.plus.acquisition.sdk.common.api.di.b) this.e;
        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g gVar = (com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g) bVar3.c;
        com.yandex.plus.home.analytics.payment.e eVar = (com.yandex.plus.home.analytics.payment.e) bVar3.h;
        ?? r7 = (ezc) bVar3.g;
        if (cg6Var instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.c) {
            cVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.c) cg6Var;
            int i3 = cVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.o = i3 - Integer.MIN_VALUE;
                Object obj8 = cVar.m;
                Object obj9 = nm6.a;
                i = cVar.o;
                if (i != 0) {
                    qgg.h0(obj8);
                    g0 g0Var = (g0) this.b;
                    h0 h0Var = (h0) this.c;
                    Map map = (Map) this.d;
                    boolean booleanValue = ((Boolean) a0Var.f.getValue()).booleanValue();
                    cVar.j = str;
                    cVar.k = a0Var;
                    cVar.l = jVar;
                    cVar.o = 1;
                    c1 c1Var = (c1) g0Var;
                    com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.c cVar3 = cVar;
                    obj = obj9;
                    r10 = 0;
                    i2 = 2;
                    Object e = c1Var.e(jVar, h0Var, map, booleanValue, cVar3);
                    cVar2 = cVar3;
                    if (e != obj) {
                        str2 = str;
                        obj2 = e;
                        a0Var2 = a0Var;
                        jVar2 = jVar;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj8);
                        return Unit.a;
                    }
                    if (i == 3) {
                        qgg.h0(obj8);
                        return Unit.a;
                    }
                    if (i == 4) {
                        qgg.h0(obj8);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                com.yandex.plus.pay.adapter.api.j jVar3 = cVar.l;
                a0 a0Var3 = cVar.k;
                str2 = cVar.j;
                qgg.h0(obj8);
                a0Var2 = a0Var3;
                obj2 = obj8;
                obj = obj9;
                jVar2 = jVar3;
                i2 = 2;
                cVar2 = cVar;
                r10 = 0;
                oVar = (com.yandex.plus.pay.adapter.api.o) obj2;
                if (oVar instanceof com.yandex.plus.pay.adapter.api.n) {
                    Object obj10 = obj;
                    if (!(oVar instanceof com.yandex.plus.pay.adapter.api.m)) {
                        com.yandex.plus.pay.adapter.api.j jVar4 = jVar2;
                        a0 a0Var4 = a0Var2;
                        com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.c cVar4 = cVar2;
                        if (!(oVar instanceof com.yandex.plus.pay.adapter.api.l)) {
                            b6e.s();
                            return null;
                        }
                        cVar4.j = null;
                        cVar4.k = null;
                        cVar4.l = null;
                        cVar4.o = 4;
                        str2.getClass();
                        a0Var4.getClass();
                        jVar4.getClass();
                        i0 i0Var = i0.d;
                        j0 j0Var = k0.Companion;
                        r7.invoke(new v0(str2, i0Var, null));
                        a0 a0Var5 = a0Var4;
                        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.e c = com.yandex.plus.acquisition.sdk.common.api.di.b.c(bVar3, a0Var5, jVar4);
                        if (c != null) {
                            com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f fVar = c.b;
                            com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d dVar = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d.b;
                            String str3 = c.d;
                            List list = c.e;
                            boolean z = eVar.b;
                            omb ombVar = eVar.a;
                            fVar.getClass();
                            list.getClass();
                            int ordinal = gVar.ordinal();
                            if (ordinal == 0) {
                                wkb I = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                                tkb G = com.yandex.plus.bdui.plus.analytics.b.G(dVar);
                                String str4 = str3 == null ? "no_value" : str3;
                                ombVar.getClass();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("purchase_session_id", "no_value");
                                linkedHashMap.put("purchase_type", I.a);
                                linkedHashMap.put("purchase_button", G.a);
                                linkedHashMap.put("product_id", str4);
                                com.appsflyer.internal.k.z(linkedHashMap, "options_id", list, false, "is_one_click_payment");
                                linkedHashMap.put("is_tarifficator", String.valueOf(z));
                                HashMap hashMap = new HashMap();
                                com.appsflyer.internal.k.w("version", 1, hashMap, "Payment");
                                linkedHashMap.put("_meta", omb.a(1, hashMap));
                                ombVar.d("PlusHome.BuySubscription.Cancelled", linkedHashMap);
                                a0Var5 = a0Var5;
                            } else {
                                if (ordinal != 1) {
                                    b6e.s();
                                    return null;
                                }
                                wkb I2 = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                                tkb G2 = com.yandex.plus.bdui.plus.analytics.b.G(dVar);
                                if (str3 == null) {
                                    str3 = "no_value";
                                }
                                ombVar.getClass();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap2.put("purchase_session_id", "no_value");
                                linkedHashMap2.put("purchase_type", I2.a);
                                linkedHashMap2.put("purchase_button", G2.a);
                                linkedHashMap2.put("product_id", str3);
                                com.appsflyer.internal.k.z(linkedHashMap2, "options_id", list, false, "is_one_click_payment");
                                linkedHashMap2.put("is_tarifficator", String.valueOf(z));
                                HashMap hashMap2 = new HashMap();
                                com.appsflyer.internal.k.w("version", 1, hashMap2, "Payment");
                                linkedHashMap2.put("_meta", omb.a(1, hashMap2));
                                ombVar.d("PlusStories.BuySubscription.Cancelled", linkedHashMap2);
                            }
                        }
                        if (a0Var5.c.c == v.a) {
                            obj4 = x97.V(aVar, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.a(this, null, 0), cVar4);
                            obj3 = obj10;
                            if (obj4 != obj3) {
                                obj4 = Unit.a;
                            }
                        } else {
                            obj3 = obj10;
                            obj4 = Unit.a;
                        }
                        if (obj4 == obj3) {
                            return obj3;
                        }
                        return Unit.a;
                    }
                    cVar2.j = null;
                    cVar2.k = null;
                    cVar2.l = null;
                    cVar2.o = 3;
                    str2.getClass();
                    a0Var2.getClass();
                    z zVar2 = a0Var2.c;
                    jVar2.getClass();
                    com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.c cVar5 = cVar2;
                    i0 i0Var2 = i0.c;
                    d0 d0Var = ((com.yandex.plus.pay.adapter.api.m) oVar).a;
                    String obj11 = d0Var.toString();
                    j0 j0Var2 = k0.Companion;
                    r7.invoke(new v0(str2, i0Var2, obj11));
                    com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.e c2 = com.yandex.plus.acquisition.sdk.common.api.di.b.c(bVar3, a0Var2, jVar2);
                    if (c2 != null) {
                        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f fVar2 = c2.b;
                        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d dVar2 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d.b;
                        String str5 = c2.d;
                        List list2 = c2.e;
                        boolean z2 = eVar.b;
                        omb ombVar2 = eVar.a;
                        fVar2.getClass();
                        list2.getClass();
                        int ordinal2 = gVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            wkb I3 = com.yandex.plus.bdui.plus.analytics.b.I(fVar2);
                            tkb G3 = com.yandex.plus.bdui.plus.analytics.b.G(dVar2);
                            if (str5 == null) {
                                str5 = "no_value";
                            }
                            ombVar2.getClass();
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            linkedHashMap3.put("purchase_session_id", "no_value");
                            linkedHashMap3.put("purchase_type", I3.a);
                            linkedHashMap3.put("purchase_button", G3.a);
                            linkedHashMap3.put("product_id", str5);
                            com.appsflyer.internal.k.z(linkedHashMap3, "options_id", list2, false, "is_one_click_payment");
                            linkedHashMap3.put("is_tarifficator", String.valueOf(z2));
                            HashMap hashMap3 = new HashMap();
                            com.appsflyer.internal.k.w("version", 1, hashMap3, "Payment");
                            linkedHashMap3.put("_meta", omb.a(1, hashMap3));
                            ombVar2.d("PlusStories.BuySubscription.Failed", linkedHashMap3);
                            bVar = bVar3;
                            zVar = zVar2;
                            obj5 = "_meta";
                            if (zVar.c != v.a) {
                                com.yandex.plus.home.analytics.payment.c cVar6 = (com.yandex.plus.home.analytics.payment.c) bVar.f;
                                com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.a aVar2 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.a.a;
                                com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.c cVar7 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.c.a;
                                int ordinal3 = zVar.d.ordinal();
                                if (ordinal3 == 0) {
                                    bVar2 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.b.a;
                                } else if (ordinal3 == 1) {
                                    bVar2 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.b.b;
                                } else {
                                    if (ordinal3 != 2) {
                                        b6e.s();
                                        return null;
                                    }
                                    bVar2 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.b.c;
                                }
                                String obj12 = d0Var.toString();
                                cVar6.getClass();
                                obj12.getClass();
                                dnb dnbVar = cVar6.a;
                                cnb cnbVar = cVar6.b;
                                zmb b = com.yandex.plus.home.analytics.payment.c.b(aVar2);
                                bnb c3 = com.yandex.plus.home.analytics.payment.c.c(cVar7);
                                int ordinal4 = bVar2.ordinal();
                                if (ordinal4 == 0) {
                                    anbVar = anb.Native;
                                } else if (ordinal4 == 1) {
                                    anbVar = anb.InApp;
                                } else {
                                    if (ordinal4 != 2) {
                                        b6e.s();
                                        return null;
                                    }
                                    anbVar = anb.Unknown;
                                }
                                Map b2 = tah.b(new Pair(DeviceService.KEY_DESC, "Reason: ".concat(obj12)));
                                dnbVar.getClass();
                                b2.getClass();
                                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                linkedHashMap4.put("webview_type", cnbVar.a);
                                linkedHashMap4.put("additional_params", b2);
                                linkedHashMap4.put("button_type", b.a);
                                linkedHashMap4.put("payment_type", c3.a);
                                linkedHashMap4.put("offers_type", anbVar.a);
                                linkedHashMap4.put(obj5, dnb.b(new HashMap()));
                                dnbVar.c("Error.WebView.BuySubscription.Failed", linkedHashMap4);
                                obj7 = x97.V(aVar, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.a(this, null, 1), cVar5);
                                obj6 = obj10;
                                if (obj7 != obj6) {
                                    obj7 = Unit.a;
                                }
                            } else {
                                obj6 = obj10;
                                obj7 = Unit.a;
                            }
                            if (obj7 == obj6) {
                                return obj6;
                            }
                            return Unit.a;
                        }
                        wkb I4 = com.yandex.plus.bdui.plus.analytics.b.I(fVar2);
                        bVar = bVar3;
                        tkb G4 = com.yandex.plus.bdui.plus.analytics.b.G(dVar2);
                        String str6 = str5 == null ? "no_value" : str5;
                        ombVar2.getClass();
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        linkedHashMap5.put("purchase_session_id", "no_value");
                        linkedHashMap5.put("purchase_type", I4.a);
                        linkedHashMap5.put("purchase_button", G4.a);
                        linkedHashMap5.put("product_id", str6);
                        com.appsflyer.internal.k.z(linkedHashMap5, "options_id", list2, false, "is_one_click_payment");
                        linkedHashMap5.put("is_tarifficator", String.valueOf(z2));
                        HashMap hashMap4 = new HashMap();
                        com.appsflyer.internal.k.w("version", 1, hashMap4, "Payment");
                        obj5 = "_meta";
                        linkedHashMap5.put(obj5, omb.a(1, hashMap4));
                        ombVar2.d("PlusHome.BuySubscription.Failed", linkedHashMap5);
                    } else {
                        bVar = bVar3;
                        obj5 = "_meta";
                    }
                    zVar = zVar2;
                    if (zVar.c != v.a) {
                    }
                    if (obj7 == obj6) {
                    }
                    return Unit.a;
                }
                cVar2.j = r10;
                cVar2.k = r10;
                cVar2.l = r10;
                cVar2.o = i2;
            }
        }
        cVar = new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.c(this, cg6Var);
        Object obj82 = cVar.m;
        Object obj92 = nm6.a;
        i = cVar.o;
        if (i != 0) {
        }
        oVar = (com.yandex.plus.pay.adapter.api.o) obj2;
        if (oVar instanceof com.yandex.plus.pay.adapter.api.n) {
        }
    }

    public void D(int i, int i2, Object obj, int i3) {
        B(i);
        if (i3 < 0 || i3 >= i) {
            ((eqi) this.e).d(obj);
            return;
        }
        ((ArrayList) this.h).add(obj);
        ((roi) this.i).a(i2);
        ((roi) this.j).a(i3);
    }

    public void E() {
        ((taa) ((raa) ((arf) this.g).getValue())).c((eca) ((xdr) this.h).getValue());
    }

    public void F(Function0 function0) {
        arf arfVar = (arf) this.g;
        wba wbaVar = (wba) ((fkn) this.i).a.getValue();
        Continuation continuation = null;
        if (wbaVar instanceof tba) {
            raa raaVar = (raa) arfVar.getValue();
            eca ecaVar = eca.d;
            eca j = d51.j(((tba) wbaVar).a);
            taa taaVar = (taa) raaVar;
            taaVar.getClass();
            kij kijVar = taaVar.e;
            Collection collection = j.a;
            ArrayList arrayList = new ArrayList(v75.o(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((mqs) it.next()).a);
            }
            ArrayList b = kijVar.b(arrayList);
            mqs a = ((yka) taaVar.a).a();
            taaVar.d(b, null, a != null ? a.a : null);
            return;
        }
        if (wbaVar instanceof sba) {
            x97.y((cq4) this.b, null, null, new g68(this, continuation, 5), 3);
            return;
        }
        if (!(wbaVar instanceof vba)) {
            if (Intrinsics.d(wbaVar, uba.a)) {
                return;
            }
            b6e.s();
        } else if (((Boolean) ((dda) this.f).invoke()).booleanValue()) {
            function0.invoke();
        } else if (((z66) this.c).g()) {
            ((taa) ((raa) arfVar.getValue())).e((eca) ((xdr) this.h).getValue());
        } else {
            yka ykaVar = ((xka) this.d).a;
            hld.I(ykaVar.d, (z66) ykaVar.h.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(String str, cr crVar, cg6 cg6Var) {
        tok tokVar;
        int i;
        nvl nvlVar;
        rrl rrlVar;
        Object obj;
        rrl rrlVar2;
        qj6 qj6Var;
        List list;
        rrl rrlVar3;
        cvl cvlVar;
        cr crVar2 = crVar;
        if (cg6Var instanceof tok) {
            tokVar = (tok) cg6Var;
            int i2 = tokVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tokVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = tokVar.m;
                nm6 nm6Var = nm6.a;
                i = tokVar.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    nvlVar = new nvl(str, "3");
                    m9b m9bVar = (m9b) ((LinkedHashMap) crVar2.e).get(nvlVar);
                    i9b i9bVar = m9bVar instanceof i9b ? (i9b) m9bVar : null;
                    if (i9bVar == null || (rrlVar = (rrl) i9bVar.a) == null) {
                        return Unit.a;
                    }
                    cut cutVar = (cut) ((jyr) this.i).getValue();
                    List c = t75.c("3");
                    tokVar.j = crVar2;
                    tokVar.k = nvlVar;
                    tokVar.l = rrlVar;
                    tokVar.o = 1;
                    Object k = cutVar.k(tokVar, str, c);
                    if (k == nm6Var) {
                        return nm6Var;
                    }
                    obj = k;
                    rrlVar2 = rrlVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rrlVar2 = tokVar.l;
                    nvl nvlVar2 = tokVar.k;
                    cr crVar3 = tokVar.j;
                    qgg.h0(obj2);
                    nvlVar = nvlVar2;
                    crVar2 = crVar3;
                    obj = obj2;
                }
                rj6 rj6Var = (rj6) obj;
                qj6Var = rj6Var instanceof qj6 ? (qj6) rj6Var : null;
                if (qj6Var != null || (list = (List) qj6Var.a) == null || (rrlVar3 = (rrl) CollectionsKt.firstOrNull(list)) == null || (cvlVar = rrlVar3.a) == null) {
                    return Unit.a;
                }
                cvl a = cvl.a(rrlVar2.a, cvlVar.b, cvlVar.c, 0, 0, 0L, null, cvlVar.n, cvlVar.o, cvlVar.p, cvlVar.q, cvlVar.r, cvlVar.s, cvlVar.t, cvlVar.w, cvlVar.z, 56893433);
                LinkedHashMap linkedHashMap = (LinkedHashMap) crVar2.e;
                List list2 = rrlVar2.b;
                List list3 = rrlVar2.c;
                list2.getClass();
                linkedHashMap.put(nvlVar, new i9b(new rrl(a, list2, list3)));
                return Unit.a;
            }
        }
        tokVar = new tok(this, cg6Var);
        Object obj22 = tokVar.m;
        nm6 nm6Var2 = nm6.a;
        i = tokVar.o;
        if (i != 0) {
        }
        rj6 rj6Var2 = (rj6) obj;
        if (rj6Var2 instanceof qj6) {
        }
        if (qj6Var != null) {
        }
        return Unit.a;
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.g;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            xq0.q("Property \"autoMetadata\" has not been set");
        }
    }

    public cd2 c() {
        String str = ((String) this.b) == null ? " transportName" : "";
        if (((i6b) this.d) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.e) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.f) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.g) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new cd2((String) this.b, (Integer) this.c, (i6b) this.d, ((Long) this.e).longValue(), ((Long) this.f).longValue(), (HashMap) this.g, (Integer) this.h, (String) this.i, (byte[]) this.j, (byte[]) this.k);
        }
        xq0.q("Missing required properties:".concat(str));
        return null;
    }

    public mah d() {
        lah lahVar = (lah) this.b;
        String str = (String) this.c;
        Integer num = (Integer) this.d;
        String str2 = (String) this.e;
        String str3 = (String) this.f;
        Long l = (Long) this.g;
        Long l2 = (Long) this.h;
        Long l3 = (Long) this.i;
        Long l4 = (Long) this.j;
        Long l5 = (Long) this.k;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        return new mah(lahVar, str, num, str2, str3, l, l2, l3, l4, l5, e5bVar);
    }

    public void e() {
        ((Function0) this.c).invoke();
    }

    public void f() {
        qld.I(10L, (Function0) this.c);
    }

    public void g() {
        Set set = (Set) this.b;
        if (set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                eun eunVar = (eun) it.next();
                it.remove();
                eunVar.d();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void h() {
        eqi eqiVar = (eqi) this.c;
        Set set = (Set) this.b;
        B(Integer.MIN_VALUE);
        eqi eqiVar2 = (eqi) this.e;
        if (eqiVar2.c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                upi upiVar = (upi) this.g;
                int i = eqiVar2.c;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = eqiVar2.a[i];
                    if (obj instanceof fun) {
                        eun eunVar = ((fun) obj).a;
                        set.remove(eunVar);
                        eunVar.e();
                    }
                    if (obj instanceof op5) {
                        if (upiVar == null || !upiVar.d(obj)) {
                            ((op5) obj).a();
                        } else {
                            ((op5) obj).e();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (eqiVar.c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Object[] objArr = eqiVar.a;
                int i2 = eqiVar.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    eun eunVar2 = ((fun) objArr[i3]).a;
                    set.remove(eunVar2);
                    eunVar2.b();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ezc, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(String str, a0 a0Var, com.yandex.plus.pay.adapter.api.j jVar, cg6 cg6Var) {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.b bVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.b) {
            bVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.acquisition.sdk.common.api.di.b bVar2 = (com.yandex.plus.acquisition.sdk.common.api.di.b) this.e;
                    str.getClass();
                    a0Var.getClass();
                    jVar.getClass();
                    i0 i0Var = i0.b;
                    ?? r5 = (ezc) bVar2.g;
                    j0 j0Var = k0.Companion;
                    r5.invoke(new v0(str, i0Var, null));
                    com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.e c = com.yandex.plus.acquisition.sdk.common.api.di.b.c(bVar2, a0Var, jVar);
                    if (c != null) {
                        ((com.yandex.plus.home.analytics.payment.e) bVar2.h).R((com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g) bVar2.c, c.b, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d.b, c.d, c.e);
                    }
                    if (a0Var.c.c == v.a) {
                        kotlinx.coroutines.a aVar = (kotlinx.coroutines.a) this.g;
                        com.yandex.passport.internal.ui.social.i iVar = new com.yandex.passport.internal.ui.social.i(this, continuation, 17);
                        bVar.l = 1;
                        if (x97.V(aVar, iVar, bVar) == nm6Var) {
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
                y yVar = (y) this.k;
                yVar.getClass();
                Set Y = xz0.Y(new com.yandex.plus.home.state.b[]{com.yandex.plus.home.state.b.b, com.yandex.plus.home.state.b.c});
                com.yandex.plus.home.state.a aVar2 = (com.yandex.plus.home.state.a) ((com.yandex.plus.home.internal.di.l) yVar.b).q.getValue();
                aVar2.getClass();
                Y.getClass();
                aVar2.a.a(Y);
                return Unit.a;
            }
        }
        bVar = new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        y yVar2 = (y) this.k;
        yVar2.getClass();
        Set Y2 = xz0.Y(new com.yandex.plus.home.state.b[]{com.yandex.plus.home.state.b.b, com.yandex.plus.home.state.b.c});
        com.yandex.plus.home.state.a aVar22 = (com.yandex.plus.home.state.a) ((com.yandex.plus.home.internal.di.l) yVar2.b).q.getValue();
        aVar22.getClass();
        Y2.getClass();
        aVar22.a.a(Y2);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008a -> B:10:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(cr crVar, f9b f9bVar, f9b f9bVar2, cg6 cg6Var) {
        kok kokVar;
        int i;
        int i2;
        Iterator it;
        f9b f9bVar3;
        if (cg6Var instanceof kok) {
            kokVar = (kok) cg6Var;
            int i3 = kokVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kokVar.q = i3 - Integer.MIN_VALUE;
                Object obj = kokVar.o;
                nm6 nm6Var = nm6.a;
                i = kokVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!f9bVar.b.isEmpty()) {
                        i2 = 0;
                        it = zsd.M(200, f9bVar.b).iterator();
                        f9bVar3 = f9bVar2;
                        if (it.hasNext()) {
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = kokVar.n;
                List list = kokVar.m;
                it = kokVar.l;
                f9b f9bVar4 = kokVar.k;
                cr crVar2 = kokVar.j;
                qgg.h0(obj);
                kok kokVar2 = kokVar;
                int i5 = i4;
                crVar = crVar2;
                kok kokVar3 = kokVar2;
                List list2 = list;
                f9bVar3 = f9bVar4;
                rj6 rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    List list3 = (List) ((qj6) rj6Var).a;
                    LinkedHashSet linkedHashSet = f9bVar3.b;
                    List list4 = list2;
                    List<oq> list5 = list3;
                    ArrayList arrayList = new ArrayList(v75.o(list5, 10));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((oq) it2.next()).a);
                    }
                    linkedHashSet.addAll(s(list4, arrayList, "album"));
                    for (oq oqVar : list5) {
                        ((LinkedHashMap) crVar.c).put(oqVar.a, new i9b(oqVar));
                    }
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    f9bVar3.b.addAll(list2);
                    ssg.a(5, "PhonotekaSynchronizer", "load albums error " + ((pj6) rj6Var).a(), null);
                }
                i2 = i5;
                kokVar = kokVar3;
                if (it.hasNext()) {
                    list2 = (List) it.next();
                    yr yrVar = (yr) ((jyr) this.g).getValue();
                    kokVar.j = crVar;
                    kokVar.k = f9bVar3;
                    kokVar.l = it;
                    kokVar.m = list2;
                    kokVar.n = i2;
                    kokVar.q = 1;
                    Object e = yrVar.e(list2, kokVar);
                    if (e == nm6Var) {
                        return nm6Var;
                    }
                    kok kokVar4 = kokVar;
                    i5 = i2;
                    obj = e;
                    kokVar3 = kokVar4;
                    rj6 rj6Var2 = (rj6) obj;
                    if (rj6Var2 instanceof qj6) {
                    }
                    i2 = i5;
                    kokVar = kokVar3;
                    if (it.hasNext()) {
                    }
                }
                return Unit.a;
            }
        }
        kokVar = new kok(this, cg6Var);
        Object obj2 = kokVar.o;
        nm6 nm6Var2 = nm6.a;
        i = kokVar.q;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009a -> B:10:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(cr crVar, f9b f9bVar, f9b f9bVar2, cg6 cg6Var) {
        lok lokVar;
        int i;
        int i2;
        Iterator it;
        f9b f9bVar3;
        if (cg6Var instanceof lok) {
            lokVar = (lok) cg6Var;
            int i3 = lokVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lokVar.q = i3 - Integer.MIN_VALUE;
                Object obj = lokVar.o;
                nm6 nm6Var = nm6.a;
                i = lokVar.q;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!f9bVar.c.isEmpty()) {
                        i2 = 0;
                        it = zsd.M(200, f9bVar.c).iterator();
                        f9bVar3 = f9bVar2;
                        if (it.hasNext()) {
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = lokVar.n;
                Collection collection = (List) lokVar.m;
                it = lokVar.l;
                f9b f9bVar4 = lokVar.k;
                cr crVar2 = lokVar.j;
                qgg.h0(obj);
                lok lokVar2 = lokVar;
                int i5 = i4;
                crVar = crVar2;
                lok lokVar3 = lokVar2;
                Collection collection2 = collection;
                f9bVar3 = f9bVar4;
                rj6 rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    List list = (List) ((qj6) rj6Var).a;
                    LinkedHashSet linkedHashSet = f9bVar3.c;
                    Collection collection3 = collection2;
                    List<c01> list2 = list;
                    ArrayList arrayList = new ArrayList();
                    for (c01 c01Var : list2) {
                        String str = c01Var != null ? c01Var.a : null;
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    linkedHashSet.addAll(s(collection3, arrayList, "artist"));
                    for (c01 c01Var2 : list2) {
                        if (c01Var2 != null) {
                            ((LinkedHashMap) crVar.d).put(c01Var2.a, new i9b(c01Var2));
                        }
                    }
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    f9bVar3.c.addAll(collection2);
                    ssg.a(5, "PhonotekaSynchronizer", "load artist error " + ((pj6) rj6Var).a(), null);
                }
                i2 = i5;
                lokVar = lokVar3;
                if (it.hasNext()) {
                    collection2 = (List) it.next();
                    go1 go1Var = (go1) ((jyr) this.h).getValue();
                    lokVar.j = crVar;
                    lokVar.k = f9bVar3;
                    lokVar.l = it;
                    lokVar.m = (List) collection2;
                    lokVar.n = i2;
                    lokVar.q = 1;
                    go1Var.getClass();
                    Object V = x97.V(dm6.b, new l5(go1Var, collection2, continuation, 29), lokVar);
                    if (V == nm6Var) {
                        return nm6Var;
                    }
                    lok lokVar4 = lokVar;
                    i5 = i2;
                    obj = V;
                    lokVar3 = lokVar4;
                    rj6 rj6Var2 = (rj6) obj;
                    if (rj6Var2 instanceof qj6) {
                    }
                    i2 = i5;
                    lokVar = lokVar3;
                    if (it.hasNext()) {
                    }
                }
                return Unit.a;
            }
        }
        lokVar = new lok(this, cg6Var);
        Object obj2 = lokVar.o;
        nm6 nm6Var2 = nm6.a;
        i = lokVar.q;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:409:0x08ae, code lost:
    
        if (r8.c == r3.intValue()) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x0e9a, code lost:
    
        if (r5 == r4) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0ed9, code lost:
    
        if (r5 == r4) goto L530;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0efc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0f52  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0f6f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0f1d  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(String str, p73 p73Var, irk irkVar, cg6 cg6Var) {
        mok mokVar;
        int i;
        String str2;
        m43 m43Var;
        h43 h43Var;
        g43 g43Var;
        l43 l43Var;
        i43 i43Var;
        j43 j43Var;
        f43 f43Var;
        nwr nwrVar;
        cr crVar;
        m mVar;
        nm6 nm6Var;
        mok mokVar2;
        Object m;
        m mVar2;
        mok mokVar3;
        Object m2;
        nwr nwrVar2;
        cr crVar2;
        Set set;
        l43 l43Var2;
        i43 i43Var2;
        j43 j43Var2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Set set2;
        j43 j43Var3;
        i43 i43Var3;
        l43 l43Var3;
        h43 h43Var2;
        g43 g43Var2;
        nwr nwrVar3;
        cr crVar3;
        LinkedHashMap linkedHashMap3;
        m43 m43Var2;
        f43 f43Var2;
        hwr hwrVar;
        h43 h43Var3;
        l43 l43Var4;
        g43 g43Var3;
        i43 i43Var4;
        ewr ewrVar;
        Iterator it;
        LinkedHashMap linkedHashMap4;
        dwr dwrVar;
        cwr cwrVar;
        f9b f9bVar;
        cr crVar4;
        f9b f9bVar2;
        cr crVar5;
        f9b a;
        i43 i43Var5;
        l43 l43Var5;
        Set set3 = (Set) this.e;
        if (cg6Var instanceof mok) {
            mokVar = (mok) cg6Var;
            int i2 = mokVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mokVar.p = i2 - Integer.MIN_VALUE;
                Object obj = mokVar.n;
                nm6 nm6Var2 = nm6.a;
                i = mokVar.p;
                m43 m43Var3 = m43.a;
                h43 h43Var4 = h43.a;
                g43 g43Var4 = g43.a;
                l43 l43Var6 = l43.a;
                i43 i43Var6 = i43.a;
                f43 f43Var3 = f43.a;
                j43 j43Var4 = j43.a;
                Object obj2 = obj;
                if (i == 0) {
                    if (i == 1) {
                        cr crVar6 = mokVar.l;
                        nwr nwrVar4 = mokVar.k;
                        String str3 = mokVar.j;
                        qgg.h0(obj2);
                        mVar = this;
                        crVar = crVar6;
                        str2 = str3;
                        nm6Var = nm6Var2;
                        m43Var = m43Var3;
                        h43Var = h43Var4;
                        g43Var = g43Var4;
                        f43Var = f43Var3;
                        l43Var = l43Var6;
                        i43Var = i43Var6;
                        j43Var = j43Var4;
                        nwrVar = nwrVar4;
                        mokVar2 = mokVar;
                        m = obj2;
                        f9bVar = (f9b) m;
                        mokVar2.j = null;
                        mokVar2.k = nwrVar;
                        mokVar2.l = crVar;
                        mokVar2.m = f9bVar;
                        mokVar2.p = 2;
                        if (mVar.G(str2, crVar, mokVar2) != nm6Var) {
                            crVar4 = crVar;
                            crVar = crVar4;
                            nwrVar2 = nwrVar;
                            if (f9bVar.a.isEmpty()) {
                            }
                            if (!f9bVar.b.isEmpty()) {
                            }
                            if (!f9bVar.c.isEmpty()) {
                            }
                            if (!f9bVar.d.isEmpty()) {
                            }
                            if (!f9bVar.e.isEmpty()) {
                            }
                            return new kba(nwrVar2, crVar);
                        }
                        return nm6Var;
                    }
                    if (i == 2) {
                        f9b f9bVar3 = mokVar.m;
                        crVar4 = mokVar.l;
                        nwr nwrVar5 = mokVar.k;
                        qgg.h0(obj2);
                        f9bVar = f9bVar3;
                        h43Var = h43Var4;
                        g43Var = g43Var4;
                        f43Var = f43Var3;
                        l43Var = l43Var6;
                        i43Var = i43Var6;
                        j43Var = j43Var4;
                        nwrVar = nwrVar5;
                        m43Var = m43Var3;
                        crVar = crVar4;
                        nwrVar2 = nwrVar;
                        if (f9bVar.a.isEmpty()) {
                        }
                        if (!f9bVar.b.isEmpty()) {
                        }
                        if (!f9bVar.c.isEmpty()) {
                        }
                        if (!f9bVar.d.isEmpty()) {
                        }
                        if (!f9bVar.e.isEmpty()) {
                        }
                        return new kba(nwrVar2, crVar);
                    }
                    if (i == 3) {
                        cr crVar7 = mokVar.l;
                        nwr nwrVar6 = mokVar.k;
                        String str4 = mokVar.j;
                        qgg.h0(obj2);
                        mVar2 = this;
                        crVar = crVar7;
                        str2 = str4;
                        nm6Var = nm6Var2;
                        m43Var = m43Var3;
                        h43Var = h43Var4;
                        g43Var = g43Var4;
                        f43Var = f43Var3;
                        l43Var = l43Var6;
                        i43Var = i43Var6;
                        j43Var = j43Var4;
                        nwrVar = nwrVar6;
                        mokVar3 = mokVar;
                        m2 = obj2;
                        f9bVar2 = (f9b) m2;
                        f9b f9bVar4 = nwrVar.a;
                        mokVar3.j = null;
                        mokVar3.k = nwrVar;
                        mokVar3.l = crVar;
                        mokVar3.m = f9bVar2;
                        mokVar3.p = 4;
                        Object n = mVar2.n(str2, crVar, f9bVar4, mokVar3);
                        if (n != nm6Var) {
                            obj2 = n;
                            crVar5 = crVar;
                            a = f9bVar2.a((f9b) obj2);
                            crVar = crVar5;
                            nwrVar2 = nwrVar;
                            f9bVar = a;
                            if (f9bVar.a.isEmpty()) {
                            }
                            if (!f9bVar.b.isEmpty()) {
                            }
                            if (!f9bVar.c.isEmpty()) {
                            }
                            if (!f9bVar.d.isEmpty()) {
                            }
                            if (!f9bVar.e.isEmpty()) {
                            }
                            return new kba(nwrVar2, crVar);
                        }
                        return nm6Var;
                    }
                    if (i == 4) {
                        f9b f9bVar5 = mokVar.m;
                        crVar5 = mokVar.l;
                        nwr nwrVar7 = mokVar.k;
                        qgg.h0(obj2);
                        f9bVar2 = f9bVar5;
                        h43Var = h43Var4;
                        g43Var = g43Var4;
                        f43Var = f43Var3;
                        l43Var = l43Var6;
                        i43Var = i43Var6;
                        j43Var = j43Var4;
                        nwrVar = nwrVar7;
                        m43Var = m43Var3;
                        a = f9bVar2.a((f9b) obj2);
                        crVar = crVar5;
                        nwrVar2 = nwrVar;
                        f9bVar = a;
                        if (f9bVar.a.isEmpty()) {
                        }
                        if (!f9bVar.b.isEmpty()) {
                        }
                        if (!f9bVar.c.isEmpty()) {
                        }
                        if (!f9bVar.d.isEmpty()) {
                        }
                        if (!f9bVar.e.isEmpty()) {
                        }
                        return new kba(nwrVar2, crVar);
                    }
                    if (i != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cr crVar8 = mokVar.l;
                    nwrVar2 = mokVar.k;
                    qgg.h0(obj2);
                    crVar = crVar8;
                    m43Var = m43Var3;
                    h43Var = h43Var4;
                    g43Var = g43Var4;
                    f43Var = f43Var3;
                    l43Var = l43Var6;
                    i43Var = i43Var6;
                    j43Var = j43Var4;
                    a = (f9b) obj2;
                    f9bVar = a;
                    if (f9bVar.a.isEmpty()) {
                        i43Var5 = i43Var;
                        l43Var5 = l43Var;
                    } else {
                        crVar.H().add(j43Var);
                        i43Var5 = i43Var;
                        crVar.H().add(i43Var5);
                        l43Var5 = l43Var;
                        crVar.H().add(l43Var5);
                        crVar.H().add(f43Var);
                    }
                    if (!f9bVar.b.isEmpty()) {
                        crVar.H().add(g43Var);
                        crVar.H().add(f43Var);
                    }
                    if (!f9bVar.c.isEmpty()) {
                        crVar.H().add(h43Var);
                    }
                    if (!f9bVar.d.isEmpty()) {
                        crVar.H().add(i43Var5);
                        crVar.H().add(l43Var5);
                        crVar.H().add(f43Var);
                    }
                    if (!f9bVar.e.isEmpty()) {
                        crVar.H().add(m43Var);
                    }
                    return new kba(nwrVar2, crVar);
                }
                qgg.h0(obj2);
                nwr nwrVar8 = new nwr();
                cr crVar9 = new cr(7);
                LinkedHashMap linkedHashMap5 = (LinkedHashMap) crVar9.c;
                LinkedHashMap linkedHashMap6 = (LinkedHashMap) crVar9.d;
                LinkedHashMap linkedHashMap7 = (LinkedHashMap) crVar9.e;
                Iterator it2 = set3.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    mok mokVar4 = mokVar;
                    f9b f9bVar6 = nwrVar8.a;
                    f43 f43Var4 = f43Var3;
                    f9b f9bVar7 = nwrVar8.b;
                    if (hasNext) {
                        m43 m43Var4 = m43Var3;
                        n43 n43Var = (n43) it2.next();
                        nwr nwrVar9 = nwrVar8;
                        if (Intrinsics.d(n43Var, j43Var4)) {
                            List list = p73Var.a;
                            ArrayList arrayList = new ArrayList();
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                Object next = it4.next();
                                cr crVar10 = crVar9;
                                if (next instanceof g63) {
                                    arrayList.add(next);
                                }
                                it3 = it4;
                                crVar9 = crVar10;
                            }
                            crVar2 = crVar9;
                            k63 k63Var = (k63) CollectionsKt.firstOrNull(arrayList);
                            List list2 = p73Var.b;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it5 = list2.iterator();
                            while (it5.hasNext()) {
                                k63 k63Var2 = k63Var;
                                Object next2 = it5.next();
                                Iterator it6 = it5;
                                if (next2 instanceof fwr) {
                                    arrayList2.add(next2);
                                }
                                k63Var = k63Var2;
                                it5 = it6;
                            }
                            k63 k63Var3 = k63Var;
                            jwr jwrVar = (jwr) CollectionsKt.firstOrNull(arrayList2);
                            g63 g63Var = (g63) k63Var3;
                            if (g63Var == null) {
                                set = set3;
                                l43Var2 = l43Var6;
                            } else {
                                u2m u2mVar = g63Var.d;
                                u2m u2mVar2 = g63Var.c;
                                l43Var2 = l43Var6;
                                cvl cvlVar = u2mVar2.a;
                                List list3 = u2mVar2.b;
                                fwr fwrVar = (fwr) jwrVar;
                                if (fwrVar != null) {
                                    List list4 = fwrVar.c;
                                    List list5 = fwrVar.b;
                                    Integer num = g63Var.a;
                                    if (num != null) {
                                        int intValue = num.intValue();
                                        Integer num2 = fwrVar.a.a;
                                        if (num2 != null && intValue == num2.intValue() && !Intrinsics.d(g63Var.b, Boolean.TRUE)) {
                                            LinkedHashSet linkedHashSet = f9bVar6.a;
                                            List list6 = list3;
                                            ArrayList arrayList3 = new ArrayList(v75.o(list6, 10));
                                            Iterator it7 = list6.iterator();
                                            while (it7.hasNext()) {
                                                arrayList3.add(((unk) it7.next()).a);
                                            }
                                            linkedHashSet.addAll(arrayList3);
                                            int ordinal = irkVar.ordinal();
                                            if (ordinal == 0 || ordinal == 1) {
                                                nvl g = cvlVar.g();
                                                cvl a2 = cvl.a(u2mVar2.a, null, null, 0, list3.size(), 0L, null, null, null, null, null, null, null, null, null, null, 134217663);
                                                List<unk> list7 = list3;
                                                ArrayList arrayList4 = new ArrayList(v75.o(list7, 10));
                                                for (unk unkVar : list7) {
                                                    arrayList4.add(new t2m(unkVar.a, unkVar.b));
                                                }
                                                linkedHashMap7.put(g, new i9b(new rrl(a2, arrayList4, null)));
                                            } else if (ordinal != 2) {
                                                b6e.s();
                                                return null;
                                            }
                                        }
                                    }
                                    if (list5 != null && list4 != null) {
                                        List<cyr> list8 = list5;
                                        HashSet hashSet = new HashSet();
                                        for (Iterator it8 = list8.iterator(); it8.hasNext(); it8 = it8) {
                                            hashSet.add(((cyr) it8.next()).a);
                                        }
                                        HashSet hashSet2 = new HashSet();
                                        for (Iterator it9 = list3.iterator(); it9.hasNext(); it9 = it9) {
                                            hashSet2.add(((unk) it9.next()).a);
                                        }
                                        ArrayList arrayList5 = new ArrayList();
                                        set = set3;
                                        ArrayList arrayList6 = new ArrayList();
                                        Iterator it10 = hashSet.iterator();
                                        while (it10.hasNext()) {
                                            j43 j43Var5 = j43Var4;
                                            Object next3 = it10.next();
                                            i43 i43Var7 = i43Var6;
                                            if (hashSet2.contains((rr5) next3)) {
                                                arrayList5.add(next3);
                                            } else {
                                                arrayList6.add(next3);
                                            }
                                            j43Var4 = j43Var5;
                                            i43Var6 = i43Var7;
                                        }
                                        i43Var2 = i43Var6;
                                        j43Var2 = j43Var4;
                                        f9bVar6.a.addAll(arrayList5);
                                        f9bVar7.a.addAll(arrayList6);
                                        nvl g2 = cvlVar.g();
                                        cvl a3 = cvl.a(u2mVar2.a, null, null, -1, list5.size(), 0L, null, null, null, null, null, null, null, null, null, null, 134217647);
                                        ArrayList arrayList7 = new ArrayList(v75.o(list8, 10));
                                        for (cyr cyrVar : list8) {
                                            arrayList7.add(new t2m(cyrVar.a, cyrVar.b));
                                        }
                                        linkedHashMap7.put(g2, new i9b(new rrl(a3, arrayList7, null)));
                                        nvl g3 = u2mVar.a.g();
                                        cvl a4 = cvl.a(u2mVar.a, null, null, -1, list4.size(), 0L, null, null, null, null, null, null, null, null, null, null, 134217647);
                                        List<cyr> list9 = list4;
                                        ArrayList arrayList8 = new ArrayList(v75.o(list9, 10));
                                        for (cyr cyrVar2 : list9) {
                                            arrayList8.add(new t2m(cyrVar2.a, cyrVar2.b));
                                        }
                                        linkedHashMap7.put(g3, new i9b(new rrl(a4, arrayList8, null)));
                                    }
                                }
                                set = set3;
                            }
                            i43Var2 = i43Var6;
                            j43Var2 = j43Var4;
                        } else {
                            crVar2 = crVar9;
                            set = set3;
                            l43Var2 = l43Var6;
                            i43Var2 = i43Var6;
                            j43Var2 = j43Var4;
                            if (Intrinsics.d(n43Var, g43Var4)) {
                                List list10 = p73Var.a;
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj3 : list10) {
                                    if (obj3 instanceof d63) {
                                        arrayList9.add(obj3);
                                    }
                                }
                                k63 k63Var4 = (k63) CollectionsKt.firstOrNull(arrayList9);
                                List list11 = p73Var.b;
                                ArrayList arrayList10 = new ArrayList();
                                for (Object obj4 : list11) {
                                    if (obj4 instanceof cwr) {
                                        arrayList10.add(obj4);
                                    }
                                }
                                jwr jwrVar2 = (jwr) CollectionsKt.firstOrNull(arrayList10);
                                d63 d63Var = (d63) k63Var4;
                                if (d63Var != null && (cwrVar = (cwr) jwrVar2) != null) {
                                    List list12 = cwrVar.b;
                                    List list13 = d63Var.c;
                                    HashSet hashSet3 = new HashSet();
                                    Iterator it11 = list13.iterator();
                                    while (it11.hasNext()) {
                                        hashSet3.add(((q1g) it11.next()).a);
                                    }
                                    if (Intrinsics.d(d63Var.a, cwrVar.a.a) && !Intrinsics.d(d63Var.b, Boolean.TRUE)) {
                                        f9bVar6.b.addAll(hashSet3);
                                    } else if (list12 != null) {
                                        List<yvr> list14 = list12;
                                        HashSet hashSet4 = new HashSet();
                                        Iterator it12 = list14.iterator();
                                        while (it12.hasNext()) {
                                            hashSet4.add(((yvr) it12.next()).a);
                                        }
                                        ArrayList arrayList11 = new ArrayList();
                                        ArrayList arrayList12 = new ArrayList();
                                        Iterator it13 = hashSet4.iterator();
                                        while (it13.hasNext()) {
                                            Object next4 = it13.next();
                                            if (hashSet3.contains((String) next4)) {
                                                arrayList11.add(next4);
                                            } else {
                                                arrayList12.add(next4);
                                            }
                                        }
                                        ArrayList arrayList13 = new ArrayList();
                                        Iterator it14 = hashSet3.iterator();
                                        while (it14.hasNext()) {
                                            Object next5 = it14.next();
                                            if (!hashSet4.contains((String) next5)) {
                                                arrayList13.add(next5);
                                            }
                                        }
                                        f9bVar6.b.addAll(arrayList11);
                                        f9bVar7.b.addAll(arrayList12);
                                        for (yvr yvrVar : list14) {
                                            linkedHashMap5.put(yvrVar.a, new k9b(new k8k(true, yvrVar.b)));
                                        }
                                        Iterator it15 = arrayList13.iterator();
                                        while (it15.hasNext()) {
                                            linkedHashMap5.put((String) it15.next(), new k9b(new k8k(false, null)));
                                        }
                                    }
                                }
                            } else if (Intrinsics.d(n43Var, h43Var4)) {
                                List list15 = p73Var.a;
                                ArrayList arrayList14 = new ArrayList();
                                for (Object obj5 : list15) {
                                    if (obj5 instanceof e63) {
                                        arrayList14.add(obj5);
                                    }
                                }
                                k63 k63Var5 = (k63) CollectionsKt.firstOrNull(arrayList14);
                                List list16 = p73Var.b;
                                ArrayList arrayList15 = new ArrayList();
                                for (Object obj6 : list16) {
                                    if (obj6 instanceof dwr) {
                                        arrayList15.add(obj6);
                                    }
                                }
                                jwr jwrVar3 = (jwr) CollectionsKt.firstOrNull(arrayList15);
                                e63 e63Var = (e63) k63Var5;
                                if (e63Var != null && (dwrVar = (dwr) jwrVar3) != null) {
                                    List list17 = dwrVar.b;
                                    List list18 = dwrVar.c;
                                    List list19 = e63Var.c;
                                    HashSet hashSet5 = new HashSet();
                                    Iterator it16 = list19.iterator();
                                    while (it16.hasNext()) {
                                        hashSet5.add(((ac1) it16.next()).a);
                                    }
                                    List list20 = e63Var.d;
                                    HashSet hashSet6 = new HashSet();
                                    Iterator it17 = list20.iterator();
                                    while (it17.hasNext()) {
                                        hashSet6.add(((ac1) it17.next()).a);
                                    }
                                    if (Intrinsics.d(e63Var.a, dwrVar.a.a) && !Intrinsics.d(e63Var.b, Boolean.TRUE)) {
                                        f9bVar6.c.addAll(wop.i(hashSet5, hashSet6));
                                    } else if (list17 != null && list18 != null) {
                                        List list21 = list17;
                                        HashSet hashSet7 = new HashSet();
                                        Iterator it18 = list21.iterator();
                                        while (it18.hasNext()) {
                                            hashSet7.add(((zvr) it18.next()).a);
                                        }
                                        List<zvr> list22 = list18;
                                        HashSet hashSet8 = new HashSet();
                                        Iterator it19 = list22.iterator();
                                        while (it19.hasNext()) {
                                            hashSet8.add(((zvr) it19.next()).a);
                                        }
                                        LinkedHashSet i3 = wop.i(hashSet7, hashSet8);
                                        LinkedHashSet i4 = wop.i(hashSet5, hashSet6);
                                        ArrayList arrayList16 = new ArrayList();
                                        ArrayList arrayList17 = new ArrayList();
                                        for (Object obj7 : i3) {
                                            List list23 = list21;
                                            if (i4.contains((String) obj7)) {
                                                arrayList16.add(obj7);
                                            } else {
                                                arrayList17.add(obj7);
                                            }
                                            list21 = list23;
                                        }
                                        List<zvr> list24 = list21;
                                        ArrayList arrayList18 = new ArrayList();
                                        for (Object obj8 : i4) {
                                            if (!i3.contains((String) obj8)) {
                                                arrayList18.add(obj8);
                                            }
                                        }
                                        f9bVar6.c.addAll(arrayList16);
                                        f9bVar7.c.addAll(arrayList17);
                                        for (zvr zvrVar : list24) {
                                            linkedHashMap6.put(zvrVar.a, new k9b(new l8k(j1g.a, zvrVar.b)));
                                        }
                                        for (zvr zvrVar2 : list22) {
                                            linkedHashMap6.put(zvrVar2.a, new k9b(new l8k(j1g.c, zvrVar2.b)));
                                        }
                                        Iterator it20 = arrayList18.iterator();
                                        while (it20.hasNext()) {
                                            linkedHashMap6.put((String) it20.next(), new k9b(new l8k(j1g.b, null)));
                                        }
                                    }
                                }
                            } else {
                                i43 i43Var8 = i43Var2;
                                if (Intrinsics.d(n43Var, i43Var8)) {
                                    List list25 = p73Var.a;
                                    ArrayList arrayList19 = new ArrayList();
                                    for (Object obj9 : list25) {
                                        if (obj9 instanceof f63) {
                                            arrayList19.add(obj9);
                                        }
                                    }
                                    k63 k63Var6 = (k63) CollectionsKt.firstOrNull(arrayList19);
                                    List list26 = p73Var.b;
                                    ArrayList arrayList20 = new ArrayList();
                                    for (Object obj10 : list26) {
                                        if (obj10 instanceof ewr) {
                                            arrayList20.add(obj10);
                                        }
                                    }
                                    jwr jwrVar4 = (jwr) CollectionsKt.firstOrNull(arrayList20);
                                    f63 f63Var = (f63) k63Var6;
                                    if (f63Var == null || (ewrVar = (ewr) jwrVar4) == null) {
                                        linkedHashMap = linkedHashMap6;
                                        linkedHashMap2 = linkedHashMap5;
                                        set2 = set;
                                        j43Var3 = j43Var2;
                                    } else {
                                        ArrayList arrayList21 = f63Var.a;
                                        set2 = set;
                                        j43Var3 = j43Var2;
                                        if (set2.contains(j43Var3)) {
                                            ArrayList arrayList22 = new ArrayList();
                                            Iterator it21 = arrayList21.iterator();
                                            while (it21.hasNext()) {
                                                Object next6 = it21.next();
                                                Iterator it22 = it21;
                                                z1g z1gVar = (z1g) next6;
                                                z1gVar.getClass();
                                                nvl nvlVar = z1gVar.a;
                                                LinkedHashMap linkedHashMap8 = linkedHashMap6;
                                                LinkedHashMap linkedHashMap9 = linkedHashMap5;
                                                if (!Intrinsics.d(nvlVar.a, str) || !Intrinsics.d(nvlVar.b, "3")) {
                                                    arrayList22.add(next6);
                                                }
                                                it21 = it22;
                                                linkedHashMap6 = linkedHashMap8;
                                                linkedHashMap5 = linkedHashMap9;
                                            }
                                            arrayList21 = arrayList22;
                                        }
                                        linkedHashMap = linkedHashMap6;
                                        linkedHashMap2 = linkedHashMap5;
                                        int a5 = tah.a(v75.o(arrayList21, 10));
                                        if (a5 < 16) {
                                            a5 = 16;
                                        }
                                        LinkedHashMap linkedHashMap10 = new LinkedHashMap(a5);
                                        for (Object obj11 : arrayList21) {
                                            linkedHashMap10.put(((z1g) obj11).a, obj11);
                                        }
                                        List list27 = ewrVar.a;
                                        if (set2.contains(j43Var3)) {
                                            ArrayList arrayList23 = new ArrayList();
                                            Iterator it23 = list27.iterator();
                                            while (it23.hasNext()) {
                                                Object next7 = it23.next();
                                                owr owrVar = (owr) next7;
                                                owrVar.getClass();
                                                nvl nvlVar2 = owrVar.a;
                                                Iterator it24 = it23;
                                                if (!Intrinsics.d(nvlVar2.a, str) || !Intrinsics.d(nvlVar2.b, "3")) {
                                                    arrayList23.add(next7);
                                                }
                                                it23 = it24;
                                            }
                                            list27 = arrayList23;
                                        }
                                        List list28 = list27;
                                        int a6 = tah.a(v75.o(list28, 10));
                                        LinkedHashMap linkedHashMap11 = new LinkedHashMap(a6 < 16 ? 16 : a6);
                                        for (Object obj12 : list28) {
                                            linkedHashMap11.put(((owr) obj12).a, obj12);
                                        }
                                        Iterator it25 = linkedHashMap11.entrySet().iterator();
                                        while (it25.hasNext()) {
                                            Map.Entry entry = (Map.Entry) it25.next();
                                            nvl nvlVar3 = (nvl) entry.getKey();
                                            owr owrVar2 = (owr) entry.getValue();
                                            z1g z1gVar2 = (z1g) linkedHashMap10.get(nvlVar3);
                                            if (z1gVar2 == null) {
                                                f9bVar7.d.add(nvlVar3);
                                                it = it25;
                                                linkedHashMap4 = linkedHashMap10;
                                            } else {
                                                it = it25;
                                                Integer num3 = owrVar2.d;
                                                if (num3 != null) {
                                                    linkedHashMap4 = linkedHashMap10;
                                                } else {
                                                    linkedHashMap4 = linkedHashMap10;
                                                }
                                                if (z1gVar2.b == owrVar2.c) {
                                                    f9bVar6.d.add(nvlVar3);
                                                }
                                                f9bVar7.d.add(nvlVar3);
                                            }
                                            it25 = it;
                                            linkedHashMap10 = linkedHashMap4;
                                        }
                                        Iterator it26 = linkedHashMap10.entrySet().iterator();
                                        while (it26.hasNext()) {
                                            nvl nvlVar4 = (nvl) ((Map.Entry) it26.next()).getKey();
                                            if (!linkedHashMap11.containsKey(nvlVar4)) {
                                                linkedHashMap7.put(nvlVar4, new k9b(new m8k(null, null)));
                                            }
                                        }
                                    }
                                    i43Var3 = i43Var8;
                                    g43Var2 = g43Var4;
                                    f43Var2 = f43Var4;
                                    nwrVar3 = nwrVar9;
                                    crVar3 = crVar2;
                                    l43Var3 = l43Var2;
                                    linkedHashMap3 = linkedHashMap7;
                                    h43Var2 = h43Var4;
                                } else {
                                    linkedHashMap = linkedHashMap6;
                                    linkedHashMap2 = linkedHashMap5;
                                    l43 l43Var7 = l43Var2;
                                    set2 = set;
                                    j43Var3 = j43Var2;
                                    if (Intrinsics.d(n43Var, l43Var7)) {
                                        List list29 = p73Var.a;
                                        ArrayList arrayList24 = new ArrayList();
                                        for (Object obj13 : list29) {
                                            if (obj13 instanceof i63) {
                                                arrayList24.add(obj13);
                                            }
                                        }
                                        k63 k63Var7 = (k63) CollectionsKt.firstOrNull(arrayList24);
                                        List list30 = p73Var.b;
                                        ArrayList arrayList25 = new ArrayList();
                                        for (Object obj14 : list30) {
                                            if (obj14 instanceof hwr) {
                                                arrayList25.add(obj14);
                                            }
                                        }
                                        a53 a53Var = new a53(k63Var7, (jwr) CollectionsKt.firstOrNull(arrayList25));
                                        crVar3 = crVar2;
                                        LinkedHashMap linkedHashMap12 = (LinkedHashMap) crVar3.e;
                                        i63 i63Var = (i63) a53Var.a;
                                        if (i63Var == null || (hwrVar = (hwr) a53Var.b) == null) {
                                            linkedHashMap3 = linkedHashMap7;
                                            i43Var3 = i43Var8;
                                            l43Var3 = l43Var7;
                                            h43Var2 = h43Var4;
                                            g43Var2 = g43Var4;
                                            nwrVar3 = nwrVar9;
                                        } else {
                                            List list31 = i63Var.a;
                                            int a7 = tah.a(v75.o(list31, 10));
                                            if (a7 < 16) {
                                                a7 = 16;
                                            }
                                            LinkedHashMap linkedHashMap13 = new LinkedHashMap(a7);
                                            for (Object obj15 : list31) {
                                                linkedHashMap13.put(((szj) obj15).a, obj15);
                                            }
                                            List list32 = hwrVar.a;
                                            int a8 = tah.a(v75.o(list32, 10));
                                            if (a8 < 16) {
                                                a8 = 16;
                                            }
                                            LinkedHashMap linkedHashMap14 = new LinkedHashMap(a8);
                                            for (Object obj16 : list32) {
                                                linkedHashMap14.put(((axr) obj16).a, obj16);
                                            }
                                            Iterator it27 = linkedHashMap14.entrySet().iterator();
                                            while (it27.hasNext()) {
                                                Map.Entry entry2 = (Map.Entry) it27.next();
                                                nvl nvlVar5 = (nvl) entry2.getKey();
                                                axr axrVar = (axr) entry2.getValue();
                                                LinkedHashMap linkedHashMap15 = linkedHashMap7;
                                                szj szjVar = (szj) linkedHashMap13.get(nvlVar5);
                                                LinkedHashMap linkedHashMap16 = linkedHashMap13;
                                                nwr nwrVar10 = nwrVar9;
                                                Iterator it28 = it27;
                                                f9b f9bVar8 = nwrVar10.b;
                                                if (szjVar == null) {
                                                    if (axrVar.e != null) {
                                                        f9bVar8.d.add(nvlVar5);
                                                        LinkedHashSet linkedHashSet2 = f9bVar8.a;
                                                        List list33 = axrVar.e;
                                                        h43Var3 = h43Var4;
                                                        ArrayList arrayList26 = new ArrayList(v75.o(list33, 10));
                                                        Iterator it29 = list33.iterator();
                                                        while (it29.hasNext()) {
                                                            arrayList26.add(((cyr) it29.next()).a);
                                                        }
                                                        linkedHashSet2.addAll(arrayList26);
                                                    } else {
                                                        h43Var3 = h43Var4;
                                                    }
                                                    i43Var4 = i43Var8;
                                                    l43Var4 = l43Var7;
                                                    g43Var3 = g43Var4;
                                                } else {
                                                    h43Var3 = h43Var4;
                                                    List<i1m> list34 = szjVar.e;
                                                    Integer num4 = axrVar.d;
                                                    int i5 = axrVar.c;
                                                    List list35 = axrVar.e;
                                                    f9b f9bVar9 = nwrVar10.a;
                                                    if (num4 != null) {
                                                        g43Var3 = g43Var4;
                                                        l43Var4 = l43Var7;
                                                        if (szjVar.c != num4.intValue()) {
                                                            f9bVar8.d.add(nvlVar5);
                                                            if (szjVar.b != i5 && !Intrinsics.d(szjVar.d, Boolean.TRUE)) {
                                                                for (i1m i1mVar : list34) {
                                                                    f9bVar9.a.add(q6k.A(i1mVar.c, i1mVar.d));
                                                                }
                                                            } else if (list35 != null) {
                                                                Integer valueOf = Integer.valueOf(i5);
                                                                List list36 = list35;
                                                                i43Var4 = i43Var8;
                                                                ArrayList arrayList27 = new ArrayList(v75.o(list36, 10));
                                                                Iterator it30 = list36.iterator();
                                                                while (it30.hasNext()) {
                                                                    cyr cyrVar3 = (cyr) it30.next();
                                                                    arrayList27.add(new t2m(cyrVar3.a, cyrVar3.b));
                                                                    it30 = it30;
                                                                    list36 = list36;
                                                                }
                                                                List list37 = list36;
                                                                linkedHashMap12.put(nvlVar5, new k9b(new m8k(valueOf, arrayList27)));
                                                                HashSet hashSet9 = new HashSet();
                                                                for (i1m i1mVar2 : list34) {
                                                                    hashSet9.add(q6k.A(i1mVar2.c, i1mVar2.d));
                                                                }
                                                                Iterator it31 = list37.iterator();
                                                                while (it31.hasNext()) {
                                                                    rr5 rr5Var = ((cyr) it31.next()).a;
                                                                    if (hashSet9.contains(rr5Var)) {
                                                                        f9bVar9.a.add(rr5Var);
                                                                    } else {
                                                                        f9bVar8.a.add(rr5Var);
                                                                    }
                                                                }
                                                            }
                                                            i43Var4 = i43Var8;
                                                        }
                                                    } else {
                                                        l43Var4 = l43Var7;
                                                        g43Var3 = g43Var4;
                                                    }
                                                    f9bVar9.d.add(nvlVar5);
                                                    if (szjVar.b != i5) {
                                                    }
                                                    if (list35 != null) {
                                                    }
                                                    i43Var4 = i43Var8;
                                                }
                                                it27 = it28;
                                                i43Var8 = i43Var4;
                                                linkedHashMap7 = linkedHashMap15;
                                                h43Var4 = h43Var3;
                                                g43Var4 = g43Var3;
                                                l43Var7 = l43Var4;
                                                nwrVar9 = nwrVar10;
                                                linkedHashMap13 = linkedHashMap16;
                                            }
                                            linkedHashMap3 = linkedHashMap7;
                                            i43Var3 = i43Var8;
                                            l43Var3 = l43Var7;
                                            h43Var2 = h43Var4;
                                            g43Var2 = g43Var4;
                                            LinkedHashMap linkedHashMap17 = linkedHashMap13;
                                            nwrVar3 = nwrVar9;
                                            Iterator it32 = linkedHashMap17.entrySet().iterator();
                                            while (it32.hasNext()) {
                                                nvl nvlVar6 = (nvl) ((Map.Entry) it32.next()).getKey();
                                                if (!linkedHashMap14.containsKey(nvlVar6)) {
                                                    linkedHashMap12.put(nvlVar6, new j9b());
                                                }
                                            }
                                        }
                                        f43Var2 = f43Var4;
                                    } else {
                                        i43Var3 = i43Var8;
                                        l43Var3 = l43Var7;
                                        h43Var2 = h43Var4;
                                        g43Var2 = g43Var4;
                                        nwrVar3 = nwrVar9;
                                        crVar3 = crVar2;
                                        linkedHashMap3 = linkedHashMap7;
                                        m43Var2 = m43Var4;
                                        if (Intrinsics.d(n43Var, m43Var2)) {
                                            List list38 = p73Var.a;
                                            ArrayList arrayList28 = new ArrayList();
                                            for (Object obj17 : list38) {
                                                if (obj17 instanceof j63) {
                                                    arrayList28.add(obj17);
                                                }
                                            }
                                            k63 k63Var8 = (k63) CollectionsKt.firstOrNull(arrayList28);
                                            List list39 = p73Var.b;
                                            ArrayList arrayList29 = new ArrayList();
                                            for (Object obj18 : list39) {
                                                if (obj18 instanceof iwr) {
                                                    arrayList29.add(obj18);
                                                }
                                            }
                                            jwr jwrVar5 = (jwr) CollectionsKt.firstOrNull(arrayList29);
                                            j63 j63Var = (j63) k63Var8;
                                            if (j63Var != null) {
                                                HashSet hashSet10 = j63Var.a;
                                                iwr iwrVar = (iwr) jwrVar5;
                                                if (iwrVar != null) {
                                                    List list40 = iwrVar.a;
                                                    HashSet hashSet11 = new HashSet();
                                                    Iterator it33 = list40.iterator();
                                                    while (it33.hasNext()) {
                                                        hashSet11.add(((bxr) it33.next()).a);
                                                    }
                                                    ArrayList arrayList30 = new ArrayList();
                                                    ArrayList arrayList31 = new ArrayList();
                                                    Iterator it34 = hashSet11.iterator();
                                                    while (it34.hasNext()) {
                                                        Object next8 = it34.next();
                                                        if (hashSet10.contains((String) next8)) {
                                                            arrayList30.add(next8);
                                                        } else {
                                                            arrayList31.add(next8);
                                                        }
                                                    }
                                                    ArrayList arrayList32 = new ArrayList();
                                                    Iterator it35 = hashSet10.iterator();
                                                    while (it35.hasNext()) {
                                                        Object next9 = it35.next();
                                                        if (!hashSet11.contains((String) next9)) {
                                                            arrayList32.add(next9);
                                                        }
                                                    }
                                                    f9bVar6.e.addAll(arrayList30);
                                                    f9bVar7.e.addAll(arrayList31);
                                                    Iterator it36 = arrayList32.iterator();
                                                    while (it36.hasNext()) {
                                                        ((LinkedHashMap) crVar3.f).put((String) it36.next(), new j9b());
                                                    }
                                                }
                                            }
                                        } else if (Intrinsics.d(n43Var, k43.a)) {
                                            List list41 = p73Var.a;
                                            ArrayList arrayList33 = new ArrayList();
                                            for (Object obj19 : list41) {
                                                if (obj19 instanceof h63) {
                                                    arrayList33.add(obj19);
                                                }
                                            }
                                            k63 k63Var9 = (k63) CollectionsKt.firstOrNull(arrayList33);
                                            List list42 = p73Var.b;
                                            ArrayList arrayList34 = new ArrayList();
                                            for (Object obj20 : list42) {
                                                if (obj20 instanceof gwr) {
                                                    arrayList34.add(obj20);
                                                }
                                            }
                                            A(nwrVar3, crVar3, new a53(k63Var9, (jwr) CollectionsKt.firstOrNull(arrayList34)));
                                        } else {
                                            f43Var2 = f43Var4;
                                            if (!Intrinsics.d(n43Var, f43Var2)) {
                                                b6e.s();
                                                return null;
                                            }
                                            List list43 = p73Var.a;
                                            ArrayList arrayList35 = new ArrayList();
                                            for (Object obj21 : list43) {
                                                if (obj21 instanceof c63) {
                                                    arrayList35.add(obj21);
                                                }
                                            }
                                            k63 k63Var10 = (k63) CollectionsKt.firstOrNull(arrayList35);
                                            List list44 = p73Var.b;
                                            ArrayList arrayList36 = new ArrayList();
                                            for (Object obj22 : list44) {
                                                if (obj22 instanceof awr) {
                                                    arrayList36.add(obj22);
                                                }
                                            }
                                            c63 c63Var = (c63) k63Var10;
                                            if (c63Var != null) {
                                                LinkedHashSet linkedHashSet3 = f9bVar6.a;
                                                List list45 = (List) c63Var.f.getValue();
                                                ArrayList arrayList37 = new ArrayList(v75.o(list45, 10));
                                                Iterator it37 = list45.iterator();
                                                while (it37.hasNext()) {
                                                    arrayList37.add(q6k.A((String) it37.next(), null));
                                                }
                                                linkedHashSet3.addAll(arrayList37);
                                                f9bVar6.b.addAll((List) c63Var.g.getValue());
                                                LinkedHashSet linkedHashSet4 = f9bVar6.d;
                                                List list46 = (List) c63Var.h.getValue();
                                                if (set2.contains(j43Var3)) {
                                                    ArrayList arrayList38 = new ArrayList();
                                                    for (Object obj23 : list46) {
                                                        nvl nvlVar7 = (nvl) obj23;
                                                        nvlVar7.getClass();
                                                        if (!Intrinsics.d(nvlVar7.a, str) || !Intrinsics.d(nvlVar7.b, "3")) {
                                                            arrayList38.add(obj23);
                                                        }
                                                    }
                                                    list46 = arrayList38;
                                                }
                                                linkedHashSet4.addAll(list46);
                                            }
                                            m43Var3 = m43Var2;
                                            f43Var3 = f43Var2;
                                            crVar9 = crVar3;
                                            set3 = set2;
                                            nwrVar8 = nwrVar3;
                                            mokVar = mokVar4;
                                            linkedHashMap7 = linkedHashMap3;
                                            h43Var4 = h43Var2;
                                            linkedHashMap6 = linkedHashMap;
                                            linkedHashMap5 = linkedHashMap2;
                                            g43Var4 = g43Var2;
                                            l43Var6 = l43Var3;
                                            j43Var4 = j43Var3;
                                            i43Var6 = i43Var3;
                                        }
                                        f43Var2 = f43Var4;
                                        m43Var3 = m43Var2;
                                        f43Var3 = f43Var2;
                                        crVar9 = crVar3;
                                        set3 = set2;
                                        nwrVar8 = nwrVar3;
                                        mokVar = mokVar4;
                                        linkedHashMap7 = linkedHashMap3;
                                        h43Var4 = h43Var2;
                                        linkedHashMap6 = linkedHashMap;
                                        linkedHashMap5 = linkedHashMap2;
                                        g43Var4 = g43Var2;
                                        l43Var6 = l43Var3;
                                        j43Var4 = j43Var3;
                                        i43Var6 = i43Var3;
                                    }
                                }
                                m43Var2 = m43Var4;
                                m43Var3 = m43Var2;
                                f43Var3 = f43Var2;
                                crVar9 = crVar3;
                                set3 = set2;
                                nwrVar8 = nwrVar3;
                                mokVar = mokVar4;
                                linkedHashMap7 = linkedHashMap3;
                                h43Var4 = h43Var2;
                                linkedHashMap6 = linkedHashMap;
                                linkedHashMap5 = linkedHashMap2;
                                g43Var4 = g43Var2;
                                l43Var6 = l43Var3;
                                j43Var4 = j43Var3;
                                i43Var6 = i43Var3;
                            }
                        }
                        linkedHashMap = linkedHashMap6;
                        linkedHashMap2 = linkedHashMap5;
                        f43Var2 = f43Var4;
                        nwrVar3 = nwrVar9;
                        crVar3 = crVar2;
                        l43Var3 = l43Var2;
                        set2 = set;
                        j43Var3 = j43Var2;
                        i43Var3 = i43Var2;
                        linkedHashMap3 = linkedHashMap7;
                        h43Var2 = h43Var4;
                        g43Var2 = g43Var4;
                        m43Var2 = m43Var4;
                        m43Var3 = m43Var2;
                        f43Var3 = f43Var2;
                        crVar9 = crVar3;
                        set3 = set2;
                        nwrVar8 = nwrVar3;
                        mokVar = mokVar4;
                        linkedHashMap7 = linkedHashMap3;
                        h43Var4 = h43Var2;
                        linkedHashMap6 = linkedHashMap;
                        linkedHashMap5 = linkedHashMap2;
                        g43Var4 = g43Var2;
                        l43Var6 = l43Var3;
                        j43Var4 = j43Var3;
                        i43Var6 = i43Var3;
                    } else {
                        str2 = str;
                        m43Var = m43Var3;
                        h43Var = h43Var4;
                        g43Var = g43Var4;
                        l43Var = l43Var6;
                        i43Var = i43Var6;
                        j43Var = j43Var4;
                        f43Var = f43Var4;
                        nwrVar = nwrVar8;
                        crVar = crVar9;
                        z75.y(f9bVar7.a, f9bVar6.a);
                        z75.y(f9bVar7.b, f9bVar6.b);
                        z75.y(f9bVar7.c, f9bVar6.c);
                        z75.y(f9bVar7.d, f9bVar6.d);
                        z75.y(f9bVar7.e, f9bVar6.e);
                        z75.y(f9bVar7.f, f9bVar6.f);
                        ssg.a(4, "PhonotekaSynchronizer", hrg.r("update entities\nexisting ", ngg.p(f9bVar6), "\nnew ", ngg.p(f9bVar7)), null);
                        int ordinal2 = irkVar.ordinal();
                        if (ordinal2 == 0) {
                            mVar = this;
                            nm6Var = nm6Var2;
                            mokVar2 = mokVar4;
                            f9b a9 = f9bVar6.a(f9bVar7);
                            mokVar2.j = str2;
                            mokVar2.k = nwrVar;
                            mokVar2.l = crVar;
                            mokVar2.p = 1;
                            m = mVar.m(str2, crVar, a9, mokVar2);
                        } else if (ordinal2 == 1) {
                            mVar2 = this;
                            nm6Var = nm6Var2;
                            mokVar3 = mokVar4;
                            mokVar3.j = str2;
                            mokVar3.k = nwrVar;
                            mokVar3.l = crVar;
                            mokVar3.p = 3;
                            m2 = mVar2.m(str2, crVar, f9bVar7, mokVar3);
                        } else {
                            if (ordinal2 != 2) {
                                b6e.s();
                                return null;
                            }
                            mokVar4.j = null;
                            mokVar4.k = nwrVar;
                            mokVar4.l = crVar;
                            mokVar4.p = 5;
                            Object m3 = m(str2, crVar, f9bVar7, mokVar4);
                            nm6Var = nm6Var2;
                            if (m3 != nm6Var) {
                                obj2 = m3;
                                nwrVar2 = nwrVar;
                            }
                        }
                    }
                }
            }
        }
        mokVar = new mok(this, cg6Var);
        Object obj24 = mokVar.n;
        nm6 nm6Var22 = nm6.a;
        i = mokVar.p;
        m43 m43Var32 = m43.a;
        h43 h43Var42 = h43.a;
        g43 g43Var42 = g43.a;
        l43 l43Var62 = l43.a;
        i43 i43Var62 = i43.a;
        f43 f43Var32 = f43.a;
        j43 j43Var42 = j43.a;
        Object obj25 = obj24;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(String str, cr crVar, f9b f9bVar, cg6 cg6Var) {
        nok nokVar;
        nok nokVar2;
        f9b f9bVar2;
        m mVar;
        String str2;
        cr crVar2;
        f9b f9bVar3;
        cr crVar3;
        f9b f9bVar4;
        String str3;
        f9b f9bVar5;
        String str4;
        f9b f9bVar6;
        f9b f9bVar7;
        cr crVar4;
        cr crVar5;
        f9b f9bVar8;
        f9b f9bVar9;
        if (cg6Var instanceof nok) {
            nokVar = (nok) cg6Var;
            int i = nokVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                nokVar.p = i - Integer.MIN_VALUE;
                nokVar2 = nokVar;
                Object obj = nokVar2.n;
                nm6 nm6Var = nm6.a;
                switch (nokVar2.p) {
                    case 0:
                        qgg.h0(obj);
                        f9bVar2 = new f9b();
                        nokVar2.j = str;
                        nokVar2.k = crVar;
                        nokVar2.l = f9bVar;
                        nokVar2.m = f9bVar2;
                        nokVar2.p = 1;
                        mVar = this;
                        if (mVar.q(str, crVar, f9bVar, f9bVar2, nokVar2) != nm6Var) {
                            str2 = str;
                            crVar2 = crVar;
                            f9bVar3 = f9bVar;
                            nokVar2.j = str2;
                            nokVar2.k = crVar2;
                            nokVar2.l = f9bVar3;
                            nokVar2.m = f9bVar2;
                            nokVar2.p = 2;
                            if (j(crVar2, f9bVar3, f9bVar2, nokVar2) != nm6Var) {
                                f9b f9bVar10 = f9bVar3;
                                crVar3 = crVar2;
                                f9bVar4 = f9bVar10;
                                str3 = str2;
                                f9bVar5 = f9bVar2;
                                nokVar2.j = str3;
                                nokVar2.k = crVar3;
                                nokVar2.l = f9bVar4;
                                nokVar2.m = f9bVar5;
                                nokVar2.p = 3;
                                if (k(crVar3, f9bVar4, f9bVar5, nokVar2) != nm6Var) {
                                    str4 = str3;
                                    f9bVar6 = f9bVar5;
                                    f9bVar7 = f9bVar4;
                                    crVar4 = crVar3;
                                    nokVar2.j = str4;
                                    nokVar2.k = crVar4;
                                    nokVar2.l = f9bVar7;
                                    nokVar2.m = f9bVar6;
                                    nokVar2.p = 4;
                                    if (mVar.o(str4, crVar4, f9bVar7, f9bVar6, nokVar2) == nm6Var) {
                                    }
                                    nokVar2.j = str4;
                                    nokVar2.k = crVar4;
                                    nokVar2.l = f9bVar7;
                                    nokVar2.m = f9bVar6;
                                    nokVar2.p = 5;
                                    if (p(str4, crVar4, f9bVar7, f9bVar6, nokVar2) != nm6Var) {
                                        crVar5 = crVar4;
                                        f9bVar8 = f9bVar7;
                                        f9bVar9 = f9bVar6;
                                        nokVar2.j = null;
                                        nokVar2.k = null;
                                        nokVar2.l = null;
                                        nokVar2.m = f9bVar9;
                                        nokVar2.p = 6;
                                        if (r(crVar5, f9bVar8, f9bVar9, nokVar2) != nm6Var) {
                                            return f9bVar9;
                                        }
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    case 1:
                        f9b f9bVar11 = nokVar2.m;
                        f9bVar3 = nokVar2.l;
                        crVar2 = nokVar2.k;
                        String str5 = nokVar2.j;
                        qgg.h0(obj);
                        f9bVar2 = f9bVar11;
                        str2 = str5;
                        mVar = this;
                        nokVar2.j = str2;
                        nokVar2.k = crVar2;
                        nokVar2.l = f9bVar3;
                        nokVar2.m = f9bVar2;
                        nokVar2.p = 2;
                        if (j(crVar2, f9bVar3, f9bVar2, nokVar2) != nm6Var) {
                        }
                        return nm6Var;
                    case 2:
                        f9bVar5 = nokVar2.m;
                        f9bVar4 = nokVar2.l;
                        crVar3 = nokVar2.k;
                        String str6 = nokVar2.j;
                        qgg.h0(obj);
                        str3 = str6;
                        mVar = this;
                        nokVar2.j = str3;
                        nokVar2.k = crVar3;
                        nokVar2.l = f9bVar4;
                        nokVar2.m = f9bVar5;
                        nokVar2.p = 3;
                        if (k(crVar3, f9bVar4, f9bVar5, nokVar2) != nm6Var) {
                        }
                        return nm6Var;
                    case 3:
                        f9bVar5 = nokVar2.m;
                        f9bVar4 = nokVar2.l;
                        crVar3 = nokVar2.k;
                        String str7 = nokVar2.j;
                        qgg.h0(obj);
                        str4 = str7;
                        mVar = this;
                        f9bVar6 = f9bVar5;
                        f9bVar7 = f9bVar4;
                        crVar4 = crVar3;
                        nokVar2.j = str4;
                        nokVar2.k = crVar4;
                        nokVar2.l = f9bVar7;
                        nokVar2.m = f9bVar6;
                        nokVar2.p = 4;
                        if (mVar.o(str4, crVar4, f9bVar7, f9bVar6, nokVar2) == nm6Var) {
                        }
                        nokVar2.j = str4;
                        nokVar2.k = crVar4;
                        nokVar2.l = f9bVar7;
                        nokVar2.m = f9bVar6;
                        nokVar2.p = 5;
                        if (p(str4, crVar4, f9bVar7, f9bVar6, nokVar2) != nm6Var) {
                        }
                        return nm6Var;
                    case 4:
                        f9b f9bVar12 = nokVar2.m;
                        f9b f9bVar13 = nokVar2.l;
                        cr crVar6 = nokVar2.k;
                        String str8 = nokVar2.j;
                        qgg.h0(obj);
                        f9bVar6 = f9bVar12;
                        f9bVar7 = f9bVar13;
                        crVar4 = crVar6;
                        str4 = str8;
                        nokVar2.j = str4;
                        nokVar2.k = crVar4;
                        nokVar2.l = f9bVar7;
                        nokVar2.m = f9bVar6;
                        nokVar2.p = 5;
                        if (p(str4, crVar4, f9bVar7, f9bVar6, nokVar2) != nm6Var) {
                        }
                        return nm6Var;
                    case 5:
                        f9bVar9 = nokVar2.m;
                        f9bVar8 = nokVar2.l;
                        crVar5 = nokVar2.k;
                        qgg.h0(obj);
                        nokVar2.j = null;
                        nokVar2.k = null;
                        nokVar2.l = null;
                        nokVar2.m = f9bVar9;
                        nokVar2.p = 6;
                        if (r(crVar5, f9bVar8, f9bVar9, nokVar2) != nm6Var) {
                            return nm6Var;
                        }
                        break;
                    case 6:
                        f9b f9bVar14 = nokVar2.m;
                        qgg.h0(obj);
                        return f9bVar14;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        nokVar = new nok(this, cg6Var);
        nokVar2 = nokVar;
        Object obj2 = nokVar2.n;
        nm6 nm6Var2 = nm6.a;
        switch (nokVar2.p) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0120, code lost:
    
        if (r1 == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0120 -> B:11:0x0123). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(String str, cr crVar, f9b f9bVar, cg6 cg6Var) {
        ook ookVar;
        int i;
        LinkedHashSet linkedHashSet;
        cr crVar2;
        f9b f9bVar2;
        Iterator it;
        ArrayList arrayList;
        ArrayList O;
        int i2;
        Iterator it2;
        f9b f9bVar3;
        cr crVar3;
        if (cg6Var instanceof ook) {
            ookVar = (ook) cg6Var;
            int i3 = ookVar.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ookVar.r = i3 - Integer.MIN_VALUE;
                Object obj = ookVar.p;
                nm6 nm6Var = nm6.a;
                i = ookVar.r;
                if (i != 0) {
                    qgg.h0(obj);
                    f9b f9bVar4 = new f9b();
                    linkedHashSet = f9bVar.a;
                    rus rusVar = (rus) this.d;
                    ArrayList arrayList2 = new ArrayList(v75.o(linkedHashSet, 10));
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((rr5) it3.next()).a);
                    }
                    crVar2 = crVar;
                    ookVar.j = crVar2;
                    ookVar.k = f9bVar4;
                    ookVar.l = linkedHashSet;
                    ookVar.r = 1;
                    Object f = rusVar.f(ookVar, str, arrayList2);
                    if (f != nm6Var) {
                        f9bVar2 = f9bVar4;
                        obj = f;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    linkedHashSet = ookVar.l;
                    f9bVar2 = ookVar.k;
                    cr crVar4 = ookVar.j;
                    qgg.h0(obj);
                    crVar2 = crVar4;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = ookVar.o;
                    List list = ookVar.n;
                    it2 = ookVar.m;
                    f9bVar3 = ookVar.k;
                    crVar3 = ookVar.j;
                    qgg.h0(obj);
                    rj6 rj6Var = (rj6) obj;
                    if (rj6Var instanceof qj6) {
                        for (drs drsVar : (List) ((qj6) rj6Var).a) {
                            ((LinkedHashMap) crVar3.b).put(drsVar.a, new k9b(new n8k(drsVar.b)));
                        }
                    } else {
                        if (!(rj6Var instanceof pj6)) {
                            b6e.s();
                            return null;
                        }
                        LinkedHashSet linkedHashSet2 = f9bVar3.a;
                        List list2 = list;
                        ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((drs) it4.next()).a);
                        }
                        linkedHashSet2.addAll(arrayList3);
                        ssg.a(5, "PhonotekaSynchronizer", "load tracks availability error " + ((pj6) rj6Var).a(), null);
                    }
                    if (it2.hasNext()) {
                        return f9bVar3;
                    }
                    list = (List) it2.next();
                    g8c g8cVar = (g8c) this.b;
                    ookVar.j = crVar3;
                    ookVar.k = f9bVar3;
                    ookVar.l = null;
                    ookVar.m = it2;
                    ookVar.n = list;
                    ookVar.o = i2;
                    ookVar.r = 2;
                    obj = g8cVar.t(list, ookVar);
                }
                Iterable iterable = (Iterable) obj;
                it = iterable.iterator();
                arrayList = new ArrayList(Math.min(v75.o(linkedHashSet, 10), v75.o(iterable, 10)));
                while (r9.hasNext() && it.hasNext()) {
                    Boolean bool = (Boolean) it.next();
                    arrayList.add(bool == null ? new drs((rr5) r1, bool.booleanValue()) : null);
                }
                O = CollectionsKt.O(arrayList);
                if (!O.isEmpty()) {
                    return f9bVar2;
                }
                i2 = 0;
                it2 = zsd.M(10000, O).iterator();
                f9bVar3 = f9bVar2;
                crVar3 = crVar2;
                if (it2.hasNext()) {
                }
            }
        }
        ookVar = new ook(this, cg6Var);
        Object obj2 = ookVar.p;
        nm6 nm6Var2 = nm6.a;
        i = ookVar.r;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        it = iterable2.iterator();
        arrayList = new ArrayList(Math.min(v75.o(linkedHashSet, 10), v75.o(iterable2, 10)));
        for (Object obj3 : linkedHashSet) {
            Boolean bool2 = (Boolean) it.next();
            arrayList.add(bool2 == null ? new drs((rr5) obj3, bool2.booleanValue()) : null);
        }
        O = CollectionsKt.O(arrayList);
        if (!O.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x030b -> B:12:0x0316). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0103 -> B:84:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x018b -> B:66:0x0192). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(String str, cr crVar, f9b f9bVar, f9b f9bVar2, cg6 cg6Var) {
        pok pokVar;
        int i;
        jyr jyrVar;
        cr crVar2;
        f9b f9bVar3;
        Iterator it;
        pok pokVar2;
        int i2;
        String str2;
        f9b f9bVar4;
        pok pokVar3;
        int i3;
        Iterator it2;
        cr crVar3;
        int i4;
        Iterator it3;
        cr crVar4;
        nvl nvlVar;
        String str3;
        String str4;
        rj6 rj6Var;
        m mVar = this;
        jyr jyrVar2 = (jyr) mVar.i;
        if (cg6Var instanceof pok) {
            pokVar = (pok) cg6Var;
            int i5 = pokVar.y;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                pokVar.y = i5 - Integer.MIN_VALUE;
                Object obj = pokVar.w;
                nm6 nm6Var = nm6.a;
                i = pokVar.y;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!f9bVar.d.isEmpty()) {
                        boolean h = ((xpk) xpk.e.getValue()).h();
                        LinkedHashSet linkedHashSet = f9bVar.d;
                        if (h) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj2 : linkedHashSet) {
                                String str5 = ((nvl) obj2).a;
                                Object obj3 = linkedHashMap.get(str5);
                                if (obj3 == null) {
                                    obj3 = new ArrayList();
                                    linkedHashMap.put(str5, obj3);
                                }
                                ((List) obj3).add(obj2);
                            }
                            Iterator it4 = linkedHashMap.entrySet().iterator();
                            f9bVar4 = f9bVar2;
                            pokVar3 = pokVar;
                            i3 = 0;
                            it2 = it4;
                            crVar3 = crVar;
                            if (it2.hasNext()) {
                            }
                        } else {
                            jyrVar = jyrVar2;
                            crVar2 = crVar;
                            f9bVar3 = f9bVar2;
                            it = linkedHashSet.iterator();
                            pokVar2 = pokVar;
                            i2 = 0;
                            str2 = str;
                            if (it.hasNext()) {
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i == 1) {
                    int i6 = pokVar.v;
                    int i7 = pokVar.u;
                    i3 = pokVar.t;
                    ArrayList arrayList = pokVar.s;
                    List list = pokVar.r;
                    Iterator it5 = pokVar.q;
                    String str6 = (String) pokVar.n;
                    Iterator it6 = pokVar.m;
                    f9b f9bVar5 = pokVar.l;
                    cr crVar5 = pokVar.k;
                    qgg.h0(obj);
                    int i8 = i6;
                    crVar3 = crVar5;
                    jyr jyrVar3 = jyrVar2;
                    int i9 = i7;
                    pokVar3 = pokVar;
                    it2 = it6;
                    List list2 = list;
                    rj6 rj6Var2 = (rj6) obj;
                    if (rj6Var2 instanceof qj6) {
                        i4 = i9;
                        it3 = it2;
                        if (!(rj6Var2 instanceof pj6)) {
                            b6e.s();
                            return null;
                        }
                        f9bVar5.d.addAll(list2);
                        ssg.a(5, "PhonotekaSynchronizer", "load playlists error " + ((pj6) rj6Var2).a(), null);
                    } else {
                        List list3 = (List) ((qj6) rj6Var2).a;
                        LinkedHashSet linkedHashSet2 = f9bVar5.d;
                        List<rrl> list4 = list3;
                        i4 = i9;
                        it3 = it2;
                        ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
                        Iterator it7 = list4.iterator();
                        while (it7.hasNext()) {
                            arrayList2.add(((rrl) it7.next()).a.g().b);
                        }
                        ArrayList s = mVar.s(arrayList, arrayList2, "playlist with uid " + str6);
                        ArrayList arrayList3 = new ArrayList(v75.o(s, 10));
                        Iterator it8 = s.iterator();
                        while (it8.hasNext()) {
                            arrayList3.add(new nvl(str6, (String) it8.next()));
                        }
                        linkedHashSet2.addAll(arrayList3);
                        for (rrl rrlVar : list4) {
                            cvl cvlVar = rrlVar.a;
                            if (Intrinsics.d(cvlVar.c.a, str6)) {
                                ((LinkedHashMap) crVar3.e).put(cvlVar.g(), new i9b(rrlVar));
                            } else {
                                ((LinkedHashMap) crVar3.e).put(new nvl(str6, cvlVar.a), new j9b());
                            }
                        }
                    }
                    int i10 = i4;
                    it2 = it3;
                    f9bVar4 = f9bVar5;
                    jyrVar2 = jyrVar3;
                    if (it5.hasNext()) {
                        List list5 = (List) it5.next();
                        List list6 = list5;
                        jyrVar3 = jyrVar2;
                        ArrayList arrayList4 = new ArrayList(v75.o(list6, 10));
                        Iterator it9 = list6.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(((nvl) it9.next()).b);
                        }
                        cut cutVar = (cut) jyrVar3.getValue();
                        pokVar3.j = null;
                        pokVar3.k = crVar3;
                        pokVar3.l = f9bVar4;
                        pokVar3.m = it2;
                        pokVar3.n = str6;
                        pokVar3.o = null;
                        pokVar3.p = null;
                        pokVar3.q = it5;
                        pokVar3.r = list5;
                        pokVar3.s = arrayList4;
                        pokVar3.t = i3;
                        pokVar3.u = i10;
                        pokVar3.v = i8;
                        pokVar3.y = 1;
                        Object k = cutVar.k(pokVar3, str6, arrayList4);
                        if (k != nm6Var) {
                            f9bVar5 = f9bVar4;
                            obj = k;
                            i9 = i10;
                            arrayList = arrayList4;
                            list2 = list5;
                            rj6 rj6Var22 = (rj6) obj;
                            if (rj6Var22 instanceof qj6) {
                            }
                            int i102 = i4;
                            it2 = it3;
                            f9bVar4 = f9bVar5;
                            jyrVar2 = jyrVar3;
                            if (it5.hasNext()) {
                            }
                        }
                        return nm6Var;
                    }
                    if (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        String str7 = (String) entry.getKey();
                        it5 = zsd.M(200, (List) entry.getValue()).iterator();
                        str6 = str7;
                        i102 = 0;
                        i8 = 0;
                        if (it5.hasNext()) {
                        }
                        if (it2.hasNext()) {
                        }
                    }
                    return Unit.a;
                }
                if (i == 2) {
                    int i11 = pokVar.t;
                    str3 = pokVar.p;
                    str4 = pokVar.o;
                    nvl nvlVar2 = (nvl) pokVar.n;
                    Iterator it10 = pokVar.m;
                    f9b f9bVar6 = pokVar.l;
                    cr crVar6 = pokVar.k;
                    String str8 = pokVar.j;
                    qgg.h0(obj);
                    jyrVar = jyrVar2;
                    rj6Var = (rj6) obj;
                    pokVar2 = pokVar;
                    nvlVar = nvlVar2;
                    f9bVar3 = f9bVar6;
                    crVar4 = crVar6;
                    i2 = i11;
                    str2 = str8;
                    it = it10;
                    if (rj6Var instanceof qj6) {
                    }
                    mVar = this;
                    crVar2 = crVar4;
                    if (it.hasNext()) {
                    }
                    return Unit.a;
                }
                if (i != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i12 = pokVar.t;
                str3 = pokVar.p;
                String str9 = pokVar.o;
                nvl nvlVar3 = (nvl) pokVar.n;
                it = pokVar.m;
                f9b f9bVar7 = pokVar.l;
                crVar4 = pokVar.k;
                String str10 = pokVar.j;
                qgg.h0(obj);
                jyrVar = jyrVar2;
                String str11 = str9;
                nvlVar = nvlVar3;
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    rrl rrlVar2 = (rrl) CollectionsKt.firstOrNull((List) ((qj6) rj6Var).a);
                    if (rrlVar2 != null) {
                        qj6 qj6Var = new qj6(rrlVar2);
                        f9b f9bVar8 = f9bVar7;
                        str4 = str11;
                        f9bVar3 = f9bVar8;
                        rj6Var = qj6Var;
                        pokVar2 = pokVar;
                        i2 = i12;
                        str2 = str10;
                        if (rj6Var instanceof qj6) {
                            if (!(rj6Var instanceof pj6)) {
                                b6e.s();
                                return null;
                            }
                            if (!(rj6Var instanceof mj6) || ((mj6) rj6Var).a != 404) {
                                f9bVar3.d.add(nvlVar);
                                y9w.V(null, new iik(1, nvlVar, (pj6) rj6Var));
                                mVar = this;
                                crVar2 = crVar4;
                                if (it.hasNext()) {
                                    nvl nvlVar4 = (nvl) it.next();
                                    String str12 = nvlVar4.a;
                                    String str13 = nvlVar4.b;
                                    if (Intrinsics.d(str12, str2)) {
                                        cut cutVar2 = (cut) jyrVar.getValue();
                                        List c = t75.c(str13);
                                        pokVar2.j = str2;
                                        pokVar2.k = crVar2;
                                        pokVar2.l = f9bVar3;
                                        pokVar2.m = it;
                                        pokVar2.n = nvlVar4;
                                        pokVar2.o = str12;
                                        pokVar2.p = str13;
                                        pokVar2.t = i2;
                                        pokVar2.u = 0;
                                        pokVar2.y = 3;
                                        Object k2 = cutVar2.k(pokVar2, str12, c);
                                        if (k2 != nm6Var) {
                                            crVar4 = crVar2;
                                            obj = k2;
                                            f9bVar7 = f9bVar3;
                                            str11 = str12;
                                            nvlVar = nvlVar4;
                                            str3 = str13;
                                            str10 = str2;
                                            i12 = i2;
                                            pokVar = pokVar2;
                                            rj6Var = (rj6) obj;
                                            if (rj6Var instanceof qj6) {
                                            }
                                        }
                                    } else {
                                        cut cutVar3 = (cut) jyrVar.getValue();
                                        pokVar2.j = str2;
                                        pokVar2.k = crVar2;
                                        pokVar2.l = f9bVar3;
                                        pokVar2.m = it;
                                        pokVar2.n = nvlVar4;
                                        pokVar2.o = str12;
                                        pokVar2.p = str13;
                                        pokVar2.t = i2;
                                        pokVar2.u = 0;
                                        pokVar2.y = 2;
                                        Object h2 = cut.h(cutVar3, str12, str13, true, false, pokVar2, 96);
                                        if (h2 != nm6Var) {
                                            cr crVar7 = crVar2;
                                            str4 = str12;
                                            str3 = str13;
                                            rj6Var = (rj6) h2;
                                            pokVar2 = pokVar2;
                                            nvlVar = nvlVar4;
                                            f9bVar3 = f9bVar3;
                                            crVar4 = crVar7;
                                            i2 = i2;
                                            str2 = str2;
                                            it = it;
                                            if (rj6Var instanceof qj6) {
                                                rrl rrlVar3 = (rrl) ((qj6) rj6Var).a;
                                                LinkedHashSet linkedHashSet3 = f9bVar3.d;
                                                List c2 = t75.c(str3);
                                                cvl cvlVar2 = rrlVar3.a;
                                                ArrayList s2 = mVar.s(c2, t75.c(cvlVar2.g().b), "playlist with uid " + str4);
                                                ArrayList arrayList5 = new ArrayList(v75.o(s2, 10));
                                                Iterator it11 = s2.iterator();
                                                while (it11.hasNext()) {
                                                    arrayList5.add(new nvl(str4, (String) it11.next()));
                                                }
                                                linkedHashSet3.addAll(arrayList5);
                                                if (Intrinsics.d(cvlVar2.c.a, str4)) {
                                                    ((LinkedHashMap) crVar4.e).put(cvlVar2.g(), new i9b(rrlVar3));
                                                } else {
                                                    ((LinkedHashMap) crVar4.e).put(new nvl(str4, cvlVar2.a), new j9b());
                                                }
                                            }
                                        }
                                    }
                                    return nm6Var;
                                }
                                return Unit.a;
                            }
                            ((LinkedHashMap) crVar4.e).put(nvlVar, new j9b());
                        }
                        mVar = this;
                        crVar2 = crVar4;
                        if (it.hasNext()) {
                        }
                        return Unit.a;
                    }
                    rj6Var = new nj6(null);
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                f9b f9bVar9 = f9bVar7;
                str4 = str11;
                f9bVar3 = f9bVar9;
                pokVar2 = pokVar;
                i2 = i12;
                str2 = str10;
                if (rj6Var instanceof qj6) {
                }
                mVar = this;
                crVar2 = crVar4;
                if (it.hasNext()) {
                }
                return Unit.a;
            }
        }
        pokVar = new pok(mVar, cg6Var);
        Object obj4 = pokVar.w;
        nm6 nm6Var2 = nm6.a;
        i = pokVar.y;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(String str, cr crVar, f9b f9bVar, f9b f9bVar2, cg6 cg6Var) {
        qok qokVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof qok) {
            qokVar = (qok) cg6Var;
            int i2 = qokVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qokVar.o = i2 - Integer.MIN_VALUE;
                Object obj = qokVar.m;
                nm6 nm6Var = nm6.a;
                i = qokVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!f9bVar.e.isEmpty()) {
                        elm elmVar = (elm) ((jyr) this.j).getValue();
                        qokVar.j = crVar;
                        qokVar.k = f9bVar;
                        qokVar.l = f9bVar2;
                        qokVar.o = 1;
                        obj = elmVar.b(str, qokVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f9bVar2 = qokVar.l;
                f9bVar = qokVar.k;
                crVar = qokVar.j;
                qgg.h0(obj);
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    for (kjm kjmVar : (Iterable) ((qj6) rj6Var).a) {
                        ((LinkedHashMap) crVar.f).put(kjmVar.b, new i9b(kjmVar));
                    }
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    f9bVar2.e.addAll(f9bVar.e);
                    ssg.a(5, "PhonotekaSynchronizer", "load presaves error " + ((pj6) rj6Var).a(), null);
                }
                return Unit.a;
            }
        }
        qokVar = new qok(this, cg6Var);
        Object obj2 = qokVar.m;
        nm6 nm6Var2 = nm6.a;
        i = qokVar.o;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0281 -> B:11:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(String str, cr crVar, f9b f9bVar, f9b f9bVar2, cg6 cg6Var) {
        rok rokVar;
        int i;
        rok rokVar2;
        vqn vqnVar;
        int size;
        int i2;
        cr crVar2;
        f9b f9bVar3;
        Iterator it;
        String str2;
        List list;
        ArrayList arrayList;
        Iterator it2;
        vqn vqnVar2;
        List list2;
        int i3;
        nm6 nm6Var;
        int i4;
        f9b f9bVar4;
        Iterator it3;
        cr crVar3;
        int i5;
        int i6;
        Object obj;
        String str3;
        rj6 rj6Var;
        Iterator it4;
        rok rokVar3;
        int i7;
        m mVar = this;
        if (cg6Var instanceof rok) {
            rokVar = (rok) cg6Var;
            int i8 = rokVar.y;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                rokVar.y = i8 - Integer.MIN_VALUE;
                Object obj2 = rokVar.w;
                nm6 nm6Var2 = nm6.a;
                i = rokVar.y;
                if (i != 0) {
                    qgg.h0(obj2);
                    LinkedHashSet linkedHashSet = f9bVar.a;
                    if (!linkedHashSet.isEmpty()) {
                        rokVar2 = rokVar;
                        vqnVar = new vqn();
                        size = linkedHashSet.size();
                        i2 = 0;
                        crVar2 = crVar;
                        f9bVar3 = f9bVar2;
                        it = zsd.M(ScreenMirroringConfig.Test.pcVideoUdpPort, linkedHashSet).iterator();
                        str2 = str;
                        if (it.hasNext()) {
                        }
                    }
                    return Unit.a;
                }
                if (i == 1) {
                    int i9 = rokVar.v;
                    i4 = rokVar.u;
                    int i10 = rokVar.t;
                    i3 = rokVar.s;
                    list2 = rokVar.r;
                    Iterator it5 = rokVar.q;
                    ArrayList arrayList2 = rokVar.p;
                    List list3 = rokVar.o;
                    it3 = rokVar.n;
                    vqn vqnVar3 = rokVar.m;
                    f9bVar4 = rokVar.l;
                    crVar3 = rokVar.k;
                    String str4 = rokVar.j;
                    qgg.h0(obj2);
                    str3 = str4;
                    list = list3;
                    obj = obj2;
                    arrayList = arrayList2;
                    it2 = it5;
                    vqnVar2 = vqnVar3;
                    i5 = i9;
                    i6 = i10;
                    nm6Var = nm6Var2;
                    rj6Var = (rj6) obj;
                    if (rj6Var instanceof qj6) {
                    }
                    if (it4.hasNext()) {
                    }
                    return nm6Var;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i11 = rokVar.t;
                int i12 = rokVar.s;
                ArrayList arrayList3 = rokVar.p;
                List list4 = rokVar.o;
                Iterator it6 = rokVar.n;
                vqn vqnVar4 = rokVar.m;
                f9b f9bVar5 = rokVar.l;
                cr crVar4 = rokVar.k;
                String str5 = rokVar.j;
                qgg.h0(obj2);
                rokVar2 = rokVar;
                size = i12;
                ArrayList<mqs> arrayList4 = arrayList3;
                crVar2 = crVar4;
                str2 = str5;
                nm6Var = nm6Var2;
                int i13 = i11;
                f9bVar3 = f9bVar5;
                m mVar2 = mVar;
                String str6 = null;
                vqnVar = vqnVar4;
                for (mqs mqsVar : arrayList4) {
                    ((LinkedHashMap) crVar2.b).put(q6k.A(mqsVar.a, mqsVar.l() ? mqsVar.d.a : str6), new h9b());
                }
                i2 = i13;
                mVar = mVar2;
                nm6Var2 = nm6Var;
                it = it6;
                if (it.hasNext()) {
                    List list5 = (List) it.next();
                    rok rokVar4 = rokVar2;
                    crVar3 = crVar2;
                    rokVar = rokVar4;
                    List list6 = list5;
                    ArrayList arrayList5 = new ArrayList(list5.size());
                    it4 = zsd.M(200, list5).iterator();
                    vqnVar4 = vqnVar;
                    i3 = size;
                    f9bVar4 = f9bVar3;
                    it3 = it;
                    i6 = i2;
                    i5 = 0;
                    i4 = 0;
                    if (it4.hasNext()) {
                        List list7 = (List) it4.next();
                        List list8 = list6;
                        psd psdVar = new psd(2);
                        psdVar.b = "Phonoteka";
                        psdVar.a("Downloading full tracks");
                        rokVar.j = str2;
                        rokVar.k = crVar3;
                        rokVar.l = f9bVar4;
                        rokVar.m = vqnVar4;
                        rokVar.n = it3;
                        rokVar.o = list8;
                        rokVar.p = arrayList5;
                        rokVar.q = it4;
                        rokVar.r = list7;
                        rokVar.s = i3;
                        rokVar.t = i6;
                        rokVar.u = i4;
                        rokVar.v = i5;
                        rokVar.y = 1;
                        Object e = ((l0t) ((jyr) mVar.f).getValue()).e(list7, psdVar, rokVar);
                        nm6Var = nm6Var2;
                        if (e != nm6Var) {
                            String str7 = str2;
                            obj = e;
                            str3 = str7;
                            list = list8;
                            arrayList = arrayList5;
                            it2 = it4;
                            vqnVar2 = vqnVar4;
                            list2 = list7;
                            rj6Var = (rj6) obj;
                            if (rj6Var instanceof qj6) {
                                String str8 = str3;
                                rok rokVar5 = rokVar;
                                int i14 = i6;
                                int i15 = i5;
                                if (!(rj6Var instanceof pj6)) {
                                    b6e.s();
                                    return null;
                                }
                                f9bVar4.a.addAll(list2);
                                ssg.a(5, "PhonotekaSynchronizer", "load tracks error " + ((pj6) rj6Var).a(), null);
                                str2 = str8;
                                rokVar = rokVar5;
                                mVar = this;
                                nm6Var2 = nm6Var;
                                vqnVar4 = vqnVar2;
                                it4 = it2;
                                arrayList5 = arrayList;
                                list6 = list;
                                i6 = i14;
                                i5 = i15;
                            } else {
                                List list9 = (List) ((qj6) rj6Var).a;
                                List list10 = list2;
                                HashSet hashSet = new HashSet();
                                Iterator it7 = list10.iterator();
                                while (it7.hasNext()) {
                                    hashSet.add(((rr5) it7.next()).a);
                                    str3 = str3;
                                }
                                String str9 = str3;
                                HashSet hashSet2 = new HashSet();
                                Iterator it8 = list9.iterator();
                                while (it8.hasNext()) {
                                    hashSet2.add(((mqs) it8.next()).a);
                                    list9 = list9;
                                }
                                List list11 = list9;
                                int i16 = i5;
                                ArrayList s = s(hashSet, hashSet2, "track");
                                if (s.isEmpty()) {
                                    rokVar3 = rokVar;
                                    i7 = i6;
                                } else {
                                    LinkedHashSet linkedHashSet2 = f9bVar4.a;
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj3 : list10) {
                                        rok rokVar6 = rokVar;
                                        int i17 = i6;
                                        if (s.contains(((rr5) obj3).a)) {
                                            arrayList6.add(obj3);
                                        }
                                        rokVar = rokVar6;
                                        i6 = i17;
                                    }
                                    rokVar3 = rokVar;
                                    i7 = i6;
                                    linkedHashSet2.addAll(arrayList6);
                                }
                                arrayList.addAll(list11);
                                str2 = str9;
                                rokVar = rokVar3;
                                mVar = this;
                                nm6Var2 = nm6Var;
                                vqnVar4 = vqnVar2;
                                it4 = it2;
                                arrayList5 = arrayList;
                                list6 = list;
                                i6 = i7;
                                i5 = i16;
                            }
                            if (it4.hasNext()) {
                                mVar2 = mVar;
                                nm6Var = nm6Var2;
                                int size2 = list6.size() + vqnVar4.a;
                                vqnVar4.a = size2;
                                epk epkVar = (epk) mVar2.c;
                                rokVar.j = str2;
                                rokVar.k = crVar3;
                                rokVar.l = f9bVar4;
                                rokVar.m = vqnVar4;
                                rokVar.n = it3;
                                str6 = null;
                                rokVar.o = null;
                                rokVar.p = arrayList5;
                                rokVar.q = null;
                                rokVar.r = null;
                                rokVar.s = i3;
                                rokVar.t = i6;
                                rokVar.u = i4;
                                rokVar.y = 2;
                                String str10 = str2;
                                rok rokVar7 = rokVar;
                                int i18 = i3;
                                arrayList4 = arrayList5;
                                if (epkVar.b(str10, arrayList4, size2, i18, rokVar7) != nm6Var) {
                                    i13 = i6;
                                    crVar2 = crVar3;
                                    it6 = it3;
                                    f9bVar3 = f9bVar4;
                                    str2 = str10;
                                    size = i18;
                                    rokVar2 = rokVar7;
                                    vqnVar = vqnVar4;
                                    while (r12.hasNext()) {
                                    }
                                    i2 = i13;
                                    mVar = mVar2;
                                    nm6Var2 = nm6Var;
                                    it = it6;
                                    if (it.hasNext()) {
                                    }
                                }
                            }
                        }
                    }
                    return nm6Var;
                }
                return Unit.a;
            }
        }
        rokVar = new rok(mVar, cg6Var);
        Object obj22 = rokVar.w;
        nm6 nm6Var22 = nm6.a;
        i = rokVar.y;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008a -> B:10:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(cr crVar, f9b f9bVar, f9b f9bVar2, cg6 cg6Var) {
        sok sokVar;
        int i;
        int i2;
        Iterator it;
        f9b f9bVar3;
        if (cg6Var instanceof sok) {
            sokVar = (sok) cg6Var;
            int i3 = sokVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sokVar.q = i3 - Integer.MIN_VALUE;
                Object obj = sokVar.o;
                nm6 nm6Var = nm6.a;
                i = sokVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!f9bVar.f.isEmpty()) {
                        i2 = 0;
                        it = zsd.M(200, f9bVar.f).iterator();
                        f9bVar3 = f9bVar2;
                        if (it.hasNext()) {
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = sokVar.n;
                List list = sokVar.m;
                it = sokVar.l;
                f9b f9bVar4 = sokVar.k;
                cr crVar2 = sokVar.j;
                qgg.h0(obj);
                sok sokVar2 = sokVar;
                int i5 = i4;
                crVar = crVar2;
                sok sokVar3 = sokVar2;
                List list2 = list;
                f9bVar3 = f9bVar4;
                rj6 rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    List list3 = (List) ((qj6) rj6Var).a;
                    LinkedHashSet linkedHashSet = f9bVar3.f;
                    List list4 = list2;
                    List<x1u> list5 = list3;
                    ArrayList arrayList = new ArrayList(v75.o(list5, 10));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((x1u) it2.next()).a);
                    }
                    linkedHashSet.addAll(s(list4, arrayList, "video clips"));
                    for (x1u x1uVar : list5) {
                        ((LinkedHashMap) crVar.g).put(x1uVar.a, new i9b(x1uVar));
                    }
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    f9bVar3.f.addAll(list2);
                    ssg.a(5, "PhonotekaSynchronizer", "load video clip error " + ((pj6) rj6Var).a(), null);
                }
                i2 = i5;
                sokVar = sokVar3;
                if (it.hasNext()) {
                    list2 = (List) it.next();
                    b8u b8uVar = (b8u) ((jyr) this.k).getValue();
                    sokVar.j = crVar;
                    sokVar.k = f9bVar3;
                    sokVar.l = it;
                    sokVar.m = list2;
                    sokVar.n = i2;
                    sokVar.q = 1;
                    Object b = b8uVar.b(list2, sokVar);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    sok sokVar4 = sokVar;
                    i5 = i2;
                    obj = b;
                    sokVar3 = sokVar4;
                    rj6 rj6Var2 = (rj6) obj;
                    if (rj6Var2 instanceof qj6) {
                    }
                    i2 = i5;
                    sokVar = sokVar3;
                    if (it.hasNext()) {
                    }
                }
                return Unit.a;
            }
        }
        sokVar = new sok(this, cg6Var);
        Object obj2 = sokVar.o;
        nm6 nm6Var2 = nm6.a;
        i = sokVar.q;
        if (i != 0) {
        }
    }

    public ArrayList s(Collection collection, Collection collection2, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (!collection2.contains(obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            y9w.V(null, new iik(2, str, arrayList));
        }
        return arrayList;
    }

    public fkn t() {
        switch (this.a) {
        }
        return (fkn) this.j;
    }

    public void u(oq oqVar) {
        oqVar.getClass();
        ((j94) this.g).invoke(quj.T((Context) this.d, oqVar, (PlaybackScope) this.b));
    }

    public void v(oq oqVar, mqs mqsVar) {
        oqVar.getClass();
        mqsVar.getClass();
        j94 j94Var = (j94) this.g;
        Context context = (Context) this.d;
        PlaybackScope playbackScope = (PlaybackScope) this.b;
        j94Var.invoke(quj.U(context, new uq(oqVar, playbackScope.b(oqVar).a(), mqsVar, null, BuildConfig.API_LEVEL), playbackScope));
    }

    public void w(c01 c01Var) {
        j94 j94Var = (j94) this.g;
        int i = ArtistScreenActivity.w0;
        j94Var.invoke(l48.o((Context) this.d, c01Var, (PlaybackScope) this.b, 24));
    }

    public void x(u51 u51Var) {
        u51Var.getClass();
        j94 j94Var = (j94) this.g;
        int i = ArtistScreenActivity.w0;
        j94Var.invoke(l48.p((Context) this.d, u51Var, (PlaybackScope) this.b, null, 24));
    }

    public void y(Collection collection, ao1 ao1Var) {
        collection.getClass();
        ao1Var.getClass();
        if (collection.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Iterable iterable = ((c01) it.next()).h;
            if (iterable == null) {
                iterable = c5b.a;
            }
            z75.t(arrayList, iterable);
        }
        ArrayList g0 = CollectionsKt.g0(collection, arrayList);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = g0.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((c01) next).a)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(ghh.P((c01) it3.next()));
        }
        z(arrayList3, ao1Var);
    }

    public void z(List list, ao1 ao1Var) {
        list.getClass();
        ao1Var.getClass();
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            x((u51) CollectionsKt.Q(list));
        } else {
            pd.U(list, new j94(this, 1), ao1Var, (androidx.fragment.app.y) this.e, pd.t(new qzm[0]));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(g0 g0Var, h0 h0Var, Map map, com.yandex.plus.acquisition.sdk.common.api.di.b bVar, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, kotlinx.coroutines.a aVar2, Function0 function0, Function1 function1, com.yandex.passport.internal.ui.bouncer.model.middleware.o oVar, y yVar) {
        this.a = 10;
        g0Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        yVar.getClass();
        this.b = g0Var;
        this.c = h0Var;
        this.d = map;
        this.e = bVar;
        this.f = aVar;
        this.g = aVar2;
        this.h = function0;
        this.i = (ezc) function1;
        this.j = oVar;
        this.k = yVar;
    }

    public m(String str, qdc qdcVar, xiu xiuVar, xiu xiuVar2, ime imeVar, s1 s1Var, nsh nshVar, tf6 tf6Var, gag gagVar, Context context) {
        this.a = 5;
        s1Var.getClass();
        context.getClass();
        this.b = str;
        this.c = qdcVar;
        this.d = xiuVar;
        this.e = xiuVar2;
        this.f = imeVar;
        this.g = s1Var;
        this.h = nshVar;
        this.i = tf6Var;
        this.j = gagVar;
        this.k = context;
    }

    public m(Activity activity, com.yandex.passport.sloth.ui.string.b bVar, q qVar, com.yandex.passport.common.coroutine.e eVar, d dVar, com.yandex.passport.sloth.ui.l lVar, o oVar, com.yandex.passport.common.common.a aVar, p pVar, agv agvVar, com.yandex.passport.sloth.dependencies.i iVar) {
        this.a = 0;
        activity.getClass();
        bVar.getClass();
        qVar.getClass();
        eVar.getClass();
        dVar.getClass();
        lVar.getClass();
        oVar.getClass();
        aVar.getClass();
        pVar.getClass();
        agvVar.getClass();
        iVar.getClass();
        this.b = activity;
        this.c = bVar;
        this.d = qVar;
        this.e = dVar;
        this.f = lVar;
        this.g = oVar;
        this.h = aVar;
        this.i = pVar;
        this.j = agvVar;
        this.k = iVar;
    }

    public m(com.yandex.plus.paymentsdk.internal.a aVar, com.yandex.plus.core.debug.panel.internal.utils.resource.a aVar2, Context context, com.yandex.plus.core.data.pay.d dVar, String str, String str2, String str3, kotlinx.coroutines.a aVar3) {
        this.a = 13;
        aVar.getClass();
        context.getClass();
        aVar3.getClass();
        this.b = aVar;
        this.c = aVar2;
        this.d = context;
        this.e = dVar;
        this.f = str;
        this.g = str2;
        this.h = str3;
        tf6 e = gld.e(aVar3);
        com.yandex.plus.core.data.pay.p pVar = com.yandex.plus.core.data.pay.p.INSTANCE;
        xdr a = ydr.a(pVar);
        this.i = a;
        this.j = new fkn(a);
        this.k = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(29, this));
        a.l(pVar);
        x97.y(e, null, null, new com.yandex.plus.pay.ui.core.debug.internal.ui.form.b(this, null, 11), 3);
    }

    public m(com.yandex.plus.paymentsdk.internal.a aVar, Context context, com.yandex.plus.core.data.pay.d dVar, String str, String str2, String str3, com.yandex.plus.paymentsdk.internal.common.a aVar2, kotlinx.coroutines.a aVar3) {
        this.a = 12;
        aVar.getClass();
        context.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.b = aVar;
        this.c = context;
        this.d = dVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = aVar2;
        tf6 e = gld.e(aVar3);
        com.yandex.plus.core.data.pay.p pVar = com.yandex.plus.core.data.pay.p.INSTANCE;
        xdr a = ydr.a(pVar);
        this.i = a;
        this.j = new fkn(a);
        this.k = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(28, this));
        a.l(pVar);
        x97.y(e, null, null, new com.yandex.plus.pay.ui.core.debug.internal.ui.form.b(this, null, 10), 3);
    }

    public /* synthetic */ m() {
        this.a = 1;
    }

    public m(qg qgVar, qg qgVar2, qg qgVar3, cd6 cd6Var, gso gsoVar, og ogVar, g0q g0qVar, qg qgVar4, qg qgVar5, ArrayList arrayList) {
        this.a = 3;
        this.b = qgVar;
        this.c = qgVar2;
        this.d = qgVar3;
        this.e = cd6Var;
        this.f = gsoVar;
        this.g = ogVar;
        this.h = g0qVar;
        this.i = qgVar4;
        this.j = qgVar5;
        this.k = arrayList;
    }

    public m(final jac jacVar, g8c g8cVar, epk epkVar, rus rusVar, Set set, y9w y9wVar, klx klxVar) {
        this.a = 6;
        rusVar.getClass();
        set.getClass();
        this.b = g8cVar;
        this.c = epkVar;
        this.d = rusVar;
        this.e = set;
        final int i = 0;
        this.f = btf.b(new Function0() { // from class: jok
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (l0t) ((jyr) jacVar.a).getValue();
                    case 1:
                        return (yr) ((jyr) jacVar.b).getValue();
                    case 2:
                        return (go1) ((jyr) jacVar.c).getValue();
                    case 3:
                        return jacVar.j();
                    case 4:
                        return (elm) ((jyr) jacVar.e).getValue();
                    default:
                        return (b8u) ((jyr) jacVar.g).getValue();
                }
            }
        });
        final int i2 = 1;
        this.g = btf.b(new Function0() { // from class: jok
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (l0t) ((jyr) jacVar.a).getValue();
                    case 1:
                        return (yr) ((jyr) jacVar.b).getValue();
                    case 2:
                        return (go1) ((jyr) jacVar.c).getValue();
                    case 3:
                        return jacVar.j();
                    case 4:
                        return (elm) ((jyr) jacVar.e).getValue();
                    default:
                        return (b8u) ((jyr) jacVar.g).getValue();
                }
            }
        });
        final int i3 = 2;
        this.h = btf.b(new Function0() { // from class: jok
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (l0t) ((jyr) jacVar.a).getValue();
                    case 1:
                        return (yr) ((jyr) jacVar.b).getValue();
                    case 2:
                        return (go1) ((jyr) jacVar.c).getValue();
                    case 3:
                        return jacVar.j();
                    case 4:
                        return (elm) ((jyr) jacVar.e).getValue();
                    default:
                        return (b8u) ((jyr) jacVar.g).getValue();
                }
            }
        });
        final int i4 = 3;
        this.i = btf.b(new Function0() { // from class: jok
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return (l0t) ((jyr) jacVar.a).getValue();
                    case 1:
                        return (yr) ((jyr) jacVar.b).getValue();
                    case 2:
                        return (go1) ((jyr) jacVar.c).getValue();
                    case 3:
                        return jacVar.j();
                    case 4:
                        return (elm) ((jyr) jacVar.e).getValue();
                    default:
                        return (b8u) ((jyr) jacVar.g).getValue();
                }
            }
        });
        final int i5 = 4;
        this.j = btf.b(new Function0() { // from class: jok
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return (l0t) ((jyr) jacVar.a).getValue();
                    case 1:
                        return (yr) ((jyr) jacVar.b).getValue();
                    case 2:
                        return (go1) ((jyr) jacVar.c).getValue();
                    case 3:
                        return jacVar.j();
                    case 4:
                        return (elm) ((jyr) jacVar.e).getValue();
                    default:
                        return (b8u) ((jyr) jacVar.g).getValue();
                }
            }
        });
        final int i6 = 5;
        this.k = btf.b(new Function0() { // from class: jok
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return (l0t) ((jyr) jacVar.a).getValue();
                    case 1:
                        return (yr) ((jyr) jacVar.b).getValue();
                    case 2:
                        return (go1) ((jyr) jacVar.c).getValue();
                    case 3:
                        return jacVar.j();
                    case 4:
                        return (elm) ((jyr) jacVar.e).getValue();
                    default:
                        return (b8u) ((jyr) jacVar.g).getValue();
                }
            }
        });
    }

    public m(com.yandex.passport.data.network.l lVar, a1 a1Var, a1 a1Var2, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.home.internal.di.f fVar2) {
        this.a = 11;
        this.b = fVar2;
        this.c = new com.yandex.plus.home.graphql.panel.mappers.shortcut.d(fVar);
        this.d = new com.yandex.plus.bdui.plus.content.controller.f(lVar, fVar, a1Var);
        this.e = new com.yandex.plus.home.graphql.panel.mappers.shortcut.d(fVar);
        this.f = new com.yandex.plus.home.graphql.panel.mappers.shortcut.d(fVar);
        this.g = new com.yandex.plus.home.graphql.panel.mappers.shortcut.d(fVar);
        this.h = new com.yandex.plus.home.graphql.panel.mappers.shortcut.d(fVar);
        this.i = new com.yandex.plus.home.graphql.panel.mappers.shortcut.d(fVar, a1Var);
        this.j = new com.yandex.plus.home.graphql.panel.mappers.shortcut.d(fVar);
        this.k = btf.b(new com.yandex.plus.home.graphql.configuration.a(3));
    }

    public m(Context context, jyr jyrVar, i0j i0jVar, oou oouVar, suk sukVar, guu guuVar, e2l e2lVar, it0 it0Var, kou kouVar, rsh rshVar) {
        this.a = 8;
        this.b = context;
        this.c = jyrVar;
        this.d = i0jVar;
        this.e = oouVar;
        this.f = new muu(sukVar);
        this.g = guuVar;
        this.h = new ryu(e2lVar);
        this.i = new pv9(4, it0Var);
        this.j = kouVar == null ? jou.a : kouVar;
        this.k = rshVar;
    }

    public m(PlaybackScope playbackScope, Function0 function0, Context context, androidx.fragment.app.y yVar, ru0 ru0Var, int i) {
        this.a = 2;
        ru0Var = (i & 32) != 0 ? ru0.NONE : ru0Var;
        playbackScope.getClass();
        function0.getClass();
        context.getClass();
        yVar.getClass();
        this.b = playbackScope;
        this.c = function0;
        this.d = context;
        this.e = yVar;
        this.f = ru0Var;
        this.g = new j94(this, 0);
        bdt I = hag.I(i1h.class);
        l18 l18Var = l18.b;
        this.h = l18Var.b(I, true);
        this.i = l18Var.b(hag.I(kt6.class), true);
        this.j = l18Var.b(hag.I(mvp.class), true);
        this.k = l18Var.b(hag.I(yk.class), true);
    }

    public m(wpi wpiVar) {
        this.a = 7;
        this.b = wpiVar;
        eqi eqiVar = new eqi(new fun[16]);
        this.c = eqiVar;
        this.d = eqiVar;
        this.e = new eqi(new Object[16]);
        this.f = new eqi(new Function0[16]);
        this.h = new ArrayList();
        this.i = new roi();
        this.j = new roi();
    }

    public m(lah lahVar) {
        this.a = 9;
        lahVar.getClass();
        this.b = lahVar;
    }
}
