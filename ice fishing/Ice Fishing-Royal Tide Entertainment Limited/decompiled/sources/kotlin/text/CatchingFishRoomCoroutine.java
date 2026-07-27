package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRoomCoroutine extends CatchingFishRetrofitOkHttp {
    public final CatchingFishCustomViewRedux CatchingFishViewModelScope;

    public CatchingFishRoomCoroutine(CatchingFishCustomViewRedux catchingFishCustomViewRedux) {
        this.CatchingFishViewModelScope = catchingFishCustomViewRedux;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.CatchingFishWorkManager;
        this.CatchingFishWorkManager = i + 2;
        Object[] objArr = this.CatchingFishReduxKtor;
        return new CatchingFishViewMoshiMVI(this.CatchingFishViewModelScope, objArr[i], objArr[i + 1]);
    }
}
