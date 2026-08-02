package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class rq10 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        boolean z;
        lp10 lp10Var;
        u8j0 u8j0Var = ((pq10) obj).b;
        qc70 qc70Var = (u8j0Var == null || !(u8j0Var instanceof t8j0)) ? oc70.a : pc70.a;
        kao kaoVar = null;
        kaoVar = null;
        List list = (u8j0Var == null || (lp10Var = (lp10) u8j0Var.a()) == null) ? null : lp10Var.a;
        if (list == null) {
            list = EmptyList.a;
        }
        if (u8j0Var != null && ((z = u8j0Var instanceof s8j0))) {
            s8j0 s8j0Var = z ? (s8j0) u8j0Var : null;
            kaoVar = r501.a(s8j0Var != null ? s8j0Var.a : null, null, null, null, null, null, null, null, null, null, null, null, null, 65534);
        }
        return new qq10(qc70Var, list, kaoVar);
    }
}
