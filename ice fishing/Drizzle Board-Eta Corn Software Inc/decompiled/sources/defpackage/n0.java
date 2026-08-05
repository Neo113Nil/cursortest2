package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class n0 extends g50 {
    public static final m0 MdtA4re8 = new m0(0);
    public static volatile n0 NCTxEWno;
    public final rb qoPGr6Ce = new rb();

    public static n0 sjUBp5pO() {
        if (NCTxEWno != null) {
            return NCTxEWno;
        }
        synchronized (n0.class) {
            try {
                if (NCTxEWno == null) {
                    NCTxEWno = new n0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return NCTxEWno;
    }
}
