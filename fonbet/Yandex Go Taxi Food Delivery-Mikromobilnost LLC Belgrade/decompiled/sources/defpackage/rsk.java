package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class rsk implements c4x {
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final List d;
    public final Expression e;
    public final Expression f;
    public final Expression g;
    public Integer h;

    static {
        ngd0.m(Double.valueOf(1.0d));
        ngd0.m(DivAlignmentHorizontal.CENTER);
        ngd0.m(DivAlignmentVertical.CENTER);
        ngd0.m(Boolean.FALSE);
        ngd0.m(DivImageScale.FILL);
    }

    public rsk(Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, Expression expression5, Expression expression6) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = list;
        this.e = expression4;
        this.f = expression5;
        this.g = expression6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r1 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(rsk rskVar, rvo rvoVar, rvo rvoVar2) {
        if (rskVar != null && ((Number) this.a.a(rvoVar)).doubleValue() == ((Number) rskVar.a.a(rvoVar2)).doubleValue() && this.b.a(rvoVar) == rskVar.b.a(rvoVar2) && this.c.a(rvoVar) == rskVar.c.a(rvoVar2)) {
            List list = rskVar.d;
            List list2 = this.d;
            if (list2 != null) {
                if (list != null && list2.size() == list.size()) {
                    int i = 0;
                    for (Object obj : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        if (!((qpk) obj).a((qpk) list.get(i), rvoVar, rvoVar2)) {
                            break;
                        }
                        i = i2;
                    }
                    if (!jl40.l(this.e.a(rvoVar), rskVar.e.a(rvoVar2)) || ((Boolean) this.f.a(rvoVar)).booleanValue() != ((Boolean) rskVar.f.a(rvoVar2)).booleanValue() || this.g.a(rvoVar) != rskVar.g.a(rvoVar2)) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.h;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + qoi0.a(rsk.class).hashCode();
        int i = 0;
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += ((qpk) it.next()).b();
            }
        }
        int hashCode2 = this.g.hashCode() + this.f.hashCode() + this.e.hashCode() + hashCode + i;
        this.h = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((tsk) ft6.b.f4.getValue()).b(ft6.a, this);
    }
}
