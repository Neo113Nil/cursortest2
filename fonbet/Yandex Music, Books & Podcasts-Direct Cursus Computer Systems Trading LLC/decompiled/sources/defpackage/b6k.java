package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class b6k extends p1g {
    public final Method a;
    public final int b;
    public final vj6 c;

    public b6k(Method method, int i, vj6 vj6Var) {
        this.a = method;
        this.b = i;
        this.c = vj6Var;
    }

    @Override // defpackage.p1g
    public final void y(j0o j0oVar, Object obj) {
        int i = this.b;
        Method method = this.a;
        if (obj == null) {
            throw jf0.R(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            j0oVar.k = (h0o) this.c.a(obj);
        } catch (IOException e) {
            throw jf0.S(method, e, i, dfi.g("Unable to convert ", " to RequestBody", obj), new Object[0]);
        }
    }
}
