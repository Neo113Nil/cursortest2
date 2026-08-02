package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class q7l implements c4x {
    public static final kvo h = ngd0.m(200L);
    public static final kvo i = ngd0.m(DivAnimationInterpolator.EASE_IN_OUT);
    public static final kvo j;
    public static final kvo k;
    public static final kvo l;
    public static final kvo m;
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final Expression e;
    public final Expression f;
    public Integer g;

    static {
        Double valueOf = Double.valueOf(0.5d);
        j = ngd0.m(valueOf);
        k = ngd0.m(valueOf);
        l = ngd0.m(Double.valueOf(0.0d));
        m = ngd0.m(0L);
    }

    public q7l() {
        this(h, i, j, k, l, m);
    }

    public final boolean a(q7l q7lVar, rvo rvoVar, rvo rvoVar2) {
        return q7lVar != null && ((Number) this.a.a(rvoVar)).longValue() == ((Number) q7lVar.a.a(rvoVar2)).longValue() && this.b.a(rvoVar) == q7lVar.b.a(rvoVar2) && ((Number) this.c.a(rvoVar)).doubleValue() == ((Number) q7lVar.c.a(rvoVar2)).doubleValue() && ((Number) this.d.a(rvoVar)).doubleValue() == ((Number) q7lVar.d.a(rvoVar2)).doubleValue() && ((Number) this.e.a(rvoVar)).doubleValue() == ((Number) q7lVar.e.a(rvoVar2)).doubleValue() && ((Number) this.f.a(rvoVar)).longValue() == ((Number) q7lVar.f.a(rvoVar2)).longValue();
    }

    public final Expression b() {
        return this.a;
    }

    public final Expression c() {
        return this.b;
    }

    public final Expression d() {
        return this.f;
    }

    public final int e() {
        Integer num = this.g;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.f.hashCode() + this.e.hashCode() + this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + qoi0.a(q7l.class).hashCode();
        this.g = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        r7l r7lVar = (r7l) ft6.b.N6.getValue();
        lb7 lb7Var = ft6.a;
        r7lVar.getClass();
        return r7l.d(lb7Var, this);
    }

    public q7l(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
        this.f = expression6;
    }
}
