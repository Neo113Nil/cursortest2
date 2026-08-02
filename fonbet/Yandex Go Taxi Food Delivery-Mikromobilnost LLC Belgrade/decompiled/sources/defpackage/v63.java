package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class v63 implements c4x {
    public final String a;
    public final Expression b;
    public Integer c;

    public v63(Expression expression, String str) {
        this.a = str;
        this.b = expression;
    }

    public final boolean a(v63 v63Var, rvo rvoVar, rvo rvoVar2) {
        return v63Var != null && jl40.l(this.a, v63Var.a) && jl40.l(this.b.a(rvoVar), v63Var.b.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(v63.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        w63 w63Var = (w63) ft6.b.d.getValue();
        lb7 lb7Var = ft6.a;
        w63Var.getClass();
        return w63.d(lb7Var, this);
    }
}
