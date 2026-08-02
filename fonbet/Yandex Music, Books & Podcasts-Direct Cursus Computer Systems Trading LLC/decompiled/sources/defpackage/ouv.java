package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ouv implements quv {
    public final String a;
    public final b80 b;

    public ouv(String str, b80 b80Var) {
        str.getClass();
        this.a = str;
        this.b = b80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouv)) {
            return false;
        }
        ouv ouvVar = (ouv) obj;
        return Intrinsics.d(this.a, ouvVar.a) && this.b.equals(ouvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Block(url=" + this.a + ", key=" + this.b + ")";
    }
}
