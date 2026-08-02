package ru.yandex.taxi.perf.screen;

import androidx.lifecycle.Lifecycle;
import defpackage.jy60;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class b implements jy60 {
    public final Lifecycle a;
    public final tse b;
    public final c c;

    public b(Lifecycle lifecycle, tse tseVar, c cVar) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = cVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PerformanceScreenAppLifecycleListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.b, null, null, new PerformanceScreenAppLifecycleListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
