package androidx.versionedparcelable;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class YellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final YellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = new YellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453();
    public final AtomicBoolean RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new AtomicBoolean();
    public final AtomicBoolean LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new AtomicBoolean();
    public final ArrayList YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new ArrayList();
    public boolean TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = false;

    public static void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Application application) {
        YellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453 yellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453 = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        synchronized (yellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453) {
            try {
                if (!yellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
                    application.registerActivityLifecycleCallbacks(yellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453);
                    application.registerComponentCallbacks(yellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453);
                    yellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(boolean z) {
        synchronized (BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818) {
            try {
                ArrayList arrayList = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((EmeraldStackStreamExecutorEagOH6RZ83r4sZKOsr60655422143308) obj).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.compareAndSet(true, false);
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.set(true);
        if (compareAndSet) {
            AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.compareAndSet(true, false);
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.set(true);
        if (compareAndSet) {
            AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.compareAndSet(false, true)) {
            this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.set(true);
            AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(true);
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
