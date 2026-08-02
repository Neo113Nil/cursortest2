package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class r9 extends wnc implements Runnable {
    public kde h;
    public g3a i;

    @Override // defpackage.v6
    public final void d() {
        kde kdeVar = this.h;
        if ((kdeVar != null) & (this.a instanceof g6)) {
            Object obj = this.a;
            if (obj instanceof g6) {
                boolean z = ((g6) obj).a;
            }
            kdeVar.getClass();
        }
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.v6
    public final String j() {
        String str;
        kde kdeVar = this.h;
        g3a g3aVar = this.i;
        String j = super.j();
        if (kdeVar != null) {
            str = "inputFuture=[" + kdeVar + "], ";
        } else {
            str = "";
        }
        if (g3aVar == null) {
            if (j != null) {
                return str.concat(j);
            }
            return null;
        }
        return str + "function=[" + g3aVar + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        kde kdeVar = this.h;
        g3a g3aVar = this.i;
        if (((this.a instanceof g6) | (kdeVar == null)) || (g3aVar == null)) {
            return;
        }
        this.h = null;
        kdeVar.getClass();
        try {
            Object O = leu.O(kdeVar);
            try {
                g3aVar.apply(O);
                this.i = null;
                l(O);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m(th);
                } finally {
                    this.i = null;
                }
            }
        } catch (Error e) {
            m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            m(e2.getCause());
        } catch (Exception e3) {
            m(e3);
        }
    }
}
