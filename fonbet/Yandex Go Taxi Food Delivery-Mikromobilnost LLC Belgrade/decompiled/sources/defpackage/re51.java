package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.xiva.data.XivaWebSocketCloseReason;
import com.yandex.go.xiva.domain.g;
import com.yandex.go.xiva.domain.model.XivaToken;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import okhttp3.OkHttpClient;

/* loaded from: classes11.dex */
public final class re51 extends ek41 {
    public final wnt a;
    public final ji41 b;
    public final h3y c;
    public ydi0 w;

    public re51(wnt wntVar, ji41 ji41Var, h3y h3yVar) {
        this.a = wntVar;
        this.b = ji41Var;
        this.c = h3yVar;
    }

    @Override // defpackage.ek41
    public final void b(ydi0 ydi0Var, int i, String str) {
        jst.e.o("Xiva", "Socket is successfully closed");
        this.b.O(XivaWebSocketCloseReason.ClientDisconnected);
    }

    @Override // defpackage.ek41
    public final void d(ydi0 ydi0Var, Exception exc, kvj0 kvj0Var) {
        jst.e.h("Xiva", "WebSocket is disconnected due to error", exc);
        this.b.O(XivaWebSocketCloseReason.ConnectionError);
    }

    @Override // defpackage.ek41
    public final void e(zj41 zj41Var, String str) {
        LinkedHashMap j = j(str, Constants.PUSH);
        if (j == null) {
            return;
        }
        String str2 = (String) j.get(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE);
        String str3 = (String) j.get("operation");
        hst hstVar = jst.e;
        hstVar.o("Xiva", b64.l("Message received. operation: ", str3, " rawPush: ", str));
        boolean l = jl40.l(str3, "ping");
        ji41 ji41Var = this.b;
        if (l) {
            ji41Var.P();
            return;
        }
        if (jl40.l(str3, "xivaws-error")) {
            ji41Var.O(XivaWebSocketCloseReason.ServerError);
            if (str2 == null) {
                str2 = "Unknown server error";
            }
            hstVar.d("Xiva", "Server error: ".concat(str2));
            return;
        }
        ji41Var.P();
        if (str2 == null) {
            hstVar.o("Xiva", "Push message is null. Skipping");
            return;
        }
        LinkedHashMap j2 = j(str2, "push message");
        if (j2 == null) {
            return;
        }
        String str4 = (String) j2.get("id");
        String str5 = (String) j2.get("type");
        if (str4 == null || str5 == null) {
            hstVar.o("Xiva", "Push message id or type is null. Skipping");
            return;
        }
        ce51 ce51Var = new ce51(str4, str5, b.o(j2, new Pair("source", "xiva_ws")));
        g gVar = (g) ji41Var.b;
        gVar.d.g(ce51Var);
        se51 se51Var = gVar.b;
        se51Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("push_id", str4);
        hashMap.put("push_type", str5);
        se51Var.a.a("XivaWs.Push.Received", hashMap, 1, new HashMap());
    }

    @Override // defpackage.ek41
    public final void g(kvj0 kvj0Var) {
        jst.e.o("Xiva", "Socket is successfully connected");
    }

    public final void h(ud51 ud51Var, vd51 vd51Var) {
        String e;
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        jwuVar.h(vd51Var.a);
        jwuVar.c("v2/subscribe/websocket", false);
        jwuVar.d(io.appmetrica.analytics.rtm.internal.Constants.KEY_SERVICE, vd51Var.c);
        jwuVar.d("client", "taxi-android");
        jwuVar.d("user", ud51Var.a);
        XivaToken xivaToken = ud51Var.c;
        jwuVar.d("sign", xivaToken.a);
        jwuVar.d("ts", xivaToken.b);
        jwuVar.d("session", ud51Var.b);
        le51 le51Var = vd51Var.d;
        xbx xbxVar = new xbx();
        List list = le51Var.a;
        if (list != null) {
            qh2 qh2Var = new qh2(list, 18);
            kdx kdxVar = new kdx();
            qh2Var.invoke(kdxVar);
            xbxVar.a(kdxVar.a());
            kdx kdxVar2 = new kdx();
            abb1.d(kdxVar2, "do", "skip");
            xbxVar.a(kdxVar2.a());
        }
        a b = xbxVar.b();
        if (b.a.isEmpty()) {
            e = null;
        } else {
            kdx kdxVar3 = new kdx();
            kdxVar3.b("rules", b);
            kdxVar3.b("vars", new kdx().a());
            e = ((xnt) this.a).e(kdxVar3.a(), c.Companion.serializer());
        }
        jwuVar.d("filter", e);
        kwu e2 = jwuVar.e();
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = e2;
        d5j0 d5j0Var = new d5j0(t4j0Var);
        hst hstVar = jst.e;
        d5j0Var.toString();
        hstVar.getClass();
        this.w = ((OkHttpClient) this.c.get()).c(d5j0Var, this);
    }

    public final void i() {
        if (this.w == null) {
            jst.e.d("Xiva", "Socket is already closed");
        }
        ydi0 ydi0Var = this.w;
        if (ydi0Var != null) {
            ydi0Var.c(1001, null);
        }
        this.w = null;
    }

    public final LinkedHashMap j(String str, String str2) {
        String obj;
        String valueOf;
        try {
            c cVar = (c) ((xnt) this.a).c(str, c.Companion.serializer());
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(cVar.a.size()));
            for (Object obj2 : cVar.a.entrySet()) {
                Object key = ((Map.Entry) obj2).getKey();
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) ((Map.Entry) obj2).getValue();
                if (!(bVar instanceof d)) {
                    obj = bVar.toString();
                } else if (((d) bVar).b()) {
                    obj = ((d) bVar).a();
                } else {
                    Long o = qcx.o((d) bVar);
                    if (o != null && (valueOf = String.valueOf(o.longValue())) != null) {
                        obj = valueOf;
                    }
                    obj = ((d) bVar).a();
                }
                linkedHashMap.put(key, obj);
            }
            return linkedHashMap;
        } catch (Throwable th) {
            jst.e.h("Xiva", "Failed to parse a ".concat(str2), th);
            return null;
        }
    }
}
