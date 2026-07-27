package kotlin.text;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public abstract class CatchingFishGlideFlux {
    public static void CatchingFishCoroutine(View view, CatchingFishLiveDataDagger catchingFishLiveDataDagger) {
        CatchingFishMoshiMVPJUnit catchingFishMoshiMVPJUnit = catchingFishLiveDataDagger != null ? new CatchingFishMoshiMVPJUnit(view, catchingFishLiveDataDagger) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, catchingFishMoshiMVPJUnit);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (catchingFishMoshiMVPJUnit != null) {
            view.setOnApplyWindowInsetsListener(catchingFishMoshiMVPJUnit);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void CatchingFishParcelableFAB(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static CatchingFishKtorPicassoMVVM CatchingFishSnackbar(View view, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, Rect rect) {
        WindowInsets CatchingFishWorkManager = catchingFishKtorPicassoMVVM.CatchingFishWorkManager();
        if (CatchingFishWorkManager != null) {
            return CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(view, view.computeSystemWindowInsets(CatchingFishWorkManager, rect));
        }
        rect.setEmpty();
        return catchingFishKtorPicassoMVVM;
    }
}
