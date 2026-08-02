package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.masstransit.geopayment.tickets.MtPaymentTicketsInteractor$getTickets$$inlined$flatMapLatest$1;
import ru.yandex.taxi.masstransit.geopayment.tickets.MtPaymentTicketsInteractor$routeFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.masstransit.geopayment.tickets.b;

/* loaded from: classes6.dex */
public final class wr30 {
    public final xr30 a;
    public final k b;
    public final tu30 c;

    public wr30(xr30 xr30Var, k kVar, tu30 tu30Var) {
        this.a = xr30Var;
        this.b = kVar;
        this.c = tu30Var;
    }

    public final g a() {
        return e.X(b(), new MtPaymentTicketsInteractor$getTickets$$inlined$flatMapLatest$1(null, this));
    }

    public final b2k b() {
        return e.s(e.X(e.t(new b(this.b.Hg())), new MtPaymentTicketsInteractor$routeFlow$$inlined$flatMapLatest$1(null, this)), new i0z(27));
    }
}
