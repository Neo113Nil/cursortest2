package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pq0 {
    public final float JhCgjQRTAOCT;
    public final long WDYagTQQm9ns;
    public final int ZpBGe2uQfcn8;
    public final float fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;

    public pq0(int i, float f, float f2, float f3, long j) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = f;
        this.fWTAfUmVKrZq = f2;
        this.JhCgjQRTAOCT = f3;
        this.WDYagTQQm9ns = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && defpackage.pq0.class == obj.getClass()) {
            defpackage.pq0 pq0Var = (defpackage.pq0) obj;
            return this.fWTAfUmVKrZq == pq0Var.fWTAfUmVKrZq && this.JhCgjQRTAOCT == pq0Var.JhCgjQRTAOCT && this.giKS3J6vZuNy == pq0Var.giKS3J6vZuNy && this.ZpBGe2uQfcn8 == pq0Var.ZpBGe2uQfcn8 && this.WDYagTQQm9ns == pq0Var.WDYagTQQm9ns;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.WDYagTQQm9ns) + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.ZpBGe2uQfcn8, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.JhCgjQRTAOCT, java.lang.Float.hashCode(this.fWTAfUmVKrZq) * 31, 31), 31), 31);
    }

    public final java.lang.String toString() {
        return "NavigationEvent(touchX=" + this.fWTAfUmVKrZq + ", touchY=" + this.JhCgjQRTAOCT + ", progress=" + this.giKS3J6vZuNy + ", swipeEdge=" + this.ZpBGe2uQfcn8 + ", frameTimeMillis=" + this.WDYagTQQm9ns + ')';
    }
}
