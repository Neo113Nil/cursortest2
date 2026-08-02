package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class g6k extends p1g {
    public final /* synthetic */ int a = 1;
    public final Method b;
    public final int c;
    public final vj6 d;
    public final Object e;

    public g6k(Method method, int i, vj6 vj6Var, String str) {
        this.b = method;
        this.c = i;
        this.d = vj6Var;
        this.e = str;
    }

    @Override // defpackage.p1g
    public final void y(j0o j0oVar, Object obj) {
        switch (this.a) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    j0oVar.c((zvd) this.e, (h0o) this.d.a(obj));
                    return;
                } catch (IOException e) {
                    throw jf0.R(this.b, this.c, dfi.g("Unable to convert ", " to RequestBody", obj), e);
                }
            default:
                Map map = (Map) obj;
                int i = this.c;
                Method method = this.b;
                if (map == null) {
                    throw jf0.R(method, i, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw jf0.R(method, i, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw jf0.R(method, i, hrg.q("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    j0oVar.c(qwp.g0("Content-Disposition", hrg.q("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) this.e), (h0o) this.d.a(value));
                }
                return;
        }
    }

    public g6k(Method method, int i, zvd zvdVar, vj6 vj6Var) {
        this.b = method;
        this.c = i;
        this.e = zvdVar;
        this.d = vj6Var;
    }
}
