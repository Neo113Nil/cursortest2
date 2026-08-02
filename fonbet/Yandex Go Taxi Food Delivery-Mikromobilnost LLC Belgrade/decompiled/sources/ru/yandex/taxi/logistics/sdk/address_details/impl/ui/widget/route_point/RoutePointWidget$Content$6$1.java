package ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.e;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class RoutePointWidget$Content$6$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        e eVar = (e) this.receiver;
        eVar.getClass();
        eVar.a0(intValue == 0 ? "SenderAddress" : "RecipientAddress");
        return zy11.a;
    }
}
