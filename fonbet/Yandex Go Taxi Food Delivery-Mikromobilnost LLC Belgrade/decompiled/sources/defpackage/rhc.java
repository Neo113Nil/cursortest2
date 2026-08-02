package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class rhc implements c4x {
    public final String a;
    public final Expression b;
    public Integer c;

    public rhc(Expression expression, String str) {
        this.a = str;
        this.b = expression;
    }

    public final boolean a(rhc rhcVar, rvo rvoVar, rvo rvoVar2) {
        return rhcVar != null && jl40.l(this.a, rhcVar.a) && ((Number) this.b.a(rvoVar)).intValue() == ((Number) rhcVar.b.a(rvoVar2)).intValue();
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(rhc.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        shc shcVar = (shc) ft6.b.p.getValue();
        lb7 lb7Var = ft6.a;
        shcVar.getClass();
        return shc.d(lb7Var, this);
    }
}
