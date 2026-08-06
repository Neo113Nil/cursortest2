package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class re {
    public final int ZpBGe2uQfcn8;
    public final java.lang.reflect.Method giKS3J6vZuNy;

    public re(int i, java.lang.reflect.Method method) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = method;
        method.setAccessible(true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.re)) {
            return false;
        }
        defpackage.re reVar = (defpackage.re) obj;
        return this.ZpBGe2uQfcn8 == reVar.ZpBGe2uQfcn8 && this.giKS3J6vZuNy.getName().equals(reVar.giKS3J6vZuNy.getName());
    }

    public final int hashCode() {
        return this.giKS3J6vZuNy.getName().hashCode() + (this.ZpBGe2uQfcn8 * 31);
    }
}
