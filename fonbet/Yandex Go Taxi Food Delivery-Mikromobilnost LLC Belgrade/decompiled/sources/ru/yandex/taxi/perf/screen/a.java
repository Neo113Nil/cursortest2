package ru.yandex.taxi.perf.screen;

import androidx.lifecycle.Lifecycle;
import defpackage.lz60;
import defpackage.mua0;
import defpackage.rua0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class a implements lz60 {
    public final mua0 a;
    public final tse b;
    public final Lifecycle c;
    public final c d;
    public final rua0 e;

    public a(mua0 mua0Var, tse tseVar, Lifecycle lifecycle, c cVar, rua0 rua0Var) {
        this.a = mua0Var;
        this.b = tseVar;
        this.c = lifecycle;
        this.d = cVar;
        this.e = rua0Var;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.b, null, null, new FrameMeasurementLcpListener$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "FrameMeasurementLcpListener";
    }
}
