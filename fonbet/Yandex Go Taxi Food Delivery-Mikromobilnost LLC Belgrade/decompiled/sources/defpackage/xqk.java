package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSizeUnit;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class xqk implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    static {
        new kvo(DivSizeUnit.DP);
    }

    public xqk(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        yqk yqkVar = (yqk) ft6.b.H3.getValue();
        lb7 lb7Var = ft6.a;
        yqkVar.getClass();
        return yqk.d(lb7Var, this);
    }
}
