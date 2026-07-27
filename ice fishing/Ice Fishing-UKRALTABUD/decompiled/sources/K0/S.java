package K0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class S extends CancellationException {

    /* renamed from: f, reason: collision with root package name */
    public final transient a0 f481f;

    public S(String str, Throwable th, a0 a0Var) {
        super(str);
        this.f481f = a0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof S) {
                S s2 = (S) obj;
                if (!E0.i.a(s2.getMessage(), getMessage()) || !E0.i.a(s2.f481f, this.f481f) || !E0.i.a(s2.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        E0.i.b(message);
        int hashCode = (this.f481f.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f481f;
    }
}
