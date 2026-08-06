package defpackage;

/* loaded from: classes.dex */
public final class p6 implements java.util.Iterator, java.util.Map.Entry {
    public boolean AARZUJiTa;
    public final /* synthetic */ defpackage.r6 EXtogiMhuM;
    public int adDC3e2L;
    public int xiZrDbcSW0 = -1;

    public p6(defpackage.r6 r6Var) {
        this.EXtogiMhuM = r6Var;
        this.adDC3e2L = r6Var.AARZUJiTa - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!this.AARZUJiTa) {
            defpackage.db.AARZUJiTa("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            int i = this.xiZrDbcSW0;
            defpackage.r6 r6Var = this.EXtogiMhuM;
            if (defpackage.x70.QoRHpC4k(key, r6Var.adDC3e2L(i)) && defpackage.x70.QoRHpC4k(entry.getValue(), r6Var.EXtogiMhuM(this.xiZrDbcSW0))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        if (this.AARZUJiTa) {
            return this.EXtogiMhuM.adDC3e2L(this.xiZrDbcSW0);
        }
        defpackage.db.AARZUJiTa("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.AARZUJiTa) {
            return this.EXtogiMhuM.EXtogiMhuM(this.xiZrDbcSW0);
        }
        defpackage.db.AARZUJiTa("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.xiZrDbcSW0 < this.adDC3e2L;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.AARZUJiTa) {
            defpackage.db.AARZUJiTa("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.xiZrDbcSW0;
        defpackage.r6 r6Var = this.EXtogiMhuM;
        java.lang.Object adDC3e2L = r6Var.adDC3e2L(i);
        java.lang.Object EXtogiMhuM = r6Var.EXtogiMhuM(this.xiZrDbcSW0);
        return (adDC3e2L == null ? 0 : adDC3e2L.hashCode()) ^ (EXtogiMhuM != null ? EXtogiMhuM.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        this.xiZrDbcSW0++;
        this.AARZUJiTa = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.AARZUJiTa) {
            throw new java.lang.IllegalStateException();
        }
        this.EXtogiMhuM.xiZrDbcSW0(this.xiZrDbcSW0);
        this.xiZrDbcSW0--;
        this.adDC3e2L--;
        this.AARZUJiTa = false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (this.AARZUJiTa) {
            return this.EXtogiMhuM.AARZUJiTa(this.xiZrDbcSW0, obj);
        }
        defpackage.db.AARZUJiTa("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final java.lang.String toString() {
        return getKey() + "=" + getValue();
    }
}
