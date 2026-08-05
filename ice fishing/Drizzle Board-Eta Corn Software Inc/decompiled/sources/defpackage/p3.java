package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class p3 extends c7 {
    public static final /* synthetic */ long MdtA4re8 = b1.qoPGr6Ce.objectFieldOffset(p3.class.getDeclaredField("_resumed$volatile"));
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p3(m3 m3Var, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + m3Var + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
