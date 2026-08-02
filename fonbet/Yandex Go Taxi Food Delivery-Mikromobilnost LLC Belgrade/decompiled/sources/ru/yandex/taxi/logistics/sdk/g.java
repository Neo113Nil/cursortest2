package ru.yandex.taxi.logistics.sdk;

import androidx.lifecycle.Lifecycle;
import defpackage.iy11;
import defpackage.jy60;
import defpackage.ky11;
import defpackage.sfi;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class g implements jy60 {
    public final Lifecycle a;
    public final tse b;
    public final sfi c;
    public final ky11 d;
    public final iy11 e;

    public g(Lifecycle lifecycle, tse tseVar, sfi sfiVar, ky11 ky11Var, iy11 iy11Var) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = sfiVar;
        this.d = ky11Var;
        this.e = iy11Var;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "DeliveryOrderEventsNotifier";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.b, null, null, new DeliveryOrderEventsNotifier$onFirstContentfulPaint$1(null, this), 3);
    }
}
