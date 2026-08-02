package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivActionSubmit$Request$Method;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.l;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class z9k implements zsq0, nyi {
    public final JsonParserComponent a;

    public z9k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        List O = wwg.O(yf90Var, jSONObject, "headers", this.a.e1);
        qkj qkjVar = l.b;
        tls tlsVar = DivActionSubmit$Request$Method.FROM_STRING;
        kvo kvoVar = l.a;
        kbs kbsVar = q5z.b;
        ?? e = a.e(yf90Var, jSONObject, "method", qkjVar, tlsVar, kbsVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        return new s9k(O, kvoVar, a.b(yf90Var, jSONObject, "url", wm11.e, b.e, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, s9k s9kVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.c0(yf90Var, jSONObject, "headers", s9kVar.a, this.a.e1);
        a.h(yf90Var, jSONObject, "method", s9kVar.b, DivActionSubmit$Request$Method.TO_STRING);
        a.h(yf90Var, jSONObject, "url", s9kVar.c, b.c);
        return jSONObject;
    }
}
