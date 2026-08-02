package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class d0o {
    public final u7e a;
    public final String b;
    public final zvd c;
    public final h0o d;
    public final Map e;
    public cp3 f;

    public d0o(u7e u7eVar, String str, zvd zvdVar, h0o h0oVar, Map map) {
        u7eVar.getClass();
        str.getClass();
        this.a = u7eVar;
        this.b = str;
        this.c = zvdVar;
        this.d = h0oVar;
        this.e = map;
    }

    public final cp3 a() {
        cp3 cp3Var = this.f;
        if (cp3Var != null) {
            return cp3Var;
        }
        cp3 cp3Var2 = cp3.n;
        cp3 F = men.F(this.c);
        this.f = F;
        return F;
    }

    public final b0o b() {
        b0o b0oVar = new b0o();
        b0oVar.e = new LinkedHashMap();
        b0oVar.a = this.a;
        b0oVar.b = this.b;
        b0oVar.d = this.d;
        Map map = this.e;
        b0oVar.e = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        b0oVar.c = this.c.m();
        return b0oVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        zvd zvdVar = this.c;
        if (zvdVar.size() != 0) {
            sb.append(", headers=[");
            Iterator it = zvdVar.iterator();
            int i = 0;
            while (true) {
                c7 c7Var = (c7) it;
                if (!c7Var.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = c7Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    u75.n();
                    throw null;
                }
                Pair pair = (Pair) next;
                String str = (String) pair.a;
                String str2 = (String) pair.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
