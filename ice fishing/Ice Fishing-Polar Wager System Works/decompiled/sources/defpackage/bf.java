package defpackage;

/* loaded from: classes.dex */
public class bf {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater oh6vYeIP = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.bf.class, "_handled$volatile");
    public final java.lang.Throwable IHQe1A4L2xu;
    private volatile /* synthetic */ int _handled$volatile;

    public bf(java.lang.Throwable th, boolean z) {
        this.IHQe1A4L2xu = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + '[' + this.IHQe1A4L2xu + ']';
    }
}
