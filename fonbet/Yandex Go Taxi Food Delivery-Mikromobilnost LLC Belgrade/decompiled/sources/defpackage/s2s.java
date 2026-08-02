package defpackage;

import android.app.Notification;

/* loaded from: classes10.dex */
public final class s2s {
    public final int a;
    public final int b;
    public final Notification c;

    public s2s(int i, int i2, Notification notification) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s2s.class != obj.getClass()) {
            return false;
        }
        s2s s2sVar = (s2s) obj;
        if (this.a == s2sVar.a && this.b == s2sVar.b) {
            return this.c.equals(s2sVar.c);
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
