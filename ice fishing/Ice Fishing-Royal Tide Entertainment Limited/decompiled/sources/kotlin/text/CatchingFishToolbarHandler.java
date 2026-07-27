package kotlin.text;

import com.adjust.sdk.OnAdidReadListener;

/* loaded from: classes.dex */
public final class CatchingFishToolbarHandler implements OnAdidReadListener {
    public final /* synthetic */ CatchingFishKtorMockk CatchingFishParcelableFAB;

    public CatchingFishToolbarHandler(CatchingFishKtorMockk catchingFishKtorMockk) {
        this.CatchingFishParcelableFAB = catchingFishKtorMockk;
    }

    @Override // com.adjust.sdk.OnAdidReadListener
    public final void onAdidRead(String str) {
        CatchingFishKtorMockk catchingFishKtorMockk = this.CatchingFishParcelableFAB;
        if (catchingFishKtorMockk.CatchingFishParcelableFlux()) {
            if (str == null) {
                str = "";
            }
            catchingFishKtorMockk.CatchingFishViewModelFAB(str);
        }
    }
}
