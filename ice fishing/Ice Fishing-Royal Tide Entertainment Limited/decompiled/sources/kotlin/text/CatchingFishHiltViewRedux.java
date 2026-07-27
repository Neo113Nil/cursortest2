package kotlin.text;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class CatchingFishHiltViewRedux {
    public static WindowInsets CatchingFishParcelableFAB(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static CharSequence CatchingFishSnackbar(View view) {
        return view.getStateDescription();
    }
}
