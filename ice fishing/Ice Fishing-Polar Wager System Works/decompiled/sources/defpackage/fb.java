package defpackage;

/* loaded from: classes.dex */
public final class fb extends defpackage.bf {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1MBDhnF = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.fb.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fb(defpackage.bb bbVar, java.lang.Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new java.util.concurrent.CancellationException("Continuation " + bbVar + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
