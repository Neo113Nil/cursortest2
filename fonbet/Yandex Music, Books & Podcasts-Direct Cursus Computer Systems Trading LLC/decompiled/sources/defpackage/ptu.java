package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ptu implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ltu b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ptu(ltu ltuVar, boolean z, boolean z2, int i) {
        this.b = ltuVar;
        this.c = z;
        this.d = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                ltu ltuVar = this.b;
                ivf.r(ild.C(-209873114, new mx2(ltuVar, this.d, 1), hq5Var), saf.e, ild.C(-811608045, new mtu(ltuVar, 1), hq5Var), this.c, null, saf.f, null, hq5Var, 197046, 80);
            default:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                swf.r(this.b, this.c, this.d, (hq5) obj, R);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ptu(boolean z, ltu ltuVar, boolean z2) {
        this.c = z;
        this.b = ltuVar;
        this.d = z2;
    }
}
