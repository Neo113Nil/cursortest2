package com.adjust.sdk;

import android.content.Context;
import android.content.Context.FrostHunterEditTextSpeedStrikeUltra4638;
import android.content.Context.FrostHunterFlowHyperionVortexDelta5013;
import android.content.Context.FrostHunterImageCaptureNebulaSpeed2968;
import android.content.Context.FrostHunterVibratorSpectraBetaNovaX4683;
import android.content.Intent;
import android.os.Looper;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class GooglePlayServicesClient {

    /* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean trackingEnabled;

        public GooglePlayServicesInfo(String str, Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context, long j) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Google Play Services info can't be accessed from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        FrostHunterEditTextSpeedStrikeUltra4638 frostHunterEditTextSpeedStrikeUltra4638 = new FrostHunterEditTextSpeedStrikeUltra4638(j);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, frostHunterEditTextSpeedStrikeUltra4638, 1)) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("Google Play connection failed");
            return null;
        }
        try {
            try {
                FrostHunterImageCaptureNebulaSpeed2968 frostHunterImageCaptureNebulaSpeed2968 = new FrostHunterImageCaptureNebulaSpeed2968(frostHunterEditTextSpeedStrikeUltra4638.FrostHunterAlphaAnimationNeoCosmos5761());
                return new GooglePlayServicesInfo(frostHunterImageCaptureNebulaSpeed2968.FrostHunterAlphaAnimationNeoCosmos5761(), frostHunterImageCaptureNebulaSpeed2968.FrostHunterConstraintSetCloneMasterUltraRogue2633());
            } catch (Exception e) {
                throw e;
            }
        } finally {
            context.unbindService(frostHunterEditTextSpeedStrikeUltra4638);
        }
    }
}
