package defpackage;

import com.yandex.go.tariffcard.interactor.j;
import com.yandex.go.tariffcard.interactor.l;
import com.yandex.go.tariffcard.interactor.n;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.summary.requirements.list.interactors.RequirementsExtraPhoneStateInteractor$extraPhoneStateFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.summary.requirements.list.interactors.a;
import ru.yandex.taxi.summary.requirements.list.interactors.i;
import ru.yandex.taxi.summary.requirements.list.interactors.o;
import ru.yandex.taxi.summary.requirements.list.interactors.u0;
import ru.yandex.taxi.summary.requirements.list.interactors.y;

/* loaded from: classes14.dex */
public final class x7t0 {
    public final kdd0 a;
    public final a b;
    public final y c;
    public final i d;
    public final u0 e;
    public final joj0 f;
    public final npj0 g;
    public final o h;

    public x7t0(kdd0 kdd0Var, a aVar, y yVar, i iVar, u0 u0Var, joj0 joj0Var, npj0 npj0Var, o oVar) {
        this.a = kdd0Var;
        this.b = aVar;
        this.c = yVar;
        this.d = iVar;
        this.e = u0Var;
        this.f = joj0Var;
        this.g = npj0Var;
        this.h = oVar;
    }

    public final mth a() {
        tpr a = this.b.a();
        tpr a2 = this.d.a();
        tpr a3 = this.c.a();
        m0 a4 = this.h.a();
        tpr a5 = this.g.a();
        joj0 joj0Var = this.f;
        tpr t = e.t(e.X(joj0Var.b.e(), new RequirementsExtraPhoneStateInteractor$extraPhoneStateFlow$$inlined$flatMapLatest$1(null, joj0Var)));
        joj0Var.d.getClass();
        return new mth(new n(new l(new j(new tpr[]{a, a2, a3, a4, a5, e.F(t, uyj.a), this.e.f()}, this))), 6);
    }
}
