package defpackage;

import android.content.Context;
import com.yandex.go.superapp.orders.known.b;
import com.yandex.go.taxi.order.db.DbOrderImpl$Data;
import com.yandex.go.taxi.order.db.DbOrderImpl$createCommitTask$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;
import kotlin.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.utils.f;

/* loaded from: classes8.dex */
public final class ysg {
    public final fn21 a;
    public final tse b;
    public final b c;
    public final a3y0 d = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "DbOrder");
    public final jse e;
    public final tb3 f;
    public final f g;
    public final i3y h;
    public final i3y i;

    public ysg(fn21 fn21Var, Context context, tse tseVar, wnt wntVar, b bVar, tt2 tt2Var) {
        this.a = fn21Var;
        this.b = tseVar;
        this.c = bVar;
        tt2Var.getClass();
        final int i = 1;
        this.e = uyj.a.P(1);
        final int i2 = 0;
        this.f = new tb3(new jb7(context.getDatabasePath("orders"), "orders"), new nfh(wntVar, DbOrderImpl$Data.Companion.serializer(), new DbOrderImpl$Data(i2)));
        new o931();
        ConcurrentHashMap concurrentHashMap = pwf0.a;
        this.g = new f(xsg.class);
        this.h = a.a(new sls(this) { // from class: vsg
            public final /* synthetic */ ysg b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3;
                int i4 = i2;
                boolean z = true;
                ysg ysgVar = this.b;
                switch (i4) {
                    case 0:
                        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
                        tje.N(ysgVar.b, null, null, new DbOrderImpl$createCommitTask$$inlined$safeCollectIn$1(b, null, ysgVar), 3);
                        return b;
                    default:
                        try {
                            DbOrderImpl$Data dbOrderImpl$Data = (DbOrderImpl$Data) ysgVar.f.a().a();
                            LinkedHashSet<TaxiOrder> linkedHashSet = dbOrderImpl$Data.a;
                            if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
                                i3 = 0;
                                for (TaxiOrder taxiOrder : linkedHashSet) {
                                    if (taxiOrder.l.getA() && taxiOrder.I() && !taxiOrder.K() && (i3 = i3 + 1) < 0) {
                                        scc.l();
                                        throw null;
                                    }
                                }
                            } else {
                                i3 = 0;
                            }
                            if (i3 <= 1) {
                                z = false;
                            }
                            if (z) {
                                a3y0 a3y0Var = ysgVar.d;
                                IllegalStateException illegalStateException = new IllegalStateException("Too much commiting orders");
                                String l = a3y0Var.l(new String[]{"readData", "shouldRemovePreorders"});
                                hst hstVar = jst.e;
                                String str = a3y0Var.a;
                                ist m = hstVar.m(l);
                                ke00 a = m.b.a();
                                if (a != null && a.b(15)) {
                                    a.a(15, str, illegalStateException, "Data restoration problem", m.a);
                                }
                            }
                            dbOrderImpl$Data.a.removeIf(new md3(4, new wsg(ysgVar, z)));
                            return dbOrderImpl$Data;
                        } catch (RuntimeException e) {
                            ysgVar.d.b("readData", e, new cue(22));
                            return new DbOrderImpl$Data(0);
                        }
                }
            }
        });
        this.i = a.a(new sls(this) { // from class: vsg
            public final /* synthetic */ ysg b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3;
                int i4 = i;
                boolean z = true;
                ysg ysgVar = this.b;
                switch (i4) {
                    case 0:
                        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
                        tje.N(ysgVar.b, null, null, new DbOrderImpl$createCommitTask$$inlined$safeCollectIn$1(b, null, ysgVar), 3);
                        return b;
                    default:
                        try {
                            DbOrderImpl$Data dbOrderImpl$Data = (DbOrderImpl$Data) ysgVar.f.a().a();
                            LinkedHashSet<TaxiOrder> linkedHashSet = dbOrderImpl$Data.a;
                            if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
                                i3 = 0;
                                for (TaxiOrder taxiOrder : linkedHashSet) {
                                    if (taxiOrder.l.getA() && taxiOrder.I() && !taxiOrder.K() && (i3 = i3 + 1) < 0) {
                                        scc.l();
                                        throw null;
                                    }
                                }
                            } else {
                                i3 = 0;
                            }
                            if (i3 <= 1) {
                                z = false;
                            }
                            if (z) {
                                a3y0 a3y0Var = ysgVar.d;
                                IllegalStateException illegalStateException = new IllegalStateException("Too much commiting orders");
                                String l = a3y0Var.l(new String[]{"readData", "shouldRemovePreorders"});
                                hst hstVar = jst.e;
                                String str = a3y0Var.a;
                                ist m = hstVar.m(l);
                                ke00 a = m.b.a();
                                if (a != null && a.b(15)) {
                                    a.a(15, str, illegalStateException, "Data restoration problem", m.a);
                                }
                            }
                            dbOrderImpl$Data.a.removeIf(new md3(4, new wsg(ysgVar, z)));
                            return dbOrderImpl$Data;
                        } catch (RuntimeException e) {
                            ysgVar.d.b("readData", e, new cue(22));
                            return new DbOrderImpl$Data(0);
                        }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:9:0x0010->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized TaxiOrder a(String str) {
        boolean z;
        Object obj = null;
        if (str == null) {
            return null;
        }
        try {
            Iterator it = d().a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                TaxiOrder taxiOrder = (TaxiOrder) next;
                if (!jl40.l(taxiOrder.a, str) && !taxiOrder.l.y(str)) {
                    z = false;
                    if (!z) {
                        obj = next;
                        break;
                    }
                }
                z = true;
                if (!z) {
                }
            }
            return (TaxiOrder) obj;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        ((lz40) this.h.getValue()).g(new oxe(11, this));
    }

    public final synchronized TaxiOrder c(String str, Supplier supplier, Consumer consumer) {
        TaxiOrder a;
        try {
            a = a(str);
            if (a == null) {
                a = (TaxiOrder) supplier.get();
            } else {
                consumer.accept(a);
            }
            g(a);
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final DbOrderImpl$Data d() {
        return (DbOrderImpl$Data) this.i.getValue();
    }

    public final synchronized boolean e(String str) {
        if (a(str) != null) {
            return false;
        }
        return kotlin.collections.a.G(d().b, str);
    }

    public final synchronized TaxiOrder f(String str, String str2, Supplier supplier) {
        TaxiOrder a;
        try {
            this.d.f(new xc8(str, 8), "reactivateOrder");
            a = a(str);
            if (a == null) {
                a = (TaxiOrder) supplier.get();
            }
            a.getClass();
            if (str2 != null && str2.length() != 0) {
                synchronized (a) {
                    a.l = a.l.a(str2);
                }
            }
            a.O(true);
            if (d().b.remove(str)) {
                this.c.b(a.a, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, a.h.getB().toString());
            }
            g(a);
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final synchronized void g(TaxiOrder taxiOrder) {
        if (!taxiOrder.l.getA()) {
            b();
            return;
        }
        if (taxiOrder.K()) {
            return;
        }
        if (d().a.add(taxiOrder)) {
            l(taxiOrder);
            d().d = taxiOrder.a;
            ((xsg) this.g.c).gd();
            this.c.b(taxiOrder.a, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, taxiOrder.h.getB().toString());
        } else {
            ((xsg) this.g.c).F3();
            this.c.e(taxiOrder.a, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, taxiOrder.h.getB().toString());
        }
        b();
    }

    public final synchronized void h(TaxiOrder taxiOrder) {
        j(v4r0.h(Collections.singleton(taxiOrder.a), taxiOrder.l.getM()));
    }

    public final synchronized void i(String str) {
        j(Collections.singleton(str));
    }

    public final synchronized void j(Collection collection) {
        try {
            this.d.f(new ybf(13, collection), "setNoAskFeedback");
            LinkedHashSet linkedHashSet = d().b;
            linkedHashSet.addAll(collection);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext() && linkedHashSet.size() > 32) {
                it.next();
                it.remove();
            }
            b();
            this.c.d(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, collection);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(TaxiOrder taxiOrder, boolean z) {
        if (taxiOrder.l.getA() == z) {
            return;
        }
        synchronized (taxiOrder) {
            taxiOrder.l = taxiOrder.l.X(z);
        }
        g(taxiOrder);
    }

    public final void l(TaxiOrder taxiOrder) {
        pv70 pv70Var = taxiOrder.b.M;
        if (pv70Var == null) {
            return;
        }
        LinkedHashMap linkedHashMap = d().c;
        pv70 pv70Var2 = (pv70) linkedHashMap.get(pv70Var.d());
        if (pv70Var2 == null || !pv70Var2.c().equals(pv70Var.c())) {
            linkedHashMap.put(pv70Var.d(), pv70Var);
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext() && linkedHashMap.size() > 5) {
                it.next();
                it.remove();
            }
        }
    }
}
