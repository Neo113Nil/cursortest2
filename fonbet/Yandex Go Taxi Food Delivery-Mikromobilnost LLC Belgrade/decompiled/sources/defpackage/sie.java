package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class sie implements c4x {
    public final Expression a;
    public Integer b;

    public sie(Expression expression) {
        this.a = expression;
    }

    public final boolean a(sie sieVar, rvo rvoVar, rvo rvoVar2) {
        if (sieVar == null) {
            return false;
        }
        return jl40.l(this.a.a(rvoVar), sieVar.a.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(sie.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        tie tieVar = (tie) ft6.b.v.getValue();
        lb7 lb7Var = ft6.a;
        tieVar.getClass();
        return tie.d(lb7Var, this);
    }
}
