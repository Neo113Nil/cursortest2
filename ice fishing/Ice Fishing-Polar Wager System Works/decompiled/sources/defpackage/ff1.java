package defpackage;

/* loaded from: classes.dex */
public final class ff1 {
    public static final defpackage.ff1 oh6vYeIP = new defpackage.ff1(0);
    public static final defpackage.ff1 r1MBDhnF = new defpackage.ff1(1);
    public final int IHQe1A4L2xu;

    public ff1(int i) {
        this.IHQe1A4L2xu = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ff1) {
            return this.IHQe1A4L2xu == ((defpackage.ff1) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu;
    }

    public final java.lang.String toString() {
        int i = this.IHQe1A4L2xu;
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
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((java.lang.String) arrayList.get(0));
        }
        return "TextDecoration[" + defpackage.xe0.IHQe1A4L2xu(arrayList, ", ", null, 62) + ']';
    }
}
