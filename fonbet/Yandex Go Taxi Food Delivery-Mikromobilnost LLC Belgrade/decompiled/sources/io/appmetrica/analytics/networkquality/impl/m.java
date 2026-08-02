package io.appmetrica.analytics.networkquality.impl;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.tls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes9.dex */
public final class m extends Lambda implements tls {
    public final /* synthetic */ n a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar) {
        super(1);
        this.a = nVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Iterator it;
        String str;
        JSONObject jSONObject;
        v vVar = (v) obj;
        this.a.c.getClass();
        JSONObject jSONObject2 = new JSONObject();
        long j = vVar.a;
        String str2 = ClidProvider.TIMESTAMP;
        jSONObject2.put(ClidProvider.TIMESTAMP, j);
        jSONObject2.put("network_type", vVar.b);
        JSONObject jSONObject3 = new JSONObject();
        for (Map.Entry entry : vVar.c.entrySet()) {
            String str3 = (String) entry.getKey();
            u uVar = (u) entry.getValue();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(str2, uVar.a);
            jSONObject4.put("duration", uVar.b);
            jSONObject4.put("url", uVar.c);
            jSONObject4.put(WriteBlocks.OK, uVar.d);
            jSONObject4.put("any_response", uVar.e);
            jSONObject4.put("attempts", uVar.f);
            jSONObject4.put("successful_attempts", uVar.g);
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = uVar.h.iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(str2, aVar.a);
                jSONObject5.put("duration", aVar.b);
                jSONObject5.put(ACSPConstants.STATUS, aVar.c);
                jSONObject5.put("http_code", aVar.d);
                jSONObject5.put("url", aVar.e);
                jSONObject5.put("error", aVar.f);
                c cVar = aVar.g;
                if (cVar != null) {
                    jSONObject = new JSONObject();
                    jSONObject.put("dns_lookup", cVar.a);
                    jSONObject.put("tcp_connect", cVar.b);
                    jSONObject.put("tls_handshake", cVar.c);
                    jSONObject.put("time_to_first_byte", cVar.d);
                    jSONObject.put("response", cVar.e);
                    it = it2;
                    str = str2;
                    jSONObject.put("total", cVar.f);
                    jSONObject.put("connection_reused", cVar.g);
                    jSONObject.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, cVar.h);
                } else {
                    it = it2;
                    str = str2;
                    jSONObject = null;
                }
                jSONObject5.put("network_metrics", jSONObject);
                jSONArray.put(jSONObject5);
                str2 = str;
                it2 = it;
            }
            jSONObject4.put("attempt_results", jSONArray);
            jSONObject3.put(str3, jSONObject4);
        }
        jSONObject2.put("requests", jSONObject3);
        this.a.a.getSelfReporter().reportEvent("network_quality", jSONObject2.toString());
        n nVar = this.a;
        f fVar = nVar.e;
        zy11 zy11Var = zy11.a;
        if (fVar == null) {
            return zy11Var;
        }
        if (!fVar.a) {
            nVar.f = false;
            return zy11Var;
        }
        nVar.a.getExecutorProvider().getModuleExecutor().executeDelayed(nVar.g, fVar.c, TimeUnit.SECONDS);
        return zy11Var;
    }
}
