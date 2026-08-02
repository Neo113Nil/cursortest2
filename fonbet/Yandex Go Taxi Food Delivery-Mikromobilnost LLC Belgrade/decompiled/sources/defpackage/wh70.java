package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.AllowedChange;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class wh70 {
    public static final List e = scc.g("destinations", "porchnumber", "destination_changes", "pickup_point");
    public final int b;
    public List c;
    public final LinkedHashMap a = new LinkedHashMap();
    public final a3y0 d = new a3y0(TaxiOrderLogGroup.CHANGE_ORDER.getTag(), "OrderAllowChangesData");

    public wh70(TaxiOrder taxiOrder) {
        if (taxiOrder == null) {
            this.b = 0;
            return;
        }
        List<AllowedChange> list = taxiOrder.V().C;
        boolean c = taxiOrder.t().c();
        if (list != null) {
            for (AllowedChange allowedChange : list) {
                String str = allowedChange.a;
                if (str != null) {
                    if (c && e.contains(str)) {
                        this.d.getClass();
                        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                        hst hstVar = jst.e;
                    } else {
                        this.a.put(str, allowedChange);
                    }
                }
            }
        }
        this.b = this.a.hashCode();
    }

    public final boolean a() {
        Collection collection;
        synchronized (this) {
            try {
                if (this.c == null) {
                    AllowedChange allowedChange = (AllowedChange) this.a.get("payment");
                    jsq0 jsq0Var = allowedChange != null ? allowedChange.b : null;
                    this.c = jsq0Var != null ? a.M(jsq0Var) : EmptyList.a;
                }
                collection = this.c;
                if (collection == null) {
                    collection = EmptyList.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return !collection.isEmpty();
    }

    public final boolean b() {
        return this.a.get("pickup_point") != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !wh70.class.equals(obj.getClass())) {
            return false;
        }
        wh70 wh70Var = (wh70) obj;
        return this.b == wh70Var.b && jl40.l(this.a, wh70Var.a);
    }

    public final int hashCode() {
        return this.b;
    }
}
