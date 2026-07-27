package android.content.Context;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterDebugUltraUltra2842 extends FrostHunterLiveDataEpicNeoPrime2305 {
    public final WindowInsetsController FrostHunterAlphaAnimationNeoCosmos5761;
    public final Window FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterDebugUltraUltra2842(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = insetsController;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = window;
    }

    @Override // android.content.Context.FrostHunterLiveDataEpicNeoPrime2305
    public void FrostHunterFragmentBetaMegaVortex6025(boolean z) {
        FrostHunterServiceConnectionTurboPhoenixOmega6719(8192, 8, z);
    }

    @Override // android.content.Context.FrostHunterLiveDataEpicNeoPrime2305
    public void FrostHunterKeyframeGammaGamma1197(boolean z) {
        FrostHunterServiceConnectionTurboPhoenixOmega6719(16, 16, z);
    }

    public final void FrostHunterServiceConnectionTurboPhoenixOmega6719(int i, int i2, boolean z) {
        Window window = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
