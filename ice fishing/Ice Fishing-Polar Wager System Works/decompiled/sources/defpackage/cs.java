package defpackage;

/* loaded from: classes.dex */
public final class cs implements defpackage.kl1 {
    public final defpackage.qt0 IHQe1A4L2xu;

    public cs(defpackage.qt0 qt0Var) {
        this.IHQe1A4L2xu = qt0Var;
    }

    @Override // defpackage.kl1
    public final java.lang.Object IHQe1A4L2xu(defpackage.gu0 gu0Var) {
        return this.IHQe1A4L2xu.getValue();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cs) && this.IHQe1A4L2xu == ((defpackage.cs) obj).IHQe1A4L2xu;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }

    public final java.lang.String toString() {
        return "DynamicValueHolder(state=" + this.IHQe1A4L2xu + ')';
    }
}
