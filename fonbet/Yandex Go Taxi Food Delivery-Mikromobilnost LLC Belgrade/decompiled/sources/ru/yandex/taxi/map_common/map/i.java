package ru.yandex.taxi.map_common.map;

import defpackage.al00;
import defpackage.h3y;
import defpackage.t1b0;
import defpackage.tje;
import defpackage.vw60;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes9.dex */
public final class i implements vw60 {
    public final h3y a;

    public i(h3y h3yVar) {
        this.a = h3yVar;
    }

    @Override // defpackage.vw60
    public final void c() {
        al00 al00Var = (al00) this.a.get();
        if (al00Var.e.compareAndSet(false, true)) {
            tje.N(al00Var.c.a, null, null, new MapKitGlobalExperimentsInteractor$listenForExperiments$$inlined$safeCollectIn$1(new m0(ru.yandex.taxi.experiments.d.b(al00Var.a.a), ru.yandex.taxi.experiments.d.b((t1b0) al00Var.b.b), new MapKitGlobalExperimentsInteractor$Companion$mergeExperimentFlows$1(3, null)), null, al00Var), 3);
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "MapKitGlobalExperimentsInitStarter";
    }
}
