package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class bz0 implements defpackage.zy0 {
    public final android.widget.Magnifier ZpBGe2uQfcn8;

    public bz0(android.widget.Magnifier magnifier) {
        this.ZpBGe2uQfcn8 = magnifier;
    }

    public final void JhCgjQRTAOCT() {
        this.ZpBGe2uQfcn8.update();
    }

    @Override // defpackage.zy0
    public void ZpBGe2uQfcn8(long j, long j2) {
        this.ZpBGe2uQfcn8.show(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final long fWTAfUmVKrZq() {
        return (this.ZpBGe2uQfcn8.getWidth() << 32) | (this.ZpBGe2uQfcn8.getHeight() & 4294967295L);
    }

    public final void giKS3J6vZuNy() {
        this.ZpBGe2uQfcn8.dismiss();
    }
}
