package kotlin.text;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class CatchingFishFABMVVM implements CatchingFishFragmentFluxFAB {
    public final ClipboardManager CatchingFishParcelableFAB;

    public CatchingFishFABMVVM(Context context) {
        Object systemService = context.getSystemService("clipboard");
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.CatchingFishParcelableFAB = (ClipboardManager) systemService;
    }
}
