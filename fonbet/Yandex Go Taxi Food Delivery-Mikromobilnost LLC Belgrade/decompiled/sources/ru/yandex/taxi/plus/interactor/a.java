package ru.yandex.taxi.plus.interactor;

import defpackage.f1d0;
import defpackage.mdh;
import defpackage.n49;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.cashback.CashbackTeaserController$cashbackButtonAvailabilityFlow$$inlined$flatMapLatest$1;

/* loaded from: classes9.dex */
public final class a implements f1d0 {
    public final n49 a;

    public a(n49 n49Var) {
        this.a = n49Var;
    }

    public final tpr a() {
        n49 n49Var = this.a;
        tpr t = e.t(e.X(n49Var.b.b.a(), new CashbackTeaserController$cashbackButtonAvailabilityFlow$$inlined$flatMapLatest$1(null, n49Var)));
        n49Var.a.getClass();
        sjh sjhVar = uyj.a;
        return e.t(new n(e.F(t, mdh.b), new PlusBadgeAvailabilityInteractorImpl$plusBadgeAvailabilityFlow$1(2, null)));
    }
}
