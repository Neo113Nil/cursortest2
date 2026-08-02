package ru.yandex.taxi.costcenters.ride;

import defpackage.cda0;
import defpackage.ffx;
import defpackage.o2y0;
import defpackage.tpr;
import defpackage.zuj0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes5.dex */
public final class c {
    public final cda0 a;
    public final zuj0 b;
    public final n0 c = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public c(cda0 cda0Var, zuj0 zuj0Var) {
        this.a = cda0Var;
        this.b = zuj0Var;
    }

    public final tpr a(o2y0 o2y0Var) {
        return e.t(e.n(o2y0Var.a(), new b(((com.yandex.go.payments.paymentlist.data.c) this.a).u), new n(this.c, new OpenCostCenterRideViewModelRepository$observeViewModel$2(2, null)), new OpenCostCenterRideViewModelRepository$observeViewModel$3(this, o2y0Var, null)));
    }
}
