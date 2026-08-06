package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yd extends defpackage.zd {
    public final java.lang.Throwable ZpBGe2uQfcn8;

    public yd(java.lang.Throwable th) {
        this.ZpBGe2uQfcn8 = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.yd) {
            return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, ((defpackage.yd) obj).ZpBGe2uQfcn8);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Throwable th = this.ZpBGe2uQfcn8;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.zd
    public final java.lang.String toString() {
        return "Closed(" + this.ZpBGe2uQfcn8 + ')';
    }
}
