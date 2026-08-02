package defpackage;

import com.yandex.go.taxi.order.api.ChangeOrderApi;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.settings.preferences.a;
import com.yandex.go.taxi.order.settings.preferences.b;

/* loaded from: classes14.dex */
public final class w2r0 implements x2r0 {
    public final as21 a;
    public final b20 b;
    public final p2y0 c;
    public final String d;
    public final ChangeOrderApi e;
    public final ga9 f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w2r0(as21 as21Var, b20 b20Var, p2y0 p2y0Var, ChangeOrderApi changeOrderApi, ga9 ga9Var, int i) {
        this(as21Var, b20Var, p2y0Var, "FIELD_DONT_CALL");
        switch (i) {
            case 1:
                this(as21Var, b20Var, p2y0Var, "FIELD_DONT_SMS");
                this.e = changeOrderApi;
                this.f = ga9Var;
                b20Var.e = new b(this);
                break;
            default:
                this.e = changeOrderApi;
                this.f = ga9Var;
                b20Var.e = new a(this);
                break;
        }
    }

    @Override // defpackage.x2r0
    public final boolean update(boolean z) {
        if (this.a.a(this.d, false) == z) {
            return false;
        }
        this.a.e(this.d, z);
        for (TaxiOrder taxiOrder : ((e0) this.c).A()) {
            switch (v2r0.a[taxiOrder.h.b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    this.b.a(Boolean.valueOf(z), taxiOrder.a);
                    break;
            }
        }
        return true;
    }

    public w2r0(as21 as21Var, b20 b20Var, p2y0 p2y0Var, String str) {
        this.a = as21Var;
        this.b = b20Var;
        this.c = p2y0Var;
        this.d = str;
    }
}
