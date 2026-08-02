package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t2f extends CancellationException implements dl6 {
    public final transient r2f a;

    public t2f(String str, Throwable th, r2f r2fVar) {
        super(str);
        this.a = r2fVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.dl6
    public final Throwable createCopy() {
        if (!ve7.a()) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        r2f r2fVar = this.a;
        if (r2fVar == null) {
            r2fVar = l8j.c;
        }
        return new t2f(message, this, r2fVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t2f)) {
            return false;
        }
        t2f t2fVar = (t2f) obj;
        if (!Intrinsics.d(t2fVar.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = t2fVar.a;
        if (obj2 == null) {
            obj2 = l8j.c;
        }
        Object obj3 = this.a;
        if (obj3 == null) {
            obj3 = l8j.c;
        }
        return Intrinsics.d(obj2, obj3) && Intrinsics.d(t2fVar.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (ve7.a()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = message.hashCode() * 31;
        Object obj = this.a;
        if (obj == null) {
            obj = l8j.c;
        }
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.a;
        if (obj == null) {
            obj = l8j.c;
        }
        sb.append(obj);
        return sb.toString();
    }
}
