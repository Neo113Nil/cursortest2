package ru.yandex.taxi.scooters.presentation.personal_goals;

import android.content.Context;
import defpackage.bho0;
import defpackage.ho9;
import defpackage.iin0;
import defpackage.qso0;
import defpackage.rso0;
import defpackage.tse;
import defpackage.w030;
import defpackage.ytz;
import defpackage.yvf0;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final yvf0 G;
    public final qso0 H;

    public a(w030 w030Var, yvf0 yvf0Var, qso0 qso0Var) {
        super(null);
        this.F = w030Var;
        this.G = yvf0Var;
        this.H = qso0Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        bho0 bho0Var = ((rso0) obj).a;
        ScootersRideFinishPersonalGoalsModalRouter$provideModalView$2 scootersRideFinishPersonalGoalsModalRouter$provideModalView$2 = new ScootersRideFinishPersonalGoalsModalRouter$provideModalView$2(0, this, a.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
        iin0 iin0Var = new iin0(26, this);
        ho9 ho9Var = this.H.a;
        return new ScootersRideFinishPersonalGoalsModalView((Context) ho9Var.a.get(), (tse) ho9Var.b.get(), (ytz) ho9Var.c.get(), (e) ho9Var.d.get(), scootersRideFinishPersonalGoalsModalRouter$provideModalView$2, iin0Var, bho0Var);
    }
}
