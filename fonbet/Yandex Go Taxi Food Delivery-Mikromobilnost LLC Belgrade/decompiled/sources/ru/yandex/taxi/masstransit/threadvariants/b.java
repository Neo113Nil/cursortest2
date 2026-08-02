package ru.yandex.taxi.masstransit.threadvariants;

import defpackage.azy0;
import defpackage.b3v0;
import defpackage.bzy0;
import defpackage.dc4;
import defpackage.dzy0;
import defpackage.e3n;
import defpackage.ha2;
import defpackage.jt30;
import defpackage.kp50;
import defpackage.mdh;
import defpackage.ms30;
import defpackage.o430;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w1u;
import defpackage.w511;
import defpackage.wr30;
import defpackage.zyy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.masstransit.domain.q;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;

/* loaded from: classes6.dex */
public final class b {
    public static final /* synthetic */ int j = 0;
    public final d0 a;
    public final dzy0 b;
    public final tt2 c;
    public final q d;
    public final dc4 e;
    public final jt30 f;
    public final MtPurchaseMapper g;
    public final wr30 h;
    public final long i;

    static {
        int i = d0.d;
    }

    public b(d0 d0Var, dzy0 dzy0Var, tt2 tt2Var, q qVar, dc4 dc4Var, jt30 jt30Var, MtPurchaseMapper mtPurchaseMapper, wr30 wr30Var) {
        this.a = d0Var;
        this.b = dzy0Var;
        this.c = tt2Var;
        this.d = qVar;
        this.e = dc4Var;
        this.f = jt30Var;
        this.g = mtPurchaseMapper;
        this.h = wr30Var;
        o430 o430Var = e3n.b;
        this.i = e3n.e(kp50.U(1, DurationUnit.MINUTES));
    }

    public final ha2 a(bzy0 bzy0Var, n0 n0Var) {
        tpr F;
        ArrayList arrayList;
        boolean z = bzy0Var instanceof zyy0;
        tt2 tt2Var = this.c;
        if (z) {
            zyy0 zyy0Var = (zyy0) bzy0Var;
            o oVar = new o(e.X(e.X(this.a.b(), new MtThreadVariantsUiStateInteractor$groundStateFlow$$inlined$flatMapLatest$1(null, this, n0Var)), new MtThreadVariantsUiStateInteractor$groundStateFlow$2(this, zyy0Var, null)), new MtThreadVariantsUiStateInteractor$groundStateFlow$3(this, zyy0Var, null));
            tt2Var.getClass();
            sjh sjhVar = uyj.a;
            F = e.F(oVar, mdh.b);
        } else {
            if (!(bzy0Var instanceof azy0)) {
                w511.b();
                return null;
            }
            rol0 rol0Var = new rol0(new MtThreadVariantsUiStateInteractor$suburbanStateFlow$1(this, (azy0) bzy0Var, null));
            tt2Var.getClass();
            sjh sjhVar2 = uyj.a;
            F = e.F(rol0Var, mdh.b);
        }
        ms30 a = this.f.a();
        if (z) {
            List list = ((zyy0) bzy0Var).b;
            arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((w1u) it.next()).d.b);
            }
        } else {
            if (!(bzy0Var instanceof azy0)) {
                w511.b();
                return null;
            }
            List list2 = ((azy0) bzy0Var).b;
            arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((b3v0) it2.next()).b);
            }
        }
        return e.n(F, this.e.a(), com.yandex.go.coroutines.b.d(this.h.a(), new MtThreadVariantsUiStateInteractor$uiStateFlow$$inlined$start$1(ru.yandex.taxi.masstransit.geopayment.tickets.model.a.b, null)), new MtThreadVariantsUiStateInteractor$uiStateFlow$1(this, a, kotlin.collections.a.I(arrayList), null));
    }
}
