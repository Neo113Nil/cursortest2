package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import defpackage.c801;
import defpackage.t701;
import defpackage.wls;
import defpackage.x701;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class TrackingStateSourceRepository$trackingFlow$2 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        x701 x701Var = (x701) obj;
        f fVar = (f) this.receiver;
        if (x701Var instanceof t701) {
            c801 c801Var = fVar.b;
            t701 t701Var = (t701) x701Var;
            c801Var.a.put(fVar.e, new Pair(t701Var.a, Integer.valueOf(t701Var.b)));
        } else {
            fVar.getClass();
        }
        return zy11.a;
    }
}
