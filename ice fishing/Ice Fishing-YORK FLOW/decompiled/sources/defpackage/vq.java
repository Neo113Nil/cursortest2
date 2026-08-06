package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vq {
    public final android.view.DisplayCutout ZpBGe2uQfcn8;

    public vq(android.view.DisplayCutout displayCutout) {
        this.ZpBGe2uQfcn8 = displayCutout;
    }

    public final defpackage.v80 ZpBGe2uQfcn8() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? defpackage.v80.fWTAfUmVKrZq(defpackage.omM9cAlgeGXx.fWTAfUmVKrZq(this.ZpBGe2uQfcn8)) : defpackage.v80.WDYagTQQm9ns;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.vq.class != obj.getClass()) {
            return false;
        }
        return this.ZpBGe2uQfcn8.equals(((defpackage.vq) obj).ZpBGe2uQfcn8);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.ZpBGe2uQfcn8.hashCode();
        return hashCode;
    }

    public final java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.ZpBGe2uQfcn8 + "}";
    }
}
