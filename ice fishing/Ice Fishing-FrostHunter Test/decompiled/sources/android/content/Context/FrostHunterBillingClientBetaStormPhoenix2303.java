package android.content.Context;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.firebase.messaging.EnhancedIntentService;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBillingClientBetaStormPhoenix2303 extends Binder {
    public final FrostHunterSQLiteMasterUltra9956 FrostHunterBundlePulseFusionHero2475;

    public FrostHunterBillingClientBetaStormPhoenix2303(FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956) {
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterSQLiteMasterUltra9956;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterObjectAnimatorBetaOlympian2287 frostHunterObjectAnimatorBetaOlympian2287) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Intent intent = frostHunterObjectAnimatorBetaOlympian2287.FrostHunterAlphaAnimationNeoCosmos5761;
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.FrostHunterBundlePulseFusionHero2475.FrostHunterFlowMaxDragonHero5809;
        int i = EnhancedIntentService.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        FrostHunterIntentBetaElite8730 frostHunterIntentBetaElite8730 = new FrostHunterIntentBetaElite8730();
        enhancedIntentService.FrostHunterCameraXPixelTurboCosmos9814.execute(new FrostHunterMagnetometerStrikeSolar7622(enhancedIntentService, intent, frostHunterIntentBetaElite8730, 3));
        frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterRemoteConfigDeltaTitanMaster1902(1), new FrostHunterRippleDrawableMaxElite5227(25, frostHunterObjectAnimatorBetaOlympian2287));
    }
}
