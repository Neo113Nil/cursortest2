package defpackage;

/* loaded from: classes.dex */
public abstract class sd1 implements defpackage.k31 {
    public boolean AARZUJiTa;
    public final defpackage.mz adDC3e2L;
    public final java.lang.String xiZrDbcSW0;

    public sd1(defpackage.mz mzVar, java.lang.String str) {
        this.adDC3e2L = mzVar;
        this.xiZrDbcSW0 = str;
    }

    public final void oh6vYeIP() {
        if (this.AARZUJiTa) {
            defpackage.a70.SiPhmbmu("statement is closed", 21);
            throw null;
        }
    }

    @Override // defpackage.k31
    public void r1MBDhnF() {
        oh6vYeIP();
    }

    @Override // defpackage.k31
    public void reset() {
        oh6vYeIP();
    }
}
