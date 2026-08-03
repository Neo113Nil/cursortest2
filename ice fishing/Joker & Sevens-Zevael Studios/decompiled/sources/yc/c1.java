package yc;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c1 extends CancellationException {

    /* renamed from: g, reason: collision with root package name */
    public final transient k1 f8837g;

    public c1(String str, Throwable th, k1 k1Var) {
        super(str);
        this.f8837g = k1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return pc.j.a(c1Var.getMessage(), getMessage()) && pc.j.a(c1Var.f8837g, this.f8837g) && pc.j.a(c1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        pc.j.b(message);
        int hashCode = (this.f8837g.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f8837g;
    }
}
