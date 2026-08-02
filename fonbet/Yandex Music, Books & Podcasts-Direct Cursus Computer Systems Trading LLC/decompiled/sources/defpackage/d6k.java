package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class d6k extends p1g {
    public final /* synthetic */ int a;
    public final Method b;
    public final int c;
    public final boolean d;

    public /* synthetic */ d6k(Method method, int i, boolean z, int i2) {
        this.a = i2;
        this.b = method;
        this.c = i;
        this.d = z;
    }

    @Override // defpackage.p1g
    public final void y(j0o j0oVar, Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                int i = this.c;
                Method method = this.b;
                if (map == null) {
                    throw jf0.R(method, i, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw jf0.R(method, i, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw jf0.R(method, i, hrg.q("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String obj2 = value.toString();
                    if (obj2 == null) {
                        throw jf0.R(method, i, "Field map value '" + value + "' converted to null by " + pj3.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    j0oVar.a(str, obj2, this.d);
                }
                return;
            default:
                Map map2 = (Map) obj;
                int i2 = this.c;
                Method method2 = this.b;
                if (map2 == null) {
                    throw jf0.R(method2, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw jf0.R(method2, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw jf0.R(method2, i2, hrg.q("Query map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    String obj3 = value2.toString();
                    if (obj3 == null) {
                        throw jf0.R(method2, i2, "Query map value '" + value2 + "' converted to null by " + pj3.class.getName() + " for key '" + str2 + "'.", new Object[0]);
                    }
                    j0oVar.d(str2, obj3, this.d);
                }
                return;
        }
    }
}
