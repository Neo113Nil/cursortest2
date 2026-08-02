package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class wbl implements zsq0, nyi {
    public final JsonParserComponent a;

    public wbl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final vbl a(yf90 yf90Var, JSONObject jSONObject) {
        sqk sqkVar = (sqk) wwg.M(yf90Var, jSONObject, "item_spacing", this.a.E3);
        if (sqkVar == null) {
            sqkVar = zbl.a;
        }
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        y7l y7lVar = zbl.c;
        kvo kvoVar = zbl.b;
        ?? e = a.e(yf90Var, jSONObject, "max_visible_items", tmsVar, tlsVar, y7lVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        return new vbl(sqkVar, kvoVar);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, vbl vblVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.b0(yf90Var, jSONObject, "item_spacing", vblVar.a, this.a.E3);
        a.g(yf90Var, jSONObject, "max_visible_items", vblVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "stretch");
        return jSONObject;
    }
}
