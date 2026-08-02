package ru.yandex.taxi.preorder.suggested.destinations;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.suggested.destinations.ExpectedDestinationsHelper", f = "ExpectedDestinationsHelper.kt", l = {195, 204, 204}, m = "getExpectedDestinationsFromServer", v = 2)
/* loaded from: classes6.dex */
final class ExpectedDestinationsHelper$getExpectedDestinationsFromServer$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpectedDestinationsHelper$getExpectedDestinationsFromServer$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.b(this.this$0, null, false, this);
    }
}
