package com.gamericefishpro.space.pi;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends CancellationException {
    public final transient l1 d;

    public e1(String str, Throwable th, l1 l1Var) {
        super(str);
        this.d = l1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (!Intrinsics.a(e1Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = e1Var.d;
        if (obj2 == null) {
            obj2 = o1.e;
        }
        Object obj3 = this.d;
        if (obj3 == null) {
            obj3 = o1.e;
        }
        return Intrinsics.a(obj2, obj3) && Intrinsics.a(e1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        Intrinsics.b(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.d;
        if (obj == null) {
            obj = o1.e;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.d;
        if (obj == null) {
            obj = o1.e;
        }
        sb.append(obj);
        return sb.toString();
    }
}
