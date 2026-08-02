package defpackage;

import android.content.Context;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.AppMetrica;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.quasar.glagol.backend.model.DeviceScope;
import ru.yandex.quasar.glagol.impl.ConnectorImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class g4d implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ g4d(imp impVar) {
        this.a = 19;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                jyr b = btf.b(new h4d(l13Var, 0));
                jyr b2 = l13Var.b(hag.I(q4d.class), true);
                jyr b3 = btf.b(new h4d(l13Var, 1));
                jyr b4 = btf.b(new c76(b, 3));
                bdt I = hag.I(zzp.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                zzp zzpVar = (zzp) qdcVar.D(I, l13Var, set);
                return new y3d(btf.b(new htb(19)), b2, btf.b(new zya(7, b3, zzpVar)), b3, b4, ((fni) qdcVar.D(hag.I(fni.class), l13Var, set)).c.c);
            case 1:
                drc drcVar = (drc) obj;
                drcVar.getClass();
                return Boolean.valueOf(drcVar.a);
            case 2:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, y76.class).E(new g4d(4));
                o18Var.b(hag.I(ked.class)).E(new g4d(5));
                o18Var.b(hag.I(jfd.class)).E(new g4d(6));
                o18Var.b(hag.I(ohd.class)).E(new g4d(7));
                o18Var.b(hag.I(akd.class)).E(new g4d(8));
                o18Var.b(hag.I(yjd.class)).E(new g4d(9));
                o18Var.b(hag.I(odd.class)).E(new g4d(10));
                o18Var.b(hag.I(c74.class)).E(new g4d(11));
                o18Var.b(hag.I(agd.class)).E(new g4d(12));
                o18Var.b(hag.I(vfd.class)).E(new g4d(3));
                return Unit.a;
            case 3:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                bdt I2 = hag.I(afw.class);
                qdc qdcVar2 = l13Var2.a;
                Set set2 = l13Var2.b;
                return new vfd((afw) qdcVar2.D(I2, l13Var2, set2), (odd) qdcVar2.D(hag.I(odd.class), l13Var2, set2), (z5l) qdcVar2.D(hag.I(z5l.class), l13Var2, set2), (wmg) qdcVar2.D(hag.I(wmg.class), l13Var2, set2), l13Var2.b(hag.I(z66.class), true));
            case 4:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                weo.g = new b3i(24);
                Context context = (Context) l13Var3.a.D(hag.I(Context.class), l13Var3, l13Var3.b);
                DeviceScope[] deviceScopeArr = {DeviceScope.AUDIO};
                EnumSet noneOf = EnumSet.noneOf(DeviceScope.class);
                noneOf.getClass();
                z75.u(noneOf, deviceScopeArr);
                String str = bow.p;
                if (str != null) {
                    return new ConnectorImpl(new p46(AppMetrica.getReporter(context, str.equals("autotest") ? "abc12345-0000-1111-2222-556667788999" : "d7fc6f68-96e6-4764-a506-50908c78d2ef"), noneOf));
                }
                Intrinsics.j("buildType");
                throw null;
            case 5:
                ((l13) obj).getClass();
                return new ked();
            case 6:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new jfd((ked) l13Var4.a.D(hag.I(ked.class), l13Var4, l13Var4.b));
            case 7:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                bdt I3 = hag.I(Context.class);
                qdc qdcVar3 = l13Var5.a;
                Set set3 = l13Var5.b;
                return new ohd((Context) qdcVar3.D(I3, l13Var5, set3), (y76) qdcVar3.D(hag.I(y76.class), l13Var5, set3), (yjd) qdcVar3.D(hag.I(yjd.class), l13Var5, set3));
            case 8:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                bdt I4 = hag.I(Context.class);
                qdc qdcVar4 = l13Var6.a;
                Set set4 = l13Var6.b;
                return new akd((Context) qdcVar4.D(I4, l13Var6, set4), (y76) qdcVar4.D(hag.I(y76.class), l13Var6, set4), (agd) qdcVar4.D(hag.I(agd.class), l13Var6, set4), (yjd) qdcVar4.D(hag.I(yjd.class), l13Var6, set4));
            case 9:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new yjd(l13Var7.b(hag.I(frt.class), true), l13Var7.b(hag.I(z66.class), true), l13Var7.b(hag.I(d6m.class), true), l13Var7.b(hag.I(fos.class), true));
            case 10:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                bdt I5 = hag.I(agd.class);
                qdc qdcVar5 = l13Var8.a;
                Set set5 = l13Var8.b;
                return new odd((agd) qdcVar5.D(I5, l13Var8, set5), (jfd) qdcVar5.D(hag.I(jfd.class), l13Var8, set5), (ked) qdcVar5.D(hag.I(ked.class), l13Var8, set5), (yjd) qdcVar5.D(hag.I(yjd.class), l13Var8, set5));
            case 11:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new c74((Context) l13Var9.a.D(hag.I(Context.class), l13Var9, l13Var9.b), l13Var9.b(hag.I(frt.class), true));
            case 12:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new agd((zzp) l13Var10.a.D(hag.I(zzp.class), l13Var10, l13Var10.b), new aub(1, pst.b, ost.class, "autoUpdating", "autoUpdating(Ljava/lang/String;)Lkotlin/Lazy;", 0, 8));
            case 13:
                ((qe5) obj).getClass();
                return Unit.a;
            case 14:
                gfw gfwVar = (gfw) obj;
                gfwVar.getClass();
                return Boolean.valueOf(gfwVar != gfw.c);
            case 15:
                g9p g9pVar = (g9p) obj;
                g9pVar.getClass();
                return o8g.Q(g9pVar);
            case 16:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 17:
                g9p g9pVar2 = (g9p) obj;
                g9pVar2.getClass();
                return o8g.Q(g9pVar2);
            case 18:
                mqs mqsVar = (mqs) obj;
                mqsVar.getClass();
                return fxf.W(mqsVar);
            case 19:
                fgd fgdVar = (fgd) obj;
                fgdVar.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userId", fgdVar.a);
                jSONObject.put("deviceId", fgdVar.b);
                jSONObject.put("name", fgdVar.c);
                jSONObject.put("platform", fgdVar.d);
                String jSONObject2 = jSONObject.toString();
                jSONObject2.getClass();
                return jSONObject2;
            case 20:
                ((Boolean) obj).booleanValue();
                return Unit.a;
            case 21:
                ((Boolean) obj).booleanValue();
                return Unit.a;
            case 22:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.w(jfpVar);
                return Unit.a;
            case 23:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.x(jfpVar2, -3.0f);
                return Unit.a;
            case 24:
                c3v c3vVar = (c3v) obj;
                if (c3vVar != null) {
                    return c3vVar.b;
                }
                return null;
            case 25:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.x(jfpVar3, 0.0f);
                return Unit.a;
            case 26:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.x(jfpVar4, -1.0f);
                return Unit.a;
            case 27:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.x(jfpVar5, -1.0f);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((jfp) obj).getClass();
                return Unit.a;
            default:
                jfp jfpVar6 = (jfp) obj;
                jfpVar6.getClass();
                wfp.q(jfpVar6, 0);
                return Unit.a;
        }
    }

    public /* synthetic */ g4d(int i) {
        this.a = i;
    }
}
