package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class wkl implements qfy0 {
    public final JsonParserComponent a;

    public wkl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final tkl a(yf90 yf90Var, zkl zklVar, JSONObject jSONObject) {
        boolean z = zklVar instanceof xkl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            ark arkVar = (ark) jsonParserComponent.J3.getValue();
            brk brkVar = ((xkl) zklVar).a;
            arkVar.getClass();
            return new rkl(ark.b(yf90Var, brkVar, jSONObject));
        }
        if (!(zklVar instanceof ykl)) {
            w511.b();
            return null;
        }
        q3l q3lVar = (q3l) jsonParserComponent.W5.getValue();
        r3l r3lVar = ((ykl) zklVar).a;
        q3lVar.getClass();
        return new skl(new n3l(xcx.d(yf90Var, r3lVar.a, jSONObject, "value", wm11.d, b.g)));
    }
}
