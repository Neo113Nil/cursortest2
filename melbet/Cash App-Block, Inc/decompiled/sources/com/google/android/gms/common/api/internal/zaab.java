package com.google.android.gms.common.api.internal;

import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: classes.dex */
public final class zaab extends zap {
    public final ArraySet zad;
    public final GoogleApiManager zae;

    public zaab(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.zad = new ArraySet(0);
        this.zae = googleApiManager;
        lifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void onResume() {
        if (this.zad.isEmpty()) {
            return;
        }
        this.zae.zae(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void onStart() {
        this.zaa = true;
        if (this.zad.isEmpty()) {
            return;
        }
        this.zae.zae(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void onStop() {
        this.zaa = false;
        GoogleApiManager googleApiManager = this.zae;
        googleApiManager.getClass();
        synchronized (GoogleApiManager.zae) {
            try {
                if (googleApiManager.zap == this) {
                    googleApiManager.zap = null;
                    googleApiManager.zaq.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zad(ConnectionResult connectionResult, int i) {
        this.zae.zaq(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zae() {
        com.google.android.gms.internal.base.zao zaoVar = this.zae.zas;
        zaoVar.sendMessage(zaoVar.obtainMessage(3));
    }
}
