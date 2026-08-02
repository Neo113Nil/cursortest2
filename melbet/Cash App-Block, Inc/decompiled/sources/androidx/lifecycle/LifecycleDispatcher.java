package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.ReportFragment;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class LifecycleDispatcher {
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    public final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            int i = ReportFragment.$r8$clinit;
            ReportFragment.Companion.injectIfNeededIn(activity);
        }
    }
}
