package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class b51 {
    public final defpackage.w00 ZpBGe2uQfcn8;
    public final defpackage.v00 giKS3J6vZuNy;

    public b51(defpackage.w00 w00Var, defpackage.v00 v00Var) {
        this.ZpBGe2uQfcn8 = w00Var;
        this.giKS3J6vZuNy = v00Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.b51)) {
            return false;
        }
        defpackage.b51 b51Var = (defpackage.b51) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, b51Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy.equals(b51Var.giKS3J6vZuNy);
    }

    public final int hashCode() {
        return this.giKS3J6vZuNy.ZpBGe2uQfcn8.hashCode() + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(0, defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(0, ((com.ice.fishing.wolberta.R.font.grandstander * 31) + this.ZpBGe2uQfcn8.WDYagTQQm9ns) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(com.ice.fishing.wolberta.R.font.grandstander, "ResourceFont(resId=", ", weight=");
        h3m55N1URyyK.append(this.ZpBGe2uQfcn8);
        h3m55N1URyyK.append(", style=");
        h3m55N1URyyK.append((java.lang.Object) "Normal");
        h3m55N1URyyK.append(", loadingStrategy=Blocking)");
        return h3m55N1URyyK.toString();
    }
}
