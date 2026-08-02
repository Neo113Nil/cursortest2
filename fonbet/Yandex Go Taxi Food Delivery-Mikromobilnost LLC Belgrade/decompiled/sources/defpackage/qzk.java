package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qzk implements qfy0 {
    public final JsonParserComponent a;

    public qzk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nzk a(yf90 yf90Var, rzk rzkVar, JSONObject jSONObject) {
        exq exqVar = rzkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.n7;
        i3y i3yVar2 = jsonParserComponent.l7;
        return new nzk((t9l) xcx.h(yf90Var, exqVar, jSONObject, "max_size", i3yVar, i3yVar2), (t9l) xcx.h(yf90Var, rzkVar.b, jSONObject, "min_size", jsonParserComponent.n7, i3yVar2), xcx.m(yf90Var, rzkVar.c, jSONObject, "weight", wm11.d, b.g, jx81.b));
    }
}
