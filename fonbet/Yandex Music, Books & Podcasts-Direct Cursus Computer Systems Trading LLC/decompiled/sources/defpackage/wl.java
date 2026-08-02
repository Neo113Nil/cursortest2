package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class wl implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wl(dn1 dn1Var, vm1 vm1Var, qkl qklVar, yci yciVar, int i) {
        this.a = 18;
        this.b = dn1Var;
        this.c = vm1Var;
        this.e = qklVar;
        this.d = yciVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x052e  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ArrayList arrayList;
        boolean booleanValue;
        gb3 db3Var;
        k6l k6lVar;
        uwu uwuVar;
        qwu qwuVar;
        int i2 = this.a;
        int i3 = 24;
        vci vciVar = vci.a;
        final int i4 = 4;
        final int i5 = 5;
        Object obj3 = gq5.a;
        final int i6 = 1;
        final int i7 = 3;
        final int i8 = 2;
        final int i9 = 0;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i2) {
            case 0:
                xl xlVar = (xl) obj7;
                boolean z = xlVar.b;
                am amVar = (am) obj6;
                nm nmVar = (nm) obj5;
                qkl qklVar = (qkl) obj4;
                hq5 hq5Var = (hq5) obj;
                if ((3 & ((Integer) obj2).intValue()) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean h = oq5Var2.h(amVar) | oq5Var2.h(nmVar) | oq5Var2.h(xlVar) | oq5Var2.h(qklVar);
                Object K = oq5Var2.K();
                if (h || K == obj3) {
                    Object yeVar = new ye(amVar, nmVar, xlVar, qklVar, 1);
                    oq5Var2.k0(yeVar);
                    K = yeVar;
                }
                ff7.a(0, oq5Var2, ksw.D(vciVar, rvf.M(z ? R.string.add_remove_button_added_content_description : R.string.add_remove_button_not_added_content_description, oq5Var2), null), (Function0) K, z);
            case 1:
                klu kluVar = (klu) obj7;
                dup dupVar = (dup) obj6;
                uoi uoiVar = (uoi) obj5;
                qo6 qo6Var = (qo6) obj4;
                hq5 hq5Var2 = (hq5) obj;
                if ((3 & ((Integer) obj2).intValue()) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                String str = kluVar.c;
                if (str != null) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    oq5Var4.Z(614250873);
                    j66.q(str, ild.C(-1156650492, new qp(qo6Var, 0), oq5Var4), dupVar, null, uoiVar, oq5Var4, 48);
                    oq5Var4.p(false);
                } else {
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    oq5Var5.Z(597719162);
                    oq5Var5.p(false);
                }
            case 2:
                ((Integer) obj2).getClass();
                gld.a((mr) obj7, (bci) obj6, (hr) obj5, (yci) obj4, (hq5) obj, rvf.R(3137));
                break;
            case 3:
                bci bciVar = (bci) obj7;
                gy7 gy7Var = (gy7) obj6;
                ht htVar = (ht) obj5;
                sai saiVar = (sai) obj4;
                hq5 hq5Var3 = (hq5) obj;
                if ((3 & ((Integer) obj2).intValue()) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var3;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                yd5.f(null, null, bciVar, null, null, false, false, false, 0L, 0L, 0.0f, ild.C(2107977, new xk(i8, gy7Var, htVar, saiVar), hq5Var3), hq5Var3, 4096, 4087);
            case 4:
                ((Integer) obj2).getClass();
                irf.c((Function0) obj7, (rab) obj6, (yci) obj5, (Function0) obj4, (hq5) obj, rvf.R(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                xv.w((List) obj7, (j00) obj6, (jab) obj5, (yci) obj4, (hq5) obj, rvf.R(3073));
                break;
            case 6:
                ((Integer) obj2).getClass();
                wdp.I((iwm) obj7, (jwm) obj6, (pu0) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                sk3.a((fvf) obj7, (yci) obj6, (q0k) obj5, (wn5) obj4, (hq5) obj, rvf.R(3505));
                break;
            case 8:
                ((Integer) obj2).getClass();
                cxb.a((g21) obj7, (bci) obj6, (b21) obj5, (yci) obj4, (hq5) obj, rvf.R(3137));
                break;
            case 9:
                i3 i3Var = (i3) obj7;
                z31 z31Var = (z31) obj6;
                bnd bndVar = (bnd) obj5;
                Context context = (Context) obj4;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                oq5 oq5Var8 = (oq5) hq5Var4;
                boolean f = oq5Var8.f(z31Var) | oq5Var8.f(bndVar) | oq5Var8.f(context);
                Object K2 = oq5Var8.K();
                if (f || K2 == obj3) {
                    K2 = new s31((p31) i3Var.b, z31Var, z31Var.d, bndVar, context);
                    oq5Var8.k0(K2);
                }
                ((wn5) i3Var.d).invoke(z31Var.g, (s31) K2, hq5Var4, 0);
            case 10:
                fvf fvfVar = (fvf) obj7;
                vm vmVar = (vm) obj6;
                final t41 t41Var = (t41) obj5;
                final d41 d41Var = (d41) obj4;
                hq5 hq5Var5 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var5;
                if (oq5Var9.P(intValue & 1, (intValue & 3) != 2)) {
                    yci a = a.a(vciVar, "artist_concerts_list");
                    boolean f2 = oq5Var9.f(t41Var) | oq5Var9.h(d41Var);
                    Object K3 = oq5Var9.K();
                    if (f2 || K3 == obj3) {
                        final int i10 = 0;
                        K3 = new Function1() { // from class: j41
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                vuf vufVar = (vuf) obj8;
                                switch (i10) {
                                    case 0:
                                        vufVar.getClass();
                                        List list = ((r41) t41Var).b;
                                        vufVar.Z(list.size(), null, new bl(3, list, false), new wn5(new l41(list, d41Var, 0), -1091073711, true));
                                        break;
                                    default:
                                        vufVar.getClass();
                                        List list2 = ((r41) t41Var).b;
                                        vufVar.Z(list2.size(), null, new bl(4, list2, false), new wn5(new l41(list2, d41Var, 1), -1091073711, true));
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var9.k0(K3);
                    }
                    weo.f(a, fvfVar, vmVar, null, null, null, false, null, (Function1) K3, oq5Var9, 6, 504);
                } else {
                    oq5Var9.S();
                }
                break;
            case 11:
                fvf fvfVar2 = (fvf) obj7;
                o0k o0kVar = (o0k) obj6;
                final t41 t41Var2 = (t41) obj5;
                final d41 d41Var2 = (d41) obj4;
                hq5 hq5Var6 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var6;
                if (oq5Var10.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    yci a2 = a.a(vciVar, "artist_concerts_list");
                    boolean f3 = oq5Var10.f(t41Var2) | oq5Var10.h(d41Var2);
                    Object K4 = oq5Var10.K();
                    if (f3 || K4 == obj3) {
                        K4 = new Function1() { // from class: j41
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                vuf vufVar = (vuf) obj8;
                                switch (i6) {
                                    case 0:
                                        vufVar.getClass();
                                        List list = ((r41) t41Var2).b;
                                        vufVar.Z(list.size(), null, new bl(3, list, false), new wn5(new l41(list, d41Var2, 0), -1091073711, true));
                                        break;
                                    default:
                                        vufVar.getClass();
                                        List list2 = ((r41) t41Var2).b;
                                        vufVar.Z(list2.size(), null, new bl(4, list2, false), new wn5(new l41(list2, d41Var2, 1), -1091073711, true));
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var10.k0(K4);
                    }
                    weo.f(a2, fvfVar2, o0kVar, null, null, null, false, null, (Function1) K4, oq5Var10, 6, 504);
                } else {
                    oq5Var10.S();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                qwp.a((b81) obj7, (ArrayList) obj6, (Function1) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                vut.a((yi1) obj7, (ka1) obj6, (tvd) obj5, (yci) obj4, (hq5) obj, rvf.R(3073));
                break;
            case 14:
                ((Integer) obj2).getClass();
                zsd.c((dd1) obj7, (wn5) obj6, (Function0) obj5, (yci) obj4, (hq5) obj, rvf.R(49));
                break;
            case 15:
                ((Integer) obj2).getClass();
                xv.d((String) obj7, (List) obj6, (Function1) obj5, (yci) obj4, (hq5) obj, rvf.R(3073));
                break;
            case 16:
                i3 i3Var2 = (i3) obj7;
                bl1 bl1Var = (bl1) obj6;
                rk1 rk1Var = (rk1) obj5;
                qnq qnqVar = (qnq) obj4;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var7;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        break;
                    }
                }
                pk1 pk1Var = (pk1) i3Var2.b;
                oq5 oq5Var12 = (oq5) hq5Var7;
                boolean f4 = oq5Var12.f(qnqVar.b) | oq5Var12.f(bl1Var) | oq5Var12.f(rk1Var);
                Object K5 = oq5Var12.K();
                if (f4 || K5 == obj3) {
                    kxi kxiVar = qnqVar.d;
                    rmb rmbVar = bl1Var.d;
                    pk1Var.getClass();
                    i = 0;
                    K5 = new sk1(kxiVar, bl1Var, rmbVar, rk1Var, new q21(qnqVar, 0), (fdj) pk1Var.c.getValue());
                    oq5Var12.k0(K5);
                } else {
                    i = 0;
                }
                ((wn5) i3Var2.d).invoke(bl1Var.g, (sk1) K5, hq5Var7, Integer.valueOf(i));
            case 17:
                ((Integer) obj2).getClass();
                xl1.e((tmb) obj7, (lvf) obj6, (Function0) obj5, (Function0) obj4, (hq5) obj, rvf.R(73));
                break;
            case 18:
                ((Integer) obj2).getClass();
                on1.a((dn1) obj7, (vm1) obj6, (qkl) obj4, (yci) obj5, (hq5) obj, rvf.R(3081));
                break;
            case 19:
                fvf fvfVar3 = (fvf) obj7;
                o0k o0kVar2 = (o0k) obj6;
                ez1 ez1Var = (ez1) obj5;
                dz1 dz1Var = (dz1) obj4;
                hq5 hq5Var8 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var8;
                if (oq5Var13.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    yci a3 = a.a(d.c(vciVar, 1.0f), "collection_audiobooks_content");
                    boolean f5 = oq5Var13.f(ez1Var) | oq5Var13.h(dz1Var);
                    Object K6 = oq5Var13.K();
                    if (f5 || K6 == obj3) {
                        K6 = new kc(25, ez1Var, dz1Var);
                        oq5Var13.k0(K6);
                    }
                    weo.f(a3, fvfVar3, o0kVar2, null, null, null, false, null, (Function1) K6, oq5Var13, 6, 504);
                } else {
                    oq5Var13.S();
                }
                break;
            case 20:
                wn5 wn5Var = (wn5) obj7;
                con conVar = (con) obj6;
                plv plvVar = (plv) obj5;
                xnv xnvVar = (xnv) obj4;
                hq5 hq5Var9 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var9;
                if (oq5Var14.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ot0.h(o5g.z(skd.a), 0, 0, ild.C(1915230977, new up(wn5Var, conVar, plvVar, xnvVar, 6), oq5Var14), oq5Var14, 3072, 6);
                } else {
                    oq5Var14.S();
                }
                break;
            case 21:
                cb3 cb3Var = (cb3) obj7;
                y93 y93Var = (y93) obj6;
                fud fudVar = (fud) obj5;
                aqi aqiVar = (aqi) obj4;
                hq5 hq5Var10 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var10;
                if (oq5Var15.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ab3 ab3Var = (ab3) cb3Var;
                    mt mtVar = ab3Var.a;
                    oq oqVar = mtVar.a;
                    jab jabVar = new jab(qkb.Header, 1, 1, 1);
                    aqi O = gld.O(y93Var.g, oq5Var15);
                    aqi O2 = gld.O(y93Var.i, oq5Var15);
                    boolean g = oq5Var15.g(oqVar.d) | oq5Var15.f(mtVar);
                    Object K7 = oq5Var15.K();
                    if (g || K7 == obj3) {
                        ob3 ob3Var = y93Var.a;
                        qbj qbjVar = y93Var.b;
                        rbj rbjVar = y93Var.c;
                        tmb tmbVar = y93Var.d;
                        K7 = new va3(ob3Var, qbjVar, rbjVar, mtVar, tmbVar, tmbVar.a(jabVar, null));
                        oq5Var15.k0(K7);
                    }
                    va3 va3Var = (va3) K7;
                    iab iabVar = ab3Var.b;
                    c93 c93Var = new c93(iabVar, etn.f0(iabVar.c, fudVar, y93Var.j, oq5Var15, 0, 8), ab3Var.e);
                    oqVar.getClass();
                    thj w = c3x.w(lxe.B(oqVar), 0, 0);
                    wl wlVar = new wl(cb3Var, O, O2, va3Var, 22);
                    boolean f6 = oq5Var15.f(aqiVar);
                    Object K8 = oq5Var15.K();
                    if (f6 || K8 == obj3) {
                        K8 = new x80(aqiVar, 5);
                        oq5Var15.k0(K8);
                    }
                    bow.c(va3Var, c93Var, w, wlVar, (Function1) K8, oq5Var15, 0);
                } else {
                    oq5Var15.S();
                }
                break;
            case 22:
                sdr sdrVar = (sdr) obj6;
                sdr sdrVar2 = (sdr) obj5;
                va3 va3Var2 = (va3) obj4;
                ((Integer) obj2).getClass();
                oq5 oq5Var16 = (oq5) ((hq5) obj);
                oq5Var16.Z(495524669);
                ab3 ab3Var2 = (ab3) ((cb3) obj7);
                boolean f7 = oq5Var16.f(sdrVar);
                Object K9 = oq5Var16.K();
                if (f7 || K9 == obj3) {
                    K9 = new la1(sdrVar, 4);
                    oq5Var16.k0(K9);
                }
                Function0 function0 = (Function0) K9;
                boolean f8 = oq5Var16.f(sdrVar2);
                Object K10 = oq5Var16.K();
                if (f8 || K10 == obj3) {
                    K10 = new la1(sdrVar2, 5);
                    oq5Var16.k0(K10);
                }
                Function0 function02 = (Function0) K10;
                boolean h2 = oq5Var16.h(va3Var2);
                Object K11 = oq5Var16.K();
                if (h2 || K11 == obj3) {
                    K11 = new r93(0, va3Var2);
                    oq5Var16.k0(K11);
                }
                ecj ecjVar = (ecj) function0.invoke();
                boolean booleanValue2 = ((Boolean) ((Function0) K11).invoke()).booleanValue();
                n8g b = t75.b();
                te teVar = ab3Var2.b.f;
                if (teVar != null) {
                    b.add(new k93(teVar));
                }
                if (booleanValue2) {
                    b.add(new p93());
                }
                n8g a4 = t75.a(b);
                l93 l93Var = new l93(ab3Var2.d);
                if (ecjVar instanceof ccj) {
                    ArrayList<tx> arrayList2 = ((ccj) ecjVar).a;
                    if (!arrayList2.isEmpty()) {
                        arrayList = new ArrayList(v75.o(arrayList2, 10));
                        for (tx txVar : arrayList2) {
                            if (txVar == null) {
                                b6e.s();
                                break;
                            } else {
                                arrayList.add(new o93(txVar));
                            }
                        }
                        booleanValue = ((Boolean) function02.invoke()).booleanValue();
                        n8g b2 = t75.b();
                        if (booleanValue) {
                            b2.add(n93.a);
                        }
                        n8g a5 = t75.a(b2);
                        if (booleanValue2) {
                            n8g b3 = t75.b();
                            b3.add(l93Var);
                            if (arrayList != null) {
                                b3.addAll(arrayList);
                            }
                            db3Var = new db3(CollectionsKt.g0(CollectionsKt.g0(a4, t75.a(b3)), a5));
                        } else {
                            n8g b4 = t75.b();
                            b4.add(new m93(ab3Var2.c));
                            if (arrayList != null) {
                                b4.addAll(arrayList);
                            }
                            n8g a6 = t75.a(b4);
                            n8g b5 = t75.b();
                            b5.add(l93Var);
                            db3Var = new fb3(CollectionsKt.g0(CollectionsKt.g0(a4, a6), a5), CollectionsKt.g0(CollectionsKt.g0(a4, t75.a(b5)), a5));
                        }
                        oq5Var16.p(false);
                        break;
                    }
                }
                arrayList = null;
                booleanValue = ((Boolean) function02.invoke()).booleanValue();
                n8g b22 = t75.b();
                if (booleanValue) {
                }
                n8g a52 = t75.a(b22);
                if (booleanValue2) {
                }
                oq5Var16.p(false);
            case 23:
                ((Integer) obj2).getClass();
                vq1.b((tf3) obj7, (Function1) obj6, (sf3) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                y2x.a((String) obj7, (String) obj6, (Function0) obj5, (yci) obj4, (hq5) obj, rvf.R(3073));
                break;
            case 25:
                p04 p04Var = (p04) obj7;
                iz3 iz3Var = (iz3) obj6;
                g01 g01Var = (g01) obj5;
                kxi kxiVar2 = (kxi) obj4;
                hq5 hq5Var11 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var17 = (oq5) hq5Var11;
                if (oq5Var17.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean f9 = oq5Var17.f(p04Var) | oq5Var17.f(iz3Var);
                    Object K12 = oq5Var17.K();
                    if (f9 || K12 == obj3) {
                        tz3 tz3Var = (tz3) g01Var.b;
                        switch (tz3Var.a) {
                            case 0:
                                k6lVar = (k6l) tz3Var.b.getValue();
                                break;
                            default:
                                k6lVar = (k6l) tz3Var.b.getValue();
                                break;
                        }
                        switch (tz3Var.a) {
                            case 0:
                                uwuVar = (uwu) tz3Var.c.getValue();
                                break;
                            default:
                                uwuVar = (uwu) tz3Var.c.getValue();
                                break;
                        }
                        switch (tz3Var.a) {
                            case 0:
                                qwuVar = (qwu) tz3Var.d.getValue();
                                break;
                            default:
                                qwuVar = (qwu) tz3Var.d.getValue();
                                break;
                        }
                        Object b04Var = new b04(kxiVar2, iz3Var, p04Var, k6lVar, uwuVar, qwuVar);
                        oq5Var17.k0(b04Var);
                        K12 = b04Var;
                    }
                    vq2.d((b04) K12, (p21) g01Var.d, oq5Var17, 0);
                } else {
                    oq5Var17.S();
                }
                break;
            case 26:
                fvf fvfVar4 = (fvf) obj7;
                List list = (List) obj6;
                o0k o0kVar3 = (o0k) obj5;
                tv4 tv4Var = (tv4) obj4;
                hq5 hq5Var12 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var18 = (oq5) hq5Var12;
                if (oq5Var18.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    c3x.t(fvfVar4, list, oq5Var18, 0);
                    vm C = ghh.C(o0kVar3, androidx.compose.foundation.layout.a.c(0.0f, 24, 0.0f, 16, 5));
                    yci a7 = a.a(d.c(vciVar, 1.0f), "artist_list");
                    boolean f10 = oq5Var18.f(list) | oq5Var18.h(tv4Var);
                    Object K13 = oq5Var18.K();
                    if (f10 || K13 == obj3) {
                        K13 = new ny2(i4, list, tv4Var);
                        oq5Var18.k0(K13);
                    }
                    weo.f(a7, fvfVar4, C, null, null, null, false, null, (Function1) K13, oq5Var18, 6, 504);
                } else {
                    oq5Var18.S();
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                etn.k((fvf) obj7, (j25) obj6, (tmb) obj5, (Function0) obj4, (hq5) obj, rvf.R(513));
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                final jnq jnqVar = (jnq) obj7;
                final tmb tmbVar2 = (tmb) obj6;
                final qne qneVar = (qne) obj5;
                pvf pvfVar = (pvf) obj;
                gnq gnqVar = (gnq) obj2;
                pvfVar.getClass();
                gnqVar.getClass();
                pvfVar.a(new String[]{"TABS"}, new ap1(i3, gnqVar, jnqVar));
                pvfVar.a(new String[]{"ACTION_BAR"}, new qh1(tmbVar2, i6));
                pvfVar.a(new String[]{"EDITORIAL_COMPILATION", "NON_MUSIC_EDITORIAL_COMPILATION", "NON_MUSIC_CATEGORY", "MICRO_GENRE_ALBUMS"}, new Function0() { // from class: gf5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            case 1:
                                return new ce((a14) qneVar.a, jnqVar, zpd.f);
                            case 2:
                                return new ce((a14) qneVar.a, jnqVar, zpd.h);
                            case 3:
                                return new ce((a14) qneVar.a, jnqVar, zpd.j);
                            case 4:
                                return new ce((a14) qneVar.a, jnqVar, zpd.d);
                            case 5:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            default:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                        }
                    }
                });
                pvfVar.a(new String[]{"META_TAG_NEW_ALBUMS"}, new Function0() { // from class: gf5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            case 1:
                                return new ce((a14) qneVar.a, jnqVar, zpd.f);
                            case 2:
                                return new ce((a14) qneVar.a, jnqVar, zpd.h);
                            case 3:
                                return new ce((a14) qneVar.a, jnqVar, zpd.j);
                            case 4:
                                return new ce((a14) qneVar.a, jnqVar, zpd.d);
                            case 5:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            default:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                        }
                    }
                });
                pvfVar.a(new String[]{"PERSONAL_PLAYLISTS"}, new Function0() { // from class: gf5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            case 1:
                                return new ce((a14) qneVar.a, jnqVar, zpd.f);
                            case 2:
                                return new ce((a14) qneVar.a, jnqVar, zpd.h);
                            case 3:
                                return new ce((a14) qneVar.a, jnqVar, zpd.j);
                            case 4:
                                return new ce((a14) qneVar.a, jnqVar, zpd.d);
                            case 5:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            default:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                        }
                    }
                });
                pvfVar.a(new String[]{"NEW_PLAYLISTS", "EDITORIAL_COMPILATION", "PERSONAL_PLAYLISTS", "REWIND_PLAYLISTS", "RECOMMENDED_PLAYLISTS", "NON_MUSIC_EDITORIAL_COMPILATION", "CHART_ALBUMS", "PODCASTS_CHART_ALBUMS", "META_TAG_PLAYLISTS", "META_TAG_POPULAR_PLAYLISTS"}, new Function0() { // from class: gf5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            case 1:
                                return new ce((a14) qneVar.a, jnqVar, zpd.f);
                            case 2:
                                return new ce((a14) qneVar.a, jnqVar, zpd.h);
                            case 3:
                                return new ce((a14) qneVar.a, jnqVar, zpd.j);
                            case 4:
                                return new ce((a14) qneVar.a, jnqVar, zpd.d);
                            case 5:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            default:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                        }
                    }
                });
                pvfVar.a(new String[]{"EDITORIAL_ARTISTS", "NEW_STARS_ARTISTS", "PERSONAL_ARTISTS", "META_TAG_POPULAR_ARTISTS", "MICRO_GENRE_ARTISTS", "MICRO_GENRE_TOP_ARTISTS", "CONCERT_ARTISTS"}, new Function0() { // from class: gf5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            case 1:
                                return new ce((a14) qneVar.a, jnqVar, zpd.f);
                            case 2:
                                return new ce((a14) qneVar.a, jnqVar, zpd.h);
                            case 3:
                                return new ce((a14) qneVar.a, jnqVar, zpd.j);
                            case 4:
                                return new ce((a14) qneVar.a, jnqVar, zpd.d);
                            case 5:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            default:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                        }
                    }
                });
                pvfVar.a(new String[]{"RECENTLY_PLAYED", "NON_MUSIC_RECENTLY_PLAYED"}, new Function0() { // from class: gf5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            case 1:
                                return new ce((a14) qneVar.a, jnqVar, zpd.f);
                            case 2:
                                return new ce((a14) qneVar.a, jnqVar, zpd.h);
                            case 3:
                                return new ce((a14) qneVar.a, jnqVar, zpd.j);
                            case 4:
                                return new ce((a14) qneVar.a, jnqVar, zpd.d);
                            case 5:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            default:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                        }
                    }
                });
                final int i11 = 6;
                pvfVar.a(new String[]{"COLLECTION_SIMILAR_ENTITIES"}, new Function0() { // from class: gf5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            case 1:
                                return new ce((a14) qneVar.a, jnqVar, zpd.f);
                            case 2:
                                return new ce((a14) qneVar.a, jnqVar, zpd.h);
                            case 3:
                                return new ce((a14) qneVar.a, jnqVar, zpd.j);
                            case 4:
                                return new ce((a14) qneVar.a, jnqVar, zpd.d);
                            case 5:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                            default:
                                return new ce((a14) qneVar.a, jnqVar, zpd.k);
                        }
                    }
                });
                pvfVar.a(new String[]{"NEW_RELEASES", "EDITORIAL_NEW_RELEASES"}, new Function0() { // from class: ff5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                jnq jnqVar2 = jnqVar;
                                tmb tmbVar3 = tmbVar2;
                                l18 l18Var = l18.b;
                                bdt I = hag.I(hsj.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                return new rsj((hsj) qdcVar.C(I), jnqVar2, tmbVar3);
                            case 1:
                                jnq jnqVar3 = jnqVar;
                                tmb tmbVar4 = tmbVar2;
                                l18 l18Var2 = l18.b;
                                return new pfr((loq) l18Var2.c(hag.I(loq.class)), (qy7) l18Var2.c(hag.I(qy7.class)), (moq) l18Var2.c(hag.I(moq.class)), jnqVar3, tmbVar4);
                            case 2:
                                jnq jnqVar4 = jnqVar;
                                tmb tmbVar5 = tmbVar2;
                                l18 l18Var3 = l18.b;
                                bdt I2 = hag.I(n4j.class);
                                qdc qdcVar2 = l18Var3.a;
                                qdcVar2.getClass();
                                return new ce((n4j) qdcVar2.C(I2), jnqVar4, tmbVar5);
                            default:
                                jnq jnqVar5 = jnqVar;
                                tmb tmbVar6 = tmbVar2;
                                l18 l18Var4 = l18.b;
                                bdt I3 = hag.I(bg4.class);
                                qdc qdcVar3 = l18Var4.a;
                                qdcVar3.getClass();
                                return new ce((bg4) qdcVar3.C(I3), jnqVar5, tmbVar6);
                        }
                    }
                });
                pvfVar.a(new String[]{"PROMOTIONS", "EDITORIAL_PROMOTIONS", "NON_MUSIC_PROMOTIONS"}, new ph1(jnqVar, 7));
                pvfVar.a(new String[]{"BANNER"}, new ph1(jnqVar, 8));
                pvfVar.a(new String[]{"DYNAMIC_BANNER"}, new ph1(jnqVar, 9));
                pvfVar.a(new String[]{"PAY_OFFERS"}, new ph1(jnqVar, 10));
                pvfVar.a(new String[]{"CHART_TRACKS"}, new Function0() { // from class: ff5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                jnq jnqVar2 = jnqVar;
                                tmb tmbVar3 = tmbVar2;
                                l18 l18Var = l18.b;
                                bdt I = hag.I(hsj.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                return new rsj((hsj) qdcVar.C(I), jnqVar2, tmbVar3);
                            case 1:
                                jnq jnqVar3 = jnqVar;
                                tmb tmbVar4 = tmbVar2;
                                l18 l18Var2 = l18.b;
                                return new pfr((loq) l18Var2.c(hag.I(loq.class)), (qy7) l18Var2.c(hag.I(qy7.class)), (moq) l18Var2.c(hag.I(moq.class)), jnqVar3, tmbVar4);
                            case 2:
                                jnq jnqVar4 = jnqVar;
                                tmb tmbVar5 = tmbVar2;
                                l18 l18Var3 = l18.b;
                                bdt I2 = hag.I(n4j.class);
                                qdc qdcVar2 = l18Var3.a;
                                qdcVar2.getClass();
                                return new ce((n4j) qdcVar2.C(I2), jnqVar4, tmbVar5);
                            default:
                                jnq jnqVar5 = jnqVar;
                                tmb tmbVar6 = tmbVar2;
                                l18 l18Var4 = l18.b;
                                bdt I3 = hag.I(bg4.class);
                                qdc qdcVar3 = l18Var4.a;
                                qdcVar3.getClass();
                                return new ce((bg4) qdcVar3.C(I3), jnqVar5, tmbVar6);
                        }
                    }
                });
                pvfVar.a(new String[]{"IN_STYLE"}, new ph1(jnqVar, 11));
                pvfVar.a(new String[]{"WAVES"}, new ph1(jnqVar, 12));
                pvfVar.a(new String[]{"SETS_BY_WAVES"}, new ph1(jnqVar, 13));
                pvfVar.a(new String[]{"EDITORIAL_WAVES", "META_TAG_WAVE", "MICRO_GENRE_WAVE", "META_TAG_SIMILAR_WAVE", "MICRO_GENRE_SIMILAR_WAVE"}, new ph1(jnqVar, i6));
                pvfVar.a(new String[]{"EDITORIAL_WAVES_AGENT", "META_TAG_WAVE_AGENT", "MICRO_GENRE_WAVE_AGENT", "MICRO_GENRE_SIMILAR_WAVE_AGENT", "META_TAG_SIMILAR_WAVE_AGENT"}, new ph1(jnqVar, i8));
                pvfVar.a(new String[]{"WAVES_AGENT", "SETS_BY_WAVES_AGENT"}, new ph1(jnqVar, i7));
                pnq[] pnqVarArr = pnq.a;
                pvfVar.a(new String[]{"OPEN_PLAYLIST", "SMART_OPEN_PLAYLIST", "NON_MUSIC_OPEN_PLAYLIST"}, new Function0() { // from class: ff5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                jnq jnqVar2 = jnqVar;
                                tmb tmbVar3 = tmbVar2;
                                l18 l18Var = l18.b;
                                bdt I = hag.I(hsj.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                return new rsj((hsj) qdcVar.C(I), jnqVar2, tmbVar3);
                            case 1:
                                jnq jnqVar3 = jnqVar;
                                tmb tmbVar4 = tmbVar2;
                                l18 l18Var2 = l18.b;
                                return new pfr((loq) l18Var2.c(hag.I(loq.class)), (qy7) l18Var2.c(hag.I(qy7.class)), (moq) l18Var2.c(hag.I(moq.class)), jnqVar3, tmbVar4);
                            case 2:
                                jnq jnqVar4 = jnqVar;
                                tmb tmbVar5 = tmbVar2;
                                l18 l18Var3 = l18.b;
                                bdt I2 = hag.I(n4j.class);
                                qdc qdcVar2 = l18Var3.a;
                                qdcVar2.getClass();
                                return new ce((n4j) qdcVar2.C(I2), jnqVar4, tmbVar5);
                            default:
                                jnq jnqVar5 = jnqVar;
                                tmb tmbVar6 = tmbVar2;
                                l18 l18Var4 = l18.b;
                                bdt I3 = hag.I(bg4.class);
                                qdc qdcVar3 = l18Var4.a;
                                qdcVar3.getClass();
                                return new ce((bg4) qdcVar3.C(I3), jnqVar5, tmbVar6);
                        }
                    }
                });
                pvfVar.a(new String[]{"SPECIAL"}, new ph1(jnqVar, i4));
                pvfVar.a(new String[]{"NEUROMUSIC"}, new ph1(jnqVar, 5));
                pvfVar.a(new String[]{"CLIPS"}, new qh1(tmbVar2, i8));
                pvfVar.a(new String[]{"EDITORIAL_CLIPS"}, new qh1(tmbVar2, i7));
                pvfVar.a(new String[]{"UNKNOWN_TYPE"}, new ym4(17));
                pvfVar.a(new String[]{"SIMPLE_PLAYLIST", "SMART_SIMPLE_PLAYLIST"}, new ph1(jnqVar, 6));
                pvfVar.a(new String[]{"CONCERTS_TOP", "CONCERTS_PERSONAL", "EDITORIAL_CONCERTS", "VIEWED_CONCERTS"}, new ap1(25, (u26) obj4, tmbVar2));
                pvfVar.a(new String[]{"DONATIONS"}, new qh1(tmbVar2, i4));
                pvfVar.a(new String[]{"ALBUM_PROMO"}, new qh1(tmbVar2, 5));
                pvfVar.a(new String[]{"SIMPLE_ALBUM_PROMO"}, new qh1(tmbVar2, 6));
                pvfVar.a(new String[]{"STATIC_DIV"}, new Function0() { // from class: ff5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                jnq jnqVar2 = jnqVar;
                                tmb tmbVar3 = tmbVar2;
                                l18 l18Var = l18.b;
                                bdt I = hag.I(hsj.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                return new rsj((hsj) qdcVar.C(I), jnqVar2, tmbVar3);
                            case 1:
                                jnq jnqVar3 = jnqVar;
                                tmb tmbVar4 = tmbVar2;
                                l18 l18Var2 = l18.b;
                                return new pfr((loq) l18Var2.c(hag.I(loq.class)), (qy7) l18Var2.c(hag.I(qy7.class)), (moq) l18Var2.c(hag.I(moq.class)), jnqVar3, tmbVar4);
                            case 2:
                                jnq jnqVar4 = jnqVar;
                                tmb tmbVar5 = tmbVar2;
                                l18 l18Var3 = l18.b;
                                bdt I2 = hag.I(n4j.class);
                                qdc qdcVar2 = l18Var3.a;
                                qdcVar2.getClass();
                                return new ce((n4j) qdcVar2.C(I2), jnqVar4, tmbVar5);
                            default:
                                jnq jnqVar5 = jnqVar;
                                tmb tmbVar6 = tmbVar2;
                                l18 l18Var4 = l18.b;
                                bdt I3 = hag.I(bg4.class);
                                qdc qdcVar3 = l18Var4.a;
                                qdcVar3.getClass();
                                return new ce((bg4) qdcVar3.C(I3), jnqVar5, tmbVar6);
                        }
                    }
                });
                pvfVar.a(new String[]{"ARTIST_CONCERTS"}, new Function0() { // from class: hf5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                return new ce((p31) ((yzp) qneVar.b).a.getValue(), tmbVar2);
                            default:
                                return new ce((pk1) ((yzp) qneVar.b).b.getValue(), tmbVar2);
                        }
                    }
                });
                pvfVar.a(new String[]{"ARTIST_POPULAR_TRACKS"}, new Function0() { // from class: hf5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                return new ce((p31) ((yzp) qneVar.b).a.getValue(), tmbVar2);
                            default:
                                return new ce((pk1) ((yzp) qneVar.b).b.getValue(), tmbVar2);
                        }
                    }
                });
                break;
            default:
                bu5 bu5Var = (bu5) obj7;
                o0k o0kVar4 = (o0k) obj6;
                tsf tsfVar = (tsf) obj5;
                ut5 ut5Var = (ut5) obj4;
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var19 = (oq5) hq5Var13;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        break;
                    }
                }
                tt0.g(bu5Var, null, null, "concertsCatalogCrossfade", ild.C(-376899878, new xk(21, o0kVar4, tsfVar, ut5Var), hq5Var13), hq5Var13, 27648, 6);
        }
        return Unit.a;
    }

    public /* synthetic */ wl(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ wl(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
