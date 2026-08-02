package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class y3k implements c4x {
    public final String a;
    public final Expression b;
    public final Expression c;
    public final xll d;
    public final Expression e;
    public final pkk f;
    public final Expression g;
    public final xll h;
    public Integer i;

    public y3k(String str, Expression expression, Expression expression2, xll xllVar, Expression expression3, pkk pkkVar, Expression expression4, xll xllVar2) {
        this.a = str;
        this.b = expression;
        this.c = expression2;
        this.d = xllVar;
        this.e = expression3;
        this.f = pkkVar;
        this.g = expression4;
        this.h = xllVar2;
    }

    public final boolean a(y3k y3kVar, rvo rvoVar, rvo rvoVar2) {
        if (y3kVar != null && jl40.l(this.a, y3kVar.a)) {
            Expression expression = this.b;
            DivAnimationDirection divAnimationDirection = expression != null ? (DivAnimationDirection) expression.a(rvoVar) : null;
            Expression expression2 = y3kVar.b;
            if (divAnimationDirection == (expression2 != null ? (DivAnimationDirection) expression2.a(rvoVar2) : null)) {
                Expression expression3 = this.c;
                Long l = expression3 != null ? (Long) expression3.a(rvoVar) : null;
                Expression expression4 = y3kVar.c;
                if (jl40.l(l, expression4 != null ? (Long) expression4.a(rvoVar2) : null)) {
                    xll xllVar = y3kVar.d;
                    xll xllVar2 = this.d;
                    if (xllVar2 != null ? xllVar2.a(xllVar, rvoVar, rvoVar2) : xllVar == null) {
                        Expression expression5 = this.e;
                        DivAnimationInterpolator divAnimationInterpolator = expression5 != null ? (DivAnimationInterpolator) expression5.a(rvoVar) : null;
                        Expression expression6 = y3kVar.e;
                        if (divAnimationInterpolator == (expression6 != null ? (DivAnimationInterpolator) expression6.a(rvoVar2) : null)) {
                            pkk pkkVar = y3kVar.f;
                            pkk pkkVar2 = this.f;
                            if (pkkVar2 != null ? pkkVar2.a(pkkVar, rvoVar, rvoVar2) : pkkVar == null) {
                                Expression expression7 = this.g;
                                Long l2 = expression7 != null ? (Long) expression7.a(rvoVar) : null;
                                Expression expression8 = y3kVar.g;
                                if (jl40.l(l2, expression8 != null ? (Long) expression8.a(rvoVar2) : null)) {
                                    xll xllVar3 = y3kVar.h;
                                    xll xllVar4 = this.h;
                                    if (xllVar4 != null ? xllVar4.a(xllVar3, rvoVar, rvoVar2) : xllVar3 == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.i;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(y3k.class).hashCode();
        Expression expression = this.b;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.c;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        xll xllVar = this.d;
        int b = hashCode3 + (xllVar != null ? xllVar.b() : 0);
        Expression expression3 = this.e;
        int hashCode4 = b + (expression3 != null ? expression3.hashCode() : 0);
        pkk pkkVar = this.f;
        int b2 = hashCode4 + (pkkVar != null ? pkkVar.b() : 0);
        Expression expression4 = this.g;
        int hashCode5 = b2 + (expression4 != null ? expression4.hashCode() : 0);
        xll xllVar2 = this.h;
        int b3 = hashCode5 + (xllVar2 != null ? xllVar2.b() : 0);
        this.i = Integer.valueOf(b3);
        return b3;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((a4k) ft6.b.K.getValue()).b(ft6.a, this);
    }
}
