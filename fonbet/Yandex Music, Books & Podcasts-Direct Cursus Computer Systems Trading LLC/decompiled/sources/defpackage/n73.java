package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n73 {
    public final String a;
    public final m73 b;

    public n73(String str, m73 m73Var) {
        str.getClass();
        this.a = str;
        this.b = m73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n73)) {
            return false;
        }
        n73 n73Var = (n73) obj;
        return Intrinsics.d(this.a, n73Var.a) && this.b == n73Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BlockingScreen(anchorId=" + this.a + ", type=" + this.b + ")";
    }
}
