package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xq {
    public final defpackage.wq ZpBGe2uQfcn8;

    static {
        new defpackage.xq(0, 0, "");
    }

    public xq(int i, int i2, java.lang.String str) {
        this.ZpBGe2uQfcn8 = new defpackage.wq(i, i2, str);
    }

    public static defpackage.xq ZpBGe2uQfcn8(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        java.lang.String sb;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            sb = "M0," + i8 + " A" + i7 + "," + i8 + " 0 1,1 " + i + "," + i8 + " A" + i7 + "," + i8 + " 0 1,1 0," + i8 + " Z";
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("M ");
            int min = java.lang.Math.min(i / 2, i2 / 2);
            int min2 = java.lang.Math.min(min, i3);
            int min3 = java.lang.Math.min(min, i4);
            int min4 = java.lang.Math.min(min, i5);
            int min5 = java.lang.Math.min(min, i6);
            sb2.append(min2);
            sb2.append(",0 L ");
            sb2.append(i - min3);
            sb2.append(",0");
            if (min3 > 0) {
                sb2.append(" A ");
                sb2.append(min3);
                sb2.append(",");
                sb2.append(min3);
                sb2.append(" 0 0,1 ");
                sb2.append(i);
                sb2.append(",");
                sb2.append(min3);
            }
            sb2.append(" L ");
            sb2.append(i);
            sb2.append(",");
            sb2.append(i2 - min4);
            if (min4 > 0) {
                sb2.append(" A ");
                sb2.append(min4);
                sb2.append(",");
                sb2.append(min4);
                sb2.append(" 0 0,1 ");
                sb2.append(i - min4);
                sb2.append(",");
                sb2.append(i2);
            }
            sb2.append(" L ");
            sb2.append(min5);
            sb2.append(",");
            sb2.append(i2);
            if (min5 > 0) {
                sb2.append(" A ");
                sb2.append(min5);
                sb2.append(",");
                sb2.append(min5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i2 - min5);
            }
            if (min2 > 0) {
                sb2.append(" L 0,");
                sb2.append(min2);
                sb2.append(" A ");
                sb2.append(min2);
                sb2.append(",");
                sb2.append(min2);
                sb2.append(" 0 0,1 ");
                sb2.append(min2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            sb = sb2.toString();
        }
        return new defpackage.xq(i, i2, sb);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xq) {
            return this.ZpBGe2uQfcn8.equals(((defpackage.xq) obj).ZpBGe2uQfcn8);
        }
        return false;
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8.hashCode();
    }

    public final java.lang.String toString() {
        return this.ZpBGe2uQfcn8.toString();
    }
}
