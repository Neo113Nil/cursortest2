package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes5.dex */
public final class u9y implements wza0 {
    public final Context a;

    public u9y(Context context) {
        this.a = context;
    }

    @Override // defpackage.wza0
    public final void a() {
    }

    @Override // defpackage.wza0
    public final boolean b() {
        NotificationManager notificationManager = (NotificationManager) this.a.getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            return notificationManager.areNotificationsEnabled();
        }
        return false;
    }
}
