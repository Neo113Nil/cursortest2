package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class cfh extends AtomicReference implements ka8, Runnable {
    private static final long serialVersionUID = 2875964065294031672L;
    public final xeh a;

    public cfh(xeh xehVar) {
        this.a = xehVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        ra8.b(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onSuccess(0L);
    }
}
