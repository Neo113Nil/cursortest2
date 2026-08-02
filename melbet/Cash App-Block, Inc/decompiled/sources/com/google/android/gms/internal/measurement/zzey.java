package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzey implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ zzez zza;

    public zzey(zzez zzezVar) {
        this.zza = zzezVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.zza.zzV(new zzdp(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzV(new zzeu(this, activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzV(new zzeu(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.zza.zzV(new zzes(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzcm zzcmVar = new zzcm();
        this.zza.zzV(new zzed(this, activity, zzcmVar));
        Bundle zze = zzcmVar.zze(50L);
        if (zze != null) {
            bundle.putAll(zze);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.zza.zzV(new zzes(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.zza.zzV(new zzeu(this, activity, 1));
    }
}
