package kotlin.text;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLFluxFlux extends CatchingFishMVPRetrofit {
    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final void CatchingFishMutableLiveData(boolean z) {
        if (!z) {
            CatchingFishStateFlow(16);
            return;
        }
        Window window = this.CatchingFishParcelableFAB;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
