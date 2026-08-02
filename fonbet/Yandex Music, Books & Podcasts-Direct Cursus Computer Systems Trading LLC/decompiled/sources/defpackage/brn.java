package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class brn extends AtomicReference implements ka8 {
    private static final long serialVersionUID = 6537757548749041217L;

    @Override // defpackage.ka8
    public final void a() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        ((Runnable) andSet).run();
    }

    public final boolean b() {
        return get() == null;
    }
}
