package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes.dex */
public final class y4l implements zsq0, nyi {
    public final JsonParserComponent a;

    public y4l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        return new x4l((jnk) wwg.E(yf90Var, jSONObject, RemoteBioParameters.X, jsonParserComponent.U2), (jnk) wwg.E(yf90Var, jSONObject, RemoteBioParameters.Y, jsonParserComponent.U2));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        x4l x4lVar = (x4l) obj;
        JSONObject jSONObject = new JSONObject();
        jnk jnkVar = x4lVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, RemoteBioParameters.X, jnkVar, jsonParserComponent.U2);
        wwg.b0(yf90Var, jSONObject, RemoteBioParameters.Y, x4lVar.b, jsonParserComponent.U2);
        return jSONObject;
    }
}
