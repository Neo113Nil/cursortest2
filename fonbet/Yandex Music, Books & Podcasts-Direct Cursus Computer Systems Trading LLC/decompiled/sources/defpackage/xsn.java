package defpackage;

import com.yandex.plus.paymentsdk.internal.method.card.a;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class xsn extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ysn s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xsn(ysn ysnVar, int i) {
        super(0);
        this.r = i;
        this.s = ysnVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                String e = eta.e();
                a aVar = this.s.g;
                if (aVar != null) {
                    synchronized (kib.a) {
                        kib.b.put(e, aVar);
                    }
                }
                d51 d51Var = d51.b;
                ysn ysnVar = this.s;
                return d51Var.d(ysnVar.a, ysnVar.b, ysnVar.c, ysnVar.e, ysnVar.d, e, ysnVar.f, null);
            case 1:
                return this.s.b().b();
            case 2:
                ysn ysnVar2 = this.s;
                return new mnd(ysnVar2.a, ysnVar2.b().d());
            case 3:
                return (fnd) this.s.b().r.get();
            case 4:
                return (czd) this.s.b().n.get();
            case 5:
                return this.s.b().f();
            default:
                p77 p77Var = this.s.b().a;
                kwl kwlVar = new kwl();
                cic cicVar = new cic();
                dn9 dn9Var = new dn9(8);
                t8a.b(new os2(15, cicVar));
                rzm b = t8a.b(new os2(22, kwlVar));
                dn9Var.b = new ps2(b);
                rzm rzmVar = p77Var.k;
                dn9Var.c = new e13(b, rzmVar);
                dn9Var.d = new r79(p77Var.C, p77Var.D, p77Var.h);
                dn9Var.e = new qp2(rzmVar, 13);
                int i = o9h.b;
                awc awcVar = new awc(12);
                awcVar.w(mhc.a, (ps2) dn9Var.b);
                awcVar.w(mhc.b, (e13) dn9Var.c);
                awcVar.w(mhc.c, (r79) dn9Var.d);
                awcVar.w(mhc.d, (qp2) dn9Var.e);
                awcVar.z(mhc.e, hyf.u(kg5.h));
                new o9h((LinkedHashMap) awcVar.a);
                dn9Var.f = t8a.b(new dic(cicVar, p77Var.b, p77Var.k, p77Var.f, p77Var.p, p77Var.o, 0));
                t8a.b(new eic(cicVar, p77Var.p, p77Var.u, p77Var.f, p77Var.k, p77Var.d, (rzm) dn9Var.f, p77Var.b, t8a.b(ot0.j)));
                new qp2(cicVar, p77Var.b, 10);
                return dn9Var;
        }
    }
}
