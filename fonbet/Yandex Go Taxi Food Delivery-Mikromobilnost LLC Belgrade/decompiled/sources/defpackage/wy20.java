package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes12.dex */
public final class wy20 {
    public static final List b;
    public final i3y a;

    static {
        kz20 kz20Var = new kz20("default", Float.valueOf(0.42f));
        Float valueOf = Float.valueOf(0.6f);
        b = scc.g(new nz20(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, scc.g(kz20Var, new kz20("search", valueOf), new kz20("driving", valueOf), new kz20("waiting", valueOf), new kz20("transporting", Float.valueOf(0.7f)))), new nz20("eats", Collections.singletonList(new kz20("default", valueOf))), new nz20("market", Collections.singletonList(new kz20("default", valueOf))), new nz20("grocery", Collections.singletonList(new kz20("default", valueOf))), new nz20("shop", Collections.singletonList(new kz20("default", valueOf))));
    }

    public wy20(h3y h3yVar) {
        this.a = a.a(new l0b(h3yVar, 3));
    }
}
