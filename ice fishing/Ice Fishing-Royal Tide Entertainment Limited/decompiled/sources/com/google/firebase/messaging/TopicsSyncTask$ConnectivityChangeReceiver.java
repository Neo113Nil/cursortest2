package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class TopicsSyncTask$ConnectivityChangeReceiver extends BroadcastReceiver {
    public CatchingFishViewPagerToast CatchingFishParcelableFAB;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        CatchingFishViewPagerToast catchingFishViewPagerToast = this.CatchingFishParcelableFAB;
        if (catchingFishViewPagerToast == null) {
            return;
        }
        if (catchingFishViewPagerToast.CatchingFishCoroutine()) {
            CatchingFishViewPagerToast catchingFishViewPagerToast2 = this.CatchingFishParcelableFAB;
            catchingFishViewPagerToast2.CatchingFishViewModelScope.CatchingFishWorkManager.schedule(catchingFishViewPagerToast2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.CatchingFishParcelableFAB = null;
        }
    }
}
