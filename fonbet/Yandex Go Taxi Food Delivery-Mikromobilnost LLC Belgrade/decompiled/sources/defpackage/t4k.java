package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class t4k implements c4x {
    public final Expression a;
    public final xll b;
    public final Expression c;
    public Integer d;

    public t4k(Expression expression, xll xllVar, Expression expression2) {
        this.a = expression;
        this.b = xllVar;
        this.c = expression2;
    }

    public final boolean a(t4k t4kVar, rvo rvoVar, rvo rvoVar2) {
        return t4kVar != null && ((Number) this.a.a(rvoVar)).longValue() == ((Number) t4kVar.a.a(rvoVar2)).longValue() && this.b.a(t4kVar.b, rvoVar, rvoVar2) && jl40.l(this.c.a(rvoVar), t4kVar.c.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.c.hashCode() + this.b.b() + this.a.hashCode() + qoi0.a(t4k.class).hashCode();
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((u4k) ft6.b.W.getValue()).b(ft6.a, this);
    }
}
