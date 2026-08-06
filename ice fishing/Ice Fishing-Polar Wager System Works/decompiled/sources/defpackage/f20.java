package defpackage;

/* loaded from: classes.dex */
public final class f20 implements java.util.Iterator, defpackage.g90 {
    public java.lang.Object AARZUJiTa;
    public final java.lang.Object EXtogiMhuM;
    public final /* synthetic */ int adDC3e2L;
    public int xiZrDbcSW0;

    public f20(defpackage.ql0 ql0Var) {
        this.adDC3e2L = 2;
        this.EXtogiMhuM = ql0Var;
        this.xiZrDbcSW0 = -1;
        this.AARZUJiTa = defpackage.j70.PAEGRtP0bX(new defpackage.pl0(ql0Var, this, null));
    }

    public void IHQe1A4L2xu() {
        java.lang.Object AARZUJiTa;
        int i = this.xiZrDbcSW0;
        defpackage.rv rvVar = (defpackage.rv) this.EXtogiMhuM;
        if (i == -2) {
            AARZUJiTa = ((defpackage.e3) rvVar.oh6vYeIP).xiZrDbcSW0;
        } else {
            defpackage.g00 g00Var = rvVar.r1MBDhnF;
            java.lang.Object obj = this.AARZUJiTa;
            obj.getClass();
            AARZUJiTa = g00Var.AARZUJiTa(obj);
        }
        this.AARZUJiTa = AARZUJiTa;
        this.xiZrDbcSW0 = AARZUJiTa == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.adDC3e2L) {
            case 0:
                if (this.xiZrDbcSW0 < 0) {
                    IHQe1A4L2xu();
                }
                return this.xiZrDbcSW0 == 1;
            case 1:
                return ((defpackage.z71) this.AARZUJiTa).hasNext();
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.z71) this.AARZUJiTa).hasNext();
            default:
                return this.xiZrDbcSW0 < ((java.util.Map) this.EXtogiMhuM).size();
        }
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object obj = null;
        switch (this.adDC3e2L) {
            case 0:
                if (this.xiZrDbcSW0 < 0) {
                    IHQe1A4L2xu();
                }
                if (this.xiZrDbcSW0 == 0) {
                    defpackage.db.DFo87pBq1E5();
                    return null;
                }
                java.lang.Object obj2 = this.AARZUJiTa;
                obj2.getClass();
                this.xiZrDbcSW0 = -1;
                return obj2;
            case 1:
                return ((defpackage.z71) this.AARZUJiTa).next();
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.z71) this.AARZUJiTa).next();
            default:
                if (hasNext()) {
                    obj = this.AARZUJiTa;
                    this.xiZrDbcSW0++;
                    java.lang.Object obj3 = ((java.util.Map) this.EXtogiMhuM).get(obj);
                    if (obj3 == null) {
                        throw new java.util.ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.AARZUJiTa = ((defpackage.re0) obj3).oh6vYeIP;
                } else {
                    defpackage.db.DFo87pBq1E5();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.EXtogiMhuM;
        switch (i) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.xiZrDbcSW0;
                if (i2 != -1) {
                    ((defpackage.jl0) obj).xiZrDbcSW0.EXtogiMhuM(i2);
                    this.xiZrDbcSW0 = -1;
                    return;
                }
                return;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                int i3 = this.xiZrDbcSW0;
                if (i3 != -1) {
                    ((defpackage.ql0) obj).xiZrDbcSW0.DFo87pBq1E5(i3);
                    this.xiZrDbcSW0 = -1;
                    return;
                }
                return;
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f20(defpackage.rv rvVar) {
        this.adDC3e2L = 0;
        this.EXtogiMhuM = rvVar;
        this.xiZrDbcSW0 = -2;
    }

    public f20(java.lang.Object obj, java.util.Map map) {
        this.adDC3e2L = 3;
        this.AARZUJiTa = obj;
        this.EXtogiMhuM = map;
    }

    public f20(defpackage.jl0 jl0Var) {
        this.adDC3e2L = 1;
        this.EXtogiMhuM = jl0Var;
        this.xiZrDbcSW0 = -1;
        this.AARZUJiTa = defpackage.j70.PAEGRtP0bX(new defpackage.il0(jl0Var, this, null));
    }
}
