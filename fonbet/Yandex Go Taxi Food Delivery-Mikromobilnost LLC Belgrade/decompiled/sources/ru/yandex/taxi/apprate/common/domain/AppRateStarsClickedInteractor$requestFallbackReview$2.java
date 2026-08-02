package ru.yandex.taxi.apprate.common.domain;

import defpackage.iw2;
import defpackage.kgx;
import defpackage.lw2;
import defpackage.qdx;
import defpackage.sls;
import defpackage.x4e;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class AppRateStarsClickedInteractor$requestFallbackReview$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        lw2 lw2Var = aVar.b;
        qdx qdxVar = lw2Var.e;
        kgx[] kgxVarArr = lw2.f;
        int intValue = ((Number) qdxVar.getValue(lw2Var, kgxVarArr[3])).intValue() + 1;
        lw2Var.e.setValue(lw2Var, kgxVarArr[3], Integer.valueOf(intValue));
        iw2 iw2Var = aVar.a;
        x4e.B(iw2Var.a.a, "OrderFeedback.Rate.Later", new HashMap(), 1);
        if (intValue >= 3) {
            x4e.B(iw2Var.a.a, "OrderFeedback.Rate.DenyStoreRate", new HashMap(), 1);
        }
        return zy11.a;
    }
}
