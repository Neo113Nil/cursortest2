package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qk1 {
    public final int ZpBGe2uQfcn8;
    public static final defpackage.qk1 giKS3J6vZuNy = new defpackage.qk1(0);
    public static final defpackage.qk1 fWTAfUmVKrZq = new defpackage.qk1(1);
    public static final defpackage.qk1 JhCgjQRTAOCT = new defpackage.qk1(2);

    public qk1(int i) {
        this.ZpBGe2uQfcn8 = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qk1) {
            return this.ZpBGe2uQfcn8 == ((defpackage.qk1) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8;
    }

    public final java.lang.String toString() {
        int i = this.ZpBGe2uQfcn8;
        if (i == 0) {
            return "TextDecoration.None";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return defpackage.pVQOaWB9QMo4.fNwYGHIYeJcR(new java.lang.StringBuilder("TextDecoration["), defpackage.ci0.ZpBGe2uQfcn8(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((java.lang.String) arrayList.get(0));
    }
}
