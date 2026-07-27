package kotlin.text;

import java.io.IOException;

/* loaded from: classes.dex */
public final class CatchingFishGsonMVI extends CatchingFishPayPalLifecycle {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishSharedFlowMoshi CatchingFishViewModelFAB;
    public final /* synthetic */ int CatchingFishViewModelScope;
    public final /* synthetic */ CatchingFishWidgetGradle CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGsonMVI(CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi, Object[] objArr, int i, CatchingFishWidgetGradle catchingFishWidgetGradle, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.CatchingFishViewModelFAB = catchingFishSharedFlowMoshi;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishWidgetGradle;
        this.CatchingFishViewModelScope = i2;
    }

    @Override // kotlin.text.CatchingFishPayPalLifecycle
    public final void CatchingFishParcelableFAB() {
        try {
            CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi = this.CatchingFishViewModelFAB.CatchingFishOkHttp;
            CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishWorkManager;
            int i = this.CatchingFishViewModelScope;
            catchingFishMoshiFluxMoshi.getClass();
            catchingFishWidgetGradle.skip(i);
            this.CatchingFishViewModelFAB.CatchingFishSpannableWidget.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, 6);
            synchronized (this.CatchingFishViewModelFAB) {
                this.CatchingFishViewModelFAB.CatchingFishGsonAppCompat.remove(Integer.valueOf(this.CatchingFishDaggerWebsocket));
            }
        } catch (IOException unused) {
        }
    }
}
