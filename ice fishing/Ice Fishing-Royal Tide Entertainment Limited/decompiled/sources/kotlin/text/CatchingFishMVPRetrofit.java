package kotlin.text;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class CatchingFishMVPRetrofit extends CatchingFishHiltMVPToast {
    public final Window CatchingFishParcelableFAB;

    public CatchingFishMVPRetrofit(Window window, CatchingFishGradleMVVM catchingFishGradleMVVM) {
        this.CatchingFishParcelableFAB = window;
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final void CatchingFishJobScheduler(boolean z) {
        if (!z) {
            CatchingFishStateFlow(8192);
            return;
        }
        Window window = this.CatchingFishParcelableFAB;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void CatchingFishStateFlow(int i) {
        View decorView = this.CatchingFishParcelableFAB.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
