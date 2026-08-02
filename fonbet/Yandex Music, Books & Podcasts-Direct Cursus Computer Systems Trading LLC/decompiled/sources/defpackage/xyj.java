package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class xyj implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xyj(float f, yci yciVar, boolean z, float f2, vyj vyjVar, int i) {
        this.b = f;
        this.e = yciVar;
        this.d = z;
        this.c = f2;
        this.f = vyjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                wdg.b(this.b, (yci) this.e, this.d, this.c, (vyj) this.f, (hq5) obj, rvf.R(3073));
                break;
            default:
                Integer num = (Integer) this.e;
                plv plvVar = (plv) this.f;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    if (num == null) {
                        oq5Var.Z(1673801934);
                    } else {
                        oq5Var.Z(1673801935);
                        int intValue2 = num.intValue();
                        float f = this.b;
                        float f2 = this.c;
                        float f3 = f + f2;
                        p1g.v(intValue2, ngg.A(o5g.I(new yov(new n38(f3)), f3), 0.0f, f2, 0.0f, 11), plvVar, this.d, oq5Var, 0, 0);
                    }
                    oq5Var.p(false);
                } else {
                    oq5Var.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xyj(Integer num, float f, float f2, plv plvVar, boolean z) {
        this.e = num;
        this.b = f;
        this.c = f2;
        this.f = plvVar;
        this.d = z;
    }
}
