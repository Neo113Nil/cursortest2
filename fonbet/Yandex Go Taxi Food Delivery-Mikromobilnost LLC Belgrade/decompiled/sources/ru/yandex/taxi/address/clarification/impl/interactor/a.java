package ru.yandex.taxi.address.clarification.impl.interactor;

import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.ah00;
import defpackage.j4n;
import defpackage.l56;
import defpackage.pft0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vp0;
import defpackage.xvw;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes5.dex */
public final class a implements pft0 {
    public final ah00 a;
    public final l56 b;
    public final ru.yandex.taxi.address.clarification.impl.repo.a c;
    public final j4n d;
    public final xvw e;
    public final m f;

    public a(ah00 ah00Var, l56 l56Var, ru.yandex.taxi.address.clarification.impl.repo.a aVar, j4n j4nVar, xvw xvwVar, m mVar) {
        this.a = ah00Var;
        this.b = l56Var;
        this.c = aVar;
        this.d = j4nVar;
        this.e = xvwVar;
        this.f = mVar;
    }

    @Override // defpackage.pft0
    public final void a(tse tseVar) {
        this.c.d = vp0.b;
        tje.N(tseVar, null, CoroutineStart.UNDISPATCHED, new AddressAdjustmentSourcePointLifecycleListener$onAttach$1(this, null), 1);
        tje.N(tseVar, null, null, new AddressAdjustmentSourcePointLifecycleListener$onAttach$2(this, null), 3);
    }
}
