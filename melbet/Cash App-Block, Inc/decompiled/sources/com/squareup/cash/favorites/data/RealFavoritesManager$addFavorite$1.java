package com.squareup.cash.favorites.data;

import com.squareup.protos.cash.cashfavorites.api.v1.FavoriteOrigin;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealFavoritesManager$addFavorite$1 extends ContinuationImpl {
    public String L$0;
    public FavoriteOrigin L$1;
    public String L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealFavoritesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFavoritesManager$addFavorite$1(RealFavoritesManager realFavoritesManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realFavoritesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.addFavorite(null, null, null, null, this);
    }
}
