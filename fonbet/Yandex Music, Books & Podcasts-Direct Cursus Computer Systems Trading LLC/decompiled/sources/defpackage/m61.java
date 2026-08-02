package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class m61 implements mnq {
    public final xh1 a;
    public final tj1 b;
    public final tmb c;
    public final rj1 d;
    public final jyr e;
    public final jyr f;

    public m61(xh1 xh1Var, tj1 tj1Var, tmb tmbVar, rj1 rj1Var) {
        tmbVar.getClass();
        this.a = xh1Var;
        this.b = tj1Var;
        this.c = tmbVar;
        this.d = rj1Var;
        final int i = 0;
        this.e = btf.b(new Function0(this) { // from class: l61
            public final /* synthetic */ m61 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (fnq) this.b.b.a().c.getValue();
                    default:
                        m61 m61Var = this.b;
                        return new i61((h61) m61Var.a.e.getValue(), m61Var.c, (q61) m61Var.b.b().g.getValue(), m61Var.d);
                }
            }
        });
        final int i2 = 1;
        this.f = btf.b(new Function0(this) { // from class: l61
            public final /* synthetic */ m61 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (fnq) this.b.b.a().c.getValue();
                    default:
                        m61 m61Var = this.b;
                        return new i61((h61) m61Var.a.e.getValue(), m61Var.c, (q61) m61Var.b.b().g.getValue(), m61Var.d);
                }
            }
        });
    }

    @Override // defpackage.prf
    public final knq a() {
        return (knq) this.f.getValue();
    }

    @Override // defpackage.mnq
    public final fnq b() {
        return (fnq) this.e.getValue();
    }
}
