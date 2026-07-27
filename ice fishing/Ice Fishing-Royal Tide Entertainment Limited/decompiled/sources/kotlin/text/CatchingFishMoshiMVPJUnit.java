package kotlin.text;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishMoshiMVPJUnit implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ CatchingFishLiveDataDagger CatchingFishCoroutine;
    public CatchingFishKtorPicassoMVVM CatchingFishParcelableFAB = null;
    public final /* synthetic */ View CatchingFishSnackbar;

    public CatchingFishMoshiMVPJUnit(View view, CatchingFishLiveDataDagger catchingFishLiveDataDagger) {
        this.CatchingFishSnackbar = view;
        this.CatchingFishCoroutine = catchingFishLiveDataDagger;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        CatchingFishKtorPicassoMVVM CatchingFishViewModelScope = CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        CatchingFishLiveDataDagger catchingFishLiveDataDagger = this.CatchingFishCoroutine;
        if (i < 30) {
            CatchingFishGlideFlux.CatchingFishParcelableFAB(windowInsets, this.CatchingFishSnackbar);
            if (CatchingFishViewModelScope.equals(this.CatchingFishParcelableFAB)) {
                return catchingFishLiveDataDagger.CatchingFishStateLiveData(view, CatchingFishViewModelScope).CatchingFishWorkManager();
            }
        }
        this.CatchingFishParcelableFAB = CatchingFishViewModelScope;
        CatchingFishKtorPicassoMVVM CatchingFishStateLiveData = catchingFishLiveDataDagger.CatchingFishStateLiveData(view, CatchingFishViewModelScope);
        if (i >= 30) {
            return CatchingFishStateLiveData.CatchingFishWorkManager();
        }
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        view.requestApplyInsets();
        return CatchingFishStateLiveData.CatchingFishWorkManager();
    }
}
