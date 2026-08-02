package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.zzae;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class zap implements DialogInterface.OnCancelListener {
    public final LifecycleFragment mLifecycleFragment;
    public volatile boolean zaa;
    public final GoogleApiAvailability zac;
    public final AtomicReference zab = new AtomicReference(null);
    public final com.google.android.gms.internal.base.zao zad = new com.google.android.gms.internal.base.zao(Looper.getMainLooper(), 0);

    public zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        this.mLifecycleFragment = lifecycleFragment;
        this.zac = googleApiAvailability;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final Activity getActivity() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        zzae.checkNotNull(lifecycleActivity);
        return lifecycleActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null, null);
        AtomicReference atomicReference = this.zab;
        zam zamVar = (zam) atomicReference.get();
        int zaa = zamVar == null ? -1 : zamVar.zaa();
        atomicReference.set(null);
        zad(connectionResult, zaa);
    }

    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.zab.set(bundle.getBoolean("resolving_error", false) ? new zam(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public void onResume() {
    }

    public abstract void onStart();

    public abstract void onStop();

    public abstract void zad(ConnectionResult connectionResult, int i);

    public abstract void zae();
}
