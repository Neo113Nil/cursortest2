package S0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2904a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f2905b;

    public d(String str, Long l9) {
        this.f2904a = str;
        this.f2905b = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.h.a(this.f2904a, dVar.f2904a) && kotlin.jvm.internal.h.a(this.f2905b, dVar.f2905b);
    }

    public final int hashCode() {
        int hashCode = this.f2904a.hashCode() * 31;
        Long l9 = this.f2905b;
        return hashCode + (l9 == null ? 0 : l9.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f2904a + ", value=" + this.f2905b + ')';
    }
}
