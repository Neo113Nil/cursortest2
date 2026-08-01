package L1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class L extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient T f534a;

    public L(String str, Throwable th, T t2) {
        super(str);
        this.f534a = t2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof L) {
                L l2 = (L) obj;
                if (!D1.i.a(l2.getMessage(), getMessage()) || !D1.i.a(l2.f534a, this.f534a) || !D1.i.a(l2.getCause(), getCause())) {
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
        D1.i.b(message);
        int hashCode = (this.f534a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f534a;
    }
}
