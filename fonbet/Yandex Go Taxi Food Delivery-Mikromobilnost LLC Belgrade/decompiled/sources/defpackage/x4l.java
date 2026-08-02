package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes.dex */
public final class x4l implements c4x {
    public final jnk a;
    public final jnk b;
    public Integer c;

    public x4l(jnk jnkVar, jnk jnkVar2) {
        this.a = jnkVar;
        this.b = jnkVar2;
    }

    public final boolean a(x4l x4lVar, rvo rvoVar, rvo rvoVar2) {
        return x4lVar != null && this.a.a(x4lVar.a, rvoVar, rvoVar2) && this.b.a(x4lVar.b, rvoVar, rvoVar2);
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int b = this.b.b() + this.a.b() + qoi0.a(x4l.class).hashCode();
        this.c = Integer.valueOf(b);
        return b;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        y4l y4lVar = (y4l) ft6.b.j6.getValue();
        lb7 lb7Var = ft6.a;
        y4lVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonParserComponent jsonParserComponent = y4lVar.a;
        wwg.b0(lb7Var, jSONObject, RemoteBioParameters.X, this.a, jsonParserComponent.U2);
        wwg.b0(lb7Var, jSONObject, RemoteBioParameters.Y, this.b, jsonParserComponent.U2);
        return jSONObject;
    }
}
