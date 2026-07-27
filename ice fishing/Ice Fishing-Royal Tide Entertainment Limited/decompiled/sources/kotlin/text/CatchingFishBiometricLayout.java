package kotlin.text;

import java.io.IOException;

/* loaded from: classes.dex */
public final class CatchingFishBiometricLayout extends CatchingFishPayPalLifecycle {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishSharedFlowMoshi CatchingFishViewModelScope;
    public final /* synthetic */ long CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishBiometricLayout(CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.CatchingFishViewModelScope = catchingFishSharedFlowMoshi;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = j;
    }

    @Override // kotlin.text.CatchingFishPayPalLifecycle
    public final void CatchingFishParcelableFAB() {
        CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi = this.CatchingFishViewModelScope;
        try {
            catchingFishSharedFlowMoshi.CatchingFishSpannableWidget.CatchingFishAnimationMockk(this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager);
        } catch (IOException e) {
            catchingFishSharedFlowMoshi.CatchingFishSnackbar(2, 2, e);
        }
    }
}
