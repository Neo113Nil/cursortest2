package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class xbr {
    public final boolean a;
    public final nb7 b;

    public xbr(nb7 nb7Var, boolean z) {
        nb7Var.getClass();
        this.a = z;
        this.b = nb7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbr)) {
            return false;
        }
        xbr xbrVar = (xbr) obj;
        return this.a == xbrVar.a && Intrinsics.d(this.b, xbrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PendingTransfer(isNetwork=" + this.a + ", dataSpec=" + this.b + ')';
    }
}
