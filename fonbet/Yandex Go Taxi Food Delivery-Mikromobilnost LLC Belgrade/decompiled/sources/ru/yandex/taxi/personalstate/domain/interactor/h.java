package ru.yandex.taxi.personalstate.domain.interactor;

import androidx.lifecycle.Lifecycle;
import defpackage.jy60;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import ru.yandex.taxi.personalstate.domain.o;

/* loaded from: classes9.dex */
public final class h implements jy60 {
    public final o a;
    public final tt2 b;
    public final tse c;
    public final Lifecycle d;

    public h(o oVar, tt2 tt2Var, tse tseVar, Lifecycle lifecycle) {
        this.a = oVar;
        this.b = tt2Var;
        this.c = tseVar;
        this.d = lifecycle;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PersonalStateLifecycleInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        PersonalStateLifecycleInteractor$subscribeCreatedState$1 personalStateLifecycleInteractor$subscribeCreatedState$1 = new PersonalStateLifecycleInteractor$subscribeCreatedState$1(this, null);
        tse tseVar = this.c;
        tje.N(tseVar, null, null, personalStateLifecycleInteractor$subscribeCreatedState$1, 3);
        tje.N(tseVar, null, null, new PersonalStateLifecycleInteractor$subscribeResumedState$1(this, null), 3);
    }
}
