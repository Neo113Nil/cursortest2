package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nw6 {
    public final String a;
    public final Function0 b;

    public nw6(String str, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw6)) {
            return false;
        }
        nw6 nw6Var = (nw6) obj;
        return Intrinsics.d(this.a, nw6Var.a) && this.b == nw6Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
