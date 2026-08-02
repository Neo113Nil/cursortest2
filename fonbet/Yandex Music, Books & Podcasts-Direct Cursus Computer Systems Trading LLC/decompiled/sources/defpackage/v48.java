package defpackage;

import android.content.Context;
import android.util.TypedValue;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.a;
import androidx.fragment.app.y;
import com.appsflyer.internal.k;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final /* synthetic */ class v48 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ v48(ArrayList arrayList, Function1 function1, Function0 function0, int i) {
        this.a = 14;
        this.b = arrayList;
        this.c = (ezc) function1;
        this.d = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02f0  */
    /* JADX WARN: Type inference failed for: r1v57, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i;
        bkb bkbVar;
        boolean z3;
        wf wfVar;
        cwg cwgVar;
        List list;
        StationId l;
        int i2 = 23;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                gld.g((w48) this.b, (yci) this.c, (e9g) this.d, (hq5) obj, rvf.R(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ghh.d((n0s) this.b, (o3k) this.c, (Function1) this.d, (hq5) obj, rvf.R(1));
                break;
            case 2:
                xia xiaVar = (xia) this.b;
                dja djaVar = (dja) this.c;
                spd spdVar = (spd) this.d;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                xiaVar.getClass();
                djaVar.getClass();
                spdVar.getClass();
                weo.H(xiaVar.b, tt0.u(djaVar.b, spdVar), booleanValue, str, null);
                break;
            case 3:
                gs4 gs4Var = (gs4) this.b;
                cka ckaVar = (cka) this.c;
                kxi kxiVar = (kxi) this.d;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    boolean f = oq5Var.f(gs4Var) | oq5Var.f(ckaVar);
                    Object K = oq5Var.K();
                    if (f || K == gq5.a) {
                        rmb rmbVar = ckaVar.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        K = new rja(gs4Var, rmbVar, ckaVar, (g0l) qdcVar.C(I), kxiVar);
                        oq5Var.k0(K);
                    }
                    ox6.l((rja) K, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                pd.l((nla) this.b, (hla) this.c, (qnq) this.d, (hq5) obj, rvf.R(513));
                break;
            case 5:
                ((Integer) obj2).getClass();
                tua.b((iwa) this.b, (zwa) this.d, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 6:
                iwa iwaVar = (iwa) this.b;
                e2o e2oVar = (e2o) this.c;
                Function1 function1 = (Function1) this.d;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                wua wuaVar = iwaVar.i;
                oq5 oq5Var3 = (oq5) hq5Var2;
                Object K2 = oq5Var3.K();
                if (K2 == gq5.a) {
                    K2 = new owa(function1, iwaVar, 0);
                    oq5Var3.k0(K2);
                }
                yci d = d.d(vci.a, 1.0f);
                boolean z4 = iwaVar.a;
                d.getClass();
                e2oVar.getClass();
                uua.a(wuaVar, (Function0) K2, a.a(d, new sva(z4, e2oVar, 2)), oq5Var3, 48);
            case 7:
                ((Integer) obj2).getClass();
                qld.l((String) this.b, (String) this.c, (String) this.d, (hq5) obj, rvf.R(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                quj.o((s1b) this.b, (r1b) this.d, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                irf.q((Function0) this.b, (tmb) this.d, (yci) this.c, (hq5) obj, rvf.R(65));
                break;
            case 10:
                ((Integer) obj2).getClass();
                nt0.o((fvf) this.b, (sdr) this.c, (Function1) this.d, (hq5) obj, rvf.R(1));
                break;
            case 11:
                xxk xxkVar = (xxk) this.b;
                xo6 xo6Var = (xo6) this.c;
                cjc cjcVar = (cjc) this.d;
                hq5 hq5Var3 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (xxkVar.o) {
                        oq5Var4.Z(-1676691605);
                        bo6 a = xo6Var.a(xxkVar);
                        if (a == null) {
                            oq5Var4.Z(-437832202);
                        } else {
                            oq5Var4.Z(-437832201);
                            vci vciVar = vci.a;
                            boolean f2 = oq5Var4.f(cjcVar);
                            Object K3 = oq5Var4.K();
                            if (f2 || K3 == gq5.a) {
                                K3 = new wf3(cjcVar, 12);
                                oq5Var4.k0(K3);
                            }
                            quj.c(a, wyf.s(vciVar, (Function0) K3), 10, 8, oq5Var4, 3456, 0);
                        }
                        z = false;
                        oq5Var4.p(false);
                    } else {
                        z = false;
                        oq5Var4.Z(-454023749);
                    }
                    oq5Var4.p(z);
                } else {
                    oq5Var4.S();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                lg3.p((jzb) this.b, (Function0) this.d, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 13:
                rdk rdkVar = (rdk) this.b;
                g6c g6cVar = (g6c) this.c;
                kxi kxiVar2 = (kxi) this.d;
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean d2 = oq5Var5.d(2131231418) | oq5Var5.d(2131231417) | oq5Var5.f(rdkVar) | oq5Var5.f(g6cVar);
                    Object K4 = oq5Var5.K();
                    if (d2 || K4 == gq5.a) {
                        rmb rmbVar2 = g6cVar.b;
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(g0l.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        K4 = new t5c(rdkVar, rmbVar2, g6cVar, (g0l) qdcVar2.C(I2), kxiVar2);
                        oq5Var5.k0(K4);
                    }
                    cxb.m((t5c) K4, oq5Var5, 0);
                } else {
                    oq5Var5.S();
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                q6k.g((ArrayList) this.b, (ezc) this.c, (Function0) this.d, (hq5) obj, rvf.R(1));
                break;
            case 15:
                q0d q0dVar = (q0d) this.b;
                d1d d1dVar = (d1d) this.c;
                j1d j1dVar = (j1d) this.d;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var5;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                boolean z5 = j1dVar.g.e;
                oq5 oq5Var7 = (oq5) hq5Var5;
                boolean h = oq5Var7.h(j1dVar);
                Object K5 = oq5Var7.K();
                if (h || K5 == gq5.a) {
                    K5 = new ita(i2, j1dVar);
                    oq5Var7.k0(K5);
                }
                ksw.v(q0dVar, d1dVar, z5, (Function0) K5, null, oq5Var7, 0);
                break;
            case 16:
                ((Integer) obj2).getClass();
                wct.j((h53) this.b, (eqp) this.d, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 17:
                final hla hlaVar = (hla) this.b;
                tmb tmbVar = (tmb) this.c;
                zh zhVar = (zh) this.d;
                pvf pvfVar = (pvf) obj;
                pvfVar.getClass();
                ((gnq) obj2).getClass();
                final int i3 = 0;
                pvfVar.a(new String[]{"PLAYLIST_WITH_LIKES"}, new Function0() { // from class: t2e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                hla hlaVar2 = hlaVar;
                                l18 l18Var3 = l18.b;
                                bdt I3 = hag.I(ooq.class);
                                qdc qdcVar3 = l18Var3.a;
                                qdcVar3.getClass();
                                return new rsj((ooq) qdcVar3.C(I3), (jnq) hlaVar2.b);
                            case 1:
                                hla hlaVar3 = hlaVar;
                                l18 l18Var4 = l18.b;
                                bdt I4 = hag.I(i2g.class);
                                qdc qdcVar4 = l18Var4.a;
                                qdcVar4.getClass();
                                return new ce((i2g) qdcVar4.C(I4), (jnq) hlaVar3.b);
                            default:
                                return new rsj((jnq) hlaVar.b);
                        }
                    }
                });
                final int i4 = 1;
                pvfVar.a(new String[]{"LIKES_AND_HISTORY"}, new Function0() { // from class: t2e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                hla hlaVar2 = hlaVar;
                                l18 l18Var3 = l18.b;
                                bdt I3 = hag.I(ooq.class);
                                qdc qdcVar3 = l18Var3.a;
                                qdcVar3.getClass();
                                return new rsj((ooq) qdcVar3.C(I3), (jnq) hlaVar2.b);
                            case 1:
                                hla hlaVar3 = hlaVar;
                                l18 l18Var4 = l18.b;
                                bdt I4 = hag.I(i2g.class);
                                qdc qdcVar4 = l18Var4.a;
                                qdcVar4.getClass();
                                return new ce((i2g) qdcVar4.C(I4), (jnq) hlaVar3.b);
                            default:
                                return new rsj((jnq) hlaVar.b);
                        }
                    }
                });
                pvfVar.a(new String[]{"MIXES"}, new qh1(tmbVar, 9));
                pvfVar.a(new String[]{"MIXES_MUSIC", "MIXES_GRID"}, new qh1(tmbVar, 10));
                pnq[] pnqVarArr = pnq.a;
                pvfVar.a(new String[]{"WIZARD"}, new zya(16, zhVar, tmbVar));
                final int i5 = 2;
                pvfVar.a(new String[]{"QUESTS"}, new Function0() { // from class: t2e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                hla hlaVar2 = hlaVar;
                                l18 l18Var3 = l18.b;
                                bdt I3 = hag.I(ooq.class);
                                qdc qdcVar3 = l18Var3.a;
                                qdcVar3.getClass();
                                return new rsj((ooq) qdcVar3.C(I3), (jnq) hlaVar2.b);
                            case 1:
                                hla hlaVar3 = hlaVar;
                                l18 l18Var4 = l18.b;
                                bdt I4 = hag.I(i2g.class);
                                qdc qdcVar4 = l18Var4.a;
                                qdcVar4.getClass();
                                return new ce((i2g) qdcVar4.C(I4), (jnq) hlaVar3.b);
                            default:
                                return new rsj((jnq) hlaVar.b);
                        }
                    }
                });
                break;
            case 18:
                ru.yandex.music.player.a aVar = (ru.yandex.music.player.a) this.b;
                fle fleVar = (fle) this.c;
                nle nleVar = (nle) this.d;
                hq5 hq5Var6 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var6;
                if (oq5Var8.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    qyf F = wyf.F(aVar.getLifecycle());
                    nke nkeVar = nleVar.a;
                    Set set = fle.e;
                    leu.n(F, fleVar, nkeVar, null, oq5Var8, 576);
                } else {
                    oq5Var8.S();
                }
                break;
            case 19:
                tze tzeVar = (tze) this.b;
                cr crVar = (cr) this.c;
                kxi kxiVar3 = (kxi) this.d;
                hq5 hq5Var7 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var7;
                if (oq5Var9.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean f3 = oq5Var9.f(tzeVar) | oq5Var9.f(crVar);
                    Object K6 = oq5Var9.K();
                    if (f3 || K6 == gq5.a) {
                        K6 = new lze(crVar, tzeVar, kxiVar3);
                        oq5Var9.k0(K6);
                    }
                    gld.u((lze) K6, null, oq5Var9, 0);
                } else {
                    oq5Var9.S();
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                cxb.s((yze) this.b, (Function1) this.d, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                hld.o((gli) this.b, (ynn) this.c, (xli) this.d, (hq5) obj, rvf.R(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                pd.p((k53) this.b, (eqp) this.d, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 23:
                pu0 pu0Var = (pu0) this.b;
                wn5 wn5Var = (wn5) this.c;
                jkf jkfVar = (jkf) this.d;
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var8;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                jf0.a(new qzm[0], pu0Var, false, ild.C(1241067111, new t1b(i2, wn5Var, jkfVar), hq5Var8), hq5Var8, 0, 4);
            case 24:
                uqn uqnVar = (uqn) this.b;
                jkf jkfVar2 = (jkf) this.c;
                vqn vqnVar = (vqn) this.d;
                float floatValue = ((Float) obj2).floatValue();
                int i6 = (int) (((hqe) obj).a & 4294967295L);
                if (uqnVar.a != floatValue) {
                    uqnVar.a = floatValue;
                    jkfVar2.i = i6;
                    int i7 = (int) (floatValue * 100.0f);
                    qdc qdcVar3 = jkfVar2.e;
                    nmb nmbVar = (nmb) ((jyr) qdcVar3.b).getValue();
                    String G = ((kxi) qdcVar3.c).a.G();
                    nmbVar.getClass();
                    G.getClass();
                    LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "main");
                    m.put("hash", G);
                    m.put("entity_id", "N/A");
                    eta.m(0, "entity_name", "MyWave", "entity_pos", m);
                    k.u(i6, "entity_height", "entity_type", "my_wave", m);
                    m.put("object_showed_percent", String.valueOf(i7));
                    m.put("_meta", nmb.u(2));
                    nmbVar.C("Home.MyWave.Showed", m);
                }
                if (vqnVar.a != i6) {
                    vqnVar.a = i6;
                    jkfVar2.i = i6;
                    yfx yfxVar = ((tjf) jkfVar2.f.a).c;
                    if (yfxVar != null) {
                        s2e s2eVar = (s2e) yfxVar.c;
                        s2eVar.getClass();
                        b2c b2cVar = ujf.a;
                        Context context = s2eVar.e;
                        boolean z6 = s2eVar.E;
                        b2cVar.getClass();
                        context.getClass();
                        int l2 = (((qdq.l(context) - ((int) TypedValue.applyDimension(1, (z6 ? 170 : 130) + 106, context.getResources().getDisplayMetrics()))) - qdq.t(context)) - qdq.n(context)) - i6;
                        s2eVar.y = l2;
                        s2eVar.p.setFullScrollingEnabled(l2 + 1 >= 0);
                        s2eVar.o();
                    }
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                vwb.u((jkf) this.b, (wn5) this.d, (yci) this.c, (hq5) obj, rvf.R(391));
                break;
            case 26:
                ((Integer) obj2).getClass();
                tyf.b((kyf) this.b, (dzf) this.c, (Function0) this.d, (hq5) obj, rvf.R(7));
                break;
            case 27:
                cwg cwgVar2 = (cwg) this.b;
                aqi aqiVar = (aqi) this.c;
                jp0 jp0Var = (jp0) this.d;
                wf wfVar2 = (wf) obj;
                int intValue6 = ((Integer) obj2).intValue();
                wfVar2.getClass();
                String t = weo.t();
                fwg fwgVar = cwgVar2.a;
                fwgVar.getClass();
                t.getClass();
                g06 g06Var = fwgVar.k;
                g06Var.getClass();
                dkb dkbVar = (dkb) g06Var.d;
                gs4 gs4Var2 = (gs4) g06Var.c;
                nmb A = g06Var.A();
                fnb fnbVar = (fnb) g06Var.b;
                String G2 = fnbVar.G();
                String str2 = G2 == null ? "" : G2;
                ckb ckbVar = (ckb) gs4Var2.d;
                pkb pkbVar = (pkb) gs4Var2.e;
                String str3 = (String) gs4Var2.a;
                String str4 = (String) gs4Var2.b;
                dkb dkbVar2 = (dkb) g06Var.d;
                boolean z7 = wfVar2 instanceof rf;
                if (!z7) {
                    z2 = z7;
                    if (!(wfVar2 instanceof pf)) {
                        if (!(wfVar2 instanceof sf)) {
                            if (!(wfVar2 instanceof uf)) {
                                if (!(wfVar2 instanceof nf)) {
                                    i = intValue6;
                                    if (!(wfVar2 instanceof lf)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        int ordinal = ((lf) wfVar2).e.ordinal();
                                        if (ordinal == 0) {
                                            bkbVar = bkb.Download;
                                        } else if (ordinal != 1) {
                                            b6e.s();
                                            break;
                                        } else {
                                            bkbVar = bkb.Delete;
                                        }
                                        A.c("main", str2, ckbVar, str3, str4, dkbVar2, bkbVar);
                                        z3 = wfVar2 instanceof pf;
                                        wf wfVar3 = wfVar2;
                                        if (z3) {
                                        }
                                        cwgVar = cwgVar2;
                                        wfVar = wfVar3;
                                        dn9 dn9Var = cwgVar.b;
                                        kwg kwgVar = ((lwg) aqiVar.getValue()).b;
                                        kxi kxiVar4 = (kxi) dn9Var.e;
                                        t1f t1fVar = (t1f) dn9Var.c;
                                        bwg bwgVar = (bwg) dn9Var.b;
                                        kwgVar.getClass();
                                        Object[] objArr = 0;
                                        Object[] objArr2 = 0;
                                        Object[] objArr3 = 0;
                                        if (wfVar instanceof nf) {
                                        }
                                        jp0Var.e();
                                    }
                                } else {
                                    int ordinal2 = ((nf) wfVar2).e.ordinal();
                                    if (ordinal2 != 0) {
                                        i = intValue6;
                                        if (ordinal2 == 1) {
                                            bkbVar = bkb.Like;
                                        } else if (ordinal2 == 2) {
                                            bkbVar = bkb.SubscribeToPodcast;
                                        } else if (ordinal2 == 3) {
                                            bkbVar = bkb.UnsubscribeToPodcast;
                                        } else if (ordinal2 == 4) {
                                            bkbVar = bkb.Like;
                                        } else if (ordinal2 != 5) {
                                            b6e.s();
                                            break;
                                        } else {
                                            bkbVar = bkb.Unlike;
                                        }
                                    } else {
                                        i = intValue6;
                                        bkbVar = bkb.Unlike;
                                    }
                                    A.c("main", str2, ckbVar, str3, str4, dkbVar2, bkbVar);
                                    z3 = wfVar2 instanceof pf;
                                    wf wfVar32 = wfVar2;
                                    if (z3) {
                                        nmb A2 = g06Var.A();
                                        String G3 = fnbVar.G();
                                        String str5 = G3 == null ? "" : G3;
                                        String o = ouj.o(str4, StringUtils.PROCESS_POSTFIX_DELIMITER, str3);
                                        String str6 = pkbVar.a;
                                        A2.getClass();
                                        dkbVar.getClass();
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.put("page_type", "other");
                                        linkedHashMap.put("page_id", "bottomsheet_screen");
                                        linkedHashMap.put("hash", str5);
                                        linkedHashMap.put("object_type", "wave");
                                        linkedHashMap.put("object_id", o);
                                        linkedHashMap.put("object_name", str4);
                                        linkedHashMap.put("opening_method", dkbVar.a);
                                        linkedHashMap.put("playback_action_id", t);
                                        linkedHashMap.put("entity_type", "my_wave");
                                        eta.m(1, "entity_id", "my_wave", "entity_pos_x", linkedHashMap);
                                        ouj.y(3, linkedHashMap, "entity_pos_y", 1, "object_pos_x");
                                        k.u(1, "object_pos_y", "main_object_type", str6, linkedHashMap);
                                        dfi.p(3, "main_object_id", str3, "_meta", linkedHashMap);
                                        A2.C("BottomSheet.MyWave.Started", linkedHashMap);
                                    } else if (wfVar32 instanceof sf) {
                                        nmb A3 = g06Var.A();
                                        String G4 = fnbVar.G();
                                        wfVar32 = wfVar32;
                                        String str7 = G4 == null ? "" : G4;
                                        String str8 = pkbVar.a;
                                        A3.getClass();
                                        dkbVar.getClass();
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        linkedHashMap2.put("page_type", "other");
                                        linkedHashMap2.put("page_id", "bottomsheet_screen");
                                        linkedHashMap2.put("hash", str7);
                                        linkedHashMap2.put("object_type", pkbVar.a);
                                        linkedHashMap2.put("object_id", str3);
                                        linkedHashMap2.put("opening_method", dkbVar.a);
                                        linkedHashMap2.put("playback_action_id", t);
                                        linkedHashMap2.put("entity_type", "actions");
                                        eta.m(1, "entity_id", "actions", "object_pos_x", linkedHashMap2);
                                        k.u(1, "object_pos_y", "main_object_type", str8, linkedHashMap2);
                                        dfi.p(3, "main_object_id", str3, "_meta", linkedHashMap2);
                                        A3.C("BottomSheet.Started", linkedHashMap2);
                                    } else {
                                        wfVar32 = wfVar32;
                                        if (!z2) {
                                            wfVar = wfVar32;
                                            if (wfVar instanceof uf) {
                                                nmb A4 = g06Var.A();
                                                wjb wjbVar = wjb.MainScreen;
                                                String G5 = fnbVar.G();
                                                nmb.x(A4, G5 == null ? "" : G5, wjbVar, (pkb) gs4Var2.e, (String) gs4Var2.a, wjb.BottomsheetScreen, wjb.TrailerScreen, 228);
                                            }
                                        } else if (((rf) wfVar32).e == qf.ONE) {
                                            g06Var.S(fkb.ArtistScreen);
                                        } else {
                                            wfVar = wfVar32;
                                        }
                                        cwgVar = cwgVar2;
                                        dn9 dn9Var2 = cwgVar.b;
                                        kwg kwgVar2 = ((lwg) aqiVar.getValue()).b;
                                        kxi kxiVar42 = (kxi) dn9Var2.e;
                                        t1f t1fVar2 = (t1f) dn9Var2.c;
                                        bwg bwgVar2 = (bwg) dn9Var2.b;
                                        kwgVar2.getClass();
                                        Object[] objArr4 = 0;
                                        Object[] objArr22 = 0;
                                        Object[] objArr32 = 0;
                                        if (wfVar instanceof nf) {
                                            if (!(wfVar instanceof sf)) {
                                                int i8 = i;
                                                if (!(wfVar instanceof uf)) {
                                                    if (!z3) {
                                                        if (!(wfVar instanceof lf)) {
                                                            if (!z2) {
                                                                b6e.s();
                                                                break;
                                                            } else {
                                                                rf rfVar = (rf) wfVar;
                                                                if (!(kwgVar2 instanceof hwg)) {
                                                                    if (!(kwgVar2 instanceof iwg) && !(kwgVar2 instanceof jwg)) {
                                                                        b6e.s();
                                                                        break;
                                                                    } else {
                                                                        list = null;
                                                                    }
                                                                } else {
                                                                    list = ((hwg) kwgVar2).c;
                                                                }
                                                                List list2 = list;
                                                                if (list2 == null || list2.isEmpty()) {
                                                                    dfi.r("Artists are null!", "LongTapBottomSheetActionsImpl");
                                                                } else {
                                                                    int ordinal3 = rfVar.e.ordinal();
                                                                    if (ordinal3 == 0) {
                                                                        u51 u51Var = (u51) CollectionsKt.k0(list);
                                                                        u51Var.getClass();
                                                                        Context context2 = (Context) t1fVar2.b;
                                                                        int i9 = ArtistScreenActivity.w0;
                                                                        context2.startActivity(l48.p(context2, u51Var, null, null, 24));
                                                                    } else if (ordinal3 != 1) {
                                                                        b6e.s();
                                                                        break;
                                                                    } else {
                                                                        list.getClass();
                                                                        lhd lhdVar = new lhd(20, t1fVar2);
                                                                        ao1.a.getClass();
                                                                        pd.U(list, lhdVar, ao1.b, (y) t1fVar2.c, pd.t(new qzm[0]));
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            int ordinal4 = ((lf) wfVar).e.ordinal();
                                                            if (ordinal4 != 0) {
                                                                if (ordinal4 != 1) {
                                                                    b6e.s();
                                                                    break;
                                                                } else {
                                                                    x97.y(bwgVar2.i, null, null, new vvg(bwgVar2, kwgVar2, objArr22 == true ? 1 : 0, 0), 3);
                                                                }
                                                            } else if (((Boolean) ((pef) dn9Var2.f).invoke()).booleanValue()) {
                                                                v7g.L((Context) t1fVar2.b, new lik(vik.f, null, null));
                                                            } else {
                                                                x97.y(bwgVar2.i, null, null, new vvg(bwgVar2, kwgVar2, objArr4 == true ? 1 : 0, 1), 3);
                                                            }
                                                        }
                                                    } else {
                                                        if (!(kwgVar2 instanceof hwg)) {
                                                            if (!(kwgVar2 instanceof iwg)) {
                                                                if (!(kwgVar2 instanceof jwg)) {
                                                                    b6e.s();
                                                                    break;
                                                                } else {
                                                                    l = StationId.l(((jwg) kwgVar2).a.f);
                                                                }
                                                            } else {
                                                                l = StationId.b(((iwg) kwgVar2).a.a);
                                                            }
                                                        } else {
                                                            l = StationId.a(((hwg) kwgVar2).a.a);
                                                        }
                                                        mg5 mg5Var = bwgVar2.d;
                                                        l.getClass();
                                                        s9p E = o8g.E(c9g.E(l));
                                                        cvo cvoVar = cvo.i;
                                                        cvo b = o6m.b(wjb.BottomsheetScreen, null, 6);
                                                        jab jabVar = new jab(qkb.MyWave, 1, i8 + 1, 0);
                                                        pkb pkbVar2 = pkb.Wave;
                                                        String obj3 = c9g.E(l).toString();
                                                        obj3.getClass();
                                                        mg5Var.b(E, kxiVar42, new w5l(b, jabVar, new thj(pkbVar2, obj3, 1, 1, ""), null), null);
                                                    }
                                                } else if (!(kwgVar2 instanceof hwg)) {
                                                    if (!(kwgVar2 instanceof iwg)) {
                                                        if (!(kwgVar2 instanceof jwg)) {
                                                            b6e.s();
                                                            break;
                                                        } else {
                                                            t1fVar2.B(l5t.d, ((jwg) kwgVar2).a.d().d());
                                                        }
                                                    } else {
                                                        t1fVar2.B(l5t.e, ((iwg) kwgVar2).a.a);
                                                    }
                                                } else {
                                                    i5l i5lVar = l5t.a;
                                                    lt ltVar = ((hwg) kwgVar2).a;
                                                    Album$AlbumType album$AlbumType = ltVar.b;
                                                    i5lVar.getClass();
                                                    t1fVar2.B(i5l.b(album$AlbumType), ltVar.a);
                                                }
                                            } else {
                                                Object obj4 = dn9Var2.d;
                                                PlaybackScope playbackScope = obj4 instanceof PlaybackScope ? (PlaybackScope) obj4 : null;
                                                if (playbackScope == null) {
                                                    playbackScope = PlaybackScope.a;
                                                    playbackScope.getClass();
                                                }
                                                PlaybackScope playbackScope2 = playbackScope;
                                                a6l a2 = kxiVar42.a(t);
                                                hcr hcrVar = hcr.a;
                                                l18 l18Var3 = l18.b;
                                                if (!(kwgVar2 instanceof hwg)) {
                                                    int i10 = i;
                                                    if (!(kwgVar2 instanceof iwg)) {
                                                        if (!(kwgVar2 instanceof jwg)) {
                                                            b6e.s();
                                                            break;
                                                        } else {
                                                            eul eulVar = ((jwg) kwgVar2).a;
                                                            bdt I3 = hag.I(byb.class);
                                                            qdc qdcVar4 = l18Var3.a;
                                                            qdcVar4.getClass();
                                                            if (((a4q) ((byb) qdcVar4.C(I3)).c(ern.a(a4q.class))).h()) {
                                                                g0l.m(bwgVar2.c, eulVar.d().d(), hcrVar, kxiVar42, bwg.c(pkb.Playlist, eulVar.d().d(), i10), "mobile-bottomsheet-playlist-default", null, null, null, null, 2016);
                                                            } else {
                                                                z5l.e(bwgVar2.b, new jbb(bwgVar2, eulVar, playbackScope2, a2, (Continuation) null, 5)).k(new uvg(0, bwgVar2));
                                                            }
                                                        }
                                                    } else {
                                                        u51 u51Var2 = ((iwg) kwgVar2).a;
                                                        bdt I4 = hag.I(byb.class);
                                                        qdc qdcVar5 = l18Var3.a;
                                                        qdcVar5.getClass();
                                                        if (((a4q) ((byb) qdcVar5.C(I4)).c(ern.a(a4q.class))).h()) {
                                                            g0l g0lVar = bwgVar2.c;
                                                            String str9 = u51Var2.a;
                                                            g0l.h(g0lVar, str9, hcrVar, kxiVar42, bwg.c(pkb.Artist, str9, i10), "mobile-bottomsheet-artist-default", null, null, null, null, 2016);
                                                        } else {
                                                            z5l.e(bwgVar2.b, new jbb(bwgVar2, u51Var2, playbackScope2, a2, (Continuation) null, 4)).k(new uvg(0, bwgVar2));
                                                        }
                                                    }
                                                } else {
                                                    lt ltVar2 = ((hwg) kwgVar2).a;
                                                    bdt I5 = hag.I(byb.class);
                                                    qdc qdcVar6 = l18Var3.a;
                                                    qdcVar6.getClass();
                                                    if (((a4q) ((byb) qdcVar6.C(I5)).c(ern.a(a4q.class))).h()) {
                                                        g0l g0lVar2 = bwgVar2.c;
                                                        String str10 = ltVar2.a;
                                                        g0l.g(g0lVar2, str10, hcrVar, kxiVar42, bwg.c(pkb.Album, str10, i), "mobile-bottomsheet-album-default", null, null, null, null, null, 2016);
                                                    } else {
                                                        z5l.e(bwgVar2.b, new jbb(bwgVar2, ltVar2, playbackScope2, a2, (Continuation) null, 3)).k(new uvg(0, bwgVar2));
                                                    }
                                                }
                                            }
                                            break;
                                        } else {
                                            x97.y(bwgVar2.i, null, null, new ak1(!((nf) wfVar).e.d, (Object) bwgVar2, (Object) kwgVar2, (Continuation) (objArr32 == true ? 1 : 0), 8), 3);
                                        }
                                        jp0Var.e();
                                    }
                                    cwgVar = cwgVar2;
                                    wfVar = wfVar32;
                                    dn9 dn9Var22 = cwgVar.b;
                                    kwg kwgVar22 = ((lwg) aqiVar.getValue()).b;
                                    kxi kxiVar422 = (kxi) dn9Var22.e;
                                    t1f t1fVar22 = (t1f) dn9Var22.c;
                                    bwg bwgVar22 = (bwg) dn9Var22.b;
                                    kwgVar22.getClass();
                                    Object[] objArr42 = 0;
                                    Object[] objArr222 = 0;
                                    Object[] objArr322 = 0;
                                    if (wfVar instanceof nf) {
                                    }
                                    jp0Var.e();
                                }
                            } else {
                                bkbVar = bkb.LaunchTrailer;
                            }
                        } else {
                            bkbVar = bkb.PlayOnDevice;
                        }
                    } else {
                        bkbVar = bkb.Unknown;
                    }
                } else {
                    bkbVar = bkb.Unknown;
                    z2 = z7;
                }
                i = intValue6;
                A.c("main", str2, ckbVar, str3, str4, dkbVar2, bkbVar);
                z3 = wfVar2 instanceof pf;
                wf wfVar322 = wfVar2;
                if (z3) {
                }
                cwgVar = cwgVar2;
                wfVar = wfVar322;
                dn9 dn9Var222 = cwgVar.b;
                kwg kwgVar222 = ((lwg) aqiVar.getValue()).b;
                kxi kxiVar4222 = (kxi) dn9Var222.e;
                t1f t1fVar222 = (t1f) dn9Var222.c;
                bwg bwgVar222 = (bwg) dn9Var222.b;
                kwgVar222.getClass();
                Object[] objArr422 = 0;
                Object[] objArr2222 = 0;
                Object[] objArr3222 = 0;
                if (wfVar instanceof nf) {
                }
                jp0Var.e();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                a0g.g((mwg) this.b, (Function0) this.d, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            default:
                ((Integer) obj2).getClass();
                a4g.c((String) this.b, (w4k) this.d, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ v48(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ v48(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ v48(int i, int i2, yci yciVar, Object obj, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.d = obj2;
        this.c = yciVar;
    }
}
