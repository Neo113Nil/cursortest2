package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSizeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sqk implements c4x {
    public static final kvo d = new kvo(DivSizeUnit.DP);
    public final Expression a;
    public final Expression b;
    public Integer c;

    public sqk(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    public final boolean a(sqk sqkVar, rvo rvoVar, rvo rvoVar2) {
        return sqkVar != null && this.a.a(rvoVar) == sqkVar.a.a(rvoVar2) && ((Number) this.b.a(rvoVar)).longValue() == ((Number) sqkVar.b.a(rvoVar2)).longValue();
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(sqk.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        tqk tqkVar = (tqk) ft6.b.E3.getValue();
        lb7 lb7Var = ft6.a;
        tqkVar.getClass();
        return tqk.d(lb7Var, this);
    }

    public /* synthetic */ sqk(kvo kvoVar) {
        this(d, kvoVar);
    }
}
