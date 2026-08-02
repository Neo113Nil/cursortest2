package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class qj10 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj10 b;

    public /* synthetic */ qj10(rj10 rj10Var, int i) {
        this.a = i;
        this.b = rj10Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        rj10 rj10Var = this.b;
        switch (i) {
            case 0:
                rj10Var.C = ((Boolean) obj).booleanValue();
                rj10Var.Kg();
                break;
            case 1:
                ((Boolean) obj).getClass();
                if (rj10Var.x.c && rj10Var.z.a()) {
                    z = true;
                }
                rj10Var.D = z;
                rj10Var.Kg();
                break;
            case 2:
                ((Boolean) obj).getClass();
                if (rj10Var.x.d && rj10Var.z.c.a.l()) {
                    z = true;
                }
                rj10Var.E = z;
                rj10Var.Kg();
                break;
            default:
                rj10Var.F = ((Boolean) obj).booleanValue();
                rj10Var.Kg();
                break;
        }
        return zy11Var;
    }
}
