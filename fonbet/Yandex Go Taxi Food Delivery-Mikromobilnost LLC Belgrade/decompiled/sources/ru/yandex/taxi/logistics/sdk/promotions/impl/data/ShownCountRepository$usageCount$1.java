package ru.yandex.taxi.logistics.sdk.promotions.impl.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.promotions.impl.data.ShownCountRepository", f = "ShownCountRepository.kt", l = {65}, m = "usageCount", v = 2)
/* loaded from: classes5.dex */
final class ShownCountRepository$usageCount$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShownCountRepository$usageCount$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.c(this.this$0, null, this);
    }
}
