package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.FormEventType;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.a;
import ru.yandex.taxi.logistics.sdk.job.model.JobNetworkType;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes5.dex */
public final class ue11 {
    public final o5s a;
    public final boj0 b;
    public final a c;
    public final AppVisibilitySubscriptionImpl d;
    public final a201 e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public ue11(o5s o5sVar, boj0 boj0Var, a aVar, AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl, a201 a201Var) {
        this.a = o5sVar;
        this.b = boj0Var;
        this.c = aVar;
        this.d = appVisibilitySubscriptionImpl;
        this.e = a201Var;
    }

    public final void a(FormEventType formEventType) {
        j5s j5sVar;
        poq0 poq0Var;
        j6s b;
        String str;
        if (this.f.get() || (j5sVar = (j5s) this.a.c.a.getValue()) == null || (poq0Var = j5sVar.j) == null) {
            return;
        }
        ArrayList arrayList = poq0Var.a;
        boj0 boj0Var = this.b;
        boj0Var.getClass();
        if (arrayList.contains(formEventType) && (b = ((p6s) boj0Var.y).b()) != null) {
            l6s l6sVar = (l6s) boj0Var.x;
            l6sVar.getClass();
            Map a = l6sVar.a(l6s.d(b));
            if (!(a instanceof Map)) {
                a = null;
            }
            String json2 = a == null ? "" : l6sVar.c.indent("  ").toJson(b.n(b.a, a));
            Object obj = poq0Var.b;
            String json3 = obj != null ? ((f6s) boj0Var.z).a.toJson(obj) : null;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("mode", (String) boj0Var.b);
            mapBuilder.put("state_json", json2);
            mapBuilder.put("event_type", formEventType.getKey());
            a6s a6sVar = ((cv8) boj0Var.c).b;
            if (a6sVar != null && (str = a6sVar.a) != null) {
            }
            if (json3 != null) {
                mapBuilder.put("meta_json", json3);
            }
            ((tci) boj0Var.w).a(new u8x("form_send_event", "form_send_event", mapBuilder.j(), JobNetworkType.ANY));
        }
        if (arrayList.contains(formEventType)) {
            String key = formEventType.getKey();
            a201 a201Var = this.e;
            ((u1n) a201Var.c).q(b.i(new Pair("mode", (String) a201Var.b), new Pair("type", key)), "Delivery.TriggerNotifications.ClosedOrderForm");
        }
    }
}
