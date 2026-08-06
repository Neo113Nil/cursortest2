package defpackage;

/* loaded from: classes.dex */
public final class gt {
    public final int IHQe1A4L2xu;

    public static java.lang.String IHQe1A4L2xu(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.gt) {
            return this.IHQe1A4L2xu == ((defpackage.gt) obj).IHQe1A4L2xu;
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
