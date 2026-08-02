package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w2a extends cxb {
    public final kb6 t;

    public w2a(kb6 kb6Var) {
        this.t = kb6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w2a) {
            return Intrinsics.d(this.t, ((w2a) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    public final String toString() {
        return "UpdateContent(content=" + this.t + ")";
    }
}
