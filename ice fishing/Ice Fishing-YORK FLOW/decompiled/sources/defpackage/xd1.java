package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xd1 extends defpackage.b90 {
    public volatile java.lang.Object giKS3J6vZuNy;

    @Override // defpackage.b90
    public final java.lang.Object ZpBGe2uQfcn8(defpackage.s81 s81Var) {
        if (this.giKS3J6vZuNy == null) {
            return super.ZpBGe2uQfcn8(s81Var);
        }
        java.lang.Object obj = this.giKS3J6vZuNy;
        if (obj != null) {
            return obj;
        }
        defpackage.h7.P05cfTpS5W5L("Single instance created couldn't return value");
        return null;
    }

    @Override // defpackage.b90
    public final java.lang.Object giKS3J6vZuNy(defpackage.s81 s81Var) {
        if (this.giKS3J6vZuNy == null) {
            synchronized (this) {
                if (!(this.giKS3J6vZuNy != null)) {
                    this.giKS3J6vZuNy = ZpBGe2uQfcn8(s81Var);
                }
            }
        }
        java.lang.Object obj = this.giKS3J6vZuNy;
        if (obj != null) {
            return obj;
        }
        defpackage.h7.P05cfTpS5W5L("Single instance created couldn't return value");
        return null;
    }
}
