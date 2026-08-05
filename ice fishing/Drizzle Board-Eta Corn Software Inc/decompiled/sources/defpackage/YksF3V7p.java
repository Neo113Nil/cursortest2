package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class YksF3V7p implements Application.ActivityLifecycleCallbacks {
    public final int MdtA4re8;
    public Activity NCTxEWno;
    public Object qoPGr6Ce;
    public boolean wxUZMvaN = false;
    public boolean VgvYg0wo = false;
    public boolean P7K7Inc8 = false;

    public YksF3V7p(Activity activity) {
        this.NCTxEWno = activity;
        this.MdtA4re8 = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.NCTxEWno == activity) {
            this.NCTxEWno = null;
            this.VgvYg0wo = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.VgvYg0wo || this.P7K7Inc8 || this.wxUZMvaN) {
            return;
        }
        Object obj = this.qoPGr6Ce;
        try {
            Object obj2 = nJuO6ggC.MdtA4re8.get(activity);
            if (obj2 == obj && activity.hashCode() == this.MdtA4re8) {
                nJuO6ggC.b2ZJblxo.postAtFrontOfQueue(new XrPeKzBk(nJuO6ggC.NCTxEWno.get(activity), obj2, 3, false));
                this.P7K7Inc8 = true;
                this.qoPGr6Ce = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.NCTxEWno == activity) {
            this.wxUZMvaN = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
