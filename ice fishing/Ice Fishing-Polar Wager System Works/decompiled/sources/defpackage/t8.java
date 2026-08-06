package defpackage;

/* loaded from: classes.dex */
public final class t8 {
    public final int F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final int r1MBDhnF;

    static {
        new defpackage.t8(0, 0, 0, 0);
    }

    public t8(int i, int i2, int i3, int i4) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        this.r1MBDhnF = i3;
        this.F7NU4MC0GW = i4;
        if (i > i3) {
            defpackage.db.adDC3e2L(defpackage.fx0.EXtogiMhuM(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        defpackage.db.adDC3e2L(defpackage.fx0.EXtogiMhuM(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.t8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        defpackage.t8 t8Var = (defpackage.t8) obj;
        return this.IHQe1A4L2xu == t8Var.IHQe1A4L2xu && this.oh6vYeIP == t8Var.oh6vYeIP && this.r1MBDhnF == t8Var.r1MBDhnF && this.F7NU4MC0GW == t8Var.F7NU4MC0GW;
    }

    public final int hashCode() {
        return (((((this.IHQe1A4L2xu * 31) + this.oh6vYeIP) * 31) + this.r1MBDhnF) * 31) + this.F7NU4MC0GW;
    }

    public final java.lang.String toString() {
        return defpackage.t8.class.getSimpleName() + " { [" + this.IHQe1A4L2xu + ',' + this.oh6vYeIP + ',' + this.r1MBDhnF + ',' + this.F7NU4MC0GW + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t8(android.graphics.Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
