package D;

import L0.C0056n;
import java.util.concurrent.CancellationException;
import t0.C0252g;

/* loaded from: classes.dex */
public final class N extends E0.j implements D0.p {

    /* renamed from: f, reason: collision with root package name */
    public static final N f110f = new N(2);

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        Throwable th = (Throwable) obj2;
        E0.i.e(e0Var, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        e0Var.f181b.K(new C0056n(th, false));
        return C0252g.f2994a;
    }
}
