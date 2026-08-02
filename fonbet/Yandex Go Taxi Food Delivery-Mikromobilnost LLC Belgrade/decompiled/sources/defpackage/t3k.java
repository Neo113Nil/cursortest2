package defpackage;

import com.yandex.div.json.expressions.Expression;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class t3k implements c4x {
    public final v3k a;
    public final List b;
    public final Expression c;
    public Integer d;

    public t3k(v3k v3kVar, List list, Expression expression) {
        this.a = v3kVar;
        this.b = list;
        this.c = expression;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r1 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(t3k t3kVar, rvo rvoVar, rvo rvoVar2) {
        if (t3kVar == null) {
            return false;
        }
        v3k v3kVar = t3kVar.a;
        v3k v3kVar2 = this.a;
        if (v3kVar2 != null ? v3kVar2.a(v3kVar, rvoVar, rvoVar2) : v3kVar == null) {
            List list = t3kVar.b;
            List list2 = this.b;
            if (list2 != null) {
                if (list != null && list2.size() == list.size()) {
                    int i = 0;
                    for (Object obj : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        if (!((v3k) obj).a((v3k) list.get(i), rvoVar, rvoVar2)) {
                            break;
                        }
                        i = i2;
                    }
                    if (jl40.l(this.c.a(rvoVar), t3kVar.c.a(rvoVar2))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(t3k.class).hashCode();
        int i = 0;
        v3k v3kVar = this.a;
        int b = hashCode + (v3kVar != null ? v3kVar.b() : 0);
        List list = this.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += ((v3k) it.next()).b();
            }
        }
        int hashCode2 = this.c.hashCode() + b + i;
        this.d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((i7k) ft6.b.w1.getValue()).b(ft6.a, this);
    }
}
