package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wal implements c4x {
    public final Expression a;
    public Integer b;

    public wal(Expression expression) {
        this.a = expression;
    }

    public final int a() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(wal.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        yal yalVar = (yal) ft6.b.D7.getValue();
        lb7 lb7Var = ft6.a;
        yalVar.getClass();
        return yal.d(lb7Var, this);
    }
}
