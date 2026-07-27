package kotlin.text;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishViewMoshiMVI extends CatchingFishOkHttpService {
    public Object CatchingFishViewModelFAB;
    public final CatchingFishCustomViewRedux CatchingFishViewModelScope;

    public CatchingFishViewMoshiMVI(CatchingFishCustomViewRedux catchingFishCustomViewRedux, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.CatchingFishViewModelScope = catchingFishCustomViewRedux;
        this.CatchingFishViewModelFAB = obj2;
    }

    @Override // kotlin.text.CatchingFishOkHttpService, java.util.Map.Entry
    public final Object getValue() {
        return this.CatchingFishViewModelFAB;
    }

    @Override // kotlin.text.CatchingFishOkHttpService, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.CatchingFishViewModelFAB;
        this.CatchingFishViewModelFAB = obj;
        CatchingFishIntentGraphQL catchingFishIntentGraphQL = (CatchingFishIntentGraphQL) this.CatchingFishViewModelScope.CatchingFishDaggerWebsocket;
        CatchingFishHiltGraphQL catchingFishHiltGraphQL = catchingFishIntentGraphQL.CatchingFishViewModelScope;
        Object obj3 = this.CatchingFishDaggerWebsocket;
        if (!catchingFishHiltGraphQL.containsKey(obj3)) {
            return obj2;
        }
        boolean z = catchingFishIntentGraphQL.CatchingFishWorkManager;
        if (!z) {
            catchingFishHiltGraphQL.put(obj3, obj);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            CatchingFishRetrofitOkHttp catchingFishRetrofitOkHttp = catchingFishIntentGraphQL.CatchingFishReduxKtor[catchingFishIntentGraphQL.CatchingFishDaggerWebsocket];
            Object obj4 = catchingFishRetrofitOkHttp.CatchingFishReduxKtor[catchingFishRetrofitOkHttp.CatchingFishWorkManager];
            catchingFishHiltGraphQL.put(obj3, obj);
            catchingFishIntentGraphQL.CatchingFishCoroutine(obj4 != null ? obj4.hashCode() : 0, catchingFishHiltGraphQL.CatchingFishDaggerWebsocket, obj4, 0);
        }
        catchingFishIntentGraphQL.CatchingFishFragmentHandler = catchingFishHiltGraphQL.CatchingFishViewModelScope;
        return obj2;
    }
}
