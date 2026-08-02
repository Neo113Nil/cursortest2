package ru.yandex.taxi.eatskit;

import defpackage.dl40;
import defpackage.gcn;
import defpackage.msv0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class EatsKitServiceController$configure$14$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Map map = (Map) obj;
        gcn gcnVar = (gcn) obj2;
        msv0 msv0Var = (msv0) this.receiver;
        dl40 dl40Var = msv0Var.b;
        if (dl40Var.satisfiesClickDelay()) {
            dl40Var.updateLastClickOnItemTimestamp();
            msv0Var.a.k(map, gcnVar);
        }
        return zy11.a;
    }
}
