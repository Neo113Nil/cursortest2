package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class uyk implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    public uyk(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        wyk wykVar = (wyk) ft6.b.d5.getValue();
        lb7 lb7Var = ft6.a;
        wykVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.h(lb7Var, jSONObject, "color", this.a, b.a);
        a.g(lb7Var, jSONObject, "position", this.b);
        return jSONObject;
    }
}
