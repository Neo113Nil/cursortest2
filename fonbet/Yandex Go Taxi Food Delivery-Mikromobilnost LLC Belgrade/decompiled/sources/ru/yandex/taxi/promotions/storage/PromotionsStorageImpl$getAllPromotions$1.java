package ru.yandex.taxi.promotions.storage;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.promotions.storage.PromotionsStorageImpl", f = "PromotionsStorageImpl.kt", l = {185, 44}, m = "getAllPromotions$suspendImpl", v = 2)
/* loaded from: classes9.dex */
final class PromotionsStorageImpl$getAllPromotions$1<T extends Promotion> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionsStorageImpl$getAllPromotions$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.i(this.this$0, this);
    }
}
