package defpackage;

/* loaded from: classes.dex */
public final class us implements java.lang.Runnable {
    public final java.util.ArrayList adDC3e2L;
    public final int xiZrDbcSW0;

    public us(java.util.List list, int i, java.lang.Throwable th) {
        defpackage.a70.xiZrDbcSW0(list, "initCallbacks cannot be null");
        this.adDC3e2L = new java.util.ArrayList(list);
        this.xiZrDbcSW0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.adDC3e2L;
        int size = arrayList.size();
        int i = 0;
        if (this.xiZrDbcSW0 != 1) {
            while (i < size) {
                ((defpackage.tm) arrayList.get(i)).oh6vYeIP.xiZrDbcSW0 = defpackage.mj1.AARZUJiTa;
                i++;
            }
            return;
        }
        while (i < size) {
            defpackage.tm tmVar = (defpackage.tm) arrayList.get(i);
            tmVar.IHQe1A4L2xu.setValue(java.lang.Boolean.TRUE);
            tmVar.oh6vYeIP.xiZrDbcSW0 = new defpackage.u40(true);
            i++;
        }
    }
}
