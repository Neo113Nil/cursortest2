package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class J extends Fragment {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f5079u = 0;

    /* renamed from: n, reason: collision with root package name */
    public n4.c f5080n;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final I Companion = new I();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.h.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.h.e(activity, "activity");
            int i = J.f5079u;
            H.a(activity, EnumC0500n.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            int i = J.f5079u;
            H.a(activity, EnumC0500n.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            int i = J.f5079u;
            H.a(activity, EnumC0500n.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            int i = J.f5079u;
            H.a(activity, EnumC0500n.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            int i = J.f5079u;
            H.a(activity, EnumC0500n.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            int i = J.f5079u;
            H.a(activity, EnumC0500n.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.h.e(activity, "activity");
            kotlin.jvm.internal.h.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }
    }

    public final void a(EnumC0500n enumC0500n) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.h.d(activity, "activity");
            H.a(activity, enumC0500n);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0500n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0500n.ON_DESTROY);
        this.f5080n = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0500n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        n4.c cVar = this.f5080n;
        if (cVar != null) {
            ((G) cVar.f39658u).a();
        }
        a(EnumC0500n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        n4.c cVar = this.f5080n;
        if (cVar != null) {
            G g9 = (G) cVar.f39658u;
            int i = g9.f5072n + 1;
            g9.f5072n = i;
            if (i == 1 && g9.f5075w) {
                g9.f5077y.e(EnumC0500n.ON_START);
                g9.f5075w = false;
            }
        }
        a(EnumC0500n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0500n.ON_STOP);
    }
}
