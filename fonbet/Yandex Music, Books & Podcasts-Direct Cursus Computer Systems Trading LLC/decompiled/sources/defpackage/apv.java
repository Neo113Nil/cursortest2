package defpackage;

/* loaded from: classes.dex */
public final class apv {
    public final grv a;
    public final oim b;

    public apv(grv grvVar, oim oimVar) {
        this.a = grvVar;
        this.b = oimVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apv)) {
            return false;
        }
        apv apvVar = (apv) obj;
        return this.a.equals(apvVar.a) && this.b.equals(apvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.a + ", windowPosture=" + this.b + ')';
    }
}
