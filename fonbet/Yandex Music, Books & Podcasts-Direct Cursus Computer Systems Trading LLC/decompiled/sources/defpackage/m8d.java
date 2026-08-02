package defpackage;

import com.yandex.messenger.websdk.api.SupportInfoProvider;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m8d extends mbv {
    public final SupportInfoProvider c;
    public final t3f d;
    public final jtc e;
    public final qdc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8d(SupportInfoProvider supportInfoProvider, t3f t3fVar, jtc jtcVar, qdc qdcVar) {
        super("getEnv");
        t3fVar.getClass();
        jtcVar.getClass();
        qdcVar.getClass();
        this.c = supportInfoProvider;
        this.d = t3fVar;
        this.e = jtcVar;
        this.f = qdcVar;
    }

    @Override // defpackage.mbv
    public final void a(hie hieVar) {
        qdc qdcVar = this.f;
        k5r.t(qdcVar, qdcVar, "wm_ask_support_env");
        Map q = this.c.q();
        t3f t3fVar = this.d;
        t3fVar.getClass();
        nnd nndVar = t3fVar.a;
        String str = hieVar.d;
        nndVar.getClass();
        str.getClass();
        b0i b0iVar = b0i.Response;
        JSONObject jSONObject = new JSONObject(q);
        JSONObject H = nndVar.H(b0iVar, null, str);
        H.put("data", jSONObject);
        jtc.v(this.e, t3f.b(H));
    }
}
