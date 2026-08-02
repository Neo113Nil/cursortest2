package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tm4 {
    public final String a;
    public final Collection b;

    public tm4(String str, Collection collection) {
        collection.getClass();
        this.a = str;
        this.b = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm4)) {
            return false;
        }
        tm4 tm4Var = (tm4) obj;
        return this.a.equals(tm4Var.a) && Intrinsics.d(this.b, tm4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Clause(selection=" + this.a + ", args=" + this.b + ")";
    }
}
