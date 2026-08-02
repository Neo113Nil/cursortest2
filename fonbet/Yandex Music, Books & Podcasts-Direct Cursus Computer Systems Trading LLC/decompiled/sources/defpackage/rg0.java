package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rg0 {
    public final Context a;
    public final jx7 b;
    public final long c;
    public final o0k d;

    public rg0(Context context, jx7 jx7Var, long j, o0k o0kVar) {
        this.a = context;
        this.b = jx7Var;
        this.c = j;
        this.d = o0kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rg0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        rg0 rg0Var = (rg0) obj;
        return Intrinsics.d(this.a, rg0Var.a) && Intrinsics.d(this.b, rg0Var.b) && d85.c(this.c, rg0Var.c) && Intrinsics.d(this.d, rg0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = d85.o;
        met metVar = net.b;
        return this.d.hashCode() + tlm.c(this.c, hashCode, 31);
    }
}
