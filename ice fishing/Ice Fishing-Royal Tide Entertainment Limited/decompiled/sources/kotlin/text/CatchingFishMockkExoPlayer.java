package kotlin.text;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class CatchingFishMockkExoPlayer implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final CatchingFishMockkExoPlayer CatchingFishViewModelFAB = new CatchingFishMockkExoPlayer();
    public final AtomicBoolean CatchingFishReduxKtor = new AtomicBoolean();
    public final AtomicBoolean CatchingFishDaggerWebsocket = new AtomicBoolean();
    public final ArrayList CatchingFishWorkManager = new ArrayList();
    public boolean CatchingFishViewModelScope = false;

    public static void CatchingFishParcelableFAB(Application application) {
        CatchingFishMockkExoPlayer catchingFishMockkExoPlayer = CatchingFishViewModelFAB;
        synchronized (catchingFishMockkExoPlayer) {
            try {
                if (!catchingFishMockkExoPlayer.CatchingFishViewModelScope) {
                    application.registerActivityLifecycleCallbacks(catchingFishMockkExoPlayer);
                    application.registerComponentCallbacks(catchingFishMockkExoPlayer);
                    catchingFishMockkExoPlayer.CatchingFishViewModelScope = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishSnackbar(boolean z) {
        synchronized (CatchingFishViewModelFAB) {
            try {
                ArrayList arrayList = this.CatchingFishWorkManager;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((CatchingFishGlideParcelable) obj).CatchingFishParcelableFAB(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.CatchingFishReduxKtor.compareAndSet(true, false);
        this.CatchingFishDaggerWebsocket.set(true);
        if (compareAndSet) {
            CatchingFishSnackbar(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.CatchingFishReduxKtor.compareAndSet(true, false);
        this.CatchingFishDaggerWebsocket.set(true);
        if (compareAndSet) {
            CatchingFishSnackbar(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.CatchingFishReduxKtor.compareAndSet(false, true)) {
            this.CatchingFishDaggerWebsocket.set(true);
            CatchingFishSnackbar(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
