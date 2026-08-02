package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class tij extends AtomicReference implements Runnable, va6 {
    private static final long serialVersionUID = -4552101107598366241L;
    public final vij a;
    public khp b;
    public long c;
    public boolean d;
    public boolean e;

    public tij(vij vijVar) {
        this.a = vijVar;
    }

    @Override // defpackage.va6
    public final void accept(Object obj) {
        ka8 ka8Var = (ka8) obj;
        ra8.e(this, ka8Var);
        synchronized (this.a) {
            try {
                if (this.e) {
                    this.a.a.d(ka8Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this);
    }
}
