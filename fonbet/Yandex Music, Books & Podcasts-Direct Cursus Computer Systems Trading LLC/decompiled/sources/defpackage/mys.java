package defpackage;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class mys {
    public final ueo a;
    public final xq b = new xq(26);

    public mys(ueo ueoVar) {
        this.a = ueoVar;
    }

    public final Object a(List list, cg6 cg6Var) {
        StringBuilder k = dfi.k("DELETE FROM track_operation WHERE _id IN (");
        swf.x(list.size(), k);
        k.append(")");
        Object G = up6.G(this.a, false, true, new i20(k.toString(), list, 5), cg6Var);
        return G == nm6.a ? G : Unit.a;
    }
}
