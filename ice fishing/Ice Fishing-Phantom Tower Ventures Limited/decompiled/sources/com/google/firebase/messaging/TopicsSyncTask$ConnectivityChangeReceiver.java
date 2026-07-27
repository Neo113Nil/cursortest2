package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
class TopicsSyncTask$ConnectivityChangeReceiver extends BroadcastReceiver {
    public FrostHunterAdapterDelegateNebulaRogue3354 FrostHunterAlphaAnimationNeoCosmos5761;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        FrostHunterAdapterDelegateNebulaRogue3354 frostHunterAdapterDelegateNebulaRogue3354 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterAdapterDelegateNebulaRogue3354 == null) {
            return;
        }
        if (frostHunterAdapterDelegateNebulaRogue3354.FrostHunterBundlePulseFusionHero2475()) {
            FrostHunterAdapterDelegateNebulaRogue3354 frostHunterAdapterDelegateNebulaRogue33542 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            frostHunterAdapterDelegateNebulaRogue33542.FrostHunterKeyframeGammaGamma1197.FrostHunterLevelListDrawableFusionDragonHero2232.schedule(frostHunterAdapterDelegateNebulaRogue33542, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.FrostHunterAlphaAnimationNeoCosmos5761 = null;
        }
    }
}
