package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class whk implements c4x {
    public static final kvo e = ngd0.m(200L);
    public static final kvo f = ngd0.m(DivAnimationInterpolator.EASE_IN_OUT);
    public static final kvo g = ngd0.m(0L);
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public Integer d;

    public whk(Expression expression, Expression expression2, Expression expression3) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
    }

    public final boolean a(whk whkVar, rvo rvoVar, rvo rvoVar2) {
        return whkVar != null && ((Number) this.a.a(rvoVar)).longValue() == ((Number) whkVar.a.a(rvoVar2)).longValue() && this.b.a(rvoVar) == whkVar.b.a(rvoVar2) && ((Number) this.c.a(rvoVar)).longValue() == ((Number) whkVar.c.a(rvoVar2)).longValue();
    }

    public final Expression b() {
        return this.a;
    }

    public final Expression c() {
        return this.b;
    }

    public final Expression d() {
        return this.c;
    }

    public final int e() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + qoi0.a(whk.class).hashCode();
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        xhk xhkVar = (xhk) ft6.b.X1.getValue();
        lb7 lb7Var = ft6.a;
        xhkVar.getClass();
        return xhk.d(lb7Var, this);
    }

    public whk() {
        this(e, f, g);
    }
}
