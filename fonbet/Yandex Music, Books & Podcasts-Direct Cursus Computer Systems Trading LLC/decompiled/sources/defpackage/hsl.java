package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class hsl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hsl(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                zr zrVar = (zr) this.c;
                dou douVar = (dou) this.d;
                rmb rmbVar = zrVar.c;
                pkb pkbVar = pkb.Wave;
                String str = douVar.a;
                str.getClass();
                return rmbVar.b(new thj(pkbVar, str, this.b + 1, 1, ""));
            case 1:
                mam mamVar = (mam) this.c;
                mqs mqsVar = (mqs) this.d;
                g0l g0lVar = mamVar.e;
                int i = this.b;
                icr icrVar = new icr(i);
                List list = mamVar.a.p;
                g0l.o(g0lVar, icrVar, list, mamVar.f, new w5l(mamVar.g, new jab(qkb.Episodes, 1, 1, 0), szf.M(mqsVar, 0, i), null), "mobile-own_tracks-track-default", y5g.A0(list, syt.a), 1984);
                return Unit.a;
            case 2:
                ((d5p) this.c).F(((g7p) this.d).b, this.b);
                return Unit.a;
            case 3:
                g6p g6pVar = (g6p) this.c;
                o7p o7pVar = (o7p) this.d;
                g6pVar.i0(o7pVar.b, o7pVar.c, this.b);
                return Unit.a;
            case 4:
                g6p g6pVar2 = (g6p) this.c;
                n7p n7pVar = (n7p) this.d;
                g6pVar2.v(n7pVar.b, n7pVar.c, this.b);
                return Unit.a;
            case 5:
                g6p g6pVar3 = (g6p) this.c;
                s6p s6pVar = (s6p) this.d;
                g6pVar3.D(s6pVar.b, s6pVar.c, this.b);
                return Unit.a;
            case 6:
                ((z6a) this.c).c(this.b, ((w3g) this.d).c);
                return Unit.a;
            case 7:
                g6p g6pVar4 = (g6p) this.c;
                t6p t6pVar = (t6p) this.d;
                g6pVar4.w0(t6pVar.b, t6pVar.c, this.b);
                return Unit.a;
            case 8:
                ugq ugqVar = (ugq) this.c;
                dou douVar2 = (dou) this.d;
                hjl hjlVar = ugqVar.c;
                pkb pkbVar2 = pkb.Wave;
                String str2 = douVar2.a;
                str2.getClass();
                thj thjVar = new thj(pkbVar2, str2, this.b + 1, 1, "");
                pkl pklVar = (pkl) hjlVar.c.getValue();
                hjlVar.getClass();
                pklVar.getClass();
                xmb xmbVar = hjlVar.d;
                cvo d = pklVar.d();
                nab nabVar = hjlVar.a;
                u0s u0sVar = (u0s) hjlVar.f.getValue();
                xmbVar.getClass();
                return xmb.c(thjVar, nabVar, u0sVar, d, 1);
            case 9:
                nlu nluVar = (nlu) this.c;
                ilu iluVar = (ilu) this.d;
                cvo cvoVar = nluVar.e;
                b70 b70Var = nluVar.a.f.r().c;
                if (b70Var != null) {
                    dou douVar3 = iluVar.b;
                    return new v5l(cvoVar, b70Var, new d70(douVar3.a, c70.e, douVar3.c, this.b, ""));
                }
                xq0.x("Required value was null.");
                return null;
            case 10:
                jav javVar = (jav) this.c;
                return new v5l(javVar.e(), javVar.f(), zdg.J((nav) this.d, this.b, ""));
            case 11:
                fk0 fk0Var = (fk0) this.c;
                d24 d24Var = (d24) this.d;
                return Boolean.valueOf(Math.abs(this.b - eeh.b(((Number) fk0Var.e()).floatValue() / d24Var.e)) <= d24Var.i + (-3));
            default:
                ((Function2) this.c).invoke(((u1w) ((w1w) this.d)).a, Integer.valueOf(this.b));
                return Unit.a;
        }
    }

    public /* synthetic */ hsl(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
