package defpackage;

import kotlin.Result;

/* loaded from: classes9.dex */
public final class v8z0 {
    public final Result a;
    public final long b;

    public v8z0(Result result, long j) {
        this.a = result;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8z0)) {
            return false;
        }
        v8z0 v8z0Var = (v8z0) obj;
        return this.a.equals(v8z0Var.a) && e3n.d(this.b, v8z0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o430 o430Var = e3n.b;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + ((Object) e3n.p(this.b)) + ')';
    }
}
