package ru.yandex.taxi.locationsdk.common_utils;

import defpackage.f92;
import defpackage.fi9;
import defpackage.jqr;
import defpackage.k7d0;
import defpackage.mth;
import defpackage.n1f;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.wls;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.q;

/* loaded from: classes9.dex */
public abstract class a {
    public static final fi9 a(f92 f92Var, long j) {
        return e.i(new FlowUtilsKt$bufferItemsBy$1(f92Var, j, null));
    }

    public static final rol0 b(n1f n1fVar, wls wlsVar) {
        return new rol0(new FlowUtilsKt$filterWithPreviousEmitted$1(n1fVar, wlsVar, null));
    }

    public static final mth c(jqr jqrVar, k7d0 k7d0Var) {
        return e.B(jqrVar, new FlowUtilsKt$flatMapIterable$1(k7d0Var, null));
    }

    public static final q d(tpr tprVar, long j, long j2) {
        return e.M(e.U(tprVar, j), new FlowUtilsKt$retryOnTimeoutWithDelay$1(j2, null), 1);
    }
}
