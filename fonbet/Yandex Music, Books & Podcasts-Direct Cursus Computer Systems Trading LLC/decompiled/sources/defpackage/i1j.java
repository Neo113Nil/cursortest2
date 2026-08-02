package defpackage;

import android.net.ConnectivityManager;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class i1j implements q86 {
    public final ConnectivityManager a;

    public i1j(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.q86
    public final boolean a(t4w t4wVar) {
        if (!c(t4wVar)) {
            return false;
        }
        xq0.q("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // defpackage.q86
    public final ss3 b(fa6 fa6Var) {
        fa6Var.getClass();
        return zsd.I(new rlg(fa6Var, this, (Continuation) null, 11));
    }

    @Override // defpackage.q86
    public final boolean c(t4w t4wVar) {
        t4wVar.getClass();
        return t4wVar.j.a() != null;
    }
}
