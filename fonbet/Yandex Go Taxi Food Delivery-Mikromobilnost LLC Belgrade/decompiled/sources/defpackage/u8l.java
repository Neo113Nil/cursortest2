package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u8l implements c4x {
    public final Expression a;
    public final t8l b;
    public final bcl c;
    public Integer d;

    public u8l(Expression expression, t8l t8lVar, bcl bclVar) {
        this.a = expression;
        this.b = t8lVar;
        this.c = bclVar;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((v8l) ft6.b.f7.getValue()).b(ft6.a, this);
    }
}
