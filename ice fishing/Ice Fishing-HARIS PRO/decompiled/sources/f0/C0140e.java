package f0;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140e {

    /* renamed from: a, reason: collision with root package name */
    public final L f2915a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2916b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2917c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2918d;

    public C0140e(L l2, boolean z2, Object obj, boolean z3) {
        if (!l2.f2891a && z2) {
            throw new IllegalArgumentException(l2.b().concat(" does not allow nullable values").toString());
        }
        if (!z2 && z3 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + l2.b() + " has null value but is not nullable.").toString());
        }
        this.f2915a = l2;
        this.f2916b = z2;
        this.f2918d = obj;
        this.f2917c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0140e.class.equals(obj.getClass())) {
            return false;
        }
        C0140e c0140e = (C0140e) obj;
        if (this.f2916b != c0140e.f2916b || this.f2917c != c0140e.f2917c || !D1.i.a(this.f2915a, c0140e.f2915a)) {
            return false;
        }
        Object obj2 = c0140e.f2918d;
        Object obj3 = this.f2918d;
        return obj3 != null ? D1.i.a(obj3, obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.f2915a.hashCode() * 31) + (this.f2916b ? 1 : 0)) * 31) + (this.f2917c ? 1 : 0)) * 31;
        Object obj = this.f2918d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0140e.class.getSimpleName());
        sb.append(" Type: " + this.f2915a);
        sb.append(" Nullable: " + this.f2916b);
        if (this.f2917c) {
            sb.append(" DefaultValue: " + this.f2918d);
        }
        String sb2 = sb.toString();
        D1.i.d(sb2, "sb.toString()");
        return sb2;
    }
}
