package J0;

import android.app.Notification;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f1319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1320b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f1321c;

    public j(int i, Notification notification, int i4) {
        this.f1319a = i;
        this.f1321c = notification;
        this.f1320b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f1319a == jVar.f1319a && this.f1320b == jVar.f1320b) {
            return this.f1321c.equals(jVar.f1321c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1321c.hashCode() + (((this.f1319a * 31) + this.f1320b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f1319a + ", mForegroundServiceType=" + this.f1320b + ", mNotification=" + this.f1321c + '}';
    }
}
