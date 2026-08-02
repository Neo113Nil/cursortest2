package ru.yandex.sdk.lifecycle_listener;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.bvf0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.l8x;
import defpackage.pu2;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import java.util.Set;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tJ&\u0010\u0013\u001a\u00020\u00122\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0010H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\u001aJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0018\u00102\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00100¨\u00064"}, d2 = {"Lru/yandex/sdk/lifecycle_listener/AppLifecycleListenerCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "", "Lpu2;", "listeners", "<init>", "(Ljava/util/Set;)V", "Lzy11;", "onAppCreated", "()V", "onAppDestroyed", "", "firstResume", "onAppResumed", "(Z)V", "onAppPaused", "Lkotlin/Function1;", "notifyAction", "Ll8x;", "notifyListeners", "(Ltls;)Ll8x;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Ljava/util/Set;", "Ltse;", "scope", "Ltse;", "Lg050;", "mutex", "Lg050;", "", "startedActivitiesCounter", CA20Status.STATUS_USER_I, "createdActivitiesCounter", "Z", "createJob", "Ll8x;", "resumeJob", "pauseJob", "destroyJob", "app-lifecycle-listener"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppLifecycleListenerCallbacks implements Application.ActivityLifecycleCallbacks {
    private l8x createJob;
    private int createdActivitiesCounter;
    private l8x destroyJob;
    private final Set<pu2> listeners;
    private l8x pauseJob;
    private l8x resumeJob;
    private int startedActivitiesCounter;
    private final tse scope = bvf0.b();
    private final g050 mutex = gtq0.a();
    private boolean firstResume = true;

    public AppLifecycleListenerCallbacks(Set<pu2> set) {
        this.listeners = set;
    }

    private final l8x notifyListeners(tls notifyAction) {
        return tje.N(this.scope, null, null, new AppLifecycleListenerCallbacks$notifyListeners$1(this, notifyAction, null), 3);
    }

    private final void onAppCreated() {
        l8x l8xVar = this.createJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.createJob = tje.N(this.scope, null, null, new AppLifecycleListenerCallbacks$onAppCreated$$inlined$notifyListeners$1(this, null), 3);
    }

    private final void onAppDestroyed() {
        l8x l8xVar = this.destroyJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.destroyJob = tje.N(this.scope, null, null, new AppLifecycleListenerCallbacks$onAppDestroyed$$inlined$notifyListeners$1(this, null), 3);
    }

    private final void onAppPaused() {
        l8x l8xVar = this.pauseJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.pauseJob = tje.N(this.scope, null, null, new AppLifecycleListenerCallbacks$onAppPaused$$inlined$notifyListeners$1(this, null), 3);
    }

    private final void onAppResumed(boolean firstResume) {
        l8x l8xVar = this.resumeJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.resumeJob = tje.N(this.scope, null, null, new AppLifecycleListenerCallbacks$onAppResumed$$inlined$notifyListeners$1(this, null, firstResume), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        if (this.createdActivitiesCounter == 0) {
            onAppCreated();
        }
        this.createdActivitiesCounter++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        int i = this.createdActivitiesCounter - 1;
        this.createdActivitiesCounter = i;
        if (i == 0) {
            onAppDestroyed();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.startedActivitiesCounter == 0) {
            onAppResumed(this.firstResume);
            if (this.firstResume) {
                this.firstResume = false;
            }
        }
        this.startedActivitiesCounter++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i = this.startedActivitiesCounter - 1;
        this.startedActivitiesCounter = i;
        if (i == 0) {
            onAppPaused();
        }
    }
}
