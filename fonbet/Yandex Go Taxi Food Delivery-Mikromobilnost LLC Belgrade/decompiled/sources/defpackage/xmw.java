package defpackage;

import ru.yandex.taxi.intercity.analytics.IntercityPhoneSelectOrigin;

/* loaded from: classes5.dex */
public final class xmw extends m230 {
    public final w030 E;
    public final ufb0 F;
    public final b9w G;
    public final uow H;
    public final d9w I;
    public final oep0 J;
    public final boolean K;

    public xmw(w030 w030Var, ufb0 ufb0Var, b9w b9wVar, uow uowVar, d9w d9wVar, oep0 oep0Var) {
        super(null);
        this.E = w030Var;
        this.F = ufb0Var;
        this.G = b9wVar;
        this.H = uowVar;
        this.I = d9wVar;
        this.J = oep0Var;
        this.K = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.K;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        return this.F.a(((c9w) this.G).a(((e9w) this.I).b()), new wmw(this, 0), new kv8(7, this), cgq0.a, new tow((pj) ((ziv) this.H.a.b).get(), (IntercityPhoneSelectOrigin) obj));
    }

    public final void T(IntercityPhoneSelectOrigin intercityPhoneSelectOrigin) {
        ((pep0) this.J).f(this, intercityPhoneSelectOrigin, hxx.a);
    }
}
