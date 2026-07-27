package kotlin.text;

import java.io.IOException;

/* loaded from: classes.dex */
public final class CatchingFishMVVMMockk extends CatchingFishPayPalLifecycle {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishSharedFlowMoshi CatchingFishViewModelScope;
    public final /* synthetic */ int CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMVVMMockk(CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi, Object[] objArr, int i, int i2) {
        super("OkHttp %s stream %d", objArr);
        this.CatchingFishViewModelScope = catchingFishSharedFlowMoshi;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = i2;
    }

    @Override // kotlin.text.CatchingFishPayPalLifecycle
    public final void CatchingFishParcelableFAB() {
        CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi = this.CatchingFishViewModelScope;
        try {
            catchingFishSharedFlowMoshi.CatchingFishSpannableWidget.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager);
        } catch (IOException e) {
            catchingFishSharedFlowMoshi.CatchingFishSnackbar(2, 2, e);
        }
    }
}
