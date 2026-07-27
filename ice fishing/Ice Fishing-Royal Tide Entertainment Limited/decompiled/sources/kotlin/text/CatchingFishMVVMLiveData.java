package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishMVVMLiveData extends CatchingFishSpannable {
    public final CatchingFishLayoutViewAdMob CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishMVVMLiveData(CatchingFishLayoutViewAdMob catchingFishLayoutViewAdMob, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishLayoutViewAdMob;
    }

    @Override // kotlin.text.CatchingFishFirebase
    public final int CatchingFishParcelableFAB() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishLayoutViewAdMob catchingFishLayoutViewAdMob = this.CatchingFishDaggerWebsocket;
                catchingFishLayoutViewAdMob.getClass();
                return catchingFishLayoutViewAdMob.CatchingFishDaggerWebsocket;
            default:
                CatchingFishLayoutViewAdMob catchingFishLayoutViewAdMob2 = this.CatchingFishDaggerWebsocket;
                catchingFishLayoutViewAdMob2.getClass();
                return catchingFishLayoutViewAdMob2.CatchingFishDaggerWebsocket;
        }
    }

    @Override // kotlin.text.CatchingFishFirebase, java.util.Collection
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                CatchingFishLayoutViewAdMob catchingFishLayoutViewAdMob = this.CatchingFishDaggerWebsocket;
                Object obj2 = catchingFishLayoutViewAdMob.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && catchingFishLayoutViewAdMob.containsKey(entry.getKey());
            default:
                return this.CatchingFishDaggerWebsocket.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishOkHttpIntent catchingFishOkHttpIntent = this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor;
                CatchingFishRetrofitOkHttp[] catchingFishRetrofitOkHttpArr = new CatchingFishRetrofitOkHttp[8];
                for (int i = 0; i < 8; i++) {
                    catchingFishRetrofitOkHttpArr[i] = new CatchingFishFABAdMobOkHttp(0);
                }
                return new CatchingFishStateFlowFAB(catchingFishOkHttpIntent, catchingFishRetrofitOkHttpArr);
            default:
                CatchingFishOkHttpIntent catchingFishOkHttpIntent2 = this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor;
                CatchingFishRetrofitOkHttp[] catchingFishRetrofitOkHttpArr2 = new CatchingFishRetrofitOkHttp[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    catchingFishRetrofitOkHttpArr2[i2] = new CatchingFishFABAdMobOkHttp(1);
                }
                return new CatchingFishStateFlowFAB(catchingFishOkHttpIntent2, catchingFishRetrofitOkHttpArr2);
        }
    }
}
