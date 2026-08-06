package defpackage;

/* loaded from: classes.dex */
public final class fq {
    public final defpackage.eq IHQe1A4L2xu;

    static {
        new defpackage.fq(0, 0, "");
    }

    public fq(int i, int i2, java.lang.String str) {
        this.IHQe1A4L2xu = new defpackage.eq(i, i2, str);
    }

    public static defpackage.fq IHQe1A4L2xu(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        java.lang.String sb;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("M0,");
            sb2.append(i8);
            sb2.append(" A");
            sb2.append(i7);
            sb2.append(",");
            defpackage.fx0.EgCjBq0SZwJ(sb2, i8, " 0 1,1 ", i, ",");
            defpackage.fx0.EgCjBq0SZwJ(sb2, i8, " A", i7, ",");
            sb2.append(i8);
            sb2.append(" 0 1,1 0,");
            sb2.append(i8);
            sb2.append(" Z");
            sb = sb2.toString();
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("M ");
            int min = java.lang.Math.min(i / 2, i2 / 2);
            int min2 = java.lang.Math.min(min, i3);
            int min3 = java.lang.Math.min(min, i4);
            int min4 = java.lang.Math.min(min, i5);
            int min5 = java.lang.Math.min(min, i6);
            sb3.append(min2);
            sb3.append(",0 L ");
            sb3.append(i - min3);
            sb3.append(",0");
            if (min3 > 0) {
                sb3.append(" A ");
                sb3.append(min3);
                sb3.append(",");
                sb3.append(min3);
                sb3.append(" 0 0,1 ");
                sb3.append(i);
                sb3.append(",");
                sb3.append(min3);
            }
            sb3.append(" L ");
            sb3.append(i);
            sb3.append(",");
            sb3.append(i2 - min4);
            if (min4 > 0) {
                sb3.append(" A ");
                sb3.append(min4);
                sb3.append(",");
                sb3.append(min4);
                sb3.append(" 0 0,1 ");
                sb3.append(i - min4);
                sb3.append(",");
                sb3.append(i2);
            }
            sb3.append(" L ");
            sb3.append(min5);
            sb3.append(",");
            sb3.append(i2);
            if (min5 > 0) {
                sb3.append(" A ");
                sb3.append(min5);
                sb3.append(",");
                sb3.append(min5);
                sb3.append(" 0 0,1 0,");
                sb3.append(i2 - min5);
            }
            if (min2 > 0) {
                sb3.append(" L 0,");
                sb3.append(min2);
                sb3.append(" A ");
                sb3.append(min2);
                sb3.append(",");
                sb3.append(min2);
                sb3.append(" 0 0,1 ");
                sb3.append(min2);
                sb3.append(",0");
            }
            sb3.append(" Z");
            sb = sb3.toString();
        }
        return new defpackage.fq(i, i2, sb);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.fq) {
            return this.IHQe1A4L2xu.equals(((defpackage.fq) obj).IHQe1A4L2xu);
        }
        return false;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }

    public final java.lang.String toString() {
        return this.IHQe1A4L2xu.toString();
    }
}
