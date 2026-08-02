package defpackage;

import android.app.AlarmManager;
import android.content.Context;
import com.yandex.go.taxi.order.OrderPushNotificationController$subscribeToOrders$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.objects.OrderPushNotification;
import com.yandex.go.taxi.order.provider.a;
import com.yandex.go.taxi.order.provider.p;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class u480 {
    public final Context a;
    public final tse b;
    public final o280 c;
    public final r8h d;
    public final jtq0 e;
    public final v480 f;
    public final y180 g;
    public final AlarmManager h;
    public final zuj0 i;
    public final crg j;
    public final a k;
    public boolean m;
    public final a3y0 l = new a3y0(TaxiOrderLogGroup.NOTIFICATION.getTag(), "OrderPushNotificationController");
    public final ArrayList n = new ArrayList();

    public u480(Context context, tse tseVar, o280 o280Var, r8h r8hVar, jtq0 jtq0Var, v480 v480Var, y180 y180Var, AlarmManager alarmManager, zuj0 zuj0Var, crg crgVar, a aVar) {
        this.a = context;
        this.b = tseVar;
        this.c = o280Var;
        this.d = r8hVar;
        this.e = jtq0Var;
        this.f = v480Var;
        this.g = y180Var;
        this.h = alarmManager;
        this.i = zuj0Var;
        this.j = crgVar;
        this.k = aVar;
    }

    public final void a() {
        ArrayList arrayList = this.n;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l8x) it.next()).a(null);
        }
        arrayList.clear();
        for (o2y0 o2y0Var : this.k.l()) {
            arrayList.add(tje.N(this.b, null, null, new OrderPushNotificationController$subscribeToOrders$$inlined$safeCollectIn$1(new p(this.c.a.b(o2y0Var)), null, this, o2y0Var), 3));
        }
    }

    public final long b(xh60 xh60Var) {
        Date c = this.j.c(((OrderPushNotification) xh60Var.b).a);
        if (c == null) {
            c = new Date();
        }
        return c.getTime() - this.e.d();
    }
}
