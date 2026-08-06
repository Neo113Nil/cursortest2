package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jn {
    public long ZpBGe2uQfcn8;
    public float giKS3J6vZuNy;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.jn)) {
            return false;
        }
        defpackage.jn jnVar = (defpackage.jn) obj;
        return this.ZpBGe2uQfcn8 == jnVar.ZpBGe2uQfcn8 && java.lang.Float.compare(this.giKS3J6vZuNy, jnVar.giKS3J6vZuNy) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.giKS3J6vZuNy) + (java.lang.Long.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataPointAtTime(time=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", dataPoint=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.giKS3J6vZuNy, ')');
    }
}
