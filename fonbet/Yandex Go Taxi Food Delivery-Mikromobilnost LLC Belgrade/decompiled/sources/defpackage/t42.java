package defpackage;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.ArrayList;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderNotification$OrderNotificationType;

/* loaded from: classes14.dex */
public final class t42 implements j580 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ t42(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.j580
    public final void a(TaxiOrder taxiOrder, boolean z) {
        StatusBarNotification[] activeNotifications;
        StatusBarNotification statusBarNotification;
        String[] stringArray;
        switch (this.a) {
            case 0:
                ((ci70) this.b).f(taxiOrder);
                break;
            case 1:
                ((uw40) this.b).d(taxiOrder.V().Y);
                break;
            default:
                String str = taxiOrder.a;
                DriveState driveState = taxiOrder.h.b;
                if (z) {
                    y180 y180Var = (y180) this.b;
                    String driveState2 = driveState.toString();
                    q280 q280Var = y180Var.a;
                    int f = y180.f(str, OrderNotification$OrderNotificationType.ORDER_INFORMATION);
                    ej60 ej60Var = q280Var.c.i;
                    NotificationManager notificationManager = ej60Var.b;
                    if (notificationManager != null && (activeNotifications = notificationManager.getActiveNotifications()) != null) {
                        int length = activeNotifications.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                statusBarNotification = activeNotifications[i];
                                if (statusBarNotification.getId() != f || !jl40.l(statusBarNotification.getTag(), null)) {
                                    i++;
                                }
                            } else {
                                statusBarNotification = null;
                            }
                        }
                        if (statusBarNotification != null && (stringArray = statusBarNotification.getNotification().extras.getStringArray("EXTRA_SHOW_ON_STATUSES")) != null && !j73.y(stringArray, driveState2)) {
                            ArrayList arrayList = new ArrayList();
                            for (StatusBarNotification statusBarNotification2 : activeNotifications) {
                                if (statusBarNotification2.getId() != f || !jl40.l(statusBarNotification2.getTag(), null)) {
                                    arrayList.add(statusBarNotification2);
                                }
                            }
                            ej60Var.b(arrayList);
                            unr0.C(new Object[]{null, Integer.valueOf(f)}, 2, "cancel [%s|%d]", jst.e);
                            ej60Var.a.a(f, null);
                        }
                    }
                }
                if (driveState != DriveState.DRIVING) {
                    ((y180) this.b).a.a(y180.f(str, OrderNotification$OrderNotificationType.TAXI_ARRIVING));
                    break;
                }
                break;
        }
    }
}
