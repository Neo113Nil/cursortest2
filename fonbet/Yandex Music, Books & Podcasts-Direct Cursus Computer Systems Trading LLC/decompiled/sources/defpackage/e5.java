package defpackage;

/* loaded from: classes6.dex */
public final class e5 {
    public final jzi a;
    public final f4m b;

    public e5(jzi jziVar, f4m f4mVar) {
        this.a = jziVar;
        this.b = f4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return this.a.equals(e5Var.a) && this.b.equals(e5Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AbrPreferences(defaultQuality=null, aesthetePreferenceProvider=" + this.a + ", userQualityRepository=" + this.b + ", experimentalShouldConsiderSelectedUserQuality=false)";
    }
}
