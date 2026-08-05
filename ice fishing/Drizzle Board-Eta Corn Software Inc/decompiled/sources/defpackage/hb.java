package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hb extends jg {
    public static final hb VgvYg0wo;
    public s9 wxUZMvaN;

    static {
        int i = rb0.MdtA4re8;
        int i2 = rb0.wxUZMvaN;
        long j = rb0.VgvYg0wo;
        String str = rb0.qoPGr6Ce;
        hb hbVar = new hb();
        hbVar.wxUZMvaN = new s9(i, i2, j, str);
        VgvYg0wo = hbVar;
    }

    @Override // defpackage.n9
    public final void FySoLYna(l9 l9Var, Runnable runnable) {
        s9.Qr9iLBAD(this.wxUZMvaN, runnable, 2);
    }

    @Override // defpackage.n9
    public final void RXQxj5Oe(l9 l9Var, Runnable runnable) {
        s9.Qr9iLBAD(this.wxUZMvaN, runnable, 6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.n9
    public final String toString() {
        return "Dispatchers.Default";
    }
}
