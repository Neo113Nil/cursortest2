package defpackage;

import com.yandex.plus.core.graphql.internal.a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class rya1 {
    public static final au2 a(mgv mgvVar, boolean z) {
        return new au2(Collections.singletonList(new iu2(mgvVar, z)));
    }

    public static final void b(vo2 vo2Var) {
        List list = vo2Var.d;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                throw a.e((t5o) kotlin.collections.a.P(list));
            }
        }
    }

    public static final lum c(tls tlsVar, sls slsVar, sls slsVar2, sls slsVar3, tls tlsVar2, sls slsVar4, sls slsVar5) {
        return new lum(new t1m0((byte) 0, 20), v6m0.a, new rs5(slsVar4, slsVar, slsVar2, slsVar3, slsVar5, tlsVar2, tlsVar, 10), w6m0.a);
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
