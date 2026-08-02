package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class q5l implements qfy0 {
    public final JsonParserComponent a;

    public q5l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n5l a(yf90 yf90Var, t5l t5lVar, JSONObject jSONObject) {
        boolean z = t5lVar instanceof r5l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            z5l z5lVar = (z5l) jsonParserComponent.r6.getValue();
            a6l a6lVar = ((r5l) t5lVar).a;
            z5lVar.getClass();
            return new l5l(z5l.b(yf90Var, a6lVar, jSONObject));
        }
        if (!(t5lVar instanceof s5l)) {
            w511.b();
            return null;
        }
        r6l r6lVar = (r6l) jsonParserComponent.x6.getValue();
        s6l s6lVar = ((s5l) t5lVar).a;
        r6lVar.getClass();
        return new m5l(new o6l(xcx.d(yf90Var, s6lVar.a, jSONObject, "value", wm11.d, b.g)));
    }
}
