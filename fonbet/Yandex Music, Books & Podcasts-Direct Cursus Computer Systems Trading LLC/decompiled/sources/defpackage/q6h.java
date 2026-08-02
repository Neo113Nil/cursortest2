package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final /* synthetic */ class q6h implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q6h(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [arf, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object wxlVar;
        vxl vxlVar;
        int i = this.a;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        Object[] objArr = 0;
        int i2 = 2;
        int i3 = 3;
        final int i4 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                sdr sdrVar = (sdr) obj5;
                iil iilVar = (iil) obj4;
                c6h c6hVar = (c6h) obj3;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                fj6.a(((u7l) sdrVar.getValue()).a, iilVar.b, iilVar.a.b.b, c6hVar, d.d(vciVar, 1.0f), false, hq5Var, 24576, 32);
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                ocg.a((zrj) obj5, (Function0) obj4, (yci) obj3, (hq5) obj, rvf.R(385));
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                hdg.i((d6i) obj5, (Function0) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                ((l8i) obj5).d((a8i) ((f8i) obj4), (spd) obj3, booleanValue, str);
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                bfg.e((l8i) obj5, (List) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                doi.b((Function0) obj5, (yci) obj4, (eoi) obj3, (hq5) obj, rvf.R(391));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                pcg.f((String) obj5, (dvi) obj4, (tmb) obj3, (hq5) obj, rvf.R(513));
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                hdg.l((ulf) obj5, (Function0) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                zdg.f((String) obj5, (o6g) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                wxf.a((String) obj5, (s3j) obj4, (tmb) obj3, (hq5) obj, rvf.R(513));
                return Unit.a;
            case 10:
                bci bciVar = (bci) obj5;
                w8j w8jVar = (w8j) obj4;
                aqi aqiVar = (aqi) obj3;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                szf.c((a9j) aqiVar.getValue(), bciVar, w8jVar, a.a(vciVar, "non_music_album_bottom_sheet_dialog"), hq5Var2, 3136);
                return Unit.a;
            case 11:
                bz4 bz4Var = (bz4) obj5;
                pvf pvfVar = (pvf) obj;
                pvfVar.getClass();
                ((gnq) obj2).getClass();
                pvfVar.a(new String[]{"NON_MUSIC_BANNER"}, new d1j(5, bz4Var));
                pvfVar.a(new String[]{"MIXES_MUSIC", "MIXES_GRID"}, new qh1((tmb) obj4, 11));
                pvfVar.a(new String[]{"CONTINUE_LISTEN"}, new y6g(24, bz4Var, (kxi) obj3));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                asq.k((dej) obj5, (wdj) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                qgg.f((n53) obj5, (eqp) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                wyf.b(obj5, (Function0) obj4, (Function0) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                y1g.i((vvd) obj5, (Function0) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                rvf.c((qo6) obj5, (ukd) obj4, (plv) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 17:
                bci bciVar2 = (bci) obj5;
                yrl yrlVar = (yrl) obj4;
                aqi aqiVar2 = (aqi) obj3;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                ldg.a((dsl) aqiVar2.getValue(), bciVar2, yrlVar, a.a(vciVar, "playlist_bottom_sheet_dialog"), hq5Var3, 3136);
                return Unit.a;
            case 18:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                ((qzl) obj5).c((jab) obj4, (thj) ((qxl) obj3).c.getValue(), null, str2, booleanValue2);
                return Unit.a;
            case 19:
                qzl qzlVar = (qzl) obj5;
                zzl zzlVar = (zzl) obj4;
                fud fudVar = (fud) obj3;
                hq5 hq5Var4 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue & 1, (intValue & 3) != 2)) {
                    nyl nylVar = (nyl) gld.O(qzlVar.o, oq5Var4).getValue();
                    ndc ndcVar = (ndc) gld.O(qzlVar.v, oq5Var4).getValue();
                    List list = (List) gld.O(qzlVar.z, oq5Var4).getValue();
                    iab iabVar = zzlVar.c;
                    ArrayList arrayList = zzlVar.d;
                    boolean z = nylVar.b;
                    boolean z2 = nylVar.a;
                    dvl dvlVar = new dvl(iabVar, (z && z2) ? ndcVar : null, etn.f0(iabVar.c, fudVar, qzlVar.r, oq5Var4, 0, 8), !arrayList.isEmpty(), !z2);
                    boolean booleanValue3 = ((Boolean) gld.M(qzlVar.p, oq5Var4).getValue()).booleanValue();
                    n8g b = t75.b();
                    List list2 = zzlVar.e;
                    StationId stationId = zzlVar.b;
                    te teVar = iabVar.f;
                    if (teVar != null) {
                        b.add(new qxl(teVar, nylVar));
                    }
                    if (arrayList.isEmpty()) {
                        wxlVar = new uxl(nylVar, booleanValue3);
                    } else if (z && z2) {
                        if (Intrinsics.d(ndcVar, jdc.a)) {
                            vxlVar = new vxl(nylVar, ndcVar, arrayList, stationId);
                        } else if (Intrinsics.d(ndcVar, hdc.a)) {
                            vxlVar = new vxl(nylVar, ndcVar, arrayList, stationId);
                        } else {
                            if (!(ndcVar instanceof ldc)) {
                                b6e.s();
                                return null;
                            }
                            vxlVar = new vxl(nylVar, ndcVar, ((ldc) ndcVar).d, stationId);
                        }
                        wxlVar = vxlVar;
                    } else {
                        wxlVar = new wxl(nylVar, arrayList, stationId);
                    }
                    b.add(wxlVar);
                    if (!list.isEmpty()) {
                        b.add(new sxl(list));
                    }
                    if (z2 && !z && !booleanValue3) {
                        b.add(pxl.a);
                    }
                    if (!list2.isEmpty()) {
                        b.add(new txl(list2));
                    }
                    if (booleanValue3) {
                        b.add(rxl.a);
                    }
                    p1g.f(dvlVar, zzlVar.a, t75.a(b), qzlVar, oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 20:
                wzl wzlVar = (wzl) obj5;
                cyl cylVar = (cyl) obj4;
                tmb tmbVar = (tmb) obj3;
                hq5 hq5Var5 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                iz2 iz2Var = b2c.f;
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    float e = zs4.e(oq5Var5);
                    vci vciVar2 = vci.a;
                    yci c = d.c(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, 0.0f, e, 7), 1.0f);
                    kfh d = ug3.d(b2c.b, false);
                    int i5 = oq5Var5.P;
                    androidx.compose.runtime.internal.a l = oq5Var5.l();
                    yci H = vnj.H(oq5Var5, c);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var5.d0();
                    if (oq5Var5.O) {
                        oq5Var5.k(grbVar);
                    } else {
                        oq5Var5.n0();
                    }
                    g0g.U(oq5Var5, d, wp5.f);
                    g0g.U(oq5Var5, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var5, i5, kb5Var);
                    }
                    g0g.U(oq5Var5, H, wp5.d);
                    if (wzlVar.equals(tzl.a)) {
                        oq5Var5.Z(-1103881448);
                        yci x = d.x(bfg.Q(androidx.compose.foundation.layout.a.l(d.c(vciVar2, 1.0f), ogp.A(oq5Var5)), bfg.C(oq5Var5), false, 14), iz2Var, 2);
                        boolean h = oq5Var5.h(cylVar);
                        Object K = oq5Var5.K();
                        if (h || K == kjnVar) {
                            K = new s8i(21, cylVar);
                            oq5Var5.k0(K);
                        }
                        rvf.j((Function1) K, tmbVar, x, 0, true, null, oq5Var5, 24640, 40);
                        oq5Var5.p(false);
                    } else {
                        boolean equals = wzlVar.equals(uzl.a);
                        b bVar = b.a;
                        if (equals) {
                            oq5Var5.Z(-1103201618);
                            cb0.i(bVar.a(a.a(vciVar2, "playlist_error_not_found"), iz2Var), oq5Var5, 0);
                            oq5Var5.p(false);
                        } else {
                            if (!(wzlVar instanceof vzl)) {
                                throw vz1.i(oq5Var5, 1072767115, false);
                            }
                            oq5Var5.Z(-1102832191);
                            ivf.q(((vzl) wzlVar).a, rvf.M(R.string.playlist_not_available, oq5Var5), R.drawable.ic_playlist_24, bVar.a(a.a(vciVar2, "playlist_error_unavailable"), iz2Var), null, oq5Var5, 0, 16);
                            oq5Var5.p(false);
                        }
                    }
                    boolean h2 = oq5Var5.h(cylVar);
                    Object K2 = oq5Var5.K();
                    if (h2 || K2 == kjnVar) {
                        ayl aylVar = new ayl(0, cylVar, cyl.class, "onBackClick", "onBackClick()V", 0, 2);
                        oq5Var5.k0(aylVar);
                        K2 = aylVar;
                    }
                    h9f h9fVar = (h9f) K2;
                    boolean h3 = oq5Var5.h(cylVar);
                    Object K3 = oq5Var5.K();
                    if (h3 || K3 == kjnVar) {
                        ayl aylVar2 = new ayl(0, cylVar, cyl.class, "onSearchClick", "onSearchClick()V", 0, 3);
                        oq5Var5.k0(aylVar2);
                        K3 = aylVar2;
                    }
                    h9f h9fVar2 = (h9f) K3;
                    boolean h4 = oq5Var5.h(cylVar);
                    Object K4 = oq5Var5.K();
                    if (h4 || K4 == kjnVar) {
                        ayl aylVar3 = new ayl(0, cylVar, cyl.class, "onOverflowClick", "onOverflowClick()V", 0, 4);
                        oq5Var5.k0(aylVar3);
                        K4 = aylVar3;
                    }
                    t7g.h(gut.p1(vciVar2), (Function0) h9fVar, (Function0) h9fVar2, (Function0) ((h9f) K4), oq5Var5, 0, 0);
                    oq5Var5.p(true);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                w1g.f((qzl) obj5, (jab) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 22:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                String str3 = (String) obj2;
                str3.getClass();
                ((qzl) obj5).c((nab) obj4, (thj) obj3, null, str3, booleanValue4);
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                a4g.f((uxl) obj5, (jab) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                s7g.e((ngt) obj5, (Function0) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 25:
                ((Integer) obj2).getClass();
                lsq.f((rbm) obj5, (tvd) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 26:
                ((Integer) obj2).getClass();
                hag.e((tvd) obj5, (dam) obj4, (rbm) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 27:
                ((Integer) obj2).getClass();
                f8g.c((Function0) obj5, (kv4) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                wdg.g((String) obj5, (um0) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            default:
                g3n g3nVar = (g3n) obj5;
                final u6k u6kVar = (u6k) obj4;
                final Context context = (Context) obj3;
                hq5 hq5Var6 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    y3n y3nVar = g3nVar.d;
                    boolean f = oq5Var6.f(u6kVar) | oq5Var6.h(context);
                    Object K5 = oq5Var6.K();
                    if (f || K5 == kjnVar) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        K5 = new Function0() { // from class: u2n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (objArr2) {
                                    case 0:
                                        boolean u = bow.u(context);
                                        u6k u6kVar2 = u6kVar;
                                        u6kVar2.i((u && u6kVar2.h() == 0) ? 1 : 0);
                                        break;
                                    default:
                                        boolean u2 = bow.u(context);
                                        u6k u6kVar3 = u6kVar;
                                        int i6 = 1;
                                        if (u2 && u6kVar3.h() == 1) {
                                            i6 = 0;
                                        }
                                        u6kVar3.i(i6);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var6.k0(K5);
                    }
                    Function0 function0 = (Function0) K5;
                    yci a = a.a(vciVar, "purchase_slider_left_tab");
                    boolean f2 = oq5Var6.f(u6kVar);
                    Object K6 = oq5Var6.K();
                    if (f2 || K6 == kjnVar) {
                        K6 = new aq(u6kVar, i2);
                        oq5Var6.k0(K6);
                    }
                    x2n.g(y3nVar, function0, nfp.b(a, false, (Function1) K6), oq5Var6, 0);
                    y3n y3nVar2 = g3nVar.f;
                    boolean f3 = oq5Var6.f(u6kVar) | oq5Var6.h(context);
                    Object K7 = oq5Var6.K();
                    if (f3 || K7 == kjnVar) {
                        K7 = new Function0() { // from class: u2n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        boolean u = bow.u(context);
                                        u6k u6kVar2 = u6kVar;
                                        u6kVar2.i((u && u6kVar2.h() == 0) ? 1 : 0);
                                        break;
                                    default:
                                        boolean u2 = bow.u(context);
                                        u6k u6kVar3 = u6kVar;
                                        int i6 = 1;
                                        if (u2 && u6kVar3.h() == 1) {
                                            i6 = 0;
                                        }
                                        u6kVar3.i(i6);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var6.k0(K7);
                    }
                    Function0 function02 = (Function0) K7;
                    yci a2 = a.a(vciVar, "purchase_slider_right_tab");
                    boolean f4 = oq5Var6.f(u6kVar);
                    Object K8 = oq5Var6.K();
                    if (f4 || K8 == kjnVar) {
                        K8 = new aq(u6kVar, i3);
                        oq5Var6.k0(K8);
                    }
                    x2n.g(y3nVar2, function02, nfp.b(a2, false, (Function1) K8), oq5Var6, 0);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ q6h(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
