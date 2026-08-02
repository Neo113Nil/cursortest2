package defpackage;

import android.app.Dialog;
import java.util.List;

/* loaded from: classes7.dex */
public final class vl61 implements f391 {
    public final a40 a;
    public final m671 b;
    public final fp61 c;
    public final List d;
    public f071 e;

    public vl61(a40 a40Var, m671 m671Var) {
        fp61 fp61Var = new fp61();
        this.a = a40Var;
        this.b = m671Var;
        this.c = fp61Var;
        this.d = scc.g(new p371(new ph61(this, 0), "adtuneRendered"), new p371(new ph61(this, 1), "adtuneClosed"), new p371(new ph61(this, 2), "openOptOut"));
    }

    public final void a() {
        f071 f071Var = this.e;
        if (f071Var != null) {
            fp71 fp71Var = ((aj71) f071Var).a;
            d391 d391Var = ((st81) fp71Var.c).a;
            d391Var.a.post(new c391(d391Var, 0));
            nga1.c((Dialog) fp71Var.a);
        }
    }

    @Override // defpackage.f391
    public final void onReceivedError(int i) {
        for (int i2 : this.c.a) {
            if (i == i2) {
                a();
                return;
            }
        }
    }
}
