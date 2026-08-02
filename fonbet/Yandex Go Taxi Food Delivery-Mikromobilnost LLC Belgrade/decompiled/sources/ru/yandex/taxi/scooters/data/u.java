package ru.yandex.taxi.scooters.data;

import defpackage.b2k;
import defpackage.bvf0;
import defpackage.mth;
import defpackage.pzn0;
import defpackage.vng;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class u {
    public final g a;
    public final r0 b = bvf0.c(null);

    public u(g gVar) {
        this.a = gVar;
    }

    public final b2k a() {
        return vng.l(new mth(new m0(this.b, this.a.b(false), new ScootersOrderSelectorRepository$listenToSelectedSessionState$1(this, null)), 6), new pzn0(14), vng.c);
    }
}
