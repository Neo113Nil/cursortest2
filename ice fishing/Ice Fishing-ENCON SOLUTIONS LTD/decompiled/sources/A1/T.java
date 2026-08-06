package A1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class T extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient b0 f20a;

    public T(String str, Throwable th, b0 b0Var) {
        super(str);
        this.f20a = b0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof T) {
                T t = (T) obj;
                if (!kotlin.jvm.internal.i.a(t.getMessage(), getMessage()) || !kotlin.jvm.internal.i.a(t.f20a, this.f20a) || !kotlin.jvm.internal.i.a(t.getCause(), getCause())) {
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
        kotlin.jvm.internal.i.b(message);
        int hashCode = (this.f20a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f20a;
    }
}
