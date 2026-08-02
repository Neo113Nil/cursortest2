package defpackage;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import java.util.List;

/* loaded from: classes14.dex */
public final class qc80 {
    public final o2y0 a;
    public final List b;
    public final OrderScreen c;

    public qc80(o2y0 o2y0Var, List list, OrderScreen orderScreen) {
        this.a = o2y0Var;
        this.b = list;
        this.c = orderScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc80)) {
            return false;
        }
        qc80 qc80Var = (qc80) obj;
        return jl40.l(this.a, qc80Var.a) && jl40.l(this.b, qc80Var.b) && this.c == qc80Var.c;
    }

    public final int hashCode() {
        o2y0 o2y0Var = this.a;
        return this.c.hashCode() + unr0.c((o2y0Var == null ? 0 : o2y0Var.hashCode()) * 31, 31, this.b);
    }
}
