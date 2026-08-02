package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.DeviceService;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public final class bic implements bse {
    public final /* synthetic */ dj2 a;
    public final /* synthetic */ pyh b;
    public final /* synthetic */ wm c;
    public final /* synthetic */ g0c d;
    public final /* synthetic */ jdk e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ bhg g;

    public bic(dj2 dj2Var, pyh pyhVar, wm wmVar, cic cicVar, g0c g0cVar, jdk jdkVar, Context context, bhg bhgVar) {
        this.a = dj2Var;
        this.b = pyhVar;
        this.c = wmVar;
        this.d = g0cVar;
        this.e = jdkVar;
        this.f = context;
        this.g = bhgVar;
    }

    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        String str;
        String str2;
        qne q0;
        String str3;
        dj2 dj2Var = this.a;
        w7o h = qdq.h(dj2Var.b(), 0L);
        u7o u7oVar = h instanceof u7o ? (u7o) h : null;
        n9i n9iVar = u7oVar != null ? (n9i) u7oVar.a : null;
        jdk jdkVar = this.e;
        if ((n9iVar == null || (str = n9iVar.b) == null) && (str = jdkVar.c) == null) {
            str = "";
        }
        if ((n9iVar == null || (str2 = n9iVar.a) == null) && (str2 = jdkVar.a) == null) {
            str2 = "";
        }
        String e = eta.e();
        d0o d0oVar = (d0o) uknVar.i;
        b0o b = d0oVar.b();
        h0o h0oVar = d0oVar.d;
        u7e u7eVar = d0oVar.a;
        b.d(HttpMessage.USER_AGENT, gxd.b);
        b.d("X-Request-ID", e);
        b.d("X-SDK-Version", "6.26.1");
        b.d("X-SERVICE-TOKEN", this.b.a);
        b.d("X-SDK-PLATFORM", ConstantDeviceInfo.APP_PLATFORM);
        b.d("X-UID", str);
        b.d(HttpMessage.CONTENT_TYPE_HEADER, "application/json");
        b.d("Authorization", "OAuth ".concat(str2));
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        b.d("Accept-Language", language);
        Object obj = uah.q(this.c.b).get("api_instance_id");
        if (obj == null) {
            obj = "";
        }
        b.d("trace_id", (String) obj);
        String uuid = AppMetrica.getUuid(this.f);
        if (uuid != null) {
            b.d("X-UUID", uuid);
        }
        b.e(d0oVar.b, h0oVar);
        d0o b2 = b.b();
        String str4 = u7eVar.d;
        if (h0oVar != null) {
            String b3 = u7eVar.b();
            try {
                hi3 hi3Var = new hi3();
                h0oVar.d(hi3Var);
                str3 = hi3Var.G0();
            } catch (Exception e2) {
                LinkedHashMap linkedHashMap = sqg.a;
                uwf.l("Error converting request body to string: " + e2.getMessage());
                str3 = "";
            }
            str4.getClass();
            StringBuilder sb = new StringBuilder("Выполнение сетевого запроса по адресу ");
            sb.append(str4);
            sb.append(" в ручку ");
            sb.append(b3);
            String s = vz1.s(sb, " с параметрами: request_id = ", e, ", traceparent = ");
            z9h z9hVar = new z9h();
            z9hVar.j("body", str3);
            z9hVar.j("target_path", b3);
            z9hVar.j("traceparent", "");
            z9hVar.j(CommonUrlParts.REQUEST_ID, e);
            z9hVar.j(DeviceService.KEY_DESC, s);
            z9hVar.j("host", str4);
            Map map = z9hVar.b;
            map.getClass();
            vtm vtmVar = new vtm(map);
            ci0 ci0Var = qjb.a;
            ci0Var.a = su4.g(1, ci0Var.a);
            vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
            q0 = su4.j(vtmVar, "event_name", "perform_request", "perform_request", vtmVar);
        } else {
            q0 = gut.q0(u7eVar.b(), "", e, str4);
        }
        x60 x60Var = (x60) this.d;
        x60Var.a(q0);
        l3o f = uknVar.f(b2);
        if (cic.a.contains(Integer.valueOf(f.d))) {
            w7o h2 = qdq.h(dj2Var.a(), 0L);
            u7o u7oVar2 = h2 instanceof u7o ? (u7o) h2 : null;
            if (u7oVar2 != null && ((Boolean) u7oVar2.a).booleanValue()) {
                w7o h3 = qdq.h(dj2Var.b(), 0L);
                u7o u7oVar3 = h3 instanceof u7o ? (u7o) h3 : null;
                n9i n9iVar2 = u7oVar3 != null ? (n9i) u7oVar3.a : null;
                b0o b4 = b2.b();
                b4.d("Authorization", "OAuth " + (n9iVar2 != null ? n9iVar2.a : null));
                f = uknVar.f(b4.b());
            }
        }
        bhg bhgVar = this.g;
        if (!bhgVar.b) {
            bhgVar.b = true;
            new Handler(Looper.getMainLooper()).postDelayed(new sr7(27, bhgVar), 500L);
        }
        qne r0 = gut.r0(f.d, f.l - f.k, u7eVar.b(), "", e, u7eVar.d);
        x60Var.a(f.b() ? r0.A(null) : qne.m(r0, null, 3));
        return f;
    }
}
