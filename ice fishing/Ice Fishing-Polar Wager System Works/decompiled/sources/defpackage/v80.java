package defpackage;

/* loaded from: classes.dex */
public final class v80 extends java.util.concurrent.CancellationException {
    public final transient defpackage.c90 adDC3e2L;

    public v80(java.lang.String str, java.lang.Throwable th, defpackage.c90 c90Var) {
        super(str);
        this.adDC3e2L = c90Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.v80)) {
            return false;
        }
        defpackage.v80 v80Var = (defpackage.v80) obj;
        return defpackage.x70.QoRHpC4k(v80Var.getMessage(), getMessage()) && defpackage.x70.QoRHpC4k(v80Var.adDC3e2L, this.adDC3e2L) && defpackage.x70.QoRHpC4k(v80Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        java.lang.String message = getMessage();
        message.getClass();
        int hashCode = (this.adDC3e2L.hashCode() + (message.hashCode() * 31)) * 31;
        java.lang.Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return super.toString() + "; job=" + this.adDC3e2L;
    }
}
