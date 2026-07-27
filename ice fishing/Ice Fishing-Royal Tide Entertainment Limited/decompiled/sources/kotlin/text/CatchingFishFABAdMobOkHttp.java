package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishFABAdMobOkHttp extends CatchingFishRetrofitOkHttp {
    public final /* synthetic */ int CatchingFishViewModelScope;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.CatchingFishViewModelScope) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = this.CatchingFishWorkManager;
                this.CatchingFishWorkManager = i + 2;
                Object[] objArr = this.CatchingFishReduxKtor;
                return new CatchingFishOkHttpService(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.CatchingFishWorkManager;
                this.CatchingFishWorkManager = i2 + 2;
                return this.CatchingFishReduxKtor[i2];
            default:
                int i3 = this.CatchingFishWorkManager;
                this.CatchingFishWorkManager = i3 + 2;
                return this.CatchingFishReduxKtor[i3 + 1];
        }
    }
}
