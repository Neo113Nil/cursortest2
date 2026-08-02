package ru.yandex.taxi.masstransit.paymentcards;

import defpackage.gw00;
import defpackage.h3y;
import defpackage.ike;
import defpackage.k4o;
import defpackage.kgx;
import defpackage.sy00;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.am.g;

/* loaded from: classes6.dex */
public final class c {
    public static final LinkedHashMap d;
    public final h3y a;
    public final g b;
    public final sy00 c;

    static {
        kgx[] kgxVarArr = sy00.h;
        k4o a = MtTransportCardSubscriber$TransportCardEventType.a();
        int d2 = gw00.d(tcc.n(a, 10));
        if (d2 < 16) {
            d2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
        for (Object obj : a) {
            linkedHashMap.put(((MtTransportCardSubscriber$TransportCardEventType) obj).getEventName(), obj);
        }
        d = linkedHashMap;
    }

    public c(h3y h3yVar, g gVar, sy00 sy00Var) {
        this.a = h3yVar;
        this.b = gVar;
        this.c = sy00Var;
    }

    public final void a(ike ikeVar, tls tlsVar) {
        tje.N(ikeVar, null, null, new MtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$safeCollectIn$1(e.X(e.t(new n(new b(this.b.h()), new MtTransportCardSubscriber$subscribeToTransportCardEvents$2(null, this))), new MtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$flatMapLatest$1(null, this)), null, this, tlsVar), 3);
    }
}
