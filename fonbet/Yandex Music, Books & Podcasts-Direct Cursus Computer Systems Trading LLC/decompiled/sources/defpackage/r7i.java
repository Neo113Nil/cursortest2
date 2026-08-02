package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class r7i implements s7i {
    public final List a;
    public final boolean b;

    public r7i(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7i)) {
            return false;
        }
        r7i r7iVar = (r7i) obj;
        return this.a.equals(r7iVar.a) && this.b == r7iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(data=" + this.a + ", isOldType=" + this.b + ")";
    }
}
