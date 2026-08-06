package defpackage;

/* loaded from: classes.dex */
public final class rz implements defpackage.nd1 {
    public final defpackage.fz AARZUJiTa;
    public final defpackage.le1 EXtogiMhuM;
    public final android.content.Context adDC3e2L;
    public boolean riuEU0zW4;
    public final java.lang.String xiZrDbcSW0;

    public rz(android.content.Context context, java.lang.String str, defpackage.fz fzVar) {
        fzVar.getClass();
        this.adDC3e2L = context;
        this.xiZrDbcSW0 = str;
        this.AARZUJiTa = fzVar;
        this.EXtogiMhuM = new defpackage.le1(new defpackage.e3(3, this));
    }

    @Override // defpackage.nd1
    public final defpackage.mz QQUzIjv3iOC5() {
        return ((defpackage.qz) this.EXtogiMhuM.getValue()).oh6vYeIP(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.EXtogiMhuM.xiZrDbcSW0 != defpackage.ad1.riuEU0zW4) {
            ((defpackage.qz) this.EXtogiMhuM.getValue()).close();
        }
    }

    @Override // defpackage.nd1
    public final java.lang.String getDatabaseName() {
        return this.xiZrDbcSW0;
    }

    @Override // defpackage.nd1
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.EXtogiMhuM.xiZrDbcSW0 != defpackage.ad1.riuEU0zW4) {
            ((defpackage.qz) this.EXtogiMhuM.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.riuEU0zW4 = z;
    }
}
