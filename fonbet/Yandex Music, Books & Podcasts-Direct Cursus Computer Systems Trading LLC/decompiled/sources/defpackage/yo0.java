package defpackage;

import android.content.Context;
import com.connectsdk.etc.helper.HttpMessage;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class yo0 implements bse {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ pyh c;
    public final /* synthetic */ g0c d;
    public final /* synthetic */ atj e;
    public final /* synthetic */ jdk f;

    public yo0(boolean z, Context context, pyh pyhVar, g0c g0cVar, atj atjVar, jdk jdkVar) {
        this.a = z;
        this.b = context;
        this.c = pyhVar;
        this.d = g0cVar;
        this.e = atjVar;
        this.f = jdkVar;
    }

    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        twh b;
        d0o d0oVar = (d0o) uknVar.i;
        h0o h0oVar = d0oVar.d;
        u7e u7eVar = d0oVar.a;
        if (Intrinsics.d((h0oVar == null || (b = h0oVar.b()) == null) ? null : b.c, "json")) {
            hi3 hi3Var = new hi3();
            h0oVar.d(hi3Var);
            JSONObject jSONObject = new JSONObject(hi3Var.G0());
            jSONObject.put("isDebrandingEnabled", this.a);
            String jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
            Pattern pattern = twh.e;
            h0oVar = ybl.b(jSONObject2, q5g.C("application/json"));
        }
        String uuid = AppMetrica.getUuid(this.b);
        b0o b2 = d0oVar.b();
        b2.d("X-SDK-Version", "6.26.1");
        b2.d("X-SERVICE-TOKEN", this.c.a);
        b2.d("X-SDK-PLATFORM", ConstantDeviceInfo.APP_PLATFORM);
        if (uuid == null) {
            uuid = "";
        }
        b2.d("X-USER-UUID", uuid);
        b2.d(HttpMessage.CONTENT_TYPE_HEADER, "application/json");
        String str = "";
        String str2 = str;
        for (Pair pair : this.e.b(u7eVar.b())) {
            String str3 = (String) pair.a;
            String str4 = (String) pair.b;
            if (Intrinsics.d(str3, "traceparent")) {
                str = str4;
            }
            if (Intrinsics.d(str3, "X-Request-ID")) {
                str2 = str4;
            }
            b2.a(str3, str4);
        }
        jdk jdkVar = this.f;
        String str5 = jdkVar.c;
        if (str5 != null) {
            if (str5.length() <= 0) {
                str5 = null;
            }
            if (str5 != null) {
                b2.d("X-UID", str5);
            }
        }
        String str6 = jdkVar.a;
        if (str6 != null) {
            if (str6.length() <= 0) {
                str6 = null;
            }
            if (str6 != null) {
                b2.d("Authorization", "OAuth ".concat(str6));
            }
        }
        b2.e(d0oVar.b, h0oVar);
        d0o b3 = b2.b();
        qne q0 = gut.q0(u7eVar.b(), str, str2, u7eVar.d);
        x60 x60Var = (x60) this.d;
        x60Var.getClass();
        x60Var.a(q0);
        l3o f = uknVar.f(b3);
        qne r0 = gut.r0(f.d, f.l - f.k, u7eVar.b(), str, str2, u7eVar.d);
        qne A = f.b() ? r0.A(null) : qne.m(r0, null, 3);
        x60Var.getClass();
        x60Var.a(A);
        return f;
    }
}
