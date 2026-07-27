package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishCustomViewRedux implements Iterator, CatchingFishCardViewFAB {
    public final Iterator CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 0;

    public CatchingFishCustomViewRedux(CatchingFishHiltGraphQL catchingFishHiltGraphQL) {
        CatchingFishRetrofitOkHttp[] catchingFishRetrofitOkHttpArr = new CatchingFishRetrofitOkHttp[8];
        for (int i = 0; i < 8; i++) {
            catchingFishRetrofitOkHttpArr[i] = new CatchingFishRoomCoroutine(this);
        }
        this.CatchingFishDaggerWebsocket = new CatchingFishIntentGraphQL(catchingFishHiltGraphQL, catchingFishRetrofitOkHttpArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((CatchingFishIntentGraphQL) this.CatchingFishDaggerWebsocket).CatchingFishWorkManager;
            default:
                return this.CatchingFishDaggerWebsocket.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (Map.Entry) ((CatchingFishIntentGraphQL) this.CatchingFishDaggerWebsocket).next();
            default:
                return (CatchingFishMockkGradle) this.CatchingFishDaggerWebsocket.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishIntentGraphQL) this.CatchingFishDaggerWebsocket).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public CatchingFishCustomViewRedux(CatchingFishPayPalViewModel catchingFishPayPalViewModel) {
        this.CatchingFishDaggerWebsocket = catchingFishPayPalViewModel.CatchingFishOkHttp.iterator();
    }
}
