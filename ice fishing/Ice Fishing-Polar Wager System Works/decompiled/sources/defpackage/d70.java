package defpackage;

/* loaded from: classes.dex */
public final class d70 extends defpackage.b70 {
    public static final defpackage.d70 EXtogiMhuM = new defpackage.d70(1, 0, 1);

    @Override // defpackage.b70
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.d70)) {
            return false;
        }
        if (isEmpty() && ((defpackage.d70) obj).isEmpty()) {
            return true;
        }
        defpackage.d70 d70Var = (defpackage.d70) obj;
        return this.adDC3e2L == d70Var.adDC3e2L && this.xiZrDbcSW0 == d70Var.xiZrDbcSW0;
    }

    @Override // defpackage.b70
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.adDC3e2L * 31) + this.xiZrDbcSW0;
    }

    @Override // defpackage.b70
    public final boolean isEmpty() {
        return this.adDC3e2L > this.xiZrDbcSW0;
    }

    @Override // defpackage.b70
    public final java.lang.String toString() {
        return this.adDC3e2L + ".." + this.xiZrDbcSW0;
    }
}
