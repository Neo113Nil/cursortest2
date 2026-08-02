package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class q0n extends AtomicBoolean implements ka8 {
    private static final long serialVersionUID = 3562861878281475070L;
    public final wjj a;
    public final r0n b;

    public q0n(wjj wjjVar, r0n r0nVar) {
        this.a = wjjVar;
        this.b = r0nVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        if (compareAndSet(false, true)) {
            this.b.d(this);
        }
    }
}
