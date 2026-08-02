package defpackage;

import android.os.Handler;
import java.io.IOException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g02 implements ps3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public g02(gln glnVar, d0o d0oVar) {
        this.a = 3;
        this.b = glnVar;
        this.c = d0oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x02c0  */
    @Override // defpackage.ps3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(es3 es3Var, l3o l3oVar) {
        JSONObject jSONObject;
        JSONObject B;
        JSONObject B2;
        JSONObject B3;
        String str;
        JSONObject B4;
        String str2;
        int i = 0;
        switch (this.a) {
            case 0:
                h02 h02Var = (h02) this.c;
                es3Var.getClass();
                l3oVar.getClass();
                boolean b = l3oVar.b();
                o3o o3oVar = l3oVar.g;
                if (!b) {
                    h02Var.g.post(new e02(this, l3oVar.d, o3oVar != null ? c.m(o3oVar.a()) : "", 0));
                    return;
                }
                if (o3oVar != null) {
                    String m = c.m(o3oVar.a());
                    if (StringsKt.U(m)) {
                        m = null;
                    }
                    if (m != null) {
                        jSONObject = new JSONObject(m);
                        h02Var.g.post(new f02((jSONObject != null || (B3 = vnj.B("data", jSONObject)) == null) ? null : vnj.F("yambtoken", B3), h02Var, (jSONObject != null || (B = vnj.B("data", jSONObject)) == null || (B2 = vnj.B("user", B)) == null) ? null : B2.getString("guid"), this, jSONObject));
                        return;
                    }
                }
                jSONObject = null;
                h02Var.g.post(new f02((jSONObject != null || (B3 = vnj.B("data", jSONObject)) == null) ? null : vnj.F("yambtoken", B3), h02Var, (jSONObject != null || (B = vnj.B("data", jSONObject)) == null || (B2 = vnj.B("user", B)) == null) ? null : B2.getString("guid"), this, jSONObject));
                return;
            case 1:
                hfj hfjVar = (hfj) this.c;
                Handler handler = hfjVar.h;
                qdc qdcVar = hfjVar.d;
                es3Var.getClass();
                l3oVar.getClass();
                boolean b2 = l3oVar.b();
                int i2 = l3oVar.d;
                if (b2) {
                    o3o o3oVar2 = l3oVar.g;
                    if (o3oVar2 != null) {
                        String m2 = c.m(o3oVar2.a());
                        if (StringsKt.U(m2)) {
                            m2 = null;
                        }
                        if (m2 != null && (B4 = vnj.B("data", new JSONObject(m2))) != null) {
                            str = vnj.F("logout_token", B4);
                            if (str != null) {
                                hfjVar.b.edit().putString("LOGOUT_TOKEN_KEY", str).apply();
                                qdcVar.getClass();
                                dwt.b(new zya(18, qdcVar, "wm_push_new_logout_token"));
                            }
                            handler.post(new zvh(7, hfjVar, this));
                            return;
                        }
                    }
                    str = null;
                    if (str != null) {
                    }
                    handler.post(new zvh(7, hfjVar, this));
                    return;
                }
                String D = l3oVar.o().D();
                xqn xqnVar = new xqn();
                if (i2 == 401 || i2 == 403) {
                    try {
                        r7o r7oVar = z7o.b;
                        JSONObject B5 = vnj.B("data", new JSONObject(D));
                        String F = B5 != null ? vnj.F("code", B5) : null;
                        String F2 = B5 != null ? vnj.F("text", B5) : null;
                        if ((Intrinsics.d(F, "unauthorized") && (Intrinsics.d(F2, "invalid auth token") || Intrinsics.d(F2, "expired_token"))) || Intrinsics.d(F, "invalid_auth_scope")) {
                            if (F2 == null) {
                                F2 = "";
                            }
                            xqnVar.a = new d02(F, F2);
                        }
                    } catch (Throwable unused) {
                        r7o r7oVar2 = z7o.b;
                    }
                }
                if (xqnVar.a == null) {
                    xqnVar.a = new IllegalArgumentException(hrg.p("messenger's backend error, code = ", i2, ", body = ", D));
                }
                Pair pair = new Pair("reason", "backendError");
                String message = ((Throwable) xqnVar.a).getMessage();
                qdcVar.sendEvent("wm_push_set_token_to_backend_error", uah.e(pair, new Pair("error", message != null ? message : "")));
                handler.post(new zvh(6, this, xqnVar));
                return;
            case 2:
                os3 os3Var = (os3) this.b;
                foj fojVar = (foj) this.c;
                try {
                    try {
                        os3Var.D(fojVar, fojVar.d(l3oVar));
                        return;
                    } catch (Throwable th) {
                        jf0.Z(th);
                        th.printStackTrace();
                        return;
                    }
                } catch (Throwable th2) {
                    jf0.Z(th2);
                    try {
                        os3Var.A(fojVar, th2);
                        return;
                    } catch (Throwable th3) {
                        jf0.Z(th3);
                        th3.printStackTrace();
                        return;
                    }
                }
            default:
                es3Var.getClass();
                l3oVar.getClass();
                evj evjVar = l3oVar.m;
                try {
                    ((gln) this.b).a(l3oVar, evjVar);
                    zp4 e = evjVar.e();
                    zvd zvdVar = l3oVar.f;
                    int size = zvdVar.size();
                    int i3 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    Integer num = null;
                    Integer num2 = null;
                    while (i3 < size) {
                        if (c.o(zvdVar.g(i3), "Sec-WebSocket-Extensions", true)) {
                            String q = zvdVar.q(i3);
                            int i4 = i;
                            while (i4 < q.length()) {
                                zvd zvdVar2 = zvdVar;
                                int h = cvt.h(q, ',', i4, i, 4);
                                int g = cvt.g(q, ';', i4, h);
                                int n = cvt.n(i4, g, q);
                                String substring = q.substring(n, cvt.o(n, g, q));
                                int i5 = g + 1;
                                if (substring.equalsIgnoreCase("permessage-deflate")) {
                                    if (z) {
                                        z4 = true;
                                    }
                                    i4 = i5;
                                    while (i4 < h) {
                                        int g2 = cvt.g(q, ';', i4, h);
                                        int g3 = cvt.g(q, '=', i4, g2);
                                        int n2 = cvt.n(i4, g3, q);
                                        String substring2 = q.substring(n2, cvt.o(n2, g3, q));
                                        if (g3 < g2) {
                                            int n3 = cvt.n(g3 + 1, g2, q);
                                            str2 = StringsKt.b0(q.substring(n3, cvt.o(n3, g2, q)));
                                        } else {
                                            str2 = null;
                                        }
                                        int i6 = g2 + 1;
                                        if (substring2.equalsIgnoreCase("client_max_window_bits")) {
                                            if (num != null) {
                                                z4 = true;
                                            }
                                            num = str2 != null ? StringsKt.toIntOrNull(str2) : null;
                                            if (num != null) {
                                                i4 = i6;
                                            }
                                            z4 = true;
                                            i4 = i6;
                                        } else {
                                            if (substring2.equalsIgnoreCase("client_no_context_takeover")) {
                                                if (z2) {
                                                    z4 = true;
                                                }
                                                if (str2 != null) {
                                                    z4 = true;
                                                }
                                                z2 = true;
                                            } else if (substring2.equalsIgnoreCase("server_max_window_bits")) {
                                                if (num2 != null) {
                                                    z4 = true;
                                                }
                                                num2 = str2 != null ? StringsKt.toIntOrNull(str2) : null;
                                                if (num2 != null) {
                                                }
                                                z4 = true;
                                            } else {
                                                if (substring2.equalsIgnoreCase("server_no_context_takeover")) {
                                                    if (z3) {
                                                        z4 = true;
                                                    }
                                                    if (str2 != null) {
                                                        z4 = true;
                                                    }
                                                    z3 = true;
                                                }
                                                z4 = true;
                                            }
                                            i4 = i6;
                                        }
                                    }
                                    z = true;
                                } else {
                                    z4 = true;
                                    i4 = i5;
                                }
                                zvdVar = zvdVar2;
                                i = 0;
                            }
                        }
                        i3++;
                        zvdVar = zvdVar;
                        i = 0;
                    }
                    ((gln) this.b).d = new rcv(z, num, z2, num2, z3, z4);
                    if (z4 || num != null || (num2 != null && !new IntRange(8, 15, 1).q(num2.intValue()))) {
                        gln glnVar = (gln) this.b;
                        synchronized (glnVar) {
                            glnVar.o.clear();
                            glnVar.b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        ((gln) this.b).d(cvt.g + " WebSocket " + ((d0o) this.c).a.i(), e);
                        gln glnVar2 = (gln) this.b;
                        glnVar2.a.d0(glnVar2, l3oVar);
                        ((gln) this.b).e();
                        return;
                    } catch (Exception e2) {
                        ((gln) this.b).c(e2, null);
                        return;
                    }
                } catch (IOException e3) {
                    ((gln) this.b).c(e3, l3oVar);
                    cvt.d(l3oVar);
                    if (evjVar != null) {
                        evjVar.b(-1L, true, true, null);
                        return;
                    }
                    return;
                }
        }
    }

    @Override // defpackage.ps3
    public final void d(es3 es3Var, IOException iOException) {
        switch (this.a) {
            case 0:
                es3Var.getClass();
                ((h02) this.c).g.post(new qf0(6, this, iOException));
                break;
            case 1:
                es3Var.getClass();
                hfj hfjVar = (hfj) this.c;
                qdc qdcVar = hfjVar.d;
                Pair pair = new Pair("reason", "httpError");
                String message = iOException.getMessage();
                if (message == null) {
                    message = "";
                }
                qdcVar.sendEvent("wm_push_set_token_to_backend_error", uah.e(pair, new Pair("error", message)));
                hfjVar.h.post(new zvh(8, this, iOException));
                break;
            case 2:
                try {
                    ((os3) this.b).A((foj) this.c, iOException);
                    break;
                } catch (Throwable th) {
                    jf0.Z(th);
                    th.printStackTrace();
                    return;
                }
            default:
                es3Var.getClass();
                ((gln) this.b).c(iOException, null);
                break;
        }
    }

    public /* synthetic */ g02(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
