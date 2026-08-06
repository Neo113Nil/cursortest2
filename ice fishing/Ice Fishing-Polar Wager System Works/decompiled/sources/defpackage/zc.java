package defpackage;

/* loaded from: classes.dex */
public final class zc {
    public final int IHQe1A4L2xu;
    public final java.lang.reflect.Method oh6vYeIP;

    public zc(int i, java.lang.reflect.Method method) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = method;
        method.setAccessible(true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.zc)) {
            return false;
        }
        defpackage.zc zcVar = (defpackage.zc) obj;
        return this.IHQe1A4L2xu == zcVar.IHQe1A4L2xu && this.oh6vYeIP.getName().equals(zcVar.oh6vYeIP.getName());
    }

    public final int hashCode() {
        return this.oh6vYeIP.getName().hashCode() + (this.IHQe1A4L2xu * 31);
    }
}
