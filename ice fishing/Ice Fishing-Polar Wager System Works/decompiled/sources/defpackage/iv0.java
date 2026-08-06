package defpackage;

/* loaded from: classes.dex */
public final class iv0 {
    public final boolean IHQe1A4L2xu;
    public final int oh6vYeIP;

    public iv0() {
        this.IHQe1A4L2xu = false;
        this.oh6vYeIP = 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.iv0)) {
            return false;
        }
        defpackage.iv0 iv0Var = (defpackage.iv0) obj;
        return this.IHQe1A4L2xu == iv0Var.IHQe1A4L2xu && this.oh6vYeIP == iv0Var.oh6vYeIP;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.oh6vYeIP) + (java.lang.Boolean.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.IHQe1A4L2xu + ", emojiSupportMatch=" + ((java.lang.Object) defpackage.gt.IHQe1A4L2xu(this.oh6vYeIP)) + ')';
    }

    public iv0(int i, boolean z) {
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = i;
    }
}
