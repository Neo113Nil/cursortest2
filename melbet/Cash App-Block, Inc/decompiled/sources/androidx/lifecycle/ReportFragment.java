package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/ReportFragment;", "Landroid/app/Fragment;", "<init>", "()V", "LifecycleCallbacks", "Companion", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class ReportFragment extends Fragment {
    public static final /* synthetic */ int $r8$clinit = 0;

    public abstract class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        public static void dispatch$lifecycle_runtime(Activity activity, Lifecycle.Event event) {
            activity.getClass();
            event.getClass();
            if (activity instanceof LifecycleOwner) {
                Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
                if (lifecycle instanceof LifecycleRegistry) {
                    ((LifecycleRegistry) lifecycle).handleLifecycleEvent(event);
                }
            }
        }

        public static void injectIfNeededIn(Activity activity) {
            activity.getClass();
            LifecycleCallbacks.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new LifecycleCallbacks());
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    public static final class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public static final Companion Companion = new Companion();

        public final class Companion {
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new LifecycleCallbacks());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            int i = ReportFragment.$r8$clinit;
            Companion.dispatch$lifecycle_runtime(activity, Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = ReportFragment.$r8$clinit;
            Companion.dispatch$lifecycle_runtime(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = ReportFragment.$r8$clinit;
            Companion.dispatch$lifecycle_runtime(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = ReportFragment.$r8$clinit;
            Companion.dispatch$lifecycle_runtime(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = ReportFragment.$r8$clinit;
            Companion.dispatch$lifecycle_runtime(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = ReportFragment.$r8$clinit;
            Companion.dispatch$lifecycle_runtime(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
    }
}
