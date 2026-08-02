package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v9n {
    public final boolean a;
    public final boolean b;
    public final y3l c;
    public final Function0 d;
    public final Function1 e;

    public v9n(boolean z, boolean z2, y3l y3lVar, Function0 function0, Function1 function1) {
        y3lVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = y3lVar;
        this.d = function0;
        this.e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9n)) {
            return false;
        }
        v9n v9nVar = (v9n) obj;
        return this.a == v9nVar.a && this.b == v9nVar.b && Intrinsics.d(this.c, v9nVar.c) && Intrinsics.d(this.d, v9nVar.d) && Intrinsics.d(this.e, v9nVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31;
        Function0 function0 = this.d;
        int hashCode2 = (hashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1 function1 = this.e;
        return hashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder j = eta.j("Request(playWhenReady=", this.a, ", continuation=", this.b, ", queueStartValidator=");
        j.append(this.c);
        j.append(", onSuccess=");
        j.append(this.d);
        j.append(", onError=");
        j.append(this.e);
        j.append(")");
        return j.toString();
    }
}
