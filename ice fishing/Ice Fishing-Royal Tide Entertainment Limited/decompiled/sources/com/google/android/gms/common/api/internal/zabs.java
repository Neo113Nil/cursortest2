package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.text.CatchingFishGsonRealm;
import kotlin.text.CatchingFishViewModelIntent;

/* loaded from: classes.dex */
public final class zabs extends BroadcastReceiver {
    public Context CatchingFishParcelableFAB;
    public final CatchingFishViewModelIntent CatchingFishSnackbar;

    public zabs(CatchingFishViewModelIntent catchingFishViewModelIntent) {
        this.CatchingFishSnackbar = catchingFishViewModelIntent;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((CatchingFishGsonRealm) this.CatchingFishSnackbar.CatchingFishWorkManager).getClass();
            throw null;
        }
    }
}
