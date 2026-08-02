package defpackage;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsImpressionsParser$WaveWordsViewReportJson;
import com.yandex.music.shared.wave.shader.api.component.WaveGlShaderView;
import com.yandex.pulse.metrics.o;
import defpackage.hmm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.c;
import ru.yandex.video.m3.data.dto.ExternalStalled;

/* loaded from: classes3.dex */
public final /* synthetic */ class wes implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wes(eqp eqpVar, xft xftVar) {
        this.a = 10;
        this.c = eqpVar;
        this.b = xftVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ffs ffsVar;
        int i;
        String str;
        izs a;
        cko D0;
        zvs zvsVar;
        Integer valueOf;
        String str2;
        String str3;
        List list;
        List list2;
        int i2 = this.a;
        String str4 = "Temp";
        final int i3 = 3;
        final int i4 = 2;
        final int i5 = 0;
        final int i6 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                eqp eqpVar = (eqp) obj2;
                oht ohtVar = (oht) obj;
                ohtVar.getClass();
                if (!((zes) obj3).b) {
                    eqpVar.getClass();
                    jyr jyrVar = eqpVar.r;
                    ffs ffsVar2 = (ffs) ((p8q) jyrVar.getValue()).c.getValue();
                    int ordinal = ohtVar.ordinal();
                    if (ordinal == 0) {
                        ffsVar = ffs.SYSTEM_DEFAULT;
                    } else if (ordinal == 1) {
                        ffsVar = ffs.LIGHT;
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        ffsVar = ffs.DARK;
                    }
                    hsp hspVar = eqpVar.c;
                    hspVar.getClass();
                    ffsVar2.getClass();
                    vnb b = hspVar.b();
                    xjb xjbVar = xjb.Explicit;
                    int ordinal2 = ffsVar2.ordinal();
                    String str5 = "light";
                    if (ordinal2 != 0) {
                        i = 1;
                        if (ordinal2 == 1) {
                            str = "dark";
                        } else {
                            if (ordinal2 != 2) {
                                b6e.s();
                                return null;
                            }
                            str = "system_default";
                        }
                    } else {
                        i = 1;
                        str = "light";
                    }
                    int ordinal3 = ffsVar.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 == i) {
                            str5 = "dark";
                        } else {
                            if (ordinal3 != 2) {
                                b6e.s();
                                return null;
                            }
                            str5 = "system_default";
                        }
                    }
                    b.b(xjbVar, str, str5);
                    p8q p8qVar = (p8q) jyrVar.getValue();
                    p8qVar.getClass();
                    SharedPreferences sharedPreferences = p8qVar.a.getSharedPreferences("Yandex_Music", 0);
                    sharedPreferences.getClass();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("theme", ffsVar.a);
                    edit.apply();
                    xdr xdrVar = p8qVar.b;
                    xdrVar.getClass();
                    xdrVar.m(null, ffsVar);
                    ou0.a.getClass();
                    xdr xdrVar2 = ou0.b;
                    xdrVar2.getClass();
                    xdrVar2.m(null, ffsVar);
                }
                return Unit.a;
            case 1:
                ((Boolean) obj).getClass();
                ((y8p) obj3).h(!((rhs) obj2).c);
                return Unit.a;
            case 2:
                brs brsVar = (brs) obj3;
                mqs mqsVar = (mqs) obj2;
                String str6 = (String) obj;
                str6.getClass();
                e6v e6vVar = brsVar.i;
                kxi kxiVar = brsVar.k;
                if (e6vVar instanceof b6v) {
                    r3q r3qVar = ((b6v) e6vVar).a;
                    r3qVar.getClass();
                    a = new b6v(r3qVar);
                } else {
                    if (!(e6vVar instanceof d6v)) {
                        b6e.s();
                        return null;
                    }
                    a = d6v.a((d6v) e6vVar);
                }
                return t75.c(new jzs(mqsVar, new v80(brsVar.j, new gxc(kxiVar.a.G(), str6), kxiVar.b), null, null, null, null, a, false));
            case 3:
                mqs mqsVar2 = (mqs) obj3;
                xts xtsVar = (xts) obj2;
                ((is6) obj).getClass();
                o8q o8qVar = (o8q) xtsVar.d.getValue();
                int i7 = xtsVar.e;
                mqsVar2.getClass();
                o8qVar.getClass();
                return new bus(new nt6(mqsVar2.a, mqsVar2.c, zwf.a0(mqsVar2, o8qVar, i7), Long.valueOf(mqsVar2.e), mqsVar2.i()), xtsVar);
            case 4:
                vus vusVar = (vus) obj3;
                String str7 = (String) obj;
                str7.getClass();
                vusVar.getClass();
                str7.getClass();
                wus wusVar = vusVar.a;
                thj thjVar = new thj(pkb.Shortcut, str7, 1, 1, "");
                wusVar.getClass();
                uus uusVar = wusVar.m;
                g0l g0lVar = (g0l) uusVar.a.getValue();
                mqs mqsVar3 = wusVar.k;
                List c = t75.c(mqsVar3);
                mqsVar3.getClass();
                String str8 = mqsVar3.a;
                g0l.o(g0lVar, hcr.a, c, wusVar.l, new w5l(new cvo(wjb.SummaryScreen, hlb.Bottomsheet, (glb) null, (dvo) null, new avo(pkb.Album, str8), 44), new jab(qkb.Summary, 1, 1, 0), thjVar, null), ((c) ((gpj) uusVar.c.getValue()).b.getValue()).a(), new m3q(new cd5(t75.c(str8)), ryt.a), 1984);
                ((sai) obj2).a();
                return Unit.a;
            case 5:
                Set<css> set = (Set) obj2;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0((String) obj3);
                try {
                    int i8 = 1;
                    for (css cssVar : set) {
                        cssVar.getClass();
                        int ordinal4 = cssVar.ordinal();
                        if (ordinal4 == 0) {
                            str2 = "Temp";
                        } else if (ordinal4 == 1) {
                            str2 = "Auto";
                        } else if (ordinal4 == 2) {
                            str2 = "Smart";
                        } else if (ordinal4 == 3) {
                            str2 = "Strong";
                        } else {
                            if (ordinal4 != 4) {
                                throw new x7j();
                            }
                            str2 = "Weak";
                        }
                        D0.E(i8, str2);
                        i8++;
                    }
                    int v = s7g.v(D0, "track_id");
                    int v2 = s7g.v(D0, "quality");
                    int v3 = s7g.v(D0, "storage");
                    int v4 = s7g.v(D0, "cache_type");
                    int v5 = s7g.v(D0, "container");
                    int v6 = s7g.v(D0, "added_timestamp");
                    int v7 = s7g.v(D0, "uri");
                    int v8 = s7g.v(D0, "gain");
                    int v9 = s7g.v(D0, "truePeakDb");
                    int v10 = s7g.v(D0, "integratedLoudnessDb");
                    int v11 = s7g.v(D0, "codec");
                    int v12 = s7g.v(D0, "bitrate");
                    int v13 = s7g.v(D0, "realQuality");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        String x0 = D0.x0(v);
                        x0.getClass();
                        int i9 = v;
                        zvs zvsVar2 = new zvs(x0);
                        o5n W = c9g.W(D0.x0(v2));
                        thr X = c9g.X(D0.x0(v3));
                        css O = c9g.O(D0.x0(v4));
                        bb6 Q = c9g.Q(D0.x0(v5));
                        long j = D0.getLong(v6);
                        String x02 = D0.x0(v7);
                        if (D0.isNull(v8)) {
                            zvsVar = zvsVar2;
                            valueOf = null;
                        } else {
                            zvsVar = zvsVar2;
                            valueOf = Integer.valueOf((int) D0.getLong(v8));
                        }
                        arrayList.add(new n3t(zvsVar, W, X, O, Q, j, x02, valueOf != null ? Boolean.valueOf(valueOf.intValue() != 0) : null, D0.isNull(v9) ? null : Float.valueOf((float) D0.getDouble(v9)), D0.isNull(v10) ? null : Float.valueOf((float) D0.getDouble(v10)), c9g.P(D0.x0(v11)), (int) D0.getLong(v12), c9g.W(D0.x0(v13))));
                        v = i9;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 6:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                ((i3t) obj3).b.H(xjoVar2, (n3t) obj2);
                return Unit.a;
            case 7:
                css cssVar2 = (css) obj3;
                zvs zvsVar3 = (zvs) obj2;
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("UPDATE tracks_cache SET cache_type = ?, added_timestamp = coalesce(?, added_timestamp) WHERE track_id = ?");
                try {
                    cssVar2.getClass();
                    int ordinal5 = cssVar2.ordinal();
                    if (ordinal5 != 0) {
                        if (ordinal5 == 1) {
                            str4 = "Auto";
                        } else if (ordinal5 == 2) {
                            str4 = "Smart";
                        } else if (ordinal5 == 3) {
                            str4 = "Strong";
                        } else {
                            if (ordinal5 != 4) {
                                throw new x7j();
                            }
                            str4 = "Weak";
                        }
                    }
                    D0.E(1, str4);
                    D0.bindNull(2);
                    D0.E(3, zvsVar3.a);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                    D0.close();
                }
            case 8:
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                ((v3t) obj3).b.G(xjoVar4, (ArrayList) obj2);
                return Unit.a;
            case 9:
                ((String) obj).getClass();
                ((njt) obj3).getClass();
                ((llu) ((yit) obj2)).getClass();
                return Unit.a;
            case 10:
                eqp eqpVar2 = (eqp) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str9 = ((xft) obj3).a;
                eqpVar2.getClass();
                str9.getClass();
                hsp hspVar2 = eqpVar2.c;
                hspVar2.getClass();
                hspVar2.b().a(xjb.GlagolStation, booleanValue);
                tpp tppVar = eqpVar2.b;
                tppVar.getClass();
                akd akdVar = (akd) tppVar.c.getValue();
                akdVar.getClass();
                agd agdVar = akdVar.c;
                SharedPreferences.Editor edit2 = agdVar.b().edit();
                edit2.putBoolean(str9, booleanValue);
                edit2.apply();
                x0q x0qVar = agdVar.d;
                Unit unit = Unit.a;
                x0qVar.a(unit);
                return unit;
            case 11:
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                ((u2u) obj3).b.G(xjoVar5, (ArrayList) obj2);
                return Unit.a;
            case 12:
                cr crVar = (cr) obj2;
                ((is6) obj).getClass();
                return new f3u((x1u) obj3, (k68) ((jyr) crVar.i).getValue(), (l0t) ((jyr) crVar.g).getValue());
            case 13:
                x1u x1uVar = (x1u) obj3;
                ((is6) obj).getClass();
                x1uVar.getClass();
                return new k3u(new nt6(x1uVar.a, x1uVar.b, null, null, x1uVar.n), (h3u) obj2);
            case 14:
                xjo xjoVar6 = (xjo) obj;
                xjoVar6.getClass();
                ((n3u) obj3).b.G(xjoVar6, (ArrayList) obj2);
                return Unit.a;
            case 15:
                i5u i5uVar = (i5u) obj2;
                o0l o0lVar = (o0l) obj;
                o0lVar.b = Long.valueOf(((p5d) obj3).d);
                wmn wmnVar = i5uVar != null ? i5uVar.c : null;
                HashMap hashMap = new HashMap();
                switch (wmnVar == null ? -1 : j2u.a[wmnVar.ordinal()]) {
                    case -1:
                        str3 = "unknown";
                        break;
                    case 0:
                    default:
                        b6e.s();
                        return null;
                    case 1:
                        str3 = "ondemand";
                        break;
                    case 2:
                        str3 = "recommended";
                        break;
                    case 3:
                        str3 = "search";
                        break;
                    case 4:
                        str3 = "artist";
                        break;
                    case 5:
                        str3 = "own_clips";
                        break;
                    case 6:
                        str3 = "editorial_clips";
                        break;
                }
                hashMap.put(ExternalStalled.streamBlockKey, str3);
                o0lVar.c = hashMap;
                return Unit.a;
            case 16:
                ((ConcurrentLinkedQueue) ((yks) obj3).d).remove((ou7) obj2);
                return Unit.a;
            case 17:
                xjo xjoVar7 = (xjo) obj;
                xjoVar7.getClass();
                ((s9u) obj3).b.G(xjoVar7, (ArrayList) obj2);
                return Unit.a;
            case 18:
                xjo xjoVar8 = (xjo) obj;
                xjoVar8.getClass();
                ((lou) obj3).b.H(xjoVar8, (mou) obj2);
                return Unit.a;
            case 19:
                ((ConcurrentLinkedQueue) ((mmo) obj3).g).remove((ou7) obj2);
                return Unit.a;
            case 20:
                gsu gsuVar = (gsu) obj3;
                String str10 = (String) obj2;
                sru sruVar = (sru) obj;
                List<hsu> list3 = sruVar.b;
                ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                for (hsu hsuVar : list3) {
                    if (Intrinsics.d(hsuVar.getId(), gsuVar.a)) {
                        hsuVar = gsu.c(gsuVar, str10, null, 61);
                    }
                    arrayList2.add(hsuVar);
                }
                return sru.a(sruVar, false, arrayList2, false, 5);
            case 21:
                sru sruVar2 = (sru) obj3;
                nru nruVar = (nru) obj2;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vuf.Y(vufVar, null, new wn5(new f6p(17, sruVar2, nruVar), -1801042980, true), 3);
                List list4 = sruVar2.b;
                vufVar.Z(list4.size(), null, new zcf(list4, 20), new wn5(new cl(28, list4, nruVar), -1091073711, true));
                vuf.Y(vufVar, null, ild.e, 3);
                return Unit.a;
            case 22:
                final evj evjVar = (evj) obj2;
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(mm6.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.C((tf6) obj3);
                o18Var.c = hag.I(pmf.class);
                rp7Var.getClass();
                rp7Var.E(new Function1() { // from class: iuu
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i10 = i5;
                        l13 l13Var = (l13) obj4;
                        l13Var.getClass();
                        switch (i10) {
                            case 0:
                                return new pmf((oq7) evjVar.c);
                            case 1:
                                return new xmf((ofo) evjVar.d, (mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b));
                            case 2:
                                bdt I = hag.I(pmf.class);
                                qdc qdcVar = l13Var.a;
                                Set set2 = l13Var.b;
                                return new nmf((pmf) qdcVar.D(I, l13Var, set2), (xmf) qdcVar.D(hag.I(xmf.class), l13Var, set2), (frt) evjVar.b, (mm6) qdcVar.D(hag.I(mm6.class), l13Var, set2));
                            case 3:
                                return new wvu((g0l) evjVar.f);
                            case 4:
                                bdt I2 = hag.I(nmf.class);
                                qdc qdcVar2 = l13Var.a;
                                Set set3 = l13Var.b;
                                return new mg5((nmf) qdcVar2.D(I2, l13Var, set3), (wvu) qdcVar2.D(hag.I(wvu.class), l13Var, set3), (oq7) evjVar.c);
                            case 5:
                                bdt I3 = hag.I(xmf.class);
                                qdc qdcVar3 = l13Var.a;
                                Set set4 = l13Var.b;
                                xmf xmfVar = (xmf) qdcVar3.D(I3, l13Var, set4);
                                evj evjVar2 = evjVar;
                                return new cyu((cc7) evjVar2.e, xmfVar, (mm6) qdcVar3.D(hag.I(mm6.class), l13Var, set4), (frt) evjVar2.b);
                            default:
                                return new v5v((mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b), evjVar.a);
                        }
                    }
                });
                o18Var.c = hag.I(xmf.class);
                rp7Var.getClass();
                rp7Var.E(new Function1() { // from class: iuu
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i10 = i6;
                        l13 l13Var = (l13) obj4;
                        l13Var.getClass();
                        switch (i10) {
                            case 0:
                                return new pmf((oq7) evjVar.c);
                            case 1:
                                return new xmf((ofo) evjVar.d, (mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b));
                            case 2:
                                bdt I = hag.I(pmf.class);
                                qdc qdcVar = l13Var.a;
                                Set set2 = l13Var.b;
                                return new nmf((pmf) qdcVar.D(I, l13Var, set2), (xmf) qdcVar.D(hag.I(xmf.class), l13Var, set2), (frt) evjVar.b, (mm6) qdcVar.D(hag.I(mm6.class), l13Var, set2));
                            case 3:
                                return new wvu((g0l) evjVar.f);
                            case 4:
                                bdt I2 = hag.I(nmf.class);
                                qdc qdcVar2 = l13Var.a;
                                Set set3 = l13Var.b;
                                return new mg5((nmf) qdcVar2.D(I2, l13Var, set3), (wvu) qdcVar2.D(hag.I(wvu.class), l13Var, set3), (oq7) evjVar.c);
                            case 5:
                                bdt I3 = hag.I(xmf.class);
                                qdc qdcVar3 = l13Var.a;
                                Set set4 = l13Var.b;
                                xmf xmfVar = (xmf) qdcVar3.D(I3, l13Var, set4);
                                evj evjVar2 = evjVar;
                                return new cyu((cc7) evjVar2.e, xmfVar, (mm6) qdcVar3.D(hag.I(mm6.class), l13Var, set4), (frt) evjVar2.b);
                            default:
                                return new v5v((mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b), evjVar.a);
                        }
                    }
                });
                o18Var.c = hag.I(nmf.class);
                rp7Var.getClass();
                rp7Var.E(new Function1() { // from class: iuu
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i10 = i4;
                        l13 l13Var = (l13) obj4;
                        l13Var.getClass();
                        switch (i10) {
                            case 0:
                                return new pmf((oq7) evjVar.c);
                            case 1:
                                return new xmf((ofo) evjVar.d, (mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b));
                            case 2:
                                bdt I = hag.I(pmf.class);
                                qdc qdcVar = l13Var.a;
                                Set set2 = l13Var.b;
                                return new nmf((pmf) qdcVar.D(I, l13Var, set2), (xmf) qdcVar.D(hag.I(xmf.class), l13Var, set2), (frt) evjVar.b, (mm6) qdcVar.D(hag.I(mm6.class), l13Var, set2));
                            case 3:
                                return new wvu((g0l) evjVar.f);
                            case 4:
                                bdt I2 = hag.I(nmf.class);
                                qdc qdcVar2 = l13Var.a;
                                Set set3 = l13Var.b;
                                return new mg5((nmf) qdcVar2.D(I2, l13Var, set3), (wvu) qdcVar2.D(hag.I(wvu.class), l13Var, set3), (oq7) evjVar.c);
                            case 5:
                                bdt I3 = hag.I(xmf.class);
                                qdc qdcVar3 = l13Var.a;
                                Set set4 = l13Var.b;
                                xmf xmfVar = (xmf) qdcVar3.D(I3, l13Var, set4);
                                evj evjVar2 = evjVar;
                                return new cyu((cc7) evjVar2.e, xmfVar, (mm6) qdcVar3.D(hag.I(mm6.class), l13Var, set4), (frt) evjVar2.b);
                            default:
                                return new v5v((mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b), evjVar.a);
                        }
                    }
                });
                o18Var.c = hag.I(wvu.class);
                rp7Var.getClass();
                rp7Var.E(new Function1() { // from class: iuu
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i10 = i3;
                        l13 l13Var = (l13) obj4;
                        l13Var.getClass();
                        switch (i10) {
                            case 0:
                                return new pmf((oq7) evjVar.c);
                            case 1:
                                return new xmf((ofo) evjVar.d, (mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b));
                            case 2:
                                bdt I = hag.I(pmf.class);
                                qdc qdcVar = l13Var.a;
                                Set set2 = l13Var.b;
                                return new nmf((pmf) qdcVar.D(I, l13Var, set2), (xmf) qdcVar.D(hag.I(xmf.class), l13Var, set2), (frt) evjVar.b, (mm6) qdcVar.D(hag.I(mm6.class), l13Var, set2));
                            case 3:
                                return new wvu((g0l) evjVar.f);
                            case 4:
                                bdt I2 = hag.I(nmf.class);
                                qdc qdcVar2 = l13Var.a;
                                Set set3 = l13Var.b;
                                return new mg5((nmf) qdcVar2.D(I2, l13Var, set3), (wvu) qdcVar2.D(hag.I(wvu.class), l13Var, set3), (oq7) evjVar.c);
                            case 5:
                                bdt I3 = hag.I(xmf.class);
                                qdc qdcVar3 = l13Var.a;
                                Set set4 = l13Var.b;
                                xmf xmfVar = (xmf) qdcVar3.D(I3, l13Var, set4);
                                evj evjVar2 = evjVar;
                                return new cyu((cc7) evjVar2.e, xmfVar, (mm6) qdcVar3.D(hag.I(mm6.class), l13Var, set4), (frt) evjVar2.b);
                            default:
                                return new v5v((mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b), evjVar.a);
                        }
                    }
                });
                o18Var.c = hag.I(mg5.class);
                rp7Var.getClass();
                final int i10 = 4;
                rp7Var.E(new Function1() { // from class: iuu
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i102 = i10;
                        l13 l13Var = (l13) obj4;
                        l13Var.getClass();
                        switch (i102) {
                            case 0:
                                return new pmf((oq7) evjVar.c);
                            case 1:
                                return new xmf((ofo) evjVar.d, (mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b));
                            case 2:
                                bdt I = hag.I(pmf.class);
                                qdc qdcVar = l13Var.a;
                                Set set2 = l13Var.b;
                                return new nmf((pmf) qdcVar.D(I, l13Var, set2), (xmf) qdcVar.D(hag.I(xmf.class), l13Var, set2), (frt) evjVar.b, (mm6) qdcVar.D(hag.I(mm6.class), l13Var, set2));
                            case 3:
                                return new wvu((g0l) evjVar.f);
                            case 4:
                                bdt I2 = hag.I(nmf.class);
                                qdc qdcVar2 = l13Var.a;
                                Set set3 = l13Var.b;
                                return new mg5((nmf) qdcVar2.D(I2, l13Var, set3), (wvu) qdcVar2.D(hag.I(wvu.class), l13Var, set3), (oq7) evjVar.c);
                            case 5:
                                bdt I3 = hag.I(xmf.class);
                                qdc qdcVar3 = l13Var.a;
                                Set set4 = l13Var.b;
                                xmf xmfVar = (xmf) qdcVar3.D(I3, l13Var, set4);
                                evj evjVar2 = evjVar;
                                return new cyu((cc7) evjVar2.e, xmfVar, (mm6) qdcVar3.D(hag.I(mm6.class), l13Var, set4), (frt) evjVar2.b);
                            default:
                                return new v5v((mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b), evjVar.a);
                        }
                    }
                });
                o18Var.c = hag.I(yxu.class);
                rp7Var.getClass();
                final int i11 = 5;
                rp7Var.E(new Function1() { // from class: iuu
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i102 = i11;
                        l13 l13Var = (l13) obj4;
                        l13Var.getClass();
                        switch (i102) {
                            case 0:
                                return new pmf((oq7) evjVar.c);
                            case 1:
                                return new xmf((ofo) evjVar.d, (mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b));
                            case 2:
                                bdt I = hag.I(pmf.class);
                                qdc qdcVar = l13Var.a;
                                Set set2 = l13Var.b;
                                return new nmf((pmf) qdcVar.D(I, l13Var, set2), (xmf) qdcVar.D(hag.I(xmf.class), l13Var, set2), (frt) evjVar.b, (mm6) qdcVar.D(hag.I(mm6.class), l13Var, set2));
                            case 3:
                                return new wvu((g0l) evjVar.f);
                            case 4:
                                bdt I2 = hag.I(nmf.class);
                                qdc qdcVar2 = l13Var.a;
                                Set set3 = l13Var.b;
                                return new mg5((nmf) qdcVar2.D(I2, l13Var, set3), (wvu) qdcVar2.D(hag.I(wvu.class), l13Var, set3), (oq7) evjVar.c);
                            case 5:
                                bdt I3 = hag.I(xmf.class);
                                qdc qdcVar3 = l13Var.a;
                                Set set4 = l13Var.b;
                                xmf xmfVar = (xmf) qdcVar3.D(I3, l13Var, set4);
                                evj evjVar2 = evjVar;
                                return new cyu((cc7) evjVar2.e, xmfVar, (mm6) qdcVar3.D(hag.I(mm6.class), l13Var, set4), (frt) evjVar2.b);
                            default:
                                return new v5v((mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b), evjVar.a);
                        }
                    }
                });
                o18Var.c = hag.I(v5v.class);
                rp7Var.getClass();
                final int i12 = 6;
                rp7Var.E(new Function1() { // from class: iuu
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i102 = i12;
                        l13 l13Var = (l13) obj4;
                        l13Var.getClass();
                        switch (i102) {
                            case 0:
                                return new pmf((oq7) evjVar.c);
                            case 1:
                                return new xmf((ofo) evjVar.d, (mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b));
                            case 2:
                                bdt I = hag.I(pmf.class);
                                qdc qdcVar = l13Var.a;
                                Set set2 = l13Var.b;
                                return new nmf((pmf) qdcVar.D(I, l13Var, set2), (xmf) qdcVar.D(hag.I(xmf.class), l13Var, set2), (frt) evjVar.b, (mm6) qdcVar.D(hag.I(mm6.class), l13Var, set2));
                            case 3:
                                return new wvu((g0l) evjVar.f);
                            case 4:
                                bdt I2 = hag.I(nmf.class);
                                qdc qdcVar2 = l13Var.a;
                                Set set3 = l13Var.b;
                                return new mg5((nmf) qdcVar2.D(I2, l13Var, set3), (wvu) qdcVar2.D(hag.I(wvu.class), l13Var, set3), (oq7) evjVar.c);
                            case 5:
                                bdt I3 = hag.I(xmf.class);
                                qdc qdcVar3 = l13Var.a;
                                Set set4 = l13Var.b;
                                xmf xmfVar = (xmf) qdcVar3.D(I3, l13Var, set4);
                                evj evjVar2 = evjVar;
                                return new cyu((cc7) evjVar2.e, xmfVar, (mm6) qdcVar3.D(hag.I(mm6.class), l13Var, set4), (frt) evjVar2.b);
                            default:
                                return new v5v((mm6) l13Var.a.D(hag.I(mm6.class), l13Var, l13Var.b), evjVar.a);
                        }
                    }
                });
                return Unit.a;
            case 23:
                l0v l0vVar = (l0v) obj3;
                ((WaveGlShaderView) obj).getClass();
                c4v c4vVar = (c4v) ((sdr) obj2).getValue();
                l0vVar.getClass();
                c4vVar.getClass();
                xdr xdrVar3 = l0vVar.n;
                xdrVar3.getClass();
                xdrVar3.m(null, c4vVar);
                return Unit.a;
            case 24:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                float c2 = yhn.c(((Number) ((z7t) obj2).h.getValue()).floatValue(), 0.0f, 1.0f);
                float floatValue = ((Number) ((sdr) obj3).getValue()).floatValue() * (1.0f - (0.3f * c2));
                zcoVar.k(floatValue);
                zcoVar.n(floatValue);
                zcoVar.a(1.0f - c2);
                zcoVar.c(true);
                zcoVar.r(ugo.a(8));
                return Unit.a;
            case 25:
                aqi aqiVar = (aqi) obj2;
                d44 d44Var = (d44) obj;
                d44Var.getClass();
                ya0 ya0Var = (ya0) ((zoo) obj3).f(d44Var);
                if (ya0Var == null) {
                    return null;
                }
                float f = w0v.a;
                Function1 function1 = (Function1) aqiVar.getValue();
                if (function1 != null) {
                    function1.invoke(ya0Var);
                }
                return ya0Var;
            case 26:
                g1v g1vVar = (g1v) obj3;
                sdr sdrVar = (sdr) obj2;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                x6k x6kVar = g1vVar.h;
                long j2 = g1vVar.c;
                jpa.A0(jpaVar, ((Boolean) x6kVar.getValue()).booleanValue() ? y9w.F(u75.h(new d85(((d85) sdrVar.getValue()).a), new d85(j2)), 0.0f, 0.0f, 14) : y9w.T(u75.h(new d85(((d85) sdrVar.getValue()).a), new d85(j2)), 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.a;
            case 27:
                q6v q6vVar = (q6v) obj3;
                i4v i4vVar = (i4v) obj2;
                ((is6) obj).getClass();
                return new p7v(q6vVar.a, q6vVar.b, (z6v) i4vVar.c.getValue(), ((a7v) ((vdr) i4vVar.a.b).getValue()).o);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                v8v v8vVar = (v8v) obj3;
                b9v b9vVar = (b9v) obj2;
                lpi lpiVar = (lpi) obj;
                lpiVar.getClass();
                hmm.a aVar = v8v.h;
                String str11 = (String) lpiVar.a(aVar);
                if (str11 == null || (list = v8vVar.c().a(str11)) == null) {
                    list = c5b.a;
                }
                LinkedHashSet<b9v> z0 = CollectionsKt.z0(list);
                z0.add(b9vVar);
                y7v c3 = v8vVar.c();
                c3.getClass();
                ArrayList arrayList3 = new ArrayList(v75.o(z0, 10));
                for (b9v b9vVar2 : z0) {
                    b9vVar2.getClass();
                    arrayList3.add(new WaveWordsImpressionsParser$WaveWordsViewReportJson(b9vVar2.a));
                }
                String j3 = ((Gson) c3.a.getValue()).j(arrayList3);
                if (j3 == null) {
                    j3 = "[]";
                }
                lpiVar.h(aVar, j3);
                return Unit.a;
            default:
                v8v v8vVar2 = (v8v) obj3;
                c9v c9vVar = (c9v) obj2;
                lpi lpiVar2 = (lpi) obj;
                lpiVar2.getClass();
                hmm.a aVar2 = v8v.i;
                String str12 = (String) lpiVar2.a(aVar2);
                if (str12 == null || (list2 = v8vVar2.c().b(str12)) == null) {
                    list2 = c5b.a;
                }
                LinkedHashSet<c9v> z02 = CollectionsKt.z0(list2);
                z02.add(c9vVar);
                y7v c4 = v8vVar2.c();
                c4.getClass();
                ArrayList arrayList4 = new ArrayList(v75.o(z02, 10));
                for (c9v c9vVar2 : z02) {
                    c9vVar2.getClass();
                    arrayList4.add(new WaveWordsImpressionsParser$WaveWordsBigCardViewReportJson(c9vVar2.a, c9vVar2.b));
                }
                String j4 = ((Gson) c4.a.getValue()).j(arrayList4);
                j4.getClass();
                lpiVar2.h(aVar2, j4);
                return Unit.a;
        }
    }

    public /* synthetic */ wes(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ wes(njt njtVar, yit yitVar, spd spdVar) {
        this.a = 9;
        this.b = njtVar;
        this.c = yitVar;
    }
}
