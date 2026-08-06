package defpackage;

/* loaded from: classes.dex */
public final class dq {
    public final android.view.DisplayCutout IHQe1A4L2xu;

    public dq(android.view.DisplayCutout displayCutout) {
        this.IHQe1A4L2xu = displayCutout;
    }

    public final defpackage.i60 IHQe1A4L2xu() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? defpackage.i60.r1MBDhnF(defpackage.OtkytngK3Mr.r1MBDhnF(this.IHQe1A4L2xu)) : defpackage.i60.adDC3e2L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.dq.class != obj.getClass()) {
            return false;
        }
        return this.IHQe1A4L2xu.equals(((defpackage.dq) obj).IHQe1A4L2xu);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.IHQe1A4L2xu.hashCode();
        return hashCode;
    }

    public final java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.IHQe1A4L2xu + "}";
    }
}
