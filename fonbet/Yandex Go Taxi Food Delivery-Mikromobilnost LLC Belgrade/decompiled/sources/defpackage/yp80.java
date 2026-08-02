package defpackage;

import com.yandex.go.places.impl.domain.interactors.organizations.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class yp80 extends ad5 {
    public final aq80 A;
    public final jio x;
    public final g y;
    public final yx20 z;

    public yp80(jio jioVar, g gVar, yx20 yx20Var, aq80 aq80Var) {
        super(wp80.class);
        this.x = jioVar;
        this.y = gVar;
        this.z = yx20Var;
        this.A = aq80Var;
    }

    public static ArrayList Kg(yx20 yx20Var) {
        List<c9t0> list = (List) yx20Var.b.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (c9t0 c9t0Var : list) {
            arrayList.add(new rp80(c9t0Var.b, c9t0Var.c, c9t0Var.a, c9t0Var.d));
        }
        return arrayList;
    }
}
