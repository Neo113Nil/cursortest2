package defpackage;

import com.yandex.go.taxi.order.bottom_modal.domain.a;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class vc6 extends ad5 {
    public final a x;
    public final yc6 y;
    public final xc6 z;

    public vc6(a aVar, yc6 yc6Var, xc6 xc6Var) {
        super(tc6.class);
        this.x = aVar;
        this.y = yc6Var;
        this.z = xc6Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        koz0 koz0Var = (koz0) this.z.c.b;
        koz0Var.getClass();
        koz0Var.a.a("TollRoadAlert.Closed", new HashMap(), 1, new HashMap());
        super.Cg();
    }
}
