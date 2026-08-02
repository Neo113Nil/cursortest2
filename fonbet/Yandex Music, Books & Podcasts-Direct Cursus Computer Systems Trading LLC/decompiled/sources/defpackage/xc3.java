package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xc3 {
    public yg0 a = null;
    public ud0 b = null;
    public ou3 c = null;
    public nh0 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc3)) {
            return false;
        }
        xc3 xc3Var = (xc3) obj;
        return Intrinsics.d(this.a, xc3Var.a) && Intrinsics.d(this.b, xc3Var.b) && Intrinsics.d(this.c, xc3Var.c) && Intrinsics.d(this.d, xc3Var.d);
    }

    public final int hashCode() {
        yg0 yg0Var = this.a;
        int hashCode = (yg0Var == null ? 0 : yg0Var.hashCode()) * 31;
        ud0 ud0Var = this.b;
        int hashCode2 = (hashCode + (ud0Var == null ? 0 : ud0Var.hashCode())) * 31;
        ou3 ou3Var = this.c;
        int hashCode3 = (hashCode2 + (ou3Var == null ? 0 : ou3Var.hashCode())) * 31;
        nh0 nh0Var = this.d;
        return hashCode3 + (nh0Var != null ? nh0Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
