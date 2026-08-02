package defpackage;

import com.yandex.plus.core.graphql.type.PLAQUE_NOTIFICATION_POSITION;

/* loaded from: classes2.dex */
public final class smc0 {
    public final PLAQUE_NOTIFICATION_POSITION a;

    public smc0(PLAQUE_NOTIFICATION_POSITION plaque_notification_position) {
        this.a = plaque_notification_position;
    }

    public final PLAQUE_NOTIFICATION_POSITION a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof smc0) && this.a == ((smc0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlaqueNotificationDisplayRules(position=" + this.a + ')';
    }
}
