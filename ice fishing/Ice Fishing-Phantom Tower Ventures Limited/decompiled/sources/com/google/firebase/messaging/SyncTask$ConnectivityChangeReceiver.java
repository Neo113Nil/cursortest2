package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
class SyncTask$ConnectivityChangeReceiver extends BroadcastReceiver {
    public FrostHunterTransitionManagerOmegaNeoMaster3754 FrostHunterAlphaAnimationNeoCosmos5761;
    public Context FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterTransitionManagerOmegaNeoMaster3754 != null) {
            Context context = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlertDialogAuroraDelta3200.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterTransitionManagerOmegaNeoMaster3754 != null && frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761()) {
            FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster37542 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterAlertDialogAuroraDelta3200.getClass();
            FirebaseMessaging.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterTransitionManagerOmegaNeoMaster37542, 0L);
            Context context2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.FrostHunterAlphaAnimationNeoCosmos5761 = null;
        }
    }
}
