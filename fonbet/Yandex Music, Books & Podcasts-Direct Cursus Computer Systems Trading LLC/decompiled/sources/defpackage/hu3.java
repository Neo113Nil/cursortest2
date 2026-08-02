package defpackage;

import androidx.core.os.OperationCanceledException;

/* loaded from: classes.dex */
public final class hu3 {
    public boolean a;
    public gu3 b;
    public boolean c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.c = true;
                gu3 gu3Var = this.b;
                if (gu3Var != null) {
                    try {
                        gu3Var.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(gu3 gu3Var) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.b == gu3Var) {
                return;
            }
            this.b = gu3Var;
            if (this.a && gu3Var != null) {
                gu3Var.onCancel();
            }
        }
    }

    public final void c() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        if (z) {
            throw new OperationCanceledException();
        }
    }
}
