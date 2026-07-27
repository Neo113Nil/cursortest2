package kotlin.text;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishPayPalHandler {
    public final HashMap CatchingFishCoroutine;
    public final CatchingFishViewModelIntent CatchingFishParcelableFAB;
    public final CatchingFishJUnitMVIService CatchingFishSnackbar;

    public CatchingFishPayPalHandler(Context context, CatchingFishJUnitMVIService catchingFishJUnitMVIService) {
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(context, 0);
        this.CatchingFishCoroutine = new HashMap();
        this.CatchingFishParcelableFAB = catchingFishViewModelIntent;
        this.CatchingFishSnackbar = catchingFishJUnitMVIService;
    }

    public final synchronized CatchingFishAdMobCoroutine CatchingFishParcelableFAB(String str) {
        if (this.CatchingFishCoroutine.containsKey(str)) {
            return (CatchingFishAdMobCoroutine) this.CatchingFishCoroutine.get(str);
        }
        CctBackendFactory CatchingFishFragmentHandler = this.CatchingFishParcelableFAB.CatchingFishFragmentHandler(str);
        if (CatchingFishFragmentHandler == null) {
            return null;
        }
        CatchingFishJUnitMVIService catchingFishJUnitMVIService = this.CatchingFishSnackbar;
        CatchingFishAdMobCoroutine create = CatchingFishFragmentHandler.create(new CatchingFishLifecycleBundle(catchingFishJUnitMVIService.CatchingFishParcelableFAB, catchingFishJUnitMVIService.CatchingFishSnackbar, catchingFishJUnitMVIService.CatchingFishCoroutine, str));
        this.CatchingFishCoroutine.put(str, create);
        return create;
    }
}
