package kotlin.text;

import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionReadListener;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpAppCompat implements OnAttributionReadListener {
    public final /* synthetic */ CatchingFishKtorMockk CatchingFishParcelableFAB;

    public CatchingFishOkHttpAppCompat(CatchingFishKtorMockk catchingFishKtorMockk) {
        this.CatchingFishParcelableFAB = catchingFishKtorMockk;
    }

    @Override // com.adjust.sdk.OnAttributionReadListener
    public final void onAttributionRead(AdjustAttribution adjustAttribution) {
        CatchingFishKtorMockk catchingFishKtorMockk = this.CatchingFishParcelableFAB;
        if (catchingFishKtorMockk.CatchingFishParcelableFlux()) {
            String str = adjustAttribution != null ? adjustAttribution.jsonResponse : null;
            if (str == null) {
                str = "";
            }
            catchingFishKtorMockk.CatchingFishViewModelFAB(str);
        }
    }
}
