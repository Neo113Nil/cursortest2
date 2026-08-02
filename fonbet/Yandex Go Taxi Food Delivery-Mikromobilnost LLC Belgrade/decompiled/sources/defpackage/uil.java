package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class uil implements qfy0 {
    public final JsonParserComponent a;

    public uil(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b((hjl) hexVar);
    }

    public final ril b(hjl hjlVar) {
        boolean z = hjlVar instanceof gjl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            ((djl) jsonParserComponent.g9.getValue()).getClass();
            return new qil(new ajl());
        }
        if (hjlVar instanceof fjl) {
            ((yil) jsonParserComponent.d9.getValue()).getClass();
            return new pil(new vil());
        }
        w511.b();
        return null;
    }
}
