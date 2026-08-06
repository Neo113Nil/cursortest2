package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wa {
    public final int JhCgjQRTAOCT;
    public final int ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    static {
        new defpackage.wa(0, 0, 0, 0);
    }

    public wa(int i, int i2, int i3, int i4) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        this.fWTAfUmVKrZq = i3;
        this.JhCgjQRTAOCT = i4;
        if (i > i3) {
            defpackage.h7.WDYagTQQm9ns(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        defpackage.h7.WDYagTQQm9ns(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.wa.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        defpackage.wa waVar = (defpackage.wa) obj;
        return this.ZpBGe2uQfcn8 == waVar.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == waVar.giKS3J6vZuNy && this.fWTAfUmVKrZq == waVar.fWTAfUmVKrZq && this.JhCgjQRTAOCT == waVar.JhCgjQRTAOCT;
    }

    public final int hashCode() {
        return (((((this.ZpBGe2uQfcn8 * 31) + this.giKS3J6vZuNy) * 31) + this.fWTAfUmVKrZq) * 31) + this.JhCgjQRTAOCT;
    }

    public final java.lang.String toString() {
        return defpackage.wa.class.getSimpleName() + " { [" + this.ZpBGe2uQfcn8 + ',' + this.giKS3J6vZuNy + ',' + this.fWTAfUmVKrZq + ',' + this.JhCgjQRTAOCT + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wa(android.graphics.Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
