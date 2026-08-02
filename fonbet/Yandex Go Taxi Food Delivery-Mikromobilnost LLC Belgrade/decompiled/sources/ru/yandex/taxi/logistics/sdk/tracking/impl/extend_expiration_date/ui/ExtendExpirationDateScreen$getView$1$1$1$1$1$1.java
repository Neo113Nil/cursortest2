package ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.ui;

import defpackage.bvf0;
import defpackage.ds31;
import defpackage.g8e;
import defpackage.jwh;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class ExtendExpirationDateScreen$getView$1$1$1$1$1$1 extends FunctionReferenceImpl implements tls {
    public final void i(String str) {
        c cVar = (c) this.receiver;
        r0 r0Var = cVar.E;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        jwh jwhVar = cVar.y.a;
        jwhVar.a.o("Delivery.NDD.OrderStatusCard.Prolong.ProlongButton.Tapped", null, g8e.x("storage_period_expire_date", str));
        tje.N(bvf0.a(cVar.z.b), null, null, new ExtendExpirationDateViewModel$onConfirmButtonClick$1(cVar, str, null), 3);
        tje.N(ds31.a(cVar), null, null, new ExtendExpirationDateViewModel$onConfirmButtonClick$2(cVar, null), 3);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((String) obj);
        return zy11.a;
    }
}
