package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class w7l implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    public w7l(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        c8l c8lVar = (c8l) ft6.b.T6.getValue();
        lb7 lb7Var = ft6.a;
        c8lVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.g(lb7Var, jSONObject, "text", this.a);
        a.g(lb7Var, jSONObject, "value", this.b);
        return jSONObject;
    }
}
