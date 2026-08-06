package defpackage;

/* loaded from: classes.dex */
public final class bv implements java.util.Map.Entry, defpackage.g90 {
    public defpackage.bv AARZUJiTa;
    public defpackage.bv EXtogiMhuM;
    public final java.lang.Object adDC3e2L;
    public boolean riuEU0zW4;
    public final defpackage.wd0 xiZrDbcSW0;

    public bv(defpackage.td0 td0Var, defpackage.wd0 wd0Var) {
        this.adDC3e2L = td0Var;
        this.xiZrDbcSW0 = wd0Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bv) {
            defpackage.bv bvVar = (defpackage.bv) obj;
            return defpackage.x70.QoRHpC4k(this.adDC3e2L, bvVar.adDC3e2L) && this.xiZrDbcSW0 == bvVar.xiZrDbcSW0;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.adDC3e2L;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.xiZrDbcSW0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object obj = this.adDC3e2L;
        return this.xiZrDbcSW0.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final java.lang.String toString() {
        return "Entry(key=" + this.adDC3e2L + ", value=" + this.xiZrDbcSW0 + ")";
    }
}
