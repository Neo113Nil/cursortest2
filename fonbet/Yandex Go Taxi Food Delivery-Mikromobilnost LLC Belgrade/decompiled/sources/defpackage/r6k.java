package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class r6k implements c4x {
    public final Expression a;
    public Integer b;

    public r6k(Expression expression) {
        this.a = expression;
    }

    public final boolean a(r6k r6kVar, rvo rvoVar, rvo rvoVar2) {
        if (r6kVar == null) {
            return false;
        }
        return jl40.l(this.a.a(rvoVar), r6kVar.a.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(r6k.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        s6k s6kVar = (s6k) ft6.b.r0.getValue();
        lb7 lb7Var = ft6.a;
        s6kVar.getClass();
        return s6k.d(lb7Var, this);
    }
}
