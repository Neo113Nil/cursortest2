package defpackage;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ix9 implements u1f {
    public final List a;
    public final szb b;
    public final szb c;
    public Integer d;

    public ix9(List list, szb szbVar, szb szbVar2) {
        this.a = list;
        this.b = szbVar;
        this.c = szbVar2;
    }

    public final boolean a(ix9 ix9Var, xzb xzbVar, xzb xzbVar2) {
        if (ix9Var != null) {
            List list = ix9Var.a;
            List list2 = this.a;
            if (list2.size() == list.size()) {
                Iterator it = list2.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        if (((Boolean) this.b.a(xzbVar)).booleanValue() != ((Boolean) ix9Var.b.a(xzbVar2)).booleanValue() || this.c.a(xzbVar) != ix9Var.c.a(xzbVar2)) {
                            break;
                        }
                        return true;
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        u75.n();
                        throw null;
                    }
                    if (!((bd8) next).a((bd8) list.get(i), xzbVar, xzbVar2)) {
                        break;
                    }
                    i = i2;
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
        int hashCode = ern.a(ix9.class).hashCode();
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((bd8) it.next()).b();
        }
        int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + i;
        this.d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((kx9) rj3.b.C9.getValue()).b(rj3.a, this);
    }
}
