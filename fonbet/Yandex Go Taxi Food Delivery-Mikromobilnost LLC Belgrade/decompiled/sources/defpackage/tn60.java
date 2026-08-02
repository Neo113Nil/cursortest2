package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class tn60 implements c4x {
    public final String a;
    public final Expression b;
    public Integer c;

    public tn60(Expression expression, String str) {
        this.a = str;
        this.b = expression;
    }

    public final boolean a(tn60 tn60Var, rvo rvoVar, rvo rvoVar2) {
        return tn60Var != null && jl40.l(this.a, tn60Var.a) && ((Number) this.b.a(rvoVar)).doubleValue() == ((Number) tn60Var.b.a(rvoVar2)).doubleValue();
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(tn60.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        un60 un60Var = (un60) ft6.b.sa.getValue();
        lb7 lb7Var = ft6.a;
        un60Var.getClass();
        return un60.d(lb7Var, this);
    }
}
