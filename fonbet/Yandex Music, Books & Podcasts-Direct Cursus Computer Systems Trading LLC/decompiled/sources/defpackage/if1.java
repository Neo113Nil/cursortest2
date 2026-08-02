package defpackage;

/* loaded from: classes3.dex */
public final class if1 implements jf1 {
    public final nnk a;

    public if1(nnk nnkVar) {
        this.a = nnkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof if1) && this.a.equals(((if1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(artistPick=" + this.a + ")";
    }
}
