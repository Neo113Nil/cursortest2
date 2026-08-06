package defpackage;

/* loaded from: classes.dex */
public final class t11 {
    public final java.util.HashSet IHQe1A4L2xu = new java.util.HashSet();

    public final void IHQe1A4L2xu() {
        if (defpackage.f70.r1MBDhnF == null) {
            defpackage.f70.r1MBDhnF = android.os.Looper.getMainLooper().getThread();
        }
        if (java.lang.Thread.currentThread() != defpackage.f70.r1MBDhnF) {
            defpackage.db.AARZUJiTa("Must be called on the Main thread.");
            return;
        }
        java.util.Iterator it = this.IHQe1A4L2xu.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            defpackage.db.kd6TUFXn();
        }
    }
}
