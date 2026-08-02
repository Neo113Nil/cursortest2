package ru.yandex.taxi.promotions.storage;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.promotions.storage.PromotionsStorageImpl", f = "PromotionsStorageImpl.kt", l = {39}, m = "loadInMemCache$suspendImpl", v = 2)
/* loaded from: classes6.dex */
final class PromotionsStorageImpl$loadInMemCache$1<T extends Promotion> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionsStorageImpl$loadInMemCache$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.k(this.this$0, this);
    }
}
