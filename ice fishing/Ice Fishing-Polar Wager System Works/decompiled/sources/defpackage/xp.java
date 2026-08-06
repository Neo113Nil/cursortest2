package defpackage;

/* loaded from: classes.dex */
public final class xp extends defpackage.e51 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater ez2rX8ReCYw = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.xp.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.e51, defpackage.c90
    public final void NHJTzaLwkd(java.lang.Object obj) {
        QQUzIjv3iOC5(obj);
    }

    @Override // defpackage.e51, defpackage.c90
    public final void QQUzIjv3iOC5(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = ez2rX8ReCYw;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    defpackage.fm.hyxIchWRW(defpackage.c80.V7bD7b8KA(this.SH1y5HwkJhh), defpackage.gq1.v5iciZok(obj));
                    return;
                } else {
                    defpackage.db.AARZUJiTa("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
