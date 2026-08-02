package defpackage;

import com.yandex.media.ynison.service.a;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class san implements Function1 {
    public static final san b = new san(0);
    public static final san c = new san(1);
    public static final san d = new san(2);
    public static final san e = new san(3);
    public static final san f = new san(4);
    public static final san g = new san(5);
    public static final san h = new san(6);
    public static final san i = new san(7);
    public static final san j = new san(8);
    public static final san k = new san(9);
    public static final san l = new san(10);
    public static final san m = new san(11);
    public static final san n = new san(12);
    public static final san o = new san(13);
    public final /* synthetic */ int a;

    public /* synthetic */ san(int i2) {
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rwk rwkVar;
        switch (this.a) {
            case 0:
                d6l d6lVar = (d6l) obj;
                d6lVar.getClass();
                return new rwk(d6lVar.a.b().b());
            case 1:
                List list = (List) obj;
                list.getClass();
                throw ((Throwable) CollectionsKt.Y(list));
            case 2:
                String str = (String) obj;
                return hrg.A(str, "(", str, ")");
            case 3:
                Pair pair = (Pair) obj;
                String str2 = (pair == null || (rwkVar = (rwk) pair.a) == null) ? null : rwkVar.a;
                if (str2 != null) {
                    return new rwk(str2);
                }
                return null;
            case 4:
                mqs mqsVar = (mqs) obj;
                mqsVar.getClass();
                return hrg.s("track=(", mqsVar.a, StringUtils.COMMA, mqsVar.c, ")");
            case 5:
                String str3 = (String) obj;
                return hrg.A(str3, "'", str3, "'");
            case 6:
                String str4 = (String) obj;
                return hrg.A(str4, "'", str4, "'");
            case 7:
                return Boolean.valueOf(obj instanceof yp8);
            case 8:
                ((mqs) obj).getClass();
                return Boolean.valueOf(!r5.C());
            case 9:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 10:
                return String.valueOf(obj);
            case 11:
                vat vatVar = (vat) obj;
                vatVar.getClass();
                return new Pair(vatVar.a, ((aaq) vatVar.b).getId());
            case 12:
                String m2 = ((a) obj).k().m();
                m2.getClass();
                return m2;
            case 13:
                return Boolean.valueOf(obj instanceof iiw);
            case 14:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                oc7 oc7Var = ((mc7) l13Var.a.D(hag.I(mc7.class), l13Var, l13Var.b)).a;
                bdt I = hag.I(dst.class);
                qdc qdcVar = oc7Var.a;
                qdcVar.getClass();
                return new cst((dst) qdcVar.C(I));
            case 15:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return (nc7) ((mc7) l13Var2.a.D(hag.I(mc7.class), l13Var2, l13Var2.b)).d.getValue();
            case 16:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return (i5h) ((mc7) l13Var3.a.D(hag.I(mc7.class), l13Var3, l13Var3.b)).b.getValue();
            case 17:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return (dst) ((mc7) l13Var4.a.D(hag.I(mc7.class), l13Var4, l13Var4.b)).c.getValue();
            case 18:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                oc7 oc7Var2 = ((mc7) l13Var5.a.D(hag.I(mc7.class), l13Var5, l13Var5.b)).a;
                bdt I2 = hag.I(dst.class);
                qdc qdcVar2 = oc7Var2.a;
                qdcVar2.getClass();
                return new o3t((dst) qdcVar2.C(I2));
            case 19:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                oc7 oc7Var3 = ((mc7) l13Var6.a.D(hag.I(mc7.class), l13Var6, l13Var6.b)).a;
                bdt I3 = hag.I(dst.class);
                qdc qdcVar3 = oc7Var3.a;
                qdcVar3.getClass();
                return new p5l((dst) qdcVar3.C(I3));
            case 20:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                oc7 oc7Var4 = ((mc7) l13Var7.a.D(hag.I(mc7.class), l13Var7, l13Var7.b)).a;
                bdt I4 = hag.I(dst.class);
                qdc qdcVar4 = oc7Var4.a;
                qdcVar4.getClass();
                return new w62((dst) qdcVar4.C(I4));
            case 21:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return (z2b) ((mc7) l13Var8.a.D(hag.I(mc7.class), l13Var8, l13Var8.b)).e.getValue();
            case 22:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                oc7 oc7Var5 = ((mc7) l13Var9.a.D(hag.I(mc7.class), l13Var9, l13Var9.b)).a;
                bdt I5 = hag.I(dst.class);
                qdc qdcVar5 = oc7Var5.a;
                qdcVar5.getClass();
                return new a20((dst) qdcVar5.C(I5));
            case 23:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                oc7 oc7Var6 = ((mc7) l13Var10.a.D(hag.I(mc7.class), l13Var10, l13Var10.b)).a;
                bdt I6 = hag.I(dst.class);
                qdc qdcVar6 = oc7Var6.a;
                qdcVar6.getClass();
                return new d2l((dst) qdcVar6.C(I6));
            case 24:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                oc7 oc7Var7 = ((mc7) l13Var11.a.D(hag.I(mc7.class), l13Var11, l13Var11.b)).a;
                bdt I7 = hag.I(dst.class);
                qdc qdcVar7 = oc7Var7.a;
                qdcVar7.getClass();
                dst dstVar = (dst) qdcVar7.C(I7);
                bdt I8 = hag.I(n9w.class);
                qdc qdcVar8 = oc7Var7.a;
                qdcVar8.getClass();
                return new uou(dstVar, (n9w) qdcVar8.C(I8));
            case 25:
                return Boolean.valueOf(Intrinsics.d(((zhc) obj).a, "flex"));
            case 26:
                ((Pair) obj).getClass();
                return 1000L;
            case 27:
                Map.Entry entry = (Map.Entry) obj;
                Object t = qee.h.t((w4f) entry.getValue());
                if (t == null) {
                    return null;
                }
                return new Pair(entry.getKey(), t);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((pnk) vz1.l((l13) obj, pnk.class)).a();
            default:
                l13 l13Var12 = (l13) obj;
                l13Var12.getClass();
                return (yws) ((pnk) l13Var12.a.D(hag.I(pnk.class), l13Var12, l13Var12.b)).b.getValue();
        }
    }
}
