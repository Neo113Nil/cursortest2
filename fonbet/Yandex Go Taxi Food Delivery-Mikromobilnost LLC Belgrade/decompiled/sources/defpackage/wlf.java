package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;

/* loaded from: classes10.dex */
public final class wlf {
    public final ICustomTabsCallback a;
    public final PendingIntent b;

    public wlf(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            ny61.r("CustomTabsSessionToken must have either a session id or a callback (or both).");
            throw null;
        }
        this.a = iCustomTabsCallback;
        this.b = pendingIntent;
        if (iCustomTabsCallback == null) {
            return;
        }
        new vlf(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wlf) {
            wlf wlfVar = (wlf) obj;
            PendingIntent pendingIntent = wlfVar.b;
            PendingIntent pendingIntent2 = this.b;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                ICustomTabsCallback iCustomTabsCallback = this.a;
                if (iCustomTabsCallback == null) {
                    ny61.r("CustomTabSessionToken must have valid binder or pending session");
                    return false;
                }
                IBinder asBinder = iCustomTabsCallback.asBinder();
                ICustomTabsCallback iCustomTabsCallback2 = wlfVar.a;
                if (iCustomTabsCallback2 != null) {
                    return asBinder.equals(iCustomTabsCallback2.asBinder());
                }
                ny61.r("CustomTabSessionToken must have valid binder or pending session");
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        ICustomTabsCallback iCustomTabsCallback = this.a;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder().hashCode();
        }
        ny61.r("CustomTabSessionToken must have valid binder or pending session");
        return 0;
    }
}
