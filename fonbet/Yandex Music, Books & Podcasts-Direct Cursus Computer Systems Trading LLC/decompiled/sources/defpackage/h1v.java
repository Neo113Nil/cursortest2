package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h1v {
    public final qo6 a;
    public final String b;

    public h1v(qo6 qo6Var, String str) {
        qo6Var.getClass();
        str.getClass();
        this.a = qo6Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1v)) {
            return false;
        }
        h1v h1vVar = (h1v) obj;
        return this.a == h1vVar.a && Intrinsics.d(this.b, h1vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveScreenCoverUiData(coverType=" + this.a + ", coverUrl=" + this.b + ")";
    }
}
