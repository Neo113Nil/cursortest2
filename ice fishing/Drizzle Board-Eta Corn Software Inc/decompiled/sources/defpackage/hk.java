package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hk extends RuntimeException {
    public final Throwable MdtA4re8;
    public final ik NCTxEWno;

    public hk(ik ikVar, Throwable th) {
        super(th);
        this.NCTxEWno = ikVar;
        this.MdtA4re8 = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.MdtA4re8;
    }
}
