package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class r21 {
    public static final defpackage.r21 giKS3J6vZuNy = new defpackage.r21(new defpackage.bf());
    public final defpackage.bf ZpBGe2uQfcn8;

    public r21(defpackage.bf bfVar) {
        this.ZpBGe2uQfcn8 = bfVar;
        if (java.lang.Float.isNaN(0.0f)) {
            defpackage.h7.w7APNrr0aGRc("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.r21) && this.ZpBGe2uQfcn8.equals(((defpackage.r21) obj).ZpBGe2uQfcn8);
    }

    public final int hashCode() {
        return (this.ZpBGe2uQfcn8.hashCode() + (java.lang.Float.hashCode(0.0f) * 31)) * 31;
    }

    public final java.lang.String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.ZpBGe2uQfcn8 + ", steps=0)";
    }
}
