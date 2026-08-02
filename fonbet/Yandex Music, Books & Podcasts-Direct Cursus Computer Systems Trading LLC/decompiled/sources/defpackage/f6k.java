package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class f6k extends p1g {
    public final /* synthetic */ int a;
    public final Method b;
    public final int c;

    public /* synthetic */ f6k(Method method, int i, int i2) {
        this.a = i2;
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.p1g
    public final void y(j0o j0oVar, Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                int i = this.c;
                Method method = this.b;
                if (map == null) {
                    throw jf0.R(method, i, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw jf0.R(method, i, "Header map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw jf0.R(method, i, hrg.q("Header map contained null value for key '", str, "'."), new Object[0]);
                    }
                    j0oVar.b(str, value.toString());
                }
                return;
            case 1:
                zvd zvdVar = (zvd) obj;
                if (zvdVar == null) {
                    throw jf0.R(this.b, this.c, "Headers parameter must not be null.", new Object[0]);
                }
                pv9 pv9Var = j0oVar.f;
                pv9Var.getClass();
                int size = zvdVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    pv9Var.m(zvdVar.g(i2), zvdVar.q(i2));
                }
                return;
            default:
                if (obj == null) {
                    throw jf0.R(this.b, this.c, "@Url parameter is null.", new Object[0]);
                }
                j0oVar.c = obj.toString();
                return;
        }
    }
}
