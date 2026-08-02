package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class fu1 extends AtomicReference {
    private static final long serialVersionUID = 3949248817947090603L;

    public final boolean a(Throwable th) {
        znb znbVar = aob.a;
        while (true) {
            Throwable th2 = (Throwable) get();
            if (th2 == aob.a) {
                return false;
            }
            Throwable ar5Var = th2 == null ? th : new ar5(th2, th);
            while (!compareAndSet(th2, ar5Var)) {
                if (get() != th2) {
                    break;
                }
            }
            return true;
        }
    }

    public final Throwable b() {
        znb znbVar = aob.a;
        Throwable th = (Throwable) get();
        znb znbVar2 = aob.a;
        return th != znbVar2 ? (Throwable) getAndSet(znbVar2) : th;
    }
}
