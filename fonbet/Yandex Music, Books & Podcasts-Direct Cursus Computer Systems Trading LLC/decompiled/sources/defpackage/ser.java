package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class ser extends nt0 {
    public final Map u;

    public ser(Map map) {
        this.u = map;
    }

    @Override // defpackage.nt0
    public final Object U(ob8 ob8Var, e23 e23Var, pm9 pm9Var) {
        kxt c;
        String str = ob8Var.c.H;
        if (str != null && (c = e23Var.b.c(str)) != null) {
            String str2 = pm9Var.f() + '/' + ((String) CollectionsKt.Y(pm9Var.c));
            Map map = this.u;
            if (map.get(str2) == null) {
                map.put(str2, new ter(c));
            }
            super.U(ob8Var, e23Var, pm9Var);
        }
        return Unit.a;
    }

    @Override // defpackage.nt0
    public final /* bridge */ /* synthetic */ Unit x(jc8 jc8Var, e23 e23Var, pm9 pm9Var) {
        return Unit.a;
    }
}
