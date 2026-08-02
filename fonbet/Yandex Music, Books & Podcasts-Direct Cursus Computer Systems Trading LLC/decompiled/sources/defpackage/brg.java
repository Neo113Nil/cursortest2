package defpackage;

import android.content.Context;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes3.dex */
public final /* synthetic */ class brg implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ brg(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                return th.getCause();
            case 1:
                Object obj2 = ((Pair) obj).b;
                String obj3 = obj2 != null ? obj2.toString() : null;
                return Boolean.valueOf(!(obj3 == null || obj3.length() == 0));
            case 2:
                xxq xxqVar = (xxq) obj;
                xxqVar.getClass();
                return Boolean.valueOf(xxqVar.a());
            case 3:
                xxq xxqVar2 = (xxq) obj;
                xxqVar2.getClass();
                return Boolean.valueOf(xxqVar2.a());
            case 4:
                ((jfp) obj).getClass();
                return Unit.a;
            case 5:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, rvg.class).D(new brg(6));
                o18Var.b(hag.I(bwg.class)).E(new brg(7));
                return Unit.a;
            case 6:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new rvg(l13Var.b(hag.I(lwc.class), true));
            case 7:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(Context.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                Context context = (Context) qdcVar.C(I);
                bdt I2 = hag.I(t3g.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                t3g t3gVar = (t3g) qdcVar2.C(I2);
                bdt I3 = hag.I(z5l.class);
                qdc qdcVar3 = l18Var.a;
                qdcVar3.getClass();
                z5l z5lVar = (z5l) qdcVar3.C(I3);
                bdt I4 = hag.I(e.class);
                qdc qdcVar4 = l18Var.a;
                qdcVar4.getClass();
                e eVar = (e) qdcVar4.C(I4);
                bdt I5 = hag.I(g0l.class);
                qdc qdcVar5 = l18Var.a;
                qdcVar5.getClass();
                g0l g0lVar = (g0l) qdcVar5.C(I5);
                bdt I6 = hag.I(mg5.class);
                qdc qdcVar6 = l18Var.a;
                qdcVar6.getClass();
                mg5 mg5Var = (mg5) qdcVar6.C(I6);
                bdt I7 = hag.I(cut.class);
                qdc qdcVar7 = l18Var.a;
                qdcVar7.getClass();
                cut cutVar = (cut) qdcVar7.C(I7);
                bdt I8 = hag.I(ay.class);
                qdc qdcVar8 = l18Var.a;
                qdcVar8.getClass();
                ay ayVar = (ay) qdcVar8.C(I8);
                bdt I9 = hag.I(k21.class);
                qdc qdcVar9 = l18Var.a;
                qdcVar9.getClass();
                k21 k21Var = (k21) qdcVar9.C(I9);
                bdt I10 = hag.I(raa.class);
                qdc qdcVar10 = l18Var.a;
                qdcVar10.getClass();
                return new bwg(context, t3gVar, z5lVar, eVar, g0lVar, mg5Var, cutVar, k21Var, ayVar, (raa) qdcVar10.C(I10));
            case 8:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                return u51Var.b;
            case 9:
                String str = (String) obj;
                str.getClass();
                return str;
            case 10:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                mu3 s = opfVar.q0().s();
                ynn d = ywf.d(0L, opfVar.a.e());
                gh0 p = hld.p();
                p.d(20);
                s.m(d, p);
                opfVar.a();
                opfVar.q0().s().k();
                return Unit.a;
            case 11:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, t0h.class).E(new brg(12));
                o18Var2.b(hag.I(r0h.class)).E(new brg(13));
                o18Var2.b(hag.I(q0h.class)).E(new brg(14));
                o18Var2.b(hag.I(u0h.class)).E(new brg(15));
                o18Var2.b(hag.I(v0h.class)).E(new brg(16));
                o18Var2.b(hag.I(d1h.class)).E(new brg(17));
                o18Var2.b(hag.I(x0h.class)).E(new brg(18));
                return Unit.a;
            case 12:
                ((l13) obj).getClass();
                return new t0h();
            case 13:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new r0h((t0h) l13Var2.a.D(hag.I(t0h.class), l13Var2, l13Var2.b));
            case 14:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return (q0h) ((r0h) l13Var3.a.D(hag.I(r0h.class), l13Var3, l13Var3.b)).a.getValue();
            case 15:
                ((l13) obj).getClass();
                return new u0h(l18.b.b(hag.I(uz1.class), true));
            case 16:
                ((l13) obj).getClass();
                return new v0h();
            case 17:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new d1h((v0h) l13Var4.a.D(hag.I(v0h.class), l13Var4, l13Var4.b));
            case 18:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return (x0h) ((d1h) l13Var5.a.D(hag.I(d1h.class), l13Var5, l13Var5.b)).b.getValue();
            case 19:
                ((l13) obj).getClass();
                return pd.t(new qzm[0]);
            case 20:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                bdt I11 = hag.I(q0h.class);
                qdc qdcVar11 = l13Var6.a;
                Set set = l13Var6.b;
                return new x0h((q0h) qdcVar11.D(I11, l13Var6, set), (u0h) qdcVar11.D(hag.I(u0h.class), l13Var6, set), (oev) qdcVar11.D(hag.I(oev.class), l13Var6, set), (pu0) qdcVar11.D(hag.I(pu0.class), l13Var6, set), ((f1h) f1h.e.getValue()).a().b("playButtonShowDelayMs") != null ? r2.intValue() : 0L);
            case 21:
                o18 o18Var3 = (o18) obj;
                vz1.e(o18Var3, i1h.class).E(new brg(22));
                o18Var3.b(hag.I(j1h.class)).E(new brg(23));
                return Unit.a;
            case 22:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new i1h((j1h) l13Var7.a.D(hag.I(j1h.class), l13Var7, l13Var7.b));
            case 23:
                ((l13) obj).getClass();
                return new j1h();
            case 24:
                ((jfp) obj).getClass();
                return Unit.a;
            case 25:
                o18 o18Var4 = (o18) obj;
                vz1.e(o18Var4, n3h.class).E(new brg(26));
                o18Var4.b(hag.I(z1h.class)).E(new brg(27));
                o18Var4.b(hag.I(w2h.class)).E(new brg(28));
                return Unit.a;
            case 26:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                e0j e0jVar = (e0j) l13Var8.a.D(hag.I(e0j.class), l13Var8, l13Var8.b);
                l18 l18Var2 = l18.b;
                bdt I12 = hag.I(zzp.class);
                qdc qdcVar12 = l18Var2.a;
                qdcVar12.getClass();
                return new n3h(e0jVar, (zzp) qdcVar12.C(I12));
            case 27:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                bdt I13 = hag.I(n3h.class);
                qdc qdcVar13 = l13Var9.a;
                Set set2 = l13Var9.b;
                return new z1h((n3h) qdcVar13.D(I13, l13Var9, set2), (zzp) qdcVar13.D(hag.I(zzp.class), l13Var9, set2), l13Var9.b(hag.I(lwc.class), true));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new w2h((z1h) l13Var10.a.D(hag.I(z1h.class), l13Var10, l13Var10.b));
            default:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.d(1);
                return Unit.a;
        }
    }
}
