package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.order_state;

import defpackage.d780;
import defpackage.e780;
import defpackage.ryc;
import defpackage.zls;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class OrderStateHolder$orderStateFlow$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        ryc rycVar = (ryc) obj2;
        ((a) this.receiver).getClass();
        return rycVar != null ? e780.a : new d780(!list.isEmpty());
    }
}
