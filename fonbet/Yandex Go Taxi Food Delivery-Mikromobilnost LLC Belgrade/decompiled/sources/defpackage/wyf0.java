package defpackage;

import android.service.notification.StatusBarNotification;
import kotlin.a;

/* loaded from: classes15.dex */
public final class wyf0 {
    public final StatusBarNotification a;
    public final int b;
    public final i3y c = a.a(new vyf0(0, this));
    public final String d;

    public wyf0(StatusBarNotification statusBarNotification) {
        this.a = statusBarNotification;
        this.b = statusBarNotification.getId();
        this.d = statusBarNotification.getTag();
    }
}
