package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import kotlin.Pair;
import kotlin.text.Regex;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zn2 implements p8w {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Merchant c;
    public final /* synthetic */ rwo d;
    public final /* synthetic */ u870 e;
    public final /* synthetic */ Payer f;

    public zn2(boolean z, Context context, Merchant merchant, rwo rwoVar, u870 u870Var, Payer payer) {
        this.a = z;
        this.b = context;
        this.c = merchant;
        this.d = rwoVar;
        this.e = u870Var;
        this.f = payer;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        wg10 b;
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        m5j0 m5j0Var = d5j0Var.d;
        kwu kwuVar = d5j0Var.a;
        if (jl40.l((m5j0Var == null || (b = m5j0Var.b()) == null) ? null : b.c, "json")) {
            yp6 yp6Var = new yp6();
            m5j0Var.d(yp6Var);
            JSONObject jSONObject = new JSONObject(yp6Var.I0());
            jSONObject.put("isDebrandingEnabled", this.a);
            int i = m5j0.a;
            String jSONObject2 = jSONObject.toString();
            Regex regex = wg10.e;
            m5j0Var = wms.a(jSONObject2, qje.o("application/json"));
        }
        String uuid = AppMetrica.getUuid(this.b);
        t4j0 b2 = d5j0Var.b();
        b2.c.g("X-SDK-Version", "7.6.6");
        b2.c.g("X-SERVICE-TOKEN", this.c.getServiceToken());
        b2.c.g("X-SDK-PLATFORM", ConstantDeviceInfo.APP_PLATFORM);
        if (uuid == null) {
            uuid = "";
        }
        b2.c.g("X-USER-UUID", uuid);
        b2.c.g("Content-Type", "application/json");
        String str = "";
        String str2 = str;
        for (Pair pair : this.e.e(kwuVar.b())) {
            String str3 = (String) pair.getFirst();
            String str4 = (String) pair.getSecond();
            if (jl40.l(str3, "traceparent")) {
                str = str4;
            }
            if (jl40.l(str3, "X-Request-ID")) {
                str2 = str4;
            }
            b2.a(str3, str4);
        }
        Payer payer = this.f;
        String uid = payer.getUid();
        if (uid != null) {
            if (uid.length() <= 0) {
                uid = null;
            }
            if (uid != null) {
                b2.d("X-UID", uid);
            }
        }
        String oauthToken = payer.getOauthToken();
        if (oauthToken != null) {
            if (oauthToken.length() <= 0) {
                oauthToken = null;
            }
            if (oauthToken != null) {
                b2.d("Authorization", "OAuth ".concat(oauthToken));
            }
        }
        b2.e(d5j0Var.b, m5j0Var);
        d5j0 d5j0Var2 = new d5j0(b2);
        sv90 sv90Var = qv90.a;
        String b3 = kwuVar.b();
        String str5 = kwuVar.d;
        sv90Var.getClass();
        iho L = sv90.L(b3, str, str2, str5);
        y22 y22Var = (y22) this.d;
        y22Var.a(L);
        kvj0 b4 = zci0Var.b(d5j0Var2);
        iho M = sv90.M(b4.F - b4.E, kwuVar.b(), str, str2, kwuVar.d, b4.w);
        y22Var.a(b4.J ? M.d(null) : iho.b(M, null, 3));
        return b4;
    }
}
