package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rx implements defpackage.mx {
    public final long JhCgjQRTAOCT;
    public final int ZpBGe2uQfcn8;
    public final long fWTAfUmVKrZq;
    public final defpackage.ot giKS3J6vZuNy;

    public rx(int i, int i2, defpackage.ot otVar) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = otVar;
        this.fWTAfUmVKrZq = i * 1000000;
        this.JhCgjQRTAOCT = i2 * 1000000;
    }

    @Override // defpackage.mx
    public final long JhCgjQRTAOCT(float f, float f2, float f3) {
        return this.JhCgjQRTAOCT + this.fWTAfUmVKrZq;
    }

    @Override // defpackage.mx
    public final float fWTAfUmVKrZq(long j, float f, float f2, float f3) {
        long j2 = j - this.JhCgjQRTAOCT;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.fWTAfUmVKrZq;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (giKS3J6vZuNy(j4, f, f2, f3) - giKS3J6vZuNy(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.mx
    public final float giKS3J6vZuNy(long j, float f, float f2, float f3) {
        long j2 = j - this.JhCgjQRTAOCT;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.fWTAfUmVKrZq;
        if (j2 > j3) {
            j2 = j3;
        }
        float giKS3J6vZuNy = this.giKS3J6vZuNy.giKS3J6vZuNy(this.ZpBGe2uQfcn8 == 0 ? 1.0f : j2 / j3);
        return (f2 * giKS3J6vZuNy) + ((1.0f - giKS3J6vZuNy) * f);
    }
}
