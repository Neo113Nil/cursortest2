package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ygl implements c4x {
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final sqk e;
    public Integer f;

    static {
        ngd0.m(Double.valueOf(0.8d));
        ngd0.m(Boolean.FALSE);
        ngd0.m(Boolean.TRUE);
        ngd0.m(1L);
    }

    public ygl(Expression expression, Expression expression2, Expression expression3, Expression expression4, sqk sqkVar) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = sqkVar;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((ahl) ft6.b.B8.getValue()).b(ft6.a, this);
    }
}
