package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class o5q implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5q b;

    public /* synthetic */ o5q(u5q u5qVar, int i) {
        this.a = i;
        this.b = u5qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        u5q u5qVar = this.b;
        switch (i) {
            case 0:
                jyr b = btf.b(new o5q(u5qVar, 5));
                Context context = u5qVar.a;
                dq7 dq7Var = ca8.a;
                xkh xkhVar = new xkh(4, u2x.u(mn7.d));
                pre preVar = u5qVar.b;
                j3t j3tVar = new j3t(preVar.g);
                yfx yfxVar = new yfx(8, preVar.h, preVar.a);
                dl2 dl2Var = (dl2) b.getValue();
                return new u6q(context, xkhVar, preVar.d, preVar.e, preVar.f, preVar.v, j3tVar, yfxVar, preVar.b, btf.b(new o5q(u5qVar, 6)), preVar.u, dl2Var, preVar.x, preVar.y, preVar.q, new q5q(u5qVar), preVar.w, preVar.c, new r5q(u5qVar));
            case 1:
                p5q p5qVar = new p5q(u5qVar);
                q3t q3tVar = (q3t) u5qVar.f.getValue();
                pre preVar2 = u5qVar.b;
                return new qzs(p5qVar, q3tVar, (f7l) preVar2.k.getValue(), preVar2.o, new p5q(u5qVar), new g8c(u5qVar), preVar2.s);
            case 2:
                pre preVar3 = u5qVar.b;
                return new l6q((f7l) preVar3.k.getValue(), preVar3.p, new hjp(1, u5qVar), (q7l) preVar3.l.getValue(), (q3t) u5qVar.f.getValue(), (k1l) preVar3.m.getValue(), (k1l) preVar3.n.getValue(), new sml(u5qVar));
            case 3:
                return u5qVar.b().a();
            case 4:
                return new jvs(u5qVar.b().n);
            case 5:
                ow6 ow6Var = new ow6();
                ox6.B((dkn) new ime(u5qVar.b.b).d, cmd.a, new ryp(7, ow6Var));
                return new dl2(ow6Var);
            case 6:
                return new bp3(u5qVar.b.i);
            default:
                Boolean bool = (Boolean) u5qVar.b.x.a.d.getValue();
                bool.booleanValue();
                return bool;
        }
    }
}
