package S0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2888a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f2889b;

    public d(String str, Long l9) {
        this.f2888a = str;
        this.f2889b = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.h.a(this.f2888a, dVar.f2888a) && kotlin.jvm.internal.h.a(this.f2889b, dVar.f2889b);
    }

    public final int hashCode() {
        int hashCode = this.f2888a.hashCode() * 31;
        Long l9 = this.f2889b;
        return hashCode + (l9 == null ? 0 : l9.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f2888a + ", value=" + this.f2889b + ')';
    }
}
