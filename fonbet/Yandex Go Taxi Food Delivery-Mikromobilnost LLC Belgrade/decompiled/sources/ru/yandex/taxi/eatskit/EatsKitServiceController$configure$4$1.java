package ru.yandex.taxi.eatskit;

import defpackage.gcn;
import defpackage.h1p;
import defpackage.hst;
import defpackage.jst;
import defpackage.unr0;
import defpackage.viw0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.eatskit.dto.OpenSupportParam;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class EatsKitServiceController$configure$4$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        viw0 viw0Var = (viw0) this.receiver;
        viw0Var.getClass();
        String str = ((OpenSupportParam) obj).a;
        hst hstVar = jst.e;
        h1p h1pVar = viw0Var.a;
        unr0.C(new Object[]{h1pVar.getValue(), str}, 2, "SuperApp: %s open support, orderId: %s", hstVar);
        viw0Var.b.l(h1pVar, str, (gcn) obj2);
        return zy11.a;
    }
}
