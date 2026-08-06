package defpackage;

/* loaded from: classes.dex */
public final class vk1 implements defpackage.eb0, java.io.Serializable {
    public defpackage.vz adDC3e2L;
    public java.lang.Object xiZrDbcSW0;

    @Override // defpackage.eb0
    public final java.lang.Object getValue() {
        if (this.xiZrDbcSW0 == defpackage.ad1.riuEU0zW4) {
            defpackage.vz vzVar = this.adDC3e2L;
            vzVar.getClass();
            this.xiZrDbcSW0 = vzVar.IHQe1A4L2xu();
            this.adDC3e2L = null;
        }
        return this.xiZrDbcSW0;
    }

    public final java.lang.String toString() {
        return this.xiZrDbcSW0 != defpackage.ad1.riuEU0zW4 ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
