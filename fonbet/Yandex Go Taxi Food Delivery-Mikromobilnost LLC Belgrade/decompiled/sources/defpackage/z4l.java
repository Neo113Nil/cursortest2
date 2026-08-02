package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes.dex */
public final class z4l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public z4l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        return new a5l(wcx.c(Q, jSONObject, RemoteBioParameters.X, i, null, jsonParserComponent.V2), wcx.c(Q, jSONObject, RemoteBioParameters.Y, i, null, jsonParserComponent.V2));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        a5l a5lVar = (a5l) obj;
        JSONObject jSONObject = new JSONObject();
        exq exqVar = a5lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, RemoteBioParameters.X, exqVar, jsonParserComponent.V2);
        wcx.u(yf90Var, jSONObject, RemoteBioParameters.Y, a5lVar.b, jsonParserComponent.V2);
        return jSONObject;
    }
}
