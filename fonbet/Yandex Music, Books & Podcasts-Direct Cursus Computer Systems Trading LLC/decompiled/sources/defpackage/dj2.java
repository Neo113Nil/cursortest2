package defpackage;

import android.content.Context;
import com.connectsdk.service.DeviceService;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class dj2 {
    public final Context a;
    public final jdk b;
    public final boolean c;
    public final boolean d;
    public final g0c e;
    public String f;

    public dj2(Context context, jdk jdkVar, boolean z, boolean z2, g0c g0cVar) {
        context.getClass();
        this.a = context;
        this.b = jdkVar;
        this.c = z;
        this.d = z2;
        this.e = g0cVar;
    }

    public final s8 a() {
        String str = this.f;
        this.f = null;
        if (this.c && str == null) {
            return nif.c(new k03("Mobile backend invalid authorization error: Token drop failure - \"Current exchanged Oauth token is not set\"", 4));
        }
        if (str == null) {
            return nif.d(Boolean.FALSE);
        }
        e9k b = s9k.b();
        if (b == null) {
            return nif.c(new k03("Mobile backend invalid authorization error: Token drop failure - \"Failed to perform Oauth token drop due to the missing \\\"passport\\\" library dependency.\nPlease, make sure that it is provided in your .gradle file.\n\"", 4));
        }
        yop b2 = nif.b(nif.a, new zl0(2, this, b, str));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Авторизационный токен недействителен", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        ((x60) this.e).b(su4.j(k, "event_name", "drop_oauth_token", "drop_oauth_token", k), b2);
        return b2;
    }

    public final yop b() {
        jdk jdkVar = this.b;
        return mif.a(ivf.M(uwf.n(jdkVar.a, jdkVar.c)), new m40(4, this), null, 5);
    }
}
