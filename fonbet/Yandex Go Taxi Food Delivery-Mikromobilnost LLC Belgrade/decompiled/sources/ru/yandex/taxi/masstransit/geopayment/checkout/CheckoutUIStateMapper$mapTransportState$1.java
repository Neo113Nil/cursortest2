package ru.yandex.taxi.masstransit.geopayment.checkout;

import com.ybsdk.rconfig.configs.QrScannerGuidelinesConfigSchema;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.CheckoutUIStateMapper", f = "CheckoutUIStateMapper.kt", l = {677, 678, QrScannerGuidelinesConfigSchema.MIN_SCREEN_HEIGHT_TO_SHOW_GUIDELINES}, m = "mapTransportState", v = 2)
/* loaded from: classes6.dex */
final class CheckoutUIStateMapper$mapTransportState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutUIStateMapper$mapTransportState$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l(null, this);
    }
}
