package ru.yandex.taxi.masstransit.geopayment.checkout;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.ssl.cl_88;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.CheckoutUIStateMapper", f = "CheckoutUIStateMapper.kt", l = {cl_88.s}, m = "mapPayButton-7GmgGo8", v = 2)
/* loaded from: classes6.dex */
final class CheckoutUIStateMapper$mapPayButton$1 extends ContinuationImpl {
    double D$0;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutUIStateMapper$mapPayButton$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, null, 0, null, null, false, 0.0d, null, null, false, null, false, null, this);
    }
}
