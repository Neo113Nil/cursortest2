package kotlin.text;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class CatchingFishDaggerHiltMVVM extends CatchingFishHiltMVPToast {
    public final WindowInsetsController CatchingFishParcelableFAB;
    public final Window CatchingFishSnackbar;

    public CatchingFishDaggerHiltMVVM(Window window, CatchingFishGradleMVVM catchingFishGradleMVVM) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.CatchingFishParcelableFAB = insetsController;
        this.CatchingFishSnackbar = window;
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public void CatchingFishJobScheduler(boolean z) {
        CatchingFishStateFlow(8192, 8, z);
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public void CatchingFishMutableLiveData(boolean z) {
        CatchingFishStateFlow(16, 16, z);
    }

    public final void CatchingFishStateFlow(int i, int i2, boolean z) {
        Window window = this.CatchingFishSnackbar;
        if (window == null) {
            if (z) {
                this.CatchingFishParcelableFAB.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                this.CatchingFishParcelableFAB.setSystemBarsAppearance(0, i2);
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
