package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class np {
    public final long ZpBGe2uQfcn8;
    public final long giKS3J6vZuNy;

    public np(long j, long j2) {
        this.ZpBGe2uQfcn8 = j;
        this.giKS3J6vZuNy = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.np) {
            defpackage.np npVar = (defpackage.np) obj;
            return defpackage.u90.ZpBGe2uQfcn8(this.ZpBGe2uQfcn8, npVar.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == npVar.giKS3J6vZuNy;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.giKS3J6vZuNy) + (java.lang.Long.hashCode(this.ZpBGe2uQfcn8) * 31);
    }
}
