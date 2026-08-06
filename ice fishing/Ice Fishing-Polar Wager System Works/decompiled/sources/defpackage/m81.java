package defpackage;

/* loaded from: classes.dex */
public final class m81 implements defpackage.p81 {
    public final boolean IHQe1A4L2xu;

    public m81(boolean z) {
        this.IHQe1A4L2xu = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.m81) && this.IHQe1A4L2xu == ((defpackage.m81) obj).IHQe1A4L2xu;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return "SetSound(enabled=" + this.IHQe1A4L2xu + ")";
    }
}
