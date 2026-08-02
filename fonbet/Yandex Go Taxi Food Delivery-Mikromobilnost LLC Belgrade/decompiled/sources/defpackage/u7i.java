package defpackage;

import defpackage.rol0;
import defpackage.u7i;
import defpackage.wsr0;
import defpackage.xsr0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.a;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes9.dex */
public final class u7i {
    public final h3y a;
    public final r7i b;
    public final AppVisibilitySubscriptionImpl c;
    public final ike d;
    public final i3y f;
    public final i3y e = a.a(new n5h(14));
    public final i3y g = a.a(new sbc(8, this));
    public final AtomicReference h = new AtomicReference(null);
    public final i3y i = a.a(new sls() { // from class: ru.yandex.taxi.logistics.sdk.delivery.events.data.a
        @Override // defpackage.sls
        public final Object invoke() {
            u7i u7iVar = u7i.this;
            return e.O(new rol0(new DeliveryEventsSourceImpl$flow$2$1(u7iVar, null)), u7iVar.d, wsr0.a(xsr0.a, 3), 0);
        }
    });

    public u7i(st2 st2Var, com.yandex.delivery.utils.push.impl.a aVar, h3y h3yVar, r7i r7iVar, AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl) {
        this.a = h3yVar;
        this.b = r7iVar;
        this.c = appVisibilitySubscriptionImpl;
        this.d = bvf0.a(st2Var.b);
        this.f = a.a(new t7i(aVar, 0));
    }

    public final tpr a() {
        return (tpr) this.i.getValue();
    }
}
