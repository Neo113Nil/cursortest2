package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gd4 {
    public static final fd4 b = new fd4();
    public final Object a;

    public static final Throwable a(Object obj) {
        ed4 ed4Var = obj instanceof ed4 ? (ed4) obj : null;
        if (ed4Var != null) {
            return ed4Var.a;
        }
        return null;
    }

    public static final Object b(Object obj) {
        if (obj instanceof fd4) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gd4) {
            return Intrinsics.d(this.a, ((gd4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof ed4) {
            return ((ed4) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
