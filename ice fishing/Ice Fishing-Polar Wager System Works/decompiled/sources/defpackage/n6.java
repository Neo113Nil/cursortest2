package defpackage;

/* loaded from: classes.dex */
public final class n6 implements java.util.Iterator, defpackage.g90 {
    public boolean AARZUJiTa;
    public final /* synthetic */ int EXtogiMhuM;
    public int adDC3e2L;
    public final /* synthetic */ java.lang.Object riuEU0zW4;
    public int xiZrDbcSW0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n6(defpackage.r6 r6Var, int i) {
        this(r6Var.AARZUJiTa);
        this.EXtogiMhuM = i;
        switch (i) {
            case 1:
                this.riuEU0zW4 = r6Var;
                this(r6Var.AARZUJiTa);
                break;
            default:
                this.riuEU0zW4 = r6Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.xiZrDbcSW0 < this.adDC3e2L;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object adDC3e2L;
        if (!hasNext()) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        int i = this.xiZrDbcSW0;
        int i2 = this.EXtogiMhuM;
        java.lang.Object obj = this.riuEU0zW4;
        switch (i2) {
            case 0:
                adDC3e2L = ((defpackage.r6) obj).adDC3e2L(i);
                break;
            case 1:
                adDC3e2L = ((defpackage.r6) obj).EXtogiMhuM(i);
                break;
            default:
                adDC3e2L = ((defpackage.s6) obj).xiZrDbcSW0[i];
                break;
        }
        this.xiZrDbcSW0++;
        this.AARZUJiTa = true;
        return adDC3e2L;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.AARZUJiTa) {
            defpackage.db.AARZUJiTa("Call next() before removing an element.");
            return;
        }
        int i = this.xiZrDbcSW0 - 1;
        this.xiZrDbcSW0 = i;
        int i2 = this.EXtogiMhuM;
        java.lang.Object obj = this.riuEU0zW4;
        switch (i2) {
            case 0:
                ((defpackage.r6) obj).xiZrDbcSW0(i);
                break;
            case 1:
                ((defpackage.r6) obj).xiZrDbcSW0(i);
                break;
            default:
                ((defpackage.s6) obj).IHQe1A4L2xu(i);
                break;
        }
        this.adDC3e2L--;
        this.AARZUJiTa = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n6(defpackage.s6 s6Var) {
        this(s6Var.AARZUJiTa);
        this.EXtogiMhuM = 2;
        this.riuEU0zW4 = s6Var;
    }

    public n6(int i) {
        this.adDC3e2L = i;
    }
}
