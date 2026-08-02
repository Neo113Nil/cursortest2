package ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.CargoFormCommonModelMapper", f = "CargoFormCommonModelMapper.kt", l = {295, 310, 324, 332, 449}, m = "mapSlotTrail", v = 2)
/* loaded from: classes5.dex */
final class CargoFormCommonModelMapper$mapSlotTrail$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFormCommonModelMapper$mapSlotTrail$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.u(null, null, false, false, this);
    }
}
