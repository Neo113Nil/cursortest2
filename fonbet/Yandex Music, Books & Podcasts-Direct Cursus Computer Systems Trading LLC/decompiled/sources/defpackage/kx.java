package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class kx implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ yci c;

    public /* synthetic */ kx(Function0 function0, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = function0;
        this.c = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fgq.d(this.b, this.c, hq5Var, rvf.R(49));
                break;
            case 1:
                fgq.e(this.b, this.c, hq5Var, rvf.R(49));
                break;
            case 2:
                hld.f(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 3:
                sj2.e(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 4:
                sj2.f(this.b, this.c, hq5Var, rvf.R(55));
                break;
            case 5:
                cxb.e(this.b, this.c, hq5Var, rvf.R(49));
                break;
            case 6:
                bcx.g(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 7:
                cxb.g(this.b, this.c, hq5Var, rvf.R(49));
                break;
            case 8:
                zc4.i(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 9:
                gld.n(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 10:
                v5g.b(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 11:
                gdg.d(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 12:
                wdg.h(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 13:
                v7g.a(this.b, this.c, hq5Var, rvf.R(49));
                break;
            case 14:
                u7g.v(this.b, this.c, hq5Var, rvf.R(1));
                break;
            case 15:
                hdg.E(this.b, this.c, hq5Var, rvf.R(7));
                break;
            default:
                wdg.x(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
