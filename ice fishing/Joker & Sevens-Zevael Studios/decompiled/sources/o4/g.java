package o4;

import android.app.Notification;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f5209a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5210b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f5211c;

    public g(int i10, Notification notification, int i11) {
        this.f5209a = i10;
        this.f5211c = notification;
        this.f5210b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f5209a == gVar.f5209a && this.f5210b == gVar.f5210b) {
            return this.f5211c.equals(gVar.f5211c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5211c.hashCode() + (((this.f5209a * 31) + this.f5210b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f5209a + ", mForegroundServiceType=" + this.f5210b + ", mNotification=" + this.f5211c + '}';
    }
}
