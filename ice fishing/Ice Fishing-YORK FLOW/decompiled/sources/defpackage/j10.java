package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class j10 implements defpackage.yh1 {
    public final defpackage.ti1 P05cfTpS5W5L;
    public final defpackage.wg QiMR8OkAhezm;
    public final android.content.Context WDYagTQQm9ns;
    public boolean e6mdH7fiFuta;
    public final java.lang.String oh71FJcDz6S2;

    public j10(android.content.Context context, java.lang.String str, defpackage.wg wgVar) {
        wgVar.getClass();
        this.WDYagTQQm9ns = context;
        this.oh71FJcDz6S2 = str;
        this.QiMR8OkAhezm = wgVar;
        this.P05cfTpS5W5L = new defpackage.ti1(new defpackage.l3(11, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.P05cfTpS5W5L.oh71FJcDz6S2 != defpackage.pa1.WmetiUbpKU9I) {
            ((defpackage.i10) this.P05cfTpS5W5L.getValue()).close();
        }
    }

    @Override // defpackage.yh1
    public final defpackage.e10 dG7RjM6DqYVL() {
        return ((defpackage.i10) this.P05cfTpS5W5L.getValue()).giKS3J6vZuNy(true);
    }

    @Override // defpackage.yh1
    public final java.lang.String getDatabaseName() {
        return this.oh71FJcDz6S2;
    }

    @Override // defpackage.yh1
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.P05cfTpS5W5L.oh71FJcDz6S2 != defpackage.pa1.WmetiUbpKU9I) {
            ((defpackage.i10) this.P05cfTpS5W5L.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.e6mdH7fiFuta = z;
    }
}
