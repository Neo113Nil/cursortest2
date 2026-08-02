package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cvm extends fvm {
    public final int a;
    public final Integer b;

    public cvm(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvm)) {
            return false;
        }
        cvm cvmVar = (cvm) obj;
        return this.a == cvmVar.a && Intrinsics.d(this.b, cvmVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Failure(text=" + this.a + ", subtitle=" + this.b + ")";
    }
}
