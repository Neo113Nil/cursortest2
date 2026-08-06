package defpackage;

/* loaded from: classes.dex */
public final class ee0 {
    public static final int oh6vYeIP = 66305;
    public final int IHQe1A4L2xu;

    public static java.lang.String IHQe1A4L2xu(int i) {
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
        if (obj instanceof defpackage.ee0) {
            return this.IHQe1A4L2xu == ((defpackage.ee0) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return IHQe1A4L2xu(this.IHQe1A4L2xu);
    }
}
