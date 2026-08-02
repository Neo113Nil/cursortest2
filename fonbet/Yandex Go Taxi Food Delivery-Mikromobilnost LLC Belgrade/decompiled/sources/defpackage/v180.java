package defpackage;

import android.app.Notification;
import android.os.Bundle;
import com.yandex.messaging.internal.authorized.chat.notifications.autocancel.CancelNotificationBroadcastReceiver;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderNotification$OrderNotificationType;

/* loaded from: classes6.dex */
public final class v180 extends w180 {
    public final Notification b;
    public final String c;
    public final DriveState d;
    public final OrderNotification$OrderNotificationType e;

    public v180(int i, Notification notification, String str, DriveState driveState, OrderNotification$OrderNotificationType orderNotification$OrderNotificationType) {
        super(i);
        this.b = notification;
        this.c = str;
        this.d = driveState;
        this.e = orderNotification$OrderNotificationType;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(CancelNotificationBroadcastReceiver.NOTIFICATION_ID, this.a);
        bundle.putParcelable("notification", this.b);
        bundle.putString("notification_type", this.e.toString());
        bundle.putString("order_id", this.c);
        bundle.putString("order_state", this.d.toString());
        return bundle;
    }

    public final Notification c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!v180.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        v180 v180Var = (v180) obj;
        return this.a == v180Var.a && jl40.l(this.c, v180Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + unr0.b(this.a * 31, 31, this.c);
    }

    public final String toString() {
        return "Valid(orderId='" + this.c + "', orderState=" + this.d + ", type=" + this.e + Extension.C_BRAKE;
    }
}
