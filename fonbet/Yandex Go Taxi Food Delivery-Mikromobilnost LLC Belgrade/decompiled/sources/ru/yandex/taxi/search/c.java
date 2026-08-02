package ru.yandex.taxi.search;

import defpackage.g92;
import defpackage.tpr;
import defpackage.wiq0;
import defpackage.zy11;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.experiment.q;

/* loaded from: classes6.dex */
public final class c {
    public final q a;
    public final wiq0 b;
    public final com.yandex.go.navigation.screen.c c;

    public c(q qVar, wiq0 wiq0Var, com.yandex.go.navigation.screen.c cVar) {
        this.a = qVar;
        this.b = wiq0Var;
        this.c = cVar;
    }

    public static tpr a(c cVar, r0 r0Var, tpr tprVar, int i) {
        tpr tprVar2 = r0Var;
        if ((i & 1) != 0) {
            tprVar2 = new g92(2, null);
        }
        if ((i & 2) != 0) {
            tprVar = new g92(2, zy11.a);
        }
        com.yandex.go.navigation.screen.c cVar2 = cVar.c;
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(kotlinx.coroutines.flow.e.X(cVar2.c(), new NewbiesRedesignInteractor$tariffSelectionFlow$$inlined$flatMapLatest$1(null, cVar)), cVar2.c(), tprVar2, tprVar, new NewbiesRedesignInteractor$selectedTariffConfigFlow$1(null, cVar)));
    }
}
