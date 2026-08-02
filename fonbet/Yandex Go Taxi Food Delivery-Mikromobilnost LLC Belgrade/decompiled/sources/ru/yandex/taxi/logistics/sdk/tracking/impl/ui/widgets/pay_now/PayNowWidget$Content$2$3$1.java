package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now;

import defpackage.jl40;
import defpackage.qt90;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class PayNowWidget$Content$2$3$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Map map = (Map) obj;
        qt90 qt90Var = (qt90) this.receiver;
        if (!jl40.l(qt90Var.e, map)) {
            qt90Var.a.x("PayOnDeliveryButton.Shown", map);
            qt90Var.e = map;
        }
        return zy11.a;
    }
}
