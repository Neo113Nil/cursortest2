package S7;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class Z extends CancellationException {

    /* renamed from: n, reason: collision with root package name */
    public final transient h0 f3024n;

    public Z(String str, Throwable th, h0 h0Var) {
        super(str);
        this.f3024n = h0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z6 = (Z) obj;
        return kotlin.jvm.internal.h.a(z6.getMessage(), getMessage()) && kotlin.jvm.internal.h.a(z6.f3024n, this.f3024n) && kotlin.jvm.internal.h.a(z6.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.h.b(message);
        int hashCode = (this.f3024n.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f3024n;
    }
}
