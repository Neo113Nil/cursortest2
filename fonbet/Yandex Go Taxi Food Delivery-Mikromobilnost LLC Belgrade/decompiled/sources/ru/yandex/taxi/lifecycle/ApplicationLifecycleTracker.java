package ru.yandex.taxi.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.h3y;
import defpackage.hit;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ!\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/yandex/taxi/lifecycle/ApplicationLifecycleTracker;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lh3y;", "Lcom/yandex/go/lifecycle/processor/c;", "onAppLifecycleProcessor", "Lhit;", "globalCoroutineScopeOwner", "<init>", "(Lh3y;Lhit;)V", "Lzy11;", "onAppCreated", "()V", "onAppDestroyed", "onAppResumed", "onAppPaused", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Lh3y;", "Lhit;", "", "startedActivitiesCounter", CA20Status.STATUS_USER_I, "createdActivitiesCounter", "", "firstResume", "Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ApplicationLifecycleTracker implements Application.ActivityLifecycleCallbacks {
    private int createdActivitiesCounter;
    private boolean firstResume = true;
    private final hit globalCoroutineScopeOwner;
    private final h3y onAppLifecycleProcessor;
    private int startedActivitiesCounter;

    public ApplicationLifecycleTracker(h3y h3yVar, hit hitVar) {
        this.onAppLifecycleProcessor = h3yVar;
        this.globalCoroutineScopeOwner = hitVar;
    }

    private final void onAppCreated() {
        this.globalCoroutineScopeOwner.a.a();
        ((com.yandex.go.lifecycle.processor.c) this.onAppLifecycleProcessor.get()).c();
    }

    private final void onAppDestroyed() {
        ((com.yandex.go.lifecycle.processor.c) this.onAppLifecycleProcessor.get()).d();
        this.globalCoroutineScopeOwner.a.b();
    }

    private final void onAppPaused() {
        ((com.yandex.go.lifecycle.processor.c) this.onAppLifecycleProcessor.get()).e();
    }

    private final void onAppResumed() {
        ((com.yandex.go.lifecycle.processor.c) this.onAppLifecycleProcessor.get()).f(this.firstResume);
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
            onAppResumed();
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
