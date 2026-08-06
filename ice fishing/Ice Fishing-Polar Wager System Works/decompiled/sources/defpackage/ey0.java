package defpackage;

/* loaded from: classes.dex */
public final class ey0 {
    public static final defpackage.ey0 r1MBDhnF = new defpackage.ey0(0.0f, new defpackage.jd(0.0f));
    public final float IHQe1A4L2xu;
    public final defpackage.jd oh6vYeIP;

    public ey0(float f, defpackage.jd jdVar) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = jdVar;
        if (java.lang.Float.isNaN(f)) {
            defpackage.db.fnWB2E7cs("current must not be NaN");
            throw null;
        }
    }

    public final defpackage.jd IHQe1A4L2xu() {
        return this.oh6vYeIP;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ey0)) {
            return false;
        }
        defpackage.ey0 ey0Var = (defpackage.ey0) obj;
        return this.IHQe1A4L2xu == ey0Var.IHQe1A4L2xu && this.oh6vYeIP.equals(ey0Var.oh6vYeIP);
    }

    public final int hashCode() {
        return (this.oh6vYeIP.hashCode() + (java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31)) * 31;
    }

    public final java.lang.String toString() {
        return "ProgressBarRangeInfo(current=" + this.IHQe1A4L2xu + ", range=" + this.oh6vYeIP + ", steps=0)";
    }
}
