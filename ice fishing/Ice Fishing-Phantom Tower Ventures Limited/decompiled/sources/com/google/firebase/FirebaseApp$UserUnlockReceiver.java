package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Context.FrostHunterAccelerometerFusionHyperionPhantom3600;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
class FirebaseApp$UserUnlockReceiver extends BroadcastReceiver {
    public static final AtomicReference FrostHunterConstraintSetCloneMasterUltraRogue2633 = new AtomicReference();
    public final Context FrostHunterAlphaAnimationNeoCosmos5761;

    public FirebaseApp$UserUnlockReceiver(Context context) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlertDialogAuroraDelta3200) {
            try {
                Iterator it = ((FrostHunterAccelerometerFusionHyperionPhantom3600) FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterKeyframeGammaGamma1197.values()).iterator();
                while (it.hasNext()) {
                    ((FrostHunterTransitionManagerOmegaNeoMaster3754) it.next()).FrostHunterServiceEliteCelestialThunder1757();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761.unregisterReceiver(this);
    }
}
