package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class u8k implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    static {
        new kvo(Boolean.TRUE);
    }

    public u8k(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    public final boolean a(u8k u8kVar, rvo rvoVar, rvo rvoVar2) {
        return u8kVar != null && jl40.l(this.a.a(rvoVar), u8kVar.a.a(rvoVar2)) && ((Boolean) this.b.a(rvoVar)).booleanValue() == ((Boolean) u8kVar.b.a(rvoVar2)).booleanValue();
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(u8k.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        v8k v8kVar = (v8k) ft6.b.M0.getValue();
        lb7 lb7Var = ft6.a;
        v8kVar.getClass();
        return v8k.d(lb7Var, this);
    }
}
