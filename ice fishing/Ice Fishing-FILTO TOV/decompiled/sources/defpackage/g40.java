package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g40 extends CancellationException {
    public final transient m40 OOA6hdeuvCS;

    public g40(String str, Throwable th, m40 m40Var) {
        super(str);
        this.OOA6hdeuvCS = m40Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g40)) {
            return false;
        }
        g40 g40Var = (g40) obj;
        return o30.rQPn8YBR(g40Var.getMessage(), getMessage()) && o30.rQPn8YBR(g40Var.OOA6hdeuvCS, this.OOA6hdeuvCS) && o30.rQPn8YBR(g40Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = (this.OOA6hdeuvCS.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.OOA6hdeuvCS;
    }
}
