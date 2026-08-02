package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ybl implements qfy0 {
    public final JsonParserComponent a;

    public ybl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vbl a(yf90 yf90Var, acl aclVar, JSONObject jSONObject) {
        exq exqVar = aclVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        sqk sqkVar = (sqk) xcx.h(yf90Var, exqVar, jSONObject, "item_spacing", jsonParserComponent.G3, jsonParserComponent.E3);
        if (sqkVar == null) {
            sqkVar = zbl.a;
        }
        exq exqVar2 = aclVar.b;
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        y7l y7lVar = zbl.c;
        kvo kvoVar = zbl.b;
        ?? n = xcx.n(yf90Var, exqVar2, jSONObject, "max_visible_items", tmsVar, tlsVar, y7lVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        return new vbl(sqkVar, kvoVar);
    }
}
