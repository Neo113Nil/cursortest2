package ru.yandex.taxi.analytics.referrer;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.analytics.referrer.DeferredDeeplinkFallbackSource", f = "DeferredDeeplinkFallbackSource.kt", l = {18}, m = "findFallbackDeeplink", v = 2)
/* loaded from: classes9.dex */
final class DeferredDeeplinkFallbackSource$findFallbackDeeplink$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredDeeplinkFallbackSource$findFallbackDeeplink$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
