package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class sbn implements ba2 {
    public final oq7 a;
    public long b;
    public final long c;
    public final jyr d;
    public final jyr e;
    public final jyr f;

    public sbn(oq7 oq7Var) {
        oq7Var.getClass();
        this.a = oq7Var;
        msa msaVar = nsa.b;
        this.c = yd5.M(5, ssa.SECONDS);
        final int i = 0;
        this.d = btf.b(new Function0(this) { // from class: lbn
            public final /* synthetic */ sbn b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                sbn sbnVar = this.b;
                switch (i2) {
                    case 0:
                        return new f9l(7, new ail(14, sbnVar.a.d.D(sbnVar.c), sbnVar));
                    case 1:
                        return new f9l(9, new f9l(8, new ail(15, sbnVar.a.c.i, sbnVar)));
                    default:
                        return zsd.u0((pjc) sbnVar.d.getValue(), (pjc) sbnVar.e.getValue());
                }
            }
        });
        final int i2 = 1;
        this.e = btf.b(new Function0(this) { // from class: lbn
            public final /* synthetic */ sbn b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                sbn sbnVar = this.b;
                switch (i22) {
                    case 0:
                        return new f9l(7, new ail(14, sbnVar.a.d.D(sbnVar.c), sbnVar));
                    case 1:
                        return new f9l(9, new f9l(8, new ail(15, sbnVar.a.c.i, sbnVar)));
                    default:
                        return zsd.u0((pjc) sbnVar.d.getValue(), (pjc) sbnVar.e.getValue());
                }
            }
        });
        final int i3 = 2;
        this.f = btf.b(new Function0(this) { // from class: lbn
            public final /* synthetic */ sbn b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                sbn sbnVar = this.b;
                switch (i22) {
                    case 0:
                        return new f9l(7, new ail(14, sbnVar.a.d.D(sbnVar.c), sbnVar));
                    case 1:
                        return new f9l(9, new f9l(8, new ail(15, sbnVar.a.c.i, sbnVar)));
                    default:
                        return zsd.u0((pjc) sbnVar.d.getValue(), (pjc) sbnVar.e.getValue());
                }
            }
        });
    }

    @Override // defpackage.ba2
    public final pjc a() {
        return (pjc) this.f.getValue();
    }
}
