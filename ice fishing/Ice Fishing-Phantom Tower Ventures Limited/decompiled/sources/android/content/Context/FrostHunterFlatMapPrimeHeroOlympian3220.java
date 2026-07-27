package android.content.Context;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlatMapPrimeHeroOlympian3220 extends FrostHunterGraphMegaSpark8818 {
    @Override // android.content.Context.FrostHunterLiveDataEpicNeoPrime2305
    public final void FrostHunterKeyframeGammaGamma1197(boolean z) {
        Window window = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
