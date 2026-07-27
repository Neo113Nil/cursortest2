package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishMVPXMLLayout extends CatchingFish {
    public final CatchingFishHiltGraphQL CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishMVPXMLLayout(int i, CatchingFishHiltGraphQL catchingFishHiltGraphQL) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishHiltGraphQL;
    }

    @Override // kotlin.text.CatchingFish
    public final int CatchingFishParcelableFAB() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishHiltGraphQL catchingFishHiltGraphQL = this.CatchingFishDaggerWebsocket;
                catchingFishHiltGraphQL.getClass();
                return catchingFishHiltGraphQL.CatchingFishViewModelFAB;
            default:
                CatchingFishHiltGraphQL catchingFishHiltGraphQL2 = this.CatchingFishDaggerWebsocket;
                catchingFishHiltGraphQL2.getClass();
                return catchingFishHiltGraphQL2.CatchingFishViewModelFAB;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.clear();
                break;
            default:
                this.CatchingFishDaggerWebsocket.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                CatchingFishHiltGraphQL catchingFishHiltGraphQL = this.CatchingFishDaggerWebsocket;
                Object obj2 = catchingFishHiltGraphQL.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && catchingFishHiltGraphQL.containsKey(entry.getKey());
            default:
                return this.CatchingFishDaggerWebsocket.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new CatchingFishCustomViewRedux(this.CatchingFishDaggerWebsocket);
            default:
                CatchingFishRetrofitOkHttp[] catchingFishRetrofitOkHttpArr = new CatchingFishRetrofitOkHttp[8];
                for (int i = 0; i < 8; i++) {
                    catchingFishRetrofitOkHttpArr[i] = new CatchingFishFABAdMobOkHttp(1);
                }
                return new CatchingFishReduxDaggerHilt(this.CatchingFishDaggerWebsocket, catchingFishRetrofitOkHttpArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return this.CatchingFishDaggerWebsocket.remove(entry.getKey(), entry.getValue());
            default:
                CatchingFishHiltGraphQL catchingFishHiltGraphQL = this.CatchingFishDaggerWebsocket;
                if (!catchingFishHiltGraphQL.containsKey(obj)) {
                    return false;
                }
                catchingFishHiltGraphQL.remove(obj);
                return true;
        }
    }
}
