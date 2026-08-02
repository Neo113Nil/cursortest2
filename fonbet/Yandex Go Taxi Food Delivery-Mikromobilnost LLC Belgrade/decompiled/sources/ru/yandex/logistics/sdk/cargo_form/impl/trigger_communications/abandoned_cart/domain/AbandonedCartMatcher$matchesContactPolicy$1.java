package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.AbandonedCartMatcher", f = "AbandonedCartMatcher.kt", l = {HProv.PP_INFO}, m = "matchesContactPolicy", v = 2)
/* loaded from: classes5.dex */
final class AbandonedCartMatcher$matchesContactPolicy$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbandonedCartMatcher$matchesContactPolicy$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, 0L, this);
    }
}
