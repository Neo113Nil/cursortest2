package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hqd {
    public final iqd a;
    public final int b;
    public final mx0 c;
    public final q0k d;

    public hqd(iqd iqdVar, int i, mx0 mx0Var, q0k q0kVar) {
        mx0Var.getClass();
        this.a = iqdVar;
        this.b = i;
        this.c = mx0Var;
        this.d = q0kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqd)) {
            return false;
        }
        hqd hqdVar = (hqd) obj;
        return this.a.equals(hqdVar.a) && this.b == hqdVar.b && Intrinsics.d(this.c, hqdVar.c) && this.d.equals(hqdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + f1d.a(this.b, this.a.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "GridRow(data=" + this.a + ", cellColumns=" + this.b + ", horizontalArrangement=" + this.c + ", rowPaddingValues=" + this.d + ")";
    }
}
