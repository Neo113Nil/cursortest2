package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSizeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t9l implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    static {
        new kvo(DivSizeUnit.DP);
    }

    public t9l(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    public final boolean a(t9l t9lVar, rvo rvoVar, rvo rvoVar2) {
        return t9lVar != null && this.a.a(rvoVar) == t9lVar.a.a(rvoVar2) && ((Number) this.b.a(rvoVar)).longValue() == ((Number) t9lVar.b.a(rvoVar2)).longValue();
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(t9l.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        u9l u9lVar = (u9l) ft6.b.l7.getValue();
        lb7 lb7Var = ft6.a;
        u9lVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.h(lb7Var, jSONObject, "unit", this.a, DivSizeUnit.TO_STRING);
        a.g(lb7Var, jSONObject, "value", this.b);
        return jSONObject;
    }
}
