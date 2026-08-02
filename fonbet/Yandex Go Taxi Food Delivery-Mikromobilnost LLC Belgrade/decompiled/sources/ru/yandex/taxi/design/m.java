package ru.yandex.taxi.design;

import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.NotificationStackComponent;

/* loaded from: classes5.dex */
public final class m {
    public final NotificationItemComponent a;
    public final NotificationStackComponent.UpdateOperation b;

    public m(NotificationItemComponent notificationItemComponent, NotificationStackComponent.UpdateOperation updateOperation) {
        this.a = notificationItemComponent;
        this.b = updateOperation;
    }

    public final NotificationStackComponent.UpdateOperation a() {
        return this.b;
    }

    public final NotificationItemComponent b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return jl40.l(this.a, mVar.a) && this.b == mVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateQueueNode(v=" + this.a + ", op=" + this.b + Extension.C_BRAKE;
    }
}
