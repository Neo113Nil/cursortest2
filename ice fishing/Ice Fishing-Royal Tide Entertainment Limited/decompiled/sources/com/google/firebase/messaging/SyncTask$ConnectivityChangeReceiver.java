package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
class SyncTask$ConnectivityChangeReceiver extends BroadcastReceiver {
    public CatchingFishPagingLibrary CatchingFishParcelableFAB;
    public Context CatchingFishSnackbar;

    public final void CatchingFishParcelableFAB() {
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishParcelableFAB;
        if (catchingFishPagingLibrary != null) {
            Context context = catchingFishPagingLibrary.CatchingFishWorkManager.CatchingFishSnackbar;
            this.CatchingFishSnackbar = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishParcelableFAB;
        if (catchingFishPagingLibrary != null && catchingFishPagingLibrary.CatchingFishParcelableFAB()) {
            CatchingFishPagingLibrary catchingFishPagingLibrary2 = this.CatchingFishParcelableFAB;
            catchingFishPagingLibrary2.CatchingFishWorkManager.getClass();
            FirebaseMessaging.CatchingFishSnackbar(catchingFishPagingLibrary2, 0L);
            Context context2 = this.CatchingFishSnackbar;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.CatchingFishParcelableFAB = null;
        }
    }
}
