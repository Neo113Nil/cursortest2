package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class qgl implements c4x {
    public static final kvo b = new kvo(Boolean.TRUE);
    public final Expression a;

    public qgl(Expression expression) {
        this.a = expression;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        rgl rglVar = (rgl) ft6.b.z8.getValue();
        lb7 lb7Var = ft6.a;
        rglVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.g(lb7Var, jSONObject, "is_enabled", this.a);
        return jSONObject;
    }

    public qgl() {
        this(b);
    }
}
