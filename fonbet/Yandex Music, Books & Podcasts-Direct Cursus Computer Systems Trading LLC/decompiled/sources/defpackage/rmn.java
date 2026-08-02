package defpackage;

/* loaded from: classes4.dex */
public final class rmn extends umn {
    public final float a;
    public final boolean b;

    public rmn(boolean z, float f) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmn)) {
            return false;
        }
        rmn rmnVar = (rmn) obj;
        return Float.compare(this.a, rmnVar.a) == 0 && this.b == rmnVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Listening(amplitude=" + this.a + ", isSilent=" + this.b + ")";
    }
}
