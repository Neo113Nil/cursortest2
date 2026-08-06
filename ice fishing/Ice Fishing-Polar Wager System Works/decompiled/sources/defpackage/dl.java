package defpackage;

/* loaded from: classes.dex */
public final class dl {
    public long IHQe1A4L2xu;
    public float oh6vYeIP;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dl)) {
            return false;
        }
        defpackage.dl dlVar = (defpackage.dl) obj;
        return this.IHQe1A4L2xu == dlVar.IHQe1A4L2xu && java.lang.Float.compare(this.oh6vYeIP, dlVar.oh6vYeIP) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh6vYeIP) + (java.lang.Long.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        return "DataPointAtTime(time=" + this.IHQe1A4L2xu + ", dataPoint=" + this.oh6vYeIP + ')';
    }
}
