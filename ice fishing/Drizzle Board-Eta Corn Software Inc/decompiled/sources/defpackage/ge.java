package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class ge implements Comparable {
    public static final re NCTxEWno = new re(13);
    public static final long MdtA4re8 = le0.ygLcUYwZ(4611686018427387903L);
    public static final long wxUZMvaN = le0.ygLcUYwZ(-4611686018427387903L);

    public static final long qoPGr6Ce(long j, long j2) {
        long j3 = j2 / 1000000;
        long NCTxEWno2 = le0.NCTxEWno(j, j3);
        if (-4611686018426L > NCTxEWno2 || NCTxEWno2 >= 4611686018427L) {
            return le0.ygLcUYwZ(NCTxEWno2);
        }
        long j4 = ((NCTxEWno2 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = he.qoPGr6Ce;
        return j4;
    }
}
