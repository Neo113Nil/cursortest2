package defpackage;

import android.net.Uri;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class ci1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ci1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean d;
        cko D0;
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                return gi1.a;
            case 1:
                ((l13) obj).getClass();
                return new b11();
            case 2:
                ((l13) obj).getClass();
                return hi1.a;
            case 3:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new il1((aoi) l13Var.a.D(hag.I(aoi.class), l13Var, l13Var.b));
            case 4:
                ((l13) obj).getClass();
                return ii1.a;
            case 5:
                ((l13) obj).getClass();
                return new xc1();
            case 6:
                ((l13) obj).getClass();
                return ei1.a;
            case 7:
                ((l13) obj).getClass();
                return new di1();
            case 8:
                ((l13) obj).getClass();
                return new b71();
            case 9:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new go1(a6e.a((a6e) l13Var2.a.D(hag.I(a6e.class), l13Var2, l13Var2.b)));
            case 10:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                fi1 fi1Var = new fi1(0);
                bdt I = hag.I(go1.class);
                qdc qdcVar = l13Var3.a;
                Set set = l13Var3.b;
                return new ab1((go1) qdcVar.D(I, l13Var3, set), fi1Var, (z66) qdcVar.D(hag.I(z66.class), l13Var3, set));
            case 11:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                bdt I2 = hag.I(go1.class);
                qdc qdcVar2 = l13Var4.a;
                Set set2 = l13Var4.b;
                return new z91((go1) qdcVar2.D(I2, l13Var4, set2), (ab1) qdcVar2.D(hag.I(ab1.class), l13Var4, set2));
            case 12:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new tj1(new hjq(2), new pa1(16), new b71(), l13Var5.b(hag.I(ab1.class), true));
            case 13:
                ((l13) obj).getClass();
                return new ng1(new mg1(0));
            case 14:
                ((l13) obj).getClass();
                return new d51(0);
            case 15:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new ogq((k21) l13Var6.a.D(hag.I(k21.class), l13Var6, l13Var6.b));
            case 16:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.x(jfpVar, 1.0f);
                return Unit.a;
            case 17:
                Uri uri = (Uri) obj;
                uri.getClass();
                if (Intrinsics.d(uri.getScheme(), "https")) {
                    List<String> pathSegments = uri.getPathSegments();
                    pathSegments.getClass();
                    d = Intrinsics.d(CollectionsKt.S(pathSegments, 0), "artist");
                } else {
                    d = Intrinsics.d(uri.getHost(), "artist");
                }
                return Boolean.valueOf(d);
            case 18:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("SELECT * FROM artist WHERE disliked = 1");
                try {
                    int v = s7g.v(D0, "original_id");
                    int v2 = s7g.v(D0, "name");
                    int v3 = s7g.v(D0, "name_surrogate");
                    int v4 = s7g.v(D0, "liked");
                    int v5 = s7g.v(D0, "disliked");
                    int v6 = s7g.v(D0, "timestamp");
                    int v7 = s7g.v(D0, "various");
                    int v8 = s7g.v(D0, "cover_uri");
                    int v9 = s7g.v(D0, "albums_stale");
                    int v10 = s7g.v(D0, "tracks_stale");
                    int v11 = s7g.v(D0, "artist_for_kids");
                    int v12 = s7g.v(D0, "artist_disclaimer");
                    int v13 = s7g.v(D0, "available");
                    int v14 = s7g.v(D0, "cover_type");
                    int v15 = s7g.v(D0, "cutout_cover_uri");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        String x0 = D0.x0(v);
                        String x02 = D0.x0(v2);
                        String x03 = D0.x0(v3);
                        int i = v2;
                        int i2 = v3;
                        int i3 = v4;
                        int i4 = v15;
                        arrayList.add(new q51(x0, x02, x03, ((int) D0.getLong(v4)) != 0, ((int) D0.getLong(v5)) != 0, D0.x0(v6), ((int) D0.getLong(v7)) != 0, D0.isNull(v8) ? null : D0.x0(v8), (int) D0.getLong(v9), (int) D0.getLong(v10), ((int) D0.getLong(v11)) != 0, D0.isNull(v12) ? null : D0.x0(v12), ((int) D0.getLong(v13)) != 0, D0.isNull(v14) ? null : D0.x0(v14), D0.isNull(i4) ? null : D0.x0(i4)));
                        v15 = i4;
                        v2 = i;
                        v3 = i2;
                        v4 = i3;
                    }
                    return arrayList;
                } finally {
                }
            case 19:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("SELECT original_id, timestamp FROM artist WHERE disliked = 1 ORDER BY timestamp DESC");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (D0.q()) {
                        arrayList2.add(new jx0(D0.x0(0), D0.x0(1)));
                    }
                    return arrayList2;
                } finally {
                }
            case 20:
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("SELECT original_id, timestamp FROM artist WHERE liked = 1 ORDER BY timestamp DESC");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (D0.q()) {
                        arrayList3.add(new jx0(D0.x0(0), D0.x0(1)));
                    }
                    return arrayList3;
                } finally {
                }
            case 21:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.g(jfpVar2);
                return Unit.a;
            case 22:
                dn1 dn1Var = (dn1) obj;
                dn1Var.getClass();
                return dn1Var.a.a;
            case 23:
                ((jsk) obj).getClass();
                return Unit.a;
            case 24:
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vufVar.Z(5, null, vsf.v, vut.c);
                return Unit.a;
            case 25:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new gjr(l13Var7.b(hag.I(cc7.class), true));
            case 26:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return new nv1(dm6.c, l13Var8.b(hag.I(gjr.class), true));
            case 27:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new qv1(l13Var9);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new ov1((qv1) l13Var10.a.D(hag.I(qv1.class), l13Var10, l13Var10.b));
            default:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                return (nv1) ((ov1) l13Var11.a.D(hag.I(ov1.class), l13Var11, l13Var11.b)).a.getValue();
        }
    }
}
