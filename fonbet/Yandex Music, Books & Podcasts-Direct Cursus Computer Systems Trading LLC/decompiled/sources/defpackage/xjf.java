package defpackage;

import android.content.Context;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class xjf implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ xjf(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                return new yjf();
            case 1:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new zjf((Context) l13Var.a.D(hag.I(Context.class), l13Var, l13Var.b));
            case 2:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(y18.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new akf((y18) qdcVar.C(I));
            case 3:
                ((l13) obj).getClass();
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(wjf.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return new vjf((wjf) qdcVar2.C(I2));
            case 4:
                mqs mqsVar = (mqs) obj;
                mqsVar.getClass();
                return mqsVar.a;
            case 5:
                mqs mqsVar2 = (mqs) obj;
                mqsVar2.getClass();
                return mqsVar2.a;
            case 6:
                mqs mqsVar3 = (mqs) obj;
                mqsVar3.getClass();
                return mqsVar3.a;
            case 7:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.n(jfpVar, 0);
                return Unit.a;
            case 8:
                ec7.d((lpi) obj, "bottom_sheet_showed", true);
                return Unit.a;
            case 9:
                ((jfp) obj).getClass();
                return Unit.a;
            case 10:
                a3g a3gVar = (a3g) obj;
                a3gVar.getClass();
                return a3gVar.getClass();
            case 11:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, t3g.class).E(new xjf(12));
                o18Var.b(hag.I(u3g.class)).E(new xjf(13));
                o18Var.b(hag.I(vzf.class)).E(new xjf(14));
                o18Var.b(hag.I(i4g.class)).E(new xjf(15));
                o18Var.b(hag.I(b4g.class)).E(new xjf(16));
                o18Var.b(hag.I(z3g.class)).D(new xjf(17));
                o18Var.b(hag.I(i7a.class)).E(new xjf(18));
                return Unit.a;
            case 12:
                ((l13) obj).getClass();
                return new t3g();
            case 13:
                return (u3g) vz1.l((l13) obj, t3g.class);
            case 14:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new vzf((Context) l13Var2.a.D(hag.I(Context.class), l13Var2, l13Var2.b));
            case 15:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new i4g((Context) l13Var3.a.D(hag.I(Context.class), l13Var3, l13Var3.b));
            case 16:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new b4g((i4g) l13Var4.a.D(hag.I(i4g.class), l13Var4, l13Var4.b));
            case 17:
                ((l13) obj).getClass();
                return new z3g();
            case 18:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new i7a(l13Var5.b(hag.I(ay.class), true), l13Var5.b(hag.I(cut.class), true), l13Var5.b(hag.I(k21.class), true), l13Var5.b(hag.I(t3g.class), true), l13Var5.b(hag.I(g2q.class), true));
            case 19:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("SELECT * FROM video_clip_operation");
                try {
                    int v = s7g.v(D0, "video_clip_id");
                    int v2 = s7g.v(D0, "operation");
                    int v3 = s7g.v(D0, "timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(new h5u(D0.x0(v), (int) D0.getLong(v2), D0.getLong(v3)));
                    }
                    return arrayList;
                } finally {
                }
            case 20:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("SELECT * FROM playlist_operation");
                try {
                    int v4 = s7g.v(D0, "playlist_id");
                    int v5 = s7g.v(D0, "operation");
                    ArrayList arrayList2 = new ArrayList();
                    while (D0.q()) {
                        arrayList2.add(new uwl(D0.x0(v4), D0.isNull(v5) ? null : Integer.valueOf((int) D0.getLong(v5))));
                    }
                    return arrayList2;
                } finally {
                }
            case 21:
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("SELECT * FROM artist_operation");
                try {
                    int v6 = s7g.v(D0, "artist_id");
                    int v7 = s7g.v(D0, "operation");
                    ArrayList arrayList3 = new ArrayList();
                    while (D0.q()) {
                        arrayList3.add(new re1(D0.x0(v6), D0.isNull(v7) ? null : Integer.valueOf((int) D0.getLong(v7))));
                    }
                    return arrayList3;
                } finally {
                }
            case 22:
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                D0 = xjoVar4.D0("SELECT * FROM album_operation");
                try {
                    int v8 = s7g.v(D0, "album_id");
                    int v9 = s7g.v(D0, "operation");
                    ArrayList arrayList4 = new ArrayList();
                    while (D0.q()) {
                        arrayList4.add(new ew(D0.x0(v8), D0.isNull(v9) ? null : Integer.valueOf((int) D0.getLong(v9))));
                    }
                    return arrayList4;
                } finally {
                }
            case 23:
                return (vjg) obj;
            case 24:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new fkg((cc7) l13Var6.a.D(hag.I(cc7.class), l13Var6, l13Var6.b));
            case 25:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                jyr b = l13Var7.b(hag.I(qiw.class), true);
                bdt I3 = hag.I(g3t.class);
                qdc qdcVar3 = l13Var7.a;
                Set set = l13Var7.b;
                return new ocn(b, (g3t) qdcVar3.D(I3, l13Var7, set), (frt) qdcVar3.D(hag.I(frt.class), l13Var7, set), (fkg) qdcVar3.D(hag.I(fkg.class), l13Var7, set), (oq7) qdcVar3.D(hag.I(oq7.class), l13Var7, set), (umg) qdcVar3.D(hag.I(umg.class), l13Var7, set), (jmg) qdcVar3.D(hag.I(jmg.class), l13Var7, set));
            case 26:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                bdt I4 = hag.I(oq7.class);
                qdc qdcVar4 = l13Var8.a;
                Set set2 = l13Var8.b;
                return new aa2((oq7) qdcVar4.D(I4, l13Var8, set2), (ocn) qdcVar4.D(hag.I(ocn.class), l13Var8, set2), (umg) qdcVar4.D(hag.I(umg.class), l13Var8, set2), (jmg) qdcVar4.D(hag.I(jmg.class), l13Var8, set2));
            case 27:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                bdt I5 = hag.I(ocn.class);
                qdc qdcVar5 = l13Var9.a;
                Set set3 = l13Var9.b;
                return new wmg((ocn) qdcVar5.D(I5, l13Var9, set3), (aa2) qdcVar5.D(hag.I(aa2.class), l13Var9, set3), (jmg) qdcVar5.D(hag.I(jmg.class), l13Var9, set3), (umg) qdcVar5.D(hag.I(umg.class), l13Var9, set3));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                vz1.e((o18) obj, un7.class).E(new xjf(29));
                return Unit.a;
            default:
                ((l13) obj).getClass();
                l18 l18Var3 = l18.b;
                bdt I6 = hag.I(y60.class);
                qdc qdcVar6 = l18Var3.a;
                qdcVar6.getClass();
                return new un7((y60) qdcVar6.C(I6));
        }
    }
}
