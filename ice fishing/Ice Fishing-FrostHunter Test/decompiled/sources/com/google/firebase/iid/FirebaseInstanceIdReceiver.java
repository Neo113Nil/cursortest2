package com.google.firebase.iid;

import android.content.Context;
import android.content.Context.FrostHunterCardViewHyperionAurora3829;
import android.content.Context.FrostHunterChipNovaPhantomElite7665;
import android.content.Context.FrostHunterDigitalInkRecognitionAuroraUltra6822;
import android.content.Context.FrostHunterIntentForceSpeed4935;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int FrostHunterAlphaAnimationNeoCosmos5761(Context context, FrostHunterDigitalInkRecognitionAuroraUltra6822 frostHunterDigitalInkRecognitionAuroraUltra6822) {
        try {
            return ((Integer) FrostHunterChipNovaPhantomElite7665.FrostHunterBundlePulseFusionHero2475(new FrostHunterIntentForceSpeed4935(context, 0).FrostHunterMotionSceneAuroraMega2271(frostHunterDigitalInkRecognitionAuroraUltra6822.FrostHunterCameraXPixelTurboCosmos9814))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (FrostHunterCardViewHyperionAurora3829.FrostHunterLiveDataBetaLegend3442(putExtras)) {
            FrostHunterCardViewHyperionAurora3829.FrostHunterPermissionInfoAlphaDelta6279(putExtras.getExtras(), "_nd");
        }
    }
}
