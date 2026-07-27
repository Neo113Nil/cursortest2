package J0;

import android.app.Notification;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f1394a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1395b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f1396c;

    public j(int i, Notification notification, int i6) {
        this.f1394a = i;
        this.f1396c = notification;
        this.f1395b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f1394a == jVar.f1394a && this.f1395b == jVar.f1395b) {
            return this.f1396c.equals(jVar.f1396c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1396c.hashCode() + (((this.f1394a * 31) + this.f1395b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f1394a + ", mForegroundServiceType=" + this.f1395b + ", mNotification=" + this.f1396c + '}';
    }
}
