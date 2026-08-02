package defpackage;

import android.app.Activity;
import android.content.Context;
import android.database.DatabaseUtils;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class m2j implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y supportFragmentManager;
        switch (this.a) {
            case 0:
                joj jojVar = (joj) obj;
                jojVar.getClass();
                jojVar.e(10L, TimeUnit.SECONDS);
                return Unit.a;
            case 1:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                jpa.D0(opfVar, d85.m, 0.0f, 0L, 0.0f, null, 0, 126);
                ou3 ou3Var = opfVar.a;
                float intBitsToFloat = ((Float.intBitsToFloat((int) (ou3Var.e() & 4294967295L)) - (ou3Var.L(107) / 2)) - opfVar.n0(16)) - opfVar.n0(2);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ou3Var.e() >> 32));
                nsh nshVar = ou3Var.b;
                long B = nshVar.B();
                nshVar.s().r();
                try {
                    ((xzi) nshVar.b).W(0.0f, 0.0f, intBitsToFloat2, intBitsToFloat, 1);
                    opfVar.a();
                    vz1.A(nshVar, B);
                    return Unit.a;
                } catch (Throwable th) {
                    vz1.A(nshVar, B);
                    throw th;
                }
            case 2:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.x(jfpVar, 1.0f);
                return Unit.a;
            case 3:
                opf opfVar2 = (opf) obj;
                opfVar2.getClass();
                jpa.D0(opfVar2, c3x.h(4287221203L), 0.0f, 0L, 0.0f, null, 0, 126);
                return Unit.a;
            case 4:
                ((jfp) obj).getClass();
                return Unit.a;
            case 5:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                return u51Var.b;
            case 6:
                u51 u51Var2 = (u51) obj;
                u51Var2.getClass();
                return u51Var2.b;
            case 7:
                String str = (String) obj;
                str.getClass();
                String sqlEscapeString = DatabaseUtils.sqlEscapeString(str);
                sqlEscapeString.getClass();
                return sqlEscapeString;
            case 8:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, haj.class).E(new m2j(9));
                o18Var.b(hag.I(iaj.class)).D(new m2j(10));
                return Unit.a;
            case 9:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new haj(l13Var);
            case 10:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new iaj(l13Var2);
            case 11:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, kaj.class).D(new m2j(12));
                o18Var2.b(hag.I(laj.class)).D(new m2j(13));
                o18Var2.b(hag.I(maj.class)).D(new m2j(14));
                o18Var2.b(hag.I(naj.class)).D(new m2j(15));
                return Unit.a;
            case 12:
                ((l13) obj).getClass();
                return new kaj();
            case 13:
                ((l13) obj).getClass();
                return new laj();
            case 14:
                ((l13) obj).getClass();
                return new maj();
            case 15:
                ((l13) obj).getClass();
                return new naj();
            case 16:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 17:
                u51 u51Var3 = (u51) obj;
                u51Var3.getClass();
                return u51Var3.b;
            case 18:
                o18 o18Var3 = (o18) obj;
                vz1.e(o18Var3, k8w.class).E(new m2j(19));
                o18Var3.b(hag.I(xbj.class)).D(new m2j(20));
                return Unit.a;
            case 19:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I = hag.I(frt.class);
                qdc qdcVar = l13Var3.a;
                Set set = l13Var3.b;
                return new m8w((frt) qdcVar.D(I, l13Var3, set), (Context) qdcVar.D(hag.I(Context.class), l13Var3, set));
            case 20:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new xbj(l13Var4);
            case 21:
                ((jfp) obj).getClass();
                return Unit.a;
            case 22:
                eej eejVar = (eej) obj;
                eejVar.getClass();
                return eejVar.b.a;
            case 23:
                vz1.e((o18) obj, pfj.class).E(new m2j(24));
                return Unit.a;
            case 24:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new pfj((Context) l13Var5.a.D(hag.I(Context.class), l13Var5, l13Var5.b));
            case 25:
                vz1.e((o18) obj, rwc.class).E(new m2j(26));
                return Unit.a;
            case 26:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new rwc(new gs4(l13Var6.b(hag.I(z66.class), true), l13Var6.b(hag.I(frt.class), true), l13Var6.b(hag.I(k5m.class), true), l13Var6.b(hag.I(sw0.class), true), l13Var6.b(hag.I(mh7.class), true)));
            case 27:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                jyr jyrVar = dvu.e;
                return new llj(kwl.c().g, l13Var7.b(hag.I(frt.class), true), l13Var7.b(hag.I(rlj.class), true), l13Var7.b(hag.I(mvu.class), true), l13Var7.b(hag.I(hks.class), true), l13Var7.b(hag.I(t70.class), true));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Activity activity = (Activity) obj;
                activity.getClass();
                np2 np2Var = activity instanceof np2 ? (np2) activity : null;
                if (np2Var == null || (supportFragmentManager = np2Var.getSupportFragmentManager()) == null) {
                    return null;
                }
                return supportFragmentManager.c.f();
            default:
                androidx.fragment.app.o oVar = (androidx.fragment.app.o) obj;
                jnb jnbVar = oVar instanceof jnb ? (jnb) oVar : null;
                if (jnbVar == null || jnbVar.getT() == gfo.Player) {
                    return null;
                }
                return jnbVar;
        }
    }

    public /* synthetic */ m2j(int i) {
        this.a = i;
    }
}
