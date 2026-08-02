package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class lm1 {
    public final ueo a;
    public final xq b = new xq(6);

    public lm1(ueo ueoVar) {
        this.a = ueoVar;
    }

    public final Object a(List list, cg6 cg6Var) {
        StringBuilder k = dfi.k("SELECT * FROM artist WHERE original_id IN (");
        swf.x(list.size(), k);
        k.append(")");
        return up6.G(this.a, true, false, new i20(k.toString(), list, 2), cg6Var);
    }
}
