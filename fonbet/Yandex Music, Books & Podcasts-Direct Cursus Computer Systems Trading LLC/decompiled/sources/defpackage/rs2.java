package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Parcelable;
import com.connectsdk.service.DeviceService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class rs2 implements rzm {
    public final /* synthetic */ int a;
    public final Object b;
    public final szm c;
    public final szm d;
    public final szm e;
    public final szm f;
    public final rzm g;

    public rs2(klx klxVar, tp2 tp2Var, toe toeVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, toe toeVar2) {
        this.a = 2;
        this.c = tp2Var;
        this.d = toeVar;
        this.e = rzmVar;
        this.f = rzmVar2;
        this.b = rzmVar3;
        this.g = toeVar2;
    }

    @Override // defpackage.szm
    public final Object get() {
        int i = this.a;
        rzm rzmVar = this.g;
        Object obj = this.b;
        szm szmVar = this.f;
        szm szmVar2 = this.e;
        szm szmVar3 = this.d;
        szm szmVar4 = this.c;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                cr crVar = (cr) obj;
                xek xekVar = (xek) szmVar4.get();
                jdk jdkVar = (jdk) szmVar3.get();
                pyh pyhVar = (pyh) szmVar2.get();
                hek hekVar = (hek) szmVar.get();
                ls2 ls2Var = (ls2) rzmVar.get();
                xekVar.getClass();
                jdkVar.getClass();
                pyhVar.getClass();
                hekVar.getClass();
                ls2Var.getClass();
                Context context = xekVar.d;
                context.getClass();
                ugk ugkVar = xekVar.a;
                g86 g86Var = xekVar.b;
                x3i x3iVar = xekVar.c;
                xz0.Y(new u7w[]{u7w.b, u7w.c, u7w.a}).getClass();
                Parcelable.Creator<dnd> creator = dnd.CREATOR;
                ln lnVar = (ln) crVar.f;
                xt0 xt0Var = lnVar.d;
                xt0Var.getClass();
                List list = lnVar.c;
                list.getClass();
                boolean z = lnVar.j;
                boolean z2 = lnVar.k;
                boolean z3 = lnVar.f;
                ind indVar = lnVar.m;
                gp2 gp2Var = (gp2) crVar.g;
                String str = lnVar.h;
                String str2 = lnVar.i;
                String str3 = lnVar.n;
                int i4 = lnVar.p;
                xfk xfkVar = lnVar.b;
                xfkVar.getClass();
                String str4 = lnVar.o;
                dnd dndVar = lnVar.t;
                dndVar.getClass();
                boolean z4 = lnVar.w;
                String str5 = lnVar.A;
                String str6 = gxd.b;
                str6.getClass();
                Boolean bool = lnVar.y;
                g0c g0cVar = ls2Var.a;
                x60 x60Var = ls2Var.b;
                b0j b0jVar = ls2Var.c;
                efs efsVar = new efs();
                u75.j(new e7w());
                new LinkedHashMap();
                xfkVar.getClass();
                return new tdk(context, jdkVar, pyhVar, hekVar, gp2Var, z2, str3, i4, indVar, z3, z, str, str2, z4, xt0Var, list, new xfk(xfkVar.a, xfkVar.b, xfkVar.c, xfkVar.d, xfkVar.e, xfkVar.f, xfkVar.g), ugkVar, g86Var, str4, dndVar, x3iVar, x60Var, g0cVar, b0jVar, str5, str6, bool, efsVar);
            case 1:
                wm wmVar = (wm) szmVar4.get();
                pxf pxfVar = (pxf) szmVar3.get();
                e7w e7wVar = (e7w) szmVar2.get();
                SharedPreferences sharedPreferences = (SharedPreferences) szmVar.get();
                mm6 mm6Var = (mm6) rzmVar.get();
                Context context2 = (Context) ((cr) obj).b;
                wmVar.getClass();
                pxfVar.getClass();
                e7wVar.getClass();
                sharedPreferences.getClass();
                mm6Var.getClass();
                if (sharedPreferences.getBoolean("enableCustomTelemetry", n7w.R(q6c.F)) && Build.VERSION.SDK_INT >= 26) {
                    try {
                        String concat = pxfVar.a().concat("tracing/v1/traces");
                        Map e = uah.e(new Pair("service.name", "payment-sdk"), new Pair("host.name", concat), new Pair("payment_src", context2.getApplicationInfo().packageName), new Pair("sdk_version", "6.26.1"));
                        iwe iweVar = new iwe(context2, concat);
                        iweVar.y(e);
                        iweVar.c = mm6Var;
                        j2o j2oVar = (j2o) iweVar.b;
                        j2oVar.getClass();
                        return new btj(new dtj(context2, j2oVar, concat, (mm6) iweVar.c), wmVar);
                    } catch (Throwable th) {
                        x60 x60Var2 = new x60(u75.j(e7wVar), wmVar);
                        String str7 = zdg.q(th).a;
                        str7.getClass();
                        String concat2 = "Ошибка при инициализации OpenTelemetry: ".concat(str7);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        r1f r1fVar = r1f.a;
                        linkedHashMap.put("reason", new jkr(str7));
                        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat2));
                        vtm vtmVar = new vtm((Map) linkedHashMap);
                        ci0 ci0Var = qjb.a;
                        ci0Var.a = su4.g(1, ci0Var.a);
                        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                        x60Var2.a(su4.j(vtmVar, "event_name", "open_telemetry_error", "open_telemetry_error", vtmVar));
                    }
                }
                return new xp7();
            default:
                Context context3 = (Context) szmVar4.get();
                boolean booleanValue = ((Boolean) szmVar3.get()).booleanValue();
                eg8 eg8Var = (eg8) szmVar2.get();
                ny6 ny6Var = (ny6) szmVar.get();
                ahu ahuVar = (ahu) ((szm) obj).get();
                g0c g0cVar2 = (g0c) ((toe) rzmVar).a;
                context3.getClass();
                eg8Var.getClass();
                ny6Var.getClass();
                ahuVar.getClass();
                g0cVar2.getClass();
                ct8 ct8Var = new ct8(new wbp(context3, booleanValue));
                ct8Var.j = new bz9();
                ct8Var.b = eg8Var;
                ct8Var.b(new os8());
                ct8Var.b(new uqm(i3));
                ct8Var.f = new dz6(ny6Var, ahuVar, g0cVar2);
                ct8Var.b(new uqm(i2));
                ct8Var.h = new fa8(context3, 1);
                ct8Var.i = tah.b(new Pair("display", new fa8(context3, 0)));
                ct8Var.p = true;
                ct8Var.q = false;
                return ct8Var.a();
        }
    }

    public /* synthetic */ rs2(cr crVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, int i) {
        this.a = i;
        this.b = crVar;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.f = rzmVar4;
        this.g = rzmVar5;
    }
}
