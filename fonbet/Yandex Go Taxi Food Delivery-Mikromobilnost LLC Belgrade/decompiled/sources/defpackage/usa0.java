package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.provider.a;
import com.yandex.go.taxi.order.y;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes14.dex */
public final class usa0 {
    public final h3y a;
    public final h3y b;
    public final MainUiAvailabilityMonitor c;
    public final y d;

    public usa0(h3y h3yVar, h3y h3yVar2, MainUiAvailabilityMonitor mainUiAvailabilityMonitor, y yVar) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = mainUiAvailabilityMonitor;
        this.d = yVar;
    }

    public final Object a(String str, Continuation continuation) {
        return !this.c.a ? ((a) this.b.get()).h(str, true, false, (ContinuationImpl) continuation) : zy11.a;
    }

    public final Object b(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        return ((a) ((n20) this.a.get())).j(taxiOrder, continuationImpl);
    }

    public final void c(String str) {
        this.d.m(0L, str);
    }
}
