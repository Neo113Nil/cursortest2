package kotlin.text;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class CatchingFishIntentGraphQL extends CatchingFishWebsocketFlux {
    public int CatchingFishFragmentHandler;
    public boolean CatchingFishLayout;
    public Object CatchingFishViewModelFAB;
    public final CatchingFishHiltGraphQL CatchingFishViewModelScope;

    public CatchingFishIntentGraphQL(CatchingFishHiltGraphQL catchingFishHiltGraphQL, CatchingFishRetrofitOkHttp[] catchingFishRetrofitOkHttpArr) {
        super(catchingFishHiltGraphQL.CatchingFishDaggerWebsocket, catchingFishRetrofitOkHttpArr);
        this.CatchingFishViewModelScope = catchingFishHiltGraphQL;
        this.CatchingFishFragmentHandler = catchingFishHiltGraphQL.CatchingFishViewModelScope;
    }

    public final void CatchingFishCoroutine(int i, CatchingFishOkHttpIntent catchingFishOkHttpIntent, Object obj, int i2) {
        int i3 = i2 * 5;
        CatchingFishRetrofitOkHttp[] catchingFishRetrofitOkHttpArr = this.CatchingFishReduxKtor;
        if (i3 <= 30) {
            int CatchingFishDaggerHiltFAB = 1 << CatchingFishLayoutRoom.CatchingFishDaggerHiltFAB(i, i3);
            if (catchingFishOkHttpIntent.CatchingFishViewModelFAB(CatchingFishDaggerHiltFAB)) {
                catchingFishRetrofitOkHttpArr[i2].CatchingFishParcelableFAB(catchingFishOkHttpIntent.CatchingFishReduxKtor, Integer.bitCount(catchingFishOkHttpIntent.CatchingFishParcelableFAB) * 2, catchingFishOkHttpIntent.CatchingFishWorkManager(CatchingFishDaggerHiltFAB));
                this.CatchingFishDaggerWebsocket = i2;
                return;
            } else {
                int CatchingFishJetpackCompose = catchingFishOkHttpIntent.CatchingFishJetpackCompose(CatchingFishDaggerHiltFAB);
                CatchingFishOkHttpIntent CatchingFish = catchingFishOkHttpIntent.CatchingFish(CatchingFishJetpackCompose);
                catchingFishRetrofitOkHttpArr[i2].CatchingFishParcelableFAB(catchingFishOkHttpIntent.CatchingFishReduxKtor, Integer.bitCount(catchingFishOkHttpIntent.CatchingFishParcelableFAB) * 2, CatchingFishJetpackCompose);
                CatchingFishCoroutine(i, CatchingFish, obj, i2 + 1);
                return;
            }
        }
        CatchingFishRetrofitOkHttp catchingFishRetrofitOkHttp = catchingFishRetrofitOkHttpArr[i2];
        Object[] objArr = catchingFishOkHttpIntent.CatchingFishReduxKtor;
        catchingFishRetrofitOkHttp.CatchingFishParcelableFAB(objArr, objArr.length, 0);
        while (true) {
            CatchingFishRetrofitOkHttp catchingFishRetrofitOkHttp2 = catchingFishRetrofitOkHttpArr[i2];
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishRetrofitOkHttp2.CatchingFishReduxKtor[catchingFishRetrofitOkHttp2.CatchingFishWorkManager], obj)) {
                this.CatchingFishDaggerWebsocket = i2;
                return;
            } else {
                catchingFishRetrofitOkHttpArr[i2].CatchingFishWorkManager += 2;
            }
        }
    }

    @Override // kotlin.text.CatchingFishWebsocketFlux, java.util.Iterator
    public final Object next() {
        if (this.CatchingFishViewModelScope.CatchingFishViewModelScope != this.CatchingFishFragmentHandler) {
            throw new ConcurrentModificationException();
        }
        if (!this.CatchingFishWorkManager) {
            throw new NoSuchElementException();
        }
        CatchingFishRetrofitOkHttp catchingFishRetrofitOkHttp = this.CatchingFishReduxKtor[this.CatchingFishDaggerWebsocket];
        this.CatchingFishViewModelFAB = catchingFishRetrofitOkHttp.CatchingFishReduxKtor[catchingFishRetrofitOkHttp.CatchingFishWorkManager];
        this.CatchingFishLayout = true;
        return super.next();
    }

    @Override // kotlin.text.CatchingFishWebsocketFlux, java.util.Iterator
    public final void remove() {
        if (!this.CatchingFishLayout) {
            throw new IllegalStateException();
        }
        boolean z = this.CatchingFishWorkManager;
        CatchingFishHiltGraphQL catchingFishHiltGraphQL = this.CatchingFishViewModelScope;
        if (!z) {
            CatchingFishLayoutRoomFAB.CatchingFishLayout(catchingFishHiltGraphQL).remove(this.CatchingFishViewModelFAB);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            CatchingFishRetrofitOkHttp catchingFishRetrofitOkHttp = this.CatchingFishReduxKtor[this.CatchingFishDaggerWebsocket];
            Object obj = catchingFishRetrofitOkHttp.CatchingFishReduxKtor[catchingFishRetrofitOkHttp.CatchingFishWorkManager];
            CatchingFishLayoutRoomFAB.CatchingFishLayout(catchingFishHiltGraphQL).remove(this.CatchingFishViewModelFAB);
            CatchingFishCoroutine(obj != null ? obj.hashCode() : 0, catchingFishHiltGraphQL.CatchingFishDaggerWebsocket, obj, 0);
        }
        this.CatchingFishViewModelFAB = null;
        this.CatchingFishLayout = false;
        this.CatchingFishFragmentHandler = catchingFishHiltGraphQL.CatchingFishViewModelScope;
    }
}
