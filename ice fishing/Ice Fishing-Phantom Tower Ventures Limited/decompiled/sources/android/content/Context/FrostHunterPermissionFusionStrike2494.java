package android.content.Context;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPermissionFusionStrike2494 extends FrostHunterVectorDrawableMasterTitanium6371 {
    public final OnBackInvokedDispatcher FrostHunterBundlePulseFusionHero2475;
    public boolean FrostHunterLevelListDrawableFusionDragonHero2232;
    public final OnBackInvokedCallback FrostHunterLifecycleBlazeGammaElite2889;
    public final int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterPermissionFusionStrike2494(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.FrostHunterBundlePulseFusionHero2475 = onBackInvokedDispatcher;
        this.FrostHunterServiceEliteCelestialThunder1757 = i;
        this.FrostHunterLifecycleBlazeGammaElite2889 = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: android.content.Context.FrostHunterMotionLayoutTransitionEliteFusionShadow9981
            public final void onBackInvoked() {
                FrostHunterPermissionFusionStrike2494.this.FrostHunterAlphaAnimationNeoCosmos5761();
            }
        } : new FrostHunterRoomDaoStormVisionAurora7055(this);
    }

    @Override // android.content.Context.FrostHunterVectorDrawableMasterTitanium6371
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.FrostHunterLifecycleBlazeGammaElite2889;
        if (z && !this.FrostHunterLevelListDrawableFusionDragonHero2232) {
            this.FrostHunterBundlePulseFusionHero2475.registerOnBackInvokedCallback(this.FrostHunterServiceEliteCelestialThunder1757, onBackInvokedCallback);
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = true;
        } else {
            if (z || !this.FrostHunterLevelListDrawableFusionDragonHero2232) {
                return;
            }
            this.FrostHunterBundlePulseFusionHero2475.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = false;
        }
    }
}
