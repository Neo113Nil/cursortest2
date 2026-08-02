package defpackage;

import com.yandex.div.json.expressions.Expression;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vhl implements c4x {
    public final Expression a;
    public final List b;
    public final String c;
    public final List d;
    public final Expression e;
    public final String f;

    static {
        new kvo(0L);
    }

    public vhl(Expression expression, List list, String str, List list2, Expression expression2, String str2) {
        this.a = expression;
        this.b = list;
        this.c = str;
        this.d = list2;
        this.e = expression2;
        this.f = str2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((zhl) ft6.b.Z8.getValue()).b(ft6.a, this);
    }
}
