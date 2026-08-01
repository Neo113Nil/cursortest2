package com.google.android.datatransport;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConfigurationIDE implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final WinterFlowConfigurationIDE WinterFlowSyntax = new WinterFlowConfigurationIDE();
    public final AtomicBoolean WinterFlowVariableVersionControl = new AtomicBoolean();
    public final AtomicBoolean WinterFlowTransactionManagerStrategy = new AtomicBoolean();
    public final ArrayList WinterFlowUnitTestResponse = new ArrayList();
    public boolean WinterFlowRouterRouter = false;

    public static void WinterFlowRouterStructure(Application application) {
        WinterFlowConfigurationIDE winterFlowConfigurationIDE = WinterFlowSyntax;
        synchronized (winterFlowConfigurationIDE) {
            try {
                if (!winterFlowConfigurationIDE.WinterFlowRouterRouter) {
                    application.registerActivityLifecycleCallbacks(winterFlowConfigurationIDE);
                    application.registerComponentCallbacks(winterFlowConfigurationIDE);
                    winterFlowConfigurationIDE.WinterFlowRouterRouter = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void WinterFlowHookDataSource(boolean z) {
        synchronized (WinterFlowSyntax) {
            try {
                ArrayList arrayList = this.WinterFlowUnitTestResponse;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((WinterFlowRepositorySubsystem) obj).WinterFlowRouterStructure(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.WinterFlowVariableVersionControl.compareAndSet(true, false);
        this.WinterFlowTransactionManagerStrategy.set(true);
        if (compareAndSet) {
            WinterFlowHookDataSource(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.WinterFlowVariableVersionControl.compareAndSet(true, false);
        this.WinterFlowTransactionManagerStrategy.set(true);
        if (compareAndSet) {
            WinterFlowHookDataSource(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.WinterFlowVariableVersionControl.compareAndSet(false, true)) {
            this.WinterFlowTransactionManagerStrategy.set(true);
            WinterFlowHookDataSource(true);
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
