package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class wo3 extends iqh {
    public final /* synthetic */ cn3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xo3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo3(xo3 xo3Var, w920 w920Var, cn3 cn3Var, boolean z) {
        super(w920Var);
        this.w = xo3Var;
        this.b = cn3Var;
        this.c = z;
    }

    @Override // defpackage.iqh, defpackage.w920
    public final boolean e(ngz ngzVar) {
        xo3 xo3Var = this.w;
        yo3 yo3Var = xo3Var.x;
        z83.g(null, yo3Var.a, Looper.myLooper());
        boolean contains = ngzVar.c.contains("user_does_not_exist");
        int i = 25;
        cn3 cn3Var = this.b;
        if (contains) {
            Handler handler = new Handler(Looper.getMainLooper());
            xqi0 xqi0Var = yo3Var.d;
            Objects.requireNonNull(xqi0Var);
            handler.post(new jg(i, xqi0Var));
        } else if (!ho60.b(ngzVar) || this.c) {
            if (ho60.a(ngzVar)) {
                yo3Var.c.b(cn3Var.b());
                yo3Var.e.a(25);
                return true;
            }
            z83.g(null, yo3Var.a, Looper.myLooper());
            if (!xo3Var.b.e(ngzVar)) {
                return false;
            }
            xi3 xi3Var = xo3Var.c;
            if (xi3Var != null) {
                xi3Var.close();
                xo3Var.c = null;
            }
            return true;
        }
        yo3Var.c.b(cn3Var.b());
        return true;
    }

    @Override // defpackage.iqh, defpackage.w920
    public final void g(Object obj) {
        xo3 xo3Var = this.w;
        z83.g(null, xo3Var.x.a, Looper.myLooper());
        xi3 xi3Var = xo3Var.c;
        if (xi3Var != null) {
            xi3Var.close();
            xo3Var.c = null;
        }
        xo3Var.b.g(obj);
    }

    @Override // defpackage.iqh, defpackage.w920
    public final t4j0 i() {
        z83.g(null, this.w.x.a, Looper.myLooper());
        return this.b.a(this.a.i());
    }
}
