package ru.yandex.taxi.linked_order.map;

import defpackage.ft00;
import defpackage.hoy;
import defpackage.kf00;
import defpackage.sls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class LinkedOrderMapOverlay$MvpImpl$destinationObject$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        kf00 kf00Var = ((ft00) ((hoy) this.receiver).z.b).a;
        kf00Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("mode", "shared_order");
        kf00Var.a.a("Map.DestinationPoint.Tapped", hashMap, 1, new HashMap());
        return zy11.a;
    }
}
