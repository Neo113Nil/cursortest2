package android.content.Context;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAlarmManagerPrimeStrikeEclipse2462 extends FrostHunterCoroutineThunderPhantomStrike2330 implements FrostHunterNotificationGammaBlazePhoenix7595 {
    public final /* synthetic */ FrostHunterFilterSpectraTitan5298 FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterFlowMaxDragonHero5809;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrostHunterAlarmManagerPrimeStrikeEclipse2462(FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298, int i) {
        super(0);
        this.FrostHunterFlowMaxDragonHero5809 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterFilterSpectraTitan5298;
    }

    @Override // android.content.Context.FrostHunterNotificationGammaBlazePhoenix7595
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        int actionMasked;
        FrostHunterVelocityTrackerTitaniumPhoenixSolar7978 frostHunterVelocityTrackerTitaniumPhoenixSolar7978;
        int i = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298 = this.FrostHunterAlertDialogAuroraDelta3200;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                MotionEvent motionEvent = frostHunterFilterSpectraTitan5298.FrostHunterItemDecorationPhoenixAlphaVortex8006;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    frostHunterFilterSpectraTitan5298.FrostHunterDrawableCompatHeroMasterSpectra7412 = SystemClock.uptimeMillis();
                    frostHunterFilterSpectraTitan5298.post(frostHunterFilterSpectraTitan5298.FrostHunterBannerAdNebulaMasterBeta4389);
                }
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            default:
                frostHunterVelocityTrackerTitaniumPhoenixSolar7978 = frostHunterFilterSpectraTitan5298.get_viewTreeOwners();
                return frostHunterVelocityTrackerTitaniumPhoenixSolar7978;
        }
    }
}
