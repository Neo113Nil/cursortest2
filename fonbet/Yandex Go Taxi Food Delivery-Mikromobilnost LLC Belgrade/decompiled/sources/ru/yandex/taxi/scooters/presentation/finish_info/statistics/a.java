package ru.yandex.taxi.scooters.presentation.finish_info.statistics;

import defpackage.imn0;
import defpackage.pwy0;
import defpackage.qnn0;
import defpackage.ukn0;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.experiments.d;

/* loaded from: classes6.dex */
public final class a {
    public final pwy0 a;
    public final ukn0 b;
    public final qnn0 c;

    public a(pwy0 pwy0Var, ukn0 ukn0Var, qnn0 qnn0Var) {
        this.a = pwy0Var;
        this.b = ukn0Var;
        this.c = qnn0Var;
    }

    public final m0 a(imn0 imn0Var) {
        return new m0(d.b(this.b.a), this.a.a(), new ScootersFinishInfoStatisticsUiStateInteractor$uiStateFlow$1(imn0Var, this, null));
    }
}
