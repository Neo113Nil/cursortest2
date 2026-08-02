package defpackage;

import com.yandex.messaging.auth.AuthEnvironment;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class yfy extends yk3 {
    public final /* synthetic */ int c = 0;
    public final Object w;

    public yfy(xqi0 xqi0Var, sk7 sk7Var) {
        super(xqi0Var, sk7Var);
        this.w = sk7Var;
    }

    @Override // defpackage.yk3
    public wl3 c() {
        switch (this.c) {
            case 1:
                return (wl3) this.w;
            default:
                return super.c();
        }
    }

    @Override // defpackage.yk3, defpackage.x08
    public void cancel() {
        switch (this.c) {
            case 1:
                tje.e();
                wfz.z.cancel();
                break;
        }
    }

    @Override // defpackage.yk3
    public boolean d() {
        switch (this.c) {
            case 1:
                return true;
            default:
                return super.d();
        }
    }

    @Override // defpackage.yk3
    public final void e(wl3 wl3Var) {
        int i = this.c;
        xqi0 xqi0Var = this.b;
        Object obj = this.w;
        switch (i) {
            case 0:
                if (wl3Var != null) {
                    if (!((rcy0) xqi0Var.k.get()).w) {
                        if (wl3Var.a != AuthEnvironment.TeamProduction) {
                            xqi0Var.a(this, new vb21(xqi0Var, (sk7) obj, wl3Var));
                            break;
                        } else {
                            xqi0Var.h(wl3Var, this);
                            break;
                        }
                    } else {
                        xqi0Var.h(wl3Var, this);
                        break;
                    }
                }
                break;
            default:
                if (!Objects.equals((wl3) obj, wl3Var)) {
                    xqi0Var.h(wl3Var, this);
                    break;
                }
                break;
        }
    }

    public yfy(xqi0 xqi0Var, sk7 sk7Var, wl3 wl3Var) {
        super(xqi0Var, sk7Var);
        this.w = wl3Var;
    }
}
