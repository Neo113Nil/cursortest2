package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vyo implements xyo {
    public final Exception a;
    public final String b;

    public vyo(String str, Exception exc) {
        exc.getClass();
        this.a = exc;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyo)) {
            return false;
        }
        vyo vyoVar = (vyo) obj;
        return Intrinsics.d(this.a, vyoVar.a) && Intrinsics.d(this.b, vyoVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Failure(exception=" + this.a + ", message=" + this.b + ")";
    }
}
