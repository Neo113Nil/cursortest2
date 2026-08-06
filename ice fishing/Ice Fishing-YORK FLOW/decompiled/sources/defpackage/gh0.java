package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gh0 {
    public static final int giKS3J6vZuNy = 66305;
    public final int ZpBGe2uQfcn8;

    public static java.lang.String ZpBGe2uQfcn8(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineBreak(strategy=");
        int i2 = i & 255;
        java.lang.String str = "Invalid";
        sb.append((java.lang.Object) (i2 == 1 ? "Strategy.Simple" : i2 == 2 ? "Strategy.HighQuality" : i2 == 3 ? "Strategy.Balanced" : i2 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i3 = (i >> 8) & 255;
        sb.append((java.lang.Object) (i3 == 1 ? "Strictness.None" : i3 == 2 ? "Strictness.Loose" : i3 == 3 ? "Strictness.Normal" : i3 == 4 ? "Strictness.Strict" : i3 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str = "WordBreak.None";
        } else if (i4 == 2) {
            str = "WordBreak.Phrase";
        } else if (i4 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((java.lang.Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.gh0) {
            return this.ZpBGe2uQfcn8 == ((defpackage.gh0) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return ZpBGe2uQfcn8(this.ZpBGe2uQfcn8);
    }
}
