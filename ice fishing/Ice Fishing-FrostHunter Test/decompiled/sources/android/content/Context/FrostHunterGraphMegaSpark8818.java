package android.content.Context;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterGraphMegaSpark8818 extends FrostHunterLiveDataEpicNeoPrime2305 {
    public final Window FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterGraphMegaSpark8818(Window window) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = window;
    }

    @Override // android.content.Context.FrostHunterLiveDataEpicNeoPrime2305
    public final void FrostHunterFragmentBetaMegaVortex6025(boolean z) {
        Window window = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
