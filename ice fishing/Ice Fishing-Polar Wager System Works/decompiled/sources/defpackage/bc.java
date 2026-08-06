package defpackage;

/* loaded from: classes.dex */
public final class bc extends defpackage.cc {
    public final java.lang.Throwable IHQe1A4L2xu;

    public bc(java.lang.Throwable th) {
        this.IHQe1A4L2xu = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.bc) {
            return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, ((defpackage.bc) obj).IHQe1A4L2xu);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Throwable th = this.IHQe1A4L2xu;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.cc
    public final java.lang.String toString() {
        return "Closed(" + this.IHQe1A4L2xu + ')';
    }
}
