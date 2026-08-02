package J0;

import android.app.Notification;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f1422a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1423b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f1424c;

    public i(int i, Notification notification, int i4) {
        this.f1422a = i;
        this.f1424c = notification;
        this.f1423b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f1422a == iVar.f1422a && this.f1423b == iVar.f1423b) {
            return this.f1424c.equals(iVar.f1424c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1424c.hashCode() + (((this.f1422a * 31) + this.f1423b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f1422a + ", mForegroundServiceType=" + this.f1423b + ", mNotification=" + this.f1424c + '}';
    }
}
