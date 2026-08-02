package defpackage;

import com.yandex.go.taxi.order.provider.a;
import com.yandex.mapkit.geometry.BoundingBox;
import java.util.HashMap;
import java.util.Iterator;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class zy70 implements agi0 {
    public final a a;
    public final dr00 b;
    public final HashMap c = new HashMap();
    public final r0 w = bvf0.c(null);
    public final hbp0 x = new hbp0(new czo0(14), "", null);
    public boolean y;

    public zy70(a aVar, dr00 dr00Var) {
        this.a = aVar;
        this.b = dr00Var;
    }

    @Override // defpackage.agi0
    public final void Sb(o2y0 o2y0Var, BoundingBox boundingBox) {
        this.c.put(o2y0Var, boundingBox);
        r0 r0Var = this.w;
        r0Var.getClass();
        r0Var.m(null, boundingBox);
    }

    @Override // defpackage.agi0
    public final void Xb(boolean z) {
        BoundingBox h;
        if (((BoundingBox) this.w.getValue()) == null || (h = h()) == null) {
            return;
        }
        ((fr00) this.b).a(h, z, null);
    }

    public final BoundingBox h() {
        fi6 fi6Var = new fi6();
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            fi6Var.b((BoundingBox) it.next());
        }
        if (fi6Var.i()) {
            return null;
        }
        return fi6Var.g();
    }
}
