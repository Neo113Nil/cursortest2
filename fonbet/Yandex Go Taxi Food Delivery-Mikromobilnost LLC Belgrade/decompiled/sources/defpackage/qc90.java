package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes4.dex */
public final class qc90 extends d6z {
    public final /* synthetic */ int f = 0;
    public final Method g;
    public final int h;
    public final zme i;
    public final Object j;

    public qc90(Method method, int i, zme zmeVar, String str) {
        this.g = method;
        this.h = i;
        this.i = zmeVar;
        this.j = str;
    }

    @Override // defpackage.d6z
    public final void c(q5j0 q5j0Var, Object obj) {
        int i = this.f;
        zme zmeVar = this.i;
        Object obj2 = this.j;
        Method method = this.g;
        int i2 = this.h;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    m5j0 m5j0Var = (m5j0) zmeVar.l(obj);
                    q5j0Var.i.a((meu) obj2, m5j0Var);
                    return;
                } catch (IOException e) {
                    throw udq0.J(method, i2, qv10.p("Unable to convert ", " to RequestBody", obj), e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw udq0.J(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw udq0.J(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw udq0.J(method, i2, oyr.p("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    q5j0Var.i.a(wwg.z("Content-Disposition", oyr.p("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (m5j0) zmeVar.l(value));
                }
                return;
        }
    }

    public qc90(Method method, int i, meu meuVar, zme zmeVar) {
        this.g = method;
        this.h = i;
        this.j = meuVar;
        this.i = zmeVar;
    }
}
