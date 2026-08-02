package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vjk implements c4x {
    public final DivEdgeInsets a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final aok e;
    public Integer f;

    static {
        Boolean bool = Boolean.FALSE;
        ngd0.m(bool);
        ngd0.m(bool);
        ngd0.m(Boolean.TRUE);
    }

    public vjk(DivEdgeInsets divEdgeInsets, Expression expression, Expression expression2, Expression expression3, aok aokVar) {
        this.a = divEdgeInsets;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = aokVar;
    }

    public final boolean a(vjk vjkVar, rvo rvoVar, rvo rvoVar2) {
        if (vjkVar == null) {
            return false;
        }
        DivEdgeInsets divEdgeInsets = vjkVar.a;
        DivEdgeInsets divEdgeInsets2 = this.a;
        return (divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) && ((Boolean) this.b.a(rvoVar)).booleanValue() == ((Boolean) vjkVar.b.a(rvoVar2)).booleanValue() && ((Boolean) this.c.a(rvoVar)).booleanValue() == ((Boolean) vjkVar.c.a(rvoVar2)).booleanValue() && ((Boolean) this.d.a(rvoVar)).booleanValue() == ((Boolean) vjkVar.d.a(rvoVar2)).booleanValue() && this.e.a(vjkVar.e, rvoVar, rvoVar2);
    }

    public final int b() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(vjk.class).hashCode();
        DivEdgeInsets divEdgeInsets = this.a;
        int b = this.e.b() + this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + hashCode + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        this.f = Integer.valueOf(b);
        return b;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((akk) ft6.b.y2.getValue()).b(ft6.a, this);
    }
}
