package com.google.firebase.messaging;

import android.content.Context.FrostHunterCardViewFusionHeroSpectra3749;
import android.content.Context.FrostHunterCardViewHyperionAurora3829;
import android.content.Context.FrostHunterFlowCollectorMegaTitaniumFusion9321;
import android.content.Context.FrostHunterGradientDrawablePrimeSpectraUltra1716;
import android.content.Context.FrostHunterJobSchedulerPhoenixRogue9514;
import android.content.Context.FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849;
import android.content.Context.FrostHunterRotateAnimationSpectraPhoenixPhantom3899;
import android.content.Context.FrostHunterSQLiteMasterUltra9956;
import android.content.Context.FrostHunterShapeAppearanceNebulaAurora4980;
import android.content.Context.FrostHunterTraceHyperionAuroraNebula9947;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final ArrayDeque FrostHunterScaleAnimationStrikeSpark5059 = new ArrayDeque(10);
    public FrostHunterFlowCollectorMegaTitaniumFusion9321 FrostHunterLightSensorForceFusion4241;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    @Override // com.google.firebase.messaging.EnhancedIntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterBundlePulseFusionHero2475(Intent intent) {
        FrostHunterFlowCollectorMegaTitaniumFusion9321 frostHunterFlowCollectorMegaTitaniumFusion9321;
        int i;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                intent.getStringExtra("token");
                return;
            } else {
                intent.getAction();
                return;
            }
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            ArrayDeque arrayDeque = FrostHunterScaleAnimationStrikeSpark5059;
            if (!arrayDeque.contains(stringExtra)) {
                if (arrayDeque.size() >= 10) {
                    arrayDeque.remove();
                }
                arrayDeque.add(stringExtra);
            }
            if (this.FrostHunterLightSensorForceFusion4241 == null) {
                this.FrostHunterLightSensorForceFusion4241 = new FrostHunterFlowCollectorMegaTitaniumFusion9321(getApplicationContext());
            }
            frostHunterFlowCollectorMegaTitaniumFusion9321 = this.FrostHunterLightSensorForceFusion4241;
            if (frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterBundlePulseFusionHero2475.FrostHunterDialogFragmentTurboPhoenixDragon7627() >= 233700000) {
                new FrostHunterGradientDrawablePrimeSpectraUltra1716().FrostHunterAlertDialogAuroraDelta3200(new IOException("SERVICE_NOT_AVAILABLE"));
                return;
            }
            Bundle bundle = new Bundle();
            String stringExtra2 = intent.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            FrostHunterCardViewFusionHeroSpectra3749 FrostHunterFragmentBetaMegaVortex6025 = FrostHunterCardViewFusionHeroSpectra3749.FrostHunterFragmentBetaMegaVortex6025(frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            synchronized (FrostHunterFragmentBetaMegaVortex6025) {
                i = FrostHunterFragmentBetaMegaVortex6025.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterFragmentBetaMegaVortex6025.FrostHunterAlphaAnimationNeoCosmos5761 = i + 1;
            }
            FrostHunterFragmentBetaMegaVortex6025.FrostHunterServiceConnectionTurboPhoenixOmega6719(new FrostHunterShapeAppearanceNebulaAurora4980(i, 3, bundle, 0));
            return;
        }
        String stringExtra3 = intent.getStringExtra("message_type");
        if (stringExtra3 == null) {
            stringExtra3 = "gcm";
        }
        switch (stringExtra3) {
            case "gcm":
                FrostHunterCardViewHyperionAurora3829.FrostHunterRewardedAdMasterStrike9463(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (FrostHunterSQLiteMasterUltra9956.FrostHunterMotionSceneAuroraMega2271(extras)) {
                    FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = new FrostHunterSQLiteMasterUltra9956(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new FrostHunterJobSchedulerPhoenixRogue9514("Firebase-Messaging-Network-Io"));
                    try {
                        if (!new FrostHunterTraceHyperionAuroraNebula9947(this, frostHunterSQLiteMasterUltra9956, newSingleThreadExecutor).FrostHunterScaleAnimationStrikeSpark5059()) {
                            newSingleThreadExecutor.shutdown();
                            if (FrostHunterCardViewHyperionAurora3829.FrostHunterLiveDataBetaLegend3442(intent)) {
                                FrostHunterCardViewHyperionAurora3829.FrostHunterPermissionInfoAlphaDelta6279(intent.getExtras(), "_nf");
                                break;
                            }
                        } else {
                            break;
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                break;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new FrostHunterRotateAnimationSpectraPhoenixPhantom3899(stringExtra4);
                if (stringExtra4 != null) {
                    stringExtra4.toLowerCase(Locale.US).getClass();
                    break;
                }
                break;
            case "send_event":
                intent.getStringExtra("google.message_id");
                break;
        }
        if (this.FrostHunterLightSensorForceFusion4241 == null) {
        }
        frostHunterFlowCollectorMegaTitaniumFusion9321 = this.FrostHunterLightSensorForceFusion4241;
        if (frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterBundlePulseFusionHero2475.FrostHunterDialogFragmentTurboPhoenixDragon7627() >= 233700000) {
        }
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public final Intent FrostHunterConstraintSetCloneMasterUltraRogue2633(Intent intent) {
        return (Intent) ((ArrayDeque) FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterLooperThreadBetaHyperionMax1000().FrostHunterFragmentBetaMegaVortex6025).poll();
    }
}
