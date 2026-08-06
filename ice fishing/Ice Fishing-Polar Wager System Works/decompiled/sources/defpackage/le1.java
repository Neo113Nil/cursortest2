package defpackage;

/* loaded from: classes.dex */
public final class le1 implements defpackage.eb0, java.io.Serializable {
    public final java.lang.Object AARZUJiTa;
    public defpackage.vz adDC3e2L;
    public volatile java.lang.Object xiZrDbcSW0;

    public le1(defpackage.vz vzVar) {
        vzVar.getClass();
        this.adDC3e2L = vzVar;
        this.xiZrDbcSW0 = defpackage.ad1.riuEU0zW4;
        this.AARZUJiTa = this;
    }

    @Override // defpackage.eb0
    public final java.lang.Object getValue() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.xiZrDbcSW0;
        defpackage.ad1 ad1Var = defpackage.ad1.riuEU0zW4;
        if (obj2 != ad1Var) {
            return obj2;
        }
        synchronized (this.AARZUJiTa) {
            obj = this.xiZrDbcSW0;
            if (obj == ad1Var) {
                defpackage.vz vzVar = this.adDC3e2L;
                vzVar.getClass();
                obj = vzVar.IHQe1A4L2xu();
                this.xiZrDbcSW0 = obj;
                this.adDC3e2L = null;
            }
        }
        return obj;
    }

    public final java.lang.String toString() {
        return this.xiZrDbcSW0 != defpackage.ad1.riuEU0zW4 ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
