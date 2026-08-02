package defpackage;

import android.content.Context;
import com.google.gson.GsonBuilder;
import com.yandex.music.shared.dto.track.TrackDto$TrackDtoTypeAdapter$Companion$factory$1;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class phs implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ phs(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        List list;
        zvs zvsVar;
        Integer valueOf;
        Boolean bool;
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.f(jfpVar);
                return Unit.a;
            case 1:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.f(jfpVar2);
                return Unit.a;
            case 2:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.e(jfpVar3);
                return Unit.a;
            case 3:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.w(jfpVar4);
                return Unit.a;
            case 4:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.x(jfpVar5, 1.0f);
                return Unit.a;
            case 5:
                jfp jfpVar6 = (jfp) obj;
                jfpVar6.getClass();
                wfp.x(jfpVar6, 2.0f);
                return Unit.a;
            case 6:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                return u51Var.b;
            case 7:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, dzs.class).D(new phs(8));
                o18Var.b(hag.I(lf5.class)).D(new phs(9));
                o18Var.b(hag.I(fdj.class)).D(new phs(10));
                o18Var.b(hag.I(h3t.class)).E(new phs(11));
                o18Var.b(hag.I(y9b.class)).E(new phs(12));
                o18Var.b(hag.I(cej.class)).E(new phs(13));
                return Unit.a;
            case 8:
                ((l13) obj).getClass();
                return new dzs();
            case 9:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(Context.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new zf5((Context) qdcVar.D(I, l13Var, set), l13Var.b(hag.I(icu.class), true), (z66) qdcVar.D(hag.I(z66.class), l13Var, set), (ezb) qdcVar.D(hag.I(ezb.class), l13Var, set), (uaa) qdcVar.D(hag.I(uaa.class), l13Var, set), (kij) qdcVar.D(hag.I(kij.class), l13Var, set));
            case 10:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                bdt I2 = hag.I(r1l.class);
                qdc qdcVar2 = l13Var2.a;
                Set set2 = l13Var2.b;
                return new fdj((r1l) qdcVar2.D(I2, l13Var2, set2), (t3g) qdcVar2.D(hag.I(t3g.class), l13Var2, set2), (lf5) qdcVar2.D(hag.I(lf5.class), l13Var2, set2));
            case 11:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I3 = hag.I(i5h.class);
                qdc qdcVar3 = l13Var3.a;
                Set set3 = l13Var3.b;
                return new h3t((et) qdcVar3.D(hag.I(et.class), l13Var3, set3), (p51) qdcVar3.D(hag.I(p51.class), l13Var3, set3), (i5h) qdcVar3.D(I3, l13Var3, set3), (rtl) qdcVar3.D(hag.I(rtl.class), l13Var3, set3), (i2m) qdcVar3.D(hag.I(i2m.class), l13Var3, set3), (rus) qdcVar3.D(hag.I(rus.class), l13Var3, set3), new xus(0, l13Var3));
            case 12:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new y9b((e0j) l13Var4.a.D(hag.I(e0j.class), l13Var4, l13Var4.b));
            case 13:
                ((l13) obj).getClass();
                return new cej();
            case 14:
                jfp jfpVar7 = (jfp) obj;
                jfpVar7.getClass();
                wfp.c(jfpVar7);
                return Unit.a;
            case 15:
                jfp jfpVar8 = (jfp) obj;
                jfpVar8.getClass();
                wfp.w(jfpVar8);
                return Unit.a;
            case 16:
                jfp jfpVar9 = (jfp) obj;
                jfpVar9.getClass();
                wfp.x(jfpVar9, 1.0f);
                return Unit.a;
            case 17:
                jfp jfpVar10 = (jfp) obj;
                jfpVar10.getClass();
                wfp.x(jfpVar10, 2.0f);
                return Unit.a;
            case 18:
                jfp jfpVar11 = (jfp) obj;
                jfpVar11.getClass();
                wfp.t(jfpVar11, "share_button");
                return Unit.a;
            case 19:
                jfp jfpVar12 = (jfp) obj;
                jfpVar12.getClass();
                wfp.c(jfpVar12);
                return Unit.a;
            case 20:
                mqs mqsVar = (mqs) obj;
                mqsVar.getClass();
                return Boolean.valueOf(mqsVar.u == null);
            case 21:
                mqs mqsVar2 = (mqs) obj;
                mqsVar2.getClass();
                return mqsVar2.f;
            case 22:
                zp2 zp2Var = (zp2) obj;
                zp2Var.getClass();
                return zp2Var.a;
            case 23:
                xxq xxqVar = (xxq) obj;
                xxqVar.getClass();
                return xxqVar.a;
            case 24:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("SELECT * FROM track_operation ORDER BY _id");
                try {
                    int v = s7g.v(D0, "_id");
                    int v2 = s7g.v(D0, "playlist_id");
                    int v3 = s7g.v(D0, "operation");
                    int v4 = s7g.v(D0, "position");
                    int v5 = s7g.v(D0, "track_id");
                    int v6 = s7g.v(D0, "album_id");
                    int v7 = s7g.v(D0, "timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(new jys(D0.isNull(v) ? null : Long.valueOf(D0.getLong(v)), D0.isNull(v2) ? null : Long.valueOf(D0.getLong(v2)), D0.isNull(v3) ? null : Integer.valueOf((int) D0.getLong(v3)), D0.isNull(v4) ? null : Integer.valueOf((int) D0.getLong(v4)), D0.isNull(v5) ? null : D0.x0(v5), D0.isNull(v6) ? null : D0.x0(v6), D0.isNull(v7) ? null : Long.valueOf(D0.getLong(v7))));
                    }
                    return arrayList;
                } finally {
                }
            case 25:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("SELECT count(*) FROM track_operation");
                try {
                    int i = D0.q() ? (int) D0.getLong(0) : 0;
                    D0.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 26:
                Pair pair = (Pair) obj;
                if (pair == null || (list = (List) pair.b) == null) {
                    return null;
                }
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((mqs) it.next()).a);
                }
                return arrayList2;
            case 27:
                ((String) obj).getClass();
                return Boolean.valueOf(!StringsKt.U(r0));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.e.add(new TrackDto$TrackDtoTypeAdapter$Companion$factory$1());
                return Unit.a;
            default:
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("SELECT * FROM tracks_cache");
                try {
                    int v8 = s7g.v(D0, "track_id");
                    int v9 = s7g.v(D0, "quality");
                    int v10 = s7g.v(D0, "storage");
                    int v11 = s7g.v(D0, "cache_type");
                    int v12 = s7g.v(D0, "container");
                    int v13 = s7g.v(D0, "added_timestamp");
                    int v14 = s7g.v(D0, "uri");
                    int v15 = s7g.v(D0, "gain");
                    int v16 = s7g.v(D0, "truePeakDb");
                    int v17 = s7g.v(D0, "integratedLoudnessDb");
                    int v18 = s7g.v(D0, "codec");
                    int v19 = s7g.v(D0, "bitrate");
                    int v20 = s7g.v(D0, "realQuality");
                    ArrayList arrayList3 = new ArrayList();
                    while (D0.q()) {
                        String x0 = D0.x0(v8);
                        x0.getClass();
                        int i2 = v8;
                        zvs zvsVar2 = new zvs(x0);
                        o5n W = c9g.W(D0.x0(v9));
                        thr X = c9g.X(D0.x0(v10));
                        css O = c9g.O(D0.x0(v11));
                        bb6 Q = c9g.Q(D0.x0(v12));
                        long j = D0.getLong(v13);
                        String x02 = D0.x0(v14);
                        if (D0.isNull(v15)) {
                            zvsVar = zvsVar2;
                            valueOf = null;
                        } else {
                            zvsVar = zvsVar2;
                            valueOf = Integer.valueOf((int) D0.getLong(v15));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        arrayList3.add(new n3t(zvsVar, W, X, O, Q, j, x02, bool, D0.isNull(v16) ? null : Float.valueOf((float) D0.getDouble(v16)), D0.isNull(v17) ? null : Float.valueOf((float) D0.getDouble(v17)), c9g.P(D0.x0(v18)), (int) D0.getLong(v19), c9g.W(D0.x0(v20))));
                        v8 = i2;
                    }
                    return arrayList3;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
