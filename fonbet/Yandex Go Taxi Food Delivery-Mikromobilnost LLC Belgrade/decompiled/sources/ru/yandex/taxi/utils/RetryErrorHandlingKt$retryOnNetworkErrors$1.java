package ru.yandex.taxi.utils;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.utils.RetryErrorHandlingKt", f = "RetryErrorHandling.kt", l = {13, 20}, m = "retryOnNetworkErrors", v = 2)
/* loaded from: classes6.dex */
final class RetryErrorHandlingKt$retryOnNetworkErrors$1<T> extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.a(0, 0L, null, this);
    }
}
