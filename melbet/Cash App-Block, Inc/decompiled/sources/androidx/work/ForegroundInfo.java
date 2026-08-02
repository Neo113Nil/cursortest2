package androidx.work;

import android.app.Notification;

/* loaded from: classes3.dex */
public final class ForegroundInfo {
    public final int mForegroundServiceType;
    public final Notification mNotification;
    public final int mNotificationId;

    public ForegroundInfo(int i, int i2, Notification notification) {
        this.mNotificationId = i;
        this.mNotification = notification;
        this.mForegroundServiceType = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ForegroundInfo.class != obj.getClass()) {
            return false;
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (this.mNotificationId == foregroundInfo.mNotificationId && this.mForegroundServiceType == foregroundInfo.mForegroundServiceType) {
            return this.mNotification.equals(foregroundInfo.mNotification);
        }
        return false;
    }

    public final int hashCode() {
        return this.mNotification.hashCode() + (((this.mNotificationId * 31) + this.mForegroundServiceType) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.mNotificationId + ", mForegroundServiceType=" + this.mForegroundServiceType + ", mNotification=" + this.mNotification + '}';
    }
}
