package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class pa1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ pa1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                l18 l18Var = l18.b;
                bdt I = hag.I(tj1.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return (q01) ((tj1) qdcVar.C(I)).b().e.getValue();
            case 1:
                return Unit.a;
            case 2:
                return btf.b(new pa1(3));
            case 3:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(yu7.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                final yu7 yu7Var = (yu7) qdcVar2.C(I2);
                return new a0d() { // from class: fe1
                    @Override // defpackage.a0d
                    public final eno a() {
                        return new eno(new bv6(yu7.this, (Continuation) null, 26));
                    }
                };
            case 4:
                return oo6.a;
            case 5:
                return new gg1();
            case 6:
                return new lnq();
            case 7:
                return new ja1();
            case 8:
                return new oj1();
            case 9:
                return new lnq();
            case 10:
                return new rc1();
            case 11:
                return new h61();
            case 12:
                f01 f01Var = new f01();
                l18.b.b(hag.I(o8q.class), true);
                return f01Var;
            case 13:
                return new rg1();
            case 14:
                return new of1();
            case 15:
                return new g76();
            case 16:
                return Boolean.valueOf(((i4j) ((byb) l18.b.c(hag.I(byb.class))).b(i4j.class)).h());
            case 17:
                return new q11();
            case 18:
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(e0j.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                return (pl1) ((rci) ((e0j) qdcVar3.C(I3)).c.getValue()).a(ern.a(pl1.class), pl1.b);
            case 19:
                return new gt7(new ci1(17), new pa1(20));
            case 20:
                return new im1();
            case 21:
                return new om1();
            case 22:
                return new qm1();
            case 23:
                return ((g2q) l18.b.c(hag.I(g2q.class))).c;
            case 24:
                return new wjg(0, new xjf(23));
            case 25:
                return szf.g0(null);
            case 26:
                return szf.g0(null);
            case 27:
                l18 l18Var4 = l18.b;
                bdt I4 = hag.I(a6e.class);
                qdc qdcVar4 = l18Var4.a;
                qdcVar4.getClass();
                return a6e.a((a6e) qdcVar4.C(I4));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((fw5) l18.b.c(hag.I(fw5.class))).b();
            default:
                return new wjg(0, new xjf(23));
        }
    }
}
