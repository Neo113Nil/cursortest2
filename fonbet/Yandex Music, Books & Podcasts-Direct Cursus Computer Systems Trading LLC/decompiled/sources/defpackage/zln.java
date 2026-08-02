package defpackage;

/* loaded from: classes4.dex */
public final class zln extends bmn {
    public final float a;
    public final boolean b;

    public zln(boolean z, float f) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zln)) {
            return false;
        }
        zln zlnVar = (zln) obj;
        return Float.compare(this.a, zlnVar.a) == 0 && this.b == zlnVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Listening(amplitude=" + this.a + ", isSilent=" + this.b + ")";
    }
}
