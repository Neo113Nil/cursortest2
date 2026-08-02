package defpackage;

import android.content.Context;
import defpackage.ddi;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.logistics.ndd_map.router.e;

/* loaded from: classes5.dex */
public final class yi50 extends ad5 {
    public final ah00 A;
    public final f5v0 B;
    public final ai50 C;
    public final n3a D;
    public final k E;
    public final Context F;
    public final li50 G;
    public final ji50 H;
    public final fl10 I;
    public final uk10 J;
    public final u9i K;
    public final uli L;
    public final e M;
    public final n4g N;
    public final yh50 O;
    public final oep0 P;
    public final oh50 Q;
    public final aj50 R;
    public zi50 S;
    public final Integer x;
    public final AddressResolveRepository y;
    public final e100 z;

    public yi50(Integer num, AddressResolveRepository addressResolveRepository, e100 e100Var, ah00 ah00Var, f5v0 f5v0Var, ai50 ai50Var, n3a n3aVar, k kVar, Context context, li50 li50Var, ji50 ji50Var, fl10 fl10Var, uk10 uk10Var, u9i u9iVar, uli uliVar, e eVar, n4g n4gVar, yh50 yh50Var, oep0 oep0Var, oh50 oh50Var, aj50 aj50Var) {
        super(wi50.class);
        this.x = num;
        this.y = addressResolveRepository;
        this.z = e100Var;
        this.A = ah00Var;
        this.B = f5v0Var;
        this.C = ai50Var;
        this.D = n3aVar;
        this.E = kVar;
        this.F = context;
        this.G = li50Var;
        this.H = ji50Var;
        this.I = fl10Var;
        this.J = uk10Var;
        this.K = u9iVar;
        this.L = uliVar;
        this.M = eVar;
        this.N = n4gVar;
        this.O = yh50Var;
        this.P = oep0Var;
        this.Q = oh50Var;
        this.R = aj50Var;
        this.S = new zi50(0);
    }

    public final void Kg() {
        Object value;
        Object value2;
        e eVar = this.M;
        r0 r0Var = eVar.j.a.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, ddi.a.d));
        ch50 ch50Var = eVar.i;
        ih50 ih50Var = ch50Var.b;
        if (!(ih50Var.b.a.getValue() instanceof gh50)) {
            ch50Var.f.a();
            ji50 ji50Var = ch50Var.a;
            r0 r0Var2 = ih50Var.a;
            do {
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, new fh50(ji50Var)));
        }
        this.O.a.r(new qu(9));
    }
}
