package defpackage;

import android.webkit.WebView;
import androidx.compose.foundation.lazy.a;
import androidx.fragment.app.y;
import com.yandex.passport.api.h;
import com.yandex.passport.api.impl.b;
import com.yandex.passport.api.q;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.properties.d;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g3(qnq qnqVar, zl zlVar, rm rmVar) {
        this.a = 1;
        this.b = qnqVar;
        this.c = zlVar;
        this.d = rmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0552  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        hr hrVar;
        lnu lnuVar;
        int i;
        opf opfVar;
        wjb wjbVar;
        int i2 = 12;
        int i3 = 10;
        int i4 = 9;
        int i5 = 14;
        int i6 = 5;
        int i7 = 4;
        int i8 = 2;
        int i9 = 3;
        Continuation continuation = null;
        final int i10 = 0;
        final int i11 = 1;
        switch (this.a) {
            case 0:
                w3 w3Var = (w3) this.c;
                ozw ozwVar = (ozw) this.d;
                qnq qnqVar = (qnq) this.b;
                exa exaVar = (exa) obj;
                exaVar.getClass();
                return new l3(w3Var, ozwVar, qnqVar.c, exaVar);
            case 1:
                qnq qnqVar2 = (qnq) this.b;
                zl zlVar = (zl) this.c;
                rm rmVar = (rm) this.d;
                hjl hjlVar = (hjl) obj;
                hjlVar.getClass();
                qyf qyfVar = qnqVar2.c;
                ((yl) zlVar.b).getClass();
                hn5 hn5Var = qnqVar2.b;
                y yVar = qnqVar2.a;
                hn5Var.getClass();
                yVar.getClass();
                osh oshVar = new osh();
                oshVar.a = hn5Var;
                oshVar.b = yVar;
                oshVar.c = l18.b.b(hag.I(yk.class), true);
                return new am(rmVar, oshVar, qyfVar, hjlVar);
            case 2:
                mr mrVar = (mr) this.c;
                hr hrVar2 = (hr) this.d;
                mm6 mm6Var = (mm6) this.b;
                n9b n9bVar = (n9b) obj;
                n9bVar.getClass();
                ubi ubiVar = n9bVar.a;
                if (Intrinsics.d(mrVar, jr.a) || Intrinsics.d(mrVar, kr.a)) {
                    lg3.A(n9bVar);
                } else {
                    if (!(mrVar instanceof lr)) {
                        b6e.s();
                        return null;
                    }
                    lr lrVar = (lr) mrVar;
                    boolean z = lrVar.f;
                    xbb xbbVar = lrVar.a;
                    if (z) {
                        nt0.m(n9bVar, xbbVar, hrVar2.c(mm6Var));
                    } else {
                        xv.n(n9bVar, xbbVar);
                    }
                    ild.e(n9bVar, lrVar.b, new m5(1, hrVar2, hr.class, "onArtistClick", "onArtistClick(Lru/yandex/music/data/domainitem/ArtistDomainItem;)V", 0, 6));
                    qld.h(n9bVar, lrVar.e);
                    if (!z && (lnuVar = lrVar.c) != null) {
                        o5g.p(n9bVar, lnuVar, hrVar2.c(mm6Var));
                    }
                    lg3.D(n9bVar, 16);
                    Iterator it = lrVar.d.iterator();
                    while (it.hasNext()) {
                        int ordinal = ((shi) it.next()).ordinal();
                        if (ordinal == 0) {
                            hrVar = hrVar2;
                            u7g.n(n9bVar, new c3(0, hrVar, hr.class, "onShareClick", "onShareClick()V", 0, 9));
                        } else if (ordinal == 1) {
                            hrVar = hrVar2;
                            ubiVar.a(new wn5(new yah(i10, new c3(0, hrVar, hr.class, "onMarkAllListenedClick", "onMarkAllListenedClick()V", 0, 10)), 411325892, true));
                        } else if (ordinal == 2) {
                            hrVar = hrVar2;
                            ubiVar.a(new wn5(new yah(i11, new c3(0, hrVar, hr.class, "onMarkAllUnlistenedClick", "onMarkAllUnlistenedClick()V", 0, 11)), -1599191022, true));
                        } else if (ordinal == 3) {
                            hrVar = hrVar2;
                            wxf.b(n9bVar, new c3(0, hrVar, hr.class, "onPlayNextClick", "onPlayNextClick()V", 0, 12));
                        } else if (ordinal == 4) {
                            hrVar = hrVar2;
                            up6.a(n9bVar, new c3(0, hrVar, hr.class, "onAddToQueueClick", "onAddToQueueClick()V", 0, 13));
                        } else {
                            if (ordinal != 5) {
                                b6e.s();
                                return null;
                            }
                            hrVar = hrVar2;
                            vq1.f(n9bVar, new c3(0, hrVar, hr.class, "onDevicePickerClick", "onDevicePickerClick()V", 0, 14));
                        }
                        hrVar2 = hrVar;
                    }
                }
                return Unit.a;
            case 3:
                oq oqVar = (oq) this.c;
                kxi kxiVar = (kxi) this.d;
                gt gtVar = (gt) this.b;
                ((is6) obj).getClass();
                return new jt(oqVar, kxiVar, gtVar);
            case 4:
                ArrayList arrayList = (ArrayList) this.c;
                a60 a60Var = (a60) this.d;
                List list = (List) this.b;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vufVar.Z(arrayList.size(), new al(i8, new j3(7), arrayList), new vv(arrayList, 1), new wn5(new t50(arrayList, (Object) a60Var, (Object) list, i10), -1091073711, true));
                return Unit.a;
            case 5:
                fvf fvfVar = (fvf) this.c;
                ov6 ov6Var = (ov6) this.d;
                aqi aqiVar = (aqi) this.b;
                ((jx7) obj).getClass();
                int A = ivf.A(fvfVar) - ((Number) aqiVar.getValue()).intValue();
                if (A <= 100) {
                    if (A < -100) {
                        A = 0;
                    } else {
                        float f = 100;
                        A = (int) (ov6Var.b(fxf.J(A, -f, f, 0.0f, 1.0f)) * f);
                    }
                }
                return new wpe(xv.t(0, A));
            case 6:
                aqi aqiVar2 = (aqi) this.c;
                mm6 mm6Var2 = (mm6) this.d;
                o3k o3kVar = (o3k) this.b;
                b81 b81Var = (b81) obj;
                b81Var.getClass();
                Iterator it2 = ((v71) aqiVar2.getValue()).b.iterator();
                int i12 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (i12 < 0) {
                            u75.n();
                            throw null;
                        }
                        if (((e81) next).a != b81Var) {
                            i12++;
                        }
                    } else {
                        i12 = -1;
                    }
                }
                Integer valueOf = Integer.valueOf(i12);
                if (i12 == -1) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    x97.y(mm6Var2, null, null, new l71(o3kVar, valueOf.intValue(), continuation, i10), 3);
                }
                return Unit.a;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.c;
                b81 b81Var2 = (b81) this.d;
                Function1 function1 = (Function1) this.b;
                vuf vufVar2 = (vuf) obj;
                vufVar2.getClass();
                vufVar2.Z(arrayList2.size(), null, new vv(arrayList2, 6), new wn5(new t50(arrayList2, (Object) b81Var2, (Object) function1, i8), -632812321, true));
                return Unit.a;
            case 8:
                th1 th1Var = (th1) this.c;
                hj1 hj1Var = (hj1) this.d;
                jnq jnqVar = (jnq) this.b;
                pvf pvfVar = (pvf) obj;
                pvfVar.getClass();
                t11[] t11VarArr = t11.a;
                pvfVar.a(new String[]{"ARTIST_DOWNLOADED_TRACKS"}, new oh1(th1Var, i6));
                pvfVar.a(new String[]{"ARTIST_CONNECTIVITY_INFO_OFFLINE"}, new oh1(th1Var, 6));
                pvfVar.a(new String[]{"ARTIST_DOWNLOADED_ALBUMS"}, new hb(24, hj1Var, jnqVar));
                return Unit.a;
            case 9:
                lvf lvfVar = (lvf) this.c;
                Function2 function2 = (Function2) this.d;
                Function2 function22 = (Function2) this.b;
                vuf vufVar3 = (vuf) obj;
                vufVar3.getClass();
                vufVar3.Z(lvfVar.d(), new u8b(i4, lvfVar), new u8b(8, lvfVar), new wn5(new fb1(i9, lvfVar, function2, function22), 2098202294, true));
                vuf.Y(vufVar3, null, new wn5(new sl1(lvfVar, i10), 240852845, true), 3);
                return Unit.a;
            case 10:
                wn1 wn1Var = (wn1) this.c;
                bnd bndVar = (bnd) this.d;
                qnq qnqVar3 = (qnq) this.b;
                hjl hjlVar2 = (hjl) obj;
                hjlVar2.getClass();
                return new wm1(wn1Var, bndVar, qnqVar3.c, hjlVar2);
            case 11:
                dq1 dq1Var = (dq1) this.c;
                je1 je1Var = (je1) this.d;
                y3 y3Var = (y3) this.b;
                hjl hjlVar3 = (hjl) obj;
                hjlVar3.getClass();
                ((qp1) y3Var.b).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new sp1(dq1Var, je1Var, hjlVar3, ((q36) ((byb) qdcVar.C(I)).b(q36.class)).h());
            case 12:
                String str = (String) this.c;
                Long l = (Long) this.d;
                String str2 = (String) this.b;
                d dVar = (d) obj;
                dVar.getClass();
                dVar.c = str;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(le7.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                String str3 = r9k.PRODUCTION.a;
                q qVar = h.b;
                int parseInt = Integer.parseInt(str3);
                qVar.getClass();
                h a = q.a(parseInt);
                if (a == null) {
                    xq0.x("Required value was null.");
                    return null;
                }
                long longValue = l.longValue();
                b a2 = b.a(a.d());
                a2.getClass();
                dVar.a = new z1(a2, longValue);
                str2.getClass();
                dVar.b = str2;
                return Unit.a;
            case 13:
                q32 q32Var = (q32) this.c;
                fq4 fq4Var = (fq4) this.d;
                float f2 = fq4Var.a;
                aqi aqiVar3 = (aqi) this.b;
                Float f3 = (Float) obj;
                float floatValue = f3.floatValue();
                aqiVar3.setValue(f3);
                q32Var.getClass();
                t32 t32Var = q32Var.a;
                t32Var.getClass();
                xdr xdrVar = t32Var.n;
                Object value = xdrVar.getValue();
                v32 v32Var = value instanceof v32 ? (v32) value : null;
                if (v32Var != null) {
                    List list2 = v32Var.b;
                    int size = list2.size();
                    float floatValue2 = (Float.valueOf(fq4Var.b).floatValue() - Float.valueOf(f2).floatValue()) / size;
                    if (1 <= size) {
                        int i13 = 1;
                        while (floatValue > (i13 * floatValue2) + Float.valueOf(f2).floatValue()) {
                            if (i13 != size) {
                                i13++;
                            }
                        }
                        i = i13 - 1;
                        x32 x32Var = v32Var.c;
                        x32 x32Var2 = (x32) list2.get(i);
                        e32 e32Var = t32Var.l;
                        e32Var.getClass();
                        x32Var.getClass();
                        x32Var2.getClass();
                        vnb vnbVar = (vnb) e32Var.c.getValue();
                        xjb xjbVar = xjb.AutoCacheSize;
                        Long a3 = x32Var.c.a();
                        String valueOf2 = String.valueOf(a3 == null ? a3.longValue() : -1L);
                        Long a4 = x32Var2.c.a();
                        vnbVar.b(xjbVar, valueOf2, String.valueOf(a4 != null ? a4.longValue() : -1L));
                        xdrVar.m(null, v32.a(v32Var, false, x32Var2, 3));
                        break;
                    }
                    i = -1;
                    x32 x32Var3 = v32Var.c;
                    x32 x32Var22 = (x32) list2.get(i);
                    e32 e32Var2 = t32Var.l;
                    e32Var2.getClass();
                    x32Var3.getClass();
                    x32Var22.getClass();
                    vnb vnbVar2 = (vnb) e32Var2.c.getValue();
                    xjb xjbVar2 = xjb.AutoCacheSize;
                    Long a32 = x32Var3.c.a();
                    String valueOf22 = String.valueOf(a32 == null ? a32.longValue() : -1L);
                    Long a42 = x32Var22.c.a();
                    vnbVar2.b(xjbVar2, valueOf22, String.valueOf(a42 != null ? a42.longValue() : -1L));
                    xdrVar.m(null, v32.a(v32Var, false, x32Var22, 3));
                }
                return Unit.a;
            case 14:
                ArrayList arrayList3 = (ArrayList) this.c;
                v83 v83Var = (v83) this.d;
                List list3 = (List) this.b;
                vuf vufVar4 = (vuf) obj;
                vufVar4.getClass();
                vufVar4.Z(arrayList3.size(), new al(23, new t83(i10), arrayList3), new vv(arrayList3, 9), new wn5(new t50(arrayList3, (Object) v83Var, (Object) list3, i7), -1091073711, true));
                return Unit.a;
            case 15:
                tf3 tf3Var = (tf3) this.c;
                String str4 = (String) this.d;
                String str5 = (String) this.b;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.r(jfpVar, tf3Var.b);
                wfp.k(jfpVar, str4);
                if (!tf3Var.c) {
                    str5 = "";
                }
                wfp.s(jfpVar, str5);
                return Unit.a;
            case 16:
                ArrayList arrayList4 = (ArrayList) this.c;
                i10 i10Var = (i10) this.d;
                pu4 pu4Var = (pu4) this.b;
                vuf vufVar5 = (vuf) obj;
                vufVar5.getClass();
                vufVar5.Z(arrayList4.size(), new al(29, new t83(8), arrayList4), new vv(arrayList4, 10), new wn5(new t50(arrayList4, (Object) i10Var, (Object) pu4Var, i6), -1091073711, true));
                return Unit.a;
            case 17:
                y25 y25Var = (y25) this.c;
                o3k o3kVar2 = (o3k) this.d;
                mm6 mm6Var3 = (mm6) this.b;
                vuf vufVar6 = (vuf) obj;
                vufVar6.getClass();
                List list4 = y25Var.a;
                vufVar6.Z(list4.size(), null, new bl(11, list4, false), new wn5(new u25(list4, o3kVar2, mm6Var3, i10), -1091073711, true));
                return Unit.a;
            case 18:
                hvb hvbVar = (hvb) this.c;
                iil iilVar = (iil) this.d;
                aqi aqiVar4 = (aqi) this.b;
                vuf vufVar7 = (vuf) obj;
                vufVar7.getClass();
                vuf.Y(vufVar7, null, new wn5(new mo5(hvbVar, i9), 1433988969, true), 3);
                vuf.Y(vufVar7, null, new wn5(new ar(21, iilVar, aqiVar4), 1745003090, true), 3);
                return Unit.a;
            case 19:
                WebView webView = (WebView) this.c;
                WebView webView2 = (WebView) this.d;
                aqi aqiVar5 = (aqi) this.b;
                ((oa8) obj).getClass();
                webView.stopLoading();
                return new pc(webView2, aqiVar5, 1);
            case 20:
                String str6 = (String) this.c;
                y26 y26Var = (y26) this.d;
                d36 d36Var = (d36) this.b;
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.q(jfpVar2, 0);
                wfp.k(jfpVar2, str6);
                wfp.h(jfpVar2, new v26(y26Var, d36Var, 0));
                return Unit.a;
            case 21:
                ArrayList<j46> arrayList5 = (ArrayList) this.c;
                aqi aqiVar6 = (aqi) this.d;
                aqi aqiVar7 = (aqi) this.b;
                opf opfVar2 = (opf) obj;
                opfVar2.getClass();
                ou3 ou3Var = opfVar2.a;
                aqiVar6.setValue(Float.valueOf(nmq.d(ou3Var.e())));
                aqiVar7.setValue(Float.valueOf(nmq.b(ou3Var.e())));
                opfVar2.a();
                for (j46 j46Var : arrayList5) {
                    n46 n46Var = j46Var.b;
                    long j = j46Var.c;
                    if (n46Var instanceof l46) {
                        opfVar = opfVar2;
                        jpa.D0(opfVar, j46Var.a, ((l46) n46Var).a, j, 0.0f, null, 0, 120);
                    } else {
                        opfVar = opfVar2;
                        if (!(n46Var instanceof m46)) {
                            b6e.s();
                            return null;
                        }
                        float f4 = j46Var.d;
                        float e = enj.e(j);
                        long j2 = ((m46) n46Var).a;
                        float f5 = 2;
                        long i14 = swf.i((nmq.d(j2) / f5) + e, (nmq.b(j2) / f5) + enj.f(j));
                        nsh nshVar = ou3Var.b;
                        long B = nshVar.B();
                        nshVar.s().r();
                        try {
                            ((xzi) nshVar.b).e0(f4, i14);
                            jpa.B(opfVar, j46Var.a, j46Var.c, ((m46) n46Var).a, 0.0f, null, 0, 120);
                        } finally {
                            vz1.A(nshVar, B);
                        }
                    }
                    opfVar2 = opfVar;
                }
                return Unit.a;
            case 22:
                List list5 = (List) this.c;
                Function1 function12 = (Function1) this.d;
                Function1 function13 = (Function1) this.b;
                vuf vufVar8 = (vuf) obj;
                vufVar8.getClass();
                vufVar8.Z(list5.size(), new sv4(i5, new fp5(23), list5), new bl(15, list5, false), new wn5(new t50(list5, function12, function13, 8), -1091073711, true));
                return Unit.a;
            case 23:
                xqn xqnVar = (xqn) this.c;
                tqn tqnVar = (tqn) this.d;
                Function1 function14 = (Function1) this.b;
                if (!Intrinsics.d(obj, xqnVar.a) || !tqnVar.a) {
                    xqnVar.a = obj;
                    tqnVar.a = true;
                    function14.invoke(obj);
                }
                return Unit.a;
            case 24:
                final ArrayList arrayList6 = (ArrayList) this.c;
                final ArrayList arrayList7 = (ArrayList) this.d;
                final tea teaVar = (tea) this.b;
                vuf vufVar9 = (vuf) obj;
                vufVar9.getClass();
                if (!arrayList6.isEmpty()) {
                    vuf.Y(vufVar9, "downloaded_audiobooks_title", new wn5(new pyc() { // from class: pea
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i15 = i10;
                            kjn kjnVar = gq5.a;
                            ArrayList arrayList8 = arrayList6;
                            final tea teaVar2 = teaVar;
                            final int i16 = 1;
                            final int i17 = 0;
                            switch (i15) {
                                case 0:
                                    hq5 hq5Var = (hq5) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    ((a) obj2).getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        vci vciVar = vci.a;
                                        yci a5 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(vciVar, 0.0f, 8, 1), "downloaded_audiobooks_title");
                                        String M = rvf.M(R.string.downloaded_audiobooks_block, oq5Var);
                                        boolean h = oq5Var.h(teaVar2);
                                        Object K = oq5Var.K();
                                        if (h || K == kjnVar) {
                                            K = new Function0() { // from class: qea
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i16) {
                                                        case 0:
                                                            ((vni) teaVar2.c.a).b(new s83());
                                                            break;
                                                        default:
                                                            ((vni) teaVar2.c.a).b(new t40());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        irf.h(M, a5, null, null, arrayList8.size() > 8 ? (Function0) K : null, false, null, false, null, oq5Var, 48, 492);
                                        yci a6 = androidx.compose.ui.platform.a.a(vciVar, "downloaded_audiobooks_carousel");
                                        List q0 = CollectionsKt.q0(arrayList8, 8);
                                        Object K2 = oq5Var.K();
                                        if (K2 == kjnVar) {
                                            K2 = new rea(0);
                                            oq5Var.k0(K2);
                                        }
                                        up6.i(q0, a6, (Function2) K2, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(-1326183982, new t31(8, teaVar2), oq5Var), oq5Var, 432, 384, 4088);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                default:
                                    hq5 hq5Var2 = (hq5) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    ((a) obj2).getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        yci a7 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 28, 0.0f, 4, 5), "downloaded_chapters_title");
                                        String M2 = rvf.M(R.string.downloaded_audiobooks_episodes, oq5Var2);
                                        boolean h2 = oq5Var2.h(teaVar2);
                                        Object K3 = oq5Var2.K();
                                        if (h2 || K3 == kjnVar) {
                                            K3 = new Function0() { // from class: qea
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i17) {
                                                        case 0:
                                                            ((vni) teaVar2.c.a).b(new s83());
                                                            break;
                                                        default:
                                                            ((vni) teaVar2.c.a).b(new t40());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K3);
                                        }
                                        irf.h(M2, a7, null, null, arrayList8.size() > 5 ? (Function0) K3 : null, false, null, false, null, oq5Var2, 48, 492);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, -203314343, true), 2);
                }
                if (!arrayList7.isEmpty()) {
                    vuf.Y(vufVar9, "downloaded_chapters_title", new wn5(new pyc() { // from class: pea
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i15 = i11;
                            kjn kjnVar = gq5.a;
                            ArrayList arrayList8 = arrayList7;
                            final tea teaVar2 = teaVar;
                            final int i16 = 1;
                            final int i17 = 0;
                            switch (i15) {
                                case 0:
                                    hq5 hq5Var = (hq5) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    ((a) obj2).getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        vci vciVar = vci.a;
                                        yci a5 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(vciVar, 0.0f, 8, 1), "downloaded_audiobooks_title");
                                        String M = rvf.M(R.string.downloaded_audiobooks_block, oq5Var);
                                        boolean h = oq5Var.h(teaVar2);
                                        Object K = oq5Var.K();
                                        if (h || K == kjnVar) {
                                            K = new Function0() { // from class: qea
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i16) {
                                                        case 0:
                                                            ((vni) teaVar2.c.a).b(new s83());
                                                            break;
                                                        default:
                                                            ((vni) teaVar2.c.a).b(new t40());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        irf.h(M, a5, null, null, arrayList8.size() > 8 ? (Function0) K : null, false, null, false, null, oq5Var, 48, 492);
                                        yci a6 = androidx.compose.ui.platform.a.a(vciVar, "downloaded_audiobooks_carousel");
                                        List q0 = CollectionsKt.q0(arrayList8, 8);
                                        Object K2 = oq5Var.K();
                                        if (K2 == kjnVar) {
                                            K2 = new rea(0);
                                            oq5Var.k0(K2);
                                        }
                                        up6.i(q0, a6, (Function2) K2, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(-1326183982, new t31(8, teaVar2), oq5Var), oq5Var, 432, 384, 4088);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                default:
                                    hq5 hq5Var2 = (hq5) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    ((a) obj2).getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        yci a7 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 28, 0.0f, 4, 5), "downloaded_chapters_title");
                                        String M2 = rvf.M(R.string.downloaded_audiobooks_episodes, oq5Var2);
                                        boolean h2 = oq5Var2.h(teaVar2);
                                        Object K3 = oq5Var2.K();
                                        if (h2 || K3 == kjnVar) {
                                            K3 = new Function0() { // from class: qea
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i17) {
                                                        case 0:
                                                            ((vni) teaVar2.c.a).b(new s83());
                                                            break;
                                                        default:
                                                            ((vni) teaVar2.c.a).b(new t40());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K3);
                                        }
                                        irf.h(M2, a7, null, null, arrayList8.size() > 5 ? (Function0) K3 : null, false, null, false, null, oq5Var2, 48, 492);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, -879154046, true), 2);
                    List q0 = CollectionsKt.q0(arrayList7, 5);
                    vufVar9.Z(q0.size(), new sea(i10, new fp5(29), q0), new bl(17, q0, false), new wn5(new cl(i2, q0, teaVar), -1091073711, true));
                }
                return Unit.a;
            case 25:
                List list6 = (List) this.c;
                o3k o3kVar3 = (o3k) this.d;
                mm6 mm6Var4 = (mm6) this.b;
                vuf vufVar10 = (vuf) obj;
                vufVar10.getClass();
                vufVar10.Z(list6.size(), null, new bl(19, list6, false), new wn5(new u25(list6, o3kVar3, mm6Var4, i11), -1091073711, true));
                return Unit.a;
            case 26:
                final ArrayList arrayList8 = (ArrayList) this.c;
                final ArrayList arrayList9 = (ArrayList) this.d;
                final xha xhaVar = (xha) this.b;
                vuf vufVar11 = (vuf) obj;
                vufVar11.getClass();
                if (!arrayList8.isEmpty()) {
                    vuf.Y(vufVar11, "downloaded_episodes_title", new wn5(new pyc() { // from class: rha
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i15 = i10;
                            kjn kjnVar = gq5.a;
                            ArrayList arrayList10 = arrayList8;
                            final xha xhaVar2 = xhaVar;
                            final int i16 = 1;
                            Object[] objArr = 0;
                            switch (i15) {
                                case 0:
                                    hq5 hq5Var = (hq5) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    ((a) obj2).getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        yci a5 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 8, 0.0f, 4, 5), "downloaded_episodes_title");
                                        String M = rvf.M(R.string.delayed_episodes, oq5Var);
                                        boolean h = oq5Var.h(xhaVar2);
                                        Object K = oq5Var.K();
                                        if (h || K == kjnVar) {
                                            final Object[] objArr2 = objArr == true ? 1 : 0;
                                            K = new Function0() { // from class: sha
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (objArr2) {
                                                        case 0:
                                                            ((vni) xhaVar2.c.a).b(new feb());
                                                            break;
                                                        default:
                                                            ((vni) xhaVar2.c.a).b(new qem());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        irf.h(M, a5, null, null, arrayList10.size() > 5 ? (Function0) K : null, false, null, false, null, oq5Var, 48, 492);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                default:
                                    hq5 hq5Var2 = (hq5) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    ((a) obj2).getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        vci vciVar = vci.a;
                                        yci a6 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 32, 0.0f, 8, 5), "downloaded_podcasts_title");
                                        String M2 = rvf.M(R.string.your_subscriptions, oq5Var2);
                                        boolean h2 = oq5Var2.h(xhaVar2);
                                        Object K2 = oq5Var2.K();
                                        if (h2 || K2 == kjnVar) {
                                            K2 = new Function0() { // from class: sha
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i16) {
                                                        case 0:
                                                            ((vni) xhaVar2.c.a).b(new feb());
                                                            break;
                                                        default:
                                                            ((vni) xhaVar2.c.a).b(new qem());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K2);
                                        }
                                        irf.h(M2, a6, null, null, arrayList10.size() > 8 ? (Function0) K2 : null, false, null, false, null, oq5Var2, 48, 492);
                                        yci a7 = androidx.compose.ui.platform.a.a(vciVar, "downloaded_podcasts_carousel");
                                        List q02 = CollectionsKt.q0(arrayList10, 8);
                                        Object K3 = oq5Var2.K();
                                        if (K3 == kjnVar) {
                                            K3 = new rea(5);
                                            oq5Var2.k0(K3);
                                        }
                                        up6.i(q02, a7, (Function2) K3, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(1010148985, new t31(9, xhaVar2), oq5Var2), oq5Var2, 432, 384, 4088);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, -2039446505, true), 2);
                    List q02 = CollectionsKt.q0(arrayList8, 5);
                    vufVar11.Z(q02.size(), new sea(i8, new rea(i7), q02), new bl(20, q02, false), new wn5(new cl(i5, q02, xhaVar), -1091073711, true));
                }
                if (!arrayList9.isEmpty()) {
                    vuf.Y(vufVar11, "downloaded_podcasts_title", new wn5(new pyc() { // from class: rha
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i15 = i11;
                            kjn kjnVar = gq5.a;
                            ArrayList arrayList10 = arrayList9;
                            final xha xhaVar2 = xhaVar;
                            final int i16 = 1;
                            Object[] objArr = 0;
                            switch (i15) {
                                case 0:
                                    hq5 hq5Var = (hq5) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    ((a) obj2).getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        yci a5 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 8, 0.0f, 4, 5), "downloaded_episodes_title");
                                        String M = rvf.M(R.string.delayed_episodes, oq5Var);
                                        boolean h = oq5Var.h(xhaVar2);
                                        Object K = oq5Var.K();
                                        if (h || K == kjnVar) {
                                            final int objArr2 = objArr == true ? 1 : 0;
                                            K = new Function0() { // from class: sha
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (objArr2) {
                                                        case 0:
                                                            ((vni) xhaVar2.c.a).b(new feb());
                                                            break;
                                                        default:
                                                            ((vni) xhaVar2.c.a).b(new qem());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        irf.h(M, a5, null, null, arrayList10.size() > 5 ? (Function0) K : null, false, null, false, null, oq5Var, 48, 492);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                default:
                                    hq5 hq5Var2 = (hq5) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    ((a) obj2).getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        vci vciVar = vci.a;
                                        yci a6 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 32, 0.0f, 8, 5), "downloaded_podcasts_title");
                                        String M2 = rvf.M(R.string.your_subscriptions, oq5Var2);
                                        boolean h2 = oq5Var2.h(xhaVar2);
                                        Object K2 = oq5Var2.K();
                                        if (h2 || K2 == kjnVar) {
                                            K2 = new Function0() { // from class: sha
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i16) {
                                                        case 0:
                                                            ((vni) xhaVar2.c.a).b(new feb());
                                                            break;
                                                        default:
                                                            ((vni) xhaVar2.c.a).b(new qem());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K2);
                                        }
                                        irf.h(M2, a6, null, null, arrayList10.size() > 8 ? (Function0) K2 : null, false, null, false, null, oq5Var2, 48, 492);
                                        yci a7 = androidx.compose.ui.platform.a.a(vciVar, "downloaded_podcasts_carousel");
                                        List q022 = CollectionsKt.q0(arrayList10, 8);
                                        Object K3 = oq5Var2.K();
                                        if (K3 == kjnVar) {
                                            K3 = new rea(5);
                                            oq5Var2.k0(K3);
                                        }
                                        up6.i(q022, a7, (Function2) K3, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(1010148985, new t31(9, xhaVar2), oq5Var2), oq5Var2, 432, 384, 4088);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, -1125478464, true), 2);
                }
                return Unit.a;
            case 27:
                xia xiaVar = (xia) this.c;
                dja djaVar = (dja) this.d;
                spd spdVar = (spd) this.b;
                ((ahs) obj).getClass();
                jyr jyrVar = xiaVar.a.a;
                djaVar.getClass();
                spdVar.getClass();
                rmb rmbVar = xiaVar.b;
                yia yiaVar = djaVar.a;
                int ordinal2 = yiaVar.ordinal();
                if (ordinal2 == 0) {
                    wjbVar = wjb.DownloadedPlaylistListScreen;
                } else if (ordinal2 == 1) {
                    wjbVar = wjb.DownloadedAlbumListScreen;
                } else if (ordinal2 == 2) {
                    wjbVar = wjb.DownloadedAudiobooksLandingScreen;
                } else if (ordinal2 == 3) {
                    wjbVar = wjb.DownloadedPodcastLandingScreen;
                } else {
                    if (ordinal2 != 4) {
                        b6e.s();
                        return null;
                    }
                    wjbVar = wjb.DownloadedForKidsLandingScreen;
                }
                rmb.j(rmbVar, wjbVar, tt0.u(djaVar.b, spdVar), null, 12);
                int ordinal3 = yiaVar.ordinal();
                if (ordinal3 == 0) {
                    np2 np2Var = (np2) jyrVar.getValue();
                    if (np2Var != null) {
                        int i15 = CollectionMainActivity.v0;
                        np2Var.startActivity(men.B(np2Var, v35.r));
                    }
                } else if (ordinal3 == 1) {
                    np2 np2Var2 = (np2) jyrVar.getValue();
                    if (np2Var2 != null) {
                        int i16 = CollectionMainActivity.v0;
                        np2Var2.startActivity(men.B(np2Var2, v35.s));
                    }
                } else if (ordinal3 == 2) {
                    np2 np2Var3 = (np2) jyrVar.getValue();
                    if (np2Var3 != null) {
                        int i17 = CollectionMainActivity.v0;
                        np2Var3.startActivity(men.B(np2Var3, v35.t));
                    }
                } else if (ordinal3 == 3) {
                    np2 np2Var4 = (np2) jyrVar.getValue();
                    if (np2Var4 != null) {
                        int i18 = CollectionMainActivity.v0;
                        np2Var4.startActivity(men.B(np2Var4, v35.p));
                    }
                } else {
                    if (ordinal3 != 4) {
                        b6e.s();
                        return null;
                    }
                    np2 np2Var5 = (np2) jyrVar.getValue();
                    if (np2Var5 != null) {
                        int i19 = CollectionMainActivity.v0;
                        np2Var5.startActivity(men.B(np2Var5, v35.q));
                    }
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                mfh mfhVar = (mfh) this.c;
                soa soaVar = (soa) this.d;
                ksk kskVar = (ksk) this.b;
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                boolean F = mfhVar.F();
                ja0 ja0Var = soaVar.o;
                float d = F ? ja0Var.c().d(soaVar.o.i.getValue()) : ja0Var.g();
                bxj bxjVar = soaVar.q;
                float f6 = bxjVar == bxj.b ? d : 0.0f;
                if (bxjVar != bxj.a) {
                    d = 0.0f;
                }
                jskVar.d(kskVar, eeh.b(f6), eeh.b(d), 0.0f);
                return Unit.a;
            default:
                ArrayList arrayList10 = (ArrayList) this.c;
                heb hebVar = (heb) this.d;
                List list7 = (List) this.b;
                vuf vufVar12 = (vuf) obj;
                vufVar12.getClass();
                vufVar12.Z(arrayList10.size(), new sea(i7, new rea(i3), arrayList10), new vv(arrayList10, 14), new wn5(new t50(arrayList10, (Object) hebVar, (Object) list7, i4), -1091073711, true));
                return Unit.a;
        }
    }

    public /* synthetic */ g3(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
