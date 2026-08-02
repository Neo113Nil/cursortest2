package defpackage;

import com.yandex.go.scooters.misc.api.support.ScootersSupportEntryPoint;

/* loaded from: classes6.dex */
public final class t8n0 implements ujn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zuo0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t8n0(Object obj, zuo0 zuo0Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = zuo0Var;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.ujn0
    public final void k() {
        int i = this.a;
        zuo0 zuo0Var = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                fl5 fl5Var = (fl5) obj;
                fl5Var.A((m950) ((yvf0) fl5Var.G).get(), new r2p0(new t2p0(zuo0Var.getSessionId(), zuo0Var.j(), zuo0Var.m(), zuo0Var.getNumber().a, zuo0Var instanceof ea90 ? "reservation" : f4b1.c(zuo0Var)), ScootersSupportEntryPoint.COMPLETION_ACCEPTANCE), sy60.Q2);
                break;
            default:
                ((fgn0) obj).a(zuo0Var);
                break;
        }
    }
}
