package kotlin.text;

import java.io.IOException;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXWidget extends CatchingFishPayPalLifecycle {
    public final boolean CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishSharedFlowMoshi CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishAndroidXWidget(CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi, int i, int i2) {
        super("OkHttp %s ping %08x%08x", catchingFishSharedFlowMoshi.CatchingFishViewModelScope, Integer.valueOf(i), Integer.valueOf(i2));
        this.CatchingFishViewModelFAB = catchingFishSharedFlowMoshi;
        this.CatchingFishDaggerWebsocket = true;
        this.CatchingFishWorkManager = i;
        this.CatchingFishViewModelScope = i2;
    }

    @Override // kotlin.text.CatchingFishPayPalLifecycle
    public final void CatchingFishParcelableFAB() {
        CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi = this.CatchingFishViewModelFAB;
        boolean z = this.CatchingFishDaggerWebsocket;
        try {
            catchingFishSharedFlowMoshi.CatchingFishSpannableWidget.CatchingFishEspressoTesting(this.CatchingFishWorkManager, this.CatchingFishViewModelScope, z);
        } catch (IOException e) {
            catchingFishSharedFlowMoshi.CatchingFishSnackbar(2, 2, e);
        }
    }
}
