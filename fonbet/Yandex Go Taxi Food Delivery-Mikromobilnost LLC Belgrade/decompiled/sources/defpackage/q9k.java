package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class q9k implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    public q9k(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        x9k x9kVar = (x9k) ft6.b.e1.getValue();
        lb7 lb7Var = ft6.a;
        x9kVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.g(lb7Var, jSONObject, "name", this.a);
        a.g(lb7Var, jSONObject, "value", this.b);
        return jSONObject;
    }
}
