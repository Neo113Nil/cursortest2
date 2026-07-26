package android.content.Context;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAsyncPrimeUltra7903 extends FrostHunterValueAnimatorHyperNebulaUltra9912 {
    public final /* synthetic */ FrostHunterFlowCollectorMegaTitaniumFusion9321 FrostHunterAlphaAnimationNeoCosmos5761;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterAsyncPrimeUltra7903(FrostHunterFlowCollectorMegaTitaniumFusion9321 frostHunterFlowCollectorMegaTitaniumFusion9321, Looper looper) {
        super(looper);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFlowCollectorMegaTitaniumFusion9321;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        FrostHunterFlowCollectorMegaTitaniumFusion9321 frostHunterFlowCollectorMegaTitaniumFusion9321 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new FrostHunterAnimatedVectorDrawableCosmosSparkDelta7979());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof FrostHunterAnalyticsCelestialBeta2989) {
                        frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterRemoteConfigSpeedSpeed8566 = (FrostHunterAnalyticsCelestialBeta2989) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterLevelListDrawableFusionDragonHero2232 = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = FrostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterAlertDialogAuroraDelta3200.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterConstraintSetCloneMasterUltraRogue2633(extras, group);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                        "Unexpected structured response ".concat(stringExtra2);
                        return;
                    }
                    String str = split[2];
                    String str2 = split[3];
                    if (str2.startsWith(":")) {
                        str2 = str2.substring(1);
                    }
                    frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterConstraintSetCloneMasterUltraRogue2633(intent2.putExtra("error", str2).getExtras(), str);
                    return;
                }
                synchronized (frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterAlphaAnimationNeoCosmos5761) {
                    int i = 0;
                    while (true) {
                        try {
                            FrostHunterTimerCosmosCyberLegend3595 frostHunterTimerCosmosCyberLegend3595 = frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterAlphaAnimationNeoCosmos5761;
                            if (i < frostHunterTimerCosmosCyberLegend3595.FrostHunterAlertDialogAuroraDelta3200) {
                                frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterConstraintSetCloneMasterUltraRogue2633(intent2.getExtras(), (String) frostHunterTimerCosmosCyberLegend3595.FrostHunterLifecycleBlazeGammaElite2889(i));
                                i++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }
}
