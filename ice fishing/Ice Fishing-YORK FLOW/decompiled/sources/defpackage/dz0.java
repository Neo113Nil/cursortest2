package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dz0 extends defpackage.bz0 {
    @Override // defpackage.bz0, defpackage.zy0
    public final void ZpBGe2uQfcn8(long j, long j2) {
        if (!java.lang.Float.isNaN(Float.NaN)) {
            this.ZpBGe2uQfcn8.setZoom(Float.NaN);
        }
        long j3 = 9223372034707292159L & j2;
        android.widget.Magnifier magnifier = this.ZpBGe2uQfcn8;
        if (j3 != 9205357640488583168L) {
            magnifier.show(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
