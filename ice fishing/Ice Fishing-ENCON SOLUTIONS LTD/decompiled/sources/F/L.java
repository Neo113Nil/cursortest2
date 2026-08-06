package F;

import A1.C0013n;
import h1.C0239i;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class L extends kotlin.jvm.internal.j implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public static final L f397e = new L(2);

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        c0 msg = (c0) obj;
        Throwable th = (Throwable) obj2;
        kotlin.jvm.internal.i.e(msg, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        msg.f463b.J(new C0013n(th, false));
        return C0239i.f3393a;
    }
}
