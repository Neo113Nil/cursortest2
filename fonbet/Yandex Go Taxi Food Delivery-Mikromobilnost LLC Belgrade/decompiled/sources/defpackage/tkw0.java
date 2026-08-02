package defpackage;

import com.yandex.go.taxi.order.details.v1.elements.support.experiment.SupportOnCompleteExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.Locale;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class tkw0 implements q8j {
    public final ukw0 a;
    public final cjw0 b;
    public final gci0 c;

    public tkw0(ukw0 ukw0Var, cjw0 cjw0Var) {
        this.a = ukw0Var;
        this.b = cjw0Var;
        this.c = ukw0Var.b;
    }

    @Override // defpackage.q8j
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        xkw0 xkw0Var;
        SupportOnCompleteExperiment a = ckw0.a(taxiOrder);
        if (a.b) {
            String g = this.b.g(a, taxiOrder.a);
            xkw0Var = g == null ? xkw0.d : new xkw0(d6z.Y(a, "button_title"), new wak0("OPEN_CHAT".toLowerCase(Locale.ROOT), g), true);
        } else {
            xkw0Var = xkw0.d;
        }
        this.a.a.l(xkw0Var);
        return zy11.a;
    }
}
