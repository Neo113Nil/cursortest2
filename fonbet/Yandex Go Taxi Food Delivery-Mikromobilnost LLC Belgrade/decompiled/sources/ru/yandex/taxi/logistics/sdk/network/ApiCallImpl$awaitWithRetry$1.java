package ru.yandex.taxi.logistics.sdk.network;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.network.ApiCallImpl", f = "ApiCallImpl.kt", l = {35}, m = "awaitWithRetry", v = 2)
/* loaded from: classes5.dex */
final class ApiCallImpl$awaitWithRetry$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiCallImpl$awaitWithRetry$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0, 0L, 0L, this);
    }
}
