package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSizeUnit;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class w5l implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    static {
        new kvo(DivSizeUnit.DP);
    }

    public w5l(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        x5l x5lVar = (x5l) ft6.b.p6.getValue();
        lb7 lb7Var = ft6.a;
        x5lVar.getClass();
        return x5l.d(lb7Var, this);
    }
}
