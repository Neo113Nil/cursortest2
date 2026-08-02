package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nm8 extends ksw {
    public final String A;
    public final List z;

    public nm8(List list, String str) {
        list.getClass();
        str.getClass();
        this.z = list;
        this.A = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm8)) {
            return false;
        }
        nm8 nm8Var = (nm8) obj;
        return Intrinsics.d(this.z, nm8Var.z) && Intrinsics.d(this.A, nm8Var.A);
    }

    public final int hashCode() {
        return this.A.hashCode() + (this.z.hashCode() * 31);
    }

    public final String toString() {
        return "DivAddNewCard(actions=" + this.z + ", title=" + this.A + ")";
    }
}
