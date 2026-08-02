package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class k7w extends yhq {
    @Override // defpackage.yhq, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        jf0.N("create", activity.getClass().getSimpleName());
    }

    @Override // defpackage.yhq, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        if (activity.isFinishing()) {
            jf0.N("destroy", activity.getClass().getSimpleName());
        } else {
            jf0.N("restart", activity.getClass().getSimpleName());
        }
    }
}
