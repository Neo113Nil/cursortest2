package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class eij extends AtomicReference implements mij, ka8 {
    private static final long serialVersionUID = -3434801548987643227L;
    public final wjj a;

    public eij(wjj wjjVar) {
        this.a = wjjVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        ra8.b(this);
    }

    public final boolean b() {
        return ra8.d((ka8) get());
    }

    public final boolean d(Throwable th) {
        if (b()) {
            return false;
        }
        try {
            this.a.onError(th);
            ra8.b(this);
            return true;
        } catch (Throwable th2) {
            ra8.b(this);
            throw th2;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return k5r.m(eij.class.getSimpleName(), "{", super.toString(), "}");
    }
}
