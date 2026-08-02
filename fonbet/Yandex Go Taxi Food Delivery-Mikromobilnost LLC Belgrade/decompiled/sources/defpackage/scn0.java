package defpackage;

import com.yandex.go.scooters.data_form.b;
import com.yandex.go.scooters.data_form.data.ScootersDataFormApi;
import ru.yandex.taxi.scooters.data.a;

/* loaded from: classes13.dex */
public final class scn0 {
    public final v920 a;

    public scn0(v920 v920Var) {
        this.a = v920Var;
    }

    public final b a() {
        v920 v920Var = this.a;
        v920Var.getClass();
        t7g t7gVar = new t7g(v920Var, 1);
        t7g t7gVar2 = new t7g(v920Var, 0);
        xvf0 b = i5m.b(rro0.a);
        xvf0 b2 = i5m.b(new qzm0(i5m.b(kcn0.a), 11));
        xvf0 b3 = i5m.b(qcn0.a);
        v0n0 v0n0Var = (v0n0) v920Var.y;
        q5z.h(v0n0Var);
        qro0 qro0Var = (qro0) b.get();
        com.yandex.go.scooters.data_form.data.b bVar = new com.yandex.go.scooters.data_form.data.b((jcn0) b2.get());
        wnt wntVar = (wnt) v920Var.a;
        q5z.h(wntVar);
        ScootersDataFormApi scootersDataFormApi = (ScootersDataFormApi) v920Var.c;
        q5z.h(scootersDataFormApi);
        a aVar = (a) v920Var.x;
        q5z.h(aVar);
        return new b(t7gVar, t7gVar2, v0n0Var, qro0Var, bVar, new com.yandex.go.scooters.data_form.domain.a(new com.yandex.go.scooters.data_form.data.a(wntVar, scootersDataFormApi, aVar), (qro0) b.get(), (jcn0) b2.get(), (pcn0) b3.get()), (pcn0) b3.get());
    }
}
