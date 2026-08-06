package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gd extends defpackage.ug {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater fWTAfUmVKrZq = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.gd.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gd(defpackage.dd ddVar, java.lang.Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new java.util.concurrent.CancellationException("Continuation " + ddVar + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
