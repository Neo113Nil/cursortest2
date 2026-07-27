package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishToastMoshiRealm extends CatchingFishPayPalLifecycle {
    public final /* synthetic */ int CatchingFishDaggerWebsocket = 2;
    public final /* synthetic */ CatchingFishSharedFlowMoshi CatchingFishViewModelScope;
    public final /* synthetic */ int CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishToastMoshiRealm(CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.CatchingFishViewModelScope = catchingFishSharedFlowMoshi;
        this.CatchingFishWorkManager = i;
    }

    @Override // kotlin.text.CatchingFishPayPalLifecycle
    public final void CatchingFishParcelableFAB() {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishViewModelScope.CatchingFishOkHttp.getClass();
                try {
                    this.CatchingFishViewModelScope.CatchingFishSpannableWidget.CatchingFishOkHttp(this.CatchingFishWorkManager, 6);
                    synchronized (this.CatchingFishViewModelScope) {
                        this.CatchingFishViewModelScope.CatchingFishGsonAppCompat.remove(Integer.valueOf(this.CatchingFishWorkManager));
                    }
                    return;
                } catch (IOException unused) {
                    return;
                }
            case 1:
                this.CatchingFishViewModelScope.CatchingFishOkHttp.getClass();
                try {
                    this.CatchingFishViewModelScope.CatchingFishSpannableWidget.CatchingFishOkHttp(this.CatchingFishWorkManager, 6);
                    synchronized (this.CatchingFishViewModelScope) {
                        this.CatchingFishViewModelScope.CatchingFishGsonAppCompat.remove(Integer.valueOf(this.CatchingFishWorkManager));
                    }
                    return;
                } catch (IOException unused2) {
                    return;
                }
            default:
                this.CatchingFishViewModelScope.CatchingFishOkHttp.getClass();
                synchronized (this.CatchingFishViewModelScope) {
                    this.CatchingFishViewModelScope.CatchingFishGsonAppCompat.remove(Integer.valueOf(this.CatchingFishWorkManager));
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishToastMoshiRealm(CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi, Object[] objArr, int i, ArrayList arrayList, boolean z) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.CatchingFishViewModelScope = catchingFishSharedFlowMoshi;
        this.CatchingFishWorkManager = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishToastMoshiRealm(CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi, Object[] objArr, int i, int i2) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.CatchingFishViewModelScope = catchingFishSharedFlowMoshi;
        this.CatchingFishWorkManager = i;
    }
}
