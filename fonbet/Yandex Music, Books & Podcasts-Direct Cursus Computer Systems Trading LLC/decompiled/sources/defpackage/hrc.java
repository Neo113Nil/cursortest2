package defpackage;

import android.app.Notification;

/* loaded from: classes.dex */
public final class hrc {
    public final int a;
    public final int b;
    public final Notification c;

    public hrc(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hrc.class != obj.getClass()) {
            return false;
        }
        hrc hrcVar = (hrc) obj;
        if (this.a == hrcVar.a && this.b == hrcVar.b) {
            return this.c.equals(hrcVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
