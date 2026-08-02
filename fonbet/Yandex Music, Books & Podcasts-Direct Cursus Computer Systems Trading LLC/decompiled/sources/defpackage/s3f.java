package defpackage;

import androidx.compose.animation.c;
import com.yandex.pulse.metrics.o;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.kids.KidsCatalogHttpApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class s3f implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ s3f(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                drg drgVar = (drg) obj;
                drgVar.getClass();
                return hrg.s("blobFromBase64String(\"", drgVar.a, "\", \"", drgVar.b, "\")");
            case 1:
                mm4 mm4Var = (mm4) obj;
                mm4Var.getClass();
                mm4.a(mm4Var, "JsonPrimitive", new a5f(new sxd(18)));
                mm4.a(mm4Var, "JsonNull", new a5f(new sxd(19)));
                mm4.a(mm4Var, "JsonLiteral", new a5f(new sxd(20)));
                mm4.a(mm4Var, "JsonObject", new a5f(new sxd(21)));
                mm4.a(mm4Var, "JsonArray", new a5f(new sxd(22)));
                return Unit.a;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                w4f w4fVar = (w4f) entry.getValue();
                StringBuilder sb = new StringBuilder();
                pkr.a(str, sb);
                sb.append(':');
                sb.append(w4fVar);
                return sb.toString();
            case 3:
                return obj;
            case 4:
                f9f f9fVar = (f9f) obj;
                f9fVar.getClass();
                return (rld) leu.P(f9fVar).getConstructor(null).newInstance(null);
            case 5:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, tdf.class).E(new s3f(6));
                o18Var.b(hag.I(cef.class)).E(new s3f(7));
                return Unit.a;
            case 6:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new tdf((KidsCatalogHttpApi) ((e0j) l13Var.a.D(hag.I(e0j.class), l13Var, l13Var.b)).a.b(KidsCatalogHttpApi.class));
            case 7:
                ((l13) obj).getClass();
                return new cef();
            case 8:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, zff.class).D(new s3f(9));
                o18Var2.b(hag.I(yff.class)).E(new s3f(10));
                o18Var2.b(hag.I(lgf.class)).D(new s3f(11));
                o18Var2.b(hag.I(kgf.class)).E(new s3f(12));
                o18Var2.b(hag.I(ggf.class)).E(new s3f(13));
                return Unit.a;
            case 9:
                ((l13) obj).getClass();
                return new zff();
            case 10:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new yff((zff) l13Var2.a.D(hag.I(zff.class), l13Var2, l13Var2.b));
            case 11:
                ((l13) obj).getClass();
                return new lgf();
            case 12:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new kgf((lgf) l13Var3.a.D(hag.I(lgf.class), l13Var3, l13Var3.b));
            case 13:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                e00 e00Var = ((yff) l13Var4.a.D(hag.I(yff.class), l13Var4, l13Var4.b)).a;
                e00Var.getClass();
                return (ggf) e00Var.c(hag.I(ggf.class));
            case 14:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new ggf((frt) l13Var5.a.D(hag.I(frt.class), l13Var5, l13Var5.b));
            case 15:
                c2t c2tVar = (c2t) obj;
                c2tVar.getClass();
                return c2tVar.a.a;
            case 16:
                o18 o18Var3 = (o18) obj;
                vz1.e(o18Var3, c1e.class).D(new s3f(17));
                o18Var3.b(hag.I(z1e.class)).E(new s3f(18));
                o18Var3.b(hag.I(b2e.class)).E(new s3f(19));
                o18Var3.b(hag.I(y1e.class)).E(new s3f(20));
                o18Var3.b(hag.I(ses.class)).E(new s3f(21));
                return Unit.a;
            case 17:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new c1e(l13Var6.b(hag.I(lk5.class), true), l13Var6.b(hag.I(lj5.class), true));
            case 18:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new z1e(l13Var7.b(hag.I(c1e.class), true), l13Var7.b(hag.I(prn.class), true));
            case 19:
                ((l13) obj).getClass();
                return new b2e();
            case 20:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(z1e.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new y1e((z1e) qdcVar.C(I));
            case 21:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return (ses) ((y1e) l13Var8.a.D(hag.I(y1e.class), l13Var8, l13Var8.b)).a.getValue();
            case 22:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.w(jfpVar);
                return Unit.a;
            case 23:
                ((hl0) obj).getClass();
                return new zd6(c.e(weo.S(600, 0, null, 6), 2), c.f(weo.S(600, 0, null, 6), 2));
            case 24:
                vlf vlfVar = (vlf) obj;
                vlfVar.getClass();
                return vlfVar.getClass();
            case 25:
                o18 o18Var4 = (o18) obj;
                vz1.e(o18Var4, gkf.class).E(new s3f(27));
                o18Var4.b(hag.I(wjf.class)).E(new s3f(29));
                o18Var4.b(hag.I(zjf.class)).E(new xjf(1));
                o18Var4.b(hag.I(vjf.class)).E(new xjf(3));
                return Unit.a;
            case 26:
                o18 o18Var5 = (o18) obj;
                vz1.e(o18Var5, j5v.class).D(new s3f(28));
                o18Var5.b(hag.I(yjf.class)).D(new xjf(0));
                o18Var5.b(hag.I(akf.class)).D(new xjf(2));
                return Unit.a;
            case 27:
                ((l13) obj).getClass();
                return new gkf();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((l13) obj).getClass();
                return new j5v();
            default:
                ((l13) obj).getClass();
                return new wjf();
        }
    }
}
