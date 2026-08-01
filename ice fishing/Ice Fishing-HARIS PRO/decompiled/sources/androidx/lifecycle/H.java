package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class H extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1998b = 0;

    /* renamed from: a, reason: collision with root package name */
    public B.b f1999a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final G Companion = new G();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            D1.i.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            D1.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            D1.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            D1.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            D1.i.e(activity, "activity");
            int i = H.f1998b;
            F.a(activity, EnumC0096m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            D1.i.e(activity, "activity");
            int i = H.f1998b;
            F.a(activity, EnumC0096m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            D1.i.e(activity, "activity");
            int i = H.f1998b;
            F.a(activity, EnumC0096m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            D1.i.e(activity, "activity");
            int i = H.f1998b;
            F.a(activity, EnumC0096m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            D1.i.e(activity, "activity");
            int i = H.f1998b;
            F.a(activity, EnumC0096m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            D1.i.e(activity, "activity");
            int i = H.f1998b;
            F.a(activity, EnumC0096m.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            D1.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            D1.i.e(activity, "activity");
            D1.i.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            D1.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            D1.i.e(activity, "activity");
        }
    }

    public final void a(EnumC0096m enumC0096m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            D1.i.d(activity, "activity");
            F.a(activity, enumC0096m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0096m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0096m.ON_DESTROY);
        this.f1999a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0096m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        B.b bVar = this.f1999a;
        if (bVar != null) {
            ((E) bVar.f10b).a();
        }
        a(EnumC0096m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        B.b bVar = this.f1999a;
        if (bVar != null) {
            E e = (E) bVar.f10b;
            int i = e.f1991a + 1;
            e.f1991a = i;
            if (i == 1 && e.f1994d) {
                e.f1995f.d(EnumC0096m.ON_START);
                e.f1994d = false;
            }
        }
        a(EnumC0096m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0096m.ON_STOP);
    }
}
