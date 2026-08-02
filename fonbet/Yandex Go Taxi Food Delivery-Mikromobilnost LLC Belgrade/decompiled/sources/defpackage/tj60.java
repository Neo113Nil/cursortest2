package defpackage;

import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

/* loaded from: classes9.dex */
public final class tj60 {
    public NotificationStackComponent a;
    public int b;

    public final NotificationItemComponent a(String str) {
        NotificationStackComponent notificationStackComponent = this.a;
        if (notificationStackComponent != null) {
            return notificationStackComponent.getNotification(str);
        }
        return null;
    }

    public final void b() {
        NotificationStackComponent notificationStackComponent;
        NotificationStackComponent notificationStackComponent2 = this.a;
        boolean z = false;
        if (notificationStackComponent2 != null && !notificationStackComponent2.getIsHidden()) {
            z = true;
        }
        if (z && (notificationStackComponent = this.a) != null) {
            this.b++;
            notificationStackComponent.hide();
        }
    }

    public final void c(String str) {
        NotificationStackComponent notificationStackComponent = this.a;
        if (notificationStackComponent != null) {
            notificationStackComponent.closeNotification(str);
        }
    }

    public final void d(NotificationTimedItemComponent notificationTimedItemComponent) {
        NotificationStackComponent notificationStackComponent = this.a;
        if (notificationStackComponent != null) {
            notificationStackComponent.showNotification(notificationTimedItemComponent);
        }
        notificationTimedItemComponent.startExpiresTimer();
    }

    public final void e(NotificationItemComponent notificationItemComponent) {
        NotificationStackComponent notificationStackComponent = this.a;
        if (notificationStackComponent != null) {
            notificationStackComponent.showNotification(notificationItemComponent);
        }
    }

    public final void f() {
        NotificationStackComponent notificationStackComponent = this.a;
        if (notificationStackComponent != null) {
            this.b = 0;
            notificationStackComponent.show();
        }
    }

    public final void g() {
        NotificationStackComponent notificationStackComponent = this.a;
        if (notificationStackComponent != null) {
            int i = this.b - 1;
            if (i <= 0) {
                i = 0;
            }
            this.b = i;
            if (i == 0) {
                notificationStackComponent.show();
            }
        }
    }
}
