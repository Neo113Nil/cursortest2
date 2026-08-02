package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.t;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class ki implements Application.ActivityLifecycleCallbacks {
    public final huc a = new huc();
    public final LinkedHashMap b = new LinkedHashMap();
    public boolean c;

    public final void a(Activity activity) {
        Bundle bundle = (Bundle) this.b.remove(activity);
        if (bundle != null) {
            activity.getClass();
            ssg.a(3, "TransactionTooLargeHelper", ouj.o(activity.getClass().getSimpleName(), ".onSaveInstanceState() bundle: ", v3g.v(bundle)), null);
            Parcel obtain = Parcel.obtain();
            obtain.getClass();
            try {
                obtain.writeBundle(bundle);
                int dataSize = obtain.dataSize();
                obtain.recycle();
                if (dataSize > 200000) {
                    dfi.r("Bundle size is too large", "TransactionTooLargeHelper");
                }
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (activity instanceof t) {
            nnk nnkVar = ((t) activity).getSupportFragmentManager().p;
            nnkVar.getClass();
            huc hucVar = this.a;
            hucVar.getClass();
            ((CopyOnWriteArrayList) nnkVar.b).add(new qtc(hucVar));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
        if (this.c) {
            LinkedHashMap linkedHashMap = this.b;
            linkedHashMap.put(activity, bundle);
            if (linkedHashMap.size() >= 5) {
                linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        a(activity);
    }
}
