package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class oz5 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ vz5 b;
    public final /* synthetic */ tz5 c;
    public final /* synthetic */ gvd d;
    public final /* synthetic */ rv5 e;
    public final /* synthetic */ yci f;

    public /* synthetic */ oz5(vz5 vz5Var, tz5 tz5Var, gvd gvdVar, rv5 rv5Var, yci yciVar, int i) {
        this.b = vz5Var;
        this.c = tz5Var;
        this.d = gvdVar;
        this.e = rv5Var;
        this.f = yciVar;
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
                ot0.j(this.b, this.c, this.d, this.e, this.f, hq5Var, 0);
            default:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                ot0.j(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ oz5(vz5 vz5Var, tz5 tz5Var, ivd ivdVar, rv5 rv5Var, yci yciVar) {
        this.b = vz5Var;
        this.c = tz5Var;
        this.d = ivdVar;
        this.e = rv5Var;
        this.f = yciVar;
    }
}
