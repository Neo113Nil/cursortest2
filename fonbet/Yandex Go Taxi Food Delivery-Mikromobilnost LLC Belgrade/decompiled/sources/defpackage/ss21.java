package defpackage;

import com.yandex.go.taxi.order.i0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.provider.a;
import java.util.Calendar;

/* loaded from: classes14.dex */
public final class ss21 {
    public final ga9 a;
    public final h3y b;
    public final ysg c;
    public final b20 d;
    public final a e;

    public ss21(ga9 ga9Var, h3y h3yVar, ysg ysgVar, b20 b20Var, a aVar) {
        this.a = ga9Var;
        this.b = h3yVar;
        this.c = ysgVar;
        this.d = b20Var;
        this.e = aVar;
        b20Var.e = new i0(this);
    }

    public final boolean a(TaxiOrder taxiOrder) {
        if (taxiOrder == null || taxiOrder.H()) {
            return false;
        }
        sk7 a = this.a.a(taxiOrder.a);
        this.d.a(new j99((String) a.b, (String) a.c, (Calendar) a.w), taxiOrder.a);
        ysg ysgVar = this.c;
        ysgVar.getClass();
        synchronized (taxiOrder) {
            TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
            taxiOrderLocalData.getClass();
            taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -3, 16777215);
        }
        ysgVar.g(taxiOrder);
        return true;
    }
}
