package kotlin.text;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class CatchingFishStripeAPIHilt {
    public static CatchingFishKtorPicassoMVVM CatchingFishParcelableFAB(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        CatchingFishKtorPicassoMVVM CatchingFishViewModelScope = CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(null, rootWindowInsets);
        CatchingFishFragmentHilt catchingFishFragmentHilt = CatchingFishViewModelScope.CatchingFishParcelableFAB;
        catchingFishFragmentHilt.CatchingFishGsonAppCompat(CatchingFishViewModelScope);
        View rootView = view.getRootView();
        catchingFishFragmentHilt.CatchingFishReduxKtor(rootView);
        catchingFishFragmentHilt.CatchingFishStateLiveData(rootView);
        catchingFishFragmentHilt.CatchingFishRoomDatabase();
        return CatchingFishViewModelScope;
    }
}
