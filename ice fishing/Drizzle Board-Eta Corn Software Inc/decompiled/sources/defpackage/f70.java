package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class f70 implements kd {
    public final long MdtA4re8;
    public final h70 NCTxEWno;
    public final m3 VgvYg0wo;
    public final Object wxUZMvaN;

    public f70(h70 h70Var, long j, Object obj, m3 m3Var) {
        this.NCTxEWno = h70Var;
        this.MdtA4re8 = j;
        this.wxUZMvaN = obj;
        this.VgvYg0wo = m3Var;
    }

    @Override // defpackage.kd
    public final void qoPGr6Ce() {
        h70 h70Var = this.NCTxEWno;
        synchronized (h70Var) {
            if (this.MdtA4re8 < h70Var.lDXGDhIF()) {
                return;
            }
            Object[] objArr = h70Var.jb9XjC4I;
            objArr.getClass();
            long j = this.MdtA4re8;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            le0.aZz0PFXp(objArr, j, le0.jb9XjC4I);
            h70Var.jb9XjC4I();
        }
    }
}
