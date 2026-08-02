package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r720 implements hs31 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ r720(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        Object obj;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj2;
                yvf0 yvf0Var = (yvf0) map.get(cls);
                if (yvf0Var == null) {
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (cls.isAssignableFrom((Class) ((Map.Entry) obj).getKey())) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    yvf0Var = entry != null ? (yvf0) entry.getValue() : null;
                }
                if (yvf0Var == null) {
                    xfo.g(qv10.l(cls, "Unknown model class: "));
                    break;
                } else {
                    try {
                        break;
                    } catch (Exception e) {
                        ny61.n(b64.l("Failed to create an instance of ViewModel: ", cls.getName(), ". Error: ", e.getMessage()), e);
                        return null;
                    }
                }
            default:
                rwo rwoVar = (rwo) obj2;
                if (!cls.equals(bqr0.class)) {
                    if (!cls.equals(io0.class)) {
                        ny61.r("Unknown view model");
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return null;
    }
}
