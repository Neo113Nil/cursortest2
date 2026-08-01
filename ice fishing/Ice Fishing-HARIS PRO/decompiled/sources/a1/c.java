package a1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1678a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1679b;

    public c(String str, String str2) {
        this.f1678a = str;
        this.f1679b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return D1.i.a(this.f1678a, cVar.f1678a) && D1.i.a(this.f1679b, cVar.f1679b);
    }

    public final int hashCode() {
        return this.f1679b.hashCode() + (this.f1678a.hashCode() * 31);
    }

    public final String toString() {
        return "CalculatorField(label=" + this.f1678a + ", hint=" + this.f1679b + ")";
    }
}
