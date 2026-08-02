package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class ge4 extends de4 implements hq4 {

    @NotNull
    public static final fe4 e = new fe4(null);

    static {
        new ge4((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ge4)) {
            return false;
        }
        if (isEmpty() && ((ge4) obj).isEmpty()) {
            return true;
        }
        ge4 ge4Var = (ge4) obj;
        return this.a == ge4Var.a && this.b == ge4Var.b;
    }

    @Override // defpackage.hq4
    public final Comparable g() {
        return Character.valueOf(this.a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.hq4
    public final boolean isEmpty() {
        return Intrinsics.e(this.a, this.b) > 0;
    }

    @Override // defpackage.hq4
    public final Comparable m() {
        return Character.valueOf(this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
