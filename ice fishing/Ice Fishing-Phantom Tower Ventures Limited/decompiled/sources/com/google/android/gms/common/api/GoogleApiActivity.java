package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context.FrostHunterCardViewHyperionAurora3829;
import android.content.Context.FrostHunterFragmentLegendHyperion4464;
import android.content.Context.FrostHunterIntentOlympianForceHyper2206;
import android.content.Context.FrostHunterKeyEventNovaXAlpha1220;
import android.content.Context.FrostHunterValueAnimatorHyperNebulaUltra9912;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int FrostHunterFlowMaxDragonHero5809 = 0;
    public int FrostHunterCameraXPixelTurboCosmos9814 = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                FrostHunterIntentOlympianForceHyper2206 FrostHunterServiceEliteCelestialThunder1757 = FrostHunterIntentOlympianForceHyper2206.FrostHunterServiceEliteCelestialThunder1757(this);
                if (i2 == -1) {
                    FrostHunterValueAnimatorHyperNebulaUltra9912 frostHunterValueAnimatorHyperNebulaUltra9912 = FrostHunterServiceEliteCelestialThunder1757.FrostHunterTextViewDragonStormMega4297;
                    frostHunterValueAnimatorHyperNebulaUltra9912.sendMessage(frostHunterValueAnimatorHyperNebulaUltra9912.obtainMessage(3));
                } else if (i2 == 0) {
                    FrostHunterServiceEliteCelestialThunder1757.FrostHunterLifecycleBlazeGammaElite2889(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = bundle.getInt("resolution");
        }
        if (this.FrostHunterCameraXPixelTurboCosmos9814 != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
                return;
            }
            if (pendingIntent == null) {
                FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(num);
                FrostHunterFragmentLegendHyperion4464.FrostHunterBundlePulseFusionHero2475.FrostHunterBundlePulseFusionHero2475(this, num.intValue(), this);
                this.FrostHunterCameraXPixelTurboCosmos9814 = 1;
                return;
            }
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException unused) {
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException unused2) {
                googleApiActivity = this;
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.FrostHunterCameraXPixelTurboCosmos9814 = 1;
            } catch (ActivityNotFoundException unused3) {
                if (extras.getBoolean("notify_manager", true)) {
                    FrostHunterIntentOlympianForceHyper2206.FrostHunterServiceEliteCelestialThunder1757(googleApiActivity).FrostHunterLifecycleBlazeGammaElite2889(new ConnectionResult(22, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String FrostHunterKeyframeGammaGamma1197 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterKeyframeGammaGamma1197("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        FrostHunterKeyframeGammaGamma1197.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                googleApiActivity.FrostHunterCameraXPixelTurboCosmos9814 = 1;
                googleApiActivity.finish();
            } catch (IntentSender.SendIntentException unused4) {
                googleApiActivity.finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.FrostHunterCameraXPixelTurboCosmos9814);
        super.onSaveInstanceState(bundle);
    }
}
