package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ly {
    public final int JhCgjQRTAOCT;
    public final defpackage.py ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final long giKS3J6vZuNy;

    public ly(defpackage.py pyVar, long j, int i, int i2) {
        this.ZpBGe2uQfcn8 = pyVar;
        this.giKS3J6vZuNy = j;
        this.fWTAfUmVKrZq = i;
        this.JhCgjQRTAOCT = i2;
    }

    public final defpackage.ok0 ZpBGe2uQfcn8(defpackage.ky kyVar, boolean z, int i, int i2, int i3, int i4) {
        if (!kyVar.giKS3J6vZuNy) {
            return null;
        }
        this.ZpBGe2uQfcn8.getClass();
        return null;
    }

    public final defpackage.ky giKS3J6vZuNy(boolean z, int i, long j, defpackage.g90 g90Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (g90Var == null) {
            return new defpackage.ky(true, true);
        }
        long j2 = g90Var.ZpBGe2uQfcn8;
        this.ZpBGe2uQfcn8.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new defpackage.ky(true, true);
        }
        if (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new defpackage.ky(true, true) : new defpackage.ky(true, giKS3J6vZuNy(z, 0, defpackage.g90.ZpBGe2uQfcn8(defpackage.mk.P05cfTpS5W5L(this.giKS3J6vZuNy), (((int) (j & 4294967295L)) - this.JhCgjQRTAOCT) - i4), new defpackage.g90(defpackage.g90.ZpBGe2uQfcn8(((int) (j2 >> 32)) - this.fWTAfUmVKrZq, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).giKS3J6vZuNy);
        }
        java.lang.Math.max(i4, (int) (j2 & 4294967295L));
        return new defpackage.ky(false, false);
    }
}
