package com.squareup.cash.favorites.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealFavoritesManager$removeFavorite$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealFavoritesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFavoritesManager$removeFavorite$1(RealFavoritesManager realFavoritesManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realFavoritesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.removeFavorite(null, null, null, this);
    }
}
