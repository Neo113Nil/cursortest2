package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* loaded from: classes.dex */
public final class zabf implements BackgroundDetector.BackgroundStateChangeListener {
    public final /* synthetic */ GoogleApiManager zaa;

    public zabf(GoogleApiManager googleApiManager) {
        this.zaa = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zas.sendMessage(googleApiManager.zas.obtainMessage(1, valueOf));
    }
}
