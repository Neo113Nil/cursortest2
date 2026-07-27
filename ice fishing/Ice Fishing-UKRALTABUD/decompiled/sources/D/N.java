package D;

import K0.C0038n;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class N extends E0.j implements D0.p {

    /* renamed from: g, reason: collision with root package name */
    public static final N f110g = new N(2);

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        Throwable th = (Throwable) obj2;
        E0.i.e(e0Var, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        e0Var.f181b.K(new C0038n(th, false));
        return t0.g.f2989a;
    }
}
