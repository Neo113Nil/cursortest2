package defpackage;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;

/* loaded from: classes14.dex */
public final class ra80 {
    public final OrderScreen a;
    public final int b;
    public final qa80 c;
    public final DetailsOpenReason d;
    public Object e;
    public boolean f;

    public ra80(OrderScreen orderScreen, int i, qa80 qa80Var, DetailsOpenReason detailsOpenReason) {
        this.a = orderScreen;
        this.b = i;
        this.c = qa80Var;
        this.d = detailsOpenReason;
        this.f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ra80.class.equals(obj.getClass())) {
            return false;
        }
        ra80 ra80Var = (ra80) obj;
        return this.b == ra80Var.b && this.a == ra80Var.a && jl40.l(this.c, ra80Var.c) && jl40.l(this.e, ra80Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.a.hashCode() + (this.b * 31)) * 31)) * 31;
        Object obj = this.e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public /* synthetic */ ra80(OrderScreen orderScreen, qa80 qa80Var, int i) {
        this(orderScreen, 4, (i & 4) != 0 ? new qa80(0) : qa80Var, null);
    }
}
