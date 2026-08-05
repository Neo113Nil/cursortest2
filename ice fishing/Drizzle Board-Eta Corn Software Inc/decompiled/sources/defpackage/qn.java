package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qn extends CancellationException {
    public final transient vn NCTxEWno;

    public qn(String str, Throwable th, vn vnVar) {
        super(str);
        this.NCTxEWno = vnVar;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qn)) {
            return false;
        }
        qn qnVar = (qn) obj;
        return fn.qoPGr6Ce(qnVar.getMessage(), getMessage()) && fn.qoPGr6Ce(qnVar.NCTxEWno, this.NCTxEWno) && fn.qoPGr6Ce(qnVar.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = (this.NCTxEWno.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.NCTxEWno;
    }
}
