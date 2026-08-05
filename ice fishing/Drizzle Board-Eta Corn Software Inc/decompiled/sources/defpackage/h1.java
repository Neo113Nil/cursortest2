package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class h1 {
    public float MdtA4re8;
    public int NCTxEWno;
    public long P7K7Inc8;
    public float Qr9iLBAD;
    public long VgvYg0wo;
    public long b2ZJblxo;
    public int jb9XjC4I;
    public int qoPGr6Ce;
    public float wxUZMvaN;

    public final float qoPGr6Ce(long j) {
        if (j < this.VgvYg0wo) {
            return 0.0f;
        }
        long j2 = this.b2ZJblxo;
        if (j2 < 0 || j < j2) {
            return yp.NCTxEWno((j - r0) / this.qoPGr6Ce, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.Qr9iLBAD;
        return (yp.NCTxEWno((j - j2) / this.jb9XjC4I, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
