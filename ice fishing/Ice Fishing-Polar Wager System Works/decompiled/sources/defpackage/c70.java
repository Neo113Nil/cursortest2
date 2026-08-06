package defpackage;

/* loaded from: classes.dex */
public final class c70 extends defpackage.v60 {
    public boolean AARZUJiTa;
    public int EXtogiMhuM;
    public final int adDC3e2L;
    public final int xiZrDbcSW0;

    public c70(int i, int i2, int i3) {
        this.adDC3e2L = i3;
        this.xiZrDbcSW0 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.AARZUJiTa = z;
        this.EXtogiMhuM = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.AARZUJiTa;
    }

    @Override // defpackage.v60
    public final int nextInt() {
        int i = this.EXtogiMhuM;
        if (i != this.xiZrDbcSW0) {
            this.EXtogiMhuM = this.adDC3e2L + i;
            return i;
        }
        if (this.AARZUJiTa) {
            this.AARZUJiTa = false;
            return i;
        }
        defpackage.db.DFo87pBq1E5();
        return 0;
    }
}
