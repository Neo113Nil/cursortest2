package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class xkk implements c4x, qvk {
    public final Expression a;
    public final String b;
    public Integer c;

    public xkk(Expression expression, String str) {
        this.a = expression;
        this.b = str;
    }

    @Override // defpackage.qvk
    public final String a() {
        return this.b;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        ykk ykkVar = (ykk) ft6.b.H2.getValue();
        lb7 lb7Var = ft6.a;
        ykkVar.getClass();
        return ykk.d(lb7Var, this);
    }
}
