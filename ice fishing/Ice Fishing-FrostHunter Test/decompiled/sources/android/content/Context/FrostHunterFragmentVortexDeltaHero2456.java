package android.content.Context;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFragmentVortexDeltaHero2456 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final FrostHunterFragmentVortexDeltaHero2456 FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterFragmentVortexDeltaHero2456();
    public final AtomicBoolean FrostHunterCameraXPixelTurboCosmos9814 = new AtomicBoolean();
    public final AtomicBoolean FrostHunterFlowMaxDragonHero5809 = new AtomicBoolean();
    public final ArrayList FrostHunterAlertDialogAuroraDelta3200 = new ArrayList();
    public boolean FrostHunterKeyframeGammaGamma1197 = false;

    public static void FrostHunterAlphaAnimationNeoCosmos5761(Application application) {
        FrostHunterFragmentVortexDeltaHero2456 frostHunterFragmentVortexDeltaHero2456 = FrostHunterFragmentBetaMegaVortex6025;
        synchronized (frostHunterFragmentVortexDeltaHero2456) {
            try {
                if (!frostHunterFragmentVortexDeltaHero2456.FrostHunterKeyframeGammaGamma1197) {
                    application.registerActivityLifecycleCallbacks(frostHunterFragmentVortexDeltaHero2456);
                    application.registerComponentCallbacks(frostHunterFragmentVortexDeltaHero2456);
                    frostHunterFragmentVortexDeltaHero2456.FrostHunterKeyframeGammaGamma1197 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(boolean z) {
        synchronized (FrostHunterFragmentBetaMegaVortex6025) {
            try {
                ArrayList arrayList = this.FrostHunterAlertDialogAuroraDelta3200;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((FrostHunterDispatchersHyperCelestial3476) obj).FrostHunterAlphaAnimationNeoCosmos5761(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.FrostHunterCameraXPixelTurboCosmos9814.compareAndSet(true, false);
        this.FrostHunterFlowMaxDragonHero5809.set(true);
        if (compareAndSet) {
            FrostHunterConstraintSetCloneMasterUltraRogue2633(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.FrostHunterCameraXPixelTurboCosmos9814.compareAndSet(true, false);
        this.FrostHunterFlowMaxDragonHero5809.set(true);
        if (compareAndSet) {
            FrostHunterConstraintSetCloneMasterUltraRogue2633(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.FrostHunterCameraXPixelTurboCosmos9814.compareAndSet(false, true)) {
            this.FrostHunterFlowMaxDragonHero5809.set(true);
            FrostHunterConstraintSetCloneMasterUltraRogue2633(true);
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
