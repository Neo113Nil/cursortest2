package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class jz implements u7 {
    public final String MdtA4re8;
    public final g40 NCTxEWno;
    public final cb0 VgvYg0wo = new cb0(new e7(6, this));
    public final dl wxUZMvaN;

    public jz(g40 g40Var, String str, dl dlVar) {
        this.NCTxEWno = g40Var;
        this.MdtA4re8 = str;
        this.wxUZMvaN = dlVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        cb0 cb0Var = this.VgvYg0wo;
        if (cb0Var.MdtA4re8 != re.jb9XjC4I) {
            ((f40) cb0Var.getValue()).close();
        }
    }

    @Override // defpackage.u7
    public final Object k3x7lurq(boolean z, dl dlVar, h9 h9Var) {
        iz izVar = (iz) h9Var.wxUZMvaN().OnDfzHZD(iz.MdtA4re8);
        hz hzVar = izVar != null ? izVar.NCTxEWno : null;
        if (hzVar != null) {
            return dlVar.Qr9iLBAD(hzVar, h9Var);
        }
        hz hzVar2 = new hz(this.wxUZMvaN, (f40) this.VgvYg0wo.getValue());
        return fn.fVMzMhyS(new iz(hzVar2), new y7(dlVar, hzVar2, null, 2), h9Var);
    }
}
