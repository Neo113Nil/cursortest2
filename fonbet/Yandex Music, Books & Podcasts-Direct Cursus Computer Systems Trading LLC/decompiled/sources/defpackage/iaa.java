package defpackage;

/* loaded from: classes3.dex */
public final class iaa implements laa {
    public final float a;
    public final boolean b;

    public iaa(boolean z, float f) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iaa)) {
            return false;
        }
        iaa iaaVar = (iaa) obj;
        return Float.compare(this.a, iaaVar.a) == 0 && this.b == iaaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "InProgress(progress=" + this.a + ", showProgress=" + this.b + ")";
    }
}
