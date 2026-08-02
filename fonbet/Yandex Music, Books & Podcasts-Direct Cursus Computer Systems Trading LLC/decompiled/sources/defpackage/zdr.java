package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class zdr extends o9 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.o9
    public final boolean a(n9 n9Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(ydr.a);
        return true;
    }

    @Override // defpackage.o9
    public final Continuation[] b(n9 n9Var) {
        this.a.set(null);
        return xv.a;
    }
}
