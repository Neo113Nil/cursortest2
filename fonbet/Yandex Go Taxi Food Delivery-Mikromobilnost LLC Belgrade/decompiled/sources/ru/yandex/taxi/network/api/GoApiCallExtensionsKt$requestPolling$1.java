package ru.yandex.taxi.network.api;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.network.api.GoApiCallExtensionsKt", f = "GoApiCallExtensions.kt", l = {23}, m = "requestPolling", v = 2)
/* loaded from: classes9.dex */
final class GoApiCallExtensionsKt$requestPolling$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.c(null, null, this);
    }
}
