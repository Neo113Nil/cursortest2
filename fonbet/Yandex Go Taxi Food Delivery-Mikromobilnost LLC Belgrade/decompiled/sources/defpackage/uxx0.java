package defpackage;

import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@gsq0
/* loaded from: classes5.dex */
public final class uxx0 {
    public static final sxx0 Companion = new sxx0();
    public final xzs a;
    public final xzs b;
    public final Boolean c;
    public final String d;
    public final String e;

    public /* synthetic */ uxx0(int i, xzs xzsVar, xzs xzsVar2, Boolean bool, String str, String str2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, rxx0.a.getDescriptor());
            throw null;
        }
        this.a = xzsVar;
        this.b = xzsVar2;
        this.c = bool;
        this.d = str;
        if ((i & 16) == 0) {
            this.e = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
        } else {
            this.e = str2;
        }
    }

    public uxx0(xzs xzsVar, xzs xzsVar2, Boolean bool, String str) {
        this.a = xzsVar;
        this.b = xzsVar2;
        this.c = bool;
        this.d = str;
        this.e = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
    }
}
