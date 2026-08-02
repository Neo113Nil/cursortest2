package defpackage;

/* loaded from: classes3.dex */
public class piq {
    public boolean a;
    public boolean b;
    public piq c;

    static {
        new oiq().e();
    }

    public boolean c() {
        synchronized (this) {
            try {
                if (this.a) {
                    return false;
                }
                if (this.b) {
                    return true;
                }
                this.b = true;
                piq piqVar = this.c;
                this.c = null;
                if (piqVar != null) {
                    piqVar.c();
                }
                d();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean cancel(boolean z) {
        return c();
    }

    public boolean e() {
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                if (this.a) {
                    return true;
                }
                this.a = true;
                this.c = null;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public piq f(piq piqVar) {
        synchronized (this) {
            try {
                if (!this.a) {
                    this.c = piqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public final boolean isCancelled() {
        boolean z;
        piq piqVar;
        synchronized (this) {
            try {
                z = this.b || ((piqVar = this.c) != null && piqVar.isCancelled());
            } finally {
            }
        }
        return z;
    }

    public final boolean isDone() {
        return this.a;
    }

    public void d() {
    }
}
