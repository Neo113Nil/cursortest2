package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class db0 extends java.util.concurrent.CancellationException {
    public final transient defpackage.jb0 WDYagTQQm9ns;

    public db0(java.lang.String str, java.lang.Throwable th, defpackage.jb0 jb0Var) {
        super(str);
        this.WDYagTQQm9ns = jb0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.db0)) {
            return false;
        }
        defpackage.db0 db0Var = (defpackage.db0) obj;
        return defpackage.ma0.QiMR8OkAhezm(db0Var.getMessage(), getMessage()) && defpackage.ma0.QiMR8OkAhezm(db0Var.WDYagTQQm9ns, this.WDYagTQQm9ns) && defpackage.ma0.QiMR8OkAhezm(db0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        java.lang.String message = getMessage();
        message.getClass();
        int hashCode = (this.WDYagTQQm9ns.hashCode() + (message.hashCode() * 31)) * 31;
        java.lang.Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return super.toString() + "; job=" + this.WDYagTQQm9ns;
    }
}
