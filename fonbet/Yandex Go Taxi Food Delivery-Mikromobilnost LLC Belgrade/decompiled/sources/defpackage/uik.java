package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class uik implements c4x {
    public final Expression a;
    public final Expression b;
    public final DivEdgeInsets c;
    public Integer d;

    public uik(Expression expression, Expression expression2, DivEdgeInsets divEdgeInsets) {
        this.a = expression;
        this.b = expression2;
        this.c = divEdgeInsets;
    }

    public final boolean a(uik uikVar, rvo rvoVar, rvo rvoVar2) {
        if (uikVar != null && ((Number) this.a.a(rvoVar)).intValue() == ((Number) uikVar.a.a(rvoVar2)).intValue() && ((Number) this.b.a(rvoVar)).longValue() == ((Number) uikVar.b.a(rvoVar2)).longValue()) {
            DivEdgeInsets divEdgeInsets = uikVar.c;
            DivEdgeInsets divEdgeInsets2 = this.c;
            if (divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(uik.class).hashCode();
        DivEdgeInsets divEdgeInsets = this.c;
        int b = hashCode + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        this.d = Integer.valueOf(b);
        return b;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((vik) ft6.b.j2.getValue()).b(ft6.a, this);
    }
}
