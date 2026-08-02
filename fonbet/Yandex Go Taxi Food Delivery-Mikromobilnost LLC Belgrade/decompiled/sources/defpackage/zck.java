package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zck implements c4x {
    public final Expression a;
    public final xll b;
    public final Expression c;
    public Integer d;

    public zck(Expression expression, xll xllVar, Expression expression2) {
        this.a = expression;
        this.b = xllVar;
        this.c = expression2;
    }

    public final boolean a(zck zckVar, rvo rvoVar, rvo rvoVar2) {
        return zckVar != null && jl40.l(this.a.a(rvoVar), zckVar.a.a(rvoVar2)) && this.b.a(zckVar.b, rvoVar, rvoVar2) && jl40.l(this.c.a(rvoVar), zckVar.c.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.c.hashCode() + this.b.b() + this.a.hashCode() + qoi0.a(zck.class).hashCode();
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((adk) ft6.b.n1.getValue()).b(ft6.a, this);
    }
}
