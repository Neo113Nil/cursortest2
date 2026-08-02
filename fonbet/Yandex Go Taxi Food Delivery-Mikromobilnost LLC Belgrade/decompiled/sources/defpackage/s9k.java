package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivActionSubmit$Request$Method;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class s9k implements c4x {
    public final List a;
    public final Expression b;
    public final Expression c;
    public Integer d;

    static {
        new kvo(DivActionSubmit$Request$Method.POST);
    }

    public s9k(List list, Expression expression, Expression expression2) {
        this.a = list;
        this.b = expression;
        this.c = expression2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((z9k) ft6.b.b1.getValue()).b(ft6.a, this);
    }
}
