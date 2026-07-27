package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class CatchingFishWebsocketFlux implements Iterator, CatchingFishCardViewFAB {
    public int CatchingFishDaggerWebsocket;
    public final CatchingFishRetrofitOkHttp[] CatchingFishReduxKtor;
    public boolean CatchingFishWorkManager = true;

    public CatchingFishWebsocketFlux(CatchingFishOkHttpIntent catchingFishOkHttpIntent, CatchingFishRetrofitOkHttp[] catchingFishRetrofitOkHttpArr) {
        this.CatchingFishReduxKtor = catchingFishRetrofitOkHttpArr;
        catchingFishRetrofitOkHttpArr[0].CatchingFishParcelableFAB(catchingFishOkHttpIntent.CatchingFishReduxKtor, Integer.bitCount(catchingFishOkHttpIntent.CatchingFishParcelableFAB) * 2, 0);
        this.CatchingFishDaggerWebsocket = 0;
        CatchingFishParcelableFAB();
    }

    public final void CatchingFishParcelableFAB() {
        int i = this.CatchingFishDaggerWebsocket;
        CatchingFishRetrofitOkHttp[] catchingFishRetrofitOkHttpArr = this.CatchingFishReduxKtor;
        CatchingFishRetrofitOkHttp catchingFishRetrofitOkHttp = catchingFishRetrofitOkHttpArr[i];
        if (catchingFishRetrofitOkHttp.CatchingFishWorkManager < catchingFishRetrofitOkHttp.CatchingFishDaggerWebsocket) {
            return;
        }
        while (-1 < i) {
            int CatchingFishSnackbar = CatchingFishSnackbar(i);
            if (CatchingFishSnackbar == -1) {
                CatchingFishRetrofitOkHttp catchingFishRetrofitOkHttp2 = catchingFishRetrofitOkHttpArr[i];
                int i2 = catchingFishRetrofitOkHttp2.CatchingFishWorkManager;
                Object[] objArr = catchingFishRetrofitOkHttp2.CatchingFishReduxKtor;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    catchingFishRetrofitOkHttp2.CatchingFishWorkManager = i2 + 1;
                    CatchingFishSnackbar = CatchingFishSnackbar(i);
                }
            }
            if (CatchingFishSnackbar != -1) {
                this.CatchingFishDaggerWebsocket = CatchingFishSnackbar;
                return;
            }
            if (i > 0) {
                CatchingFishRetrofitOkHttp catchingFishRetrofitOkHttp3 = catchingFishRetrofitOkHttpArr[i - 1];
                int i3 = catchingFishRetrofitOkHttp3.CatchingFishWorkManager;
                int length2 = catchingFishRetrofitOkHttp3.CatchingFishReduxKtor.length;
                catchingFishRetrofitOkHttp3.CatchingFishWorkManager = i3 + 1;
            }
            catchingFishRetrofitOkHttpArr[i].CatchingFishParcelableFAB(CatchingFishOkHttpIntent.CatchingFishDaggerWebsocket.CatchingFishReduxKtor, 0, 0);
            i--;
        }
        this.CatchingFishWorkManager = false;
    }

    public final int CatchingFishSnackbar(int i) {
        CatchingFishRetrofitOkHttp[] catchingFishRetrofitOkHttpArr = this.CatchingFishReduxKtor;
        CatchingFishRetrofitOkHttp catchingFishRetrofitOkHttp = catchingFishRetrofitOkHttpArr[i];
        int i2 = catchingFishRetrofitOkHttp.CatchingFishWorkManager;
        if (i2 < catchingFishRetrofitOkHttp.CatchingFishDaggerWebsocket) {
            return i;
        }
        Object[] objArr = catchingFishRetrofitOkHttp.CatchingFishReduxKtor;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        CatchingFishOkHttpIntent catchingFishOkHttpIntent = (CatchingFishOkHttpIntent) obj;
        if (i == 6) {
            CatchingFishRetrofitOkHttp catchingFishRetrofitOkHttp2 = catchingFishRetrofitOkHttpArr[i + 1];
            Object[] objArr2 = catchingFishOkHttpIntent.CatchingFishReduxKtor;
            catchingFishRetrofitOkHttp2.CatchingFishParcelableFAB(objArr2, objArr2.length, 0);
        } else {
            catchingFishRetrofitOkHttpArr[i + 1].CatchingFishParcelableFAB(catchingFishOkHttpIntent.CatchingFishReduxKtor, Integer.bitCount(catchingFishOkHttpIntent.CatchingFishParcelableFAB) * 2, 0);
        }
        return CatchingFishSnackbar(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.CatchingFishWorkManager;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.CatchingFishWorkManager) {
            throw new NoSuchElementException();
        }
        Object next = this.CatchingFishReduxKtor[this.CatchingFishDaggerWebsocket].next();
        CatchingFishParcelableFAB();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
