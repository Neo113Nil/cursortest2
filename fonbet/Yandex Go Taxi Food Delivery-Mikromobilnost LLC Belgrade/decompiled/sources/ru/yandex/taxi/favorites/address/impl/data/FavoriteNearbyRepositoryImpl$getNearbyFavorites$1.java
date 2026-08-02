package ru.yandex.taxi.favorites.address.impl.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.favorites.address.impl.data.FavoriteNearbyRepositoryImpl", f = "FavoriteNearbyRepositoryImpl.kt", l = {39}, m = "getNearbyFavorites", v = 2)
/* loaded from: classes5.dex */
final class FavoriteNearbyRepositoryImpl$getNearbyFavorites$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteNearbyRepositoryImpl$getNearbyFavorites$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, 0, this);
    }
}
