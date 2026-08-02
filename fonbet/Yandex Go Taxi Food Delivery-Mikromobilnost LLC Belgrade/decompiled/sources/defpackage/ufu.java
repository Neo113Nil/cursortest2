package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference0;

/* loaded from: classes10.dex */
public final class ufu implements pdc {
    public final wa90 a;
    public final ol40 b;
    public final sls c;
    public final sls d;
    public final sls e;
    public final sls f;

    public ufu(wa90 wa90Var, ol40 ol40Var, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4) {
        this.a = wa90Var;
        this.b = ol40Var;
        this.c = slsVar;
        this.d = slsVar2;
        this.e = slsVar3;
        this.f = slsVar4;
    }

    public final kdc a(kdc kdcVar, String str) {
        return j(str != null ? evu0.Q(ShimmerDivHandler.NUMBER_SING, str) : null, (List) ((PropertyReference0) this.d).get(), kdcVar);
    }

    public final kdc b(String str) {
        return c(str != null ? evu0.Q(ShimmerDivHandler.NUMBER_SING, str) : null, (List) ((PropertyReference0) this.d).get());
    }

    public final kdc c(String str, List list) {
        yfu yfuVar;
        Object obj;
        wa90 wa90Var = this.a;
        bdc b = wa90Var.b(str);
        if (b != null) {
            return b;
        }
        if (str != null) {
            this.b.getClass();
            edc a = ol40.a(str);
            if (a != null) {
                return a;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    yfuVar = null;
                    break;
                }
                yfuVar = (yfu) it.next();
                List list2 = yfuVar.a;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(evu0.Q(ShimmerDivHandler.NUMBER_SING, (String) it2.next()));
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (str.equalsIgnoreCase((String) obj)) {
                        break;
                    }
                }
                if (((String) obj) != null) {
                    break;
                }
            }
            if (yfuVar != null) {
                return wa90Var.b(yfuVar.b);
            }
            Integer S = q5z.S(str);
            if (S != null && S.intValue() == 0) {
                S = null;
            }
            if (S != null) {
                return new cdc(S.intValue());
            }
        }
        return null;
    }

    public final kdc d(kdc kdcVar, String str) {
        return j(str != null ? evu0.Q(ShimmerDivHandler.NUMBER_SING, str) : null, (List) ((PropertyReference0) this.f).get(), kdcVar);
    }

    public final kdc e(String str) {
        return c(str != null ? evu0.Q(ShimmerDivHandler.NUMBER_SING, str) : null, (List) ((PropertyReference0) this.f).get());
    }

    public final kdc f(kdc kdcVar, String str) {
        return j(str != null ? evu0.Q(ShimmerDivHandler.NUMBER_SING, str) : null, (List) ((PropertyReference0) this.e).get(), kdcVar);
    }

    public final kdc g(String str) {
        return c(str != null ? evu0.Q(ShimmerDivHandler.NUMBER_SING, str) : null, (List) ((PropertyReference0) this.e).get());
    }

    public final kdc h(kdc kdcVar, String str) {
        return j(str != null ? evu0.Q(ShimmerDivHandler.NUMBER_SING, str) : null, (List) ((PropertyReference0) this.c).get(), kdcVar);
    }

    public final kdc i(String str) {
        return c(str != null ? evu0.Q(ShimmerDivHandler.NUMBER_SING, str) : null, (List) ((PropertyReference0) this.c).get());
    }

    public final kdc j(String str, List list, kdc kdcVar) {
        kdc c;
        return ("L:#;D:#".equalsIgnoreCase(str) || (c = c(str, list)) == null) ? kdcVar : c;
    }
}
